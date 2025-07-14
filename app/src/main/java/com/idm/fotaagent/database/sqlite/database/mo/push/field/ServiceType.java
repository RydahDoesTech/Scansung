package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import g4.f;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public enum ServiceType implements TypeLengthValueField {
    Optional((byte) 79),
    Mandatory((byte) 77),
    Emergency((byte) 69);

    private final byte code;

    ServiceType(byte b2) {
        this.code = b2;
    }

    public static ServiceType of(String str) {
        if (str == null) {
            throw new IllegalArgumentException(f.d("code: ", str));
        }
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        if (bytes.length == 1) {
            return of(bytes[0]);
        }
        throw new IllegalArgumentException("code: ".concat(str));
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Character.toString((char) toCode());
    }

    public static ServiceType of(byte b2) {
        for (ServiceType serviceType : values()) {
            if (serviceType.toCode() == b2) {
                return serviceType;
            }
        }
        throw new IllegalArgumentException(A3.f.l(b2, "code: "));
    }
}
