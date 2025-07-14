package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0229a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f5421a = new CopyOnWriteArrayList();

    public static G0 a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        Iterator it = f5421a.iterator();
        while (it.hasNext()) {
            G0 g0 = (G0) it.next();
            synchronized (g0) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return g0;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}
