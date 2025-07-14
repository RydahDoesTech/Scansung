package com.idm.core.tnds;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class IDMTndsMgmtTree {
    private ArrayList<IDMTndsNodeInfo> nodeInfoList = new ArrayList<>();
    private String verDTD;

    public ArrayList<IDMTndsNodeInfo> idmTndsGetNodeList() {
        return this.nodeInfoList;
    }

    public String idmTndsGetVerDTD() {
        return this.verDTD;
    }

    public void idmTndsSetNodeList(ArrayList<IDMTndsNodeInfo> arrayList) {
        this.nodeInfoList = arrayList;
    }

    public void idmTndsSetVerDTD(String str) {
        this.verDTD = str;
    }

    public String toString() {
        return "MgmtTree [verDTD=" + this.verDTD + ", nodeInfoList=" + this.nodeInfoList + "]";
    }
}
