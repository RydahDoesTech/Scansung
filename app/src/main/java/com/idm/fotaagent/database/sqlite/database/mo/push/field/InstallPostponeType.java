package com.idm.fotaagent.database.sqlite.database.mo.push.field;

import A3.f;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class InstallPostponeType implements TypeLengthValueField {
    private static final long serialVersionUID = -8146399235983528268L;
    private final byte code;
    public static final InstallPostponeType UNLIMITED = new InstallPostponeType((byte) -1);
    public static final InstallPostponeType NO = new InstallPostponeType((byte) 0);

    private InstallPostponeType(byte b2) {
        this.code = b2;
    }

    public static InstallPostponeType of(byte b2) {
        InstallPostponeType installPostponeType = UNLIMITED;
        if (b2 == installPostponeType.toCode()) {
            return installPostponeType;
        }
        InstallPostponeType installPostponeType2 = NO;
        if (b2 == installPostponeType2.toCode()) {
            return installPostponeType2;
        }
        if (b2 < 1 || b2 > 9) {
            throw new IllegalArgumentException(f.l(b2, "code: "));
        }
        return new InstallPostponeType(b2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.code == ((InstallPostponeType) obj).code;
    }

    public int maxCount() {
        if (toCode() >= 0) {
            return toCode();
        }
        Log.W("should not be called; return 0");
        return 0;
    }

    @Override // com.idm.fotaagent.database.sqlite.database.mo.push.field.Field
    public byte toCode() {
        return this.code;
    }

    public String toString() {
        return String.valueOf((int) this.code);
    }
}
