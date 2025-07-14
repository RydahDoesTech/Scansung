package a1;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class l {
    public static Status e(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(E0.d dVar, boolean z4);

    public abstract void b(Status status);

    public abstract void c(RuntimeException runtimeException);

    public abstract Y0.c[] d(C0096d c0096d);

    public abstract boolean f(C0096d c0096d);

    public abstract void g(C0096d c0096d);
}
