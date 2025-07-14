package com.google.android.material.behavior;

import J.P;
import K.c;
import S.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.C0198c;
import com.idm.agent.dm.IDMDmInterface;
import java.util.WeakHashMap;
import w.AbstractC0899a;
import y1.C0926a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0899a {

    /* renamed from: a, reason: collision with root package name */
    public d f5733a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5734b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5735c;

    /* renamed from: d, reason: collision with root package name */
    public int f5736d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f5737e = 0.0f;
    public float f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0926a f5738g = new C0926a(this);

    @Override // w.AbstractC0899a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f5734b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5734b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5734b = false;
        }
        if (!zO) {
            return false;
        }
        if (this.f5733a == null) {
            this.f5733a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f5738g);
        }
        return !this.f5735c && this.f5733a.p(motionEvent);
    }

    @Override // w.AbstractC0899a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) {
        WeakHashMap weakHashMap = P.f1421a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            P.f(IDMDmInterface.IDM_MAX_OBJ_SIZE, view);
            P.d(0, view);
            if (s(view)) {
                P.g(view, c.f1607j, new C0198c(this));
            }
        }
        return false;
    }

    @Override // w.AbstractC0899a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f5733a == null) {
            return false;
        }
        if (this.f5735c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5733a.j(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
