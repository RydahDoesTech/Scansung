package j0;

import J.C0045b;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: j0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525P {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7086a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7087b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7088c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7089d;

    /* renamed from: e, reason: collision with root package name */
    public int f7090e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C0524O f7091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7092h;

    public C0525P(RecyclerView recyclerView) {
        this.f7092h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7086a = arrayList;
        this.f7087b = null;
        this.f7088c = new ArrayList();
        this.f7089d = Collections.unmodifiableList(arrayList);
        this.f7090e = 2;
        this.f = 2;
    }

    public final void a(b0 b0Var, boolean z4) {
        RecyclerView.q(b0Var);
        RecyclerView recyclerView = this.f7092h;
        d0 d0Var = recyclerView.t0;
        View view = b0Var.f7128a;
        if (d0Var != null) {
            C0045b c0045bJ = d0Var.j();
            J.P.h(view, c0045bJ instanceof c0 ? (C0045b) ((c0) c0045bJ).f7149e.remove(view) : null);
        }
        if (z4) {
            ArrayList arrayList = recyclerView.f4835r;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.m0 != null) {
                recyclerView.f4818j.D(b0Var);
            }
            if (RecyclerView.f4720m2) {
                Log.d("SeslRecyclerView", "dispatchViewRecycled: " + b0Var);
            }
        }
        b0Var.f7144s = null;
        b0Var.f7143r = null;
        C0524O c0524oC = c();
        c0524oC.getClass();
        int i5 = b0Var.f;
        ArrayList arrayList2 = c0524oC.a(i5).f7079a;
        if (((C0523N) c0524oC.f7083a.get(i5)).f7080b <= arrayList2.size()) {
            g3.y.e(view);
        } else {
            if (RecyclerView.f4719l2 && arrayList2.contains(b0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            b0Var.n();
            arrayList2.add(b0Var);
        }
    }

    public final int b(int i5) {
        RecyclerView recyclerView = this.f7092h;
        if (i5 >= 0 && i5 < recyclerView.m0.b()) {
            return !recyclerView.m0.f7105g ? i5 : recyclerView.f4810h.f(i5, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i5 + ". State item count is " + recyclerView.m0.b() + recyclerView.G());
    }

    public final C0524O c() {
        if (this.f7091g == null) {
            C0524O c0524o = new C0524O();
            c0524o.f7083a = new SparseArray();
            c0524o.f7084b = 0;
            c0524o.f7085c = Collections.newSetFromMap(new IdentityHashMap());
            this.f7091g = c0524o;
            d();
        }
        return this.f7091g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0510A abstractC0510A;
        C0524O c0524o = this.f7091g;
        if (c0524o == null || (abstractC0510A = (recyclerView = this.f7092h).f4831p) == null || !recyclerView.f4846v) {
            return;
        }
        c0524o.f7085c.add(abstractC0510A);
    }

    public final void e(AbstractC0510A abstractC0510A, boolean z4) {
        C0524O c0524o = this.f7091g;
        if (c0524o == null) {
            return;
        }
        Set set = c0524o.f7085c;
        set.remove(abstractC0510A);
        if (set.size() != 0 || z4) {
            return;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = c0524o.f7083a;
            if (i5 >= sparseArray.size()) {
                return;
            }
            C0523N c0523n = (C0523N) sparseArray.get(sparseArray.keyAt(i5));
            if (c0523n != null) {
                ArrayList arrayList = c0523n.f7079a;
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    g3.y.e(((b0) arrayList.get(i6)).f7128a);
                }
            }
            i5++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f7088c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f4723r2) {
            b5 b5Var = this.f7092h.l0;
            int[] iArr = (int[]) b5Var.f5441d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            b5Var.f5440c = 0;
        }
    }

    public final void g(int i5) {
        if (RecyclerView.f4720m2) {
            Log.d("SeslRecyclerView", "Recycling cached view at index " + i5);
        }
        ArrayList arrayList = this.f7088c;
        b0 b0Var = (b0) arrayList.get(i5);
        if (RecyclerView.f4720m2) {
            Log.d("SeslRecyclerView", "CachedViewHolder to be recycled: " + b0Var);
        }
        a(b0Var, true);
        arrayList.remove(i5);
    }

    public final void h(View view) {
        b0 b0VarV = RecyclerView.V(view);
        boolean zK = b0VarV.k();
        RecyclerView recyclerView = this.f7092h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (b0VarV.j()) {
            b0VarV.n.l(b0VarV);
        } else if (b0VarV.q()) {
            b0VarV.f7136j &= -33;
        }
        i(b0VarV);
        if (recyclerView.f4767Q == null || b0VarV.h()) {
            return;
        }
        recyclerView.f4767Q.d(b0VarV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(j0.b0 r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0525P.i(j0.b0):void");
    }

    public final void j(View view) {
        AbstractC0515F abstractC0515F;
        b0 b0VarV = RecyclerView.V(view);
        boolean zD = b0VarV.d(12);
        RecyclerView recyclerView = this.f7092h;
        if (!zD && b0VarV.l() && (abstractC0515F = recyclerView.f4767Q) != null) {
            C0542k c0542k = (C0542k) abstractC0515F;
            if (b0VarV.c().isEmpty() && c0542k.f7159d && !b0VarV.g()) {
                if (this.f7087b == null) {
                    this.f7087b = new ArrayList();
                }
                b0VarV.n = this;
                b0VarV.f7140o = true;
                this.f7087b.add(b0VarV);
                return;
            }
        }
        if (b0VarV.g() && !b0VarV.i() && !recyclerView.f4831p.f7051b) {
            throw new IllegalArgumentException(g4.f.b(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        b0VarV.n = this;
        b0VarV.f7140o = false;
        this.f7086a.add(b0VarV);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j0.b0 k(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0525P.k(int, long):j0.b0");
    }

    public final void l(b0 b0Var) {
        if (b0Var.f7140o) {
            this.f7087b.remove(b0Var);
        } else {
            this.f7086a.remove(b0Var);
        }
        b0Var.n = null;
        b0Var.f7140o = false;
        b0Var.f7136j &= -33;
    }

    public final void m() {
        AbstractC0519J abstractC0519J = this.f7092h.f4833q;
        this.f = this.f7090e + (abstractC0519J != null ? abstractC0519J.f7070j : 0);
        ArrayList arrayList = this.f7088c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            g(size);
        }
    }
}
