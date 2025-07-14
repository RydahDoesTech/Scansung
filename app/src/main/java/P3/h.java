package P3;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public enum h {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* renamed from: e, reason: collision with root package name */
    public static final Set f2198e;
    public static final Set f;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2213d;

    static {
        h[] hVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (h hVar : hVarArrValues) {
            if (hVar.f2213d) {
                arrayList.add(hVar);
            }
        }
        f2198e = P2.m.R0(arrayList);
        f = P2.i.x0(values());
    }

    h(boolean z4) {
        this.f2213d = z4;
    }
}
