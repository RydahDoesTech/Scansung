package C3;

import b3.AbstractC0219i;
import e4.AbstractC0419b;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import s3.AbstractC0846b;

/* renamed from: C3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017i extends AbstractC0419b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f399c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0846b f401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017i(k kVar) {
        super(((B3.b) kVar.f405m.f255e).f223a);
        this.f401e = kVar;
        d4.l lVar = ((B3.b) kVar.f405m.f255e).f223a;
        C0016h c0016h = new C0016h(kVar, 0);
        lVar.getClass();
        this.f400d = new d4.i(lVar, c0016h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fe  */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    @Override // e4.AbstractC0424g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection b() {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.C0017i.b():java.util.Collection");
    }

    @Override // e4.AbstractC0424g
    public final C0753O d() {
        switch (this.f399c) {
            case 0:
                return ((B3.b) ((k) this.f401e).f405m.f255e).f234m;
            default:
                return C0753O.f;
        }
    }

    @Override // e4.J
    public final boolean h() {
        switch (this.f399c) {
        }
        return true;
    }

    @Override // e4.AbstractC0419b, e4.J
    public final InterfaceC0763g i() {
        switch (this.f399c) {
            case 0:
                return (k) this.f401e;
            default:
                return (c4.i) this.f401e;
        }
    }

    @Override // e4.J
    public final List k() {
        switch (this.f399c) {
        }
        return (List) this.f400d.a();
    }

    @Override // e4.AbstractC0419b
    /* renamed from: n */
    public final InterfaceC0761e i() {
        switch (this.f399c) {
            case 0:
                return (k) this.f401e;
            default:
                return (c4.i) this.f401e;
        }
    }

    public final String toString() {
        switch (this.f399c) {
            case 0:
                String strB = ((k) this.f401e).getName().b();
                AbstractC0219i.d("name.asString()", strB);
                return strB;
            default:
                String str = ((c4.i) this.f401e).getName().f1842d;
                AbstractC0219i.d("name.toString()", str);
                return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017i(c4.i iVar) {
        super(((a4.i) iVar.f5165o.f3058d).f3037a);
        this.f401e = iVar;
        d4.o oVar = ((a4.i) iVar.f5165o.f3058d).f3037a;
        c4.h hVar = new c4.h(iVar, 0);
        d4.l lVar = (d4.l) oVar;
        lVar.getClass();
        this.f400d = new d4.i(lVar, hVar);
    }
}
