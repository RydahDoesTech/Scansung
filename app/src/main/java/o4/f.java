package o4;

import a3.InterfaceC0107b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f8302a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8303b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8304c;

    public f(k kVar, boolean z4, InterfaceC0107b interfaceC0107b) {
        this.f8302a = kVar;
        this.f8303b = z4;
        this.f8304c = interfaceC0107b;
    }

    @Override // o4.k
    public final Iterator iterator() {
        return new e(this);
    }
}
