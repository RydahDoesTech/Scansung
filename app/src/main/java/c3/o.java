package C3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SequencedCollection;
import p3.C0770n;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import q3.C0796f;
import q3.C0797g;
import r0.AbstractC0809c;
import s3.C0843T;
import s3.C0855k;
import v3.AbstractC0890B;
import v3.C0889A;
import v3.C0891C;

/* loaded from: classes.dex */
public final class o extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B3.g f426e;
    public final /* synthetic */ r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(B3.g gVar, r rVar) {
        super(0);
        this.f426e = gVar;
        this.f = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [A3.b, s3.k, s3.v] */
    /* JADX WARN: Type inference failed for: r1v21, types: [C3.r] */
    /* JADX WARN: Type inference failed for: r1v27, types: [C3.r] */
    /* JADX WARN: Type inference failed for: r7v4, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0106a
    public final Object a() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        r rVar;
        B3.g gVar;
        String str;
        String str2;
        ?? EmptyList;
        D3.c cVar;
        O2.f fVar;
        Object obj;
        List listC;
        switch (this.f425d) {
            case 0:
                r rVar2 = this.f;
                Constructor<?>[] declaredConstructors = rVar2.f431o.f9258a.getDeclaredConstructors();
                AbstractC0219i.d("klass.declaredConstructors", declaredConstructors);
                List listK0 = o4.m.k0(o4.m.i0(new o4.f(P2.i.j0(declaredConstructors), false, v3.j.f9253l), v3.k.f9254l));
                SequencedCollection arrayList = new ArrayList(listK0.size());
                Iterator it = listK0.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    B3.g gVar2 = rVar2.f357b;
                    InterfaceC0761e interfaceC0761e = rVar2.n;
                    if (!zHasNext) {
                        v3.o oVar = rVar2.f431o;
                        boolean zE = oVar.e();
                        C0796f c0796f = C0797g.f8481a;
                        B3.g gVar3 = this.f426e;
                        if (zE) {
                            A3.b bVarF1 = A3.b.f1(interfaceC0761e, c0796f, true, ((B3.b) gVar2.f255e).f231j.c(oVar));
                            ArrayList arrayListD = oVar.d();
                            rVar = rVar2;
                            ArrayList arrayList2 = new ArrayList(arrayListD.size());
                            D3.a aVarN0 = V1.a.n0(2, false, false, null, 6);
                            Iterator it2 = arrayListD.iterator();
                            int i5 = 0;
                            while (it2.hasNext()) {
                                C0889A c0889a = (C0889A) it2.next();
                                arrayList2.add(new C0843T(bVarF1, null, i5, c0796f, c0889a.b(), ((D3.c) gVar2.f258i).r(c0889a.e(), aVarN0), false, false, false, null, ((B3.b) gVar2.f255e).f231j.c(c0889a)));
                                i5++;
                            }
                            bVarF1.X0(false);
                            C0770n c0770nB = interfaceC0761e.b();
                            AbstractC0219i.d("classDescriptor.visibility", c0770nB);
                            if (c0770nB.equals(y3.o.f9419b)) {
                                c0770nB = y3.o.f9420c;
                                AbstractC0219i.d("PROTECTED_AND_PACKAGE", c0770nB);
                            }
                            bVarF1.c1(arrayList2, c0770nB);
                            bVarF1.W0(false);
                            bVarF1.Y0(interfaceC0761e.q());
                            int i6 = 2;
                            String strJ = V1.a.j(bVarF1, 2);
                            if (arrayList.isEmpty()) {
                                arrayList.add(bVarF1);
                                ((B3.b) gVar3.f255e).f228g.getClass();
                            } else {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    if (!V1.a.j((C0855k) it3.next(), i6).equals(strJ)) {
                                        i6 = 2;
                                    }
                                }
                                arrayList.add(bVarF1);
                                ((B3.b) gVar3.f255e).f228g.getClass();
                            }
                        } else {
                            rVar = rVar2;
                        }
                        ((V3.a) ((B3.b) gVar3.f255e).f244x).getClass();
                        AbstractC0219i.e("_context_receiver_0", gVar3);
                        AbstractC0219i.e("thisDescriptor", interfaceC0761e);
                        B3.b bVar = (B3.b) gVar3.f255e;
                        if (arrayList.isEmpty()) {
                            Class cls = oVar.f9258a;
                            boolean zIsAnnotation = cls.isAnnotation();
                            cls.isInterface();
                            if (zIsAnnotation) {
                                ?? F1 = A3.b.f1(interfaceC0761e, c0796f, true, ((B3.b) gVar2.f255e).f231j.c(oVar));
                                if (zIsAnnotation) {
                                    List listC2 = oVar.c();
                                    EmptyList = new ArrayList(listC2.size());
                                    D3.a aVarN02 = V1.a.n0(2, true, false, null, 6);
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj2 : listC2) {
                                        if (AbstractC0219i.a(((v3.x) obj2).b(), y3.x.f9442b)) {
                                            arrayList3.add(obj2);
                                        } else {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    arrayList3.size();
                                    v3.x xVar = (v3.x) P2.m.w0(arrayList3);
                                    D3.c cVar2 = (D3.c) gVar2.f258i;
                                    if (xVar != null) {
                                        AbstractC0890B abstractC0890BE = xVar.e();
                                        if (abstractC0890BE instanceof v3.i) {
                                            v3.i iVar = (v3.i) abstractC0890BE;
                                            fVar = new O2.f(cVar2.q(iVar, aVarN02, true), cVar2.r(iVar.f9251b, aVarN02));
                                        } else {
                                            fVar = new O2.f(cVar2.r(abstractC0890BE, aVarN02), null);
                                        }
                                        cVar = cVar2;
                                        str = "classDescriptor.visibility";
                                        gVar = gVar3;
                                        str2 = "PROTECTED_AND_PACKAGE";
                                        rVar.x(EmptyList, F1, 0, xVar, (AbstractC0438v) fVar.f2006d, (AbstractC0438v) fVar.f2007e);
                                    } else {
                                        gVar = gVar3;
                                        cVar = cVar2;
                                        str = "classDescriptor.visibility";
                                        str2 = "PROTECTED_AND_PACKAGE";
                                    }
                                    int i7 = xVar != null ? 1 : 0;
                                    Iterator it4 = arrayList4.iterator();
                                    int i8 = 0;
                                    while (it4.hasNext()) {
                                        v3.x xVar2 = (v3.x) it4.next();
                                        D3.c cVar3 = cVar;
                                        rVar.x(EmptyList, F1, i8 + i7, xVar2, cVar3.r(xVar2.e(), aVarN02), null);
                                        i8++;
                                        cVar = cVar3;
                                    }
                                } else {
                                    gVar = gVar3;
                                    str = "classDescriptor.visibility";
                                    str2 = "PROTECTED_AND_PACKAGE";
                                    EmptyList = Collections.emptyList();
                                }
                                F1.X0(false);
                                C0770n c0770nB2 = interfaceC0761e.b();
                                AbstractC0219i.d(str, c0770nB2);
                                if (c0770nB2.equals(y3.o.f9419b)) {
                                    c0770nB2 = y3.o.f9420c;
                                    AbstractC0219i.d(str2, c0770nB2);
                                }
                                F1.c1(EmptyList, c0770nB2);
                                F1.W0(true);
                                F1.Y0(interfaceC0761e.q());
                                ((B3.b) gVar2.f255e).f228g.getClass();
                                obj = F1;
                            } else {
                                gVar = gVar3;
                                obj = null;
                            }
                            arrayList = P2.n.i0(obj);
                        } else {
                            gVar = gVar3;
                        }
                        return P2.m.O0(bVar.f238r.e(gVar, arrayList));
                    }
                    v3.r rVar3 = (v3.r) it.next();
                    B3.e eVarN = Y0.j.N(gVar2, rVar3);
                    B3.b bVar2 = (B3.b) gVar2.f255e;
                    A3.b bVarF12 = A3.b.f1(interfaceC0761e, eVarN, false, bVar2.f231j.c(rVar3));
                    B3.g gVar4 = new B3.g(bVar2, new B3.h(gVar2, bVarF12, rVar3, interfaceC0761e.r().size()), gVar2.f256g);
                    Constructor constructor = rVar3.f9262a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    AbstractC0219i.d("types", genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listC = P2.u.f2163d;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) P2.i.m0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) P2.i.m0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listC = rVar3.c(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    A1.c cVarU = D.u(gVar4, bVarF12, listC);
                    List listR = interfaceC0761e.r();
                    AbstractC0219i.d("classDescriptor.declaredTypeParameters", listR);
                    ArrayList arrayListU = rVar3.u();
                    ArrayList arrayList5 = new ArrayList(P2.o.l0(arrayListU));
                    Iterator it5 = arrayListU.iterator();
                    while (it5.hasNext()) {
                        InterfaceC0755Q interfaceC0755QA = ((B3.i) gVar4.f).a((C0891C) it5.next());
                        AbstractC0219i.b(interfaceC0755QA);
                        arrayList5.add(interfaceC0755QA);
                    }
                    bVarF12.d1((List) cVarU.f, AbstractC0809c.j(rVar3.d()), P2.m.G0(listR, arrayList5));
                    bVarF12.W0(false);
                    bVarF12.X0(cVarU.f53e);
                    bVarF12.Y0(interfaceC0761e.q());
                    ((B3.b) gVar4.f255e).f228g.getClass();
                    arrayList.add(bVarF12);
                }
                break;
            default:
                B3.g gVar5 = this.f426e;
                B3.b bVar3 = (B3.b) gVar5.f255e;
                InterfaceC0761e interfaceC0761e2 = this.f.n;
                ((V3.a) bVar3.f244x).getClass();
                AbstractC0219i.e("_context_receiver_0", gVar5);
                AbstractC0219i.e("thisDescriptor", interfaceC0761e2);
                return P2.m.R0(new ArrayList());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, B3.g gVar) {
        super(0);
        this.f = rVar;
        this.f426e = gVar;
    }
}
