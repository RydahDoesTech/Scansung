package com.idm.core.tnds;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Constants;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class IDMTndsWbxmltoXmlParse implements IDMTndsXmlWbxmlDefine {
    private IDMTndsTagManage tagManage;
    private IDMTndsXmlWbxmlData tndsData;

    public static class IDMTndsTagManage implements IDMTndsXmlWbxmlDefine {
        int[] eTagID;
        int nTagSP;

        private IDMTndsTagManage() {
            this.eTagID = new int[30];
            this.nTagSP = 0;
        }
    }

    private String idmTndsGetTagString(int i5) {
        if (i5 >= 125) {
            return "NULL";
        }
        return IDMTndsXmlWbxmlDefine.gszTndsTokenStr[i5 - 69];
    }

    private String idmTndsGetWbxmlData() {
        return this.tndsData.idmTndsGetWbxmlData();
    }

    private int idmTndsGetWbxmlSize() {
        return this.tndsData.idmTndsGetWbxmlDataSize();
    }

    private String idmTndsGetXMLData() {
        return this.tndsData.idmTndsGetXMLData();
    }

    private int idmTndsGetXMLSize() {
        return this.tndsData.idmTndsGetXMLDataSize();
    }

    private void idmTndsInitParse(String str, int i5) {
        this.tndsData = new IDMTndsXmlWbxmlData();
        idmTndsSetWbxmlSize(i5);
        idmTndsSetWbxmlData(str);
        this.tagManage = new IDMTndsTagManage();
    }

    private String idmTndsMakeCloseTagString() {
        return "</".concat(idmTndsGetTagString(idmTndsManagePopTag())).concat(">");
    }

    private String idmTndsMakeOpenTagString(int i5) {
        return "<".concat(idmTndsGetTagString(i5)).concat(">");
    }

    private int idmTndsManagePopTag() {
        IDMTndsTagManage iDMTndsTagManage = this.tagManage;
        int i5 = iDMTndsTagManage.nTagSP;
        if (i5 == 0) {
            return 0;
        }
        int i6 = i5 - 1;
        iDMTndsTagManage.nTagSP = i6;
        int[] iArr = iDMTndsTagManage.eTagID;
        int i7 = iArr[i6];
        iArr[i6] = 0;
        return i7;
    }

    private boolean idmTndsManagePushTag(int i5) {
        IDMTndsTagManage iDMTndsTagManage = this.tagManage;
        int i6 = iDMTndsTagManage.nTagSP;
        if (i6 == 30) {
            return false;
        }
        iDMTndsTagManage.eTagID[i6] = i5;
        iDMTndsTagManage.nTagSP = i6 + 1;
        return true;
    }

    private void idmTndsParsingACLTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingAccessTypeChildElement() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        char cCharAt = strIdmTndsGetWbxmlData.charAt(0);
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        int i5 = cCharAt - '@';
        if (i5 == 71 || i5 == 78 || i5 == 83 || i5 == 90 || i5 == 93 || i5 == 110) {
            idmTndsSetXMLSize("<".concat(idmTndsGetTagString(i5)).concat("/>").length() + iIdmTndsGetXMLSize);
            idmTndsSetXMLData(strIdmTndsGetXMLData);
            String strSubstring = strIdmTndsGetWbxmlData.substring(1);
            idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize - 1);
            idmTndsSetWbxmlData(strSubstring);
        }
    }

    private void idmTndsParsingAccessTypeTag() {
        idmTndsParsingOpenTag();
        idmTndsParsingAccessTypeChildElement();
    }

    private void idmTndsParsingCloseTag() {
        int length;
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strIdmTndsMakeCloseTagString = idmTndsMakeCloseTagString();
        if (strIdmTndsMakeCloseTagString != null) {
            length = strIdmTndsMakeCloseTagString.length();
            strIdmTndsGetXMLData = strIdmTndsGetXMLData.concat(strIdmTndsMakeCloseTagString);
        } else {
            length = 0;
        }
        idmTndsSetXMLSize(iIdmTndsGetXMLSize + length);
        idmTndsSetXMLData(strIdmTndsGetXMLData);
        String strSubstring = strIdmTndsGetWbxmlData.substring(1);
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize - 1);
        idmTndsSetWbxmlData(strSubstring);
    }

    private boolean idmTndsParsingCodePage() {
        String strSubstring = idmTndsGetWbxmlData().substring(1);
        if (strSubstring.charAt(0) == 2) {
            IDMDebug.I(Constants.SYNCML_PROPERTY_TNDS);
        } else {
            if (strSubstring.charAt(0) != 0) {
                return false;
            }
            IDMDebug.I("SYNCML");
        }
        idmTndsSetWbxmlData(strSubstring.substring(1));
        idmTndsSetWbxmlSize(idmTndsGetWbxmlSize() - 2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void idmTndsParsingFormatChildElement() {
        /*
            r6 = this;
            int r0 = r6.idmTndsGetWbxmlSize()
            java.lang.String r1 = r6.idmTndsGetWbxmlData()
            r2 = 0
            char r2 = r1.charAt(r2)
            java.lang.String r3 = r6.idmTndsGetXMLData()
            int r4 = r6.idmTndsGetXMLSize()
            int r2 = r2 + 64
            r5 = 80
            if (r2 == r5) goto L49
            r5 = 91
            if (r2 == r5) goto L49
            r5 = 94
            if (r2 == r5) goto L49
            r5 = 101(0x65, float:1.42E-43)
            if (r2 == r5) goto L49
            r5 = 103(0x67, float:1.44E-43)
            if (r2 == r5) goto L49
            r5 = 114(0x72, float:1.6E-43)
            if (r2 == r5) goto L49
            r5 = 124(0x7c, float:1.74E-43)
            if (r2 == r5) goto L49
            r5 = 105(0x69, float:1.47E-43)
            if (r2 == r5) goto L49
            r5 = 106(0x6a, float:1.49E-43)
            if (r2 == r5) goto L49
            r5 = 121(0x79, float:1.7E-43)
            if (r2 == r5) goto L49
            r5 = 122(0x7a, float:1.71E-43)
            if (r2 == r5) goto L49
            switch(r2) {
                case 72: goto L49;
                case 73: goto L49;
                case 74: goto L49;
                case 75: goto L49;
                default: goto L46;
            }
        L46:
            java.lang.String r2 = ""
            goto L59
        L49:
            java.lang.String r5 = "<"
            java.lang.String r2 = r6.idmTndsGetTagString(r2)
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "/>"
            java.lang.String r2 = r2.concat(r5)
        L59:
            int r5 = r2.length()
            java.lang.String r2 = r3.concat(r2)
            int r4 = r4 + r5
            r6.idmTndsSetXMLSize(r4)
            r6.idmTndsSetXMLData(r2)
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            int r0 = r0 + (-1)
            r6.idmTndsSetWbxmlSize(r0)
            r6.idmTndsSetWbxmlData(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.core.tnds.IDMTndsWbxmltoXmlParse.idmTndsParsingFormatChildElement():void");
    }

    private void idmTndsParsingFormatTag() {
        idmTndsParsingOpenTag();
        idmTndsParsingFormatChildElement();
    }

    private void idmTndsParsingMIMETag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingMgmtTreeTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingNameTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingNodeNameTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingNodeTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingOpenTag() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        int length = 0;
        char cCharAt = strIdmTndsGetWbxmlData.charAt(0);
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        idmTndsManagePushTag(cCharAt);
        String strIdmTndsMakeOpenTagString = idmTndsMakeOpenTagString(cCharAt);
        if (strIdmTndsMakeOpenTagString != null) {
            length = strIdmTndsMakeOpenTagString.length();
            strIdmTndsGetXMLData = strIdmTndsGetXMLData.concat(strIdmTndsMakeOpenTagString);
        }
        idmTndsSetXMLSize(iIdmTndsGetXMLSize + length);
        idmTndsSetXMLData(strIdmTndsGetXMLData);
        String strSubstring = strIdmTndsGetWbxmlData.substring(1);
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize - 1);
        idmTndsSetWbxmlData(strSubstring);
    }

    private void idmTndsParsingPathTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingRTPropertiesTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingTypeTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingValueTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingVerdtdTag() {
        idmTndsParsingOpenTag();
    }

    private void idmTndsParsingWbxmlHeader() {
        String strSubstring = idmTndsGetWbxmlData().substring(1).substring(2).substring(1);
        char cCharAt = strSubstring.charAt(0);
        idmTndsSetWbxmlData(strSubstring.substring(1).substring(cCharAt));
        idmTndsSetWbxmlSize(idmTndsGetWbxmlSize() - (5 + cCharAt));
    }

    private void idmTndsProcessStringData() {
        StringBuilder sb = new StringBuilder();
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        sb.append(idmTndsGetXMLData());
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strSubstring = strIdmTndsGetWbxmlData.substring(1);
        char cCharAt = strSubstring.charAt(0);
        int i5 = 1;
        while (cCharAt != 0) {
            if (cCharAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(cCharAt);
            }
            strSubstring = strSubstring.substring(1);
            i5++;
            cCharAt = strSubstring.charAt(0);
        }
        idmTndsSetXMLSize((iIdmTndsGetXMLSize + i5) - 1);
        idmTndsSetXMLData(sb.toString());
        String strSubstring2 = strSubstring.substring(1);
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize - (i5 + 1));
        idmTndsSetWbxmlData(strSubstring2);
    }

    private void idmTndsSetWbxmlData(String str) {
        this.tndsData.idmTndsSetWbxmlData(str);
    }

    private void idmTndsSetWbxmlSize(int i5) {
        this.tndsData.idmTndsSetWbxmlDataSize(i5);
    }

    private void idmTndsSetXMLData(String str) {
        this.tndsData.idmTndsSetXMLData(str);
    }

    private void idmTndsSetXMLSize(int i5) {
        this.tndsData.idmTndsSetXMLDataSize(i5);
    }

    private boolean idmTndsUderMgmtTreeTagParse() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        while (iIdmTndsGetWbxmlSize != 0 && strIdmTndsGetWbxmlData != null) {
            byte b2 = strIdmTndsGetWbxmlData.getBytes(Charset.defaultCharset())[0];
            if (b2 == 0) {
                idmTndsParsingCodePage();
            } else if (b2 == 1) {
                idmTndsParsingCloseTag();
            } else if (b2 == 3) {
                idmTndsProcessStringData();
            } else if (b2 == 92) {
                idmTndsParsingFormatTag();
            } else if (b2 == 97) {
                idmTndsParsingMIMETag();
            } else if (b2 == 102) {
                idmTndsParsingNodeNameTag();
            } else if (b2 == 108) {
                idmTndsParsingPathTag();
            } else if (b2 == 111) {
                idmTndsParsingRTPropertiesTag();
            } else if (b2 == 69) {
                idmTndsParsingAccessTypeTag();
            } else if (b2 == 70) {
                idmTndsParsingACLTag();
            } else if (b2 == 99) {
                idmTndsParsingNameTag();
            } else if (b2 != 100) {
                switch (b2) {
                    case 117:
                        idmTndsParsingTypeTag();
                        break;
                    case 118:
                        idmTndsParsingValueTag();
                        break;
                    case 119:
                        idmTndsParsingVerdtdTag();
                        break;
                    default:
                        return false;
                }
            } else {
                idmTndsParsingNodeTag();
            }
            iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
            strIdmTndsGetWbxmlData = iIdmTndsGetWbxmlSize != 0 ? idmTndsGetWbxmlData() : null;
        }
        return true;
    }

    public String idmTndsWbxmlParse(String str, int i5) {
        idmTndsInitParse(str, i5);
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        while (iIdmTndsGetWbxmlSize != 0 && strIdmTndsGetWbxmlData != null) {
            byte b2 = strIdmTndsGetWbxmlData.getBytes(Charset.defaultCharset())[0];
            strIdmTndsGetWbxmlData = null;
            if (b2 == 0) {
                idmTndsParsingCodePage();
            } else if (b2 == 2) {
                idmTndsParsingWbxmlHeader();
            } else {
                if (b2 != 96) {
                    return null;
                }
                idmTndsParsingMgmtTreeTag();
                idmTndsUderMgmtTreeTagParse();
            }
            iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
            if (iIdmTndsGetWbxmlSize != 0) {
                strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
            }
        }
        return idmTndsGetXMLData();
    }
}
