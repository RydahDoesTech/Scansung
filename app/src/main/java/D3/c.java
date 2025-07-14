package D3;

import K0.j;
import P0.k;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.r;
import b0.AbstractC0197b;
import b0.C0196a;
import b0.C0199d;
import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.a5;
import com.google.firebase.messaging.C0388e;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.h;
import com.google.firebase.messaging.q;
import com.google.firebase.messaging.s;
import com.samsung.android.knox.ex.KnoxContract;
import d2.C0393b;
import e.M;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import f3.C0447c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import k.C0601P;
import k.C0651s;
import p1.o;
import p3.InterfaceC0764h;
import q2.C0790e;
import r0.AbstractC0809c;
import s.C0822d;
import t.C0870b;
import t1.n;
import u3.C0880b;
import v3.AbstractC0890B;
import v3.C0893E;
import v3.i;
import v3.z;
import z.AbstractC0941d;

/* loaded from: classes.dex */
public final class c implements M0.b, t1.c, t1.g {

    /* renamed from: h, reason: collision with root package name */
    public static c f505h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f506d;

    /* renamed from: e, reason: collision with root package name */
    public Object f507e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f508g;

    public /* synthetic */ c(int i5) {
        this.f506d = i5;
    }

    public static c l(Context context, AttributeSet attributeSet, int[] iArr, int i5) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i5, 0));
    }

    @Override // t1.g
    public n a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f507e;
        String str = (String) this.f;
        s sVar = (s) this.f508g;
        String str2 = (String) obj;
        h hVarD = FirebaseMessaging.d(firebaseMessaging.f6128b);
        V1.g gVar = firebaseMessaging.f6127a;
        gVar.a();
        String strF = "[DEFAULT]".equals(gVar.f2611b) ? "" : gVar.f();
        String strA = firebaseMessaging.f6132g.a();
        synchronized (hVarD) {
            String strA2 = s.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) hVarD.f6150e).edit();
                editorEdit.putString(h.b(strF, str), strA2);
                editorEdit.commit();
            }
        }
        if (sVar == null || !str2.equals(sVar.f6174a)) {
            V1.g gVar2 = firebaseMessaging.f6127a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f2611b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    gVar2.a();
                    String strValueOf = String.valueOf(gVar2.f2611b);
                    Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new h(firebaseMessaging.f6128b, 0).j(intent);
            }
        }
        return AbstractC0809c.e(str2);
    }

    public K0.b b() {
        String strConcat = ((String) this.f507e) == null ? " backendName" : "";
        if (((H0.c) this.f508g) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new K0.b((String) this.f507e, (byte[]) this.f, (H0.c) this.f508g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v24, types: [O2.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e4.AbstractC0442z c(v3.q r21, D3.a r22, e4.AbstractC0442z r23) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.c.c(v3.q, D3.a, e4.z):e4.z");
    }

    public X d(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public X e(Class cls, String str) {
        X xC;
        AbstractC0219i.e(KnoxContract.KEY, str);
        b0 b0Var = (b0) this.f507e;
        b0Var.getClass();
        LinkedHashMap linkedHashMap = b0Var.f4010a;
        X x4 = (X) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(x4);
        a0 a0Var = (a0) this.f;
        if (!zIsInstance) {
            C0199d c0199d = new C0199d((AbstractC0197b) this.f508g);
            c0199d.f5000a.put(Y.f4005e, str);
            try {
                xC = a0Var.u(cls, c0199d);
            } catch (AbstractMethodError unused) {
                xC = a0Var.c(cls);
            }
            AbstractC0219i.e("viewModel", xC);
            X x5 = (X) linkedHashMap.put(str, xC);
            if (x5 != null) {
                x5.onCleared();
            }
            return xC;
        }
        U u4 = a0Var instanceof U ? (U) a0Var : null;
        if (u4 != null) {
            AbstractC0219i.b(x4);
            r rVar = u4.f3999g;
            if (rVar != null) {
                w0.d dVar = u4.f4000h;
                AbstractC0219i.b(dVar);
                Q.a(x4, dVar, rVar);
            }
        }
        AbstractC0219i.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", x4);
        return x4;
    }

    public ColorStateList f(int i5) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateListB = AbstractC0941d.b((Context) this.f507e, resourceId)) == null) ? typedArray.getColorStateList(i5) : colorStateListB;
    }

    public Drawable g(int i5) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) ? typedArray.getDrawable(i5) : AbstractC0415a.r((Context) this.f507e, resourceId);
    }

    @Override // N2.a
    public Object get() {
        switch (this.f506d) {
            case 3:
                return new j(new b4.d(), new Y0.h(5), (O0.d) ((B3.g) this.f507e).get(), (P0.j) ((G3.d) this.f).get(), (k) ((q) this.f508g).get());
            default:
                return new P0.d((Context) ((M0.c) this.f507e).f1811d, (Q0.c) ((N2.a) this.f).get(), (P0.b) ((Y0.h) this.f508g).get());
        }
    }

    public Drawable h(int i5) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f).hasValue(i5) || (resourceId = ((TypedArray) this.f).getResourceId(i5, 0)) == 0) {
            return null;
        }
        C0651s c0651sA = C0651s.a();
        Context context = (Context) this.f507e;
        synchronized (c0651sA) {
            drawableD = c0651sA.f7796a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface i(int i5, int i6, C0601P c0601p) {
        int resourceId = ((TypedArray) this.f).getResourceId(i5, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f508g) == null) {
            this.f508g = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f508g;
        ThreadLocal threadLocal = A.r.f34a;
        Context context = (Context) this.f507e;
        if (context.isRestricted()) {
            return null;
        }
        return A.r.c(context, resourceId, typedValue, i6, c0601p, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /* JADX WARN: Type inference failed for: r0v105, types: [int] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.c.j():boolean");
    }

    public boolean k(a5 a5Var, C0822d c0822d, int i5) {
        int[] iArr = c0822d.f8651j0;
        int i6 = iArr[0];
        C0870b c0870b = (C0870b) this.f;
        c0870b.f8909a = i6;
        c0870b.f8910b = iArr[1];
        c0870b.f8911c = c0822d.n();
        c0870b.f8912d = c0822d.k();
        c0870b.f8916i = false;
        c0870b.f8917j = i5;
        boolean z4 = c0870b.f8909a == 3;
        boolean z5 = c0870b.f8910b == 3;
        boolean z6 = z4 && c0822d.f8624Q > 0.0f;
        boolean z7 = z5 && c0822d.f8624Q > 0.0f;
        int[] iArr2 = c0822d.n;
        if (z6 && iArr2[0] == 4) {
            c0870b.f8909a = 1;
        }
        if (z7 && iArr2[1] == 4) {
            c0870b.f8910b = 1;
        }
        a5Var.b(c0822d, c0870b);
        c0822d.H(c0870b.f8913e);
        c0822d.E(c0870b.f);
        c0822d.f8665y = c0870b.f8915h;
        c0822d.B(c0870b.f8914g);
        c0870b.f8917j = 0;
        return c0870b.f8916i;
    }

    public void m() {
        ((TypedArray) this.f).recycle();
    }

    public void n(H0.a aVar) {
        C2.a aVar2 = new C2.a(8);
        K0.b bVar = (K0.b) this.f507e;
        H0.b bVar2 = (H0.b) this.f;
        j jVar = (j) this.f508g;
        c cVarA = K0.b.a();
        cVarA.o(bVar.f1623a);
        cVarA.f508g = H0.c.f807e;
        cVarA.f = bVar.f1624b;
        K0.b bVarB = cVarA.b();
        G3.d dVar = new G3.d();
        dVar.f750i = new HashMap();
        dVar.f748g = Long.valueOf(jVar.f1642a.a());
        dVar.f749h = Long.valueOf(jVar.f1643b.a());
        dVar.f746d = "FCM_CLIENT_EVENT_LOGGING";
        C0790e c0790e = aVar.f804a;
        c cVar = p1.d.f8361a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cVar.t(c0790e, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        dVar.f = new K0.e(bVar2, byteArrayOutputStream.toByteArray());
        dVar.f747e = null;
        K0.a aVarE = dVar.e();
        O0.c cVar2 = (O0.c) jVar.f1644c;
        cVar2.getClass();
        cVar2.f1908b.execute(new O0.a(cVar2, bVarB, aVar2, aVarE));
    }

    public void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f507e = str;
    }

    @Override // t1.c
    public void onComplete(t1.h hVar) {
        X0.a aVar = (X0.a) this.f507e;
        String str = (String) this.f;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f508g;
        synchronized (aVar.f2671a) {
            aVar.f2671a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void p(s.e eVar, int i5, int i6) {
        int i7 = eVar.f8629V;
        int i8 = eVar.f8630W;
        eVar.f8629V = 0;
        eVar.f8630W = 0;
        eVar.H(i5);
        eVar.E(i6);
        if (i7 < 0) {
            eVar.f8629V = 0;
        } else {
            eVar.f8629V = i7;
        }
        if (i8 < 0) {
            eVar.f8630W = 0;
        } else {
            eVar.f8630W = i8;
        }
        ((s.e) this.f508g).O();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e4.Z q(v3.i r8, D3.a r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "arrayType"
            b3.AbstractC0219i.e(r0, r8)
            v3.B r0 = r8.f9251b
            boolean r1 = r0 instanceof v3.z
            r2 = 0
            if (r1 == 0) goto L10
            r1 = r0
            v3.z r1 = (v3.z) r1
            goto L11
        L10:
            r1 = r2
        L11:
            if (r1 == 0) goto L2b
            java.lang.Class r3 = java.lang.Void.TYPE
            java.lang.Class r1 = r1.f9268a
            boolean r3 = b3.AbstractC0219i.a(r1, r3)
            if (r3 == 0) goto L1e
            goto L2b
        L1e:
            java.lang.String r1 = r1.getName()
            V3.c r1 = V3.c.b(r1)
            m3.j r1 = r1.d()
            goto L2c
        L2b:
            r1 = r2
        L2c:
            B3.e r3 = new B3.e
            java.lang.Object r4 = r7.f507e
            B3.g r4 = (B3.g) r4
            r5 = 1
            r3.<init>(r4, r8, r5)
            java.lang.Object r8 = r4.f255e
            B3.b r8 = (B3.b) r8
            boolean r9 = r9.f499d
            if (r1 == 0) goto L6a
            s3.B r7 = r8.f235o
            m3.h r7 = r7.f8732g
            e4.z r7 = r7.p(r1)
            q3.i r8 = new q3.i
            q3.h r10 = r7.s()
            q3.h[] r10 = new q3.InterfaceC0798h[]{r10, r3}
            r8.<init>(r10)
            e4.v r7 = V1.a.j0(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            b3.AbstractC0219i.c(r8, r7)
            e4.z r7 = (e4.AbstractC0442z) r7
            if (r9 == 0) goto L61
            goto L69
        L61:
            e4.z r8 = r7.M0(r5)
            e4.Z r7 = e4.C0421d.j(r7, r8)
        L69:
            return r7
        L6a:
            r1 = 6
            r4 = 0
            r6 = 2
            D3.a r1 = V1.a.n0(r6, r9, r4, r2, r1)
            e4.v r7 = r7.r(r0, r1)
            r0 = 3
            if (r9 == 0) goto L84
            if (r10 == 0) goto L7b
            r5 = r0
        L7b:
            s3.B r8 = r8.f235o
            m3.h r8 = r8.f8732g
            e4.z r7 = r8.g(r5, r7, r3)
            return r7
        L84:
            s3.B r9 = r8.f235o
            m3.h r9 = r9.f8732g
            e4.z r9 = r9.g(r5, r7, r3)
            s3.B r8 = r8.f235o
            m3.h r8 = r8.f8732g
            e4.z r7 = r8.g(r0, r7, r3)
            e4.z r7 = r7.M0(r5)
            e4.Z r7 = e4.C0421d.j(r9, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.c.q(v3.i, D3.a, boolean):e4.Z");
    }

    public AbstractC0438v r(E3.d dVar, a aVar) {
        AbstractC0442z abstractC0442zC;
        boolean z4 = dVar instanceof z;
        B3.g gVar = (B3.g) this.f507e;
        if (z4) {
            Class cls = Void.TYPE;
            Class cls2 = ((z) dVar).f9268a;
            m3.j jVarD = AbstractC0219i.a(cls2, cls) ? null : V3.c.b(cls2.getName()).d();
            return jVarD != null ? ((B3.b) gVar.f255e).f235o.f8732g.r(jVarD) : ((B3.b) gVar.f255e).f235o.f8732g.v();
        }
        boolean z5 = false;
        if (!(dVar instanceof v3.q)) {
            if (dVar instanceof i) {
                return q((i) dVar, aVar, false);
            }
            if (dVar instanceof C0893E) {
                AbstractC0890B abstractC0890BB = ((C0893E) dVar).b();
                return abstractC0890BB != null ? r(abstractC0890BB, aVar) : ((B3.b) gVar.f255e).f235o.f8732g.n();
            }
            if (dVar == null) {
                return ((B3.b) gVar.f255e).f235o.f8732g.n();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        v3.q qVar = (v3.q) dVar;
        if (!aVar.f499d && aVar.f496a != 1) {
            z5 = true;
        }
        boolean zC = qVar.c();
        g4.i iVar = g4.i.f;
        Type type = qVar.f9260a;
        if (!zC && !z5) {
            AbstractC0442z abstractC0442zC2 = c(qVar, aVar, null);
            return abstractC0442zC2 != null ? abstractC0442zC2 : g4.j.c(iVar, type.toString());
        }
        AbstractC0442z abstractC0442zC3 = c(qVar, aVar.b(3), null);
        if (abstractC0442zC3 != null && (abstractC0442zC = c(qVar, aVar.b(2), abstractC0442zC3)) != null) {
            return zC ? new g(abstractC0442zC3, abstractC0442zC) : C0421d.j(abstractC0442zC3, abstractC0442zC);
        }
        return g4.j.c(iVar, type.toString());
    }

    public void s(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f507e;
        arrayList.clear();
        int size = eVar.k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0822d c0822d = (C0822d) eVar.k0.get(i5);
            int[] iArr = c0822d.f8651j0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0822d);
            }
        }
        eVar.m0.f8921b = true;
    }

    public void t(C0790e c0790e, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f;
        HashMap map2 = (HashMap) this.f507e;
        o oVar = new o(byteArrayOutputStream, map2, map, (p1.n) this.f508g);
        d2.d dVar = (d2.d) map2.get(C0790e.class);
        if (dVar == null) {
            throw new C0393b("No encoder for ".concat(String.valueOf(C0790e.class)));
        }
        dVar.a(c0790e, oVar);
    }

    public c(FirebaseMessagingService firebaseMessagingService, h hVar, ExecutorService executorService) {
        this.f506d = 10;
        this.f507e = executorService;
        this.f = firebaseMessagingService;
        this.f508g = hVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i5) {
        this.f506d = i5;
        this.f507e = obj;
        this.f = obj2;
        this.f508g = obj3;
    }

    public c(G3.f fVar, C0880b c0880b) {
        this.f506d = 19;
        this.f507e = fVar;
        this.f = c0880b;
        this.f508g = new ConcurrentHashMap();
    }

    public c(C0447c c0447c, Method[] methodArr, Method method) {
        this.f506d = 14;
        AbstractC0219i.e("argumentRange", c0447c);
        this.f507e = c0447c;
        this.f = methodArr;
        this.f508g = method;
    }

    public c(b0 b0Var, a0 a0Var, AbstractC0197b abstractC0197b) {
        this.f506d = 8;
        AbstractC0219i.e("store", b0Var);
        AbstractC0219i.e("defaultCreationExtras", abstractC0197b);
        this.f507e = b0Var;
        this.f = a0Var;
        this.f508g = abstractC0197b;
    }

    public c(B3.g gVar, B3.i iVar) {
        this.f506d = 0;
        AbstractC0219i.e("c", gVar);
        AbstractC0219i.e("typeParameterResolver", iVar);
        this.f507e = gVar;
        this.f = iVar;
        this.f508g = new C0388e(new O1.e(2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(b0 b0Var, a0 a0Var) {
        this(b0Var, a0Var, C0196a.f4999b);
        this.f506d = 8;
        AbstractC0219i.e("store", b0Var);
    }

    public c(InterfaceC0764h interfaceC0764h, List list, c cVar) {
        this.f506d = 16;
        AbstractC0219i.e("classifierDescriptor", interfaceC0764h);
        AbstractC0219i.e("arguments", list);
        this.f507e = interfaceC0764h;
        this.f = list;
        this.f508g = cVar;
    }

    public c(Context context, TypedArray typedArray) {
        this.f506d = 13;
        this.f507e = context;
        this.f = typedArray;
    }

    public c(Context context, LocationManager locationManager) {
        this.f506d = 12;
        this.f508g = new M();
        this.f507e = context;
        this.f = locationManager;
    }

    public c(s.e eVar) {
        this.f506d = 18;
        this.f507e = new ArrayList();
        this.f = new C0870b();
        this.f508g = eVar;
    }

    public c(B.g gVar) {
        this.f506d = 6;
        this.f506d = 6;
        this.f507e = gVar;
        this.f = Choreographer.getInstance();
        this.f508g = new V.a(0, this);
    }
}
