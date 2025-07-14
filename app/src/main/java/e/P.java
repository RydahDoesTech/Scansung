package e;

import J.Z;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import b0.C0198c;
import c.AbstractC0220a;
import com.google.firebase.messaging.C0388e;
import i.AbstractC0476b;
import i.InterfaceC0475a;
import j.C0494k;
import j.MenuC0492i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.D1;
import k.I1;
import k.InterfaceC0612d;
import k.InterfaceC0616e0;

/* loaded from: classes.dex */
public final class P extends AbstractC0398a implements InterfaceC0612d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f6517y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f6518z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f6519a;

    /* renamed from: b, reason: collision with root package name */
    public Context f6520b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f6521c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f6522d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0616e0 f6523e;
    public ActionBarContextView f;

    /* renamed from: g, reason: collision with root package name */
    public final View f6524g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6525h;

    /* renamed from: i, reason: collision with root package name */
    public O f6526i;

    /* renamed from: j, reason: collision with root package name */
    public O f6527j;

    /* renamed from: k, reason: collision with root package name */
    public C0388e f6528k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6529l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f6530m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6531o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6532p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6533q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6534r;

    /* renamed from: s, reason: collision with root package name */
    public i.l f6535s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6536t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6537u;

    /* renamed from: v, reason: collision with root package name */
    public final N f6538v;

    /* renamed from: w, reason: collision with root package name */
    public final N f6539w;

    /* renamed from: x, reason: collision with root package name */
    public final C0198c f6540x;

    public P(Activity activity, boolean z4) {
        new ArrayList();
        this.f6530m = new ArrayList();
        this.n = 0;
        this.f6531o = true;
        this.f6534r = true;
        this.f6538v = new N(this, 0);
        this.f6539w = new N(this, 1);
        this.f6540x = new C0198c(this);
        View decorView = activity.getWindow().getDecorView();
        r(decorView);
        if (z4) {
            return;
        }
        this.f6524g = decorView.findViewById(R.id.content);
    }

    @Override // e.AbstractC0398a
    public final boolean b() {
        D1 d1;
        InterfaceC0616e0 interfaceC0616e0 = this.f6523e;
        if (interfaceC0616e0 == null || (d1 = ((I1) interfaceC0616e0).f7507a.f3486Q) == null || d1.f7486e == null) {
            return false;
        }
        D1 d12 = ((I1) interfaceC0616e0).f7507a.f3486Q;
        C0494k c0494k = d12 == null ? null : d12.f7486e;
        if (c0494k == null) {
            return true;
        }
        c0494k.collapseActionView();
        return true;
    }

    @Override // e.AbstractC0398a
    public final void c(boolean z4) {
        if (z4 == this.f6529l) {
            return;
        }
        this.f6529l = z4;
        ArrayList arrayList = this.f6530m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // e.AbstractC0398a
    public final int d() {
        return ((I1) this.f6523e).f7508b;
    }

    @Override // e.AbstractC0398a
    public final Context e() {
        if (this.f6520b == null) {
            TypedValue typedValue = new TypedValue();
            this.f6519a.getTheme().resolveAttribute(com.wssyncmldm.R.attr.actionBarWidgetTheme, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                this.f6520b = new ContextThemeWrapper(this.f6519a, i5);
            } else {
                this.f6520b = this.f6519a;
            }
        }
        return this.f6520b;
    }

    @Override // e.AbstractC0398a
    public final void g() {
        s();
    }

    @Override // e.AbstractC0398a
    public final boolean i(int i5, KeyEvent keyEvent) {
        MenuC0492i menuC0492i;
        O o5 = this.f6526i;
        if (o5 == null || (menuC0492i = o5.f6513g) == null) {
            return false;
        }
        menuC0492i.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC0492i.performShortcut(i5, keyEvent, 0);
    }

    @Override // e.AbstractC0398a
    public final void l(boolean z4) {
        if (this.f6525h) {
            return;
        }
        m(z4);
    }

    @Override // e.AbstractC0398a
    public final void m(boolean z4) {
        int i5 = z4 ? 4 : 0;
        I1 i12 = (I1) this.f6523e;
        int i6 = i12.f7508b;
        this.f6525h = true;
        i12.a((i5 & 4) | (i6 & (-5)));
    }

    @Override // e.AbstractC0398a
    public final void n(boolean z4) {
        i.l lVar;
        this.f6536t = z4;
        if (z4 || (lVar = this.f6535s) == null) {
            return;
        }
        lVar.a();
    }

    @Override // e.AbstractC0398a
    public final void o(CharSequence charSequence) {
        I1 i12 = (I1) this.f6523e;
        if (i12.f7512g) {
            return;
        }
        i12.f7513h = charSequence;
        if ((i12.f7508b & 8) != 0) {
            Toolbar toolbar = i12.f7507a;
            toolbar.setTitle(charSequence);
            if (i12.f7512g) {
                J.P.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // e.AbstractC0398a
    public final AbstractC0476b p(C0388e c0388e) {
        O o5 = this.f6526i;
        if (o5 != null) {
            o5.a();
        }
        this.f6521c.setHideOnContentScrollEnabled(false);
        this.f.e();
        O o6 = new O(this, this.f.getContext(), c0388e);
        MenuC0492i menuC0492i = o6.f6513g;
        menuC0492i.w();
        try {
            if (!((InterfaceC0475a) o6.f6514h.f6142e).d(o6, menuC0492i)) {
                return null;
            }
            this.f6526i = o6;
            o6.i();
            this.f.c(o6);
            q(true);
            return o6;
        } finally {
            menuC0492i.v();
        }
    }

    public final void q(boolean z4) {
        Z zJ;
        Z zJ2;
        if (z4) {
            if (!this.f6533q) {
                this.f6533q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6521c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                t(false);
            }
        } else if (this.f6533q) {
            this.f6533q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6521c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            t(false);
        }
        ActionBarContainer actionBarContainer = this.f6522d;
        WeakHashMap weakHashMap = J.P.f1421a;
        if (!actionBarContainer.isLaidOut()) {
            if (z4) {
                ((I1) this.f6523e).f7507a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((I1) this.f6523e).f7507a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z4) {
            I1 i12 = (I1) this.f6523e;
            zJ = J.P.a(i12.f7507a);
            zJ.a(0.0f);
            zJ.c(100L);
            zJ.d(new i.k(i12, 4));
            zJ2 = this.f.j(0, 200L);
        } else {
            I1 i13 = (I1) this.f6523e;
            Z zA = J.P.a(i13.f7507a);
            zA.a(1.0f);
            zA.c(200L);
            zA.d(new i.k(i13, 0));
            zJ = this.f.j(8, 100L);
            zJ2 = zA;
        }
        i.l lVar = new i.l();
        ArrayList arrayList = lVar.f6912a;
        arrayList.add(zJ);
        View view = (View) zJ.f1434a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) zJ2.f1434a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(zJ2);
        lVar.b();
    }

    public final void r(View view) {
        InterfaceC0616e0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.wssyncmldm.R.id.decor_content_parent);
        this.f6521c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.wssyncmldm.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0616e0) {
            wrapper = (InterfaceC0616e0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f6523e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.wssyncmldm.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.wssyncmldm.R.id.action_bar_container);
        this.f6522d = actionBarContainer;
        InterfaceC0616e0 interfaceC0616e0 = this.f6523e;
        if (interfaceC0616e0 == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(P.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f6519a = ((I1) interfaceC0616e0).f7507a.getContext();
        InterfaceC0616e0 interfaceC0616e02 = this.f6523e;
        if ((((I1) interfaceC0616e02).f7508b & 4) != 0) {
            this.f6525h = true;
        }
        interfaceC0616e02.getClass();
        s();
        TypedArray typedArrayObtainStyledAttributes = this.f6519a.obtainStyledAttributes(null, AbstractC0220a.f5112a, com.wssyncmldm.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6521c;
            if (!actionBarOverlayLayout2.f3267k) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f6537u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f6522d;
            WeakHashMap weakHashMap = J.P.f1421a;
            J.H.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void s() {
        ((I1) this.f6523e).getClass();
        this.f6522d.setTabContainer(null);
        this.f6523e.getClass();
        ((I1) this.f6523e).f7507a.setCollapsible(false);
        this.f6521c.setHasNonEmbeddedTabs(false);
    }

    public final void t(boolean z4) {
        boolean z5 = this.f6533q || !this.f6532p;
        View view = this.f6524g;
        final C0198c c0198c = this.f6540x;
        if (!z5) {
            if (this.f6534r) {
                this.f6534r = false;
                i.l lVar = this.f6535s;
                if (lVar != null) {
                    lVar.a();
                }
                int i5 = this.n;
                N n = this.f6538v;
                if (i5 != 0 || (!this.f6536t && !z4)) {
                    n.a();
                    return;
                }
                this.f6522d.setAlpha(1.0f);
                this.f6522d.setTransitioning(true);
                i.l lVar2 = new i.l();
                float f = -this.f6522d.getHeight();
                if (z4) {
                    this.f6522d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                Z zA = J.P.a(this.f6522d);
                zA.e(f);
                final View view2 = (View) zA.f1434a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0198c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: J.Y
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((e.P) c0198c.f5001d).f6522d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z6 = lVar2.f6916e;
                ArrayList arrayList = lVar2.f6912a;
                if (!z6) {
                    arrayList.add(zA);
                }
                if (this.f6531o && view != null) {
                    Z zA2 = J.P.a(view);
                    zA2.e(f);
                    if (!lVar2.f6916e) {
                        arrayList.add(zA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f6517y;
                boolean z7 = lVar2.f6916e;
                if (!z7) {
                    lVar2.f6914c = accelerateInterpolator;
                }
                if (!z7) {
                    lVar2.f6913b = 250L;
                }
                if (!z7) {
                    lVar2.f6915d = n;
                }
                this.f6535s = lVar2;
                lVar2.b();
                return;
            }
            return;
        }
        if (this.f6534r) {
            return;
        }
        this.f6534r = true;
        i.l lVar3 = this.f6535s;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f6522d.setVisibility(0);
        int i6 = this.n;
        N n2 = this.f6539w;
        if (i6 == 0 && (this.f6536t || z4)) {
            this.f6522d.setTranslationY(0.0f);
            float f5 = -this.f6522d.getHeight();
            if (z4) {
                this.f6522d.getLocationInWindow(new int[]{0, 0});
                f5 -= r12[1];
            }
            this.f6522d.setTranslationY(f5);
            i.l lVar4 = new i.l();
            Z zA3 = J.P.a(this.f6522d);
            zA3.e(0.0f);
            final View view3 = (View) zA3.f1434a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0198c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: J.Y
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((e.P) c0198c.f5001d).f6522d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z8 = lVar4.f6916e;
            ArrayList arrayList2 = lVar4.f6912a;
            if (!z8) {
                arrayList2.add(zA3);
            }
            if (this.f6531o && view != null) {
                view.setTranslationY(f5);
                Z zA4 = J.P.a(view);
                zA4.e(0.0f);
                if (!lVar4.f6916e) {
                    arrayList2.add(zA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f6518z;
            boolean z9 = lVar4.f6916e;
            if (!z9) {
                lVar4.f6914c = decelerateInterpolator;
            }
            if (!z9) {
                lVar4.f6913b = 250L;
            }
            if (!z9) {
                lVar4.f6915d = n2;
            }
            this.f6535s = lVar4;
            lVar4.b();
        } else {
            this.f6522d.setAlpha(1.0f);
            this.f6522d.setTranslationY(0.0f);
            if (this.f6531o && view != null) {
                view.setTranslationY(0.0f);
            }
            n2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6521c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = J.P.f1421a;
            J.F.c(actionBarOverlayLayout);
        }
    }

    public P(Dialog dialog) {
        new ArrayList();
        this.f6530m = new ArrayList();
        this.n = 0;
        this.f6531o = true;
        this.f6534r = true;
        this.f6538v = new N(this, 0);
        this.f6539w = new N(this, 1);
        this.f6540x = new C0198c(this);
        r(dialog.getWindow().getDecorView());
    }
}
