package com.idm.core.tnds;

import com.idm.adapter.logmanager.IDMDebug;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class IDMTndsXmltoWbxmlParse implements IDMTndsXmlWbxmlDefine, IDMTndsConstants {
    private IDMTndsXmlWbxmlData tndsData;

    private void idmTndsAddWbxmlHeader() {
        IDMDebug.I("TNDSAddWbxmlHeader");
        char[] cArr = new char[31];
        int i5 = 0;
        while (i5 < 31) {
            cArr[i5] = IDMTndsXmlWbxmlDefine.gTndsWbxmlHeaderInfo[i5];
            i5++;
        }
        String strValueOf = String.valueOf(cArr);
        idmTndsSetWbxmlSize(i5);
        idmTndsSetWbxmlData(strValueOf);
    }

    private void idmTndsConvertAddTndsCodePage() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        int i5 = iIdmTndsGetWbxmlSize - 1;
        String strConcat = strIdmTndsGetWbxmlData.substring(0, i5).concat(String.valueOf((char) 0)).concat(String.valueOf((char) 2)).concat(String.valueOf((char) strIdmTndsGetWbxmlData.getBytes(Charset.defaultCharset())[i5]));
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize + 2);
        idmTndsSetWbxmlData(strConcat);
    }

    private void idmTndsConvertCheckElement(char c2) {
        byte b2 = (byte) c2;
        if (b2 != 69) {
            if (b2 != 70) {
                if (b2 != 76) {
                    if (b2 != 87) {
                        if (b2 != 92) {
                            if (b2 != 102) {
                                if (b2 != 104) {
                                    if (b2 != 108 && b2 != 81 && b2 != 82 && b2 != 84) {
                                        if (b2 != 85 && b2 != 112) {
                                            if (b2 != 113 && b2 != 115 && b2 != 116) {
                                                switch (b2) {
                                                    case 95:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                        break;
                                                    case 96:
                                                        idmTndsConvertAddTndsCodePage();
                                                        return;
                                                    default:
                                                        switch (b2) {
                                                        }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            idmTndsProcessConvertStringData();
            return;
        }
        idmTndsProcessConvertHexData(c2);
    }

    private void idmTndsConvertCheckTag() {
        if (idmTndsGetXMLData().substring(1).charAt(0) == '/') {
            idmTndsConvertXmlCloseTag();
        } else {
            idmTndsConvertXml2Wbxml();
        }
    }

    private String idmTndsConvertGetXMLTag(int i5) {
        return IDMTndsXmlWbxmlDefine.gszTndsTokenStr[i5];
    }

    private void idmTndsConvertSkip1Byte() {
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strSubstring = strIdmTndsGetXMLData.substring(1);
        idmTndsSetXMLSize(iIdmTndsGetXMLSize - 1);
        idmTndsSetXMLData(strSubstring);
    }

    private char idmTndsConvertString2WbxmlHex(String str) {
        int length = str.length();
        for (int i5 = 0; i5 != 56; i5++) {
            if (str.regionMatches(0, idmTndsConvertGetXMLTag(i5), 0, length)) {
                return (char) (i5 + 69);
            }
            if (str.regionMatches(0, IDMTndsConstants.TNDS_TAG_MGMTTREE_XMLNS, 0, 32)) {
                return '`';
            }
        }
        IDMDebug.E("# ERROR # Not Found String !!! ###");
        return (char) 65535;
    }

    private void idmTndsConvertXml2Wbxml() {
        int i5;
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        char cIdmTndsConvertString2WbxmlHex = 0;
        char cCharAt = strIdmTndsGetXMLData.charAt(0);
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strConcat = "";
        if (cCharAt == '<') {
            strIdmTndsGetXMLData = strIdmTndsGetXMLData.substring(1);
            cCharAt = strIdmTndsGetXMLData.charAt(0);
            int i6 = 0;
            while (cCharAt != '>') {
                strConcat = strConcat.concat(String.valueOf(cCharAt));
                i6++;
                strIdmTndsGetXMLData = strIdmTndsGetXMLData.substring(1);
                cCharAt = strIdmTndsGetXMLData.charAt(0);
            }
            i5 = i6 + 1;
        } else {
            i5 = 0;
        }
        if (cCharAt == '>') {
            String strSubstring = strIdmTndsGetXMLData.substring(1);
            cIdmTndsConvertString2WbxmlHex = idmTndsConvertString2WbxmlHex(strConcat);
            String strConcat2 = strIdmTndsGetWbxmlData.concat(String.valueOf(cIdmTndsConvertString2WbxmlHex));
            idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize + 1);
            idmTndsSetWbxmlData(strConcat2);
            idmTndsSetXMLSize(iIdmTndsGetXMLSize - (i5 + 1));
            idmTndsSetXMLData(strSubstring);
        }
        idmTndsConvertCheckElement(cIdmTndsConvertString2WbxmlHex);
    }

    private void idmTndsConvertXmlCloseTag() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strSubstring = strIdmTndsGetXMLData.substring(2);
        int i5 = iIdmTndsGetXMLSize - 2;
        char cCharAt = strSubstring.charAt(0);
        while (cCharAt != '>') {
            strSubstring = strSubstring.substring(1);
            i5--;
            cCharAt = strSubstring.charAt(0);
        }
        String strSubstring2 = strSubstring.substring(1);
        String strConcat = strIdmTndsGetWbxmlData.concat(String.valueOf((char) 1));
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize + 1);
        idmTndsSetWbxmlData(strConcat);
        idmTndsSetXMLSize(i5 - 1);
        idmTndsSetXMLData(strSubstring2);
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

    private void idmTndsInitConvert(String str, int i5) {
        this.tndsData = new IDMTndsXmlWbxmlData();
        idmTndsSetXMLSize(i5);
        idmTndsSetXMLData(str);
        idmTndsAddWbxmlHeader();
    }

    private void idmTndsProcessConvertAccessTypeElement() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        char cCharAt = strIdmTndsGetXMLData.charAt(0);
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strConcat = "";
        if (cCharAt == '<') {
            String strSubstring = strIdmTndsGetXMLData.substring(1);
            int i5 = iIdmTndsGetXMLSize - 1;
            char cCharAt2 = strSubstring.charAt(0);
            while (cCharAt2 != '/') {
                strConcat = strConcat.concat(String.valueOf(cCharAt2));
                strSubstring = strSubstring.substring(1);
                i5--;
                cCharAt2 = strSubstring.charAt(0);
            }
            strIdmTndsGetXMLData = strSubstring.substring(2);
            iIdmTndsGetXMLSize = i5 - 2;
        }
        String strConcat2 = strIdmTndsGetWbxmlData.concat(String.valueOf((char) (idmTndsConvertString2WbxmlHex(strConcat) - '@')));
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize + 1);
        idmTndsSetWbxmlData(strConcat2);
        idmTndsSetXMLSize(iIdmTndsGetXMLSize);
        idmTndsSetXMLData(strIdmTndsGetXMLData);
    }

    private void idmTndsProcessConvertFormatElement() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        char cCharAt = strIdmTndsGetXMLData.charAt(0);
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strConcat = "";
        if (cCharAt == '<') {
            String strSubstring = strIdmTndsGetXMLData.substring(1);
            int i5 = iIdmTndsGetXMLSize - 1;
            char cCharAt2 = strSubstring.charAt(0);
            while (cCharAt2 != '/') {
                strConcat = strConcat.concat(String.valueOf(cCharAt2));
                strSubstring = strSubstring.substring(1);
                int i6 = i5 - 1;
                char cCharAt3 = strSubstring.charAt(0);
                if (cCharAt3 == ' ') {
                    strSubstring = strSubstring.substring(1);
                    i5 -= 2;
                    cCharAt2 = strSubstring.charAt(0);
                } else {
                    i5 = i6;
                    cCharAt2 = cCharAt3;
                }
            }
            strIdmTndsGetXMLData = strSubstring.substring(2);
            iIdmTndsGetXMLSize = i5 - 2;
        } else {
            while (cCharAt != '<') {
                strConcat = strConcat.concat(String.valueOf(cCharAt));
                strIdmTndsGetXMLData = strIdmTndsGetXMLData.substring(1);
                iIdmTndsGetXMLSize--;
                cCharAt = strIdmTndsGetXMLData.charAt(0);
            }
        }
        String strConcat2 = strIdmTndsGetWbxmlData.concat(String.valueOf((char) (idmTndsConvertString2WbxmlHex(strConcat) - '@')));
        idmTndsSetWbxmlSize(iIdmTndsGetWbxmlSize + 1);
        idmTndsSetWbxmlData(strConcat2);
        idmTndsSetXMLSize(iIdmTndsGetXMLSize);
        idmTndsSetXMLData(strIdmTndsGetXMLData);
    }

    private void idmTndsProcessConvertHexData(char c2) {
        if (c2 == 'E') {
            idmTndsProcessConvertAccessTypeElement();
        } else if (c2 == 'U' || c2 == '\\') {
            idmTndsProcessConvertFormatElement();
        }
    }

    private void idmTndsProcessConvertStringData() {
        int iIdmTndsGetWbxmlSize = idmTndsGetWbxmlSize();
        String strIdmTndsGetWbxmlData = idmTndsGetWbxmlData();
        String strIdmTndsGetXMLData = idmTndsGetXMLData();
        char cCharAt = strIdmTndsGetXMLData.charAt(0);
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        String strConcat = strIdmTndsGetWbxmlData.concat(String.valueOf((char) 3));
        int i5 = iIdmTndsGetWbxmlSize + 1;
        int i6 = 0;
        while (cCharAt != '<') {
            if (cCharAt != '&') {
                strConcat = strConcat.concat(String.valueOf(cCharAt));
                i5++;
                strIdmTndsGetXMLData = strIdmTndsGetXMLData.substring(1);
                i6++;
                cCharAt = strIdmTndsGetXMLData.charAt(0);
            } else if (strIdmTndsGetXMLData.contains("&amp;")) {
                strConcat = strConcat.concat(String.valueOf(cCharAt));
                i5++;
                strIdmTndsGetXMLData = strIdmTndsGetXMLData.substring(5);
                i6 += 5;
                cCharAt = strIdmTndsGetXMLData.charAt(0);
            }
        }
        String strConcat2 = strConcat.concat(String.valueOf((char) 0));
        idmTndsSetWbxmlSize(i5 + 1);
        idmTndsSetWbxmlData(strConcat2);
        idmTndsSetXMLSize(iIdmTndsGetXMLSize - i6);
        idmTndsSetXMLData(strIdmTndsGetXMLData);
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

    public String idmTndsXml2WbxmlConvert(String str, int i5) {
        idmTndsInitConvert(str, i5);
        int iIdmTndsGetXMLSize = idmTndsGetXMLSize();
        char c2 = idmTndsGetXMLData().toCharArray()[0];
        while (iIdmTndsGetXMLSize != 0) {
            if (c2 == 0 || c2 == '\n') {
                idmTndsConvertSkip1Byte();
            } else if (c2 == '<') {
                idmTndsConvertCheckTag();
            } else if (c2 != 2) {
                if (c2 != 3) {
                    return null;
                }
                idmTndsConvertSkip1Byte();
            }
            iIdmTndsGetXMLSize = idmTndsGetXMLSize();
            String strIdmTndsGetXMLData = idmTndsGetXMLData();
            if (strIdmTndsGetXMLData.length() != 0) {
                c2 = strIdmTndsGetXMLData.toCharArray()[0];
            }
        }
        return idmTndsGetWbxmlData();
    }
}
