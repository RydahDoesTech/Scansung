package a1;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import com.samsung.android.knox.ucm.plugin.agent.UcmAgentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C0705c;
import o.C0709g;

/* renamed from: a1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099g implements Handler.Callback {

    /* renamed from: j, reason: collision with root package name */
    public static final Status f2951j = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: k, reason: collision with root package name */
    public static final Status f2952k = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: l, reason: collision with root package name */
    public static final Object f2953l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static C0099g f2954m;

    /* renamed from: a, reason: collision with root package name */
    public long f2955a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2956b;

    /* renamed from: c, reason: collision with root package name */
    public final Y0.e f2957c;

    /* renamed from: d, reason: collision with root package name */
    public final E0.d f2958d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2959e;
    public final AtomicInteger f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f2960g;

    /* renamed from: h, reason: collision with root package name */
    public final C0705c f2961h;

    /* renamed from: i, reason: collision with root package name */
    public final R1 f2962i;

    public C0099g(Context context, Looper looper) {
        Y0.e eVar = Y0.e.f2816c;
        this.f2955a = 10000L;
        this.f2959e = new AtomicInteger(1);
        this.f = new AtomicInteger(0);
        this.f2960g = new ConcurrentHashMap(5, 0.75f, 1);
        new C0705c(0);
        this.f2961h = new C0705c(0);
        this.f2956b = context;
        R1 r12 = new R1(looper, this);
        this.f2962i = r12;
        this.f2957c = eVar;
        this.f2958d = new E0.d(26);
        r12.sendMessage(r12.obtainMessage(6));
    }

    public static C0099g a(Context context) {
        C0099g c0099g;
        synchronized (f2953l) {
            try {
                if (f2954m == null) {
                    HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = Y0.e.f2815b;
                    f2954m = new C0099g(applicationContext, looper);
                }
                c0099g = f2954m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0099g;
    }

    public final void b(Z0.c cVar) {
        C0093a c0093a = cVar.f2857d;
        ConcurrentHashMap concurrentHashMap = this.f2960g;
        C0096d c0096d = (C0096d) concurrentHashMap.get(c0093a);
        if (c0096d == null) {
            c0096d = new C0096d(this, cVar);
            concurrentHashMap.put(c0093a, c0096d);
        }
        if (c0096d.f2934b.a()) {
            this.f2961h.add(c0093a);
        }
        c0096d.a();
    }

    public final boolean c(Y0.a aVar, int i5) throws Resources.NotFoundException {
        Y0.e eVar = this.f2957c;
        eVar.getClass();
        int i6 = aVar.f2807e;
        PendingIntent activity = aVar.f;
        boolean z4 = (i6 == 0 || activity == null) ? false : true;
        Context context = this.f2956b;
        if (!z4) {
            activity = null;
            Intent intentA = eVar.a(context, i6, null);
            if (intentA != null) {
                activity = PendingIntent.getActivity(context, 0, intentA, UcmAgentService.ERROR_APPLET_UNKNOWN);
            }
        }
        if (activity == null) {
            return false;
        }
        int i7 = GoogleApiActivity.f5233e;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i5);
        intent.putExtra("notify_manager", true);
        eVar.d(context, i6, PendingIntent.getActivity(context, 0, intent, UcmAgentService.ERROR_APPLET_UNKNOWN));
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Y0.c[] cVarArrD;
        int i5 = message.what;
        ConcurrentHashMap concurrentHashMap = this.f2960g;
        int i6 = 0;
        C0096d c0096d = null;
        int i7 = 1;
        switch (i5) {
            case 1:
                this.f2955a = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                R1 r12 = this.f2962i;
                r12.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    r12.sendMessageDelayed(r12.obtainMessage(12, (C0093a) it.next()), this.f2955a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (C0096d c0096d2 : concurrentHashMap.values()) {
                    AbstractC0203C.b(c0096d2.f2943l.f2962i);
                    c0096d2.f2942k = null;
                    c0096d2.a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                o oVar = (o) message.obj;
                C0096d c0096d3 = (C0096d) concurrentHashMap.get(oVar.f2967c.f2857d);
                if (c0096d3 == null) {
                    Z0.c cVar = oVar.f2967c;
                    b(cVar);
                    c0096d3 = (C0096d) concurrentHashMap.get(cVar.f2857d);
                }
                boolean zA = c0096d3.f2934b.a();
                r rVar = oVar.f2965a;
                if (!zA || this.f.get() == oVar.f2966b) {
                    c0096d3.b(rVar);
                } else {
                    rVar.b(f2951j);
                    c0096d3.i();
                }
                return true;
            case 5:
                int i8 = message.arg1;
                Y0.a aVar = (Y0.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0096d c0096d4 = (C0096d) it2.next();
                        if (c0096d4.f2938g == i8) {
                            c0096d = c0096d4;
                        }
                    }
                }
                if (c0096d != null) {
                    int i9 = aVar.f2807e;
                    this.f2957c.getClass();
                    int i10 = Y0.g.f2820c;
                    String strD = Y0.a.d(i9);
                    int length = String.valueOf(strD).length() + 69;
                    String str = aVar.f2808g;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length);
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(strD);
                    sb.append(": ");
                    sb.append(str);
                    c0096d.k(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i8);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                Context context = this.f2956b;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0095c.b((Application) context.getApplicationContext());
                    ComponentCallbacks2C0095c componentCallbacks2C0095c = ComponentCallbacks2C0095c.f2929h;
                    componentCallbacks2C0095c.a(new Z1.h(i7, this));
                    AtomicBoolean atomicBoolean = componentCallbacks2C0095c.f2931e;
                    boolean z4 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0095c.f2930d;
                    if (!z4) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f2955a = 300000L;
                    }
                }
                return true;
            case 7:
                b((Z0.c) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C0096d c0096d5 = (C0096d) concurrentHashMap.get(message.obj);
                    AbstractC0203C.b(c0096d5.f2943l.f2962i);
                    if (c0096d5.f2940i) {
                        c0096d5.a();
                    }
                }
                return true;
            case 10:
                C0705c c0705c = this.f2961h;
                Iterator it3 = c0705c.iterator();
                while (true) {
                    C0709g c0709g = (C0709g) it3;
                    if (!c0709g.hasNext()) {
                        c0705c.clear();
                        return true;
                    }
                    ((C0096d) concurrentHashMap.remove((C0093a) c0709g.next())).i();
                }
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C0096d c0096d6 = (C0096d) concurrentHashMap.get(message.obj);
                    C0099g c0099g = c0096d6.f2943l;
                    AbstractC0203C.b(c0099g.f2962i);
                    boolean z5 = c0096d6.f2940i;
                    if (z5) {
                        if (z5) {
                            C0099g c0099g2 = c0096d6.f2943l;
                            R1 r13 = c0099g2.f2962i;
                            C0093a c0093a = c0096d6.f2935c;
                            r13.removeMessages(11, c0093a);
                            c0099g2.f2962i.removeMessages(9, c0093a);
                            c0096d6.f2940i = false;
                        }
                        c0096d6.k(c0099g.f2957c.b(c0099g.f2956b, Y0.f.f2817a) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        ((b1.k) c0096d6.f2934b).d();
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C0096d c0096d7 = (C0096d) concurrentHashMap.get(message.obj);
                    AbstractC0203C.b(c0096d7.f2943l.f2962i);
                    b1.k kVar = (b1.k) c0096d7.f2934b;
                    if (kVar.l() && c0096d7.f.size() == 0) {
                        E0.d dVar = c0096d7.f2936d;
                        if (((Map) dVar.f520e).isEmpty() && ((Map) dVar.f).isEmpty()) {
                            kVar.d();
                        } else {
                            c0096d7.j();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                C0098f c0098f = (C0098f) message.obj;
                if (concurrentHashMap.containsKey(c0098f.f2949a)) {
                    C0096d c0096d8 = (C0096d) concurrentHashMap.get(c0098f.f2949a);
                    if (c0096d8.f2941j.contains(c0098f) && !c0096d8.f2940i) {
                        if (((b1.k) c0096d8.f2934b).l()) {
                            c0096d8.h();
                        } else {
                            c0096d8.a();
                        }
                    }
                }
                return true;
            case 16:
                C0098f c0098f2 = (C0098f) message.obj;
                if (concurrentHashMap.containsKey(c0098f2.f2949a)) {
                    C0096d c0096d9 = (C0096d) concurrentHashMap.get(c0098f2.f2949a);
                    if (c0096d9.f2941j.remove(c0098f2)) {
                        C0099g c0099g3 = c0096d9.f2943l;
                        c0099g3.f2962i.removeMessages(15, c0098f2);
                        c0099g3.f2962i.removeMessages(16, c0098f2);
                        LinkedList linkedList = c0096d9.f2933a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it4 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            Y0.c cVar2 = c0098f2.f2950b;
                            if (zHasNext) {
                                l lVar = (l) it4.next();
                                if (lVar != null && (cVarArrD = lVar.d(c0096d9)) != null) {
                                    int length2 = cVarArrD.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= length2) {
                                            i11 = -1;
                                        } else if (!AbstractC0203C.h(cVarArrD[i11], cVar2)) {
                                            i11++;
                                        }
                                    }
                                    if (i11 >= 0) {
                                        arrayList.add(lVar);
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                while (i6 < size) {
                                    Object obj = arrayList.get(i6);
                                    i6++;
                                    l lVar2 = (l) obj;
                                    linkedList.remove(lVar2);
                                    lVar2.c(new Z0.h(cVar2));
                                }
                            }
                        }
                    }
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
