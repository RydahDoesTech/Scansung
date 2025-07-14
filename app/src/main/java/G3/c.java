package G3;

import I3.Q;
import I3.W;
import P2.s;
import P2.u;
import P2.v;
import a4.A;
import a4.B;
import a4.z;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import c4.t;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0305m4;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0376y4;
import com.google.android.gms.internal.p000firebaseauthapi.C0233a4;
import com.google.android.gms.internal.p000firebaseauthapi.C0239b4;
import com.google.android.gms.internal.p000firebaseauthapi.C0311n4;
import com.google.android.gms.internal.p000firebaseauthapi.C0358v4;
import com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4;
import com.google.android.gms.internal.p000firebaseauthapi.W3;
import com.google.android.gms.internal.p000firebaseauthapi.Y3;
import com.google.firebase.messaging.C0388e;
import com.samsung.android.lib.episode.EternalContract;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0425h;
import e4.C0429l;
import e4.G;
import e4.J;
import e4.N;
import g3.y;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l3.AbstractC0683a;
import m3.AbstractC0695h;
import o.C0704b;
import org.json.JSONException;
import org.json.JSONObject;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import q3.C0793c;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class c implements m, Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f739d;

    /* renamed from: e, reason: collision with root package name */
    public Object f740e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f741g;

    /* renamed from: h, reason: collision with root package name */
    public Object f742h;

    /* renamed from: i, reason: collision with root package name */
    public Object f743i;

    /* renamed from: j, reason: collision with root package name */
    public Object f744j;

    /* renamed from: k, reason: collision with root package name */
    public Object f745k;

    public /* synthetic */ c() {
        this.f739d = 1;
    }

    public static AbstractC0442z b(AbstractC0442z abstractC0442z, AbstractC0438v abstractC0438v) {
        AbstractC0695h abstractC0695hX = V1.a.x(abstractC0442z);
        InterfaceC0798h interfaceC0798hS = abstractC0442z.s();
        AbstractC0438v abstractC0438vZ = AbstractC0415a.z(abstractC0442z);
        List listP = AbstractC0415a.p(abstractC0442z);
        List listS0 = P2.m.s0(AbstractC0415a.C(abstractC0442z));
        ArrayList arrayList = new ArrayList(P2.o.l0(listS0));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(((N) it.next()).b());
        }
        return AbstractC0415a.g(abstractC0695hX, interfaceC0798hS, abstractC0438vZ, listP, arrayList, abstractC0438v, true).M0(abstractC0442z.J0());
    }

    public static final ArrayList e(Q q5, c cVar) {
        List list = q5.f1075g;
        AbstractC0219i.d("argumentList", list);
        Q qS = y.S(q5, (K3.g) ((a4.k) cVar.f740e).f3060g);
        Iterable iterableE = qS != null ? e(qS, cVar) : null;
        if (iterableE == null) {
            iterableE = u.f2163d;
        }
        return P2.m.G0(list, iterableE);
    }

    public static G f(List list, InterfaceC0798h interfaceC0798h, J j5, InterfaceC0766j interfaceC0766j) {
        G gL;
        ArrayList arrayList = new ArrayList(P2.o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0429l) it.next()).getClass();
            if (interfaceC0798h.isEmpty()) {
                G.f6646e.getClass();
                gL = G.f;
            } else {
                C0388e c0388e = G.f6646e;
                List listN = y.N(new C0425h(interfaceC0798h));
                c0388e.getClass();
                gL = C0388e.l(listN);
            }
            arrayList.add(gL);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            s.n0(arrayList2, (Iterable) it2.next());
        }
        G.f6646e.getClass();
        return C0388e.l(arrayList2);
    }

    public static final InterfaceC0761e h(c cVar, Q q5, int i5) {
        N3.b bVarM = AbstractC0415a.m((K3.f) ((a4.k) cVar.f740e).f3059e, i5);
        o4.r rVarI0 = o4.m.i0(o4.m.h0(q5, new z(cVar, 2)), B.f3024d);
        ArrayList arrayList = new ArrayList();
        Iterator it = rVarI0.iterator();
        while (true) {
            o4.q qVar = (o4.q) it;
            if (!qVar.hasNext()) {
                break;
            }
            arrayList.add(qVar.next());
        }
        int iF0 = o4.m.f0(o4.m.h0(bVarM, A.f3023l));
        while (arrayList.size() < iF0) {
            arrayList.add(0);
        }
        return ((a4.i) ((a4.k) cVar.f740e).f3058d).f3047l.t(bVarM, arrayList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", (String) this.f740e);
        ((String) this.f).getClass();
        jSONObject.put("mfaProvider", 1);
        String str = (String) this.f741g;
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", str);
            String str2 = (String) this.f743i;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("recaptchaToken", str2);
            }
            String str3 = (String) this.f744j;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("safetyNetToken", str3);
            }
            C0311n4 c0311n4 = (C0311n4) this.f745k;
            if (c0311n4 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("appSignatureHash", c0311n4.f5573e);
                jSONObject2.put("autoRetrievalInfo", jSONObject3);
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public InterfaceC0755Q c(int i5) {
        InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) this.f745k.get(Integer.valueOf(i5));
        if (interfaceC0755Q != null) {
            return interfaceC0755Q;
        }
        c cVar = (c) this.f;
        if (cVar != null) {
            return cVar.c(i5);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03bf A[PHI: r4
  0x03bf: PHI (r4v9 e4.z) = (r4v8 e4.z), (r4v15 e4.z) binds: [B:156:0x03da, B:150:0x03b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e4.AbstractC0442z d(I3.Q r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.c.d(I3.Q, boolean):e4.z");
    }

    public AbstractC0438v g(Q q5) {
        AbstractC0219i.e("proto", q5);
        if (!((q5.f & 2) == 2)) {
            return d(q5, true);
        }
        a4.k kVar = (a4.k) this.f740e;
        String strS = ((K3.f) kVar.f3059e).s(q5.f1077i);
        AbstractC0442z abstractC0442zD = d(q5, true);
        K3.g gVar = (K3.g) kVar.f3060g;
        AbstractC0219i.e("typeTable", gVar);
        int i5 = q5.f;
        Q qA = (i5 & 4) == 4 ? q5.f1078j : (i5 & 8) == 8 ? gVar.a(q5.f1079k) : null;
        AbstractC0219i.b(qA);
        return ((a4.i) kVar.f3058d).f3045j.c(q5, strS, abstractC0442zD, d(qA, true));
    }

    public void i(C0311n4 c0311n4, InterfaceC0257e4 interfaceC0257e4) throws IOException {
        W3 w3 = (W3) this.f740e;
        AbstractC0335s.l(w3.j("/getAccountInfo", (String) this.f744j), c0311n4, interfaceC0257e4, C0358v4.class, (C0239b4) w3.f5381b);
    }

    public void j(d dVar, InterfaceC0257e4 interfaceC0257e4) throws IOException {
        if (((X1.a) dVar.f749h) != null) {
            k().f5437e = ((X1.a) dVar.f749h).f2711k;
        }
        W3 w3 = (W3) this.f740e;
        AbstractC0335s.l(w3.j("/getOobConfirmationCode", (String) this.f744j), dVar, interfaceC0257e4, AbstractC0376y4.class, (C0239b4) w3.f5381b);
    }

    public C0239b4 k() {
        if (((C0239b4) this.f745k) == null) {
            this.f745k = new C0239b4((Context) this.f743i, g4.f.d("X", Integer.toString(((C0233a4) this.f742h).f5423a)));
        }
        return (C0239b4) this.f745k;
    }

    @Override // G3.m
    public void m() {
        HashMap map = (HashMap) this.f741g;
        d dVar = (d) this.f;
        dVar.getClass();
        N3.b bVar = (N3.b) this.f743i;
        AbstractC0219i.e("arguments", map);
        boolean zN = false;
        if (bVar.equals(AbstractC0683a.f8024b)) {
            Object obj = map.get(N3.f.e("value"));
            S3.r rVar = obj instanceof S3.r ? (S3.r) obj : null;
            if (rVar != null) {
                Object obj2 = rVar.f2531a;
                S3.p pVar = obj2 instanceof S3.p ? (S3.p) obj2 : null;
                if (pVar != null) {
                    zN = dVar.n(pVar.f2540a.f2529a);
                }
            }
        }
        if (zN || dVar.n(bVar)) {
            return;
        }
        ((List) this.f744j).add(new C0793c(((InterfaceC0761e) this.f742h).q(), map, (InterfaceC0752N) this.f745k));
    }

    @Override // G3.m
    public void n(N3.f fVar, Object obj) {
        ((HashMap) this.f741g).put(fVar, d.b((d) this.f740e, fVar, obj));
    }

    @Override // G3.m
    public void o(N3.f fVar, S3.f fVar2) {
        ((HashMap) this.f741g).put(fVar, new S3.r(new S3.p(fVar2)));
    }

    @Override // G3.m
    public m p(N3.b bVar, N3.f fVar) {
        ArrayList arrayList = new ArrayList();
        return new B3.g(((d) this.f740e).o(bVar, InterfaceC0752N.f8400b, arrayList), this, fVar, arrayList);
    }

    @Override // G3.m
    public void q(N3.f fVar, N3.b bVar, N3.f fVar2) {
        ((HashMap) this.f741g).put(fVar, new S3.i(bVar, fVar2));
    }

    @Override // G3.m
    public n r(N3.f fVar) {
        return new com.google.firebase.messaging.q((d) this.f740e, fVar, this);
    }

    public String toString() {
        String str;
        switch (this.f739d) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f741g);
                c cVar = (c) this.f;
                if (cVar == null) {
                    str = "";
                } else {
                    str = ". Child of " + ((String) cVar.f741g);
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public c(Context context, String str, C0233a4 c0233a4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f739d = 3;
        AbstractC0203C.e(context);
        this.f743i = context.getApplicationContext();
        AbstractC0203C.c(str);
        this.f744j = str;
        this.f742h = c0233a4;
        this.f741g = null;
        this.f740e = null;
        this.f = null;
        String strI = AbstractC0335s.i("firebear.secureToken");
        if (TextUtils.isEmpty(strI)) {
            C0704b c0704b = AbstractC0305m4.f5564a;
            synchronized (c0704b) {
                if (c0704b.getOrDefault(str, null) != null) {
                    throw new ClassCastException();
                }
            }
            strI = "https://".concat("securetoken.googleapis.com/v1");
        } else {
            String strValueOf = String.valueOf(strI);
            Log.e("LocalClient", strValueOf.length() != 0 ? "Found hermetic configuration for secureToken URL: ".concat(strValueOf) : new String("Found hermetic configuration for secureToken URL: "));
        }
        if (((W3) this.f741g) == null) {
            this.f741g = new W3(strI, k());
        }
        String strI2 = AbstractC0335s.i("firebear.identityToolkit");
        if (TextUtils.isEmpty(strI2)) {
            strI2 = AbstractC0305m4.a(str);
        } else {
            String strValueOf2 = String.valueOf(strI2);
            Log.e("LocalClient", strValueOf2.length() != 0 ? "Found hermetic configuration for identityToolkit URL: ".concat(strValueOf2) : new String("Found hermetic configuration for identityToolkit URL: "));
        }
        if (((W3) this.f740e) == null) {
            this.f740e = new W3(strI2, k());
        }
        String strI3 = AbstractC0335s.i("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strI3)) {
            C0704b c0704b2 = AbstractC0305m4.f5564a;
            synchronized (c0704b2) {
                if (c0704b2.getOrDefault(str, null) != null) {
                    throw new ClassCastException();
                }
            }
            strI3 = "https://".concat("identitytoolkit.googleapis.com/v2/accounts");
        } else {
            String strValueOf3 = String.valueOf(strI3);
            Log.e("LocalClient", strValueOf3.length() != 0 ? "Found hermetic configuration for identityToolkitV2 URL: ".concat(strValueOf3) : new String("Found hermetic configuration for identityToolkitV2 URL: "));
        }
        if (((W3) this.f) == null) {
            this.f = new W3(strI3, k());
        }
        C0704b c0704b3 = AbstractC0305m4.f5565b;
        synchronized (c0704b3) {
            c0704b3.put(str, new WeakReference(this));
        }
    }

    public c(String str, String str2, String str3, String str4, String str5) {
        this.f739d = 4;
        AbstractC0203C.c(str);
        this.f740e = str;
        AbstractC0203C.c(EternalContract.DEVICE_TYPE_PHONE);
        this.f = EternalContract.DEVICE_TYPE_PHONE;
        this.f741g = str2;
        this.f742h = str3;
        this.f743i = str4;
        this.f744j = str5;
    }

    public c(a4.k kVar, c cVar, List list, String str, String str2) {
        Map linkedHashMap;
        this.f739d = 2;
        AbstractC0219i.e("c", kVar);
        AbstractC0219i.e("typeParameterProtos", list);
        AbstractC0219i.e("debugName", str);
        this.f740e = kVar;
        this.f = cVar;
        this.f741g = str;
        this.f742h = str2;
        a4.i iVar = (a4.i) kVar.f3058d;
        this.f743i = ((d4.l) iVar.f3037a).c(new z(this, 0));
        this.f744j = ((d4.l) iVar.f3037a).c(new z(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = v.f2164d;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                W w3 = (W) it.next();
                linkedHashMap.put(Integer.valueOf(w3.f1126g), new t((a4.k) this.f740e, w3, i5));
                i5++;
            }
        }
        this.f745k = linkedHashMap;
    }

    public c(d dVar, InterfaceC0761e interfaceC0761e, N3.b bVar, List list, InterfaceC0752N interfaceC0752N) {
        this.f739d = 0;
        this.f = dVar;
        this.f742h = interfaceC0761e;
        this.f743i = bVar;
        this.f744j = list;
        this.f745k = interfaceC0752N;
        this.f740e = dVar;
        this.f741g = new HashMap();
    }
}
