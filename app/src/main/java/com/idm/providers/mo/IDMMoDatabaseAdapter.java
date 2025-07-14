package com.idm.providers.mo;

import java.util.ArrayList;

/* loaded from: classes.dex */
public interface IDMMoDatabaseAdapter {
    void idmChangeServerIdProfileTable(String str, String str2);

    void idmChangeServerIdProfileTableName(String str, String str2);

    void idmChangeServerIdXFumoTable(String str, String str2);

    void idmChangeServerIdXNodeName(String str, String str2);

    void idmChangeServerIdXnodeTable(String str, String str2);

    boolean idmIsSameDBTable(String str);

    void idmMoDatabaseBeginTransaction();

    void idmMoDatabaseClose();

    boolean idmMoDatabaseCreate(String str);

    boolean idmMoDatabaseCreate(ArrayList<String> arrayList);

    boolean idmMoDatabaseDelete(String str);

    boolean idmMoDatabaseDelete(ArrayList<String> arrayList);

    void idmMoDatabaseEndTransaction();

    void idmMoDatabaseOpen();

    void idmMoDatabaseSetTransactionSuccessful();

    void idmMoDeleteNodeInfo(String str, String str2);

    void idmMoForceDeleteAuthNodeInfo(String str, String str2);

    IDMMoNodeInfo idmMoGetNodeInfo(String str, String str2);

    IDMMoNodeInfo idmMoGetNodeInfoImplicit(String str, String str2);

    ArrayList<IDMMoNodeInfo> idmMoGetNodeInfoList(String str, String str2);

    IDMMoXnodeInfo idmMoGetXnodeInfo(String str);

    void idmMoInsertNodeInfo(String str, String str2, String str3, int i5, String str4, String str5, String str6, int i6);

    void idmMoInsertNodeInfoImplicit(String str, String str2, String str3, int i5, String str4, String str5, String str6, int i6);

    void idmMoInsertNodeInfoListImplicit(String str, ArrayList<IDMMoNodeInfo> arrayList);

    void idmMoInsertXFumoInfo(String str, String str2);

    void idmMoInsertXnodeInfo(IDMMoXnodeInfo iDMMoXnodeInfo);

    boolean idmMoIsExistDbTable(String str);

    boolean idmMoIsExistNode(String str, String str2);

    void idmMoUpdateNodeInfo(String str, String str2, String str3, String str4);

    void idmMoUpdateNodeInfoImplicit(String str, String str2, String str3, String str4);

    void idmMoUpdateXFumoInfo(String str, String str2);

    void idmMoUpdateXnodeInfo(String str, IDMMoXnodeInfo iDMMoXnodeInfo);

    void idmMoXFumoDelete(String str);

    void idmMoXnodeDelete(String str);

    boolean idmXfumoTableDelete();

    void idmXnodeDatabaseCreate();

    boolean idmXnodeTableDelete();
}
