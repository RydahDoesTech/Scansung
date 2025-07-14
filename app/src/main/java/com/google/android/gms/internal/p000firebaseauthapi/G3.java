package com.google.android.gms.internal.p000firebaseauthapi;

import Y0.e;
import Z0.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import b1.AbstractC0203C;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class G3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final X3 f5308a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5309b;

    public G3(Context context, X3 x32) {
        this.f5308a = x32;
        this.f5309b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        e eVar = e.f2816c;
        Context context = this.f5309b;
        eVar.b(context, 12451000);
        String str = this.f5308a.f5409e;
        AbstractC0203C.c(str);
        X3 x32 = new X3(str);
        x32.f5408d = true;
        return new C0357v3(new C0363w3(context, AbstractC0335s.f5616c, x32, new b(new O1.e(6), Looper.getMainLooper())));
    }
}
