package com.google.android.gms.internal.p000firebaseauthapi;

import G.a;
import a1.p;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import r1.C0814e;

/* loaded from: classes.dex */
public abstract class Z extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5414a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i5 = this.f5414a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2;
        switch (this.f5414a) {
            case 0:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i6)) {
                    return true;
                }
                return y(i5, parcel, parcel2);
            case 1:
                if (i5 > 16777215) {
                    zOnTransact = super.onTransact(i5, parcel, parcel2, i6);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                return y(i5, parcel, parcel2);
            default:
                boolean z4 = false;
                if (i5 > 16777215) {
                    zOnTransact2 = super.onTransact(i5, parcel, parcel2, i6);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact2 = false;
                }
                if (zOnTransact2) {
                    return true;
                }
                if (i5 == 3) {
                } else if (i5 == 4 || i5 == 6) {
                } else {
                    if (i5 != 7) {
                        if (i5 == 8) {
                            p pVar = (p) this;
                            pVar.f2970c.post(new a(pVar, (C0814e) m1.a.a(parcel, C0814e.CREATOR), 6, false));
                        }
                        return z4;
                    }
                }
                parcel2.writeNoException();
                z4 = true;
                return z4;
        }
    }

    public boolean y(int i5, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public Z(String str, int i5) {
        this.f5414a = i5;
        switch (i5) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
