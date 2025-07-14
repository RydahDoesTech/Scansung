package androidx.activity;

import android.window.BackEvent;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3112a = new a();

    public final BackEvent a(float f, float f5, float f6, int i5) {
        return new BackEvent(f, f5, f6, i5);
    }

    public final float b(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
