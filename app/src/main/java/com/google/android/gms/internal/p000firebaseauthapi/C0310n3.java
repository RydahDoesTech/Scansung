package com.google.android.gms.internal.p000firebaseauthapi;

import X1.a;
import X1.o;
import X1.r;
import Y0.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310n3 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5571a;

    public /* synthetic */ C0310n3(int i5) {
        this.f5571a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C0370x4 c0370x4;
        String strU;
        switch (this.f5571a) {
            case 0:
                int iS = j.S(parcel);
                o oVar = null;
                String strU2 = null;
                while (parcel.dataPosition() < iS) {
                    int i5 = parcel.readInt();
                    int i6 = 65535 & i5;
                    if (i6 == 1) {
                        oVar = (o) j.t(parcel, i5, o.CREATOR);
                    } else if (i6 != 2) {
                        j.R(parcel, i5);
                    } else {
                        strU2 = j.u(parcel, i5);
                    }
                }
                j.z(parcel, iS);
                return new C0304m3(oVar, strU2);
            case 1:
                int iS2 = j.S(parcel);
                String strU3 = null;
                String strU4 = null;
                a aVar = null;
                while (parcel.dataPosition() < iS2) {
                    int i7 = parcel.readInt();
                    int i8 = 65535 & i7;
                    if (i8 == 1) {
                        strU3 = j.u(parcel, i7);
                    } else if (i8 == 2) {
                        strU4 = j.u(parcel, i7);
                    } else if (i8 != 3) {
                        j.R(parcel, i7);
                    } else {
                        aVar = (a) j.t(parcel, i7, a.CREATOR);
                    }
                }
                j.z(parcel, iS2);
                return new C0316o3(aVar, strU3, strU4);
            case 2:
                int iS3 = j.S(parcel);
                Status status = null;
                r rVar = null;
                String strU5 = null;
                String strU6 = null;
                while (parcel.dataPosition() < iS3) {
                    int i9 = parcel.readInt();
                    int i10 = 65535 & i9;
                    if (i10 == 1) {
                        status = (Status) j.t(parcel, i9, Status.CREATOR);
                    } else if (i10 == 2) {
                        rVar = (r) j.t(parcel, i9, r.CREATOR);
                    } else if (i10 == 3) {
                        strU5 = j.u(parcel, i9);
                    } else if (i10 != 4) {
                        j.R(parcel, i9);
                    } else {
                        strU6 = j.u(parcel, i9);
                    }
                }
                j.z(parcel, iS3);
                return new C0322p3(status, rVar, strU5, strU6);
            case 3:
                int iS4 = j.S(parcel);
                String strU7 = null;
                ArrayList arrayListX = null;
                r rVar2 = null;
                while (parcel.dataPosition() < iS4) {
                    int i11 = parcel.readInt();
                    int i12 = 65535 & i11;
                    if (i12 == 1) {
                        strU7 = j.u(parcel, i11);
                    } else if (i12 == 2) {
                        arrayListX = j.x(parcel, i11, A4.CREATOR);
                    } else if (i12 != 3) {
                        j.R(parcel, i11);
                    } else {
                        rVar2 = (r) j.t(parcel, i11, r.CREATOR);
                    }
                }
                j.z(parcel, iS4);
                return new C0328q3(strU7, arrayListX, rVar2);
            case 4:
                int iS5 = j.S(parcel);
                boolean zH = false;
                String strU8 = null;
                String strU9 = null;
                M4 m4 = null;
                ArrayList arrayListV = null;
                boolean zH2 = false;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    switch (65535 & i13) {
                        case 2:
                            strU8 = j.u(parcel, i13);
                            break;
                        case 3:
                            zH = j.H(parcel, i13);
                            break;
                        case 4:
                            strU9 = j.u(parcel, i13);
                            break;
                        case 5:
                            zH2 = j.H(parcel, i13);
                            break;
                        case 6:
                            m4 = (M4) j.t(parcel, i13, M4.CREATOR);
                            break;
                        case 7:
                            arrayListV = j.v(parcel, i13);
                            break;
                        default:
                            j.R(parcel, i13);
                            break;
                    }
                }
                j.z(parcel, iS5);
                C0329q4 c0329q4 = new C0329q4();
                c0329q4.f5603d = strU8;
                c0329q4.f5604e = zH;
                c0329q4.f = strU9;
                c0329q4.f5605g = zH2;
                c0329q4.f5606h = m4 == null ? new M4(null) : new M4(m4.f5353e);
                c0329q4.f5607i = arrayListV;
                return c0329q4;
            case 5:
                int iS6 = j.S(parcel);
                C0370x4 c0370x42 = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    if ((65535 & i14) != 2) {
                        j.R(parcel, i14);
                    } else {
                        c0370x42 = (C0370x4) j.t(parcel, i14, C0370x4.CREATOR);
                    }
                }
                j.z(parcel, iS6);
                C0358v4 c0358v4 = new C0358v4();
                if (c0370x42 == null) {
                    c0370x4 = new C0370x4();
                } else {
                    c0370x4 = new C0370x4();
                    List list = c0370x42.f5683d;
                    if (list != null && !list.isEmpty()) {
                        c0370x4.f5683d.addAll(list);
                    }
                }
                c0358v4.f5656d = c0370x4;
                return c0358v4;
            case 6:
                int iS7 = j.S(parcel);
                String strU10 = null;
                String strU11 = null;
                String strU12 = null;
                String strU13 = null;
                C4 c42 = null;
                String strU14 = null;
                String strU15 = null;
                r rVar3 = null;
                ArrayList arrayListX2 = null;
                boolean zH3 = false;
                boolean zH4 = false;
                long J4 = 0;
                long J5 = 0;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    switch (65535 & i15) {
                        case 2:
                            strU10 = j.u(parcel, i15);
                            break;
                        case 3:
                            strU11 = j.u(parcel, i15);
                            break;
                        case 4:
                            zH3 = j.H(parcel, i15);
                            break;
                        case 5:
                            strU12 = j.u(parcel, i15);
                            break;
                        case 6:
                            strU13 = j.u(parcel, i15);
                            break;
                        case 7:
                            c42 = (C4) j.t(parcel, i15, C4.CREATOR);
                            break;
                        case 8:
                            strU14 = j.u(parcel, i15);
                            break;
                        case 9:
                            strU15 = j.u(parcel, i15);
                            break;
                        case 10:
                            J4 = j.J(parcel, i15);
                            break;
                        case 11:
                            J5 = j.J(parcel, i15);
                            break;
                        case 12:
                            zH4 = j.H(parcel, i15);
                            break;
                        case 13:
                            rVar3 = (r) j.t(parcel, i15, r.CREATOR);
                            break;
                        case 14:
                            arrayListX2 = j.x(parcel, i15, A4.CREATOR);
                            break;
                        default:
                            j.R(parcel, i15);
                            break;
                    }
                }
                j.z(parcel, iS7);
                return new C0364w4(strU10, strU11, zH3, strU12, strU13, c42, strU14, strU15, J4, J5, zH4, rVar3, arrayListX2);
            case 7:
                int iS8 = j.S(parcel);
                ArrayList arrayListX3 = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    if ((65535 & i16) != 2) {
                        j.R(parcel, i16);
                    } else {
                        arrayListX3 = j.x(parcel, i16, C0364w4.CREATOR);
                    }
                }
                j.z(parcel, iS8);
                return new C0370x4(arrayListX3);
            case 8:
                int iS9 = j.S(parcel);
                String strU16 = null;
                String strU17 = null;
                Long lValueOf = null;
                String strU18 = null;
                Long lValueOf2 = null;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    int i18 = 65535 & i17;
                    if (i18 == 2) {
                        strU16 = j.u(parcel, i17);
                    } else if (i18 == 3) {
                        strU17 = j.u(parcel, i17);
                    } else if (i18 == 4) {
                        int iK = j.K(parcel, i17);
                        if (iK == 0) {
                            lValueOf = null;
                        } else {
                            j.V(parcel, iK, 8);
                            lValueOf = Long.valueOf(parcel.readLong());
                        }
                    } else if (i18 == 5) {
                        strU18 = j.u(parcel, i17);
                    } else if (i18 != 6) {
                        j.R(parcel, i17);
                    } else {
                        int iK2 = j.K(parcel, i17);
                        if (iK2 == 0) {
                            lValueOf2 = null;
                        } else {
                            j.V(parcel, iK2, 8);
                            lValueOf2 = Long.valueOf(parcel.readLong());
                        }
                    }
                }
                j.z(parcel, iS9);
                return new C0382z4(strU16, strU17, lValueOf, strU18, lValueOf2);
            case 9:
                int iS10 = j.S(parcel);
                String strU19 = null;
                String strU20 = null;
                String strU21 = null;
                long J6 = 0;
                while (parcel.dataPosition() < iS10) {
                    int i19 = parcel.readInt();
                    int i20 = 65535 & i19;
                    if (i20 == 1) {
                        strU19 = j.u(parcel, i19);
                    } else if (i20 == 2) {
                        strU20 = j.u(parcel, i19);
                    } else if (i20 == 3) {
                        strU21 = j.u(parcel, i19);
                    } else if (i20 != 4) {
                        j.R(parcel, i19);
                    } else {
                        J6 = j.J(parcel, i19);
                    }
                }
                j.z(parcel, iS10);
                return new A4(J6, strU19, strU20, strU21);
            case 10:
                int iS11 = j.S(parcel);
                String strU22 = null;
                String strU23 = null;
                String strU24 = null;
                String strU25 = null;
                String strU26 = null;
                String strU27 = null;
                String strU28 = null;
                while (parcel.dataPosition() < iS11) {
                    int i21 = parcel.readInt();
                    switch (65535 & i21) {
                        case 2:
                            strU22 = j.u(parcel, i21);
                            break;
                        case 3:
                            strU23 = j.u(parcel, i21);
                            break;
                        case 4:
                            strU24 = j.u(parcel, i21);
                            break;
                        case 5:
                            strU25 = j.u(parcel, i21);
                            break;
                        case 6:
                            strU26 = j.u(parcel, i21);
                            break;
                        case 7:
                            strU27 = j.u(parcel, i21);
                            break;
                        case 8:
                            strU28 = j.u(parcel, i21);
                            break;
                        default:
                            j.R(parcel, i21);
                            break;
                    }
                }
                j.z(parcel, iS11);
                return new B4(strU22, strU23, strU24, strU25, strU26, strU27, strU28);
            case 11:
                int iS12 = j.S(parcel);
                ArrayList arrayListX4 = null;
                while (parcel.dataPosition() < iS12) {
                    int i22 = parcel.readInt();
                    if ((65535 & i22) != 2) {
                        j.R(parcel, i22);
                    } else {
                        arrayListX4 = j.x(parcel, i22, B4.CREATOR);
                    }
                }
                j.z(parcel, iS12);
                return new C4(arrayListX4);
            case 12:
                int iS13 = j.S(parcel);
                String strU29 = null;
                String strU30 = null;
                String strU31 = null;
                A4 a42 = null;
                while (parcel.dataPosition() < iS13) {
                    int i23 = parcel.readInt();
                    int i24 = 65535 & i23;
                    if (i24 == 2) {
                        strU29 = j.u(parcel, i23);
                    } else if (i24 == 3) {
                        strU30 = j.u(parcel, i23);
                    } else if (i24 == 4) {
                        strU31 = j.u(parcel, i23);
                    } else if (i24 != 5) {
                        j.R(parcel, i23);
                    } else {
                        a42 = (A4) j.t(parcel, i23, A4.CREATOR);
                    }
                }
                j.z(parcel, iS13);
                E4 e42 = new E4();
                e42.f5293d = strU29;
                e42.f5294e = strU30;
                e42.f = strU31;
                e42.f5295g = a42;
                return e42;
            case 13:
                int iS14 = j.S(parcel);
                String strU32 = null;
                String strU33 = null;
                String strU34 = null;
                String strU35 = null;
                String strU36 = null;
                long J7 = 0;
                boolean zH5 = false;
                boolean zH6 = false;
                while (parcel.dataPosition() < iS14) {
                    int i25 = parcel.readInt();
                    switch (65535 & i25) {
                        case 1:
                            strU32 = j.u(parcel, i25);
                            break;
                        case 2:
                            J7 = j.J(parcel, i25);
                            break;
                        case 3:
                            zH5 = j.H(parcel, i25);
                            break;
                        case 4:
                            strU33 = j.u(parcel, i25);
                            break;
                        case 5:
                            strU34 = j.u(parcel, i25);
                            break;
                        case 6:
                            strU35 = j.u(parcel, i25);
                            break;
                        case 7:
                            zH6 = j.H(parcel, i25);
                            break;
                        case 8:
                            strU36 = j.u(parcel, i25);
                            break;
                        default:
                            j.R(parcel, i25);
                            break;
                    }
                }
                j.z(parcel, iS14);
                return new F4(strU32, J7, zH5, strU33, strU34, strU35, zH6, strU36);
            case 14:
                int iS15 = j.S(parcel);
                int I4 = 0;
                ArrayList arrayListV2 = null;
                while (parcel.dataPosition() < iS15) {
                    int i26 = parcel.readInt();
                    int i27 = 65535 & i26;
                    if (i27 == 1) {
                        I4 = j.I(parcel, i26);
                    } else if (i27 != 2) {
                        j.R(parcel, i26);
                    } else {
                        arrayListV2 = j.v(parcel, i26);
                    }
                }
                j.z(parcel, iS15);
                return new M4(arrayListV2, I4);
            case 15:
                int iS16 = j.S(parcel);
                String strU37 = null;
                String str = null;
                String strU38 = null;
                String strU39 = null;
                String strU40 = null;
                String strU41 = null;
                String strU42 = null;
                String strU43 = null;
                String strU44 = null;
                String strU45 = null;
                String strU46 = null;
                String strU47 = null;
                boolean zH7 = false;
                boolean zH8 = false;
                boolean zH9 = false;
                String strU48 = null;
                while (parcel.dataPosition() < iS16) {
                    int i28 = parcel.readInt();
                    switch (i28 & 65535) {
                        case 2:
                            strU37 = j.u(parcel, i28);
                            break;
                        case 3:
                            strU48 = j.u(parcel, i28);
                            break;
                        case 4:
                            strU38 = j.u(parcel, i28);
                            break;
                        case 5:
                            strU39 = j.u(parcel, i28);
                            break;
                        case 6:
                            strU40 = j.u(parcel, i28);
                            break;
                        case 7:
                            strU41 = j.u(parcel, i28);
                            break;
                        case 8:
                            strU42 = j.u(parcel, i28);
                            break;
                        case 9:
                            strU43 = j.u(parcel, i28);
                            break;
                        case 10:
                            zH8 = j.H(parcel, i28);
                            break;
                        case 11:
                            zH7 = j.H(parcel, i28);
                            break;
                        case 12:
                            strU44 = j.u(parcel, i28);
                            break;
                        case 13:
                            strU45 = j.u(parcel, i28);
                            break;
                        case 14:
                            strU46 = j.u(parcel, i28);
                            break;
                        case 15:
                            strU47 = j.u(parcel, i28);
                            break;
                        case 16:
                            zH9 = j.H(parcel, i28);
                            break;
                        case 17:
                            strU = j.u(parcel, i28);
                            continue;
                            str = strU;
                        default:
                            j.R(parcel, i28);
                            break;
                    }
                    strU = str;
                    str = strU;
                }
                j.z(parcel, iS16);
                N4 n42 = new N4();
                n42.f5361d = strU37;
                n42.f5362e = strU48;
                n42.f = strU38;
                n42.f5363g = strU39;
                n42.f5364h = strU40;
                n42.f5365i = strU41;
                n42.f5366j = strU42;
                n42.f5367k = strU43;
                n42.f5368l = zH8;
                n42.f5369m = zH7;
                n42.n = strU44;
                n42.f5370o = strU45;
                n42.f5371p = strU46;
                n42.f5372q = strU47;
                n42.f5373r = zH9;
                n42.f5374s = str;
                return n42;
            default:
                int iS17 = j.S(parcel);
                String strU49 = null;
                boolean zH10 = false;
                long J8 = 0;
                String strU50 = null;
                while (parcel.dataPosition() < iS17) {
                    int i29 = parcel.readInt();
                    int i30 = 65535 & i29;
                    if (i30 == 2) {
                        strU49 = j.u(parcel, i29);
                    } else if (i30 == 3) {
                        strU50 = j.u(parcel, i29);
                    } else if (i30 == 4) {
                        J8 = j.J(parcel, i29);
                    } else if (i30 != 5) {
                        j.R(parcel, i29);
                    } else {
                        zH10 = j.H(parcel, i29);
                    }
                }
                j.z(parcel, iS17);
                P4 p42 = new P4();
                p42.f5382d = strU49;
                p42.f5383e = strU50;
                p42.f = J8;
                p42.f5384g = zH10;
                return p42;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i5) {
        switch (this.f5571a) {
            case 0:
                return new C0304m3[i5];
            case 1:
                return new C0316o3[i5];
            case 2:
                return new C0322p3[i5];
            case 3:
                return new C0328q3[i5];
            case 4:
                return new C0329q4[i5];
            case 5:
                return new C0358v4[i5];
            case 6:
                return new C0364w4[i5];
            case 7:
                return new C0370x4[i5];
            case 8:
                return new C0382z4[i5];
            case 9:
                return new A4[i5];
            case 10:
                return new B4[i5];
            case 11:
                return new C4[i5];
            case 12:
                return new E4[i5];
            case 13:
                return new F4[i5];
            case 14:
                return new M4[i5];
            case 15:
                return new N4[i5];
            default:
                return new P4[i5];
        }
    }
}
