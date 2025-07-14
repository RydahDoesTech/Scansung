package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import A3.f;

/* loaded from: classes.dex */
public enum DownloadType implements TypeLengthValueField {
    Normal((byte) 0),
    Force((byte) 1);

    private final byte code;

    DownloadType(byte b2) {
        this.code = b2;
    }

    public static DownloadType of(byte b2) {
        for (DownloadType downloadType : values()) {
            if (downloadType.code == b2) {
                return downloadType;
            }
        }
        throw new IllegalArgumentException(f.l(b2, "code: "));
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }
}
