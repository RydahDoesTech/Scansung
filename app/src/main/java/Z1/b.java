package Z1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2861a;

    public /* synthetic */ b(int i5) {
        this.f2861a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2861a) {
            case 0:
                int iS = Y0.j.S(parcel);
                long J4 = 0;
                long J5 = 0;
                while (parcel.dataPosition() < iS) {
                    int i5 = parcel.readInt();
                    int i6 = 65535 & i5;
                    if (i6 == 1) {
                        J4 = Y0.j.J(parcel, i5);
                    } else if (i6 != 2) {
                        Y0.j.R(parcel, i5);
                    } else {
                        J5 = Y0.j.J(parcel, i5);
                    }
                }
                Y0.j.z(parcel, iS);
                return new u(J4, J5);
            case 1:
                int iS2 = Y0.j.S(parcel);
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iS2) {
                    int i7 = parcel.readInt();
                    if ((65535 & i7) != 1) {
                        Y0.j.R(parcel, i7);
                    } else {
                        arrayListX = Y0.j.x(parcel, i7, X1.k.CREATOR);
                    }
                }
                Y0.j.z(parcel, iS2);
                return new f(arrayListX);
            case 2:
                int iS3 = Y0.j.S(parcel);
                String strU = null;
                boolean zH = false;
                String strU2 = null;
                while (parcel.dataPosition() < iS3) {
                    int i8 = parcel.readInt();
                    int i9 = 65535 & i8;
                    if (i9 == 1) {
                        strU = Y0.j.u(parcel, i8);
                    } else if (i9 == 2) {
                        strU2 = Y0.j.u(parcel, i8);
                    } else if (i9 != 3) {
                        Y0.j.R(parcel, i8);
                    } else {
                        zH = Y0.j.H(parcel, i8);
                    }
                }
                Y0.j.z(parcel, iS3);
                return new p(strU, strU2, zH);
            case 3:
                int iS4 = Y0.j.S(parcel);
                t tVar = null;
                p pVar = null;
                X1.r rVar = null;
                while (parcel.dataPosition() < iS4) {
                    int i10 = parcel.readInt();
                    int i11 = 65535 & i10;
                    if (i11 == 1) {
                        tVar = (t) Y0.j.t(parcel, i10, t.CREATOR);
                    } else if (i11 == 2) {
                        pVar = (p) Y0.j.t(parcel, i10, p.CREATOR);
                    } else if (i11 != 3) {
                        Y0.j.R(parcel, i10);
                    } else {
                        rVar = (X1.r) Y0.j.t(parcel, i10, X1.r.CREATOR);
                    }
                }
                Y0.j.z(parcel, iS4);
                q qVar = new q();
                qVar.f2887d = tVar;
                qVar.f2888e = pVar;
                qVar.f = rVar;
                return qVar;
            case 4:
                int iS5 = Y0.j.S(parcel);
                String strU3 = null;
                String strU4 = null;
                String strU5 = null;
                String strU6 = null;
                String strU7 = null;
                String strU8 = null;
                String strU9 = null;
                boolean zH2 = false;
                while (parcel.dataPosition() < iS5) {
                    int i12 = parcel.readInt();
                    switch (65535 & i12) {
                        case 1:
                            strU3 = Y0.j.u(parcel, i12);
                            break;
                        case 2:
                            strU4 = Y0.j.u(parcel, i12);
                            break;
                        case 3:
                            strU7 = Y0.j.u(parcel, i12);
                            break;
                        case 4:
                            strU6 = Y0.j.u(parcel, i12);
                            break;
                        case 5:
                            strU5 = Y0.j.u(parcel, i12);
                            break;
                        case 6:
                            strU8 = Y0.j.u(parcel, i12);
                            break;
                        case 7:
                            zH2 = Y0.j.H(parcel, i12);
                            break;
                        case 8:
                            strU9 = Y0.j.u(parcel, i12);
                            break;
                        default:
                            Y0.j.R(parcel, i12);
                            break;
                    }
                }
                Y0.j.z(parcel, iS5);
                return new r(strU3, strU4, strU5, strU6, strU7, strU8, zH2, strU9);
            default:
                int iS6 = Y0.j.S(parcel);
                boolean zH3 = false;
                C0382z4 c0382z4 = null;
                r rVar2 = null;
                String strU10 = null;
                String strU11 = null;
                ArrayList arrayListX2 = null;
                ArrayList arrayListV = null;
                String strU12 = null;
                Boolean boolValueOf = null;
                u uVar = null;
                X1.r rVar3 = null;
                f fVar = null;
                while (parcel.dataPosition() < iS6) {
                    int i13 = parcel.readInt();
                    switch (i13 & 65535) {
                        case 1:
                            c0382z4 = (C0382z4) Y0.j.t(parcel, i13, C0382z4.CREATOR);
                            break;
                        case 2:
                            rVar2 = (r) Y0.j.t(parcel, i13, r.CREATOR);
                            break;
                        case 3:
                            strU10 = Y0.j.u(parcel, i13);
                            break;
                        case 4:
                            strU11 = Y0.j.u(parcel, i13);
                            break;
                        case 5:
                            arrayListX2 = Y0.j.x(parcel, i13, r.CREATOR);
                            break;
                        case 6:
                            arrayListV = Y0.j.v(parcel, i13);
                            break;
                        case 7:
                            strU12 = Y0.j.u(parcel, i13);
                            break;
                        case 8:
                            int iK = Y0.j.K(parcel, i13);
                            if (iK != 0) {
                                Y0.j.V(parcel, iK, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case 9:
                            uVar = (u) Y0.j.t(parcel, i13, u.CREATOR);
                            break;
                        case 10:
                            zH3 = Y0.j.H(parcel, i13);
                            break;
                        case 11:
                            rVar3 = (X1.r) Y0.j.t(parcel, i13, X1.r.CREATOR);
                            break;
                        case 12:
                            fVar = (f) Y0.j.t(parcel, i13, f.CREATOR);
                            break;
                        default:
                            Y0.j.R(parcel, i13);
                            break;
                    }
                }
                Y0.j.z(parcel, iS6);
                return new t(c0382z4, rVar2, strU10, strU11, arrayListX2, arrayListV, strU12, boolValueOf, uVar, zH3, rVar3, fVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i5) {
        switch (this.f2861a) {
            case 0:
                return new u[i5];
            case 1:
                return new f[i5];
            case 2:
                return new p[i5];
            case 3:
                return new q[i5];
            case 4:
                return new r[i5];
            default:
                return new t[i5];
        }
    }
}
