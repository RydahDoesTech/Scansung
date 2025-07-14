package com.google.android.gms.internal.p000firebaseauthapi;

import X1.j;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class Q3 extends AbstractC0228a implements R3 {
    public Q3(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks", 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void a() {
        g(p(), 7);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void c(C0382z4 c0382z4, C0364w4 c0364w4) {
        Parcel parcelP = p();
        AbstractC0336s0.b(parcelP, c0382z4);
        AbstractC0336s0.b(parcelP, c0364w4);
        g(parcelP, 2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void d(j jVar) {
        Parcel parcelP = p();
        AbstractC0336s0.b(parcelP, jVar);
        g(parcelP, 10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void i() {
        g(p(), 13);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void j(Status status) {
        Parcel parcelP = p();
        AbstractC0336s0.b(parcelP, status);
        g(parcelP, 5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void m(C0329q4 c0329q4) {
        Parcel parcelP = p();
        AbstractC0336s0.b(parcelP, c0329q4);
        g(parcelP, 3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void n(E4 e42) {
        Parcel parcelP = p();
        AbstractC0336s0.b(parcelP, e42);
        g(parcelP, 4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void r() {
        Parcel parcelP = p();
        parcelP.writeString(null);
        g(parcelP, 9);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void s() {
        Parcel parcelP = p();
        parcelP.writeString(null);
        g(parcelP, 11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void u() {
        g(p(), 6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void v(C0382z4 c0382z4) {
        Parcel parcelP = p();
        AbstractC0336s0.b(parcelP, c0382z4);
        g(parcelP, 1);
    }
}
