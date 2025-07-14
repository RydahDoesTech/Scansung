package com.idm.agent.dm.uic;

import java.util.List;

/* loaded from: classes.dex */
public class IDMDmUICResult {
    private List<String> dataList;
    private String statusCode;

    public List<String> idmGetDataList() {
        return this.dataList;
    }

    public String idmGetStatusCode() {
        return this.statusCode;
    }

    public void idmSetDataList(List<String> list) {
        this.dataList = list;
    }

    public void idmSetStatusCode(String str) {
        this.statusCode = str;
    }

    public String toString() {
        return "UICResult [statusCode=" + this.statusCode + ", dataList=" + this.dataList + "]";
    }
}
