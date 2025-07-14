package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final m f3638a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3639b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3640c;

    public w(v vVar, int i5, m mVar, ReferenceQueue referenceQueue) {
        super(vVar, referenceQueue);
        this.f3639b = i5;
        this.f3638a = mVar;
    }

    public final boolean a() {
        boolean z4;
        Object obj = this.f3640c;
        if (obj != null) {
            this.f3638a.d(obj);
            z4 = true;
        } else {
            z4 = false;
        }
        this.f3640c = null;
        return z4;
    }
}
