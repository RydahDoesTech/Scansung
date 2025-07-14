package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import A3.f;

/* loaded from: classes.dex */
public enum UpdateType implements TypeLengthValueField {
    Normal((byte) 0),
    Important((byte) 2);

    private final byte code;

    UpdateType(byte b2) {
        this.code = b2;
    }

    public static UpdateType of(byte b2) {
        for (UpdateType updateType : values()) {
            if (updateType.code == b2) {
                return updateType;
            }
        }
        throw new IllegalArgumentException(f.l(b2, "code: "));
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }
}
