package com.idm.tool.ddf;

import android.content.Context;
import com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.ddf.DDFNode;
import com.idm.core.ddf.DDFParser;
import com.idm.core.ddf.DDFProfileInfo;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.IDMMoInterface;
import com.idm.providers.mo.IDMMoNodeInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class DDFNodeCreator implements IDMMoInterface {
    private final DDFParser ddfParser;
    private final List<DDFProfileInfo> ddfProfileList = new ArrayList();
    private final IDMMoDatabaseManager moDatabaseManager;
    private final String serverId;

    public DDFNodeCreator(Context context, String str, InputStream inputStream, IDMDeviceInfoAdapter iDMDeviceInfoAdapter) {
        this.serverId = str;
        this.ddfParser = new DDFParser(context, inputStream, iDMDeviceInfoAdapter);
        this.moDatabaseManager = IDMMoDatabaseManager.getInstance(context);
    }

    private void addMoNodeInfoToList(List<DDFNode> list, List<IDMMoNodeInfo> list2) {
        for (DDFNode dDFNode : list) {
            IDMDebug.I("ddfNode = " + dDFNode.toString());
            list2.add(new IDMMoNodeInfo(dDFNode.getPath(), dDFNode.getNodeName(), getFormattedAcl(dDFNode.getAccessTypes()), getScopeValue(dDFNode.getScope()), dDFNode.getDfFormat(), dDFNode.getDfType(), 0, dDFNode.getValue()));
        }
    }

    private String getFormattedAcl(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(list.get(i5));
            sb.append("=*");
            if (i5 < list.size() - 1) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    private int getScopeValue(String str) {
        if ("Permanent".equals(str)) {
            return 1;
        }
        return "Dynamic".equals(str) ? 2 : 0;
    }

    private void insertMoNodeInfoListToDB(ArrayList<IDMMoNodeInfo> arrayList) {
        try {
            this.moDatabaseManager.idmMoDatabaseOpen();
            this.moDatabaseManager.idmMoGetDBAdapter().idmMoDatabaseBeginTransaction();
            this.moDatabaseManager.idmMoGetDBAdapter().idmMoInsertNodeInfoListImplicit(this.serverId, arrayList);
            this.moDatabaseManager.idmMoGetDBAdapter().idmMoDatabaseSetTransactionSuccessful();
        } finally {
            this.moDatabaseManager.idmMoGetDBAdapter().idmMoDatabaseEndTransaction();
            this.moDatabaseManager.idmMoDatabaseClose();
        }
    }

    public List<DDFProfileInfo> creatAndReturnProfiles() throws XmlPullParserException, IOException {
        List<DDFNode> listExecute = this.ddfParser.execute();
        ArrayList<IDMMoNodeInfo> arrayList = new ArrayList<>();
        addMoNodeInfoToList(listExecute, arrayList);
        insertMoNodeInfoListToDB(arrayList);
        return this.ddfParser.getProfileInfoList();
    }
}
