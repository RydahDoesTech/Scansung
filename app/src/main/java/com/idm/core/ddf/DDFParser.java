package com.idm.core.ddf;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.providers.mo.IDMMoInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class DDFParser {
    private static final String NODE_NAME_NODE = "Node";
    private static final String NODE_NAME_SERVERID = "ServerID";
    private static final String PATH_DEVINFO = "DevInfo";
    private static final String PATH_DMACC = "DMAcc";
    private static final String PATH_NAME_CLIENT_AAUTHDATA = "/client/AAuthData";
    private static final String PATH_NAME_CLIENT_AAUTHNAME = "/client/AAuthName";
    private static final String PATH_NAME_CLIENT_AAUTHSECRET = "/client/AAuthSecret";
    private static final String PATH_NAME_MANUFACTURER = "Man";
    private static final String PATH_NAME_SERVER_AAUTHDATA = "/server/AAuthData";
    private static final String PATH_NAME_SERVER_AAUTHSECRET = "/server/AAuthSecret";
    private final Context context;
    private final IDMDeviceInfoAdapter deviceInfoAdapter;
    private final InputStream inputStream;
    private final List<DDFNode> nodeList = new ArrayList();
    private final List<DDFProfileInfo> DDFProfileInfoList = new ArrayList();

    public DDFParser(Context context, InputStream inputStream, IDMDeviceInfoAdapter iDMDeviceInfoAdapter) {
        this.inputStream = inputStream;
        this.context = context;
        this.deviceInfoAdapter = iDMDeviceInfoAdapter;
    }

    private DDFNode findRootNode(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        DDFNode dDFNode = new DDFNode(IDMMoInterface.IDM_MO_ROOT_PATH);
        int eventType = xmlPullParser.getEventType();
        boolean z4 = false;
        while (eventType != 1) {
            if (eventType == 2) {
                if (!"Node".equals(xmlPullParser.getName())) {
                    DDFTagType dDFTagTypeOf = DDFTagType.of(xmlPullParser.getName());
                    dDFNode.setTag(dDFTagTypeOf, dDFTagTypeOf.toTag(xmlPullParser));
                } else {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
        return dDFNode;
    }

    private void replaceAuths() {
        Iterator<DDFProfileInfo> it = this.DDFProfileInfoList.iterator();
        while (it.hasNext()) {
            String serverId = it.next().getServerId();
            for (DDFNode dDFNode : this.nodeList) {
                if (!dDFNode.getPath().contains(PATH_DMACC)) {
                    return;
                }
                if (TextUtils.isEmpty(dDFNode.getValue()) && dDFNode.getPath().contains(serverId)) {
                    if (dDFNode.getPath().contains(PATH_NAME_CLIENT_AAUTHDATA) || dDFNode.getPath().contains(PATH_NAME_SERVER_AAUTHDATA)) {
                        DDFTagType dDFTagType = DDFTagType.VALUE;
                        dDFNode.setTag(dDFTagType, new DDFTag(dDFTagType.name(), this.deviceInfoAdapter.idmMakeFactoryNonce()));
                    } else if (dDFNode.getPath().contains(PATH_NAME_CLIENT_AAUTHNAME)) {
                        DDFTagType dDFTagType2 = DDFTagType.VALUE;
                        dDFNode.setTag(dDFTagType2, new DDFTag(dDFTagType2.name(), this.deviceInfoAdapter.idmGetClientName(this.context)));
                    } else if (dDFNode.getPath().contains(PATH_NAME_CLIENT_AAUTHSECRET)) {
                        DDFTagType dDFTagType3 = DDFTagType.VALUE;
                        dDFNode.setTag(dDFTagType3, new DDFTag(dDFTagType3.name(), this.deviceInfoAdapter.idmMakeClientPassword(this.context, serverId)));
                    } else if (dDFNode.getPath().contains(PATH_NAME_SERVER_AAUTHSECRET)) {
                        DDFTagType dDFTagType4 = DDFTagType.VALUE;
                        dDFNode.setTag(dDFTagType4, new DDFTag(dDFTagType4.name(), this.deviceInfoAdapter.idmMakeServerPassword(this.context, serverId)));
                    }
                }
            }
        }
    }

    private void replaceDefaultValueIfEmpty() {
        replaceDevInfoManufacturer();
        replaceAuths();
    }

    private void replaceDevInfoManufacturer() {
        for (DDFNode dDFNode : this.nodeList) {
            if (!dDFNode.getPath().contains(PATH_DEVINFO)) {
                return;
            }
            if (dDFNode.getPath().contains(PATH_NAME_MANUFACTURER)) {
                DDFTagType dDFTagType = DDFTagType.VALUE;
                dDFNode.setTag(dDFTagType, new DDFTag(dDFTagType.name(), this.deviceInfoAdapter.idmGetDeviceManufacturer()));
                return;
            }
        }
    }

    public List<DDFNode> execute() throws XmlPullParserException, IOException {
        Stack stack = new Stack();
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new InputStreamReader(this.inputStream));
            DDFNode dDFNodeFindRootNode = findRootNode(xmlPullParserNewPullParser);
            this.nodeList.add(dDFNodeFindRootNode);
            stack.push(dDFNodeFindRootNode);
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("Node".equals(xmlPullParserNewPullParser.getName())) {
                        stack.pop();
                    }
                } else if ("Node".equals(xmlPullParserNewPullParser.getName())) {
                    if (stack.empty()) {
                        DDFNode dDFNodeFindRootNode2 = findRootNode(xmlPullParserNewPullParser);
                        this.nodeList.add(dDFNodeFindRootNode2);
                        stack.push(dDFNodeFindRootNode2);
                    }
                    DDFNode dDFNode = new DDFNode(((DDFNode) stack.peek()).getPath());
                    this.nodeList.add(dDFNode);
                    stack.push(dDFNode);
                    dDFNodeFindRootNode = dDFNode;
                } else {
                    DDFTagType dDFTagTypeOf = DDFTagType.of(xmlPullParserNewPullParser.getName());
                    dDFNodeFindRootNode.setTag(dDFTagTypeOf, dDFTagTypeOf.toTag(xmlPullParserNewPullParser));
                    if (dDFTagTypeOf == DDFTagType.VALUE && NODE_NAME_SERVERID.equals(dDFNodeFindRootNode.getNodeName())) {
                        this.DDFProfileInfoList.add(new DDFProfileInfo(dDFNodeFindRootNode.getValue()));
                    }
                }
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
        replaceDefaultValueIfEmpty();
        return this.nodeList;
    }

    public List<DDFProfileInfo> getProfileInfoList() {
        return this.DDFProfileInfoList;
    }
}
