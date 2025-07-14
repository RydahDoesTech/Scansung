package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import A3.f;

/* loaded from: classes.dex */
public enum UiMode implements Field {
    NOT_SPECIFIED((byte) 0),
    BACKGROUND((byte) 1),
    INFORMATIVE((byte) 2),
    USER_INTERACTION((byte) 3),
    WIFI_BACKGROUND((byte) 4);

    private final byte code;

    public static class Value {
        public static final int BACKGROUND = 1;
        public static final int INFORMATIVE = 2;
        public static final int NOT_SPECIFIED = 0;
        public static final int USER_INTERACTION = 3;
        public static final int WIFI_BACKGROUND = 4;
    }

    UiMode(byte b2) {
        this.code = b2;
    }

    public static UiMode of(byte b2) {
        for (UiMode uiMode : values()) {
            if (uiMode.code == b2) {
                return uiMode;
            }
        }
        throw new IllegalArgumentException(f.l(b2, "code: "));
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }
}
