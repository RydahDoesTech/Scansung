package b1;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c1.AbstractC0224a;
import com.google.android.gms.common.api.Scope;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class j extends AbstractC0224a {
    public static final Parcelable.Creator<j> CREATOR = new D0.a(27);

    /* renamed from: d, reason: collision with root package name */
    public final int f5021d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5022e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public String f5023g;

    /* renamed from: h, reason: collision with root package name */
    public IBinder f5024h;

    /* renamed from: i, reason: collision with root package name */
    public Scope[] f5025i;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f5026j;

    /* renamed from: k, reason: collision with root package name */
    public Account f5027k;

    /* renamed from: l, reason: collision with root package name */
    public Y0.c[] f5028l;

    /* renamed from: m, reason: collision with root package name */
    public Y0.c[] f5029m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5030o;

    public j(int i5) {
        this.f5021d = 4;
        this.f = Y0.f.f2817a;
        this.f5022e = i5;
        this.n = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5021d);
        AbstractC0415a.h0(parcel, 2, 4);
        parcel.writeInt(this.f5022e);
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(this.f);
        AbstractC0415a.a0(parcel, 4, this.f5023g);
        IBinder iBinder = this.f5024h;
        if (iBinder != null) {
            int iE02 = AbstractC0415a.e0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC0415a.g0(parcel, iE02);
        }
        AbstractC0415a.c0(parcel, 6, this.f5025i, i5);
        AbstractC0415a.Y(parcel, 7, this.f5026j);
        AbstractC0415a.Z(parcel, 8, this.f5027k, i5);
        AbstractC0415a.c0(parcel, 10, this.f5028l, i5);
        AbstractC0415a.c0(parcel, 11, this.f5029m, i5);
        AbstractC0415a.h0(parcel, 12, 4);
        parcel.writeInt(this.n ? 1 : 0);
        AbstractC0415a.h0(parcel, 13, 4);
        parcel.writeInt(this.f5030o);
        AbstractC0415a.g0(parcel, iE0);
    }

    public j(int i5, int i6, int i7, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Y0.c[] cVarArr, Y0.c[] cVarArr2, boolean z4, int i8) {
        o oVarZ;
        this.f5021d = i5;
        this.f5022e = i6;
        this.f = i7;
        if ("com.google.android.gms".equals(str)) {
            this.f5023g = "com.google.android.gms";
        } else {
            this.f5023g = str;
        }
        if (i5 < 2) {
            Account accountY = null;
            if (iBinder != null && (oVarZ = AbstractBinderC0205a.z(iBinder)) != null) {
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    accountY = ((n) oVarZ).y();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.f5027k = accountY;
        } else {
            this.f5024h = iBinder;
            this.f5027k = account;
        }
        this.f5025i = scopeArr;
        this.f5026j = bundle;
        this.f5028l = cVarArr;
        this.f5029m = cVarArr2;
        this.n = z4;
        this.f5030o = i8;
    }
}
