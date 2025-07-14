package I;

import b3.AbstractC0219i;
import r.C0806b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f845a;

    /* renamed from: b, reason: collision with root package name */
    public int f846b;

    public c(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f845a = new Object[i5];
    }

    public Object a() {
        int i5 = this.f846b;
        if (i5 <= 0) {
            return null;
        }
        int i6 = i5 - 1;
        Object[] objArr = this.f845a;
        Object obj = objArr[i6];
        AbstractC0219i.c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i6] = null;
        this.f846b--;
        return obj;
    }

    public void b(C0806b c0806b) {
        int i5 = this.f846b;
        Object[] objArr = this.f845a;
        if (i5 < objArr.length) {
            objArr[i5] = c0806b;
            this.f846b = i5 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z4;
        AbstractC0219i.e("instance", obj);
        int i5 = this.f846b;
        int i6 = 0;
        while (true) {
            objArr = this.f845a;
            if (i6 >= i5) {
                z4 = false;
                break;
            }
            if (objArr[i6] == obj) {
                z4 = true;
                break;
            }
            i6++;
        }
        if (z4) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i7 = this.f846b;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f846b = i7 + 1;
        return true;
    }

    public c() {
        this.f845a = new Object[256];
    }
}
