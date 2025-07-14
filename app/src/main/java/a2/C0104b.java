package a2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104b {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2988d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2989e;
    public final Set f;

    public C0104b(HashSet hashSet, HashSet hashSet2, int i5, int i6, e eVar, HashSet hashSet3) {
        this.f2985a = Collections.unmodifiableSet(hashSet);
        this.f2986b = Collections.unmodifiableSet(hashSet2);
        this.f2987c = i5;
        this.f2988d = i6;
        this.f2989e = eVar;
        this.f = Collections.unmodifiableSet(hashSet3);
    }

    public static C0103a a(Class cls) {
        return new C0103a(cls, new Class[0]);
    }

    public static C0104b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            Y0.j.e("Null interface", cls2);
        }
        Collections.addAll(hashSet, clsArr);
        return new C0104b(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new I0.b(5, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2985a.toArray()) + ">{" + this.f2987c + ", type=" + this.f2988d + ", deps=" + Arrays.toString(this.f2986b.toArray()) + "}";
    }
}
