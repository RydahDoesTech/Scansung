package a1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import b0.C0198c;
import b1.AbstractC0203C;
import b1.w;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import com.samsung.android.knox.ucm.plugin.agent.UcmAgentService;
import g3.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import o.AbstractC0706d;
import o.C0704b;
import o.C0705c;
import r1.C0810a;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096d implements Z0.d, Z0.e {

    /* renamed from: b, reason: collision with root package name */
    public final Z0.a f2934b;

    /* renamed from: c, reason: collision with root package name */
    public final C0093a f2935c;

    /* renamed from: d, reason: collision with root package name */
    public final E0.d f2936d;

    /* renamed from: g, reason: collision with root package name */
    public final int f2938g;

    /* renamed from: h, reason: collision with root package name */
    public final p f2939h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2940i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0099g f2943l;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f2933a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2937e = new HashSet();
    public final HashMap f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2941j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public Y0.a f2942k = null;

    public C0096d(C0099g c0099g, Z0.c cVar) {
        this.f2943l = c0099g;
        Looper looper = c0099g.f2962i.getLooper();
        D3.c cVarA = cVar.a();
        G3.d dVar = new G3.d((C0705c) cVarA.f507e, (String) cVarA.f, (String) cVarA.f508g);
        y yVar = (y) cVar.f2855b.f520e;
        AbstractC0203C.g("This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder", yVar != null);
        Z0.a aVarC = yVar.c(cVar.f2854a, looper, dVar, cVar.f2856c, this, this);
        this.f2934b = aVarC;
        this.f2935c = cVar.f2857d;
        this.f2936d = new E0.d(22);
        this.f2938g = cVar.f2858e;
        if (!aVarC.a()) {
            this.f2939h = null;
            return;
        }
        R1 r12 = c0099g.f2962i;
        D3.c cVarA2 = cVar.a();
        this.f2939h = new p(c0099g.f2956b, r12, new G3.d((C0705c) cVarA2.f507e, (String) cVarA2.f, (String) cVarA2.f508g));
    }

    public final void a() {
        int iB;
        boolean z4;
        C0099g c0099g = this.f2943l;
        AbstractC0203C.b(c0099g.f2962i);
        Z0.a aVar = this.f2934b;
        b1.k kVar = (b1.k) aVar;
        if (kVar.l()) {
            return;
        }
        synchronized (kVar.f5036e) {
            int i5 = kVar.f5042l;
            iB = 0;
            z4 = i5 == 2 || i5 == 3;
        }
        if (z4) {
            return;
        }
        E0.d dVar = c0099g.f2958d;
        Context context = c0099g.f2956b;
        dVar.getClass();
        AbstractC0203C.e(context);
        AbstractC0203C.e(aVar);
        if (aVar.b()) {
            SparseIntArray sparseIntArray = (SparseIntArray) dVar.f520e;
            int i6 = sparseIntArray.get(12451000, -1);
            if (i6 != -1) {
                iB = i6;
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= sparseIntArray.size()) {
                        iB = i6;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i7);
                    if (iKeyAt > 12451000 && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (iB == -1) {
                    iB = ((Y0.e) dVar.f).b(context, 12451000);
                }
                sparseIntArray.put(12451000, iB);
            }
        }
        if (iB != 0) {
            f(new Y0.a(iB, null));
            return;
        }
        C0093a c0093a = this.f2935c;
        C0097e c0097e = new C0097e();
        c0097e.f2948i = c0099g;
        c0097e.f2946g = null;
        c0097e.f2947h = null;
        c0097e.f2944d = false;
        c0097e.f2945e = aVar;
        c0097e.f = c0093a;
        if (aVar.a()) {
            p pVar = this.f2939h;
            C0810a c0810a = pVar.f2973g;
            if (c0810a != null) {
                c0810a.d();
            }
            Integer numValueOf = Integer.valueOf(System.identityHashCode(pVar));
            G3.d dVar2 = pVar.f;
            dVar2.f750i = numValueOf;
            R1 r12 = pVar.f2970c;
            Looper looper = r12.getLooper();
            U0.b bVar = pVar.f2971d;
            Context context2 = pVar.f2969b;
            bVar.getClass();
            pVar.f2973g = new C0810a(context2, looper, dVar2, pVar, pVar);
            pVar.f2974h = c0097e;
            Set set = pVar.f2972e;
            if (set == null || set.isEmpty()) {
                r12.post(new A1.h(9, pVar));
            } else {
                C0810a c0810a2 = pVar.f2973g;
                c0810a2.getClass();
                c0810a2.f5038h = new C0198c(c0810a2);
                c0810a2.m(2, null);
            }
        }
        b1.k kVar2 = (b1.k) aVar;
        kVar2.f5038h = c0097e;
        kVar2.m(2, null);
    }

    public final void b(l lVar) {
        AbstractC0203C.b(this.f2943l.f2962i);
        boolean zL = ((b1.k) this.f2934b).l();
        LinkedList linkedList = this.f2933a;
        if (zL) {
            if (c(lVar)) {
                j();
                return;
            } else {
                linkedList.add(lVar);
                return;
            }
        }
        linkedList.add(lVar);
        Y0.a aVar = this.f2942k;
        if (aVar == null || aVar.f2807e == 0 || aVar.f == null) {
            a();
        } else {
            f(aVar);
        }
    }

    public final boolean c(l lVar) throws Resources.NotFoundException {
        Y0.c cVar;
        if (lVar == null) {
            Z0.a aVar = this.f2934b;
            lVar.a(this.f2936d, aVar.a());
            try {
                lVar.g(this);
            } catch (DeadObjectException unused) {
                g();
                ((b1.k) aVar).d();
            }
            return true;
        }
        Y0.c[] cVarArrD = lVar.d(this);
        if (cVarArrD == null || cVarArrD.length == 0) {
            cVar = null;
        } else {
            w wVar = ((b1.k) this.f2934b).f5048s;
            Y0.c[] cVarArr = wVar == null ? null : wVar.f5070e;
            if (cVarArr == null) {
                cVarArr = new Y0.c[0];
            }
            int length = cVarArr.length;
            C0704b c0704b = new C0704b();
            if (length == 0) {
                c0704b.f8236d = AbstractC0706d.f8211a;
                c0704b.f8237e = AbstractC0706d.f8212b;
            } else {
                c0704b.a(length);
            }
            c0704b.f = 0;
            for (Y0.c cVar2 : cVarArr) {
                c0704b.put(cVar2.f2811d, Long.valueOf(cVar2.d()));
            }
            int length2 = cVarArrD.length;
            for (int i5 = 0; i5 < length2; i5++) {
                cVar = cVarArrD[i5];
                if (!c0704b.containsKey(cVar.f2811d) || ((Long) c0704b.getOrDefault(cVar.f2811d, null)).longValue() < cVar.d()) {
                    break;
                }
            }
            cVar = null;
        }
        if (cVar == null) {
            Z0.a aVar2 = this.f2934b;
            lVar.a(this.f2936d, aVar2.a());
            try {
                lVar.g(this);
            } catch (DeadObjectException unused2) {
                g();
                ((b1.k) aVar2).d();
            }
            return true;
        }
        if (lVar.f(this)) {
            C0098f c0098f = new C0098f(this.f2935c, cVar);
            ArrayList arrayList = this.f2941j;
            int iIndexOf = arrayList.indexOf(c0098f);
            C0099g c0099g = this.f2943l;
            if (iIndexOf >= 0) {
                C0098f c0098f2 = (C0098f) arrayList.get(iIndexOf);
                c0099g.f2962i.removeMessages(15, c0098f2);
                R1 r12 = c0099g.f2962i;
                r12.sendMessageDelayed(Message.obtain(r12, 15, c0098f2), 5000L);
            } else {
                arrayList.add(c0098f);
                R1 r13 = c0099g.f2962i;
                r13.sendMessageDelayed(Message.obtain(r13, 15, c0098f), 5000L);
                R1 r14 = c0099g.f2962i;
                r14.sendMessageDelayed(Message.obtain(r14, 16, c0098f), 120000L);
                synchronized (C0099g.f2953l) {
                    this.f2943l.getClass();
                }
                int i6 = this.f2938g;
                Y0.e eVar = c0099g.f2957c;
                eVar.getClass();
                Context context = c0099g.f2956b;
                Intent intentA = eVar.a(context, 2, null);
                PendingIntent activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, UcmAgentService.ERROR_APPLET_UNKNOWN) : null;
                if (activity != null) {
                    int i7 = GoogleApiActivity.f5233e;
                    Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                    intent.putExtra("pending_intent", activity);
                    intent.putExtra("failing_client_id", i6);
                    intent.putExtra("notify_manager", true);
                    eVar.d(context, 2, PendingIntent.getActivity(context, 0, intent, UcmAgentService.ERROR_APPLET_UNKNOWN));
                }
            }
        } else {
            lVar.c(new Z0.h(cVar));
        }
        return false;
    }

    public final void d() {
        C0099g c0099g = this.f2943l;
        AbstractC0203C.b(c0099g.f2962i);
        this.f2942k = null;
        l(Y0.a.f2805h);
        if (this.f2940i) {
            R1 r12 = c0099g.f2962i;
            C0093a c0093a = this.f2935c;
            r12.removeMessages(11, c0093a);
            c0099g.f2962i.removeMessages(9, c0093a);
            this.f2940i = false;
        }
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h();
        j();
    }

    public final void e() {
        C0099g c0099g = this.f2943l;
        AbstractC0203C.b(c0099g.f2962i);
        this.f2942k = null;
        this.f2940i = true;
        this.f2936d.Q0(true, q.f2975a);
        R1 r12 = c0099g.f2962i;
        C0093a c0093a = this.f2935c;
        r12.sendMessageDelayed(Message.obtain(r12, 9, c0093a), 5000L);
        R1 r13 = c0099g.f2962i;
        r13.sendMessageDelayed(Message.obtain(r13, 11, c0093a), 120000L);
        ((SparseIntArray) c0099g.f2958d.f520e).clear();
    }

    @Override // Z0.e
    public final void f(Y0.a aVar) {
        C0810a c0810a;
        C0099g c0099g = this.f2943l;
        AbstractC0203C.b(c0099g.f2962i);
        p pVar = this.f2939h;
        if (pVar != null && (c0810a = pVar.f2973g) != null) {
            c0810a.d();
        }
        AbstractC0203C.b(this.f2943l.f2962i);
        this.f2942k = null;
        ((SparseIntArray) c0099g.f2958d.f520e).clear();
        l(aVar);
        if (aVar.f2807e == 4) {
            k(C0099g.f2952k);
            return;
        }
        if (this.f2933a.isEmpty()) {
            this.f2942k = aVar;
            return;
        }
        synchronized (C0099g.f2953l) {
            this.f2943l.getClass();
        }
        if (c0099g.c(aVar, this.f2938g)) {
            return;
        }
        if (aVar.f2807e == 18) {
            this.f2940i = true;
        }
        boolean z4 = this.f2940i;
        C0093a c0093a = this.f2935c;
        if (z4) {
            R1 r12 = c0099g.f2962i;
            r12.sendMessageDelayed(Message.obtain(r12, 9, c0093a), 5000L);
            return;
        }
        String str = (String) c0093a.f2927b.f;
        String strValueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(str).length() + 63);
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        k(new Status(17, sb.toString()));
    }

    @Override // Z0.d
    public final void g() {
        Looper looperMyLooper = Looper.myLooper();
        C0099g c0099g = this.f2943l;
        if (looperMyLooper == c0099g.f2962i.getLooper()) {
            e();
        } else {
            c0099g.f2962i.post(new m(this, 1));
        }
    }

    public final void h() {
        LinkedList linkedList = this.f2933a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            l lVar = (l) obj;
            if (!((b1.k) this.f2934b).l()) {
                return;
            }
            if (c(lVar)) {
                linkedList.remove(lVar);
            }
        }
    }

    public final void i() {
        C0099g c0099g = this.f2943l;
        AbstractC0203C.b(c0099g.f2962i);
        Status status = C0099g.f2951j;
        k(status);
        this.f2936d.Q0(false, status);
        HashMap map = this.f;
        for (AbstractC0102j abstractC0102j : (AbstractC0102j[]) map.keySet().toArray(new AbstractC0102j[map.size()])) {
            b(new s(new t1.i()));
        }
        l(new Y0.a(4));
        b1.k kVar = (b1.k) this.f2934b;
        if (kVar.l()) {
            B.g gVar = new B.g(28, this);
            kVar.getClass();
            c0099g.f2962i.post(new A1.h(8, gVar));
        }
    }

    public final void j() {
        C0099g c0099g = this.f2943l;
        R1 r12 = c0099g.f2962i;
        C0093a c0093a = this.f2935c;
        r12.removeMessages(12, c0093a);
        R1 r13 = c0099g.f2962i;
        r13.sendMessageDelayed(r13.obtainMessage(12, c0093a), c0099g.f2955a);
    }

    public final void k(Status status) {
        AbstractC0203C.b(this.f2943l.f2962i);
        LinkedList linkedList = this.f2933a;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((l) it.next()).b(status);
        }
        linkedList.clear();
    }

    public final void l(Y0.a aVar) {
        HashSet hashSet = this.f2937e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (AbstractC0203C.h(aVar, Y0.a.f2805h)) {
            b1.k kVar = (b1.k) this.f2934b;
            if (!kVar.l() || kVar.f5032a == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    @Override // Z0.d
    public final void p() {
        Looper looperMyLooper = Looper.myLooper();
        C0099g c0099g = this.f2943l;
        if (looperMyLooper == c0099g.f2962i.getLooper()) {
            d();
        } else {
            c0099g.f2962i.post(new m(this, 0));
        }
    }
}
