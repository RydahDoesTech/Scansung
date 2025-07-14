package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.C0822d;

/* loaded from: classes.dex */
public final class n {
    public static int f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f8945a;

    /* renamed from: b, reason: collision with root package name */
    public int f8946b;

    /* renamed from: c, reason: collision with root package name */
    public int f8947c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8948d;

    /* renamed from: e, reason: collision with root package name */
    public int f8949e;

    public final void a(ArrayList arrayList) {
        int size = this.f8945a.size();
        if (this.f8949e != -1 && size > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                n nVar = (n) arrayList.get(i5);
                if (this.f8949e == nVar.f8946b) {
                    c(this.f8947c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(r.c cVar, int i5) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f8945a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((C0822d) arrayList.get(0)).f8621N;
        cVar.t();
        eVar.b(cVar, false);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((C0822d) arrayList.get(i6)).b(cVar, false);
        }
        if (i5 == 0 && eVar.f8671s0 > 0) {
            s.j.a(eVar, cVar, arrayList, 0);
        }
        if (i5 == 1 && eVar.t0 > 0) {
            s.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f8948d = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C0822d c0822d = (C0822d) arrayList.get(i7);
            Y0.h hVar = new Y0.h(17);
            new WeakReference(c0822d);
            r.c.n(c0822d.f8611C);
            r.c.n(c0822d.f8612D);
            r.c.n(c0822d.E);
            r.c.n(c0822d.f8613F);
            r.c.n(c0822d.f8614G);
            this.f8948d.add(hVar);
        }
        if (i5 == 0) {
            iN = r.c.n(eVar.f8611C);
            iN2 = r.c.n(eVar.E);
            cVar.t();
        } else {
            iN = r.c.n(eVar.f8612D);
            iN2 = r.c.n(eVar.f8613F);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i5, n nVar) {
        Iterator it = this.f8945a.iterator();
        while (it.hasNext()) {
            C0822d c0822d = (C0822d) it.next();
            ArrayList arrayList = nVar.f8945a;
            if (!arrayList.contains(c0822d)) {
                arrayList.add(c0822d);
            }
            int i6 = nVar.f8946b;
            if (i5 == 0) {
                c0822d.f8647h0 = i6;
            } else {
                c0822d.f8649i0 = i6;
            }
        }
        this.f8949e = nVar.f8946b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i5 = this.f8947c;
        sb.append(i5 == 0 ? "Horizontal" : i5 == 1 ? "Vertical" : i5 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f8946b);
        sb.append("] <");
        String string = sb.toString();
        Iterator it = this.f8945a.iterator();
        while (it.hasNext()) {
            string = string + " " + ((C0822d) it.next()).f8637b0;
        }
        return g4.f.c(string, " >");
    }
}
