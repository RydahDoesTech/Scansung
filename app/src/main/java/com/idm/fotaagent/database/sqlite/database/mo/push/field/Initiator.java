package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import A3.f;

/* loaded from: classes.dex */
public enum Initiator implements Field {
    CLIENT((byte) 0),
    SERVER((byte) 1);

    private final byte code;

    Initiator(byte b2) {
        this.code = b2;
    }

    public static Initiator of(byte b2) {
        for (Initiator initiator : values()) {
            if (initiator.code == b2) {
                return initiator;
            }
        }
        throw new IllegalArgumentException(f.l(b2, "code: "));
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }
}
