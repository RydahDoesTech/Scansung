package com.idm.fotaagent.utils;

import android.os.SemSystemProperties;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
enum BinaryStatusByFlashLocked implements BinaryStatus {
    OFFICIAL,
    CUSTOM,
    UNKNOWN;

    static final int FLASH_LOCKED = 1;
    static final int FLASH_UNKNOWN = -1;
    static final int FLASH_UNLOCKED = 0;
    static final String KEY_PROPERTY = "ro.boot.flash.locked";

    public static BinaryStatus getBinaryStatus() {
        return valueOf(getFlashLocked());
    }

    private static int getFlashLocked() {
        return SemSystemProperties.getInt(KEY_PROPERTY, -1);
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase() + " (checked by ro.boot.flash.locked)";
    }

    private static BinaryStatus valueOf(int i5) {
        if (i5 == -1) {
            return UNKNOWN;
        }
        if (i5 == 0) {
            return CUSTOM;
        }
        if (i5 == 1) {
            return OFFICIAL;
        }
        Log.W("unexpected flashLocked (" + i5 + "), fallback as FLASH_UNKNOWN");
        return UNKNOWN;
    }
}
