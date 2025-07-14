package androidx.databinding;

import androidx.lifecycle.InterfaceC0159w;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3635a;

    /* renamed from: b, reason: collision with root package name */
    public final w f3636b;

    public t(v vVar, int i5, ReferenceQueue referenceQueue, int i6) {
        this.f3635a = i6;
        switch (i6) {
            case 1:
                this.f3636b = new w(vVar, i5, this, referenceQueue);
                break;
            default:
                this.f3636b = new w(vVar, i5, this, referenceQueue);
                break;
        }
    }

    private final void c(InterfaceC0159w interfaceC0159w) {
    }

    private final void e(InterfaceC0159w interfaceC0159w) {
    }

    @Override // androidx.databinding.m
    public final void a(Object obj) {
        switch (this.f3635a) {
            case 0:
                obj.getClass();
                throw new ClassCastException();
            default:
                obj.getClass();
                throw new ClassCastException();
        }
    }

    @Override // androidx.databinding.m
    public final void b(InterfaceC0159w interfaceC0159w) {
        int i5 = this.f3635a;
    }

    @Override // androidx.databinding.m
    public final void d(Object obj) {
        switch (this.f3635a) {
            case 0:
                obj.getClass();
                throw new ClassCastException();
            default:
                obj.getClass();
                throw new ClassCastException();
        }
    }
}
