package androidx.databinding;

import androidx.lifecycle.C;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0159w;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class r implements G, m {

    /* renamed from: a, reason: collision with root package name */
    public final w f3633a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3634b = null;

    public r(v vVar, int i5, ReferenceQueue referenceQueue) {
        this.f3633a = new w(vVar, i5, this, referenceQueue);
    }

    @Override // androidx.databinding.m
    public final void a(Object obj) {
        C c2 = (C) obj;
        WeakReference weakReference = this.f3634b;
        InterfaceC0159w interfaceC0159w = weakReference == null ? null : (InterfaceC0159w) weakReference.get();
        if (interfaceC0159w != null) {
            c2.e(interfaceC0159w, this);
        }
    }

    @Override // androidx.databinding.m
    public final void b(InterfaceC0159w interfaceC0159w) {
        WeakReference weakReference = this.f3634b;
        InterfaceC0159w interfaceC0159w2 = weakReference == null ? null : (InterfaceC0159w) weakReference.get();
        C c2 = (C) this.f3633a.f3640c;
        if (c2 != null) {
            if (interfaceC0159w2 != null) {
                c2.j(this);
            }
            if (interfaceC0159w != null) {
                c2.e(interfaceC0159w, this);
            }
        }
        if (interfaceC0159w != null) {
            this.f3634b = new WeakReference(interfaceC0159w);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.G
    public final void c(Object obj) {
        w wVar = this.f3633a;
        v vVar = (v) wVar.get();
        if (vVar == null) {
            wVar.a();
        }
        if (vVar != null) {
            vVar.handleFieldChange(wVar.f3639b, wVar.f3640c, 0);
        }
    }

    @Override // androidx.databinding.m
    public final void d(Object obj) {
        ((C) obj).j(this);
    }
}
