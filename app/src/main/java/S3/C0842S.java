package s3;

import C3.C0012d;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import n3.C0702g;
import p3.C0753O;
import p3.InterfaceC0752N;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;

/* renamed from: s3.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842S extends C0843T {

    /* renamed from: o, reason: collision with root package name */
    public final O2.i f8799o;

    public C0842S(InterfaceC0776t interfaceC0776t, C0843T c0843t, int i5, InterfaceC0798h interfaceC0798h, N3.f fVar, AbstractC0438v abstractC0438v, boolean z4, boolean z5, boolean z6, AbstractC0438v abstractC0438v2, InterfaceC0752N interfaceC0752N, InterfaceC0106a interfaceC0106a) {
        super(interfaceC0776t, c0843t, i5, interfaceC0798h, fVar, abstractC0438v, z4, z5, z6, abstractC0438v2, interfaceC0752N);
        this.f8799o = new O2.i(interfaceC0106a);
    }

    @Override // s3.C0843T
    public final C0843T O0(C0702g c0702g, N3.f fVar, int i5) {
        InterfaceC0798h interfaceC0798hS = s();
        AbstractC0219i.d("annotations", interfaceC0798hS);
        AbstractC0438v abstractC0438vD = d();
        AbstractC0219i.d("type", abstractC0438vD);
        boolean zP0 = P0();
        C0753O c0753o = InterfaceC0752N.f8400b;
        C0012d c0012d = new C0012d(29, this);
        return new C0842S(c0702g, null, i5, interfaceC0798hS, fVar, abstractC0438vD, zP0, this.f8802k, this.f8803l, this.f8804m, c0753o, c0012d);
    }
}
