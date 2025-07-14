package n4;

import P2.z;
import b3.AbstractC0219i;
import b3.t;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k4.p;

/* loaded from: classes.dex */
public final class h extends AbstractSet {
    public static final /* synthetic */ int f = 0;

    /* renamed from: d, reason: collision with root package name */
    public Object f8196d;

    /* renamed from: e, reason: collision with root package name */
    public int f8197e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i5 = this.f8197e;
        if (i5 == 0) {
            this.f8196d = obj;
        } else {
            if (i5 == 1) {
                if (AbstractC0219i.a(this.f8196d, obj)) {
                    return false;
                }
                this.f8196d = new Object[]{this.f8196d, obj};
            } else if (i5 < 5) {
                Object obj2 = this.f8196d;
                AbstractC0219i.c("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
                Object[] objArr2 = (Object[]) obj2;
                if (P2.i.k0(obj, objArr2)) {
                    return false;
                }
                int i6 = this.f8197e;
                if (i6 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC0219i.e("elements", objArrCopyOf);
                    ?? linkedHashSet = new LinkedHashSet(z.g0(objArrCopyOf.length));
                    for (Object obj3 : objArrCopyOf) {
                        linkedHashSet.add(obj3);
                    }
                    linkedHashSet.add(obj);
                    objArr = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, i6 + 1);
                    AbstractC0219i.d("copyOf(this, newSize)", objArrCopyOf2);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    objArr = objArrCopyOf2;
                }
                this.f8196d = objArr;
            } else {
                Object obj4 = this.f8196d;
                AbstractC0219i.c("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>", obj4);
                if (!t.a(obj4).add(obj)) {
                    return false;
                }
            }
        }
        this.f8197e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8196d = null;
        this.f8197e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i5 = this.f8197e;
        if (i5 == 0) {
            return false;
        }
        if (i5 == 1) {
            return AbstractC0219i.a(this.f8196d, obj);
        }
        if (i5 < 5) {
            Object obj2 = this.f8196d;
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
            return P2.i.k0(obj, (Object[]) obj2);
        }
        Object obj3 = this.f8196d;
        AbstractC0219i.c("null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>", obj3);
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator gVar;
        int i5 = this.f8197e;
        if (i5 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i5 == 1) {
            gVar = new p(1, this.f8196d);
        } else {
            if (i5 >= 5) {
                Object obj = this.f8196d;
                AbstractC0219i.c("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>", obj);
                return t.a(obj).iterator();
            }
            Object obj2 = this.f8196d;
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
            gVar = new g((Object[]) obj2);
        }
        return gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8197e;
    }
}
