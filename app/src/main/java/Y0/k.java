package Y0;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b1.InterfaceC0201A;
import com.google.android.gms.internal.p000firebaseauthapi.Z;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o1.AbstractC0715a;

/* loaded from: classes.dex */
public abstract class k extends Z implements InterfaceC0201A {

    /* renamed from: b, reason: collision with root package name */
    public final int f2830b;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f2830b = Arrays.hashCode(bArr);
    }

    public static byte[] A(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC0201A)) {
            try {
                InterfaceC0201A interfaceC0201A = (InterfaceC0201A) obj;
                if (((k) interfaceC0201A).f2830b != this.f2830b) {
                    return false;
                }
                return Arrays.equals(z(), new j1.a(((k) interfaceC0201A).z()).f7322b);
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2830b;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z
    public final boolean y(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            j1.a aVar = new j1.a(z());
            parcel2.writeNoException();
            int i6 = AbstractC0715a.f8241a;
            parcel2.writeStrongBinder(aVar);
        } else {
            if (i5 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f2830b);
        }
        return true;
    }

    public abstract byte[] z();
}
