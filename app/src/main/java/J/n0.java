package J;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f1476b = new g0().b().f1481a.a().f1481a.b().f1481a.c();

    /* renamed from: a, reason: collision with root package name */
    public final p0 f1477a;

    public n0(p0 p0Var) {
        this.f1477a = p0Var;
    }

    public p0 a() {
        return this.f1477a;
    }

    public p0 b() {
        return this.f1477a;
    }

    public p0 c() {
        return this.f1477a;
    }

    public void d(View view) {
    }

    public C0047d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k() == n0Var.k() && j() == n0Var.j() && Objects.equals(h(), n0Var.h()) && Objects.equals(g(), n0Var.g()) && Objects.equals(e(), n0Var.e());
    }

    public B.c f(int i5) {
        return B.c.f86e;
    }

    public B.c g() {
        return B.c.f86e;
    }

    public B.c h() {
        return B.c.f86e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), g(), e());
    }

    public p0 i(int i5, int i6, int i7, int i8) {
        return f1476b;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public void l(B.c[] cVarArr) {
    }

    public void m(p0 p0Var) {
    }
}
