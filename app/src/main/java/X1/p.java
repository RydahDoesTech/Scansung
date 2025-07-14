package X1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.N4;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2741a;

    public /* synthetic */ p(int i5) {
        this.f2741a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2741a) {
            case 0:
                int iS = Y0.j.S(parcel);
                String strU = null;
                String strU2 = null;
                while (parcel.dataPosition() < iS) {
                    int i5 = parcel.readInt();
                    int i6 = 65535 & i5;
                    if (i6 == 1) {
                        strU = Y0.j.u(parcel, i5);
                    } else if (i6 != 2) {
                        Y0.j.R(parcel, i5);
                    } else {
                        strU2 = Y0.j.u(parcel, i5);
                    }
                }
                Y0.j.z(parcel, iS);
                return new i(strU, strU2);
            case 1:
                int iS2 = Y0.j.S(parcel);
                String strU3 = null;
                String strU4 = null;
                String strU5 = null;
                String strU6 = null;
                String strU7 = null;
                boolean zH = false;
                boolean zH2 = false;
                while (parcel.dataPosition() < iS2) {
                    int i7 = parcel.readInt();
                    switch (65535 & i7) {
                        case 1:
                            strU3 = Y0.j.u(parcel, i7);
                            break;
                        case 2:
                            strU4 = Y0.j.u(parcel, i7);
                            break;
                        case 3:
                            zH = Y0.j.H(parcel, i7);
                            break;
                        case 4:
                            strU5 = Y0.j.u(parcel, i7);
                            break;
                        case 5:
                            zH2 = Y0.j.H(parcel, i7);
                            break;
                        case 6:
                            strU6 = Y0.j.u(parcel, i7);
                            break;
                        case 7:
                            strU7 = Y0.j.u(parcel, i7);
                            break;
                        default:
                            Y0.j.R(parcel, i7);
                            break;
                    }
                }
                Y0.j.z(parcel, iS2);
                return new j(strU3, strU4, zH, strU5, zH2, strU6, strU7);
            case 2:
                int iS3 = Y0.j.S(parcel);
                String strU8 = null;
                String strU9 = null;
                String strU10 = null;
                long J4 = 0;
                while (parcel.dataPosition() < iS3) {
                    int i8 = parcel.readInt();
                    int i9 = 65535 & i8;
                    if (i9 == 1) {
                        strU8 = Y0.j.u(parcel, i8);
                    } else if (i9 == 2) {
                        strU9 = Y0.j.u(parcel, i8);
                    } else if (i9 == 3) {
                        J4 = Y0.j.J(parcel, i8);
                    } else if (i9 != 4) {
                        Y0.j.R(parcel, i8);
                    } else {
                        strU10 = Y0.j.u(parcel, i8);
                    }
                }
                Y0.j.z(parcel, iS3);
                return new k(J4, strU8, strU9, strU10);
            case 3:
                int iS4 = Y0.j.S(parcel);
                String strU11 = null;
                while (parcel.dataPosition() < iS4) {
                    int i10 = parcel.readInt();
                    if ((65535 & i10) != 1) {
                        Y0.j.R(parcel, i10);
                    } else {
                        strU11 = Y0.j.u(parcel, i10);
                    }
                }
                Y0.j.z(parcel, iS4);
                return new l(strU11);
            case 4:
                int iS5 = Y0.j.S(parcel);
                String strU12 = null;
                String strU13 = null;
                while (parcel.dataPosition() < iS5) {
                    int i11 = parcel.readInt();
                    int i12 = 65535 & i11;
                    if (i12 == 1) {
                        strU12 = Y0.j.u(parcel, i11);
                    } else if (i12 != 2) {
                        Y0.j.R(parcel, i11);
                    } else {
                        strU13 = Y0.j.u(parcel, i11);
                    }
                }
                Y0.j.z(parcel, iS5);
                return new m(strU12, strU13);
            case 5:
                int iS6 = Y0.j.S(parcel);
                boolean zH3 = false;
                String strU14 = null;
                String strU15 = null;
                boolean zH4 = false;
                while (parcel.dataPosition() < iS6) {
                    int i13 = parcel.readInt();
                    int i14 = 65535 & i13;
                    if (i14 == 2) {
                        strU14 = Y0.j.u(parcel, i13);
                    } else if (i14 == 3) {
                        strU15 = Y0.j.u(parcel, i13);
                    } else if (i14 == 4) {
                        zH3 = Y0.j.H(parcel, i13);
                    } else if (i14 != 5) {
                        Y0.j.R(parcel, i13);
                    } else {
                        zH4 = Y0.j.H(parcel, i13);
                    }
                }
                Y0.j.z(parcel, iS6);
                o oVar = new o();
                oVar.f2737d = strU14;
                oVar.f2738e = strU15;
                oVar.f = zH3;
                oVar.f2739g = zH4;
                oVar.f2740h = TextUtils.isEmpty(strU15) ? null : Uri.parse(strU15);
                return oVar;
            case 6:
                int iS7 = Y0.j.S(parcel);
                String strU16 = null;
                String strU17 = null;
                String strU18 = null;
                String strU19 = null;
                String strU20 = null;
                String strU21 = null;
                String strU22 = null;
                boolean zH5 = false;
                boolean zH6 = false;
                int I4 = 0;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    switch (65535 & i15) {
                        case 1:
                            strU16 = Y0.j.u(parcel, i15);
                            break;
                        case 2:
                            strU17 = Y0.j.u(parcel, i15);
                            break;
                        case 3:
                            strU18 = Y0.j.u(parcel, i15);
                            break;
                        case 4:
                            strU19 = Y0.j.u(parcel, i15);
                            break;
                        case 5:
                            zH5 = Y0.j.H(parcel, i15);
                            break;
                        case 6:
                            strU20 = Y0.j.u(parcel, i15);
                            break;
                        case 7:
                            zH6 = Y0.j.H(parcel, i15);
                            break;
                        case 8:
                            strU21 = Y0.j.u(parcel, i15);
                            break;
                        case 9:
                            I4 = Y0.j.I(parcel, i15);
                            break;
                        case 10:
                            strU22 = Y0.j.u(parcel, i15);
                            break;
                        default:
                            Y0.j.R(parcel, i15);
                            break;
                    }
                }
                Y0.j.z(parcel, iS7);
                return new a(strU16, strU17, strU18, strU19, zH5, strU20, zH6, strU21, I4, strU22);
            case 7:
                int iS8 = Y0.j.S(parcel);
                String strU23 = null;
                String strU24 = null;
                String strU25 = null;
                N4 n42 = null;
                String strU26 = null;
                String strU27 = null;
                String strU28 = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    switch (65535 & i16) {
                        case 1:
                            strU23 = Y0.j.u(parcel, i16);
                            break;
                        case 2:
                            strU24 = Y0.j.u(parcel, i16);
                            break;
                        case 3:
                            strU25 = Y0.j.u(parcel, i16);
                            break;
                        case 4:
                            n42 = (N4) Y0.j.t(parcel, i16, N4.CREATOR);
                            break;
                        case 5:
                            strU26 = Y0.j.u(parcel, i16);
                            break;
                        case 6:
                            strU27 = Y0.j.u(parcel, i16);
                            break;
                        case 7:
                            strU28 = Y0.j.u(parcel, i16);
                            break;
                        default:
                            Y0.j.R(parcel, i16);
                            break;
                    }
                }
                Y0.j.z(parcel, iS8);
                return new r(strU23, strU24, strU25, n42, strU26, strU27, strU28);
            case 8:
                int iS9 = Y0.j.S(parcel);
                String strU29 = null;
                String strU30 = null;
                String strU31 = null;
                String strU32 = null;
                boolean zH7 = false;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    int i18 = 65535 & i17;
                    if (i18 == 1) {
                        strU29 = Y0.j.u(parcel, i17);
                    } else if (i18 == 2) {
                        strU30 = Y0.j.u(parcel, i17);
                    } else if (i18 == 3) {
                        strU31 = Y0.j.u(parcel, i17);
                    } else if (i18 == 4) {
                        strU32 = Y0.j.u(parcel, i17);
                    } else if (i18 != 5) {
                        Y0.j.R(parcel, i17);
                    } else {
                        zH7 = Y0.j.H(parcel, i17);
                    }
                }
                Y0.j.z(parcel, iS9);
                return new d(strU29, strU30, strU31, strU32, zH7);
            case 9:
                int iS10 = Y0.j.S(parcel);
                String strU33 = null;
                while (parcel.dataPosition() < iS10) {
                    int i19 = parcel.readInt();
                    if ((65535 & i19) != 1) {
                        Y0.j.R(parcel, i19);
                    } else {
                        strU33 = Y0.j.u(parcel, i19);
                    }
                }
                Y0.j.z(parcel, iS10);
                return new e(strU33);
            default:
                int iS11 = Y0.j.S(parcel);
                String strU34 = null;
                while (parcel.dataPosition() < iS11) {
                    int i20 = parcel.readInt();
                    if ((65535 & i20) != 1) {
                        Y0.j.R(parcel, i20);
                    } else {
                        strU34 = Y0.j.u(parcel, i20);
                    }
                }
                Y0.j.z(parcel, iS11);
                return new h(strU34);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i5) {
        switch (this.f2741a) {
            case 0:
                return new i[i5];
            case 1:
                return new j[i5];
            case 2:
                return new k[i5];
            case 3:
                return new l[i5];
            case 4:
                return new m[i5];
            case 5:
                return new o[i5];
            case 6:
                return new a[i5];
            case 7:
                return new r[i5];
            case 8:
                return new d[i5];
            case 9:
                return new e[i5];
            default:
                return new h[i5];
        }
    }
}
