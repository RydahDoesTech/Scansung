package com.idm.fotaagent.utils;

import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public interface BinaryStatus {
    static BinaryStatus getBinaryStatus() {
        BinaryStatus binaryStatus = BinaryStatusByFlashLocked.getBinaryStatus();
        Log.I(binaryStatus.toString());
        return binaryStatus;
    }

    static boolean isOfficial() {
        return getBinaryStatus() == BinaryStatusByFlashLocked.OFFICIAL;
    }
}
