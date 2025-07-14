package b1;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p000firebaseauthapi.Z;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0205a extends Z implements o {
    public static o z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new n(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
    }
}
