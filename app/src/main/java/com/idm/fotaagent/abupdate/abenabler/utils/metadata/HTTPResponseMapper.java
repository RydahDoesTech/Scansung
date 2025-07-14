package com.idm.fotaagent.abupdate.abenabler.utils.metadata;

import com.idm.fotaagent.abupdate.updateengine.ErrorCode;

/* loaded from: classes.dex */
public class HTTPResponseMapper {
    public static ErrorCode of(int i5) {
        return i5 == 403 ? ErrorCode.METADATA_EXPIRED_DOWNLOAD_URL : (i5 == 404 || i5 == 500 || i5 == 503) ? ErrorCode.METADATA_CDN_ERROR : i5 == 416 ? ErrorCode.METADATA_RANGE_REQUEST_ERROR : (i5 < 300 || i5 >= 400) ? ErrorCode.METADATA_DOWNLOAD_GENERIC_FAILED : ErrorCode.METADATA_REDIRECT_ERROR;
    }
}
