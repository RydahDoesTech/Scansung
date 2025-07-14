package a2;

import com.idm.providers.mo.IDMMoInterface;
import g2.InterfaceC0450a;
import j2.InterfaceC0558a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class s extends J2.b {

    /* renamed from: i, reason: collision with root package name */
    public final Set f3018i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f3019j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f3020k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f3021l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0105c f3022m;

    public s(C0104b c0104b, InterfaceC0105c interfaceC0105c) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k kVar : c0104b.f2986b) {
            int i5 = kVar.f3005c;
            boolean z4 = i5 == 0;
            int i6 = kVar.f3004b;
            Class cls = kVar.f3003a;
            if (z4) {
                if (i6 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (i5 == 2) {
                hashSet3.add(cls);
            } else if (i6 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        if (!c0104b.f.isEmpty()) {
            hashSet.add(InterfaceC0450a.class);
        }
        this.f3018i = Collections.unmodifiableSet(hashSet);
        this.f3019j = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f3020k = Collections.unmodifiableSet(hashSet4);
        this.f3021l = Collections.unmodifiableSet(hashSet5);
        this.f3022m = interfaceC0105c;
    }

    @Override // J2.b, a2.InterfaceC0105c
    public final Object a(Class cls) {
        if (!this.f3018i.contains(cls)) {
            throw new O2.d("Attempting to request an undeclared dependency " + cls + IDMMoInterface.IDM_MO_ROOT_PATH);
        }
        Object objA = this.f3022m.a(cls);
        if (!cls.equals(InterfaceC0450a.class)) {
            return objA;
        }
        return new r();
    }

    @Override // a2.InterfaceC0105c
    public final InterfaceC0558a b(Class cls) {
        if (this.f3019j.contains(cls)) {
            return this.f3022m.b(cls);
        }
        throw new O2.d("Attempting to request an undeclared dependency Provider<" + cls + ">.");
    }

    @Override // J2.b, a2.InterfaceC0105c
    public final Set c(Class cls) {
        if (this.f3020k.contains(cls)) {
            return this.f3022m.c(cls);
        }
        throw new O2.d("Attempting to request an undeclared dependency Set<" + cls + ">.");
    }

    @Override // a2.InterfaceC0105c
    public final InterfaceC0558a d(Class cls) {
        if (this.f3021l.contains(cls)) {
            return this.f3022m.d(cls);
        }
        throw new O2.d("Attempting to request an undeclared dependency Provider<Set<" + cls + ">>.");
    }
}
