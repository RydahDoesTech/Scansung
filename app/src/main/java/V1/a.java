package V1;

import C3.C0012d;
import C3.H;
import I3.G;
import O1.t;
import O3.C0077i;
import O3.C0083o;
import P2.m;
import P2.u;
import P2.x;
import X3.k;
import X3.n;
import X3.p;
import a2.C0104b;
import a2.l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.AbstractC0219i;
import com.google.android.gms.common.api.Status;
import com.idm.providers.mo.IDMMoInterface;
import e1.AbstractC0415a;
import e4.AbstractC0420c;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.E;
import e4.J;
import e4.N;
import e4.O;
import e4.Z;
import f3.C0446b;
import f3.C0447c;
import g3.InterfaceC0466p;
import g3.y;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k3.C0670b;
import m3.AbstractC0695h;
import n3.C0698c;
import n3.C0702g;
import p.C0735c;
import p3.AbstractC0771o;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0758b;
import p3.InterfaceC0761e;
import p3.InterfaceC0762f;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;
import s3.C0837M;
import s3.C0843T;
import s3.C0867w;
import v3.o;
import z.AbstractC0941d;

/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Collection A(p pVar, X3.f fVar, int i5) {
        if ((i5 & 1) != 0) {
            fVar = X3.f.f2770m;
        }
        n.f2792a.getClass();
        return pVar.d(fVar, k.f2786e);
    }

    public static Drawable C(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        Drawable drawableR;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (drawableR = AbstractC0415a.r(context, resourceId)) == null) ? typedArray.getDrawable(i5) : drawableR;
    }

    public static final H J(InterfaceC0761e interfaceC0761e) {
        InterfaceC0761e interfaceC0761e2;
        InterfaceC0763g interfaceC0763gI;
        AbstractC0219i.e("<this>", interfaceC0761e);
        int i5 = U3.f.f2570a;
        Iterator it = interfaceC0761e.q().I0().j().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC0761e2 = null;
                break;
            }
            AbstractC0438v abstractC0438v = (AbstractC0438v) it.next();
            if (!AbstractC0695h.w(abstractC0438v)) {
                interfaceC0763gI = abstractC0438v.I0().i();
                if (Q3.f.o(interfaceC0763gI, 1) || Q3.f.o(interfaceC0763gI, 3)) {
                    break;
                }
            }
        }
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC0763gI);
        interfaceC0761e2 = (InterfaceC0761e) interfaceC0763gI;
        if (interfaceC0761e2 == null) {
            return null;
        }
        n nVarW = interfaceC0761e2.W();
        H h3 = nVarW instanceof H ? (H) nVarW : null;
        return h3 == null ? J(interfaceC0761e2) : h3;
    }

    public static final int K(int i5, int i6, int i7) {
        if (i7 > 0) {
            if (i5 >= i6) {
                return i6;
            }
            int i8 = i6 % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i5 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i6 - i10;
        }
        if (i7 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i5 <= i6) {
            return i6;
        }
        int i11 = -i7;
        int i12 = i5 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        int i13 = i6 % i11;
        if (i13 < 0) {
            i13 += i11;
        }
        int i14 = (i12 - i13) % i11;
        if (i14 < 0) {
            i14 += i11;
        }
        return i6 + i14;
    }

    public static final G3.p L(G g5, K3.f fVar, K3.g gVar, boolean z4, boolean z5, boolean z6) {
        AbstractC0219i.e("proto", g5);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        C0083o c0083o = L3.k.f1799d;
        AbstractC0219i.d("propertySignature", c0083o);
        L3.e eVar = (L3.e) AbstractC0415a.s(g5, c0083o);
        if (eVar == null) {
            return null;
        }
        if (z4) {
            C0077i c0077i = M3.h.f1826a;
            M3.d dVarB = M3.h.b(g5, fVar, gVar, z6);
            if (dVarB == null) {
                return null;
            }
            return y.r(dVarB);
        }
        if (!z5 || (eVar.f1758e & 2) != 2) {
            return null;
        }
        L3.c cVar = eVar.f1759g;
        AbstractC0219i.d("signature.syntheticMethod", cVar);
        return new G3.p(fVar.s(cVar.f).concat(fVar.s(cVar.f1748g)));
    }

    public static final AbstractC0438v N(InterfaceC0755Q interfaceC0755Q) {
        Object obj;
        List upperBounds = interfaceC0755Q.getUpperBounds();
        AbstractC0219i.d("upperBounds", upperBounds);
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC0755Q.getUpperBounds();
        AbstractC0219i.d("upperBounds", upperBounds2);
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC0763g interfaceC0763gI = ((AbstractC0438v) next).I0().i();
            InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
            if (interfaceC0761e != null && interfaceC0761e.L() != 2 && interfaceC0761e.L() != 5) {
                obj = next;
                break;
            }
        }
        AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
        if (abstractC0438v != null) {
            return abstractC0438v;
        }
        List upperBounds3 = interfaceC0755Q.getUpperBounds();
        AbstractC0219i.d("upperBounds", upperBounds3);
        Object objU0 = m.u0(upperBounds3);
        AbstractC0219i.d("upperBounds.first()", objU0);
        return (AbstractC0438v) objU0;
    }

    public static String P() throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("com.samsung.sesl.feature.SemCscFeature", "hidden_getString", String.class, String.class);
        Object objE = methodS != null ? J2.b.E(null, methodS, "CscFeature_Calendar_SetColorOfDays", "XXXXXXR") : null;
        return objE instanceof String ? (String) objE : "XXXXXXR";
    }

    public static final Object Q(d4.m mVar, InterfaceC0466p interfaceC0466p) {
        AbstractC0219i.e("<this>", mVar);
        AbstractC0219i.e("p", interfaceC0466p);
        return mVar.a();
    }

    public static boolean T(InterfaceC0798h interfaceC0798h, N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return interfaceC0798h.h(cVar) != null;
    }

    public static final boolean U(InterfaceC0755Q interfaceC0755Q, J j5, Set set) {
        AbstractC0219i.e("typeParameter", interfaceC0755Q);
        List<AbstractC0438v> upperBounds = interfaceC0755Q.getUpperBounds();
        AbstractC0219i.d("typeParameter.upperBounds", upperBounds);
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC0438v abstractC0438v : upperBounds) {
            AbstractC0219i.d("upperBound", abstractC0438v);
            if (l(abstractC0438v, interfaceC0755Q.q().I0(), set) && (j5 == null || AbstractC0219i.a(abstractC0438v.I0(), j5))) {
                return true;
            }
        }
        return false;
    }

    public static String V(k4.e eVar, A3.g gVar) {
        if (eVar.a(gVar)) {
            return null;
        }
        return eVar.b();
    }

    public static boolean W(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean Y(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean Z(MotionEvent motionEvent, int i5) {
        return (motionEvent.getSource() & i5) == i5;
    }

    public static final O a(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        return new O(1, abstractC0438v);
    }

    public static B3.g g(B3.g gVar, InterfaceC0762f interfaceC0762f, o oVar, int i5) {
        if ((i5 & 2) != 0) {
            oVar = null;
        }
        AbstractC0219i.e("<this>", gVar);
        return new B3.g((B3.b) gVar.f255e, oVar != null ? new B3.h(gVar, interfaceC0762f, oVar, 0) : (B3.i) gVar.f, y.M(3, new B3.a(gVar, 0, interfaceC0762f)));
    }

    public static J3.a i0(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C0447c c0447c = new C0447c(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(P2.o.l0(c0447c));
        Iterator it = c0447c.iterator();
        while (((C0446b) it).f) {
            ((C0446b) it).a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        Iterator it2 = arrayList.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            iArr[i5] = ((Number) it2.next()).intValue();
            i5++;
        }
        return new J3.a(Arrays.copyOf(iArr, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(p3.InterfaceC0776t r5, int r6) {
        /*
            r0 = 1
            r1 = r6 & 1
            r2 = 0
            if (r1 == 0) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r2
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            java.lang.String r6 = "<this>"
            b3.AbstractC0219i.e(r6, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r0 == 0) goto L35
            boolean r0 = r5 instanceof p3.InterfaceC0765i
            if (r0 == 0) goto L22
            java.lang.String r0 = "<init>"
            goto L32
        L22:
            r0 = r5
            s3.o r0 = (s3.AbstractC0859o) r0
            N3.f r0 = r0.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "name.asString()"
            b3.AbstractC0219i.d(r2, r0)
        L32:
            r6.append(r0)
        L35:
            java.lang.String r0 = "("
            r6.append(r0)
            s3.w r0 = r5.b0()
            n4.c r2 = n4.c.f8189d
            if (r0 == 0) goto L56
            e4.v r0 = r0.d()
            java.lang.String r3 = "it.type"
            b3.AbstractC0219i.d(r3, r0)
            G3.r r3 = G3.r.f775k
            java.lang.Object r0 = Y0.j.C(r0, r3, r2)
            G3.l r0 = (G3.l) r0
            r6.append(r0)
        L56:
            java.util.List r0 = r5.v0()
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r0.next()
            s3.T r3 = (s3.C0843T) r3
            s3.U r3 = (s3.AbstractC0844U) r3
            e4.v r3 = r3.d()
            java.lang.String r4 = "parameter.type"
            b3.AbstractC0219i.d(r4, r3)
            G3.r r4 = G3.r.f775k
            java.lang.Object r3 = Y0.j.C(r3, r4, r2)
            G3.l r3 = (G3.l) r3
            r6.append(r3)
            goto L5e
        L81:
            java.lang.String r0 = ")"
            r6.append(r0)
            if (r1 == 0) goto Lc7
            boolean r0 = r5 instanceof p3.InterfaceC0765i
            if (r0 == 0) goto L8d
            goto Laf
        L8d:
            e4.v r0 = r5.o()
            b3.AbstractC0219i.b(r0)
            N3.f r1 = m3.AbstractC0695h.f8064e
            N3.e r1 = m3.m.f8121d
            boolean r0 = m3.AbstractC0695h.C(r0, r1)
            if (r0 == 0) goto Lb5
            e4.v r0 = r5.o()
            b3.AbstractC0219i.b(r0)
            boolean r0 = e4.X.e(r0)
            if (r0 != 0) goto Lb5
            boolean r0 = r5 instanceof s3.C0835K
            if (r0 != 0) goto Lb5
        Laf:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lc7
        Lb5:
            e4.v r5 = r5.o()
            b3.AbstractC0219i.b(r5)
            G3.r r0 = G3.r.f775k
            java.lang.Object r5 = Y0.j.C(r5, r0, r2)
            G3.l r5 = (G3.l) r5
            r6.append(r5)
        Lc7:
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            b3.AbstractC0219i.d(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.j(p3.t, int):java.lang.String");
    }

    public static final AbstractC0438v j0(AbstractC0438v abstractC0438v, InterfaceC0798h interfaceC0798h) {
        return (abstractC0438v.s().isEmpty() && interfaceC0798h.isEmpty()) ? abstractC0438v : abstractC0438v.L0().O0(AbstractC0420c.q(abstractC0438v.H0(), interfaceC0798h));
    }

    public static final String k(InterfaceC0758b interfaceC0758b) {
        AbstractC0219i.e("<this>", interfaceC0758b);
        if (Q3.f.p(interfaceC0758b)) {
            return null;
        }
        InterfaceC0766j interfaceC0766jL = interfaceC0758b.l();
        InterfaceC0761e interfaceC0761e = interfaceC0766jL instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766jL : null;
        if (interfaceC0761e == null || interfaceC0761e.getName().f1843e) {
            return null;
        }
        InterfaceC0758b interfaceC0758bA = interfaceC0758b.a();
        C0837M c0837m = interfaceC0758bA instanceof C0837M ? (C0837M) interfaceC0758bA : null;
        if (c0837m == null) {
            return null;
        }
        return J2.b.Z(interfaceC0761e, j(c0837m, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [e4.Z] */
    public static final Z k0(AbstractC0438v abstractC0438v) {
        AbstractC0442z abstractC0442zP;
        AbstractC0219i.e("<this>", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        if (zL0 instanceof AbstractC0434q) {
            AbstractC0434q abstractC0434q = (AbstractC0434q) zL0;
            AbstractC0442z abstractC0442zP2 = abstractC0434q.f6693e;
            if (!abstractC0442zP2.I0().k().isEmpty() && abstractC0442zP2.I0().i() != null) {
                List listK = abstractC0442zP2.I0().k();
                AbstractC0219i.d("constructor.parameters", listK);
                ArrayList arrayList = new ArrayList(P2.o.l0(listK));
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(new E((InterfaceC0755Q) it.next()));
                }
                abstractC0442zP2 = AbstractC0420c.p(abstractC0442zP2, arrayList, null, 2);
            }
            AbstractC0442z abstractC0442zP3 = abstractC0434q.f;
            if (!abstractC0442zP3.I0().k().isEmpty() && abstractC0442zP3.I0().i() != null) {
                List listK2 = abstractC0442zP3.I0().k();
                AbstractC0219i.d("constructor.parameters", listK2);
                ArrayList arrayList2 = new ArrayList(P2.o.l0(listK2));
                Iterator it2 = listK2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new E((InterfaceC0755Q) it2.next()));
                }
                abstractC0442zP3 = AbstractC0420c.p(abstractC0442zP3, arrayList2, null, 2);
            }
            abstractC0442zP = C0421d.j(abstractC0442zP2, abstractC0442zP3);
        } else {
            if (!(zL0 instanceof AbstractC0442z)) {
                throw new O2.d();
            }
            AbstractC0442z abstractC0442z = (AbstractC0442z) zL0;
            boolean zIsEmpty = abstractC0442z.I0().k().isEmpty();
            abstractC0442zP = abstractC0442z;
            if (!zIsEmpty) {
                InterfaceC0763g interfaceC0763gI = abstractC0442z.I0().i();
                abstractC0442zP = abstractC0442z;
                if (interfaceC0763gI != null) {
                    List listK3 = abstractC0442z.I0().k();
                    AbstractC0219i.d("constructor.parameters", listK3);
                    ArrayList arrayList3 = new ArrayList(P2.o.l0(listK3));
                    Iterator it3 = listK3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new E((InterfaceC0755Q) it3.next()));
                    }
                    abstractC0442zP = AbstractC0420c.p(abstractC0442z, arrayList3, null, 2);
                }
            }
        }
        return AbstractC0420c.g(abstractC0442zP, zL0);
    }

    public static final boolean l(AbstractC0438v abstractC0438v, J j5, Set set) {
        boolean zL;
        if (AbstractC0219i.a(abstractC0438v.I0(), j5)) {
            return true;
        }
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        InterfaceC0764h interfaceC0764h = interfaceC0763gI instanceof InterfaceC0764h ? (InterfaceC0764h) interfaceC0763gI : null;
        List listR = interfaceC0764h != null ? interfaceC0764h.r() : null;
        Iterable iterableS0 = m.S0(abstractC0438v.s0());
        if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
            Iterator it = iterableS0.iterator();
            do {
                P2.y yVar = (P2.y) it;
                if (yVar.f2169e.hasNext()) {
                    x xVar = (x) yVar.next();
                    int i5 = xVar.f2166a;
                    N n = (N) xVar.f2167b;
                    InterfaceC0755Q interfaceC0755Q = listR != null ? (InterfaceC0755Q) m.x0(i5, listR) : null;
                    if ((interfaceC0755Q == null || set == null || !set.contains(interfaceC0755Q)) && !n.c()) {
                        AbstractC0438v abstractC0438vB = n.b();
                        AbstractC0219i.d("argument.type", abstractC0438vB);
                        zL = l(abstractC0438vB, j5, set);
                    } else {
                        zL = false;
                    }
                }
            } while (!zL);
            return true;
        }
        return false;
    }

    public static Set l0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC0219i.d("singleton(element)", setSingleton);
        return setSingleton;
    }

    public static float m(float f) {
        return (((((((int) (f / 2.5f)) * 2.5f) - 270.0f) + 360.0f) % 360.0f) * 1440.0f) / 360.0f;
    }

    public static final ArrayList n(List list, List list2, InterfaceC0776t interfaceC0776t) {
        AbstractC0219i.e("oldValueParameters", list2);
        list.size();
        list2.size();
        ArrayList arrayListT0 = m.T0(list, list2);
        ArrayList arrayList = new ArrayList(P2.o.l0(arrayListT0));
        Iterator it = arrayListT0.iterator();
        while (it.hasNext()) {
            O2.f fVar = (O2.f) it.next();
            AbstractC0438v abstractC0438v = (AbstractC0438v) fVar.f2006d;
            C0843T c0843t = (C0843T) fVar.f2007e;
            int i5 = c0843t.f8800i;
            InterfaceC0798h interfaceC0798hS = c0843t.s();
            N3.f name = c0843t.getName();
            AbstractC0219i.d("oldParameter.name", name);
            boolean zP0 = c0843t.P0();
            AbstractC0438v abstractC0438vF = c0843t.f8804m != null ? U3.f.j(interfaceC0776t).g().f(abstractC0438v) : null;
            InterfaceC0752N interfaceC0752NN = c0843t.n();
            AbstractC0219i.d("oldParameter.source", interfaceC0752NN);
            arrayList.add(new C0843T(interfaceC0776t, null, i5, interfaceC0798hS, name, abstractC0438v, zP0, c0843t.f8802k, c0843t.f8803l, abstractC0438vF, interfaceC0752NN));
        }
        return arrayList;
    }

    public static D3.a n0(int i5, boolean z4, boolean z5, C3.J j5, int i6) {
        boolean z6 = (i6 & 1) != 0 ? false : z4;
        boolean z7 = (i6 & 2) != 0 ? false : z5;
        if ((i6 & 4) != 0) {
            j5 = null;
        }
        A3.f.q(i5, "<this>");
        return new D3.a(i5, z7, z6, j5 != null ? l0(j5) : null, 34);
    }

    public static final B3.g o(B3.g gVar, InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("<this>", gVar);
        AbstractC0219i.e("additionalAnnotations", interfaceC0798h);
        if (interfaceC0798h.isEmpty()) {
            return gVar;
        }
        return new B3.g((B3.b) gVar.f255e, (B3.i) gVar.f, y.M(3, new B3.a(gVar, 1, interfaceC0798h)));
    }

    public static androidx.emoji2.text.o p(Context context) {
        ProviderInfo providerInfo;
        B3.g gVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        y.h("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            gVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                gVar = new B3.g(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
            }
        }
        if (gVar == null) {
            return null;
        }
        return new androidx.emoji2.text.o(new androidx.emoji2.text.n(context, gVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b4.c q(N3.c r8, d4.o r9, p3.InterfaceC0781y r10, java.io.InputStream r11) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = "fqName"
            b3.AbstractC0219i.e(r0, r8)
            java.lang.String r0 = "storageManager"
            b3.AbstractC0219i.e(r0, r9)
            java.lang.String r0 = "module"
            b3.AbstractC0219i.e(r0, r10)
            J3.a r0 = J3.a.f     // Catch: java.lang.Throwable -> L6f
            J3.a r6 = i0(r11)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "ourVersion"
            J3.a r1 = J3.a.f     // Catch: java.lang.Throwable -> L6f
            b3.AbstractC0219i.e(r0, r1)     // Catch: java.lang.Throwable -> L6f
            int r0 = r6.f1654c     // Catch: java.lang.Throwable -> L6f
            int r2 = r1.f1654c     // Catch: java.lang.Throwable -> L6f
            int r3 = r1.f1653b     // Catch: java.lang.Throwable -> L6f
            int r4 = r6.f1653b     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            r7 = 1
            if (r4 != 0) goto L2f
            if (r3 != 0) goto L2d
            if (r0 != r2) goto L2d
            goto L33
        L2d:
            r7 = r5
            goto L33
        L2f:
            if (r4 != r3) goto L2d
            if (r0 > r2) goto L2d
        L33:
            if (r7 == 0) goto L71
            O3.i r0 = new O3.i     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            J3.b.a(r0)     // Catch: java.lang.Throwable -> L6f
            I3.a r2 = I3.E.n     // Catch: java.lang.Throwable -> L6f
            r2.getClass()     // Catch: java.lang.Throwable -> L6f
            O3.f r3 = new O3.f     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L6f
            O3.b r0 = (O3.AbstractC0070b) r0     // Catch: java.lang.Throwable -> L6f
            r3.a(r5)     // Catch: O3.C0086s -> L6b java.lang.Throwable -> L6f
            boolean r2 = r0.b()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L5a
            I3.E r0 = (I3.E) r0     // Catch: java.lang.Throwable -> L6f
        L58:
            r5 = r0
            goto L73
        L5a:
            O2.d r8 = new O2.d     // Catch: java.lang.Throwable -> L6f
            r8.<init>()     // Catch: java.lang.Throwable -> L6f
            O3.s r9 = new O3.s     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L6f
            r9.f2092d = r0     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        L6b:
            r8 = move-exception
            r8.f2092d = r0     // Catch: java.lang.Throwable -> L6f
            throw r8     // Catch: java.lang.Throwable -> L6f
        L6f:
            r8 = move-exception
            goto La3
        L71:
            r0 = 0
            goto L58
        L73:
            r11.close()
            if (r5 == 0) goto L82
            b4.c r11 = new b4.c
            r1 = r11
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        L82:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Kotlin built-in definition format version is not supported: expected "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r10 = ", actual "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = ". Please update Kotlin"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La3:
            throw r8     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            r11.close()     // Catch: java.lang.Throwable -> La9
            goto Lbb
        La9:
            r10 = move-exception
            java.lang.String r11 = "<this>"
            b3.AbstractC0219i.e(r11, r8)
            java.lang.String r11 = "exception"
            b3.AbstractC0219i.e(r11, r10)
            if (r8 == r10) goto Lbb
            V2.b r11 = V2.c.f2624a
            r11.a(r8, r10)
        Lbb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.q(N3.c, d4.o, p3.y, java.io.InputStream):b4.c");
    }

    public static Status q0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? r0((String) listAsList.get(0), (String) listAsList.get(1)) : r0((String) listAsList.get(0), null);
    }

    public static C0702g r(C0698c c0698c, boolean z4) {
        String lowerCase;
        AbstractC0219i.e("functionClass", c0698c);
        C0702g c0702g = new C0702g(c0698c, null, 1, z4);
        C0867w c0867wG0 = c0698c.G0();
        u uVar = u.f2163d;
        ArrayList arrayList = new ArrayList();
        List list = c0698c.n;
        for (Object obj : list) {
            if (((InterfaceC0755Q) obj).B() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        P2.k kVarS0 = m.S0(arrayList);
        ArrayList arrayList2 = new ArrayList(P2.o.l0(kVarS0));
        Iterator it = kVarS0.iterator();
        while (true) {
            P2.y yVar = (P2.y) it;
            if (!yVar.f2169e.hasNext()) {
                c0702g.T0(null, c0867wG0, uVar, uVar, arrayList2, ((InterfaceC0755Q) m.C0(list)).q(), 4, AbstractC0771o.f8423e);
                c0702g.f8894z = true;
                return c0702g;
            }
            x xVar = (x) yVar.next();
            int i5 = xVar.f2166a;
            InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) xVar.f2167b;
            String strB = interfaceC0755Q.getName().b();
            AbstractC0219i.d("typeParameter.name.asString()", strB);
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                AbstractC0219i.d("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
            }
            C0796f c0796f = C0797g.f8481a;
            N3.f fVarE = N3.f.e(lowerCase);
            AbstractC0442z abstractC0442zQ = interfaceC0755Q.q();
            AbstractC0219i.d("typeParameter.defaultType", abstractC0442zQ);
            C0867w c0867w = c0867wG0;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new C0843T(c0702g, null, i5, c0796f, fVarE, abstractC0442zQ, false, false, false, null, InterfaceC0752N.f8400b));
            arrayList2 = arrayList3;
            c0867wG0 = c0867w;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.api.Status r0(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.r0(java.lang.String, java.lang.String):com.google.android.gms.common.api.Status");
    }

    public static final Object s(Class cls, Map map, List list) throws IllegalArgumentException {
        AbstractC0219i.e("annotationClass", cls);
        AbstractC0219i.e("methods", list);
        O2.i iVar = new O2.i(new C0012d(24, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0670b(cls, map, new O2.i(new B3.a(cls, 10, map)), iVar, list));
        AbstractC0219i.c("null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance", objNewProxyInstance);
        return objNewProxyInstance;
    }

    public static final O t(AbstractC0438v abstractC0438v, int i5, InterfaceC0755Q interfaceC0755Q) {
        AbstractC0219i.e("type", abstractC0438v);
        A3.f.q(i5, "projectionKind");
        if ((interfaceC0755Q != null ? interfaceC0755Q.B() : 0) == i5) {
            i5 = 1;
        }
        return new O(i5, abstractC0438v);
    }

    public static void u(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i5 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a2.i iVar : (Set) it2.next()) {
                        for (a2.k kVar : iVar.f2998a.f2986b) {
                            if (kVar.f3005c == 0) {
                                Set<a2.i> set = (Set) map.get(new a2.j(kVar.f3003a, kVar.f3004b == 2));
                                if (set != null) {
                                    for (a2.i iVar2 : set) {
                                        iVar.f2999b.add(iVar2);
                                        iVar2.f3000c.add(iVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a2.i iVar3 = (a2.i) it4.next();
                    if (iVar3.f3000c.isEmpty()) {
                        hashSet2.add(iVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a2.i iVar4 = (a2.i) hashSet2.iterator().next();
                    hashSet2.remove(iVar4);
                    i5++;
                    Iterator it5 = iVar4.f2999b.iterator();
                    while (it5.hasNext()) {
                        a2.i iVar5 = (a2.i) it5.next();
                        iVar5.f3000c.remove(iVar4);
                        if (iVar5.f3000c.isEmpty()) {
                            hashSet2.add(iVar5);
                        }
                    }
                }
                if (i5 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    a2.i iVar6 = (a2.i) it6.next();
                    if (!iVar6.f3000c.isEmpty() && !iVar6.f2999b.isEmpty()) {
                        arrayList2.add(iVar6.f2998a);
                    }
                }
                throw new l("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C0104b c0104b = (C0104b) it.next();
            a2.i iVar7 = new a2.i(c0104b);
            for (Class cls : c0104b.f2985a) {
                boolean z4 = c0104b.f2988d == 0;
                a2.j jVar = new a2.j(cls, !z4);
                if (!map.containsKey(jVar)) {
                    map.put(jVar, new HashSet());
                }
                Set set2 = (Set) map.get(jVar);
                if (!set2.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + cls + IDMMoInterface.IDM_MO_ROOT_PATH);
                }
                set2.add(iVar7);
            }
        }
    }

    public static final void v(AbstractC0438v abstractC0438v, AbstractC0442z abstractC0442z, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (interfaceC0763gI instanceof InterfaceC0755Q) {
            if (!AbstractC0219i.a(abstractC0438v.I0(), abstractC0442z.I0())) {
                linkedHashSet.add(interfaceC0763gI);
                return;
            }
            for (AbstractC0438v abstractC0438v2 : ((InterfaceC0755Q) interfaceC0763gI).getUpperBounds()) {
                AbstractC0219i.d("upperBound", abstractC0438v2);
                v(abstractC0438v2, abstractC0442z, linkedHashSet, set);
            }
            return;
        }
        InterfaceC0763g interfaceC0763gI2 = abstractC0438v.I0().i();
        InterfaceC0764h interfaceC0764h = interfaceC0763gI2 instanceof InterfaceC0764h ? (InterfaceC0764h) interfaceC0763gI2 : null;
        List listR = interfaceC0764h != null ? interfaceC0764h.r() : null;
        int i5 = 0;
        for (N n : abstractC0438v.s0()) {
            int i6 = i5 + 1;
            InterfaceC0755Q interfaceC0755Q = listR != null ? (InterfaceC0755Q) m.x0(i5, listR) : null;
            if ((interfaceC0755Q == null || set == null || !set.contains(interfaceC0755Q)) && !n.c() && !m.q0(linkedHashSet, n.b().I0().i()) && !AbstractC0219i.a(n.b().I0(), abstractC0442z.I0())) {
                AbstractC0438v abstractC0438vB = n.b();
                AbstractC0219i.d("argument.type", abstractC0438vB);
                v(abstractC0438vB, abstractC0442z, linkedHashSet, set);
            }
            i5 = i6;
        }
    }

    public static InterfaceC0792b w(InterfaceC0798h interfaceC0798h, N3.c cVar) {
        Object next;
        AbstractC0219i.e("fqName", cVar);
        Iterator it = interfaceC0798h.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC0219i.a(((InterfaceC0792b) next).a(), cVar)) {
                break;
            }
        }
        return (InterfaceC0792b) next;
    }

    public static final AbstractC0695h x(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        AbstractC0695h abstractC0695hG = abstractC0438v.I0().g();
        AbstractC0219i.d("constructor.builtIns", abstractC0695hG);
        return abstractC0695hG;
    }

    public static ColorStateList y(Context context, D3.c cVar, int i5) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) cVar.f;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateListB = AbstractC0941d.b(context, resourceId)) == null) ? cVar.f(i5) : colorStateListB;
    }

    public static ColorStateList z(Context context, TypedArray typedArray, int i5) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateListB = AbstractC0941d.b(context, resourceId)) == null) ? typedArray.getColorStateList(i5) : colorStateListB;
    }

    public abstract void B(t tVar, float f, float f5);

    public abstract int D();

    public abstract int E();

    public abstract int F();

    public abstract int G();

    public abstract int H(View view);

    public abstract int I(CoordinatorLayout coordinatorLayout);

    public abstract int O();

    public int R(View view) {
        return 0;
    }

    public int S() {
        return 0;
    }

    public abstract boolean X(float f);

    public abstract boolean a0(View view);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean b0(float f, float f5);

    public abstract float c(int i5);

    public void c0(int i5, View view) {
    }

    public abstract boolean d(p.g gVar, C0735c c0735c);

    public abstract void d0(int i5);

    public abstract boolean e(p.g gVar, Object obj, Object obj2);

    public abstract void e0(View view, int i5, int i6);

    public abstract boolean f(p.g gVar, p.f fVar, p.f fVar2);

    public abstract void f0(View view, float f, float f5);

    public abstract void g0(p.f fVar, p.f fVar2);

    public abstract int h(int i5, View view);

    public abstract void h0(p.f fVar, Thread thread);

    public abstract int i(int i5, View view);

    public abstract boolean m0(View view, float f);

    public abstract boolean o0(int i5, View view);

    public abstract void p0(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6);
}
