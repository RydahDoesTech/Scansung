package X0;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2684e;

    public /* synthetic */ g(h hVar, int i5) {
        this.f2683d = i5;
        this.f2684e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f2683d) {
            case 0:
                this.f2684e.a(2, "Service disconnected");
                return;
            case 1:
                h hVar = this.f2684e;
                while (true) {
                    synchronized (hVar) {
                        try {
                            if (hVar.f2685a != 2) {
                                return;
                            }
                            if (hVar.f2688d.isEmpty()) {
                                hVar.c();
                                return;
                            }
                            i iVar = (i) hVar.f2688d.poll();
                            hVar.f2689e.put(iVar.f2690a, iVar);
                            ((ScheduledExecutorService) hVar.f.f).schedule(new G.a(hVar, 3, iVar), 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                String strValueOf = String.valueOf(iVar);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                                sb.append("Sending ");
                                sb.append(strValueOf);
                                Log.d("MessengerIpcClient", sb.toString());
                            }
                            Context context = (Context) hVar.f.f2697e;
                            Messenger messenger = hVar.f2686b;
                            Message messageObtain = Message.obtain();
                            messageObtain.what = iVar.f2692c;
                            messageObtain.arg1 = iVar.f2690a;
                            messageObtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", iVar.a());
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", iVar.f2693d);
                            messageObtain.setData(bundle);
                            try {
                                E0.d dVar = hVar.f2687c;
                                Messenger messenger2 = (Messenger) dVar.f520e;
                                if (messenger2 == null) {
                                    e eVar = (e) dVar.f;
                                    if (eVar == null) {
                                        throw new IllegalStateException("Both messengers are null");
                                        break;
                                    } else {
                                        Messenger messenger3 = eVar.f2678d;
                                        messenger3.getClass();
                                        messenger3.send(messageObtain);
                                    }
                                } else {
                                    messenger2.send(messageObtain);
                                }
                            } catch (RemoteException e5) {
                                hVar.a(2, e5.getMessage());
                            }
                        } finally {
                        }
                    }
                }
            default:
                h hVar2 = this.f2684e;
                synchronized (hVar2) {
                    if (hVar2.f2685a == 1) {
                        hVar2.a(1, "Timed out while binding");
                    }
                }
                return;
        }
    }
}
