package com.google.android.gms.internal.p000firebaseauthapi;

import X1.a;
import X1.d;
import X1.k;
import Y0.j;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class I2 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5317a;

    public /* synthetic */ I2(int i5) {
        this.f5317a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5317a) {
            case 0:
                int iS = j.S(parcel);
                String strU = null;
                String strU2 = null;
                while (parcel.dataPosition() < iS) {
                    int i5 = parcel.readInt();
                    int i6 = 65535 & i5;
                    if (i6 == 1) {
                        strU = j.u(parcel, i5);
                    } else if (i6 != 2) {
                        j.R(parcel, i5);
                    } else {
                        strU2 = j.u(parcel, i5);
                    }
                }
                j.z(parcel, iS);
                return new H2(strU, strU2);
            case 1:
                int iS2 = j.S(parcel);
                String strU3 = null;
                String strU4 = null;
                while (parcel.dataPosition() < iS2) {
                    int i7 = parcel.readInt();
                    int i8 = 65535 & i7;
                    if (i8 == 1) {
                        strU3 = j.u(parcel, i7);
                    } else if (i8 != 2) {
                        j.R(parcel, i7);
                    } else {
                        strU4 = j.u(parcel, i7);
                    }
                }
                j.z(parcel, iS2);
                return new J2(strU3, strU4);
            case 2:
                int iS3 = j.S(parcel);
                String strU5 = null;
                String strU6 = null;
                while (parcel.dataPosition() < iS3) {
                    int i9 = parcel.readInt();
                    int i10 = 65535 & i9;
                    if (i10 == 1) {
                        strU5 = j.u(parcel, i9);
                    } else if (i10 != 2) {
                        j.R(parcel, i9);
                    } else {
                        strU6 = j.u(parcel, i9);
                    }
                }
                j.z(parcel, iS3);
                return new K2(strU5, strU6);
            case 3:
                int iS4 = j.S(parcel);
                String strU7 = null;
                String strU8 = null;
                while (parcel.dataPosition() < iS4) {
                    int i11 = parcel.readInt();
                    int i12 = 65535 & i11;
                    if (i12 == 1) {
                        strU7 = j.u(parcel, i11);
                    } else if (i12 != 2) {
                        j.R(parcel, i11);
                    } else {
                        strU8 = j.u(parcel, i11);
                    }
                }
                j.z(parcel, iS4);
                return new L2(strU7, strU8);
            case 4:
                int iS5 = j.S(parcel);
                String strU9 = null;
                String strU10 = null;
                String strU11 = null;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    int i14 = 65535 & i13;
                    if (i14 == 1) {
                        strU9 = j.u(parcel, i13);
                    } else if (i14 == 2) {
                        strU10 = j.u(parcel, i13);
                    } else if (i14 != 3) {
                        j.R(parcel, i13);
                    } else {
                        strU11 = j.u(parcel, i13);
                    }
                }
                j.z(parcel, iS5);
                return new M2(strU9, strU10, strU11);
            case 5:
                int iS6 = j.S(parcel);
                String strU12 = null;
                String strU13 = null;
                String strU14 = null;
                while (parcel.dataPosition() < iS6) {
                    int i15 = parcel.readInt();
                    int i16 = 65535 & i15;
                    if (i16 == 1) {
                        strU12 = j.u(parcel, i15);
                    } else if (i16 == 2) {
                        strU13 = j.u(parcel, i15);
                    } else if (i16 != 3) {
                        j.R(parcel, i15);
                    } else {
                        strU14 = j.u(parcel, i15);
                    }
                }
                j.z(parcel, iS6);
                return new N2(strU12, strU13, strU14);
            case 6:
                int iS7 = j.S(parcel);
                String strU15 = null;
                while (parcel.dataPosition() < iS7) {
                    int i17 = parcel.readInt();
                    if ((65535 & i17) != 1) {
                        j.R(parcel, i17);
                    } else {
                        strU15 = j.u(parcel, i17);
                    }
                }
                j.z(parcel, iS7);
                return new O2(strU15);
            case 7:
                int iS8 = j.S(parcel);
                X1.j jVar = null;
                String strU16 = null;
                String strU17 = null;
                while (parcel.dataPosition() < iS8) {
                    int i18 = parcel.readInt();
                    int i19 = 65535 & i18;
                    if (i19 == 1) {
                        jVar = (X1.j) j.t(parcel, i18, X1.j.CREATOR);
                    } else if (i19 == 2) {
                        strU16 = j.u(parcel, i18);
                    } else if (i19 != 3) {
                        j.R(parcel, i18);
                    } else {
                        strU17 = j.u(parcel, i18);
                    }
                }
                j.z(parcel, iS8);
                return new P2(jVar, strU16, strU17);
            case 8:
                int iS9 = j.S(parcel);
                X1.j jVar2 = null;
                String strU18 = null;
                while (parcel.dataPosition() < iS9) {
                    int i20 = parcel.readInt();
                    int i21 = 65535 & i20;
                    if (i21 == 1) {
                        jVar2 = (X1.j) j.t(parcel, i20, X1.j.CREATOR);
                    } else if (i21 != 2) {
                        j.R(parcel, i20);
                    } else {
                        strU18 = j.u(parcel, i20);
                    }
                }
                j.z(parcel, iS9);
                return new Q2(jVar2, strU18);
            case 9:
                int iS10 = j.S(parcel);
                String strU19 = null;
                while (parcel.dataPosition() < iS10) {
                    int i22 = parcel.readInt();
                    if ((65535 & i22) != 1) {
                        j.R(parcel, i22);
                    } else {
                        strU19 = j.u(parcel, i22);
                    }
                }
                j.z(parcel, iS10);
                return new R2(strU19);
            case 10:
                int iS11 = j.S(parcel);
                String strU20 = null;
                String strU21 = null;
                while (parcel.dataPosition() < iS11) {
                    int i23 = parcel.readInt();
                    int i24 = 65535 & i23;
                    if (i24 == 1) {
                        strU20 = j.u(parcel, i23);
                    } else if (i24 != 2) {
                        j.R(parcel, i23);
                    } else {
                        strU21 = j.u(parcel, i23);
                    }
                }
                j.z(parcel, iS11);
                return new S2(strU20, strU21);
            case 11:
                int iS12 = j.S(parcel);
                String strU22 = null;
                String strU23 = null;
                String strU24 = null;
                while (parcel.dataPosition() < iS12) {
                    int i25 = parcel.readInt();
                    int i26 = 65535 & i25;
                    if (i26 == 1) {
                        strU22 = j.u(parcel, i25);
                    } else if (i26 == 2) {
                        strU23 = j.u(parcel, i25);
                    } else if (i26 != 3) {
                        j.R(parcel, i25);
                    } else {
                        strU24 = j.u(parcel, i25);
                    }
                }
                j.z(parcel, iS12);
                return new T2(strU22, strU23, strU24);
            case 12:
                int iS13 = j.S(parcel);
                String strU25 = null;
                N4 n42 = null;
                while (parcel.dataPosition() < iS13) {
                    int i27 = parcel.readInt();
                    int i28 = 65535 & i27;
                    if (i28 == 1) {
                        strU25 = j.u(parcel, i27);
                    } else if (i28 != 2) {
                        j.R(parcel, i27);
                    } else {
                        n42 = (N4) j.t(parcel, i27, N4.CREATOR);
                    }
                }
                j.z(parcel, iS13);
                return new U2(strU25, n42);
            case 13:
                int iS14 = j.S(parcel);
                String strU26 = null;
                X1.j jVar3 = null;
                while (parcel.dataPosition() < iS14) {
                    int i29 = parcel.readInt();
                    int i30 = 65535 & i29;
                    if (i30 == 1) {
                        strU26 = j.u(parcel, i29);
                    } else if (i30 != 2) {
                        j.R(parcel, i29);
                    } else {
                        jVar3 = (X1.j) j.t(parcel, i29, X1.j.CREATOR);
                    }
                }
                j.z(parcel, iS14);
                return new V2(jVar3, strU26);
            case 14:
                int iS15 = j.S(parcel);
                String strU27 = null;
                while (parcel.dataPosition() < iS15) {
                    int i31 = parcel.readInt();
                    if ((65535 & i31) != 1) {
                        j.R(parcel, i31);
                    } else {
                        strU27 = j.u(parcel, i31);
                    }
                }
                j.z(parcel, iS15);
                return new W2(strU27);
            case 15:
                int iS16 = j.S(parcel);
                String strU28 = null;
                a aVar = null;
                while (parcel.dataPosition() < iS16) {
                    int i32 = parcel.readInt();
                    int i33 = 65535 & i32;
                    if (i33 == 1) {
                        strU28 = j.u(parcel, i32);
                    } else if (i33 != 2) {
                        j.R(parcel, i32);
                    } else {
                        aVar = (a) j.t(parcel, i32, a.CREATOR);
                    }
                }
                j.z(parcel, iS16);
                return new X2(strU28, aVar);
            case 16:
                int iS17 = j.S(parcel);
                String strU29 = null;
                a aVar2 = null;
                String strU30 = null;
                while (parcel.dataPosition() < iS17) {
                    int i34 = parcel.readInt();
                    int i35 = 65535 & i34;
                    if (i35 == 1) {
                        strU29 = j.u(parcel, i34);
                    } else if (i35 == 2) {
                        aVar2 = (a) j.t(parcel, i34, a.CREATOR);
                    } else if (i35 != 3) {
                        j.R(parcel, i34);
                    } else {
                        strU30 = j.u(parcel, i34);
                    }
                }
                j.z(parcel, iS17);
                return new Y2(aVar2, strU29, strU30);
            case 17:
                int iS18 = j.S(parcel);
                F4 f42 = null;
                while (parcel.dataPosition() < iS18) {
                    int i36 = parcel.readInt();
                    if ((65535 & i36) != 1) {
                        j.R(parcel, i36);
                    } else {
                        f42 = (F4) j.t(parcel, i36, F4.CREATOR);
                    }
                }
                j.z(parcel, iS18);
                return new Z2(f42);
            case 18:
                int iS19 = j.S(parcel);
                String strU31 = null;
                while (parcel.dataPosition() < iS19) {
                    int i37 = parcel.readInt();
                    if ((65535 & i37) != 1) {
                        j.R(parcel, i37);
                    } else {
                        strU31 = j.u(parcel, i37);
                    }
                }
                j.z(parcel, iS19);
                return new C0232a3(strU31);
            case 19:
                int iS20 = j.S(parcel);
                String strU32 = null;
                while (parcel.dataPosition() < iS20) {
                    int i38 = parcel.readInt();
                    if ((65535 & i38) != 1) {
                        j.R(parcel, i38);
                    } else {
                        strU32 = j.u(parcel, i38);
                    }
                }
                j.z(parcel, iS20);
                return new C0238b3(strU32);
            case 20:
                int iS21 = j.S(parcel);
                N4 n43 = null;
                while (parcel.dataPosition() < iS21) {
                    int i39 = parcel.readInt();
                    if ((65535 & i39) != 1) {
                        j.R(parcel, i39);
                    } else {
                        n43 = (N4) j.t(parcel, i39, N4.CREATOR);
                    }
                }
                j.z(parcel, iS21);
                return new C0244c3(n43);
            case 21:
                int iS22 = j.S(parcel);
                String strU33 = null;
                String strU34 = null;
                while (parcel.dataPosition() < iS22) {
                    int i40 = parcel.readInt();
                    int i41 = 65535 & i40;
                    if (i41 == 1) {
                        strU33 = j.u(parcel, i40);
                    } else if (i41 != 2) {
                        j.R(parcel, i40);
                    } else {
                        strU34 = j.u(parcel, i40);
                    }
                }
                j.z(parcel, iS22);
                return new C0250d3(strU33, strU34);
            case 22:
                int iS23 = j.S(parcel);
                String strU35 = null;
                String strU36 = null;
                String strU37 = null;
                while (parcel.dataPosition() < iS23) {
                    int i42 = parcel.readInt();
                    int i43 = 65535 & i42;
                    if (i43 == 1) {
                        strU35 = j.u(parcel, i42);
                    } else if (i43 == 2) {
                        strU36 = j.u(parcel, i42);
                    } else if (i43 != 3) {
                        j.R(parcel, i42);
                    } else {
                        strU37 = j.u(parcel, i42);
                    }
                }
                j.z(parcel, iS23);
                return new C0256e3(strU35, strU36, strU37);
            case 23:
                int iS24 = j.S(parcel);
                d dVar = null;
                while (parcel.dataPosition() < iS24) {
                    int i44 = parcel.readInt();
                    if ((65535 & i44) != 1) {
                        j.R(parcel, i44);
                    } else {
                        dVar = (d) j.t(parcel, i44, d.CREATOR);
                    }
                }
                j.z(parcel, iS24);
                return new C0262f3(dVar);
            case 24:
                int iS25 = j.S(parcel);
                X1.j jVar4 = null;
                String strU38 = null;
                while (parcel.dataPosition() < iS25) {
                    int i45 = parcel.readInt();
                    int i46 = 65535 & i45;
                    if (i46 == 1) {
                        jVar4 = (X1.j) j.t(parcel, i45, X1.j.CREATOR);
                    } else if (i46 != 2) {
                        j.R(parcel, i45);
                    } else {
                        strU38 = j.u(parcel, i45);
                    }
                }
                j.z(parcel, iS25);
                return new C0268g3(jVar4, strU38);
            case 25:
                int iS26 = j.S(parcel);
                String strU39 = null;
                String strU40 = null;
                String strU41 = null;
                String strU42 = null;
                String strU43 = null;
                long J4 = 0;
                boolean zH = false;
                boolean zH2 = false;
                boolean zH3 = false;
                while (parcel.dataPosition() < iS26) {
                    int i47 = parcel.readInt();
                    switch (65535 & i47) {
                        case 1:
                            strU39 = j.u(parcel, i47);
                            break;
                        case 2:
                            strU40 = j.u(parcel, i47);
                            break;
                        case 3:
                            strU41 = j.u(parcel, i47);
                            break;
                        case 4:
                            J4 = j.J(parcel, i47);
                            break;
                        case 5:
                            zH = j.H(parcel, i47);
                            break;
                        case 6:
                            zH2 = j.H(parcel, i47);
                            break;
                        case 7:
                            strU42 = j.u(parcel, i47);
                            break;
                        case 8:
                            strU43 = j.u(parcel, i47);
                            break;
                        case 9:
                            zH3 = j.H(parcel, i47);
                            break;
                        default:
                            j.R(parcel, i47);
                            break;
                    }
                }
                j.z(parcel, iS26);
                return new C0274h3(strU39, strU40, strU41, J4, zH, zH2, strU42, strU43, zH3);
            case 26:
                int iS27 = j.S(parcel);
                k kVar = null;
                String strU44 = null;
                String strU45 = null;
                String strU46 = null;
                String strU47 = null;
                long J5 = 0;
                boolean zH4 = false;
                boolean zH5 = false;
                boolean zH6 = false;
                while (parcel.dataPosition() < iS27) {
                    int i48 = parcel.readInt();
                    switch (65535 & i48) {
                        case 1:
                            kVar = (k) j.t(parcel, i48, k.CREATOR);
                            break;
                        case 2:
                            strU44 = j.u(parcel, i48);
                            break;
                        case 3:
                            strU45 = j.u(parcel, i48);
                            break;
                        case 4:
                            J5 = j.J(parcel, i48);
                            break;
                        case 5:
                            zH4 = j.H(parcel, i48);
                            break;
                        case 6:
                            zH5 = j.H(parcel, i48);
                            break;
                        case 7:
                            strU46 = j.u(parcel, i48);
                            break;
                        case 8:
                            strU47 = j.u(parcel, i48);
                            break;
                        case 9:
                            zH6 = j.H(parcel, i48);
                            break;
                        default:
                            j.R(parcel, i48);
                            break;
                    }
                }
                j.z(parcel, iS27);
                return new C0280i3(kVar, strU44, strU45, J5, zH4, zH5, strU46, strU47, zH6);
            case 27:
                int iS28 = j.S(parcel);
                String strU48 = null;
                String strU49 = null;
                while (parcel.dataPosition() < iS28) {
                    int i49 = parcel.readInt();
                    int i50 = 65535 & i49;
                    if (i50 == 1) {
                        strU48 = j.u(parcel, i49);
                    } else if (i50 != 2) {
                        j.R(parcel, i49);
                    } else {
                        strU49 = j.u(parcel, i49);
                    }
                }
                j.z(parcel, iS28);
                return new C0286j3(strU48, strU49);
            case 28:
                int iS29 = j.S(parcel);
                String strU50 = null;
                while (parcel.dataPosition() < iS29) {
                    int i51 = parcel.readInt();
                    if ((65535 & i51) != 1) {
                        j.R(parcel, i51);
                    } else {
                        strU50 = j.u(parcel, i51);
                    }
                }
                j.z(parcel, iS29);
                return new C0292k3(strU50);
            default:
                int iS30 = j.S(parcel);
                String strU51 = null;
                String strU52 = null;
                while (parcel.dataPosition() < iS30) {
                    int i52 = parcel.readInt();
                    int i53 = 65535 & i52;
                    if (i53 == 1) {
                        strU51 = j.u(parcel, i52);
                    } else if (i53 != 2) {
                        j.R(parcel, i52);
                    } else {
                        strU52 = j.u(parcel, i52);
                    }
                }
                j.z(parcel, iS30);
                return new C0298l3(strU51, strU52);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i5) {
        switch (this.f5317a) {
            case 0:
                return new H2[i5];
            case 1:
                return new J2[i5];
            case 2:
                return new K2[i5];
            case 3:
                return new L2[i5];
            case 4:
                return new M2[i5];
            case 5:
                return new N2[i5];
            case 6:
                return new O2[i5];
            case 7:
                return new P2[i5];
            case 8:
                return new Q2[i5];
            case 9:
                return new R2[i5];
            case 10:
                return new S2[i5];
            case 11:
                return new T2[i5];
            case 12:
                return new U2[i5];
            case 13:
                return new V2[i5];
            case 14:
                return new W2[i5];
            case 15:
                return new X2[i5];
            case 16:
                return new Y2[i5];
            case 17:
                return new Z2[i5];
            case 18:
                return new C0232a3[i5];
            case 19:
                return new C0238b3[i5];
            case 20:
                return new C0244c3[i5];
            case 21:
                return new C0250d3[i5];
            case 22:
                return new C0256e3[i5];
            case 23:
                return new C0262f3[i5];
            case 24:
                return new C0268g3[i5];
            case 25:
                return new C0274h3[i5];
            case 26:
                return new C0280i3[i5];
            case 27:
                return new C0286j3[i5];
            case 28:
                return new C0292k3[i5];
            default:
                return new C0298l3[i5];
        }
    }
}
