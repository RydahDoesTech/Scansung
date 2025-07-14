package Q1;

import X0.h;
import X0.i;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2306b;

    public /* synthetic */ f(int i5, Object obj) {
        this.f2305a = i5;
        this.f2306b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2305a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                M0.c cVar = (M0.c) this.f2306b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (cVar.f1811d) {
                    throw null;
                }
            default:
                h hVar = (h) this.f2306b;
                int i5 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Received response to request: ");
                    sb.append(i5);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                synchronized (hVar) {
                    try {
                        i iVar = (i) hVar.f2689e.get(i5);
                        if (iVar == null) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i5);
                            Log.w("MessengerIpcClient", sb2.toString());
                            return true;
                        }
                        hVar.f2689e.remove(i5);
                        hVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            iVar.b(new V1.h("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (iVar.f2694e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    iVar.c(null);
                                    return true;
                                }
                                iVar.b(new V1.h("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                iVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
