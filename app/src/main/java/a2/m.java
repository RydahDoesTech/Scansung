package a2;

import g2.InterfaceC0450a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m implements g2.b, InterfaceC0450a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3006a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f3007b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final V1.e f3008c;

    public m(V1.e eVar) {
        this.f3008c = eVar;
    }

    public final void a(com.google.firebase.messaging.f fVar) {
        V1.e eVar = this.f3008c;
        synchronized (this) {
            try {
                eVar.getClass();
                if (!this.f3006a.containsKey(V1.a.class)) {
                    this.f3006a.put(V1.a.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f3006a.get(V1.a.class)).put(fVar, eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void b(com.google.firebase.messaging.f fVar) {
        fVar.getClass();
        if (this.f3006a.containsKey(V1.a.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3006a.get(V1.a.class);
            concurrentHashMap.remove(fVar);
            if (concurrentHashMap.isEmpty()) {
                this.f3006a.remove(V1.a.class);
            }
        }
    }
}
