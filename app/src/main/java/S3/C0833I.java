package s3;

import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3.AbstractC0771o;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import q3.InterfaceC0798h;

/* renamed from: s3.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833I {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0766j f8758a;

    /* renamed from: b, reason: collision with root package name */
    public int f8759b;

    /* renamed from: c, reason: collision with root package name */
    public C0770n f8760c;

    /* renamed from: e, reason: collision with root package name */
    public int f8762e;

    /* renamed from: h, reason: collision with root package name */
    public final C0867w f8764h;

    /* renamed from: i, reason: collision with root package name */
    public final N3.f f8765i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0438v f8766j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0834J f8767k;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0750L f8761d = null;
    public e4.S f = e4.S.f6666a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8763g = true;

    public C0833I(C0834J c0834j) {
        this.f8767k = c0834j;
        this.f8758a = c0834j.l();
        this.f8759b = c0834j.i();
        this.f8760c = c0834j.b();
        this.f8762e = c0834j.i0();
        this.f8764h = c0834j.f8784w;
        this.f8765i = c0834j.getName();
        this.f8766j = c0834j.d();
    }

    public static /* synthetic */ void a(int i5) {
        String str = (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 5 || i5 == 7 || i5 == 9 || i5 == 11 || i5 == 19 || i5 == 13 || i5 == 14 || i5 == 16 || i5 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 1 || i5 == 2 || i5 == 3 || i5 == 5 || i5 == 7 || i5 == 9 || i5 == 11 || i5 == 19 || i5 == 13 || i5 == 14 || i5 == 16 || i5 == 17) ? 2 : 3];
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i5 == 1) {
            objArr[1] = "setOwner";
        } else if (i5 == 2) {
            objArr[1] = "setOriginal";
        } else if (i5 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i5 == 5) {
            objArr[1] = "setReturnType";
        } else if (i5 == 7) {
            objArr[1] = "setModality";
        } else if (i5 == 9) {
            objArr[1] = "setVisibility";
        } else if (i5 == 11) {
            objArr[1] = "setKind";
        } else if (i5 == 19) {
            objArr[1] = "setName";
        } else if (i5 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i5 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i5 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i5 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 5 && i5 != 7 && i5 != 9 && i5 != 11 && i5 != 19 && i5 != 13 && i5 != 14 && i5 != 16 && i5 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a3.a, b3.k] */
    public final C0834J b() {
        C0867w c0867w;
        C0867w c0867w2;
        C0835K c0835k;
        C0836L c0836l;
        ?? r02;
        C0867w c0867w3;
        C0867w c0867w4;
        C0834J c0834j = this.f8767k;
        c0834j.getClass();
        InterfaceC0766j interfaceC0766j = this.f8758a;
        int i5 = this.f8759b;
        C0770n c0770n = this.f8760c;
        InterfaceC0750L interfaceC0750L = this.f8761d;
        int i6 = this.f8762e;
        C0753O c0753o = InterfaceC0752N.f8400b;
        C0834J c0834jQ0 = c0834j.Q0(interfaceC0766j, i5, c0770n, interfaceC0750L, i6, this.f8765i);
        List listU = c0834j.u();
        ArrayList arrayList = new ArrayList(((ArrayList) listU).size());
        V vU = AbstractC0420c.u(listU, this.f, c0834jQ0, arrayList);
        AbstractC0438v abstractC0438v = this.f8766j;
        AbstractC0438v abstractC0438vI = vU.i(3, abstractC0438v);
        if (abstractC0438vI != null) {
            AbstractC0438v abstractC0438vI2 = vU.i(2, abstractC0438v);
            if (abstractC0438vI2 != null) {
                c0834jQ0.U0(abstractC0438vI2);
            }
            C0867w c0867w5 = this.f8764h;
            if (c0867w5 != null) {
                C0867w c0867wC = c0867w5.c(vU);
                c0867w = c0867wC != null ? c0867wC : null;
            }
            C0867w c0867w6 = c0834j.f8785x;
            if (c0867w6 != null) {
                AbstractC0438v abstractC0438vI3 = vU.i(2, c0867w6.d());
                if (abstractC0438vI3 == null) {
                    c0867w4 = null;
                } else {
                    c0867w6.O0();
                    c0867w4 = new C0867w(c0834jQ0, new Y3.b(c0834jQ0, abstractC0438vI3), c0867w6.s());
                }
                c0867w2 = c0867w4;
            } else {
                c0867w2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C0867w c0867w7 : c0834j.f8783v) {
                AbstractC0438v abstractC0438vI4 = vU.i(2, c0867w7.d());
                if (abstractC0438vI4 == null) {
                    c0867w3 = null;
                } else {
                    N3.f fVarM0 = ((Y3.a) c0867w7.O0()).M0();
                    c0867w7.O0();
                    c0867w3 = new C0867w(c0834jQ0, new Y3.a(c0834jQ0, abstractC0438vI4, fVarM0), c0867w7.s());
                }
                if (c0867w3 != null) {
                    arrayList2.add(c0867w3);
                }
            }
            c0834jQ0.V0(abstractC0438vI, arrayList, c0867w, c0867w2, arrayList2);
            C0835K c0835k2 = c0834j.f8787z;
            if (c0835k2 == null) {
                c0835k = null;
            } else {
                InterfaceC0798h interfaceC0798hS = c0835k2.s();
                int i7 = this.f8759b;
                C0770n c0770nB = c0834j.f8787z.b();
                if (this.f8762e == 2 && AbstractC0771o.e(AbstractC0771o.f(c0770nB.f8417a.c()))) {
                    c0770nB = AbstractC0771o.f8425h;
                }
                C0770n c0770n2 = c0770nB;
                C0835K c0835k3 = c0834j.f8787z;
                boolean z4 = c0835k3.f8751h;
                int i8 = this.f8762e;
                InterfaceC0750L interfaceC0750L2 = this.f8761d;
                c0835k = new C0835K(c0834jQ0, interfaceC0798hS, i7, c0770n2, z4, c0835k3.f8752i, c0835k3.f8755l, i8, interfaceC0750L2 == null ? null : interfaceC0750L2.f(), c0753o);
            }
            if (c0835k != null) {
                C0835K c0835k4 = c0834j.f8787z;
                AbstractC0438v abstractC0438v2 = c0835k4.f8788p;
                c0835k.f8757o = C0834J.R0(vU, c0835k4);
                c0835k.R0(abstractC0438v2 != null ? vU.i(3, abstractC0438v2) : null);
            }
            C0836L c0836l2 = c0834j.f8768A;
            if (c0836l2 == null) {
                c0836l = null;
            } else {
                InterfaceC0798h interfaceC0798hS2 = c0836l2.s();
                int i9 = this.f8759b;
                C0770n c0770nB2 = c0834j.f8768A.b();
                if (this.f8762e == 2 && AbstractC0771o.e(AbstractC0771o.f(c0770nB2.f8417a.c()))) {
                    c0770nB2 = AbstractC0771o.f8425h;
                }
                C0770n c0770n3 = c0770nB2;
                C0836L c0836l3 = c0834j.f8768A;
                boolean z5 = c0836l3.f8751h;
                int i10 = this.f8762e;
                InterfaceC0750L interfaceC0750L3 = this.f8761d;
                c0836l = new C0836L(c0834jQ0, interfaceC0798hS2, i9, c0770n3, z5, c0836l3.f8752i, c0836l3.f8755l, i10, interfaceC0750L3 == null ? null : interfaceC0750L3.e(), c0753o);
            }
            if (c0836l != null) {
                List listS0 = AbstractC0866v.S0(c0836l, c0834j.f8768A.v0(), vU, false, false, null);
                if (listS0 == null) {
                    listS0 = Collections.singletonList(C0836L.Q0(c0836l, U3.f.e(this.f8758a).m(), ((C0843T) c0834j.f8768A.v0().get(0)).s()));
                }
                if (listS0.size() != 1) {
                    throw new IllegalStateException();
                }
                c0836l.f8757o = C0834J.R0(vU, c0834j.f8768A);
                C0843T c0843t = (C0843T) listS0.get(0);
                if (c0843t == null) {
                    C0836L.H0(6);
                    throw null;
                }
                c0836l.f8790p = c0843t;
            }
            C0864t c0864t = c0834j.f8769B;
            C0864t c0864t2 = c0864t == null ? null : new C0864t(c0864t.s(), c0834jQ0);
            C0864t c0864t3 = c0834j.f8770C;
            c0834jQ0.S0(c0835k, c0836l, c0864t2, c0864t3 != null ? new C0864t(c0864t3.s(), c0834jQ0) : null);
            if (this.f8763g) {
                n4.h hVar = new n4.h();
                Iterator it = c0834j.p().iterator();
                while (it.hasNext()) {
                    hVar.add(((InterfaceC0750L) it.next()).c(vU));
                }
                c0834jQ0.n = hVar;
            }
            if (!c0834j.P() || (r02 = c0834j.f8773k) == 0) {
                return c0834jQ0;
            }
            c0834jQ0.T0(c0834j.f8772j, r02);
            return c0834jQ0;
        }
        return null;
    }
}
