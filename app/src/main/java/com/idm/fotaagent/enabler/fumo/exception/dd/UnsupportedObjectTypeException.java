package com.idm.fotaagent.enabler.fumo.exception.dd;

import com.idm.agent.dl.DLResultCode;

/* loaded from: classes.dex */
public class UnsupportedObjectTypeException extends DownloadDescriptorException {
    public UnsupportedObjectTypeException(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.exception.dd.DownloadDescriptorException
    public int getErrorCode() {
        return DLResultCode.NON_ACCEPTABLE_CONTENT.getIndex();
    }
}
