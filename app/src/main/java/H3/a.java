package H3;

import P2.z;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f814e;

    /* renamed from: d, reason: collision with root package name */
    public final int f821d;

    static {
        a[] aVarArrValues = values();
        int iG0 = z.g0(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0 < 16 ? 16 : iG0);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.f821d), aVar);
        }
        f814e = linkedHashMap;
    }

    a(int i5) {
        this.f821d = i5;
    }
}
