package com.idm.fotaagent.enabler.fumo.exception.dd;

import com.idm.agent.dl.DLResultCode;

/* loaded from: classes.dex */
public class InvalidObjectUriException extends DownloadDescriptorException {
    public InvalidObjectUriException(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.exception.dd.DownloadDescriptorException
    public int getErrorCode() {
        return DLResultCode.LOADER_ERROR.getIndex();
    }
}
