package P2;

import b3.AbstractC0219i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class z extends J2.b {
    public static Object f0(Map map, Comparable comparable) {
        AbstractC0219i.e("<this>", map);
        Object obj = map.get(comparable);
        if (obj != null || map.containsKey(comparable)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + comparable + " is missing in the map.");
    }

    public static int g0(int i5) {
        if (i5 < 0) {
            return i5;
        }
        if (i5 < 3) {
            return i5 + 1;
        }
        if (i5 < 1073741824) {
            return (int) ((i5 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map h0(O2.f fVar) {
        AbstractC0219i.e("pair", fVar);
        Map mapSingletonMap = Collections.singletonMap(fVar.f2006d, fVar.f2007e);
        AbstractC0219i.d("singletonMap(pair.first, pair.second)", mapSingletonMap);
        return mapSingletonMap;
    }

    public static Map i0(O2.f... fVarArr) {
        if (fVarArr.length <= 0) {
            return v.f2164d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(fVarArr.length));
        j0(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final void j0(HashMap map, O2.f[] fVarArr) {
        for (O2.f fVar : fVarArr) {
            map.put(fVar.f2006d, fVar.f2007e);
        }
    }

    public static Map k0(List list) {
        v vVar = v.f2164d;
        int size = list.size();
        if (size == 0) {
            return vVar;
        }
        if (size == 1) {
            return h0((O2.f) list.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O2.f fVar = (O2.f) it.next();
            linkedHashMap.put(fVar.f2006d, fVar.f2007e);
        }
        return linkedHashMap;
    }
}
