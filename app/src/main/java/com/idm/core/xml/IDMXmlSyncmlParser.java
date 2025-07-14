package com.idm.core.xml;

import com.idm.core.syncml.SyncML;
import com.idm.exception.dm.IDMExceptionDmParsing;
import java.io.InputStream;

/* loaded from: classes.dex */
public class IDMXmlSyncmlParser {
    public SyncML idmSyncmlXmlDecoder(InputStream inputStream) throws IDMExceptionDmParsing {
        try {
            return new IDMXmlSyncmlDecoder().idmSyncmlDecode(inputStream);
        } catch (Exception e5) {
            throw new IDMExceptionDmParsing(e5);
        }
    }

    public byte[] idmSyncmlXmlEncoder(SyncML syncML) {
        return new IDMXmlSyncmlEncoder().idmSyncmlEncode(syncML);
    }
}
