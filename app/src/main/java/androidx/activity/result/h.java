package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.r;
import b.AbstractC0195a;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import d3.AbstractC0397d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3156a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3157b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3158c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3159d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f3160e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f3161g = new Bundle();

    public final boolean a(int i5, int i6, Intent intent) {
        b bVar;
        String str = (String) this.f3156a.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f3160e.get(str);
        if (fVar == null || (bVar = fVar.f3152a) == null || !this.f3159d.contains(str)) {
            this.f.remove(str);
            this.f3161g.putParcelable(str, new a(intent, i6));
            return true;
        }
        bVar.a(fVar.f3153b.c(intent, i6));
        this.f3159d.remove(str);
        return true;
    }

    public abstract void b(int i5, AbstractC0195a abstractC0195a, Object obj);

    public final d c(final String str, InterfaceC0159w interfaceC0159w, final AbstractC0195a abstractC0195a, final b bVar) {
        r lifecycle = interfaceC0159w.getLifecycle();
        C0161y c0161y = (C0161y) lifecycle;
        if (c0161y.f4031c.compareTo(EnumC0154q.f4023g) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0159w + " is attempting to register while current state is " + c0161y.f4031c + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.f3158c;
        g gVar = (g) map.get(str);
        if (gVar == null) {
            gVar = new g(lifecycle);
        }
        InterfaceC0157u interfaceC0157u = new InterfaceC0157u() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w2, EnumC0153p enumC0153p) {
                boolean zEquals = EnumC0153p.ON_START.equals(enumC0153p);
                String str2 = str;
                h hVar = this.f3146d;
                if (!zEquals) {
                    if (EnumC0153p.ON_STOP.equals(enumC0153p)) {
                        hVar.f3160e.remove(str2);
                        return;
                    } else {
                        if (EnumC0153p.ON_DESTROY.equals(enumC0153p)) {
                            hVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = hVar.f3160e;
                b bVar2 = bVar;
                AbstractC0195a abstractC0195a2 = abstractC0195a;
                map2.put(str2, new f(abstractC0195a2, bVar2));
                HashMap map3 = hVar.f;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    bVar2.a(obj);
                }
                Bundle bundle = hVar.f3161g;
                a aVar = (a) bundle.getParcelable(str2);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar2.a(abstractC0195a2.c(aVar.f3148e, aVar.f3147d));
                }
            }
        };
        gVar.f3154a.a(interfaceC0157u);
        gVar.f3155b.add(interfaceC0157u);
        map.put(str, gVar);
        return new d();
    }

    public final e d(String str, AbstractC0195a abstractC0195a, b bVar) {
        e(str);
        this.f3160e.put(str, new f(abstractC0195a, bVar));
        HashMap map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f3161g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.a(abstractC0195a.c(aVar.f3148e, aVar.f3147d));
        }
        return new e(this, str, abstractC0195a);
    }

    public final void e(String str) {
        HashMap map = this.f3157b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        AbstractC0397d.f6401d.getClass();
        int iA = AbstractC0397d.f6402e.a();
        while (true) {
            int i5 = iA + NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID;
            HashMap map2 = this.f3156a;
            if (!map2.containsKey(Integer.valueOf(i5))) {
                map2.put(Integer.valueOf(i5), str);
                map.put(str, Integer.valueOf(i5));
                return;
            } else {
                AbstractC0397d.f6401d.getClass();
                iA = AbstractC0397d.f6402e.a();
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f3159d.contains(str) && (num = (Integer) this.f3157b.remove(str)) != null) {
            this.f3156a.remove(num);
        }
        this.f3160e.remove(str);
        HashMap map = this.f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f3161g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f3158c;
        g gVar = (g) map2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f3155b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f3154a.b((InterfaceC0157u) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
