package com.idm.fotaagent.enabler.fumo.exception.dd;

import com.idm.agent.dl.DLResultCode;

/* loaded from: classes.dex */
public class UnsupportedVersionException extends DownloadDescriptorException {
    public UnsupportedVersionException(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.exception.dd.DownloadDescriptorException
    public int getErrorCode() {
        return DLResultCode.INVALID_DD_VERSION.getIndex();
    }
}
