package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import android.os.RemoteException;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final R3 f5313a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5314b;

    public H3(R3 r32, d dVar) {
        AbstractC0203C.e(r32);
        this.f5313a = r32;
        AbstractC0203C.e(dVar);
        this.f5314b = dVar;
    }

    public void a() {
        try {
            this.f5313a.r();
        } catch (RemoteException e5) {
            this.f5314b.d("RemoteException when sending send verification code response.", e5, new Object[0]);
        }
    }

    public void b(Status status) {
        try {
            this.f5313a.j(status);
        } catch (RemoteException e5) {
            this.f5314b.d("RemoteException when sending failure result.", e5, new Object[0]);
        }
    }

    public final void c(E4 e42) {
        try {
            this.f5313a.n(e42);
        } catch (RemoteException e5) {
            this.f5314b.d("RemoteException when sending password reset response.", e5, new Object[0]);
        }
    }
}
