package com.idm.core.dd;

/* loaded from: classes.dex */
public class IDMDDDataInfo {
    private IDMDDXmlDataSet IDMDDXmlDataSet;
    private byte[] downloadDescriptorData;

    public IDMDDXmlDataSet idmGetDDXmlDataSet() {
        return this.IDMDDXmlDataSet;
    }

    public byte[] idmGetDownloadDescriptorData() {
        return this.downloadDescriptorData;
    }

    public void idmSetDDXmlDataSet(IDMDDXmlDataSet iDMDDXmlDataSet) {
        this.IDMDDXmlDataSet = iDMDDXmlDataSet;
    }

    public void idmSetDownloadDescriptorData(byte[] bArr) {
        this.downloadDescriptorData = bArr;
    }
}
