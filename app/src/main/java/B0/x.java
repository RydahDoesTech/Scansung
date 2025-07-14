package B0;

import J.P;
import android.view.ViewGroup;
import com.wssyncmldm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.C0704b;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final C0002a f179a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f180b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f181c;

    static {
        C0002a c0002a = new C0002a();
        c0002a.f183B = false;
        c0002a.I(new j(2));
        c0002a.I(new C0008g());
        c0002a.I(new j(1));
        f179a = c0002a;
        f180b = new ThreadLocal();
        f181c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = f181c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = P.f1421a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (tVar == null) {
                tVar = f179a;
            }
            t tVarClone = tVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).v(viewGroup);
                }
            }
            if (tVarClone != null) {
                tVarClone.i(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (tVarClone != null) {
                w wVar = new w();
                wVar.f177d = tVarClone;
                wVar.f178e = viewGroup;
                viewGroup.addOnAttachStateChangeListener(wVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
            }
        }
    }

    public static C0704b b() {
        C0704b c0704b;
        ThreadLocal threadLocal = f180b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0704b = (C0704b) weakReference.get()) != null) {
            return c0704b;
        }
        C0704b c0704b2 = new C0704b();
        threadLocal.set(new WeakReference(c0704b2));
        return c0704b2;
    }
}
