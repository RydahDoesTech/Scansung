package com.idm.core.tnds;

import android.text.TextUtils;
import android.util.Xml;
import com.idm.adapter.logmanager.IDMDebug;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
class IDMTndsXmlEncoder implements IDMTndsConstants {
    private XmlSerializer serializer;

    private void idmTndsXmlMakeFormat(String str) throws IllegalStateException, IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.serializer.startTag(null, "Format");
        idmTndsXmlMakeTag(str, true);
        this.serializer.endTag(null, "Format");
    }

    private void idmTndsXmlMakeNodes(ArrayList<IDMTndsNodeInfo> arrayList, int i5, int i6) throws IllegalStateException, IOException, IllegalArgumentException {
        IDMTndsNodeInfo iDMTndsNodeInfo = arrayList.get(i6);
        this.serializer.startTag(null, IDMTndsConstants.TNDS_TAG_NODE);
        idmTndsXmlMakeTagWithContent(IDMTndsConstants.TNDS_TAG_NODENAME, iDMTndsNodeInfo.idmTndsNodeGetName());
        idmTndsXmlMakeRTProperties(iDMTndsNodeInfo, i5);
        String strIdmTndsNodeGetPath = iDMTndsNodeInfo.idmTndsNodeGetPath();
        int iIdmTndsNodeGetDepth = iDMTndsNodeInfo.idmTndsNodeGetDepth();
        while (true) {
            i6++;
            if (i6 >= arrayList.size()) {
                this.serializer.endTag(null, IDMTndsConstants.TNDS_TAG_NODE);
                return;
            }
            String strIdmTndsNodeGetPath2 = arrayList.get(i6).idmTndsNodeGetPath();
            int iIdmTndsNodeGetDepth2 = arrayList.get(i6).idmTndsNodeGetDepth();
            if (strIdmTndsNodeGetPath2.contains(strIdmTndsNodeGetPath) && iIdmTndsNodeGetDepth == iIdmTndsNodeGetDepth2 - 1) {
                idmTndsXmlMakeNodes(arrayList, i5, i6);
            }
        }
    }

    private void idmTndsXmlMakeRTProperties(IDMTndsNodeInfo iDMTndsNodeInfo, int i5) throws IllegalStateException, IOException, IllegalArgumentException {
        boolean z4 = (i5 & 2) == 2;
        boolean z5 = (i5 & 4) == 4;
        boolean z6 = (i5 & 1) == 1;
        boolean z7 = (i5 & 8) == 8;
        if ((!z4 || TextUtils.isEmpty(iDMTndsNodeInfo.idmTndsNodeGetFormat())) && ((!z5 || TextUtils.isEmpty(iDMTndsNodeInfo.idmTndsNodeGetType())) && ((!z6 || TextUtils.isEmpty(iDMTndsNodeInfo.idmTndsNodeGetAcl())) && (!z7 || TextUtils.isEmpty(iDMTndsNodeInfo.idmTndsNodeGetValue()))))) {
            return;
        }
        this.serializer.startTag(null, IDMTndsConstants.TNDS_TAG_RTPROPERTIES);
        if (z4) {
            idmTndsXmlMakeFormat(iDMTndsNodeInfo.idmTndsNodeGetFormat());
        }
        if (z5) {
            idmTndsXmlMakeType(iDMTndsNodeInfo.idmTndsNodeGetFormat(), iDMTndsNodeInfo.idmTndsNodeGetType());
        }
        if (z6) {
            idmTndsXmlMakeTagWithContent("ACL", iDMTndsNodeInfo.idmTndsNodeGetAcl());
        }
        if (z7) {
            idmTndsXmlMakeTagWithContent("Value", iDMTndsNodeInfo.idmTndsNodeGetValue());
        }
        this.serializer.endTag(null, IDMTndsConstants.TNDS_TAG_RTPROPERTIES);
    }

    private void idmTndsXmlMakeTag(String str, boolean z4) throws IllegalStateException, IOException, IllegalArgumentException {
        if (z4) {
            this.serializer.startTag(null, str);
            this.serializer.endTag(null, str);
        }
    }

    private void idmTndsXmlMakeTagWithAttrContent(String str, String str2, String str3, String str4) throws IllegalStateException, IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        this.serializer.startTag(null, str);
        this.serializer.attribute(null, str2, str3);
        this.serializer.text(str4);
        this.serializer.endTag(null, str);
    }

    private void idmTndsXmlMakeTagWithContent(String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.serializer.startTag(null, str);
        this.serializer.text(str2);
        this.serializer.endTag(null, str);
    }

    private void idmTndsXmlMakeType(String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.serializer.startTag(null, "Type");
        if ("node".equals(str)) {
            idmTndsXmlMakeTagWithContent(IDMTndsConstants.TNDS_TAG_DDFNAME, str2);
        } else {
            idmTndsXmlMakeTagWithContent(IDMTndsConstants.TNDS_TAG_MIME, str2);
        }
        this.serializer.endTag(null, "Type");
    }

    public String idmTndsXmlDataEncode(ArrayList<IDMTndsNodeInfo> arrayList, int i5) throws IllegalStateException, IOException, IllegalArgumentException {
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        this.serializer = xmlSerializerNewSerializer;
        try {
            xmlSerializerNewSerializer.setOutput(stringWriter);
            this.serializer.startTag(null, "SyncML");
            this.serializer.startTag(null, IDMTndsConstants.TNDS_TAG_MGMTTREE);
            idmTndsXmlMakeTagWithContent("VerDTD", "1.2");
            idmTndsXmlMakeNodes(arrayList, i5, 0);
            this.serializer.endTag(null, IDMTndsConstants.TNDS_TAG_MGMTTREE);
            this.serializer.endTag(null, "SyncML");
            this.serializer.endDocument();
            return stringWriter.toString();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
