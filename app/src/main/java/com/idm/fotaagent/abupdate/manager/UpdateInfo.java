package com.idm.fotaagent.abupdate.manager;

import java.io.Serializable;

/* loaded from: classes.dex */
public class UpdateInfo implements Serializable {
    private static final long serialVersionUID = 8074333769599985750L;
    private final int installationStep;
    private final int percent;

    public UpdateInfo(int i5, int i6) {
        this.installationStep = i5;
        this.percent = i6;
    }

    public int installationStep() {
        return this.installationStep;
    }

    public int percent() {
        return this.percent;
    }

    public String toString() {
        return "UpdateInfo{installationStep='" + this.installationStep + "'percent='" + this.percent + "'}";
    }
}
