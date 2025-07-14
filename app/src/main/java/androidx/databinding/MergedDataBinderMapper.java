package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f3621a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3622b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f3623c = new CopyOnWriteArrayList();

    public final void a(e eVar) {
        if (this.f3621a.add(eVar.getClass())) {
            this.f3622b.add(eVar);
            Iterator it = eVar.collectDependencies().iterator();
            while (it.hasNext()) {
                a((e) it.next());
            }
        }
    }

    public final boolean b() throws ClassNotFoundException {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3623c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (e.class.isAssignableFrom(cls)) {
                    a((e) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z4 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e5) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e5);
            } catch (InstantiationException e6) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e6);
            }
        }
        return z4;
    }

    @Override // androidx.databinding.e
    public final v getDataBinder(f fVar, View view, int i5) {
        Iterator it = this.f3622b.iterator();
        while (it.hasNext()) {
            v dataBinder = ((e) it.next()).getDataBinder((f) null, view, i5);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder((f) null, view, i5);
        }
        return null;
    }

    @Override // androidx.databinding.e
    public final int getLayoutId(String str) {
        Iterator it = this.f3622b.iterator();
        while (it.hasNext()) {
            int layoutId = ((e) it.next()).getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // androidx.databinding.e
    public final v getDataBinder(f fVar, View[] viewArr, int i5) {
        Iterator it = this.f3622b.iterator();
        while (it.hasNext()) {
            v dataBinder = ((e) it.next()).getDataBinder((f) null, viewArr, i5);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder((f) null, viewArr, i5);
        }
        return null;
    }
}
