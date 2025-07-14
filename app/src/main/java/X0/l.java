package X0;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import r0.AbstractC0809c;
import t1.InterfaceC0873a;
import t1.n;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC0873a, t1.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l f2702d = new l();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l f2703e = new l();

    @Override // t1.g
    public n a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i5 = a.f2668h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC0809c.e(bundle) : AbstractC0809c.e(null);
    }

    @Override // t1.InterfaceC0873a
    public Object n0(t1.h hVar) throws IOException {
        if (hVar.f()) {
            return (Bundle) hVar.e();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(hVar.d());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", hVar.d());
    }
}
