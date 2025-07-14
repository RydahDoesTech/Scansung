package com.idm.fotaagent.scheduler;

import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6362b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f6361a = i5;
        this.f6362b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i5 = this.f6361a;
        Object obj = this.f6362b;
        switch (i5) {
            case 0:
                return ((SalesCode) obj).toString();
            default:
                return Integer.valueOf(((BatteryChecker.ForNonAB) obj).getBatteryLevel());
        }
    }
}
