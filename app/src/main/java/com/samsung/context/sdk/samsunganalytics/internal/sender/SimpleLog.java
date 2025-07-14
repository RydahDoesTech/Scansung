package com.samsung.context.sdk.samsunganalytics.internal.sender;

/* loaded from: classes.dex */
public class SimpleLog {
    private String _id;
    private String data;
    private long timestamp;
    private LogType type;

    public SimpleLog() {
    }

    public String getData() {
        return this.data;
    }

    public String getId() {
        return this._id;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public LogType getType() {
        return this.type;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setId(String str) {
        this._id = str;
    }

    public void setTimestamp(long j5) {
        this.timestamp = j5;
    }

    public void setType(LogType logType) {
        this.type = logType;
    }

    public SimpleLog(long j5, String str, LogType logType) {
        this("", j5, str, logType);
    }

    public SimpleLog(String str, long j5, String str2, LogType logType) {
        this._id = str;
        this.timestamp = j5;
        this.data = str2;
        this.type = logType;
    }
}
