package com.idm.core.tnds;

import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.providers.mo.IDMMoInterface;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class IDMTndsParserHandler implements IDMTndsConstants {
    private IDMTndsNodeInfo nodeInfo;
    private String parentPath;
    private boolean bVerDTD = false;
    private boolean bNodeName = false;
    private boolean bValue = false;
    private boolean bMIME = false;
    private boolean bDDFName = false;
    private boolean bAcl = false;
    private IDMTndsMgmtTree mgmtTree = new IDMTndsMgmtTree();

    public IDMTndsParserHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            this.parentPath = IDMMoInterface.IDM_MO_ROOT_PATH;
        } else {
            this.parentPath = str;
        }
    }

    private String idmTndsDeleteLastPath(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    public void endTag(String str) {
        if (IDMTndsConstants.TNDS_TAG_MGMTTREE.equals(str)) {
            IDMDebug.I("TNDS_TAG_MGMTTREE");
            return;
        }
        if ("VerDTD".equals(str)) {
            this.bVerDTD = false;
            return;
        }
        if (IDMTndsConstants.TNDS_TAG_NODE.equals(str)) {
            this.parentPath = idmTndsDeleteLastPath(this.parentPath);
            return;
        }
        if (IDMTndsConstants.TNDS_TAG_NODENAME.equals(str)) {
            this.bNodeName = false;
            return;
        }
        if ("Value".equals(str)) {
            this.bValue = false;
            return;
        }
        if ("ACL".equals(str)) {
            this.bAcl = false;
        } else if (IDMTndsConstants.TNDS_TAG_MIME.equals(str)) {
            this.bMIME = false;
        } else if (IDMTndsConstants.TNDS_TAG_DDFNAME.equals(str)) {
            this.bDDFName = false;
        }
    }

    public IDMTndsMgmtTree idmTndsGetMgmtTree() {
        return this.mgmtTree;
    }

    public void startTag(String str) {
        IDMTndsNodeInfo iDMTndsNodeInfo;
        if (IDMTndsConstants.TNDS_TAG_MGMTTREE.equals(str)) {
            IDMDebug.I("TNDS_TAG_MGMTTREE");
            return;
        }
        if ("VerDTD".equals(str)) {
            this.bVerDTD = true;
            return;
        }
        if (IDMTndsConstants.TNDS_TAG_NODE.equals(str)) {
            this.nodeInfo = new IDMTndsNodeInfo();
            this.mgmtTree.idmTndsGetNodeList().add(this.nodeInfo);
            return;
        }
        if (IDMTndsConstants.TNDS_TAG_NODENAME.equals(str)) {
            this.bNodeName = true;
            return;
        }
        if ("Value".equals(str)) {
            this.bValue = true;
            return;
        }
        if ("ACL".equals(str)) {
            this.bAcl = true;
            return;
        }
        if (IDMTndsConstants.TNDS_TAG_MIME.equals(str)) {
            this.bMIME = true;
            return;
        }
        if (IDMTndsConstants.TNDS_TAG_DDFNAME.equals(str)) {
            this.bDDFName = true;
            return;
        }
        if ("b64".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo2 = this.nodeInfo;
            if (iDMTndsNodeInfo2 != null) {
                iDMTndsNodeInfo2.idmTndsNodeSetFormat("b64");
                return;
            }
            return;
        }
        if ("bin".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo3 = this.nodeInfo;
            if (iDMTndsNodeInfo3 != null) {
                iDMTndsNodeInfo3.idmTndsNodeSetFormat("bin");
                return;
            }
            return;
        }
        if ("bool".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo4 = this.nodeInfo;
            if (iDMTndsNodeInfo4 != null) {
                iDMTndsNodeInfo4.idmTndsNodeSetFormat("bool");
                return;
            }
            return;
        }
        if ("chr".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo5 = this.nodeInfo;
            if (iDMTndsNodeInfo5 != null) {
                iDMTndsNodeInfo5.idmTndsNodeSetFormat("chr");
                return;
            }
            return;
        }
        if ("int".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo6 = this.nodeInfo;
            if (iDMTndsNodeInfo6 != null) {
                iDMTndsNodeInfo6.idmTndsNodeSetFormat("int");
                return;
            }
            return;
        }
        if ("node".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo7 = this.nodeInfo;
            if (iDMTndsNodeInfo7 != null) {
                iDMTndsNodeInfo7.idmTndsNodeSetFormat("node");
                return;
            }
            return;
        }
        if ("null".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo8 = this.nodeInfo;
            if (iDMTndsNodeInfo8 != null) {
                iDMTndsNodeInfo8.idmTndsNodeSetFormat("null");
                return;
            }
            return;
        }
        if ("xml".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo9 = this.nodeInfo;
            if (iDMTndsNodeInfo9 != null) {
                iDMTndsNodeInfo9.idmTndsNodeSetFormat("xml");
                return;
            }
            return;
        }
        if ("date".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo10 = this.nodeInfo;
            if (iDMTndsNodeInfo10 != null) {
                iDMTndsNodeInfo10.idmTndsNodeSetFormat("date");
                return;
            }
            return;
        }
        if ("time".equals(str)) {
            IDMTndsNodeInfo iDMTndsNodeInfo11 = this.nodeInfo;
            if (iDMTndsNodeInfo11 != null) {
                iDMTndsNodeInfo11.idmTndsNodeSetFormat("time");
                return;
            }
            return;
        }
        if (!"float".equals(str) || (iDMTndsNodeInfo = this.nodeInfo) == null) {
            return;
        }
        iDMTndsNodeInfo.idmTndsNodeSetFormat("float");
    }

    public void text(XmlPullParser xmlPullParser) {
        IDMTndsNodeInfo iDMTndsNodeInfo;
        if (this.bVerDTD) {
            this.mgmtTree.idmTndsSetVerDTD(xmlPullParser.getText().trim());
            return;
        }
        if (this.bNodeName) {
            String strTrim = xmlPullParser.getText().trim();
            this.parentPath = this.parentPath.concat("/").concat(strTrim);
            IDMTndsNodeInfo iDMTndsNodeInfo2 = this.nodeInfo;
            if (iDMTndsNodeInfo2 != null) {
                iDMTndsNodeInfo2.idmTndsNodeSetName(strTrim);
                this.nodeInfo.idmTndsNodeSetPath(this.parentPath);
                this.nodeInfo.idmTndsNodeSetDepth(this.parentPath.split("/").length);
                return;
            }
            return;
        }
        if (this.bValue) {
            IDMTndsNodeInfo iDMTndsNodeInfo3 = this.nodeInfo;
            if (iDMTndsNodeInfo3 != null) {
                iDMTndsNodeInfo3.idmTndsNodeSetValue(xmlPullParser.getText().trim());
                return;
            }
            return;
        }
        if (this.bAcl) {
            IDMTndsNodeInfo iDMTndsNodeInfo4 = this.nodeInfo;
            if (iDMTndsNodeInfo4 != null) {
                iDMTndsNodeInfo4.idmTndsNodeSetAcl(iDMTndsNodeInfo4.idmTndsNodeGetAcl().concat(xmlPullParser.getText().trim()));
                return;
            }
            return;
        }
        if ((this.bMIME || this.bDDFName) && (iDMTndsNodeInfo = this.nodeInfo) != null) {
            iDMTndsNodeInfo.idmTndsNodeSetType(xmlPullParser.getText().trim());
        }
    }
}
