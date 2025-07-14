package b0;

import A3.f;
import J.InterfaceC0060q;
import J.P;
import J.n0;
import J.p0;
import K.q;
import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import b1.InterfaceC0206b;
import b1.k;
import b3.AbstractC0219i;
import c4.s;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d4.n;
import e4.AbstractC0438v;
import h0.InterfaceC0471b;
import j3.D;
import j3.F;
import j3.H;
import j3.J;
import j3.L;
import j3.d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import k.InterfaceC0611c1;
import o3.C0730m;
import p3.C0770n;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0768l;
import p3.InterfaceC0775s;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;
import s3.AbstractC0825A;
import s3.AbstractC0828D;
import s3.AbstractC0854j;
import s3.C0826B;
import s3.C0834J;
import s3.C0835K;
import s3.C0836L;
import s3.C0843T;
import s3.C0855k;
import s3.C0867w;
import s3.y;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0198c implements a0, InterfaceC0206b, n, InterfaceC0775s, InterfaceC0471b, InterfaceC0768l, n4.a, t1.b, t1.d, t1.e, InterfaceC0060q, InterfaceC0611c1, q {

    /* renamed from: d, reason: collision with root package name */
    public Object f5001d;

    public /* synthetic */ C0198c(Object obj) {
        this.f5001d = obj;
    }

    @Override // p3.InterfaceC0768l
    public Object A(C0855k c0855k, Object obj) {
        return H(c0855k, obj);
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s B() {
        return this;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s C() {
        return this;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s D() {
        return this;
    }

    @Override // d4.n
    public void E() {
        ((Lock) this.f5001d).lock();
    }

    @Override // t1.b
    public void F() {
        ((CountDownLatch) this.f5001d).countDown();
    }

    @Override // p3.InterfaceC0768l
    public Object G(y yVar, Object obj) {
        return null;
    }

    @Override // p3.InterfaceC0768l
    public Object H(InterfaceC0776t interfaceC0776t, Object obj) {
        return new F((D) this.f5001d, interfaceC0776t);
    }

    @Override // t1.d
    public void I(Exception exc) {
        ((CountDownLatch) this.f5001d).countDown();
    }

    @Override // p3.InterfaceC0768l
    public Object J(AbstractC0825A abstractC0825A, Object obj) {
        return null;
    }

    @Override // p3.InterfaceC0768l
    public Object K(s sVar, Object obj) {
        return null;
    }

    @Override // t1.e
    public void L(Object obj) {
        ((CountDownLatch) this.f5001d).countDown();
    }

    @Override // p3.InterfaceC0768l
    public Object M(C0835K c0835k, Object obj) {
        return H(c0835k, obj);
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s N() {
        return this;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s O() {
        return this;
    }

    public void P(Object obj) {
        ((ArrayList) this.f5001d).add(obj);
    }

    public void Q(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z4 = obj instanceof Object[];
        ArrayList arrayList = (ArrayList) this.f5001d;
        if (z4) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    @Override // J.InterfaceC0060q
    public p0 Z(View view, p0 p0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f5001d;
        if (!Objects.equals(coordinatorLayout.f3560r, p0Var)) {
            coordinatorLayout.f3560r = p0Var;
            boolean z4 = p0Var.d() > 0;
            coordinatorLayout.f3561s = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            n0 n0Var = p0Var.f1481a;
            if (!n0Var.j()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = coordinatorLayout.getChildAt(i5);
                    WeakHashMap weakHashMap = P.f1421a;
                    if (childAt.getFitsSystemWindows() && ((w.d) childAt.getLayoutParams()).f9270a != null && n0Var.j()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return p0Var;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s a(int i5) {
        f.q(i5, "kind");
        return this;
    }

    @Override // p3.InterfaceC0768l
    public Object b(C0826B c0826b, Object obj) {
        return null;
    }

    @Override // b1.InterfaceC0206b
    public void d(Y0.a aVar) {
        boolean z4 = aVar.f2807e == 0;
        k kVar = (k) this.f5001d;
        if (z4) {
            kVar.g(null, kVar.f5050u);
            return;
        }
        C0198c c0198c = kVar.n;
        if (c0198c != null) {
            ((Z0.e) c0198c.f5001d).f(aVar);
        }
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s e() {
        return this;
    }

    @Override // p3.InterfaceC0768l
    public Object f(C0836L c0836l, Object obj) {
        return H(c0836l, obj);
    }

    @Override // p3.InterfaceC0768l
    public Object g(AbstractC0854j abstractC0854j, Object obj) {
        return null;
    }

    @Override // K.q
    public boolean h(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f5001d;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap weakHashMap = P.f1421a;
        boolean z4 = view.getLayoutDirection() == 1;
        int i5 = swipeDismissBehavior.f5736d;
        view.offsetLeftAndRight((!(i5 == 0 && z4) && (i5 != 1 || z4)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0776t i() {
        return (g4.b) this.f5001d;
    }

    @Override // h0.InterfaceC0471b
    public void j(int i5, Serializable serializable) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f5001d).setResultCode(i5);
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s k() {
        return this;
    }

    @Override // p3.InterfaceC0768l
    public Object l(C0843T c0843t, Object obj) {
        return null;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s m(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("type", abstractC0438v);
        return this;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s n(C0770n c0770n) {
        AbstractC0219i.e("visibility", c0770n);
        return this;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s o(List list) {
        return this;
    }

    @Override // n4.a
    public Iterable p(Object obj) {
        C0730m c0730m = (C0730m) this.f5001d;
        AbstractC0219i.e("this$0", c0730m);
        Collection collectionJ = ((InterfaceC0761e) obj).I().j();
        AbstractC0219i.d("it.typeConstructor.supertypes", collectionJ);
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionJ.iterator();
        while (it.hasNext()) {
            InterfaceC0763g interfaceC0763gI = ((AbstractC0438v) it.next()).I0().i();
            InterfaceC0763g interfaceC0763gA = interfaceC0763gI != null ? interfaceC0763gI.a() : null;
            InterfaceC0761e interfaceC0761e = interfaceC0763gA instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gA : null;
            C3.k kVarF = interfaceC0761e != null ? c0730m.f(interfaceC0761e) : null;
            if (kVarF != null) {
                arrayList.add(kVarF);
            }
        }
        return arrayList;
    }

    @Override // p3.InterfaceC0768l
    public Object q(AbstractC0828D abstractC0828D, Object obj) {
        return null;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s r(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("owner", interfaceC0761e);
        return this;
    }

    @Override // p3.InterfaceC0768l
    public Object s(C0867w c0867w, Object obj) {
        return null;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s t(C0867w c0867w) {
        return this;
    }

    @Override // androidx.lifecycle.a0
    public X u(Class cls, C0199d c0199d) {
        X x4 = null;
        for (C0200e c0200e : (C0200e[]) this.f5001d) {
            if (c0200e.f5002a.equals(cls)) {
                x4 = (X) androidx.lifecycle.P.f3982d.d(c0199d);
            }
        }
        if (x4 != null) {
            return x4;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s v(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        return this;
    }

    @Override // p3.InterfaceC0768l
    public Object w(C0834J c0834j, Object obj) {
        AbstractC0219i.e("descriptor", c0834j);
        int i5 = (c0834j.f8784w != null ? 1 : 0) + (c0834j.f8785x != null ? 1 : 0);
        boolean z4 = c0834j.f8771i;
        D d5 = (D) this.f5001d;
        if (z4) {
            if (i5 == 0) {
                return new H(d5, c0834j);
            }
            if (i5 == 1) {
                return new J(d5, c0834j);
            }
            if (i5 == 2) {
                return new L(d5, c0834j);
            }
        } else {
            if (i5 == 0) {
                return new j3.X(d5, c0834j);
            }
            if (i5 == 1) {
                return new j3.a0(d5, c0834j);
            }
            if (i5 == 2) {
                return new d0(d5, c0834j);
            }
        }
        throw new O2.e("Unsupported property: " + c0834j, 2);
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s x(int i5) {
        f.q(i5, "modality");
        return this;
    }

    @Override // p3.InterfaceC0775s
    public InterfaceC0775s y(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("additionalAnnotations", interfaceC0798h);
        return this;
    }

    @Override // d4.n
    public void z() {
        ((Lock) this.f5001d).unlock();
    }

    public C0198c() {
        this.f5001d = new CountDownLatch(1);
    }

    public C0198c(int i5) {
        this.f5001d = new ArrayList(i5);
    }

    public C0198c(D d5) {
        AbstractC0219i.e("container", d5);
        this.f5001d = d5;
    }
}
