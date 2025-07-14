package com.idm.fotaagent.enabler.fumo;

import android.hardware.display.DisplayManager;
import com.idm.fotaagent.enabler.fumo.IdleChecker;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return IdleChecker.DeviceStatus.AnonymousClass4.lambda$runs$1(NetworkAnalyticsConstants.DataPoints.FLAG_PPID, (DisplayManager) obj);
    }
}
