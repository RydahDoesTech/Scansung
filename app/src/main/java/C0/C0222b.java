package c0;

import O1.e;
import androidx.lifecycle.X;
import o.C0714l;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0222b extends X {

    /* renamed from: b, reason: collision with root package name */
    public static final e f5136b = new e(12);

    /* renamed from: a, reason: collision with root package name */
    public final C0714l f5137a = new C0714l();

    @Override // androidx.lifecycle.X
    public final void onCleared() {
        super.onCleared();
        C0714l c0714l = this.f5137a;
        int i5 = c0714l.f;
        if (i5 > 0) {
            c0714l.f8240e[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c0714l.f8240e;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        c0714l.f = 0;
    }
}
