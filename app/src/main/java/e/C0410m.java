package e;

import a.InterfaceC0092b;
import androidx.activity.ComponentActivity;

/* renamed from: e.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410m implements InterfaceC0092b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0411n f6608a;

    public C0410m(AbstractActivityC0411n abstractActivityC0411n) {
        this.f6608a = abstractActivityC0411n;
    }

    @Override // a.InterfaceC0092b
    public final void a(ComponentActivity componentActivity) {
        AbstractActivityC0411n abstractActivityC0411n = this.f6608a;
        r delegate = abstractActivityC0411n.getDelegate();
        delegate.a();
        abstractActivityC0411n.getSavedStateRegistry().a("androidx:appcompat");
        delegate.f();
    }
}
