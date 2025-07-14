package J;

import android.view.Menu;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: J.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053j {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1467a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1468b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1469c = new HashMap();

    public C0053j(Runnable runnable) {
        this.f1467a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f1468b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.T) ((InterfaceC0055l) it.next())).f3741a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        Iterator it = this.f1468b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.T) ((InterfaceC0055l) it.next())).f3741a.s(menu);
        }
    }

    public final void c(InterfaceC0055l interfaceC0055l) {
        this.f1468b.remove(interfaceC0055l);
        C0052i c0052i = (C0052i) this.f1469c.remove(interfaceC0055l);
        if (c0052i != null) {
            c0052i.f1463a.b(c0052i.f1464b);
            c0052i.f1464b = null;
        }
        this.f1467a.run();
    }
}
