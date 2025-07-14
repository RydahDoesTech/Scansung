package B0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class y extends t {

    /* renamed from: C, reason: collision with root package name */
    public int f184C;

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f182A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f183B = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f185D = false;
    public int E = 0;

    @Override // B0.t
    public final void A(long j5) {
        ArrayList arrayList;
        this.f = j5;
        if (j5 < 0 || (arrayList = this.f182A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).A(j5);
        }
    }

    @Override // B0.t
    public final void B(g3.y yVar) {
        this.f173v = yVar;
        this.E |= 8;
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).B(yVar);
        }
    }

    @Override // B0.t
    public final void C(TimeInterpolator timeInterpolator) {
        this.E |= 1;
        ArrayList arrayList = this.f182A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((t) this.f182A.get(i5)).C(timeInterpolator);
            }
        }
        this.f159g = timeInterpolator;
    }

    @Override // B0.t
    public final void D(Y0.h hVar) {
        super.D(hVar);
        this.E |= 4;
        if (this.f182A != null) {
            for (int i5 = 0; i5 < this.f182A.size(); i5++) {
                ((t) this.f182A.get(i5)).D(hVar);
            }
        }
    }

    @Override // B0.t
    public final void E() {
        this.E |= 2;
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).E();
        }
    }

    @Override // B0.t
    public final void F(long j5) {
        this.f158e = j5;
    }

    @Override // B0.t
    public final String H(String str) {
        String strH = super.H(str);
        for (int i5 = 0; i5 < this.f182A.size(); i5++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH);
            sb.append("\n");
            sb.append(((t) this.f182A.get(i5)).H(str + "  "));
            strH = sb.toString();
        }
        return strH;
    }

    public final void I(t tVar) {
        this.f182A.add(tVar);
        tVar.f164l = this;
        long j5 = this.f;
        if (j5 >= 0) {
            tVar.A(j5);
        }
        if ((this.E & 1) != 0) {
            tVar.C(this.f159g);
        }
        if ((this.E & 2) != 0) {
            tVar.E();
        }
        if ((this.E & 4) != 0) {
            tVar.D(this.f174w);
        }
        if ((this.E & 8) != 0) {
            tVar.B(this.f173v);
        }
    }

    @Override // B0.t
    public final void b(View view) {
        for (int i5 = 0; i5 < this.f182A.size(); i5++) {
            ((t) this.f182A.get(i5)).b(view);
        }
        this.f161i.add(view);
    }

    @Override // B0.t
    public final void d() {
        super.d();
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).d();
        }
    }

    @Override // B0.t
    public final void e(z zVar) {
        if (t(zVar.f187b)) {
            Iterator it = this.f182A.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.t(zVar.f187b)) {
                    tVar.e(zVar);
                    zVar.f188c.add(tVar);
                }
            }
        }
    }

    @Override // B0.t
    public final void g(z zVar) {
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).g(zVar);
        }
    }

    @Override // B0.t
    public final void h(z zVar) {
        if (t(zVar.f187b)) {
            Iterator it = this.f182A.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.t(zVar.f187b)) {
                    tVar.h(zVar);
                    zVar.f188c.add(tVar);
                }
            }
        }
    }

    @Override // B0.t
    /* renamed from: k */
    public final t clone() {
        y yVar = (y) super.clone();
        yVar.f182A = new ArrayList();
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            t tVarClone = ((t) this.f182A.get(i5)).clone();
            yVar.f182A.add(tVarClone);
            tVarClone.f164l = yVar;
        }
        return yVar;
    }

    @Override // B0.t
    public final void m(ViewGroup viewGroup, com.google.firebase.messaging.q qVar, com.google.firebase.messaging.q qVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j5 = this.f158e;
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            t tVar = (t) this.f182A.get(i5);
            if (j5 > 0 && (this.f183B || i5 == 0)) {
                long j6 = tVar.f158e;
                if (j6 > 0) {
                    tVar.F(j6 + j5);
                } else {
                    tVar.F(j5);
                }
            }
            tVar.m(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // B0.t
    public final void v(ViewGroup viewGroup) {
        super.v(viewGroup);
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).v(viewGroup);
        }
    }

    @Override // B0.t
    public final void x(View view) {
        for (int i5 = 0; i5 < this.f182A.size(); i5++) {
            ((t) this.f182A.get(i5)).x(view);
        }
        this.f161i.remove(view);
    }

    @Override // B0.t
    public final void y(View view) {
        super.y(view);
        int size = this.f182A.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((t) this.f182A.get(i5)).y(view);
        }
    }

    @Override // B0.t
    public final void z() {
        if (this.f182A.isEmpty()) {
            G();
            n();
            return;
        }
        h hVar = new h();
        hVar.f130b = this;
        Iterator it = this.f182A.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(hVar);
        }
        this.f184C = this.f182A.size();
        if (this.f183B) {
            Iterator it2 = this.f182A.iterator();
            while (it2.hasNext()) {
                ((t) it2.next()).z();
            }
            return;
        }
        for (int i5 = 1; i5 < this.f182A.size(); i5++) {
            ((t) this.f182A.get(i5 - 1)).a(new h(1, (t) this.f182A.get(i5)));
        }
        t tVar = (t) this.f182A.get(0);
        if (tVar != null) {
            tVar.z();
        }
    }
}
