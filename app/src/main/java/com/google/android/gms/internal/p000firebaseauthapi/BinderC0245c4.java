package com.google.android.gms.internal.p000firebaseauthapi;

import V1.a;
import X1.j;
import android.os.Parcel;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0245c4 extends Z implements R3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0251d4 f5447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0245c4(AbstractC0251d4 abstractC0251d4) {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks", 0);
        this.f5447b = abstractC0251d4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void a() {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 6;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void c(C0382z4 c0382z4, C0364w4 c0364w4) {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 2;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        abstractC0251d4.f5461g = c0382z4;
        abstractC0251d4.f5462h = c0364w4;
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void d(j jVar) {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        abstractC0251d4.f5465k = true;
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void i() {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 9;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void j(Status status) {
        String str = status.f;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null);
            }
        }
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        if (abstractC0251d4.f5456a == 8) {
            abstractC0251d4.f5465k = true;
            throw null;
        }
        Z1.j jVar = abstractC0251d4.f;
        if (jVar != null) {
            jVar.a(status);
        }
        abstractC0251d4.f(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void m(C0329q4 c0329q4) {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 3;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void n(E4 e42) {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 4;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void r() {
        int i5 = this.f5447b.f5456a;
        boolean z4 = i5 == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void s() {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        abstractC0251d4.f5465k = true;
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void u() {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 5;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.R3
    public final void v(C0382z4 c0382z4) {
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        int i5 = abstractC0251d4.f5456a;
        boolean z4 = i5 == 1;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i5);
        AbstractC0203C.g(sb.toString(), z4);
        abstractC0251d4.f5461g = c0382z4;
        AbstractC0251d4.e(abstractC0251d4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z
    public final boolean y(int i5, Parcel parcel, Parcel parcel2) {
        boolean z4;
        AbstractC0251d4 abstractC0251d4 = this.f5447b;
        switch (i5) {
            case 1:
                v((C0382z4) AbstractC0336s0.a(parcel, C0382z4.CREATOR));
                return true;
            case 2:
                c((C0382z4) AbstractC0336s0.a(parcel, C0382z4.CREATOR), (C0364w4) AbstractC0336s0.a(parcel, C0364w4.CREATOR));
                return true;
            case 3:
                m((C0329q4) AbstractC0336s0.a(parcel, C0329q4.CREATOR));
                return true;
            case 4:
                n((E4) AbstractC0336s0.a(parcel, E4.CREATOR));
                return true;
            case 5:
                j((Status) AbstractC0336s0.a(parcel, Status.CREATOR));
                return true;
            case 6:
                u();
                return true;
            case 7:
                a();
                return true;
            case 8:
                parcel.readString();
                int i6 = abstractC0251d4.f5456a;
                z4 = i6 == 7;
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unexpected response type ");
                sb.append(i6);
                AbstractC0203C.g(sb.toString(), z4);
                AbstractC0251d4.e(abstractC0251d4);
                return true;
            case 9:
                parcel.readString();
                r();
                throw null;
            case 10:
                d((j) AbstractC0336s0.a(parcel, j.CREATOR));
                throw null;
            case 11:
                parcel.readString();
                s();
                throw null;
            case 12:
                Status status = (Status) AbstractC0336s0.a(parcel, Status.CREATOR);
                j jVar = (j) AbstractC0336s0.a(parcel, j.CREATOR);
                int i7 = abstractC0251d4.f5456a;
                z4 = i7 == 2;
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unexpected response type ");
                sb2.append(i7);
                AbstractC0203C.g(sb2.toString(), z4);
                Z1.j jVar2 = abstractC0251d4.f;
                if (jVar2 != null) {
                    jVar2.a(status);
                }
                abstractC0251d4.f5463i = jVar;
                Z1.j jVar3 = abstractC0251d4.f;
                if (jVar3 != null) {
                    jVar3.a(status);
                }
                abstractC0251d4.f(status);
                return true;
            case 13:
                i();
                return true;
            case 14:
                C0322p3 c0322p3 = (C0322p3) AbstractC0336s0.a(parcel, C0322p3.CREATOR);
                Status status2 = c0322p3.f5587d;
                Z1.j jVar4 = abstractC0251d4.f;
                if (jVar4 != null) {
                    jVar4.a(status2);
                }
                abstractC0251d4.f5463i = c0322p3.f5588e;
                Z1.j jVar5 = abstractC0251d4.f;
                if (jVar5 != null) {
                    jVar5.a(status2);
                }
                abstractC0251d4.f(status2);
                return true;
            case 15:
                abstractC0251d4.f5464j = (C0328q3) AbstractC0336s0.a(parcel, C0328q3.CREATOR);
                abstractC0251d4.f(a.q0("REQUIRES_SECOND_FACTOR_AUTH"));
                return true;
            default:
                return false;
        }
    }
}
