package a2;

import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0283j0;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0295l0;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0360w0;
import com.google.android.gms.internal.p000firebaseauthapi.C0258f;
import com.google.android.gms.internal.p000firebaseauthapi.C0278i1;
import com.google.android.gms.internal.p000firebaseauthapi.C0290k1;
import com.google.android.gms.internal.p000firebaseauthapi.C0326q1;
import com.google.android.gms.internal.p000firebaseauthapi.C0337s1;
import com.google.android.gms.internal.p000firebaseauthapi.S0;
import com.google.android.gms.internal.p000firebaseauthapi.U0;
import com.google.android.gms.internal.p000firebaseauthapi.V1;
import com.google.android.gms.internal.p000firebaseauthapi.g5;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103a {

    /* renamed from: a, reason: collision with root package name */
    public int f2980a;

    /* renamed from: b, reason: collision with root package name */
    public int f2981b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f2982c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2983d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2984e;
    public Object f;

    public C0103a(V1 v12) throws GeneralSecurityException {
        String strQ = v12.q();
        this.f2982c = strQ;
        if (strQ.equals(AbstractC0295l0.f5549b)) {
            try {
                C0290k1 c0290k1O = C0290k1.o(v12.p(), g5.a());
                this.f2983d = (C0278i1) AbstractC0283j0.b(v12);
                this.f2980a = c0290k1O.m();
                return;
            } catch (C0258f e5) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e5);
            }
        }
        if (strQ.equals(AbstractC0295l0.f5548a)) {
            try {
                U0 u0N = U0.n(v12.p(), g5.a());
                this.f2984e = (S0) AbstractC0283j0.b(v12);
                int iM = u0N.o().m();
                this.f2981b = iM;
                this.f2980a = iM + u0N.p().m();
                return;
            } catch (C0258f e6) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e6);
            }
        }
        if (!strQ.equals(AbstractC0360w0.f5658a)) {
            throw new GeneralSecurityException(strQ.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strQ) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            C0337s1 c0337s1O = C0337s1.o(v12.p(), g5.a());
            this.f = (C0326q1) AbstractC0283j0.b(v12);
            this.f2980a = c0337s1O.m();
        } catch (C0258f e7) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e7);
        }
    }

    public void a(k kVar) {
        if (((HashSet) this.f2982c).contains(kVar.f3003a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f2983d).add(kVar);
    }

    public C0104b b() {
        if (((e) this.f) != null) {
            return new C0104b(new HashSet((HashSet) this.f2982c), new HashSet((HashSet) this.f2983d), this.f2980a, this.f2981b, (e) this.f, (HashSet) this.f2984e);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public C0103a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2982c = hashSet;
        this.f2983d = new HashSet();
        this.f2980a = 0;
        this.f2981b = 0;
        this.f2984e = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            Y0.j.e("Null interface", cls2);
        }
        Collections.addAll((HashSet) this.f2982c, clsArr);
    }
}
