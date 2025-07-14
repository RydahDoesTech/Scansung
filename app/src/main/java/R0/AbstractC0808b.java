package r0;

import N3.f;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.widget.TextView;
import b3.AbstractC0219i;
import e.AbstractActivityC0411n;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import k.X0;
import m3.AbstractC0695h;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0776t;
import s3.C0837M;
import v3.C0894a;
import y3.AbstractC0935d;
import y3.C0936e;
import y3.C0937f;
import y3.F;
import y3.g;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0808b {

    /* renamed from: a, reason: collision with root package name */
    public static C0894a f8561a;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String a(InterfaceC0776t interfaceC0776t) {
        f fVar;
        InterfaceC0759c interfaceC0759cB = AbstractC0695h.y(interfaceC0776t) ? b(interfaceC0776t) : null;
        if (interfaceC0759cB == null) {
            return null;
        }
        InterfaceC0759c interfaceC0759cK = U3.f.k(interfaceC0759cB);
        if (interfaceC0759cK instanceof InterfaceC0750L) {
            AbstractC0695h.y(interfaceC0759cK);
            InterfaceC0759c interfaceC0759cB2 = U3.f.b(U3.f.k(interfaceC0759cK), C0936e.f9400g);
            if (interfaceC0759cB2 == null || (fVar = (f) g.f9407a.get(U3.f.g(interfaceC0759cB2))) == null) {
                return null;
            }
            return fVar.b();
        }
        if (!(interfaceC0759cK instanceof C0837M)) {
            return null;
        }
        int i5 = AbstractC0935d.f9398l;
        LinkedHashMap linkedHashMap = F.f9380i;
        String strK = V1.a.k((C0837M) interfaceC0759cK);
        f fVar2 = strK == null ? null : (f) linkedHashMap.get(strK);
        if (fVar2 != null) {
            return fVar2.b();
        }
        return null;
    }

    public static final InterfaceC0759c b(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("<this>", interfaceC0759c);
        if (!F.f9381j.contains(interfaceC0759c.getName()) && !g.f9410d.contains(U3.f.k(interfaceC0759c).getName())) {
            return null;
        }
        if (interfaceC0759c instanceof InterfaceC0750L ? true : interfaceC0759c instanceof InterfaceC0749K) {
            return U3.f.b(interfaceC0759c, C0936e.f9402i);
        }
        if (interfaceC0759c instanceof C0837M) {
            return U3.f.b(interfaceC0759c, C0936e.f9403j);
        }
        return null;
    }

    public static final InterfaceC0759c c(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("<this>", interfaceC0759c);
        InterfaceC0759c interfaceC0759cB = b(interfaceC0759c);
        if (interfaceC0759cB != null) {
            return interfaceC0759cB;
        }
        int i5 = C0937f.f9406l;
        f name = interfaceC0759c.getName();
        AbstractC0219i.d("name", name);
        if (C0937f.b(name)) {
            return U3.f.b(interfaceC0759c, C0936e.f9404k);
        }
        return null;
    }

    public static Intent d(AbstractActivityC0411n abstractActivityC0411n) {
        Intent parentActivityIntent = abstractActivityC0411n.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strF = f(abstractActivityC0411n, abstractActivityC0411n.getComponentName());
            if (strF == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0411n, strF);
            try {
                return f(abstractActivityC0411n, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strF + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static Intent e(AbstractActivityC0411n abstractActivityC0411n, ComponentName componentName) {
        String strF = f(abstractActivityC0411n, componentName);
        if (strF == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strF);
        return f(abstractActivityC0411n, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String f(Activity activity, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0144, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        return !m3.AbstractC0695h.y(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g(p3.InterfaceC0761e r12, p3.InterfaceC0759c r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.AbstractC0808b.g(p3.e, p3.c):boolean");
    }

    public static boolean h(View view) {
        Method methodZ = J2.b.z(View.class, "semIsHighContrastTextEnabled", new Class[0]);
        if (methodZ != null) {
            Object objE = J2.b.E(view, methodZ, new Object[0]);
            if (objE instanceof Boolean) {
                return ((Boolean) objE).booleanValue();
            }
        }
        return false;
    }

    public static boolean i(Rect rect, View view) throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(View.class, "isVisibleToUser", Rect.class);
        if (methodR == null) {
            return false;
        }
        Object objE = J2.b.E(view, methodR, rect);
        if (objE instanceof Boolean) {
            return ((Boolean) objE).booleanValue();
        }
        return false;
    }

    public static Object j(X0 x02) throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(View.class, "hidden_semGetHoverPopup", Boolean.TYPE);
        if (methodR != null) {
            return J2.b.E(x02, methodR, Boolean.TRUE);
        }
        return null;
    }

    public static void k(TextView textView, boolean z4) throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(TextView.class, "hidden_semSetButtonShapeEnabled", Boolean.TYPE);
        if (methodR != null) {
            J2.b.E(textView, methodR, Boolean.valueOf(z4));
        }
    }

    public static void l(TextView textView, boolean z4, int i5) throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(TextView.class, "hidden_semSetButtonShapeEnabled", Boolean.TYPE, Integer.TYPE);
        if (methodR != null) {
            J2.b.E(textView, methodR, Boolean.valueOf(z4), Integer.valueOf(i5));
        }
    }

    public static void m(int i5, View view) {
        Method methodR = J2.b.r(View.class, "hidden_semSetHoverPopupType", Integer.TYPE);
        if (methodR != null) {
            J2.b.E(view, methodR, Integer.valueOf(i5));
        }
    }

    public static void n(View view, int i5, PointerIcon pointerIcon) {
        Method methodR = J2.b.r(View.class, "hidden_semSetPointerIcon", Integer.TYPE, PointerIcon.class);
        if (methodR != null) {
            J2.b.E(view, methodR, Integer.valueOf(i5), pointerIcon);
        }
    }

    public static void o(View view, float f) {
        Method methodR = J2.b.r(View.class, "setFrameContentVelocity", Float.TYPE);
        if (methodR != null) {
            J2.b.E(view, methodR, Float.valueOf(f));
        }
    }
}
