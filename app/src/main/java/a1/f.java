package A1;

import G0.o;
import R1.B;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C;
import j0.C0528T;
import k.G1;
import k.P0;

/* loaded from: classes.dex */
public final class f implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58a;

    public /* synthetic */ f(int i5) {
        this.f58a = i5;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f58a) {
            case 0:
                return new g(parcel, classLoader);
            case 1:
                return new B1.b(parcel, classLoader);
            case 2:
                return new E0.j(parcel, classLoader);
            case 3:
                o oVar = new o(parcel, classLoader);
                oVar.f728d = parcel.readInt();
                oVar.f729e = parcel.readInt();
                oVar.f = parcel.readParcelable(classLoader);
                return oVar;
            case 4:
                return new I1.a(parcel, classLoader);
            case 5:
                return new P1.c(parcel, classLoader);
            case 6:
                if (parcel.readParcelable(classLoader) == null) {
                    return R.b.f2362e;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new B(parcel, classLoader);
            case 8:
                return new C(parcel, classLoader);
            case 9:
                return new C0528T(parcel, classLoader);
            case 10:
                return new P0(parcel, classLoader);
            case 11:
                return new G1(parcel, classLoader);
            default:
                return new w.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f58a) {
            case 0:
                return new g[i5];
            case 1:
                return new B1.b[i5];
            case 2:
                return new E0.j[i5];
            case 3:
                return new o[i5];
            case 4:
                return new I1.a[i5];
            case 5:
                return new P1.c[i5];
            case 6:
                return new R.b[i5];
            case 7:
                return new B[i5];
            case 8:
                return new C[i5];
            case 9:
                return new C0528T[i5];
            case 10:
                return new P0[i5];
            case 11:
                return new G1[i5];
            default:
                return new w.f[i5];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f58a) {
            case 0:
                return new g(parcel, (ClassLoader) null);
            case 1:
                return new B1.b(parcel, null);
            case 2:
                return new E0.j(parcel, null);
            case 3:
                o oVar = new o(parcel, null);
                oVar.f728d = parcel.readInt();
                oVar.f729e = parcel.readInt();
                oVar.f = parcel.readParcelable(null);
                return oVar;
            case 4:
                return new I1.a(parcel, null);
            case 5:
                return new P1.c(parcel, (ClassLoader) null);
            case 6:
                if (parcel.readParcelable(null) == null) {
                    return R.b.f2362e;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new B(parcel, null);
            case 8:
                return new C(parcel, null);
            case 9:
                return new C0528T(parcel, null);
            case 10:
                return new P0(parcel, null);
            case 11:
                return new G1(parcel, null);
            default:
                return new w.f(parcel, null);
        }
    }
}
