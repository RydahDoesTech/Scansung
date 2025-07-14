package com.google.android.gms.internal.p000firebaseauthapi;

import V1.a;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333r3 implements InterfaceC0257e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H3 f5611e;

    public /* synthetic */ C0333r3(C0306n c0306n, H3 h3, int i5) {
        this.f5610d = i5;
        this.f5611e = h3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public final void b(String str) {
        switch (this.f5610d) {
            case 0:
                this.f5611e.b(a.q0(str));
                break;
            case 1:
                this.f5611e.b(a.q0(str));
                break;
            case 2:
                this.f5611e.b(a.q0(str));
                break;
            case 3:
                this.f5611e.b(a.q0(str));
                break;
            case 4:
                this.f5611e.b(a.q0(str));
                break;
            case 5:
                this.f5611e.b(a.q0(str));
                break;
            case 6:
                this.f5611e.b(a.q0(str));
                break;
            case 7:
                this.f5611e.b(a.q0(str));
                break;
            case 8:
                this.f5611e.b(a.q0(str));
                break;
            case 9:
                this.f5611e.b(a.q0(str));
                break;
            case 10:
                this.f5611e.b(a.q0(str));
                break;
            case 11:
                this.f5611e.b(a.q0(str));
                break;
            case 12:
                this.f5611e.b(a.q0(str));
                break;
            default:
                this.f5611e.b(a.q0(str));
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public final void e(Z3 z32) {
        switch (this.f5610d) {
            case 0:
                if (z32 != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 1:
                z32.getClass();
                throw new ClassCastException();
            case 2:
                z32.getClass();
                throw new ClassCastException();
            case 3:
                C0329q4 c0329q4 = (C0329q4) z32;
                H3 h3 = this.f5611e;
                try {
                    h3.f5313a.m(c0329q4);
                    return;
                } catch (RemoteException e5) {
                    h3.f5314b.d("RemoteException when sending create auth uri response.", e5, new Object[0]);
                    return;
                }
            case 4:
                if (z32 != null) {
                    throw new ClassCastException();
                }
                this.f5611e.c(null);
                return;
            case 5:
                this.f5611e.c((E4) z32);
                return;
            case 6:
                C0382z4 c0382z4 = (C0382z4) z32;
                H3 h32 = this.f5611e;
                try {
                    h32.f5313a.v(c0382z4);
                    return;
                } catch (RemoteException e6) {
                    h32.f5314b.d("RemoteException when sending token result.", e6, new Object[0]);
                    return;
                }
            case 7:
                this.f5611e.c((E4) z32);
                return;
            case 8:
                if (z32 != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 9:
                z32.getClass();
                throw new ClassCastException();
            case 10:
                if (z32 != null) {
                    throw new ClassCastException();
                }
                H3 h33 = this.f5611e;
                try {
                    h33.f5313a.a();
                    return;
                } catch (RemoteException e7) {
                    h33.f5314b.d("RemoteException when sending email verification response.", e7, new Object[0]);
                    return;
                }
            case 11:
                z32.getClass();
                throw new ClassCastException();
            case 12:
                if (z32 != null) {
                    throw new ClassCastException();
                }
                throw null;
            default:
                z32.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ C0333r3(H3 h3, int i5) {
        this.f5610d = i5;
        this.f5611e = h3;
    }
}
