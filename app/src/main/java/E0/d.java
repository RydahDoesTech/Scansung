package E0;

import G3.p;
import I3.C0022d;
import I3.C0023e;
import I3.C0025g;
import I3.C0030l;
import I3.C0037t;
import I3.C0042y;
import I3.EnumC0021c;
import I3.G;
import I3.I;
import I3.K;
import I3.L;
import I3.W;
import J.InterfaceC0060q;
import O3.AbstractC0070b;
import O3.AbstractC0081m;
import O3.C0078j;
import O3.C0082n;
import O3.Q;
import P2.m;
import P2.o;
import P2.u;
import P2.v;
import P2.z;
import S3.r;
import S3.w;
import S3.x;
import a1.k;
import a3.InterfaceC0107b;
import a4.AbstractC0111b;
import a4.InterfaceC0110a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.EditText;
import androidx.emoji2.text.l;
import androidx.emoji2.text.s;
import androidx.viewpager.widget.ViewPager;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.B0;
import com.google.android.gms.internal.p000firebaseauthapi.C0306n;
import com.google.android.gms.internal.p000firebaseauthapi.F0;
import com.google.android.gms.internal.p000firebaseauthapi.T;
import com.google.android.gms.internal.p000firebaseauthapi.Y;
import com.google.firebase.messaging.AbstractServiceC0387d;
import com.google.firebase.messaging.q;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.idm.providers.mo.IDMMoInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import e4.AbstractC0420c;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.C0430m;
import e4.J;
import e4.N;
import e4.O;
import e4.Z;
import f3.C0446b;
import f3.C0447c;
import f4.t;
import g3.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k.Q0;
import m3.AbstractC0695h;
import p3.AbstractC0779w;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0781y;
import q3.C0793c;
import s3.C0843T;
import s3.C0855k;
import t1.InterfaceC0873a;
import u3.C0880b;
import u3.C0881c;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public final class d implements InterfaceC0060q, a4.e, K3.f, M0.b, f4.b, InterfaceC0873a, t1.c, InterfaceC0110a {

    /* renamed from: g, reason: collision with root package name */
    public static d f518g;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f519d;

    /* renamed from: e, reason: collision with root package name */
    public Object f520e;
    public Object f;

    public /* synthetic */ d(int i5, boolean z4) {
        this.f519d = i5;
    }

    public static boolean E0(Editable editable, KeyEvent keyEvent, boolean z4) {
        s[] sVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (sVarArr = (s[]) editable.getSpans(selectionStart, selectionEnd, s.class)) != null && sVarArr.length > 0) {
            for (s sVar : sVarArr) {
                int spanStart = editable.getSpanStart(sVar);
                int spanEnd = editable.getSpanEnd(sVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static d R0(Context context, String str) {
        String str2;
        d dVar = f518g;
        if (dVar == null || ((str2 = (String) dVar.f520e) != str && (str2 == null || !str2.equals(str)))) {
            f518g = new d(context, 18, str);
        }
        return f518g;
    }

    @Override // f4.b
    public int A(h4.f fVar) {
        return f4.g.R(fVar);
    }

    @Override // f4.b
    public AbstractC0442z A0(h4.c cVar) {
        return f4.g.h(cVar);
    }

    @Override // f4.b
    public void B(h4.d dVar) {
        f4.g.M(dVar);
    }

    @Override // f4.b
    public AbstractC0434q B0(h4.c cVar) {
        return f4.g.g(cVar);
    }

    @Override // f4.b
    public AbstractC0442z C(h4.d dVar) {
        return f4.g.j(dVar);
    }

    public void C0(String str, Object obj) {
        ArrayList arrayList = (ArrayList) this.f520e;
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        arrayList.add(sb.toString());
    }

    @Override // f4.b
    public h4.d D(h4.d dVar) {
        AbstractC0442z abstractC0442zQ;
        AbstractC0219i.e("<this>", dVar);
        C0430m c0430mF = f4.g.f(dVar);
        return (c0430mF == null || (abstractC0442zQ = f4.g.Q(c0430mF)) == null) ? dVar : abstractC0442zQ;
    }

    public d D0() {
        AbstractC0203C.a("execute parameter required", ((k) this.f520e) != null);
        return new d(this, (Y0.c[]) this.f, 21, false);
    }

    @Override // f4.b
    public J E(h4.c cVar) {
        AbstractC0219i.e("<this>", cVar);
        AbstractC0442z abstractC0442zH = f4.g.h(cVar);
        if (abstractC0442zH == null) {
            abstractC0442zH = z(cVar);
        }
        return f4.g.W(abstractC0442zH);
    }

    @Override // a4.e
    public a4.d F(N3.b bVar) {
        AbstractC0219i.e("classId", bVar);
        G3.f fVar = (G3.f) this.f;
        AbstractC0219i.e("<this>", fVar.c().f3039c);
        C0881c c0881cK = AbstractC0415a.k((C0880b) this.f520e, bVar, M3.f.f1821g);
        if (c0881cK == null) {
            return null;
        }
        AbstractC0897d.a(c0881cK.f9187a).equals(bVar);
        return fVar.f(c0881cK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [O2.f] */
    public C0793c F0(C0025g c0025g, K3.f fVar) {
        AbstractC0219i.e("proto", c0025g);
        AbstractC0219i.e("nameResolver", fVar);
        InterfaceC0761e interfaceC0761eF = AbstractC0779w.f((InterfaceC0781y) this.f520e, AbstractC0415a.m(fVar, c0025g.f), (q) this.f);
        Map mapK0 = v.f2164d;
        if (c0025g.f1242g.size() != 0 && !g4.j.f(interfaceC0761eF) && Q3.f.o(interfaceC0761eF, 5)) {
            Collection collectionK = interfaceC0761eF.k();
            AbstractC0219i.d("annotationClass.constructors", collectionK);
            C0855k c0855k = (C0855k) m.K0(collectionK);
            if (c0855k != null) {
                List listV0 = c0855k.v0();
                AbstractC0219i.d("constructor.valueParameters", listV0);
                int iG0 = z.g0(o.l0(listV0));
                if (iG0 < 16) {
                    iG0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                for (Object obj : listV0) {
                    linkedHashMap.put(((C0843T) obj).getName(), obj);
                }
                List<C0023e> list = c0025g.f1242g;
                AbstractC0219i.d("proto.argumentList", list);
                ArrayList arrayList = new ArrayList();
                for (C0023e c0023e : list) {
                    AbstractC0219i.d("it", c0023e);
                    C0843T c0843t = (C0843T) linkedHashMap.get(AbstractC0415a.x(fVar, c0023e.f));
                    if (c0843t != null) {
                        N3.f fVarX = AbstractC0415a.x(fVar, c0023e.f);
                        AbstractC0438v abstractC0438vD = c0843t.d();
                        AbstractC0219i.d("parameter.type", abstractC0438vD);
                        C0022d c0022d = c0023e.f1225g;
                        AbstractC0219i.d("proto.value", c0022d);
                        S3.g gVarM0 = M0(abstractC0438vD, c0022d, fVar);
                        fVar = G0(gVarM0, abstractC0438vD, c0022d) ? gVarM0 : null;
                        if (fVar == null) {
                            String str = "Unexpected argument value: actual type " + c0022d.f + " != expected type " + abstractC0438vD;
                            AbstractC0219i.e("message", str);
                            fVar = new S3.j(str);
                        }
                        fVar = new O2.f(fVarX, fVar);
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                mapK0 = z.k0(arrayList);
            }
        }
        return new C0793c(interfaceC0761eF.q(), mapK0, InterfaceC0752N.f8400b);
    }

    @Override // f4.b
    public Set G(h4.d dVar) {
        return f4.g.S(this, dVar);
    }

    public boolean G0(S3.g gVar, AbstractC0438v abstractC0438v, C0022d c0022d) {
        EnumC0021c enumC0021c = c0022d.f;
        int i5 = enumC0021c == null ? -1 : AbstractC0111b.f3026a[enumC0021c.ordinal()];
        if (i5 != 10) {
            InterfaceC0781y interfaceC0781y = (InterfaceC0781y) this.f520e;
            if (i5 != 13) {
                return AbstractC0219i.a(gVar.a(interfaceC0781y), abstractC0438v);
            }
            if (gVar instanceof S3.b) {
                S3.b bVar = (S3.b) gVar;
                if (((List) bVar.f2531a).size() == c0022d.n.size()) {
                    AbstractC0438v abstractC0438vF = interfaceC0781y.g().f(abstractC0438v);
                    Collection collection = (Collection) bVar.f2531a;
                    AbstractC0219i.e("<this>", collection);
                    Iterable c0447c = new C0447c(0, collection.size() - 1, 1);
                    if ((c0447c instanceof Collection) && ((Collection) c0447c).isEmpty()) {
                        return true;
                    }
                    Iterator it = c0447c.iterator();
                    while (((C0446b) it).f) {
                        int iA = ((C0446b) it).a();
                        S3.g gVar2 = (S3.g) ((List) bVar.f2531a).get(iA);
                        C0022d c0022d2 = (C0022d) c0022d.n.get(iA);
                        AbstractC0219i.d("value.getArrayElement(i)", c0022d2);
                        if (!G0(gVar2, abstractC0438vF, c0022d2)) {
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
        if (interfaceC0761e == null) {
            return true;
        }
        N3.f fVar = AbstractC0695h.f8064e;
        if (AbstractC0695h.b(interfaceC0761e, m3.m.f8104P)) {
            return true;
        }
        return false;
    }

    @Override // f4.b
    public boolean H(h4.f fVar, h4.f fVar2) {
        AbstractC0219i.e("c1", fVar);
        AbstractC0219i.e("c2", fVar2);
        if (!(fVar instanceof J)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(fVar2 instanceof J)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!f4.g.b(fVar, fVar2)) {
            J j5 = (J) fVar;
            J j6 = (J) fVar2;
            if (!((f4.c) this.f).a(j5, j6)) {
                HashMap map = (HashMap) this.f520e;
                if (map != null) {
                    J j7 = (J) map.get(j5);
                    J j8 = (J) map.get(j6);
                    if ((j7 == null || !j7.equals(j6)) && (j8 == null || !j8.equals(j5))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void H0(String str, InterfaceC0107b interfaceC0107b) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((B.g) this.f).f95e;
        F3.o oVar = new F3.o(this, str);
        interfaceC0107b.d(oVar);
        ArrayList arrayList = oVar.f663b;
        ArrayList arrayList2 = new ArrayList(o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((O2.f) it.next()).f2006d);
        }
        String str2 = (String) oVar.f664c.f2006d;
        String str3 = oVar.f662a;
        AbstractC0219i.e("ret", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append('(');
        sb.append(m.A0(arrayList2, "", null, null, G3.q.f774d, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = "L" + str2 + ';';
        }
        sb.append(str2);
        String string = sb.toString();
        String str4 = (String) this.f520e;
        AbstractC0219i.e("internalName", str4);
        AbstractC0219i.e("jvmDescriptor", string);
        String str5 = str4 + '.' + string;
        F3.q qVar = (F3.q) oVar.f664c.f2007e;
        ArrayList arrayList3 = new ArrayList(o.l0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((F3.q) ((O2.f) it2.next()).f2007e);
        }
        linkedHashMap.put(str5, new F3.m(qVar, arrayList3));
    }

    @Override // f4.b
    public boolean I(h4.f fVar) {
        return f4.g.A(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory I0(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.I0(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // f4.b
    public boolean J(h4.b bVar) {
        return f4.g.J(bVar);
    }

    public String J0(String str) {
        Resources resources = (Resources) this.f520e;
        int identifier = resources.getIdentifier(str, "string", (String) this.f);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // a4.InterfaceC0110a
    public Object K(a4.v vVar, G g5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("proto", g5);
        C0022d c0022d = (C0022d) AbstractC0415a.s(g5, ((b4.a) this.f520e).f2915i);
        if (c0022d == null) {
            return null;
        }
        return ((d) this.f).M0(abstractC0438v, c0022d, (K3.f) vVar.f3093b);
    }

    public boolean K0(CharSequence charSequence, int i5, int i6, l lVar) {
        if (lVar.f3667c == 0) {
            androidx.emoji2.text.c cVar = (androidx.emoji2.text.c) this.f;
            W.a aVarC = lVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarC.f1418d).getShort(iA + aVarC.f1415a);
            }
            cVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.c.f3644b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i5 < i6) {
                sb.append(charSequence.charAt(i5));
                i5++;
            }
            TextPaint textPaint = cVar.f3645a;
            String string = sb.toString();
            int i7 = B.e.f91a;
            lVar.f3667c = B.d.a(textPaint, string) ? 2 : 1;
        }
        return lVar.f3667c == 2;
    }

    @Override // a4.InterfaceC0112c
    public List L(a4.v vVar, AbstractC0081m abstractC0081m, int i5) {
        AbstractC0219i.e("proto", abstractC0081m);
        A3.f.q(i5, "kind");
        boolean z4 = abstractC0081m instanceof C0042y;
        b4.a aVar = (b4.a) this.f520e;
        if (z4) {
            aVar.getClass();
        } else {
            if (!(abstractC0081m instanceof G)) {
                throw new IllegalStateException(("Unknown message: " + abstractC0081m).toString());
            }
            int iC = Q0.c(i5);
            if (iC != 1 && iC != 2 && iC != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION").toString());
            }
            aVar.getClass();
        }
        u uVar = u.f2163d;
        ArrayList arrayList = new ArrayList(o.l0(uVar));
        Iterator<E> it = uVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) vVar.f3093b));
        }
        return arrayList;
    }

    public void L0(G.g gVar) {
        int i5 = gVar.f688b;
        Handler handler = (Handler) this.f;
        B.g gVar2 = (B.g) this.f520e;
        if (i5 != 0) {
            handler.post(new G.b(i5, gVar2, 0));
        } else {
            handler.post(new G.a(gVar2, 0, gVar.f687a));
        }
    }

    @Override // f4.b
    public f4.i M(h4.b bVar) {
        return f4.g.X(bVar);
    }

    public S3.g M0(AbstractC0438v abstractC0438v, C0022d c0022d, K3.f fVar) {
        S3.g dVar;
        AbstractC0219i.e("value", c0022d);
        AbstractC0219i.e("nameResolver", fVar);
        boolean zBooleanValue = K3.e.f1671M.c(c0022d.f1208p).booleanValue();
        EnumC0021c enumC0021c = c0022d.f;
        switch (enumC0021c == null ? -1 : AbstractC0111b.f3026a[enumC0021c.ordinal()]) {
            case 1:
                byte b2 = (byte) c0022d.f1200g;
                if (zBooleanValue) {
                    dVar = new x(b2);
                    break;
                } else {
                    dVar = new S3.d(b2);
                    break;
                }
            case 2:
                return new S3.e(Character.valueOf((char) c0022d.f1200g));
            case 3:
                short s2 = (short) c0022d.f1200g;
                if (zBooleanValue) {
                    dVar = new x(s2);
                    break;
                } else {
                    dVar = new S3.u(s2);
                    break;
                }
            case 4:
                int i5 = (int) c0022d.f1200g;
                if (zBooleanValue) {
                    dVar = new x(i5);
                    break;
                } else {
                    dVar = new S3.k(i5);
                    break;
                }
            case 5:
                long j5 = c0022d.f1200g;
                return zBooleanValue ? new x(j5) : new S3.s(j5);
            case 6:
                return new S3.c(c0022d.f1201h);
            case 7:
                return new S3.c(c0022d.f1202i);
            case 8:
                return new S3.c(Boolean.valueOf(c0022d.f1200g != 0));
            case 9:
                return new S3.v(fVar.s(c0022d.f1203j));
            case 10:
                return new r(AbstractC0415a.m(fVar, c0022d.f1204k), c0022d.f1207o);
            case 11:
                return new S3.i(AbstractC0415a.m(fVar, c0022d.f1204k), AbstractC0415a.x(fVar, c0022d.f1205l));
            case 12:
                C0025g c0025g = c0022d.f1206m;
                AbstractC0219i.d("value.annotation", c0025g);
                dVar = new S3.a((Object) F0(c0025g, fVar));
                break;
            case 13:
                List<C0022d> list = c0022d.n;
                AbstractC0219i.d("value.arrayElementList", list);
                ArrayList arrayList = new ArrayList(o.l0(list));
                for (C0022d c0022d2 : list) {
                    AbstractC0442z abstractC0442zE = ((InterfaceC0781y) this.f520e).g().e();
                    AbstractC0219i.d("it", c0022d2);
                    arrayList.add(M0(abstractC0442zE, c0022d2, fVar));
                }
                return new w(arrayList, abstractC0438v);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c0022d.f + " (expected " + abstractC0438v + ')').toString());
        }
        return dVar;
    }

    @Override // f4.b
    public boolean N(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        return f4.g.G(E(dVar)) && !f4.g.H(dVar);
    }

    public O2.j N0(int i5) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z4 = false;
        while (i5 != -1) {
            I3.J j5 = (I3.J) ((K) this.f).f1035e.get(i5);
            String str = (String) ((L) this.f520e).f1040e.get(j5.f1028g);
            I i6 = j5.f1029h;
            AbstractC0219i.b(i6);
            int iOrdinal = i6.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z4 = true;
            }
            i5 = j5.f;
        }
        return new O2.j(linkedList, linkedList2, Boolean.valueOf(z4));
    }

    @Override // f4.b
    public h4.e O(h4.d dVar) {
        return f4.g.d(dVar);
    }

    public q O0(N3.f fVar, String str) {
        AbstractC0219i.e("name", fVar);
        String strB = fVar.b();
        AbstractC0219i.d("name.asString()", strB);
        return new q(this, new p(strB.concat(str)));
    }

    @Override // K3.f
    public boolean P(int i5) {
        return ((Boolean) N0(i5).f).booleanValue();
    }

    public void P0(int i5, A1.j jVar) throws IOException {
        while (true) {
            Map.Entry entry = (Map.Entry) this.f;
            if (entry == null || ((C0082n) entry.getKey()).f2084d >= i5) {
                return;
            }
            C0082n c0082n = (C0082n) ((Map.Entry) this.f).getKey();
            Object value = ((Map.Entry) this.f).getValue();
            C0078j c0078j = C0078j.f2078c;
            Q q5 = c0082n.f2085e;
            boolean z4 = c0082n.f;
            int i6 = c0082n.f2084d;
            if (z4) {
                for (Object obj : (List) value) {
                    if (q5 == Q.f2044h) {
                        jVar.x(i6, 3);
                        ((AbstractC0070b) obj).f(jVar);
                        jVar.x(i6, 4);
                    } else {
                        jVar.x(i6, q5.f2049e);
                        C0078j.k(jVar, q5, obj);
                    }
                }
            } else if (q5 == Q.f2044h) {
                jVar.x(i6, 3);
                ((AbstractC0070b) value).f(jVar);
                jVar.x(i6, 4);
            } else {
                jVar.x(i6, q5.f2049e);
                C0078j.k(jVar, q5, value);
            }
            Iterator it = (Iterator) this.f520e;
            if (it.hasNext()) {
                this.f = (Map.Entry) it.next();
            } else {
                this.f = null;
            }
        }
    }

    @Override // f4.b
    public void Q(h4.c cVar) {
        AbstractC0219i.e("<this>", cVar);
        f4.g.g(cVar);
    }

    public void Q0(boolean z4, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f520e)) {
            map = new HashMap((Map) this.f520e);
        }
        synchronized (((Map) this.f)) {
            map2 = new HashMap((Map) this.f);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((t1.i) entry2.getKey()).c(new V1.h(status));
            }
        }
    }

    @Override // a4.InterfaceC0112c
    public List R(a4.v vVar, G g5) {
        AbstractC0219i.e("proto", g5);
        ((b4.a) this.f520e).getClass();
        u uVar = u.f2163d;
        ArrayList arrayList = new ArrayList(o.l0(uVar));
        Iterator<E> it = uVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) vVar.f3093b));
        }
        return arrayList;
    }

    @Override // a4.InterfaceC0112c
    public List S(a4.v vVar, G g5) {
        AbstractC0219i.e("proto", g5);
        ((b4.a) this.f520e).getClass();
        u uVar = u.f2163d;
        ArrayList arrayList = new ArrayList(o.l0(uVar));
        Iterator<E> it = uVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) vVar.f3093b));
        }
        return arrayList;
    }

    public String S0(String str) {
        C0306n c0306nA;
        String str2;
        C0306n c0306n = (C0306n) this.f;
        if (c0306n == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (c0306n) {
                C0306n c0306n2 = (C0306n) this.f;
                synchronized (c0306n2) {
                    c0306nA = ((Y) c0306n2.f5568e).a();
                }
                str2 = new String(((T) c0306nA.q()).a(Base64.decode(str, 8)), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
            String strValueOf = String.valueOf(e5.getMessage());
            Log.e("FirebearCryptoHelper", strValueOf.length() != 0 ? "Exception encountered while decrypting bytes:\n".concat(strValueOf) : new String("Exception encountered while decrypting bytes:\n"));
            return null;
        }
    }

    @Override // f4.b
    public AbstractC0442z T(C0430m c0430m) {
        return f4.g.Q(c0430m);
    }

    public String T0() {
        C0306n c0306nA;
        if (((C0306n) this.f) == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0306n c0306n = new C0306n(3, byteArrayOutputStream);
        try {
            synchronized (((C0306n) this.f)) {
                C0306n c0306n2 = (C0306n) this.f;
                synchronized (c0306n2) {
                    c0306nA = ((Y) c0306n2.f5568e).a();
                }
                c0306nA.j().t(c0306n);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e5) {
            String strValueOf = String.valueOf(e5.getMessage());
            Log.e("FirebearCryptoHelper", strValueOf.length() != 0 ? "Exception encountered when attempting to get Public Key:\n".concat(strValueOf) : new String("Exception encountered when attempting to get Public Key:\n"));
            return null;
        }
    }

    @Override // f4.b
    public h4.b U(h4.d dVar) {
        return f4.g.e(this, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[Catch: G2 | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x007d, G2 | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x007d, G2 | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x007d, G2 | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x007d, TRY_ENTER, TryCatch #2 {G2 | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x007d, blocks: (B:3:0x0008, B:6:0x0025, B:10:0x003b, B:10:0x003b, B:10:0x003b, B:10:0x003b, B:11:0x003f, B:11:0x003f, B:11:0x003f, B:12:0x0077, B:12:0x0077, B:12:0x0077, B:12:0x0077, B:16:0x0083, B:16:0x0083, B:16:0x0083, B:16:0x0083, B:17:0x008f, B:17:0x008f, B:17:0x008f, B:17:0x008f, B:18:0x0090, B:18:0x0090, B:18:0x0090, B:18:0x0090, B:20:0x009f, B:20:0x009f, B:20:0x009f, B:20:0x009f, B:22:0x00a7, B:22:0x00a7, B:22:0x00a7, B:22:0x00a7, B:23:0x00ab, B:23:0x00ab, B:23:0x00ab, B:23:0x00ab, B:25:0x00b3, B:25:0x00b3, B:25:0x00b3, B:25:0x00b3, B:30:0x00ce, B:30:0x00ce, B:30:0x00ce, B:30:0x00ce, B:28:0x00bb, B:28:0x00bb, B:28:0x00bb, B:31:0x00d0, B:31:0x00d0, B:31:0x00d0, B:31:0x00d0, B:33:0x00d6, B:33:0x00d6, B:33:0x00d6, B:33:0x00d6, B:35:0x00dc, B:35:0x00dc, B:35:0x00dc, B:35:0x00dc, B:36:0x00e2, B:36:0x00e2, B:36:0x00e2, B:36:0x00e2, B:38:0x00e8, B:38:0x00e8, B:38:0x00e8, B:38:0x00e8, B:40:0x00ff, B:40:0x00ff, B:40:0x00ff, B:40:0x00ff, B:42:0x0105, B:42:0x0105, B:42:0x0105, B:42:0x0105, B:46:0x0128, B:46:0x0128, B:46:0x0128, B:46:0x0128, B:43:0x011f, B:43:0x011f, B:43:0x011f, B:43:0x011f, B:44:0x0126, B:44:0x0126, B:44:0x0126, B:44:0x0126, B:47:0x012e, B:47:0x012e, B:47:0x012e, B:47:0x012e), top: B:56:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Z1.t U0(org.json.JSONObject r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.U0(org.json.JSONObject):Z1.t");
    }

    @Override // f4.b
    public Z V(ArrayList arrayList) {
        AbstractC0442z abstractC0442z;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (Z) m.J0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(o.l0(arrayList));
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        boolean z5 = false;
        while (it.hasNext()) {
            Z z6 = (Z) it.next();
            z4 = z4 || AbstractC0420c.i(z6);
            if (z6 instanceof AbstractC0442z) {
                abstractC0442z = (AbstractC0442z) z6;
            } else {
                if (!(z6 instanceof AbstractC0434q)) {
                    throw new O2.d();
                }
                AbstractC0219i.e("<this>", z6);
                abstractC0442z = ((AbstractC0434q) z6).f6693e;
                z5 = true;
            }
            arrayList2.add(abstractC0442z);
        }
        if (z4) {
            return g4.j.c(g4.i.f6808A, arrayList.toString());
        }
        t tVar = t.f6764a;
        if (!z5) {
            return tVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(o.l0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC0420c.y((Z) it2.next()));
        }
        return C0421d.j(tVar.b(arrayList2), tVar.b(arrayList3));
    }

    @Override // f4.b
    public boolean W(N n) {
        return f4.g.K(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f4.b
    public N X(h4.e eVar, int i5) {
        AbstractC0219i.e("<this>", eVar);
        if (eVar instanceof h4.d) {
            return f4.g.p((h4.c) eVar, i5);
        }
        if (eVar instanceof h4.a) {
            E e5 = ((h4.a) eVar).get(i5);
            AbstractC0219i.d("get(index)", e5);
            return (N) e5;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + b3.q.f5100a.b(eVar.getClass())).toString());
    }

    @Override // f4.b
    public O Y(h4.c cVar) {
        return f4.g.i(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    @Override // J.InterfaceC0060q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J.p0 Z(android.view.View r14, J.p0 r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.Z(android.view.View, J.p0):J.p0");
    }

    @Override // f4.b
    public void a(h4.d dVar, h4.f fVar) {
    }

    @Override // f4.b
    public AbstractC0442z a0(AbstractC0434q abstractC0434q) {
        return f4.g.N(abstractC0434q);
    }

    @Override // f4.b
    public boolean b(Z z4) {
        AbstractC0219i.e("<this>", z4);
        return f4.g.F(z(z4)) != f4.g.F(b0(z4));
    }

    @Override // f4.b
    public AbstractC0442z b0(h4.c cVar) {
        AbstractC0442z abstractC0442zY;
        AbstractC0219i.e("<this>", cVar);
        AbstractC0434q abstractC0434qG = f4.g.g(cVar);
        if (abstractC0434qG != null && (abstractC0442zY = f4.g.Y(abstractC0434qG)) != null) {
            return abstractC0442zY;
        }
        AbstractC0442z abstractC0442zH = f4.g.h(cVar);
        AbstractC0219i.b(abstractC0442zH);
        return abstractC0442zH;
    }

    @Override // f4.b
    public boolean c(h4.f fVar) {
        return f4.g.D(fVar);
    }

    @Override // f4.b
    public void c0(h4.d dVar) {
        f4.g.L(dVar);
    }

    @Override // a4.InterfaceC0112c
    public List d(a4.v vVar, AbstractC0081m abstractC0081m, int i5, int i6, I3.Z z4) {
        AbstractC0219i.e("callableProto", abstractC0081m);
        A3.f.q(i5, "kind");
        Iterable iterable = (List) z4.k(((b4.a) this.f520e).f2916j);
        if (iterable == null) {
            iterable = u.f2163d;
        }
        ArrayList arrayList = new ArrayList(o.l0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) vVar.f3093b));
        }
        return arrayList;
    }

    @Override // f4.b
    public J d0(h4.d dVar) {
        return f4.g.W(dVar);
    }

    @Override // f4.b
    public Z e(h4.d dVar, h4.d dVar2) {
        return f4.g.m(this, dVar, dVar2);
    }

    @Override // f4.b
    public boolean e0(h4.f fVar) {
        return f4.g.z(fVar);
    }

    @Override // f4.b
    public boolean f(h4.f fVar) {
        return f4.g.G(fVar);
    }

    @Override // f4.b
    public boolean f0(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        return f4.g.y(f4.g.W(dVar));
    }

    @Override // a4.InterfaceC0112c
    public ArrayList g(a4.t tVar) {
        AbstractC0219i.e("container", tVar);
        Iterable iterable = (List) tVar.f3087e.k(((b4.a) this.f520e).f2910c);
        if (iterable == null) {
            iterable = u.f2163d;
        }
        ArrayList arrayList = new ArrayList(o.l0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) tVar.f3093b));
        }
        return arrayList;
    }

    @Override // f4.b
    public AbstractC0442z g0(AbstractC0434q abstractC0434q) {
        return f4.g.Y(abstractC0434q);
    }

    @Override // N2.a
    public Object get() {
        return new L0.f((Context) ((M0.c) this.f520e).f1811d, (L0.d) ((L0.e) this.f).get());
    }

    @Override // f4.b
    public AbstractC0442z h(h4.d dVar, boolean z4) {
        return f4.g.Z(dVar, z4);
    }

    @Override // f4.b
    public boolean h0(h4.f fVar) {
        return f4.g.E(fVar);
    }

    @Override // f4.b
    public boolean i(h4.d dVar, h4.d dVar2) {
        return f4.g.w(dVar, dVar2);
    }

    @Override // f4.b
    public Z i0(h4.c cVar) {
        return f4.g.P(cVar);
    }

    @Override // a4.InterfaceC0112c
    public List j(a4.v vVar, C0037t c0037t) {
        AbstractC0219i.e("container", vVar);
        Iterable iterable = (List) c0037t.k(((b4.a) this.f520e).f2914h);
        if (iterable == null) {
            iterable = u.f2163d;
        }
        ArrayList arrayList = new ArrayList(o.l0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) vVar.f3093b));
        }
        return arrayList;
    }

    @Override // f4.b
    public Collection j0(h4.f fVar) {
        return f4.g.V(fVar);
    }

    @Override // a4.InterfaceC0112c
    public List k(a4.v vVar, AbstractC0081m abstractC0081m, int i5) {
        List list;
        AbstractC0219i.e("proto", abstractC0081m);
        A3.f.q(i5, "kind");
        boolean z4 = abstractC0081m instanceof C0030l;
        b4.a aVar = (b4.a) this.f520e;
        if (z4) {
            list = (List) ((C0030l) abstractC0081m).k(aVar.f2909b);
        } else if (abstractC0081m instanceof C0042y) {
            list = (List) ((C0042y) abstractC0081m).k(aVar.f2911d);
        } else {
            if (!(abstractC0081m instanceof G)) {
                throw new IllegalStateException(("Unknown message: " + abstractC0081m).toString());
            }
            int iC = Q0.c(i5);
            if (iC == 1) {
                list = (List) ((G) abstractC0081m).k(aVar.f2912e);
            } else if (iC == 2) {
                list = (List) ((G) abstractC0081m).k(aVar.f);
            } else {
                if (iC != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((G) abstractC0081m).k(aVar.f2913g);
            }
        }
        if (list == null) {
            list = u.f2163d;
        }
        ArrayList arrayList = new ArrayList(o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), (K3.f) vVar.f3093b));
        }
        return arrayList;
    }

    @Override // f4.b
    public boolean k0(h4.f fVar) {
        return f4.g.x(fVar);
    }

    @Override // f4.b
    public boolean l(h4.b bVar) {
        AbstractC0219i.e("$receiver", bVar);
        return bVar instanceof R3.a;
    }

    @Override // f4.b
    public Z l0(N n) {
        return f4.g.r(n);
    }

    @Override // f4.b
    public boolean m(h4.c cVar) {
        AbstractC0219i.e("<this>", cVar);
        AbstractC0442z abstractC0442zH = f4.g.h(cVar);
        return (abstractC0442zH != null ? f4.g.f(abstractC0442zH) : null) != null;
    }

    @Override // f4.b
    public N m0(h4.d dVar, int i5) {
        AbstractC0219i.e("<this>", dVar);
        if (i5 < 0 || i5 >= f4.g.c(dVar)) {
            return null;
        }
        return f4.g.p(dVar, i5);
    }

    @Override // f4.b
    public boolean n(h4.f fVar) {
        return f4.g.y(fVar);
    }

    @Override // t1.InterfaceC0873a
    public Object n0(t1.h hVar) {
        Bundle bundle;
        X0.a aVar = (X0.a) this.f520e;
        aVar.getClass();
        return (hVar.f() && (bundle = (Bundle) hVar.e()) != null && bundle.containsKey("google.messenger")) ? aVar.a((Bundle) this.f).i(X0.m.f2704d, X0.l.f2703e) : hVar;
    }

    @Override // f4.b
    public int o(h4.e eVar) {
        AbstractC0219i.e("<this>", eVar);
        if (eVar instanceof h4.d) {
            return f4.g.c((h4.c) eVar);
        }
        if (eVar instanceof h4.a) {
            return ((h4.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + b3.q.f5100a.b(eVar.getClass())).toString());
    }

    @Override // f4.b
    public boolean o0(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        return cVar instanceof F3.g;
    }

    @Override // t1.c
    public void onComplete(t1.h hVar) {
        switch (this.f519d) {
            case 20:
                ((Map) ((d) this.f).f).remove((t1.i) this.f520e);
                break;
            default:
                ((AbstractServiceC0387d) this.f520e).m1x83fa35aa((Intent) this.f, hVar);
                break;
        }
    }

    @Override // f4.b
    public int p(h4.c cVar) {
        return f4.g.c(cVar);
    }

    @Override // f4.b
    public h4.c p0(h4.c cVar) {
        return f4.g.a0(this, cVar);
    }

    @Override // f4.b
    public int q(InterfaceC0755Q interfaceC0755Q) {
        AbstractC0219i.e("$receiver", interfaceC0755Q);
        int iB = interfaceC0755Q.B();
        A3.f.u(iB, "this.variance");
        return Y0.j.n(iB);
    }

    @Override // f4.b
    public boolean q0(h4.d dVar) {
        return f4.g.B(dVar);
    }

    @Override // f4.b
    public Z r(h4.b bVar) {
        return f4.g.O(bVar);
    }

    @Override // f4.b
    public boolean r0(h4.d dVar) {
        return f4.g.F(dVar);
    }

    @Override // K3.f
    public String s(int i5) {
        String str = (String) ((L) this.f520e).f1040e.get(i5);
        AbstractC0219i.d("strings.getString(index)", str);
        return str;
    }

    @Override // K3.f
    public String s0(int i5) {
        O2.j jVarN0 = N0(i5);
        List list = (List) jVarN0.f2013d;
        String strA0 = m.A0((List) jVarN0.f2014e, IDMMoInterface.IDM_MO_ROOT_PATH, null, null, null, 62);
        if (list.isEmpty()) {
            return strA0;
        }
        return m.A0(list, "/", null, null, null, 62) + IDMTndsXmlWbxmlDefine.XML_SLASH + strA0;
    }

    @Override // f4.b
    public int t(h4.b bVar) {
        return f4.g.k(bVar);
    }

    @Override // a4.InterfaceC0110a
    public Object t0(a4.v vVar, G g5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("proto", g5);
        return null;
    }

    public String toString() {
        switch (this.f519d) {
            case 27:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f520e;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb.append((String) arrayList.get(i5));
                    if (i5 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // f4.b
    public N u(h4.c cVar, int i5) {
        return f4.g.p(cVar, i5);
    }

    @Override // f4.b
    public boolean u0(InterfaceC0755Q interfaceC0755Q, h4.f fVar) {
        return f4.g.v(interfaceC0755Q, fVar);
    }

    @Override // f4.b
    public N v(R3.b bVar) {
        return f4.g.T(bVar);
    }

    @Override // f4.b
    public int v0(N n) {
        return f4.g.t(n);
    }

    @Override // a4.InterfaceC0112c
    public ArrayList w(W w3, K3.f fVar) {
        AbstractC0219i.e("proto", w3);
        AbstractC0219i.e("nameResolver", fVar);
        Iterable iterable = (List) w3.k(((b4.a) this.f520e).f2918l);
        if (iterable == null) {
            iterable = u.f2163d;
        }
        ArrayList arrayList = new ArrayList(o.l0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // a4.InterfaceC0112c
    public ArrayList w0(I3.Q q5, K3.f fVar) {
        AbstractC0219i.e("proto", q5);
        AbstractC0219i.e("nameResolver", fVar);
        Iterable iterable = (List) q5.k(((b4.a) this.f520e).f2917k);
        if (iterable == null) {
            iterable = u.f2163d;
        }
        ArrayList arrayList = new ArrayList(o.l0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) this.f).F0((C0025g) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // f4.b
    public boolean x(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        AbstractC0442z abstractC0442zH = f4.g.h(dVar);
        return (abstractC0442zH != null ? f4.g.e(this, abstractC0442zH) : null) != null;
    }

    @Override // f4.b
    public boolean x0(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        return f4.g.D(f4.g.W(dVar));
    }

    @Override // f4.b
    public f4.a y(h4.d dVar) {
        return f4.g.U(this, dVar);
    }

    @Override // f4.b
    public C0430m y0(h4.d dVar) {
        return f4.g.f(dVar);
    }

    @Override // f4.b
    public AbstractC0442z z(h4.c cVar) {
        AbstractC0442z abstractC0442zN;
        AbstractC0219i.e("<this>", cVar);
        AbstractC0434q abstractC0434qG = f4.g.g(cVar);
        if (abstractC0434qG != null && (abstractC0442zN = f4.g.N(abstractC0434qG)) != null) {
            return abstractC0442zN;
        }
        AbstractC0442z abstractC0442zH = f4.g.h(cVar);
        AbstractC0219i.b(abstractC0442zH);
        return abstractC0442zH;
    }

    @Override // f4.b
    public InterfaceC0755Q z0(h4.f fVar, int i5) {
        return f4.g.q(fVar, i5);
    }

    public /* synthetic */ d(Object obj, int i5, Object obj2) {
        this.f519d = i5;
        this.f520e = obj;
        this.f = obj2;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i5, boolean z4) {
        this.f519d = i5;
        this.f = obj;
        this.f520e = obj2;
    }

    public d(int i5) {
        this.f519d = i5;
        switch (i5) {
            case 26:
                Y0.e eVar = Y0.e.f2816c;
                this.f520e = new SparseIntArray();
                this.f = eVar;
                break;
            default:
                this.f520e = Collections.synchronizedMap(new WeakHashMap());
                this.f = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public d(Context context, int i5, String str) {
        G3.d dVar;
        String str2;
        this.f519d = i5;
        switch (i5) {
            case 18:
                this.f520e = str;
                C0306n c0306nY = null;
                try {
                    B0.a();
                    dVar = new G3.d();
                    dVar.f750i = null;
                    dVar.f746d = null;
                    dVar.f747e = null;
                    dVar.f = null;
                    dVar.f748g = null;
                    dVar.x(context, "com.google.firebase.auth.api.crypto." + str);
                    dVar.v(F0.f5297a);
                    str2 = "android-keystore://firebear_master_key_id." + str;
                } catch (IOException | GeneralSecurityException e5) {
                    String strValueOf = String.valueOf(e5.getMessage());
                    Log.e("FirebearCryptoHelper", strValueOf.length() != 0 ? "Exception encountered during crypto setup:\n".concat(strValueOf) : new String("Exception encountered during crypto setup:\n"));
                }
                if (str2.startsWith("android-keystore://")) {
                    dVar.f747e = str2;
                    c0306nY = dVar.y();
                    this.f = c0306nY;
                    return;
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            default:
                AbstractC0203C.e(context);
                AbstractC0203C.c(str);
                this.f520e = context.getApplicationContext().getSharedPreferences("com.google.firebase.auth.api.Store." + str, 0);
                this.f = new A.d("StorageHelpers", new String[0]);
                return;
        }
    }

    public d(IBinder iBinder) throws RemoteException {
        this.f519d = 14;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f520e = new Messenger(iBinder);
            this.f = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f = new X0.e(iBinder);
            this.f520e = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public d(Object obj) {
        this.f519d = 27;
        this.f = obj;
        this.f520e = new ArrayList();
    }

    public d(String str, y yVar, b4.d dVar) {
        this.f519d = 16;
        this.f = str;
        this.f520e = yVar;
    }

    public d(L l4, K k5) {
        this.f519d = 8;
        AbstractC0219i.e("strings", l4);
        AbstractC0219i.e("qualifiedNames", k5);
        this.f520e = l4;
        this.f = k5;
    }

    public d(HashMap map, f4.c cVar) {
        this.f519d = 12;
        AbstractC0219i.e("equalityAxioms", cVar);
        this.f520e = map;
        this.f = cVar;
    }

    public d(InterfaceC0781y interfaceC0781y, q qVar, b4.a aVar) {
        this.f519d = 23;
        AbstractC0219i.e("module", interfaceC0781y);
        AbstractC0219i.e(NetworkAnalyticsConstants.DataPoints.PROTOCOL, aVar);
        this.f520e = aVar;
        this.f = new d(interfaceC0781y, qVar);
    }

    public d(InterfaceC0781y interfaceC0781y, q qVar) {
        this.f519d = 24;
        AbstractC0219i.e("module", interfaceC0781y);
        AbstractC0219i.e("notFoundClasses", qVar);
        this.f520e = interfaceC0781y;
        this.f = qVar;
    }

    public d(Context context, int i5) {
        this.f519d = i5;
        switch (i5) {
            case 28:
                AbstractC0203C.e(context);
                Resources resources = context.getResources();
                this.f520e = resources;
                this.f = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.f = null;
                this.f520e = context;
                break;
        }
    }

    public d(G3.d dVar, HashMap map, HashMap map2) {
        this.f519d = 3;
        this.f520e = dVar;
        this.f = map;
    }

    public d(q qVar, b4.d dVar, androidx.emoji2.text.c cVar) {
        this.f519d = 25;
        this.f520e = qVar;
        this.f = cVar;
    }

    public d(B.g gVar, String str) {
        this.f519d = 1;
        AbstractC0219i.e("className", str);
        this.f = gVar;
        this.f520e = str;
    }

    public d(EditText editText) {
        this.f519d = 13;
        this.f520e = editText;
        X.i iVar = new X.i(editText);
        this.f = iVar;
        editText.addTextChangedListener(iVar);
        if (X.a.f2650b == null) {
            synchronized (X.a.f2649a) {
                try {
                    if (X.a.f2650b == null) {
                        X.a aVar = new X.a();
                        try {
                            X.a.f2651c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, X.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        X.a.f2650b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(X.a.f2650b);
    }

    public d(View view) {
        this.f519d = 6;
        this.f = new LinkedList();
        this.f520e = view;
    }

    public d(AbstractC0081m abstractC0081m) {
        this.f519d = 11;
        C0078j c0078j = abstractC0081m.f2083d;
        c0078j.getClass();
        Iterator it = ((O3.I) c0078j.f2079a.entrySet()).iterator();
        this.f520e = it;
        if (it.hasNext()) {
            this.f = (Map.Entry) it.next();
        }
    }

    public d(WindowInsetsController windowInsetsController, b4.d dVar) {
        this.f519d = 7;
        this.f520e = windowInsetsController;
    }

    public d(ViewPager viewPager) {
        this.f519d = 0;
        this.f = viewPager;
        this.f520e = new Rect();
    }
}
