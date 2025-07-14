package com.google.android.material.datepicker;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j0.C0552u;
import j0.i0;
import j0.j0;
import k.C0599N;
import k.Z0;
import k.n1;
import r1.C0811b;
import r1.C0813d;
import r1.C0814e;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5866a;

    public /* synthetic */ d(int i5) {
        this.f5866a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5866a) {
            case 0:
                return new e(parcel.readLong());
            case 1:
                return q.a(parcel.readInt(), parcel.readInt());
            case 2:
                C0552u c0552u = new C0552u();
                c0552u.f7298d = parcel.readInt();
                c0552u.f7299e = parcel.readInt();
                c0552u.f = parcel.readInt() == 1;
                return c0552u;
            case 3:
                i0 i0Var = new i0();
                i0Var.f7186d = parcel.readInt();
                i0Var.f7187e = parcel.readInt();
                i0Var.f7188g = parcel.readInt() == 1;
                int i5 = parcel.readInt();
                if (i5 > 0) {
                    int[] iArr = new int[i5];
                    i0Var.f = iArr;
                    parcel.readIntArray(iArr);
                }
                return i0Var;
            case 4:
                j0 j0Var = new j0();
                j0Var.f7194d = parcel.readInt();
                j0Var.f7195e = parcel.readInt();
                int i6 = parcel.readInt();
                j0Var.f = i6;
                if (i6 > 0) {
                    int[] iArr2 = new int[i6];
                    j0Var.f7196g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i7 = parcel.readInt();
                j0Var.f7197h = i7;
                if (i7 > 0) {
                    int[] iArr3 = new int[i7];
                    j0Var.f7198i = iArr3;
                    parcel.readIntArray(iArr3);
                }
                j0Var.f7200k = parcel.readInt() == 1;
                j0Var.f7201l = parcel.readInt() == 1;
                j0Var.f7202m = parcel.readInt() == 1;
                j0Var.f7199j = parcel.readArrayList(i0.class.getClassLoader());
                return j0Var;
            case 5:
                C0599N c0599n = new C0599N(parcel);
                c0599n.f7534d = parcel.readByte() != 0;
                return c0599n;
            case 6:
                Z0 z02 = new Z0(parcel);
                z02.f7627d = ((Boolean) parcel.readValue(null)).booleanValue();
                return z02;
            case 7:
                n1 n1Var = new n1(parcel);
                n1Var.f7752d = parcel.readInt();
                n1Var.f7753e = parcel.readInt();
                return n1Var;
            case 8:
                int iS = Y0.j.S(parcel);
                int I4 = 0;
                Intent intent = null;
                int I5 = 0;
                while (parcel.dataPosition() < iS) {
                    int i8 = parcel.readInt();
                    int i9 = 65535 & i8;
                    if (i9 == 1) {
                        I4 = Y0.j.I(parcel, i8);
                    } else if (i9 == 2) {
                        I5 = Y0.j.I(parcel, i8);
                    } else if (i9 != 3) {
                        Y0.j.R(parcel, i8);
                    } else {
                        intent = (Intent) Y0.j.t(parcel, i8, Intent.CREATOR);
                    }
                }
                Y0.j.z(parcel, iS);
                return new C0811b(I4, I5, intent);
            case 9:
                int iS2 = Y0.j.S(parcel);
                int I6 = 0;
                b1.t tVar = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    int i11 = 65535 & i10;
                    if (i11 == 1) {
                        I6 = Y0.j.I(parcel, i10);
                    } else if (i11 != 2) {
                        Y0.j.R(parcel, i10);
                    } else {
                        tVar = (b1.t) Y0.j.t(parcel, i10, b1.t.CREATOR);
                    }
                }
                Y0.j.z(parcel, iS2);
                return new C0813d(I6, tVar);
            default:
                int iS3 = Y0.j.S(parcel);
                int I7 = 0;
                Y0.a aVar = null;
                b1.u uVar = null;
                while (parcel.dataPosition() < iS3) {
                    int i12 = parcel.readInt();
                    int i13 = 65535 & i12;
                    if (i13 == 1) {
                        I7 = Y0.j.I(parcel, i12);
                    } else if (i13 == 2) {
                        aVar = (Y0.a) Y0.j.t(parcel, i12, Y0.a.CREATOR);
                    } else if (i13 != 3) {
                        Y0.j.R(parcel, i12);
                    } else {
                        uVar = (b1.u) Y0.j.t(parcel, i12, b1.u.CREATOR);
                    }
                }
                Y0.j.z(parcel, iS3);
                return new C0814e(I7, aVar, uVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f5866a) {
            case 0:
                return new e[i5];
            case 1:
                return new q[i5];
            case 2:
                return new C0552u[i5];
            case 3:
                return new i0[i5];
            case 4:
                return new j0[i5];
            case 5:
                return new C0599N[i5];
            case 6:
                return new Z0[i5];
            case 7:
                return new n1[i5];
            case 8:
                return new C0811b[i5];
            case 9:
                return new C0813d[i5];
            default:
                return new C0814e[i5];
        }
    }
}
