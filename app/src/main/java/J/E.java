package J;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1415a;

    /* renamed from: b, reason: collision with root package name */
    public int f1416b;

    /* renamed from: c, reason: collision with root package name */
    public int f1417c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1418d;

    public E() {
        if (Y0.h.f2823h == null) {
            Y0.h.f2823h = new Y0.h(6);
        }
    }

    public int a(int i5) {
        if (i5 < this.f1417c) {
            return ((ByteBuffer) this.f1418d).getShort(this.f1416b + i5);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1416b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1416b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f1415a);
            if (!((Class) this.f1418d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            WeakHashMap weakHashMap = P.f1421a;
            View.AccessibilityDelegate accessibilityDelegateA = M.a(view);
            C0045b c0045b = accessibilityDelegateA != null ? accessibilityDelegateA instanceof C0044a ? ((C0044a) accessibilityDelegateA).f1435a : new C0045b(accessibilityDelegateA) : null;
            if (c0045b == null) {
                c0045b = new C0045b();
            }
            P.h(view, c0045b);
            view.setTag(this.f1415a, obj);
            P.d(this.f1417c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
