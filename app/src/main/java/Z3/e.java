package z3;

import P2.o;
import P2.s;
import P2.w;
import P2.z;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import m3.m;
import q3.EnumC0803m;
import q3.EnumC0804n;
import v3.t;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9492a = z.i0(new O2.f("PACKAGE", EnumSet.noneOf(EnumC0804n.class)), new O2.f("TYPE", EnumSet.of(EnumC0804n.CLASS, EnumC0804n.FILE)), new O2.f("ANNOTATION_TYPE", EnumSet.of(EnumC0804n.ANNOTATION_CLASS)), new O2.f("TYPE_PARAMETER", EnumSet.of(EnumC0804n.TYPE_PARAMETER)), new O2.f("FIELD", EnumSet.of(EnumC0804n.FIELD)), new O2.f("LOCAL_VARIABLE", EnumSet.of(EnumC0804n.LOCAL_VARIABLE)), new O2.f("PARAMETER", EnumSet.of(EnumC0804n.VALUE_PARAMETER)), new O2.f("CONSTRUCTOR", EnumSet.of(EnumC0804n.CONSTRUCTOR)), new O2.f("METHOD", EnumSet.of(EnumC0804n.FUNCTION, EnumC0804n.PROPERTY_GETTER, EnumC0804n.PROPERTY_SETTER)), new O2.f("TYPE_USE", EnumSet.of(EnumC0804n.TYPE)));

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9493b = z.i0(new O2.f("RUNTIME", EnumC0803m.f8491d), new O2.f("CLASS", EnumC0803m.f8492e), new O2.f("SOURCE", EnumC0803m.f));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static S3.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f9492a.get(N3.f.e(((t) it.next()).f9263b.name()).b());
            if (iterable == null) {
                iterable = w.f2165d;
            }
            s.n0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(o.l0(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new S3.i(N3.b.j(m.f8136u), N3.f.e(((EnumC0804n) it2.next()).name())));
        }
        return new S3.b(arrayList3, d.f9491d);
    }
}
