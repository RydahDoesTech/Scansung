package i;

import J.Z;
import android.view.View;
import android.view.animation.BaseInterpolator;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f6914c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0415a f6915d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6916e;

    /* renamed from: b, reason: collision with root package name */
    public long f6913b = -1;
    public final k f = new k(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6912a = new ArrayList();

    public final void a() {
        if (this.f6916e) {
            Iterator it = this.f6912a.iterator();
            while (it.hasNext()) {
                ((Z) it.next()).b();
            }
            this.f6916e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f6916e) {
            return;
        }
        Iterator it = this.f6912a.iterator();
        while (it.hasNext()) {
            Z z4 = (Z) it.next();
            long j5 = this.f6913b;
            if (j5 >= 0) {
                z4.c(j5);
            }
            BaseInterpolator baseInterpolator = this.f6914c;
            if (baseInterpolator != null && (view = (View) z4.f1434a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f6915d != null) {
                z4.d(this.f);
            }
            View view2 = (View) z4.f1434a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f6916e = true;
    }
}
