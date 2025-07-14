package A3;

import F3.s;
import P2.u;
import Q3.q;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.X;
import java.util.ArrayList;
import m3.AbstractC0695h;
import m3.m;
import m3.r;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0757a;
import p3.InterfaceC0766j;
import q3.C0797g;
import q3.C0799i;
import q3.InterfaceC0798h;
import s3.C0834J;
import s3.C0835K;
import s3.C0836L;
import s3.C0843T;
import s3.C0867w;
import y3.x;

/* loaded from: classes.dex */
public class h extends C0834J implements a {

    /* renamed from: D, reason: collision with root package name */
    public final boolean f84D;
    public final O2.f E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, int i5, C0770n c0770n, boolean z4, N3.f fVar, InterfaceC0752N interfaceC0752N, InterfaceC0750L interfaceC0750L, int i6, boolean z5, O2.f fVar2) {
        super(interfaceC0766j, interfaceC0750L, interfaceC0798h, i5, c0770n, z4, fVar, i6, interfaceC0752N, false, false, false, false, false);
        if (interfaceC0766j == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (i5 == 0) {
            H0(2);
            throw null;
        }
        if (c0770n == null) {
            H0(3);
            throw null;
        }
        if (fVar == null) {
            H0(4);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(5);
            throw null;
        }
        if (i6 == 0) {
            H0(6);
            throw null;
        }
        this.f84D = z5;
        this.E = fVar2;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = i5 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 21 ? 3 : 2];
        switch (i5) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i5 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static h W0(InterfaceC0766j interfaceC0766j, B3.e eVar, C0770n c0770n, boolean z4, N3.f fVar, u3.g gVar, boolean z5) {
        if (interfaceC0766j == null) {
            H0(7);
            throw null;
        }
        if (fVar != null) {
            return new h(interfaceC0766j, eVar, 1, c0770n, z4, fVar, gVar, null, 1, z5, null);
        }
        H0(11);
        throw null;
    }

    @Override // s3.C0834J, p3.InterfaceC0758b
    public final Object B0(InterfaceC0757a interfaceC0757a) {
        O2.f fVar = this.E;
        if (fVar == null || !((InterfaceC0757a) fVar.f2006d).equals(interfaceC0757a)) {
            return null;
        }
        return fVar.f2007e;
    }

    @Override // s3.C0834J, p3.U
    public final boolean P() {
        AbstractC0438v abstractC0438vD = d();
        if (this.f84D) {
            AbstractC0219i.e("type", abstractC0438vD);
            if (((AbstractC0695h.E(abstractC0438vD) || r.a(abstractC0438vD)) && !X.e(abstractC0438vD)) || AbstractC0695h.C(abstractC0438vD, m.f)) {
                C0799i c0799i = s.f672a;
                N3.c cVar = x.f9454p;
                AbstractC0219i.d("ENHANCED_NULLABILITY_ANNOTATION", cVar);
                if (!f4.g.u(abstractC0438vD, cVar) || AbstractC0695h.C(abstractC0438vD, m.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s3.C0834J
    public final C0834J Q0(InterfaceC0766j interfaceC0766j, int i5, C0770n c0770n, InterfaceC0750L interfaceC0750L, int i6, N3.f fVar) {
        C0753O c0753o = InterfaceC0752N.f8400b;
        if (interfaceC0766j == null) {
            H0(13);
            throw null;
        }
        if (i5 == 0) {
            H0(14);
            throw null;
        }
        if (c0770n == null) {
            H0(15);
            throw null;
        }
        if (i6 == 0) {
            H0(16);
            throw null;
        }
        if (fVar == null) {
            H0(17);
            throw null;
        }
        return new h(interfaceC0766j, s(), i5, c0770n, this.f8771i, fVar, c0753o, interfaceC0750L, i6, this.f84D, this.E);
    }

    @Override // s3.C0834J
    public final void U0(AbstractC0438v abstractC0438v) {
    }

    @Override // s3.AbstractC0844U, p3.InterfaceC0758b
    public final boolean o0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [a3.a, b3.k] */
    @Override // A3.a
    public final a t0(AbstractC0438v abstractC0438v, ArrayList arrayList, AbstractC0438v abstractC0438v2, O2.f fVar) {
        C0835K c0835k;
        C0867w c0867w;
        C0836L c0836l;
        InterfaceC0750L interfaceC0750LA = a() == this ? null : a();
        h hVar = new h(l(), s(), i(), b(), this.f8771i, getName(), n(), interfaceC0750LA, i0(), this.f84D, fVar);
        C0835K c0835k2 = this.f8787z;
        if (c0835k2 != null) {
            c0835k = c0835k;
            C0835K c0835k3 = new C0835K(hVar, c0835k2.s(), c0835k2.i(), c0835k2.b(), c0835k2.f8751h, c0835k2.f8752i, c0835k2.f8755l, i0(), interfaceC0750LA == null ? null : interfaceC0750LA.f(), c0835k2.n());
            c0835k.f8757o = c0835k2.f8757o;
            c0835k.f8788p = abstractC0438v2;
        } else {
            c0835k = null;
        }
        C0836L c0836l2 = this.f8768A;
        if (c0836l2 != null) {
            c0836l = c0836l;
            C0836L c0836l3 = new C0836L(hVar, c0836l2.s(), c0836l2.i(), c0836l2.b(), c0836l2.f8751h, c0836l2.f8752i, c0836l2.f8755l, i0(), interfaceC0750LA == null ? null : interfaceC0750LA.e(), c0836l2.n());
            c0836l.f8757o = c0836l.f8757o;
            C0843T c0843t = (C0843T) c0836l2.v0().get(0);
            if (c0843t == null) {
                C0836L.H0(6);
                throw null;
            }
            c0836l.f8790p = c0843t;
            c0867w = null;
        } else {
            c0867w = null;
            c0836l = null;
        }
        hVar.S0(c0835k, c0836l, this.f8769B, this.f8770C);
        ?? r22 = this.f8773k;
        if (r22 != 0) {
            hVar.T0(this.f8772j, r22);
        }
        hVar.M(p());
        hVar.V0(abstractC0438v2, u(), this.f8784w, abstractC0438v == null ? c0867w : q.k(this, abstractC0438v, C0797g.f8481a), u.f2163d);
        return hVar;
    }
}
