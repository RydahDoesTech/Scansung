package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import A3.f;

/* loaded from: classes.dex */
public enum InstallType implements TypeLengthValueField {
    Normal((byte) 0),
    Force((byte) 1);

    private final byte code;

    InstallType(byte b2) {
        this.code = b2;
    }

    public static InstallType of(byte b2) {
        for (InstallType installType : values()) {
            if (installType.code == b2) {
                return installType;
            }
        }
        throw new IllegalArgumentException(f.l(b2, "code: "));
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }
}
