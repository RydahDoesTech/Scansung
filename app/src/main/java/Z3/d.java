package z3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import m3.m;
import p3.InterfaceC0781y;
import s3.C0843T;

/* loaded from: classes.dex */
public final class d extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public static final d f9491d = new d(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        InterfaceC0781y interfaceC0781y = (InterfaceC0781y) obj;
        AbstractC0219i.e("module", interfaceC0781y);
        C0843T c0843tF = r2.d.f(c.f9488b, interfaceC0781y.g().i(m.f8135t));
        AbstractC0438v abstractC0438vD = c0843tF != null ? c0843tF.d() : null;
        return abstractC0438vD == null ? g4.j.c(g4.i.f6812F, new String[0]) : abstractC0438vD;
    }
}
