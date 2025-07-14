package com.google.android.gms.internal.p000firebaseauthapi;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class J extends K {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Unsafe unsafe, int i5) {
        super(unsafe);
        this.f5318b = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final double a(long j5, Object obj) {
        switch (this.f5318b) {
        }
        return Double.longBitsToDouble(k(j5, obj));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final float b(long j5, Object obj) {
        switch (this.f5318b) {
        }
        return Float.intBitsToFloat(j(j5, obj));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final void c(Object obj, long j5, boolean z4) {
        switch (this.f5318b) {
            case 0:
                if (!L.f5341g) {
                    L.c(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    L.b(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!L.f5341g) {
                    L.c(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    L.b(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final void d(Object obj, long j5, byte b2) {
        switch (this.f5318b) {
            case 0:
                if (!L.f5341g) {
                    L.c(obj, j5, b2);
                    break;
                } else {
                    L.b(obj, j5, b2);
                    break;
                }
            default:
                if (!L.f5341g) {
                    L.c(obj, j5, b2);
                    break;
                } else {
                    L.b(obj, j5, b2);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final void e(Object obj, long j5, double d5) {
        switch (this.f5318b) {
            case 0:
                o(obj, j5, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j5, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final void f(Object obj, long j5, float f) {
        switch (this.f5318b) {
            case 0:
                n(Float.floatToIntBits(f), j5, obj);
                break;
            default:
                n(Float.floatToIntBits(f), j5, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K
    public final boolean g(long j5, Object obj) {
        switch (this.f5318b) {
            case 0:
                if (!L.f5341g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!L.f5341g) {
                    break;
                } else {
                    break;
                }
        }
        return L.t(j5, obj);
    }
}
