package B0;

import J.H;
import J.P;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AbstractC0706d;
import o.C0704b;
import o.C0707e;

/* loaded from: classes.dex */
public abstract class t implements Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f154x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final Y0.h f155y = new Y0.h(1);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f156z = new ThreadLocal();
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f166o;

    /* renamed from: v, reason: collision with root package name */
    public g3.y f173v;

    /* renamed from: d, reason: collision with root package name */
    public final String f157d = getClass().getName();

    /* renamed from: e, reason: collision with root package name */
    public long f158e = -1;
    public long f = -1;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f159g = null;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f160h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f161i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public com.google.firebase.messaging.q f162j = new com.google.firebase.messaging.q(1);

    /* renamed from: k, reason: collision with root package name */
    public com.google.firebase.messaging.q f163k = new com.google.firebase.messaging.q(1);

    /* renamed from: l, reason: collision with root package name */
    public y f164l = null;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f165m = f154x;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f167p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public int f168q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f169r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f170s = false;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f171t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f172u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public Y0.h f174w = f155y;

    public static void c(com.google.firebase.messaging.q qVar, View view, z zVar) {
        ((C0704b) qVar.f6168e).put(view, zVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) qVar.f;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = P.f1421a;
        String strK = H.k(view);
        if (strK != null) {
            C0704b c0704b = (C0704b) qVar.f6170h;
            if (c0704b.containsKey(strK)) {
                c0704b.put(strK, null);
            } else {
                c0704b.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0707e c0707e = (C0707e) qVar.f6169g;
                if (c0707e.f8214d) {
                    c0707e.b();
                }
                if (AbstractC0706d.b(c0707e.f8215e, c0707e.f8216g, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0707e.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0707e.c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0707e.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C0704b p() {
        ThreadLocal threadLocal = f156z;
        C0704b c0704b = (C0704b) threadLocal.get();
        if (c0704b != null) {
            return c0704b;
        }
        C0704b c0704b2 = new C0704b();
        threadLocal.set(c0704b2);
        return c0704b2;
    }

    public static boolean u(z zVar, z zVar2, String str) {
        Object obj = zVar.f186a.get(str);
        Object obj2 = zVar2.f186a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j5) {
        this.f = j5;
    }

    public void B(g3.y yVar) {
        this.f173v = yVar;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f159g = timeInterpolator;
    }

    public void D(Y0.h hVar) {
        if (hVar == null) {
            this.f174w = f155y;
        } else {
            this.f174w = hVar;
        }
    }

    public void E() {
    }

    public void F(long j5) {
        this.f158e = j5;
    }

    public final void G() {
        if (this.f168q == 0) {
            ArrayList arrayList = this.f171t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f171t.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((s) arrayList2.get(i5)).b(this);
                }
            }
            this.f170s = false;
        }
        this.f168q++;
    }

    public String H(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f != -1) {
            str2 = str2 + "dur(" + this.f + ") ";
        }
        if (this.f158e != -1) {
            str2 = str2 + "dly(" + this.f158e + ") ";
        }
        if (this.f159g != null) {
            str2 = str2 + "interp(" + this.f159g + ") ";
        }
        ArrayList arrayList = this.f160h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f161i;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String strC = g4.f.c(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (i5 > 0) {
                    strC = g4.f.c(strC, ", ");
                }
                strC = strC + arrayList.get(i5);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                if (i6 > 0) {
                    strC = g4.f.c(strC, ", ");
                }
                strC = strC + arrayList2.get(i6);
            }
        }
        return g4.f.c(strC, ")");
    }

    public void a(s sVar) {
        if (this.f171t == null) {
            this.f171t = new ArrayList();
        }
        this.f171t.add(sVar);
    }

    public void b(View view) {
        this.f161i.add(view);
    }

    public void d() {
        ArrayList arrayList = this.f167p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f171t;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f171t.clone();
        int size2 = arrayList3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((s) arrayList3.get(i5)).a();
        }
    }

    public abstract void e(z zVar);

    public final void f(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            z zVar = new z(view);
            if (z4) {
                h(zVar);
            } else {
                e(zVar);
            }
            zVar.f188c.add(this);
            g(zVar);
            if (z4) {
                c(this.f162j, view, zVar);
            } else {
                c(this.f163k, view, zVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                f(viewGroup.getChildAt(i5), z4);
            }
        }
    }

    public void g(z zVar) {
    }

    public abstract void h(z zVar);

    public final void i(ViewGroup viewGroup, boolean z4) {
        j(z4);
        ArrayList arrayList = this.f160h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f161i;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z4);
            return;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i5)).intValue());
            if (viewFindViewById != null) {
                z zVar = new z(viewFindViewById);
                if (z4) {
                    h(zVar);
                } else {
                    e(zVar);
                }
                zVar.f188c.add(this);
                g(zVar);
                if (z4) {
                    c(this.f162j, viewFindViewById, zVar);
                } else {
                    c(this.f163k, viewFindViewById, zVar);
                }
            }
        }
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            View view = (View) arrayList2.get(i6);
            z zVar2 = new z(view);
            if (z4) {
                h(zVar2);
            } else {
                e(zVar2);
            }
            zVar2.f188c.add(this);
            g(zVar2);
            if (z4) {
                c(this.f162j, view, zVar2);
            } else {
                c(this.f163k, view, zVar2);
            }
        }
    }

    public final void j(boolean z4) {
        if (z4) {
            ((C0704b) this.f162j.f6168e).clear();
            ((SparseArray) this.f162j.f).clear();
            ((C0707e) this.f162j.f6169g).a();
        } else {
            ((C0704b) this.f163k.f6168e).clear();
            ((SparseArray) this.f163k.f).clear();
            ((C0707e) this.f163k.f6169g).a();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public t clone() {
        try {
            t tVar = (t) super.clone();
            tVar.f172u = new ArrayList();
            tVar.f162j = new com.google.firebase.messaging.q(1);
            tVar.f163k = new com.google.firebase.messaging.q(1);
            tVar.n = null;
            tVar.f166o = null;
            return tVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, com.google.firebase.messaging.q qVar, com.google.firebase.messaging.q qVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorL;
        int i5;
        View view;
        z zVar;
        Animator animator;
        C0704b c0704bP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            z zVar2 = (z) arrayList.get(i6);
            z zVar3 = (z) arrayList2.get(i6);
            z zVar4 = null;
            if (zVar2 != null && !zVar2.f188c.contains(this)) {
                zVar2 = null;
            }
            if (zVar3 != null && !zVar3.f188c.contains(this)) {
                zVar3 = null;
            }
            if (!(zVar2 == null && zVar3 == null) && ((zVar2 == null || zVar3 == null || s(zVar2, zVar3)) && (animatorL = l(viewGroup, zVar2, zVar3)) != null)) {
                String str = this.f157d;
                if (zVar3 != null) {
                    String[] strArrQ = q();
                    view = zVar3.f187b;
                    if (strArrQ != null && strArrQ.length > 0) {
                        zVar = new z(view);
                        z zVar5 = (z) ((C0704b) qVar2.f6168e).getOrDefault(view, null);
                        i5 = size;
                        if (zVar5 != null) {
                            int i7 = 0;
                            while (i7 < strArrQ.length) {
                                HashMap map = zVar.f186a;
                                String str2 = strArrQ[i7];
                                map.put(str2, zVar5.f186a.get(str2));
                                i7++;
                                strArrQ = strArrQ;
                            }
                        }
                        int i8 = c0704bP.f;
                        for (int i9 = 0; i9 < i8; i9++) {
                            animator = null;
                            r rVar = (r) c0704bP.getOrDefault((Animator) c0704bP.h(i9), null);
                            if (rVar.f151c != null && rVar.f149a == view && rVar.f150b.equals(str) && rVar.f151c.equals(zVar)) {
                                break;
                            }
                        }
                    } else {
                        i5 = size;
                        zVar = null;
                    }
                    animator = animatorL;
                    animatorL = animator;
                    zVar4 = zVar;
                } else {
                    i5 = size;
                    view = zVar2.f187b;
                }
                if (animatorL != null) {
                    C0004c c0004c = A.f98a;
                    G g5 = new G(viewGroup);
                    r rVar2 = new r();
                    rVar2.f149a = view;
                    rVar2.f150b = str;
                    rVar2.f151c = zVar4;
                    rVar2.f152d = g5;
                    rVar2.f153e = this;
                    c0704bP.put(animatorL, rVar2);
                    this.f172u.add(animatorL);
                }
            } else {
                i5 = size;
            }
            i6++;
            size = i5;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                Animator animator2 = (Animator) this.f172u.get(sparseIntArray.keyAt(i10));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i10) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i5 = this.f168q - 1;
        this.f168q = i5;
        if (i5 == 0) {
            ArrayList arrayList = this.f171t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f171t.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((s) arrayList2.get(i6)).d(this);
                }
            }
            for (int i7 = 0; i7 < ((C0707e) this.f162j.f6169g).e(); i7++) {
                View view = (View) ((C0707e) this.f162j.f6169g).f(i7);
                if (view != null) {
                    WeakHashMap weakHashMap = P.f1421a;
                    view.setHasTransientState(false);
                }
            }
            for (int i8 = 0; i8 < ((C0707e) this.f163k.f6169g).e(); i8++) {
                View view2 = (View) ((C0707e) this.f163k.f6169g).f(i8);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = P.f1421a;
                    view2.setHasTransientState(false);
                }
            }
            this.f170s = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.f166o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (B0.z) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final B0.z o(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            B0.y r0 = r5.f164l
            if (r0 == 0) goto L9
            B0.z r5 = r0.o(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.n
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f166o
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            B0.z r4 = (B0.z) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f187b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.f166o
            goto L36
        L34:
            java.util.ArrayList r5 = r5.n
        L36:
            java.lang.Object r5 = r5.get(r3)
            r1 = r5
            B0.z r1 = (B0.z) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.t.o(android.view.View, boolean):B0.z");
    }

    public String[] q() {
        return null;
    }

    public final z r(View view, boolean z4) {
        y yVar = this.f164l;
        if (yVar != null) {
            return yVar.r(view, z4);
        }
        return (z) ((C0704b) (z4 ? this.f162j : this.f163k).f6168e).getOrDefault(view, null);
    }

    public boolean s(z zVar, z zVar2) {
        if (zVar == null || zVar2 == null) {
            return false;
        }
        String[] strArrQ = q();
        if (strArrQ == null) {
            Iterator it = zVar.f186a.keySet().iterator();
            while (it.hasNext()) {
                if (u(zVar, zVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrQ) {
            if (!u(zVar, zVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f160h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f161i;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public void v(ViewGroup viewGroup) {
        if (this.f170s) {
            return;
        }
        ArrayList arrayList = this.f167p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f171t;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f171t.clone();
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((s) arrayList3.get(i5)).c();
            }
        }
        this.f169r = true;
    }

    public void w(s sVar) {
        ArrayList arrayList = this.f171t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(sVar);
        if (this.f171t.size() == 0) {
            this.f171t = null;
        }
    }

    public void x(View view) {
        this.f161i.remove(view);
    }

    public void y(View view) {
        if (this.f169r) {
            if (!this.f170s) {
                ArrayList arrayList = this.f167p;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f171t;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f171t.clone();
                    int size2 = arrayList3.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((s) arrayList3.get(i5)).e();
                    }
                }
            }
            this.f169r = false;
        }
    }

    public void z() {
        G();
        C0704b c0704bP = p();
        Iterator it = this.f172u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c0704bP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new p(this, c0704bP));
                    long j5 = this.f;
                    if (j5 >= 0) {
                        animator.setDuration(j5);
                    }
                    long j6 = this.f158e;
                    if (j6 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j6);
                    }
                    TimeInterpolator timeInterpolator = this.f159g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new q(0, this));
                    animator.start();
                }
            }
        }
        this.f172u.clear();
        n();
    }
}
