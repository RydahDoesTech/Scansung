package V;

import B.g;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.picker.widget.D;
import androidx.picker.widget.J;
import androidx.picker.widget.M;
import androidx.picker.widget.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public final g f2584d;

    /* renamed from: a, reason: collision with root package name */
    public float f2581a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f2582b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2583c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2585e = false;
    public long f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2587h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2588i = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public float f2586g = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public f f2589j = null;

    /* renamed from: k, reason: collision with root package name */
    public float f2590k = Float.MAX_VALUE;

    public e(d dVar) {
        this.f2584d = new g(20, dVar);
    }

    public final void a(float f) {
        if (this.f2585e) {
            this.f2590k = f;
            return;
        }
        if (this.f2589j == null) {
            this.f2589j = new f(f);
        }
        f fVar = this.f2589j;
        double d5 = f;
        fVar.f2598i = d5;
        double d6 = (float) d5;
        if (d6 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d6 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f2586g * 0.75f);
        fVar.f2594d = dAbs;
        fVar.f2595e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z4 = this.f2585e;
        if (z4 || z4) {
            return;
        }
        this.f2585e = true;
        if (!this.f2583c) {
            this.f2582b = ((d) this.f2584d.f95e).f2580a;
        }
        float f5 = this.f2582b;
        if (f5 > Float.MAX_VALUE || f5 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = b.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        ArrayList arrayList = bVar.f2574b;
        if (arrayList.size() == 0) {
            if (bVar.f2576d == null) {
                bVar.f2576d = new D3.c(bVar.f2575c);
            }
            D3.c cVar = bVar.f2576d;
            ((Choreographer) cVar.f).postFrameCallback((a) cVar.f508g);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f2585e) {
            c(true);
        }
    }

    public final void c(boolean z4) {
        int i5 = 0;
        this.f2585e = false;
        ThreadLocal threadLocal = b.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f2573a.remove(this);
        ArrayList arrayList = bVar.f2574b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            bVar.f2577e = true;
        }
        this.f = 0L;
        this.f2583c = false;
        while (true) {
            ArrayList arrayList2 = this.f2587h;
            if (i5 >= arrayList2.size()) {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
                return;
            }
            if (arrayList2.get(i5) != null) {
                z zVar = (z) arrayList2.get(i5);
                switch (zVar.f4504a) {
                    case 0:
                        D d5 = (D) zVar.f4505b;
                        d5.f4084T0 = false;
                        d5.E.forceFinished(true);
                        d5.z(true);
                        break;
                    default:
                        M m4 = (M) zVar.f4505b;
                        m4.f4210F0 = false;
                        m4.f4267w.forceFinished(true);
                        m4.q(true);
                        break;
                }
            }
            i5++;
        }
    }

    public final void d(float f) {
        ArrayList arrayList;
        ((d) this.f2584d.f95e).f2580a = f;
        int i5 = 0;
        while (true) {
            arrayList = this.f2588i;
            if (i5 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i5) != null) {
                ((J) arrayList.get(i5)).a(this, this.f2582b, this.f2581a);
            }
            i5++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
