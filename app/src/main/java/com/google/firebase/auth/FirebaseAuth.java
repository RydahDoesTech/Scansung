package com.google.firebase.auth;

import E0.d;
import V1.g;
import X1.k;
import X1.s;
import Z1.a;
import Z1.c;
import Z1.f;
import Z1.i;
import Z1.l;
import Z1.r;
import Z1.t;
import Z1.u;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import com.google.android.gms.internal.p000firebaseauthapi.G2;
import com.google.firebase.messaging.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o2.C0717b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class FirebaseAuth implements a {

    /* renamed from: a, reason: collision with root package name */
    public final g f6086a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6087b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f6088c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f6089d;

    /* renamed from: e, reason: collision with root package name */
    public final q f6090e;
    public t f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6091g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6092h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6093i;

    /* renamed from: j, reason: collision with root package name */
    public final d f6094j;

    /* renamed from: k, reason: collision with root package name */
    public final l f6095k;

    /* renamed from: l, reason: collision with root package name */
    public B.g f6096l;

    /* renamed from: m, reason: collision with root package name */
    public final i f6097m;

    /* JADX WARN: Removed duplicated region for block: B:4:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(V1.g r11) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(V1.g):void");
    }

    public static void b(FirebaseAuth firebaseAuth, t tVar) {
        if (tVar != null) {
            String str = tVar.f2897e.f2889d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(str);
            sb.append(" ).");
            Log.d("FirebaseAuth", sb.toString());
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f6097m.execute(new s(firebaseAuth));
    }

    public static void c(FirebaseAuth firebaseAuth, t tVar) {
        if (tVar != null) {
            String str = tVar.f2897e.f2889d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(str);
            sb.append(" ).");
            Log.d("FirebaseAuth", sb.toString());
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String str2 = tVar != null ? tVar.f2896d.f5703e : null;
        C0717b c0717b = new C0717b();
        c0717b.f8243a = str2;
        firebaseAuth.f6097m.execute(new s(firebaseAuth, c0717b));
    }

    public static void d(FirebaseAuth firebaseAuth, t tVar, C0382z4 c0382z4, boolean z4, boolean z5) {
        boolean z6;
        ArrayList arrayList;
        ArrayList arrayList2;
        String string;
        AbstractC0203C.e(tVar);
        AbstractC0203C.e(c0382z4);
        t tVar2 = firebaseAuth.f;
        boolean z7 = true;
        boolean z8 = tVar2 != null && tVar.f2897e.f2889d.equals(tVar2.f2897e.f2889d);
        if (z8 || !z5) {
            t tVar3 = firebaseAuth.f;
            if (tVar3 == null) {
                z6 = true;
            } else {
                boolean z9 = (z8 && tVar3.f2896d.f5703e.equals(c0382z4.f5703e)) ? false : true;
                z6 = true ^ z8;
                z7 = z9;
            }
            t tVar4 = firebaseAuth.f;
            if (tVar4 == null) {
                firebaseAuth.f = tVar;
            } else {
                tVar4.f(tVar.f2899h);
                if (!tVar.e()) {
                    firebaseAuth.f.f2902k = Boolean.FALSE;
                }
                f fVar = tVar.f2905o;
                if (fVar != null) {
                    arrayList = new ArrayList();
                    Iterator it = fVar.f2869d.iterator();
                    while (it.hasNext()) {
                        arrayList.add((k) it.next());
                    }
                } else {
                    arrayList = new ArrayList();
                }
                firebaseAuth.f.g(arrayList);
            }
            if (z4) {
                d dVar = firebaseAuth.f6094j;
                t tVar5 = firebaseAuth.f;
                dVar.getClass();
                AbstractC0203C.e(tVar5);
                JSONObject jSONObject = new JSONObject();
                if (t.class.isAssignableFrom(tVar5.getClass())) {
                    try {
                        jSONObject.put("cachedTokenState", tVar5.f2896d.e());
                        g gVarE = g.e(tVar5.f);
                        gVarE.a();
                        jSONObject.put("applicationName", gVarE.f2611b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (tVar5.f2899h != null) {
                            JSONArray jSONArray = new JSONArray();
                            ArrayList arrayList3 = tVar5.f2899h;
                            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                jSONArray.put(((r) arrayList3.get(i5)).d());
                            }
                            jSONObject.put("userInfos", jSONArray);
                        }
                        jSONObject.put("anonymous", tVar5.e());
                        jSONObject.put("version", "2");
                        u uVar = tVar5.f2903l;
                        if (uVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", uVar.f2906d);
                                jSONObject2.put("creationTimestamp", uVar.f2907e);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        f fVar2 = tVar5.f2905o;
                        if (fVar2 != null) {
                            arrayList2 = new ArrayList();
                            Iterator it2 = fVar2.f2869d.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((k) it2.next());
                            }
                        } else {
                            arrayList2 = new ArrayList();
                        }
                        if (!arrayList2.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                jSONArray2.put(((k) arrayList2.get(i6)).d());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        string = jSONObject.toString();
                    } catch (Exception e5) {
                        A.d dVar2 = (A.d) dVar.f;
                        Log.wtf((String) dVar2.f11b, dVar2.f("Failed to turn object into JSON", new Object[0]), e5);
                        throw new G2(e5);
                    }
                } else {
                    string = null;
                }
                if (!TextUtils.isEmpty(string)) {
                    ((SharedPreferences) dVar.f520e).edit().putString("com.google.firebase.auth.FIREBASE_USER", string).apply();
                }
            }
            if (z7) {
                t tVar6 = firebaseAuth.f;
                if (tVar6 != null) {
                    tVar6.f2896d = c0382z4;
                }
                c(firebaseAuth, tVar6);
            }
            if (z6) {
                b(firebaseAuth, firebaseAuth.f);
            }
            if (z4) {
                d dVar3 = firebaseAuth.f6094j;
                dVar3.getClass();
                ((SharedPreferences) dVar3.f520e).edit().putString(g4.f.d("com.google.firebase.auth.GET_TOKEN_RESPONSE.", tVar.f2897e.f2889d), c0382z4.e()).apply();
            }
            t tVar7 = firebaseAuth.f;
            if (tVar7 != null) {
                if (firebaseAuth.f6096l == null) {
                    g gVar = firebaseAuth.f6086a;
                    AbstractC0203C.e(gVar);
                    firebaseAuth.f6096l = new B.g(gVar);
                }
                B.g gVar2 = firebaseAuth.f6096l;
                C0382z4 c0382z42 = tVar7.f2896d;
                gVar2.getClass();
                if (c0382z42 == null) {
                    return;
                }
                Long l4 = c0382z42.f;
                long jLongValue = l4 == null ? 0L : l4.longValue();
                if (jLongValue <= 0) {
                    jLongValue = 3600;
                }
                long jLongValue2 = c0382z42.f5705h.longValue();
                c cVar = (c) gVar2.f95e;
                cVar.f2863a = (jLongValue * 1000) + jLongValue2;
                cVar.f2864b = -1L;
            }
        }
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) g.d().b(FirebaseAuth.class);
    }

    public final void a() {
        d dVar = this.f6094j;
        AbstractC0203C.e(dVar);
        t tVar = this.f;
        SharedPreferences sharedPreferences = (SharedPreferences) dVar.f520e;
        if (tVar != null) {
            sharedPreferences.edit().remove(g4.f.d("com.google.firebase.auth.GET_TOKEN_RESPONSE.", tVar.f2897e.f2889d)).apply();
            this.f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        c(this, null);
        b(this, null);
        B.g gVar = this.f6096l;
        if (gVar != null) {
            c cVar = (c) gVar.f95e;
            cVar.f2865c.removeCallbacks(cVar.f2866d);
        }
    }

    public static FirebaseAuth getInstance(g gVar) {
        return (FirebaseAuth) gVar.b(FirebaseAuth.class);
    }
}
