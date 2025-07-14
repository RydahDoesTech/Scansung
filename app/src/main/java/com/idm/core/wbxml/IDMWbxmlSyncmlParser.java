package com.idm.core.wbxml;

import com.idm.core.syncml.SyncML;
import com.idm.exception.dm.IDMExceptionDmParsing;

/* loaded from: classes.dex */
public class IDMWbxmlSyncmlParser {
    public SyncML idmSyncmlWbxmlDecoder(byte[] bArr) throws IDMExceptionDmParsing {
        try {
            return new IDMWbxmlSyncmlDecoder().idmWbxmlDecode(bArr);
        } catch (Exception e5) {
            throw new IDMExceptionDmParsing(e5);
        }
    }

    public byte[] idmSyncmlWbxmlEncoder(SyncML syncML) {
        return new IDMWbxmlSyncmlEncoder().idmWbxmlEncode(syncML);
    }
}
