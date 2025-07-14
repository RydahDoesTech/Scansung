package androidx.databinding;

import androidx.lifecycle.InterfaceC0159w;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class u extends i implements m {

    /* renamed from: a, reason: collision with root package name */
    public final w f3637a;

    public u(v vVar, int i5, ReferenceQueue referenceQueue) {
        this.f3637a = new w(vVar, i5, this, referenceQueue);
    }

    @Override // androidx.databinding.m
    public final void a(Object obj) {
        ((j) obj).addOnPropertyChangedCallback(this);
    }

    @Override // androidx.databinding.m
    public final void b(InterfaceC0159w interfaceC0159w) {
    }

    @Override // androidx.databinding.m
    public final void d(Object obj) {
        ((j) obj).removeOnPropertyChangedCallback(this);
    }
}
