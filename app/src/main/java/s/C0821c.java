package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k.Q0;
import t.n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821c {

    /* renamed from: b, reason: collision with root package name */
    public int f8602b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8603c;

    /* renamed from: d, reason: collision with root package name */
    public final C0822d f8604d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8605e;
    public C0821c f;

    /* renamed from: i, reason: collision with root package name */
    public r.f f8608i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f8601a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f8606g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f8607h = -1;

    public C0821c(C0822d c0822d, int i5) {
        this.f8604d = c0822d;
        this.f8605e = i5;
    }

    public final void a(C0821c c0821c, int i5) {
        b(c0821c, i5, -1, false);
    }

    public final boolean b(C0821c c0821c, int i5, int i6, boolean z4) {
        if (c0821c == null) {
            j();
            return true;
        }
        if (!z4 && !i(c0821c)) {
            return false;
        }
        this.f = c0821c;
        if (c0821c.f8601a == null) {
            c0821c.f8601a = new HashSet();
        }
        HashSet hashSet = this.f.f8601a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i5 > 0) {
            this.f8606g = i5;
        } else {
            this.f8606g = 0;
        }
        this.f8607h = i6;
        return true;
    }

    public final void c(int i5, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f8601a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((C0821c) it.next()).f8604d, i5, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f8603c) {
            return this.f8602b;
        }
        return 0;
    }

    public final int e() {
        C0821c c0821c;
        if (this.f8604d.f8635a0 == 8) {
            return 0;
        }
        int i5 = this.f8607h;
        return (i5 <= -1 || (c0821c = this.f) == null || c0821c.f8604d.f8635a0 != 8) ? this.f8606g : i5;
    }

    public final C0821c f() {
        int i5 = this.f8605e;
        int iC = Q0.c(i5);
        C0822d c0822d = this.f8604d;
        switch (iC) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0822d.E;
            case 2:
                return c0822d.f8613F;
            case 3:
                return c0822d.f8611C;
            case 4:
                return c0822d.f8612D;
            default:
                throw new AssertionError(g4.f.e(i5));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f8601a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0821c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(C0821c c0821c) {
        if (c0821c == null) {
            return false;
        }
        int i5 = this.f8605e;
        C0822d c0822d = c0821c.f8604d;
        int i6 = c0821c.f8605e;
        if (i6 == i5) {
            return i5 != 6 || (c0822d.f8665y && this.f8604d.f8665y);
        }
        switch (Q0.c(i5)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z4 = i6 == 2 || i6 == 4;
                if (c0822d instanceof h) {
                    return z4 || i6 == 8;
                }
                return z4;
            case 2:
            case 4:
                boolean z5 = i6 == 3 || i6 == 5;
                if (c0822d instanceof h) {
                    return z5 || i6 == 9;
                }
                return z5;
            case 6:
                return (i6 == 6 || i6 == 8 || i6 == 9) ? false : true;
            default:
                throw new AssertionError(g4.f.e(i5));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0821c c0821c = this.f;
        if (c0821c != null && (hashSet = c0821c.f8601a) != null) {
            hashSet.remove(this);
            if (this.f.f8601a.size() == 0) {
                this.f.f8601a = null;
            }
        }
        this.f8601a = null;
        this.f = null;
        this.f8606g = 0;
        this.f8607h = -1;
        this.f8603c = false;
        this.f8602b = 0;
    }

    public final void k() {
        r.f fVar = this.f8608i;
        if (fVar == null) {
            this.f8608i = new r.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i5) {
        this.f8602b = i5;
        this.f8603c = true;
    }

    public final String toString() {
        return this.f8604d.f8637b0 + ":" + g4.f.e(this.f8605e);
    }
}
