package androidx.appcompat.widget;

import J.Z;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.wssyncmldm.R;
import e.B;
import e.t;
import j.MenuC0492i;
import k.C0618f;
import k.C0633k;
import k.I1;
import k.InterfaceC0610c0;
import k.InterfaceC0613d0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f3323d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f3324e;
    public TypedValue f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f3325g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f3326h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f3327i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f3328j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0610c0 f3329k;

    /* renamed from: l, reason: collision with root package name */
    public float f3330l;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3328j = new Rect();
        a();
    }

    public final void a() {
        this.f3330l = TypedValue.applyDimension(1, r0.getConfiguration().screenWidthDp, getResources().getDisplayMetrics());
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3326h == null) {
            this.f3326h = new TypedValue();
        }
        return this.f3326h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3327i == null) {
            this.f3327i = new TypedValue();
        }
        return this.f3327i;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3325g == null) {
            this.f3325g = new TypedValue();
        }
        return this.f3325g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3323d == null) {
            this.f3323d = new TypedValue();
        }
        return this.f3323d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3324e == null) {
            this.f3324e = new TypedValue();
        }
        return this.f3324e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0610c0 interfaceC0610c0 = this.f3329k;
        if (interfaceC0610c0 != null) {
            interfaceC0610c0.getClass();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f3324e == null) {
            this.f3324e = new TypedValue();
        }
        getContext().getTheme().resolveAttribute(R.attr.windowMinWidthMinor, this.f3324e, true);
        if (this.f3323d == null) {
            this.f3323d = new TypedValue();
        }
        getContext().getTheme().resolveAttribute(R.attr.windowMinWidthMajor, this.f3323d, true);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0633k c0633k;
        super.onDetachedFromWindow();
        InterfaceC0610c0 interfaceC0610c0 = this.f3329k;
        if (interfaceC0610c0 != null) {
            B b2 = ((t) interfaceC0610c0).f6618e;
            InterfaceC0613d0 interfaceC0613d0 = b2.f6475s;
            if (interfaceC0613d0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0613d0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((I1) actionBarOverlayLayout.f3264h).f7507a.f3495d;
                if (actionMenuView != null && (c0633k = actionMenuView.f3297w) != null) {
                    c0633k.i();
                    C0618f c0618f = c0633k.f7708w;
                    if (c0618f != null && c0618f.b()) {
                        c0618f.f7024i.dismiss();
                    }
                }
            }
            if (b2.f6480x != null) {
                b2.f6470m.getDecorView().removeCallbacks(b2.f6481y);
                if (b2.f6480x.isShowing()) {
                    try {
                        b2.f6480x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b2.f6480x = null;
            }
            Z z4 = b2.f6482z;
            if (z4 != null) {
                z4.b();
            }
            MenuC0492i menuC0492i = b2.A(0).f6428h;
            if (menuC0492i != null) {
                menuC0492i.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0610c0 interfaceC0610c0) {
        this.f3329k = interfaceC0610c0;
    }
}
