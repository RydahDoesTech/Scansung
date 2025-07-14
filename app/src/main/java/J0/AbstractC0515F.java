package j0;

import J.C0059p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: j0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0515F {

    /* renamed from: a, reason: collision with root package name */
    public C0556y f7053a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7054b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f7055c;

    public static void b(b0 b0Var) {
        RecyclerView recyclerView;
        int i5 = b0Var.f7136j;
        if (b0Var.g() || (i5 & 4) != 0 || (recyclerView = b0Var.f7143r) == null) {
            return;
        }
        recyclerView.R(b0Var);
    }

    public abstract boolean a(b0 b0Var, b0 b0Var2, C0059p c0059p, C0059p c0059p2);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(j0.b0 r9) {
        /*
            r8 = this;
            j0.y r8 = r8.f7053a
            if (r8 == 0) goto Lc8
            r0 = 1
            r9.o(r0)
            j0.b0 r1 = r9.f7134h
            r2 = 0
            if (r1 == 0) goto L13
            j0.b0 r1 = r9.f7135i
            if (r1 != 0) goto L13
            r9.f7134h = r2
        L13:
            r9.f7135i = r2
            androidx.recyclerview.widget.RecyclerView r8 = r8.f7319a
            java.util.ArrayList r1 = r8.f4838s
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            j0.G r2 = (j0.AbstractC0516G) r2
            goto L1d
        L2a:
            int r1 = r9.f7136j
            r1 = r1 & 16
            if (r1 == 0) goto L32
            goto Lc8
        L32:
            r8.B0()
            B3.h r1 = r8.f4814i
            java.lang.Object r2 = r1.f262d
            j0.c r2 = (j0.C0534c) r2
            java.lang.Object r3 = r1.f261c
            j0.y r3 = (j0.C0556y) r3
            int r4 = r1.f260b
            r5 = 0
            android.view.View r6 = r9.f7128a
            if (r4 != r0) goto L56
            java.lang.Object r0 = r1.f
            android.view.View r0 = (android.view.View) r0
            if (r0 != r6) goto L4e
        L4c:
            r0 = r5
            goto L7f
        L4e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r9)
            throw r8
        L56:
            r7 = 2
            if (r4 == r7) goto Lc0
            r1.f260b = r7     // Catch: java.lang.Throwable -> L6a
            androidx.recyclerview.widget.RecyclerView r4 = r3.f7319a     // Catch: java.lang.Throwable -> L6a
            int r4 = r4.indexOfChild(r6)     // Catch: java.lang.Throwable -> L6a
            r7 = -1
            if (r4 != r7) goto L6c
            r1.m(r6)     // Catch: java.lang.Throwable -> L6a
        L67:
            r1.f260b = r5
            goto L7f
        L6a:
            r8 = move-exception
            goto Lbd
        L6c:
            boolean r7 = r2.d(r4)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L7c
            r2.f(r4)     // Catch: java.lang.Throwable -> L6a
            r1.m(r6)     // Catch: java.lang.Throwable -> L6a
            r3.h(r4)     // Catch: java.lang.Throwable -> L6a
            goto L67
        L7c:
            r1.f260b = r5
            goto L4c
        L7f:
            if (r0 == 0) goto Lac
            j0.b0 r1 = androidx.recyclerview.widget.RecyclerView.V(r6)
            j0.P r2 = r8.f
            r2.l(r1)
            r2.i(r1)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f4720m2
            if (r1 == 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "after removing animated view: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SeslRecyclerView"
            android.util.Log.d(r2, r1)
        Lac:
            r1 = r0 ^ 1
            r8.D0(r1)
            if (r0 != 0) goto Lc8
            boolean r9 = r9.k()
            if (r9 == 0) goto Lc8
            r8.removeDetachedView(r6, r5)
            goto Lc8
        Lbd:
            r1.f260b = r5
            throw r8
        Lc0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r9)
            throw r8
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0515F.c(j0.b0):void");
    }

    public abstract void d(b0 b0Var);

    public abstract void e();

    public abstract boolean f();
}
