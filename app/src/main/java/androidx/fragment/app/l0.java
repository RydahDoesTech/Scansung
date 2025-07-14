package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f3887a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f3888b;

    static {
        s0 s0Var = null;
        try {
            s0Var = (s0) B0.o.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3888b = s0Var;
    }

    public static final void a(ArrayList arrayList, int i5) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i5);
        }
    }
}
