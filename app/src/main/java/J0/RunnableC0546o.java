package j0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: j0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0546o implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f7264h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final E0.b f7265i = new E0.b(3);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7266d;

    /* renamed from: e, reason: collision with root package name */
    public long f7267e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7268g;

    public static b0 c(RecyclerView recyclerView, int i5, long j5) {
        int iJ = recyclerView.f4814i.j();
        for (int i6 = 0; i6 < iJ; i6++) {
            b0 b0VarV = RecyclerView.V(recyclerView.f4814i.i(i6));
            if (b0VarV.f7130c == i5 && !b0VarV.g()) {
                return null;
            }
        }
        C0525P c0525p = recyclerView.f;
        try {
            recyclerView.h0();
            b0 b0VarK = c0525p.k(i5, j5);
            if (b0VarK != null) {
                if (!b0VarK.f() || b0VarK.g()) {
                    c0525p.a(b0VarK, false);
                } else {
                    c0525p.h(b0VarK.f7128a);
                }
            }
            recyclerView.i0(false);
            return b0VarK;
        } catch (Throwable th) {
            recyclerView.i0(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i5, int i6) {
        if (recyclerView.f4846v) {
            if (RecyclerView.f4719l2 && !this.f7266d.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f7267e == 0) {
                this.f7267e = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b5 b5Var = recyclerView.l0;
        b5Var.f5438a = i5;
        b5Var.f5439b = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r16) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.RunnableC0546o.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f7266d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f);
        } finally {
            this.f7267e = 0L;
            Trace.endSection();
        }
    }
}
