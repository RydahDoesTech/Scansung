package com.google.android.gms.internal.p000firebaseauthapi;

import O2.d;

/* loaded from: classes.dex */
public abstract class l5 implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final m5 f5557d;

    /* renamed from: e, reason: collision with root package name */
    public m5 f5558e;
    public boolean f = false;

    public l5(m5 m5Var) {
        this.f5557d = m5Var;
        this.f5558e = (m5) m5Var.h(4);
    }

    public final void a(m5 m5Var) {
        if (this.f) {
            d();
            this.f = false;
        }
        m5 m5Var2 = this.f5558e;
        C0365x.f5676c.a(m5Var2.getClass()).i(m5Var2, m5Var);
    }

    public final m5 b() {
        m5 m5VarC = c();
        if (m5VarC.g()) {
            return m5VarC;
        }
        throw new d();
    }

    public final m5 c() {
        if (this.f) {
            return this.f5558e;
        }
        m5 m5Var = this.f5558e;
        C0365x.f5676c.a(m5Var.getClass()).b(m5Var);
        this.f = true;
        return this.f5558e;
    }

    public final Object clone() {
        l5 l5Var = (l5) this.f5557d.h(5);
        l5Var.a(c());
        return l5Var;
    }

    public final void d() {
        m5 m5Var = (m5) this.f5558e.h(4);
        C0365x.f5676c.a(m5Var.getClass()).i(m5Var, this.f5558e);
        this.f5558e = m5Var;
    }
}
