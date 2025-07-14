package androidx.fragment.app;

import android.view.View;
import b3.AbstractC0219i;
import java.util.LinkedHashSet;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0121i {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f3847a;

    /* renamed from: b, reason: collision with root package name */
    public final F.f f3848b;

    public AbstractC0121i(v0 v0Var, F.f fVar) {
        this.f3847a = v0Var;
        this.f3848b = fVar;
    }

    public final void a() {
        v0 v0Var = this.f3847a;
        F.f fVar = this.f3848b;
        LinkedHashSet linkedHashSet = v0Var.f3931e;
        if (linkedHashSet.remove(fVar) && linkedHashSet.isEmpty()) {
            v0Var.b();
        }
    }

    public final boolean b() {
        v0 v0Var = this.f3847a;
        View view = v0Var.f3929c.mView;
        AbstractC0219i.d("operation.fragment.mView", view);
        int iE = J2.b.e(view);
        int i5 = v0Var.f3927a;
        return iE == i5 || !(iE == 2 || i5 == 2);
    }
}
