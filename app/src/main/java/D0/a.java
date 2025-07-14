package D0;

import O.n;
import Y0.j;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0114b;
import androidx.fragment.app.C0115c;
import androidx.fragment.app.X;
import androidx.fragment.app.c0;
import androidx.fragment.app.f0;
import androidx.picker.widget.C0174l;
import androidx.picker.widget.Q;
import androidx.preference.A;
import androidx.preference.C0184c;
import androidx.preference.C0187f;
import androidx.preference.C0190i;
import androidx.preference.C0194m;
import androidx.preference.L;
import androidx.preference.M;
import androidx.versionedparcelable.ParcelImpl;
import b1.C0204D;
import b1.t;
import b1.u;
import b1.w;
import b3.AbstractC0219i;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.material.datepicker.e;
import com.google.android.material.datepicker.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f458a;

    public /* synthetic */ a(int i5) {
        this.f458a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f458a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                D1.b bVar = new D1.b(parcel);
                bVar.f469d = ((Integer) parcel.readValue(D1.b.class.getClassLoader())).intValue();
                return bVar;
            case 2:
                n nVar = new n(parcel);
                nVar.f1900d = parcel.readInt();
                return nVar;
            case 3:
                int iS = j.S(parcel);
                int I4 = 0;
                String strU = null;
                String strU2 = null;
                String strU3 = null;
                String strU4 = null;
                Uri uri = null;
                String strU5 = null;
                String strU6 = null;
                ArrayList arrayListX = null;
                String strU7 = null;
                String strU8 = null;
                long J4 = 0;
                while (parcel.dataPosition() < iS) {
                    int i5 = parcel.readInt();
                    switch (65535 & i5) {
                        case 1:
                            I4 = j.I(parcel, i5);
                            break;
                        case 2:
                            strU = j.u(parcel, i5);
                            break;
                        case 3:
                            strU2 = j.u(parcel, i5);
                            break;
                        case 4:
                            strU3 = j.u(parcel, i5);
                            break;
                        case 5:
                            strU4 = j.u(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) j.t(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strU5 = j.u(parcel, i5);
                            break;
                        case 8:
                            J4 = j.J(parcel, i5);
                            break;
                        case 9:
                            strU6 = j.u(parcel, i5);
                            break;
                        case 10:
                            arrayListX = j.x(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strU7 = j.u(parcel, i5);
                            break;
                        case 12:
                            strU8 = j.u(parcel, i5);
                            break;
                        default:
                            j.R(parcel, i5);
                            break;
                    }
                }
                j.z(parcel, iS);
                return new GoogleSignInAccount(I4, strU, strU2, strU3, strU4, uri, strU5, J4, strU6, arrayListX, strU7, strU8);
            case 4:
                int iS2 = j.S(parcel);
                int I5 = 0;
                PendingIntent pendingIntent = null;
                String strU9 = null;
                int I6 = 0;
                while (parcel.dataPosition() < iS2) {
                    int i6 = parcel.readInt();
                    int i7 = 65535 & i6;
                    if (i7 == 1) {
                        I5 = j.I(parcel, i6);
                    } else if (i7 == 2) {
                        I6 = j.I(parcel, i6);
                    } else if (i7 == 3) {
                        pendingIntent = (PendingIntent) j.t(parcel, i6, PendingIntent.CREATOR);
                    } else if (i7 != 4) {
                        j.R(parcel, i6);
                    } else {
                        strU9 = j.u(parcel, i6);
                    }
                }
                j.z(parcel, iS2);
                return new Y0.a(I5, I6, pendingIntent, strU9);
            case 5:
                int iS3 = j.S(parcel);
                String strU10 = null;
                int I7 = 0;
                long J5 = -1;
                while (parcel.dataPosition() < iS3) {
                    int i8 = parcel.readInt();
                    int i9 = 65535 & i8;
                    if (i9 == 1) {
                        strU10 = j.u(parcel, i8);
                    } else if (i9 == 2) {
                        I7 = j.I(parcel, i8);
                    } else if (i9 != 3) {
                        j.R(parcel, i8);
                    } else {
                        J5 = j.J(parcel, i8);
                    }
                }
                j.z(parcel, iS3);
                return new Y0.c(J5, I7, strU10);
            case 6:
                int iS4 = j.S(parcel);
                int I8 = 0;
                String strU11 = null;
                while (parcel.dataPosition() < iS4) {
                    int i10 = parcel.readInt();
                    int i11 = 65535 & i10;
                    if (i11 == 1) {
                        I8 = j.I(parcel, i10);
                    } else if (i11 != 2) {
                        j.R(parcel, i10);
                    } else {
                        strU11 = j.u(parcel, i10);
                    }
                }
                j.z(parcel, iS4);
                return new Scope(I8, strU11);
            case 7:
                int iS5 = j.S(parcel);
                int I9 = 0;
                String strU12 = null;
                PendingIntent pendingIntent2 = null;
                int I10 = 0;
                while (parcel.dataPosition() < iS5) {
                    int i12 = parcel.readInt();
                    int i13 = 65535 & i12;
                    if (i13 == 1) {
                        I10 = j.I(parcel, i12);
                    } else if (i13 == 2) {
                        strU12 = j.u(parcel, i12);
                    } else if (i13 == 3) {
                        pendingIntent2 = (PendingIntent) j.t(parcel, i12, PendingIntent.CREATOR);
                    } else if (i13 != 1000) {
                        j.R(parcel, i12);
                    } else {
                        I9 = j.I(parcel, i12);
                    }
                }
                j.z(parcel, iS5);
                return new Status(I9, I10, pendingIntent2, strU12);
            case 8:
                return new androidx.activity.result.a(parcel);
            case 9:
                AbstractC0219i.e("inParcel", parcel);
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC0219i.b(parcelable);
                return new androidx.activity.result.j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                return new C0114b(parcel);
            case 11:
                return new C0115c(parcel);
            case 12:
                X x4 = new X();
                x4.f3746d = parcel.readString();
                x4.f3747e = parcel.readInt();
                return x4;
            case 13:
                c0 c0Var = new c0();
                c0Var.f3806h = null;
                c0Var.f3807i = new ArrayList();
                c0Var.f3808j = new ArrayList();
                c0Var.f3803d = parcel.createStringArrayList();
                c0Var.f3804e = parcel.createStringArrayList();
                c0Var.f = (C0114b[]) parcel.createTypedArray(C0114b.CREATOR);
                c0Var.f3805g = parcel.readInt();
                c0Var.f3806h = parcel.readString();
                c0Var.f3807i = parcel.createStringArrayList();
                c0Var.f3808j = parcel.createTypedArrayList(C0115c.CREATOR);
                c0Var.f3809k = parcel.createTypedArrayList(X.CREATOR);
                return c0Var;
            case 14:
                return new f0(parcel);
            case 15:
                return new C0174l(parcel);
            case 16:
                return new Q(parcel);
            case 17:
                return new C0184c(parcel);
            case 18:
                return new C0187f(parcel);
            case 19:
                return new C0190i(parcel);
            case 20:
                return new C0194m(parcel);
            case 21:
                return new A(parcel);
            case 22:
                return new L(parcel);
            case 23:
                return new M(parcel);
            case 24:
                int iS6 = j.S(parcel);
                int I11 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int I12 = 0;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    int i15 = 65535 & i14;
                    if (i15 == 1) {
                        I11 = j.I(parcel, i14);
                    } else if (i15 == 2) {
                        account = (Account) j.t(parcel, i14, Account.CREATOR);
                    } else if (i15 == 3) {
                        I12 = j.I(parcel, i14);
                    } else if (i15 != 4) {
                        j.R(parcel, i14);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) j.t(parcel, i14, GoogleSignInAccount.CREATOR);
                    }
                }
                j.z(parcel, iS6);
                return new t(I11, account, I12, googleSignInAccount);
            case 25:
                int iS7 = j.S(parcel);
                int I13 = 0;
                boolean zH = false;
                boolean zH2 = false;
                IBinder strongBinder = null;
                Y0.a aVar = null;
                while (parcel.dataPosition() < iS7) {
                    int i16 = parcel.readInt();
                    int i17 = 65535 & i16;
                    if (i17 == 1) {
                        I13 = j.I(parcel, i16);
                    } else if (i17 == 2) {
                        int iK = j.K(parcel, i16);
                        int iDataPosition = parcel.dataPosition();
                        if (iK == 0) {
                            strongBinder = null;
                        } else {
                            strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition + iK);
                        }
                    } else if (i17 == 3) {
                        aVar = (Y0.a) j.t(parcel, i16, Y0.a.CREATOR);
                    } else if (i17 == 4) {
                        zH = j.H(parcel, i16);
                    } else if (i17 != 5) {
                        j.R(parcel, i16);
                    } else {
                        zH2 = j.H(parcel, i16);
                    }
                }
                j.z(parcel, iS7);
                return new u(I13, strongBinder, aVar, zH, zH2);
            case 26:
                int iS8 = j.S(parcel);
                Bundle bundleQ = null;
                int I14 = 0;
                Y0.c[] cVarArr = null;
                while (parcel.dataPosition() < iS8) {
                    int i18 = parcel.readInt();
                    int i19 = 65535 & i18;
                    if (i19 == 1) {
                        bundleQ = j.q(parcel, i18);
                    } else if (i19 == 2) {
                        cVarArr = (Y0.c[]) j.w(parcel, i18, Y0.c.CREATOR);
                    } else if (i19 != 3) {
                        j.R(parcel, i18);
                    } else {
                        I14 = j.I(parcel, i18);
                    }
                }
                j.z(parcel, iS8);
                w wVar = new w();
                wVar.f5069d = bundleQ;
                wVar.f5070e = cVarArr;
                wVar.f = I14;
                return wVar;
            case 27:
                int iS9 = j.S(parcel);
                int I15 = 0;
                int I16 = 0;
                int I17 = 0;
                boolean zH3 = false;
                int I18 = 0;
                String strU13 = null;
                IBinder strongBinder2 = null;
                Scope[] scopeArr = null;
                Bundle bundleQ2 = null;
                Account account2 = null;
                Y0.c[] cVarArr2 = null;
                Y0.c[] cVarArr3 = null;
                while (parcel.dataPosition() < iS9) {
                    int i20 = parcel.readInt();
                    switch (65535 & i20) {
                        case 1:
                            I15 = j.I(parcel, i20);
                            break;
                        case 2:
                            I16 = j.I(parcel, i20);
                            break;
                        case 3:
                            I17 = j.I(parcel, i20);
                            break;
                        case 4:
                            strU13 = j.u(parcel, i20);
                            break;
                        case 5:
                            int iK2 = j.K(parcel, i20);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iK2 != 0) {
                                strongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition2 + iK2);
                                break;
                            } else {
                                strongBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) j.w(parcel, i20, Scope.CREATOR);
                            break;
                        case 7:
                            bundleQ2 = j.q(parcel, i20);
                            break;
                        case 8:
                            account2 = (Account) j.t(parcel, i20, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            j.R(parcel, i20);
                            break;
                        case 10:
                            cVarArr2 = (Y0.c[]) j.w(parcel, i20, Y0.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (Y0.c[]) j.w(parcel, i20, Y0.c.CREATOR);
                            break;
                        case 12:
                            zH3 = j.H(parcel, i20);
                            break;
                        case 13:
                            I18 = j.I(parcel, i20);
                            break;
                    }
                }
                j.z(parcel, iS9);
                return new b1.j(I15, I16, I17, strU13, strongBinder2, scopeArr, bundleQ2, account2, cVarArr2, cVarArr3, zH3, I18);
            case 28:
                int iS10 = j.S(parcel);
                int I19 = 0;
                while (parcel.dataPosition() < iS10) {
                    int i21 = parcel.readInt();
                    if ((65535 & i21) != 1) {
                        j.R(parcel, i21);
                    } else {
                        I19 = j.I(parcel, i21);
                    }
                }
                j.z(parcel, iS10);
                return new C0204D(I19);
            default:
                return new com.google.android.material.datepicker.b((q) parcel.readParcelable(q.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f458a) {
            case 0:
                return new ParcelImpl[i5];
            case 1:
                return new D1.b[i5];
            case 2:
                return new n[i5];
            case 3:
                return new GoogleSignInAccount[i5];
            case 4:
                return new Y0.a[i5];
            case 5:
                return new Y0.c[i5];
            case 6:
                return new Scope[i5];
            case 7:
                return new Status[i5];
            case 8:
                return new androidx.activity.result.a[i5];
            case 9:
                return new androidx.activity.result.j[i5];
            case 10:
                return new C0114b[i5];
            case 11:
                return new C0115c[i5];
            case 12:
                return new X[i5];
            case 13:
                return new c0[i5];
            case 14:
                return new f0[i5];
            case 15:
                return new C0174l[i5];
            case 16:
                return new Q[i5];
            case 17:
                return new C0184c[i5];
            case 18:
                return new C0187f[i5];
            case 19:
                return new C0190i[i5];
            case 20:
                return new C0194m[i5];
            case 21:
                return new A[i5];
            case 22:
                return new L[i5];
            case 23:
                return new M[i5];
            case 24:
                return new t[i5];
            case 25:
                return new u[i5];
            case 26:
                return new w[i5];
            case 27:
                return new b1.j[i5];
            case 28:
                return new C0204D[i5];
            default:
                return new com.google.android.material.datepicker.b[i5];
        }
    }
}
