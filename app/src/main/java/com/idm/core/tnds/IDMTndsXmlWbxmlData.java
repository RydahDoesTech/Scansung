package com.idm.core.tnds;

/* loaded from: classes.dex */
class IDMTndsXmlWbxmlData {
    private int nWbxmlDataSize = 0;
    private String pWbxmlData = "";
    private int nXMLDataSize = 0;
    private String pXMLData = "";

    public String idmTndsGetWbxmlData() {
        return this.pWbxmlData;
    }

    public int idmTndsGetWbxmlDataSize() {
        return this.nWbxmlDataSize;
    }

    public String idmTndsGetXMLData() {
        return this.pXMLData;
    }

    public int idmTndsGetXMLDataSize() {
        return this.nXMLDataSize;
    }

    public void idmTndsSetWbxmlData(String str) {
        this.pWbxmlData = str;
    }

    public void idmTndsSetWbxmlDataSize(int i5) {
        this.nWbxmlDataSize = i5;
    }

    public void idmTndsSetXMLData(String str) {
        this.pXMLData = str;
    }

    public void idmTndsSetXMLDataSize(int i5) {
        this.nXMLDataSize = i5;
    }
}
