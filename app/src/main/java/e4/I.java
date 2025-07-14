package e4;

import b3.AbstractC0219i;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6651a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6652b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.b f6653c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.e f6654d;

    /* renamed from: e, reason: collision with root package name */
    public final f4.f f6655e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayDeque f6656g;

    /* renamed from: h, reason: collision with root package name */
    public n4.h f6657h;

    public I(boolean z4, boolean z5, f4.b bVar, f4.e eVar, f4.f fVar) {
        AbstractC0219i.e("typeSystemContext", bVar);
        AbstractC0219i.e("kotlinTypePreparator", eVar);
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        this.f6651a = z4;
        this.f6652b = z5;
        this.f6653c = bVar;
        this.f6654d = eVar;
        this.f6655e = fVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f6656g;
        AbstractC0219i.b(arrayDeque);
        arrayDeque.clear();
        n4.h hVar = this.f6657h;
        AbstractC0219i.b(hVar);
        hVar.clear();
    }

    public final void b() {
        if (this.f6656g == null) {
            this.f6656g = new ArrayDeque(4);
        }
        if (this.f6657h == null) {
            this.f6657h = new n4.h();
        }
    }

    public final Z c(h4.c cVar) {
        AbstractC0219i.e("type", cVar);
        return this.f6654d.g(cVar);
    }

    public final AbstractC0438v d(h4.c cVar) {
        AbstractC0219i.e("type", cVar);
        this.f6655e.getClass();
        return (AbstractC0438v) cVar;
    }
}
