package androidx.lifecycle;

import android.os.Looper;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l.C0677a;
import m.C0684a;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161y extends r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4029a;

    /* renamed from: b, reason: collision with root package name */
    public C0684a f4030b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0154q f4031c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f4032d;

    /* renamed from: e, reason: collision with root package name */
    public int f4033e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4034g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4035h;

    public C0161y(InterfaceC0159w interfaceC0159w) {
        new AtomicReference();
        this.f4029a = true;
        this.f4030b = new C0684a();
        this.f4031c = EnumC0154q.f4022e;
        this.f4035h = new ArrayList();
        this.f4032d = new WeakReference(interfaceC0159w);
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0158v interfaceC0158v) {
        InterfaceC0157u reflectiveGenericLifecycleObserver;
        InterfaceC0159w interfaceC0159w;
        ArrayList arrayList = this.f4035h;
        AbstractC0219i.e("observer", interfaceC0158v);
        d("addObserver");
        EnumC0154q enumC0154q = this.f4031c;
        EnumC0154q enumC0154q2 = EnumC0154q.f4021d;
        if (enumC0154q != enumC0154q2) {
            enumC0154q2 = EnumC0154q.f4022e;
        }
        C0160x c0160x = new C0160x();
        HashMap map = AbstractC0162z.f4036a;
        boolean z4 = interfaceC0158v instanceof InterfaceC0157u;
        boolean z5 = interfaceC0158v instanceof InterfaceC0145h;
        if (z4 && z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0145h) interfaceC0158v, (InterfaceC0157u) interfaceC0158v);
        } else if (z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0145h) interfaceC0158v, null);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = (InterfaceC0157u) interfaceC0158v;
        } else {
            Class<?> cls = interfaceC0158v.getClass();
            if (AbstractC0162z.b(cls) == 2) {
                Object obj = AbstractC0162z.f4037b.get(cls);
                AbstractC0219i.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0162z.a((Constructor) list.get(0), interfaceC0158v);
                    throw null;
                }
                int size = list.size();
                InterfaceC0148k[] interfaceC0148kArr = new InterfaceC0148k[size];
                if (size > 0) {
                    AbstractC0162z.a((Constructor) list.get(0), interfaceC0158v);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0148kArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0158v);
            }
        }
        c0160x.f4028b = reflectiveGenericLifecycleObserver;
        c0160x.f4027a = enumC0154q2;
        if (((C0160x) this.f4030b.m(interfaceC0158v, c0160x)) == null && (interfaceC0159w = (InterfaceC0159w) this.f4032d.get()) != null) {
            boolean z6 = this.f4033e != 0 || this.f;
            EnumC0154q enumC0154qC = c(interfaceC0158v);
            this.f4033e++;
            while (c0160x.f4027a.compareTo(enumC0154qC) < 0 && this.f4030b.f8025h.containsKey(interfaceC0158v)) {
                arrayList.add(c0160x.f4027a);
                C0151n c0151n = EnumC0153p.Companion;
                EnumC0154q enumC0154q3 = c0160x.f4027a;
                c0151n.getClass();
                EnumC0153p enumC0153pB = C0151n.b(enumC0154q3);
                if (enumC0153pB == null) {
                    throw new IllegalStateException("no event up from " + c0160x.f4027a);
                }
                c0160x.a(interfaceC0159w, enumC0153pB);
                arrayList.remove(arrayList.size() - 1);
                enumC0154qC = c(interfaceC0158v);
            }
            if (!z6) {
                h();
            }
            this.f4033e--;
        }
    }

    @Override // androidx.lifecycle.r
    public final void b(InterfaceC0158v interfaceC0158v) {
        AbstractC0219i.e("observer", interfaceC0158v);
        d("removeObserver");
        this.f4030b.n(interfaceC0158v);
    }

    public final EnumC0154q c(InterfaceC0158v interfaceC0158v) {
        C0160x c0160x;
        HashMap map = this.f4030b.f8025h;
        m.c cVar = map.containsKey(interfaceC0158v) ? ((m.c) map.get(interfaceC0158v)).f8030g : null;
        EnumC0154q enumC0154q = (cVar == null || (c0160x = (C0160x) cVar.f8029e) == null) ? null : c0160x.f4027a;
        ArrayList arrayList = this.f4035h;
        EnumC0154q enumC0154q2 = arrayList.isEmpty() ? null : (EnumC0154q) arrayList.get(arrayList.size() - 1);
        EnumC0154q enumC0154q3 = this.f4031c;
        AbstractC0219i.e("state1", enumC0154q3);
        if (enumC0154q == null || enumC0154q.compareTo(enumC0154q3) >= 0) {
            enumC0154q = enumC0154q3;
        }
        return (enumC0154q2 == null || enumC0154q2.compareTo(enumC0154q) >= 0) ? enumC0154q : enumC0154q2;
    }

    public final void d(String str) {
        if (this.f4029a) {
            C0677a.X().f8005c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(A3.f.o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0153p enumC0153p) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTIVITY_EVENT, enumC0153p);
        d("handleLifecycleEvent");
        f(enumC0153p.a());
    }

    public final void f(EnumC0154q enumC0154q) {
        EnumC0154q enumC0154q2 = this.f4031c;
        if (enumC0154q2 == enumC0154q) {
            return;
        }
        EnumC0154q enumC0154q3 = EnumC0154q.f4022e;
        EnumC0154q enumC0154q4 = EnumC0154q.f4021d;
        if (enumC0154q2 == enumC0154q3 && enumC0154q == enumC0154q4) {
            throw new IllegalStateException(("no event down from " + this.f4031c + " in component " + this.f4032d.get()).toString());
        }
        this.f4031c = enumC0154q;
        if (this.f || this.f4033e != 0) {
            this.f4034g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.f4031c == enumC0154q4) {
            this.f4030b = new C0684a();
        }
    }

    public final void g() {
        EnumC0154q enumC0154q = EnumC0154q.f;
        d("setCurrentState");
        f(enumC0154q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f4034g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0161y.h():void");
    }
}
