package com.google.android.gms.internal.p000firebaseauthapi;

import X0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class B2 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f5266a;

    public B2(j jVar) {
        this.f5266a = jVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        j jVar = this.f5266a;
        try {
            Mac mac = (Mac) C0374y2.f.a((String) jVar.f);
            mac.init((SecretKeySpec) jVar.f2698g);
            return mac;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
