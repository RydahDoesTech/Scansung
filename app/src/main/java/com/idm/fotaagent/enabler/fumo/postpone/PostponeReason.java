package com.idm.fotaagent.enabler.fumo.postpone;

import com.idm.fotaagent.utils.Formatted;

/* loaded from: classes.dex */
public enum PostponeReason {
    NONE,
    BY_USER,
    BY_POLICY,
    BY_CALL,
    BY_EMERGENCY_CALL,
    BY_LCD,
    BY_AUDIO,
    BY_SMART_SWITCH,
    BY_DEX,
    BY_POWER_SHARING,
    BY_FLASH_LIGHT,
    BY_ALARM_CLOCK;

    @Override // java.lang.Enum
    public String toString() {
        return "Postponed " + name() + " at " + new Formatted.DateTimeForLog(System.currentTimeMillis()) + "\n";
    }
}
