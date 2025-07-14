package com.idm.fotaagent.enabler.fumo.exception.dd;

/* loaded from: classes.dex */
public abstract class DownloadDescriptorException extends Exception {
    public DownloadDescriptorException(String str) {
        super(str);
    }

    public abstract int getErrorCode();
}
