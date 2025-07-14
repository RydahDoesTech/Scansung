package androidx.activity;

import android.window.BackEvent;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3114b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3115c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3116d;

    public b(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        a aVar = a.f3112a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f3113a = fD;
        this.f3114b = fE;
        this.f3115c = fB;
        this.f3116d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f3113a + ", touchY=" + this.f3114b + ", progress=" + this.f3115c + ", swipeEdge=" + this.f3116d + '}';
    }
}
