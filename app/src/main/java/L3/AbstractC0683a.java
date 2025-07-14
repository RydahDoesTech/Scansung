package l3;

import N3.b;
import N3.c;
import P2.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import y3.x;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0683a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f8023a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f8024b;

    static {
        List listH0 = n.h0(x.f9441a, x.f9447h, x.f9448i, x.f9443c, x.f9444d, x.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.j((c) it.next()));
        }
        f8023a = linkedHashSet;
        f8024b = b.j(x.f9446g);
    }
}
