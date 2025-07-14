package com.idm.fotaagent.restapi.restclient.push.message;

/* loaded from: classes.dex */
public class PushMessage {
    private static final int MAX_NUM_PARTS = 4;
    private static final int MIN_NUM_PARTS = 2;
    public static final String RAW_MSG = "msg";
    private static final String SEPARATOR = "\\|";
    private final String messageBody;
    private final String messageId;
    private final String messageType;
    private final String replyUrl;

    public PushMessage(String str) {
        if (str == null) {
            throw new IllegalArgumentException("rawMessage should not be null");
        }
        String[] strArrSplit = str.split(SEPARATOR, 4);
        if (strArrSplit.length < 2) {
            throw new IllegalArgumentException("Invalid rawMessage format: " + strArrSplit.length + " parts");
        }
        this.messageId = strArrSplit[0];
        this.messageType = strArrSplit[1];
        if (strArrSplit.length == 3) {
            this.messageBody = strArrSplit[2];
            this.replyUrl = "";
        } else if (strArrSplit.length == 4) {
            this.messageBody = strArrSplit[2];
            this.replyUrl = strArrSplit[3];
        } else {
            this.replyUrl = "";
            this.messageBody = "";
        }
    }

    public String body() {
        return this.messageBody;
    }

    public String id() {
        return this.messageId;
    }

    public String replyUrl() {
        return this.replyUrl;
    }

    public String type() {
        return this.messageType;
    }
}
