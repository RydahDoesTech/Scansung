package com.samsung.context.sdk.samsunganalytics.internal.connection;

/* loaded from: classes.dex */
public enum Directory {
    DEVICE_CONTROLLER_DIR("/v3/sdk/quotas"),
    DATA_DELETE("/v3/sdk/indiv/delete"),
    DLS_DIR(""),
    DLS_DIR_BAT("");

    String directory;

    Directory(String str) {
        this.directory = str;
    }

    public String getDirectory() {
        return this.directory;
    }

    public void setDirectory(String str) {
        this.directory = str;
    }
}
