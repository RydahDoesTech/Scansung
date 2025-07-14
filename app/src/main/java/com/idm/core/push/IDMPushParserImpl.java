package com.idm.core.push;

import android.content.Context;
import com.idm.exception.push.IDMExceptionPushProcessFail;

/* loaded from: classes.dex */
public class IDMPushParserImpl implements IDMPushInterface {
    private boolean bNonceResync;
    private Context context;
    private int pushType;
    private byte[] rawData;

    public IDMPushParserImpl(Context context, byte[] bArr, int i5, boolean z4) {
        this.rawData = (byte[]) bArr.clone();
        this.pushType = i5;
        this.context = context;
        this.bNonceResync = z4;
    }

    public IDMPushInfo idmPushParserDecoder() throws IDMExceptionPushProcessFail {
        int i5 = this.pushType;
        if (i5 == 1) {
            IDMPushWapInfo iDMPushWapInfoIdmPushWapDecodeWSPHeader = new IDMPushWapDecoder(this.rawData).idmPushWapDecodeWSPHeader();
            if (iDMPushWapInfoIdmPushWapDecodeWSPHeader == null) {
                throw new IDMExceptionPushProcessFail("WapInfo Is Null");
            }
            if (iDMPushWapInfoIdmPushWapDecodeWSPHeader.idmPushWapGetContentType() == 68) {
                return new IDMPushDecoder(this.context, iDMPushWapInfoIdmPushWapDecodeWSPHeader.idmPushWapGetNotiBody(), this.pushType, this.bNonceResync).idmPushDecodePushInfo();
            }
        } else if (i5 == 2) {
            return new IDMPushDecoder(this.context, this.rawData, i5, this.bNonceResync).idmPushDecodePushInfo();
        }
        return null;
    }

    public IDMPushWapInfo idmPushWapHeaderDecoder() {
        return new IDMPushWapDecoder(this.rawData).idmPushWapDecodeWSPHeader();
    }

    public IDMPushParserImpl(Context context, byte[] bArr, int i5) {
        this.rawData = (byte[]) bArr.clone();
        this.pushType = i5;
        this.context = context;
    }
}
