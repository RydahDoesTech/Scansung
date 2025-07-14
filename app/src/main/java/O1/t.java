package O1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f1996a;

    /* renamed from: b, reason: collision with root package name */
    public float f1997b;

    /* renamed from: c, reason: collision with root package name */
    public float f1998c;

    /* renamed from: d, reason: collision with root package name */
    public float f1999d;

    /* renamed from: e, reason: collision with root package name */
    public float f2000e;
    public final ArrayList f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2001g = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f5 = this.f1999d;
        if (f5 == f) {
            return;
        }
        float f6 = ((f - f5) + 360.0f) % 360.0f;
        if (f6 > 180.0f) {
            return;
        }
        float f7 = this.f1997b;
        float f8 = this.f1998c;
        p pVar = new p(f7, f8, f7, f8);
        pVar.f = this.f1999d;
        pVar.f1992g = f6;
        this.f2001g.add(new n(pVar));
        this.f1999d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((r) arrayList.get(i5)).a(matrix, path);
        }
    }

    public final void c(float f, float f5) {
        q qVar = new q();
        qVar.f1993b = f;
        qVar.f1994c = f5;
        this.f.add(qVar);
        o oVar = new o(qVar, this.f1997b, this.f1998c);
        float fA = oVar.a() + 270.0f;
        float fA2 = oVar.a() + 270.0f;
        a(fA);
        this.f2001g.add(oVar);
        this.f1999d = fA2;
        this.f1997b = f;
        this.f1998c = f5;
    }

    public final void d(float f, float f5, float f6) {
        this.f1996a = f;
        this.f1997b = 0.0f;
        this.f1998c = f;
        this.f1999d = f5;
        this.f2000e = (f5 + f6) % 360.0f;
        this.f.clear();
        this.f2001g.clear();
    }
}
