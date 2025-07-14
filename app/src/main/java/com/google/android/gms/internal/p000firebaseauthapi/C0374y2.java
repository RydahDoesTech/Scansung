package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374y2 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f5687b = Logger.getLogger(C0374y2.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f5688c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5689d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0374y2 f5690e;
    public static final C0374y2 f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0374y2 f5691g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0374y2 f5692h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0374y2 f5693i;

    /* renamed from: a, reason: collision with root package name */
    public final M f5694a;

    static {
        if (AbstractC0335s.u()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < 2; i5++) {
                String str = strArr[i5];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f5687b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", f.o("Provider ", str, " not available"));
                }
            }
            f5688c = arrayList;
            f5689d = true;
        } else {
            f5688c = new ArrayList();
            f5689d = true;
        }
        f5690e = new C0374y2(new M(4));
        f = new C0374y2(new M(8));
        f5691g = new C0374y2(new M(5));
        f5692h = new C0374y2(new M(7));
        f5693i = new C0374y2(new M(6));
    }

    public C0374y2(M m4) {
        this.f5694a = m4;
    }

    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = f5688c.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            M m4 = this.f5694a;
            if (!zHasNext) {
                if (f5689d) {
                    return m4.b(str, null);
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
            }
            try {
                return m4.b(str, (Provider) it.next());
            } catch (Exception e5) {
                if (exc == null) {
                    exc = e5;
                }
            }
        }
    }
}
