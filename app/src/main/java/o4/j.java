package o4;

import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final b3.k f8312a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8313b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(InterfaceC0106a interfaceC0106a, InterfaceC0107b interfaceC0107b) {
        this.f8312a = (b3.k) interfaceC0106a;
        this.f8313b = interfaceC0107b;
    }

    @Override // o4.k
    public final Iterator iterator() {
        return new i(this);
    }
}
