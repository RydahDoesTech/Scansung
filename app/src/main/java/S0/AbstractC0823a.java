package s0;

import A3.g;
import G3.k;
import J2.b;
import O2.f;
import P2.m;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0758b;
import p3.InterfaceC0776t;
import s3.C0843T;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0823a {
    public static boolean a(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        AbstractC0219i.e("superDescriptor", interfaceC0758b);
        AbstractC0219i.e("subDescriptor", interfaceC0758b2);
        if ((interfaceC0758b2 instanceof g) && (interfaceC0758b instanceof InterfaceC0776t)) {
            g gVar = (g) interfaceC0758b2;
            gVar.v0().size();
            InterfaceC0776t interfaceC0776t = (InterfaceC0776t) interfaceC0758b;
            interfaceC0776t.v0().size();
            List listV0 = gVar.a().v0();
            AbstractC0219i.d("subDescriptor.original.valueParameters", listV0);
            List listV02 = interfaceC0776t.a().v0();
            AbstractC0219i.d("superDescriptor.original.valueParameters", listV02);
            Iterator it = m.T0(listV0, listV02).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                C0843T c0843t = (C0843T) fVar.f2006d;
                C0843T c0843t2 = (C0843T) fVar.f2007e;
                AbstractC0219i.d("subParameter", c0843t);
                boolean z4 = c((InterfaceC0776t) interfaceC0758b2, c0843t) instanceof k;
                AbstractC0219i.d("superParameter", c0843t2);
                if (z4 != (c(interfaceC0776t, c0843t2) instanceof k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(InputMethodManager inputMethodManager) {
        Method methodZ = b.z(InputMethodManager.class, "isAccessoryKeyboardState", new Class[0]);
        if (methodZ != null) {
            Object objE = b.E(inputMethodManager, methodZ, new Object[0]);
            if (objE instanceof Integer) {
                return ((Integer) objE).intValue();
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (U3.f.g(r0).equals(U3.f.g(r4)) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static G3.l c(p3.InterfaceC0776t r8, s3.C0843T r9) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC0823a.c(p3.t, s3.T):G3.l");
    }

    public static final void d(View view, w0.f fVar) {
        AbstractC0219i.e("<this>", view);
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final Class e(ClassLoader classLoader, String str) {
        AbstractC0219i.e("fqName", str);
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
