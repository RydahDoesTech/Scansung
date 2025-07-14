package com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory;

import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;

/* loaded from: classes.dex */
public class AllocateFailedException extends InvalidStateException {
    private final int errorCode;

    public AllocateFailedException(String str) {
        this(str, ErrorCode.ERROR.getErrorCode());
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public AllocateFailedException(String str, int i5) {
        super(str);
        this.errorCode = i5;
    }
}
