package a4;

import com.google.android.gms.internal.p000firebaseauthapi.C0319p0;
import com.google.android.gms.internal.p000firebaseauthapi.U4;
import com.google.android.gms.internal.p000firebaseauthapi.X;
import com.google.android.gms.internal.p000firebaseauthapi.Z4;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p3.InterfaceC0752N;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3092a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f3093b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3094c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3095d;

    public /* synthetic */ v() {
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean l(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i5, int i6);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i5);

    public abstract Object i(int i5, Object obj);

    public abstract N3.c j();

    public Object[] m(Object[] objArr, int i5) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i6 = 0; i6 < iD; i6++) {
            objArr[i6] = b(i6, i5);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }

    public X n() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int o();

    public abstract U4 p(Z4 z4);

    public Object q(U4 u4, Class cls) {
        C0319p0 c0319p0 = (C0319p0) ((Map) this.f3094c).get(cls);
        if (c0319p0 != null) {
            return c0319p0.a(u4);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String r();

    public abstract void s(U4 u4);

    public String toString() {
        switch (this.f3092a) {
            case 0:
                return getClass().getSimpleName() + ": " + j();
            default:
                return super.toString();
        }
    }

    public v(Class cls, C0319p0[] c0319p0Arr) {
        this.f3093b = cls;
        HashMap map = new HashMap();
        for (int i5 = 0; i5 <= 0; i5++) {
            C0319p0 c0319p0 = c0319p0Arr[i5];
            boolean zContainsKey = map.containsKey(c0319p0.f5581a);
            Class cls2 = c0319p0.f5581a;
            if (zContainsKey) {
                String strValueOf = String.valueOf(cls2.getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(cls2, c0319p0);
        }
        this.f3095d = c0319p0Arr[0].f5581a;
        this.f3094c = Collections.unmodifiableMap(map);
    }

    public v(K3.f fVar, K3.g gVar, InterfaceC0752N interfaceC0752N) {
        this.f3093b = fVar;
        this.f3094c = gVar;
        this.f3095d = interfaceC0752N;
    }
}
