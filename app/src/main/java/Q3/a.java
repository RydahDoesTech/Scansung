package Q3;

import b3.AbstractC0219i;
import e4.J;
import java.util.ArrayDeque;
import p3.InterfaceC0755Q;
import p3.InterfaceC0758b;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class a implements f4.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2333a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2334b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2335c;

    public a(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2, boolean z4) {
        this.f2333a = z4;
        this.f2334b = interfaceC0758b;
        this.f2335c = interfaceC0758b2;
    }

    @Override // f4.c
    public boolean a(J j5, J j6) {
        InterfaceC0758b interfaceC0758b = (InterfaceC0758b) this.f2334b;
        AbstractC0219i.e("$a", interfaceC0758b);
        InterfaceC0758b interfaceC0758b2 = (InterfaceC0758b) this.f2335c;
        AbstractC0219i.e("$b", interfaceC0758b2);
        AbstractC0219i.e("c1", j5);
        AbstractC0219i.e("c2", j6);
        if (j5.equals(j6)) {
            return true;
        }
        InterfaceC0763g interfaceC0763gI = j5.i();
        InterfaceC0763g interfaceC0763gI2 = j6.i();
        if (!(interfaceC0763gI instanceof InterfaceC0755Q) || !(interfaceC0763gI2 instanceof InterfaceC0755Q)) {
            return false;
        }
        return d.f2340a.d((InterfaceC0755Q) interfaceC0763gI, (InterfaceC0755Q) interfaceC0763gI2, this.f2333a, new c(interfaceC0758b, interfaceC0758b2));
    }

    public void b(t1.h hVar) {
        t1.m mVar;
        synchronized (this.f2334b) {
            if (((ArrayDeque) this.f2335c) != null && !this.f2333a) {
                this.f2333a = true;
                while (true) {
                    synchronized (this.f2334b) {
                        try {
                            mVar = (t1.m) ((ArrayDeque) this.f2335c).poll();
                            if (mVar == null) {
                                this.f2333a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    mVar.onComplete(hVar);
                }
            }
        }
    }

    public void c(t1.m mVar) {
        synchronized (this.f2334b) {
            try {
                if (((ArrayDeque) this.f2335c) == null) {
                    this.f2335c = new ArrayDeque();
                }
                ((ArrayDeque) this.f2335c).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a() {
        this.f2334b = new Object();
    }
}
