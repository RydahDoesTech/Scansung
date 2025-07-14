package com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory;

import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;

/* loaded from: classes.dex */
public class InsufficientMemoryToAllocateException extends InsufficientMemoryException {
    private final long requiredBytes;

    public InsufficientMemoryToAllocateException(String str, long j5) {
        super(str);
        this.requiredBytes = j5;
    }

    public long getRequiredBytes() {
        return this.requiredBytes;
    }
}
