package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0220a;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class I1 implements InterfaceC0616e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f7507a;

    /* renamed from: b, reason: collision with root package name */
    public int f7508b;

    /* renamed from: c, reason: collision with root package name */
    public final View f7509c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f7510d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f7511e;
    public final Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7512g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f7513h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f7514i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f7515j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f7516k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7517l;

    /* renamed from: m, reason: collision with root package name */
    public C0633k f7518m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f7519o;

    public I1(Toolbar toolbar, boolean z4) {
        Drawable drawable;
        this.n = 0;
        this.f7507a = toolbar;
        this.f7513h = toolbar.getTitle();
        this.f7514i = toolbar.getSubtitle();
        this.f7512g = this.f7513h != null;
        this.f = toolbar.getNavigationIcon();
        D3.c cVarL = D3.c.l(toolbar.getContext(), null, AbstractC0220a.f5112a, R.attr.actionBarStyle);
        int i5 = 15;
        this.f7519o = cVarL.g(15);
        if (z4) {
            TypedArray typedArray = (TypedArray) cVarL.f;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f7512g = true;
                this.f7513h = text;
                if ((this.f7508b & 8) != 0) {
                    Toolbar toolbar2 = this.f7507a;
                    toolbar2.setTitle(text);
                    if (this.f7512g) {
                        J.P.i(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f7514i = text2;
                if ((this.f7508b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableG = cVarL.g(20);
            if (drawableG != null) {
                this.f7511e = drawableG;
                c();
            }
            Drawable drawableG2 = cVarL.g(17);
            if (drawableG2 != null) {
                this.f7510d = drawableG2;
                c();
            }
            if (this.f == null && (drawable = this.f7519o) != null) {
                this.f = drawable;
                int i6 = this.f7508b & 4;
                Toolbar toolbar3 = this.f7507a;
                if (i6 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f7509c;
                if (view != null && (this.f7508b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f7509c = viewInflate;
                if (viewInflate != null && (this.f7508b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f7508b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f3515w.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f3507o = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f3497e;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f3508p = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f7519o = toolbar.getNavigationIcon();
            } else {
                i5 = 11;
            }
            this.f7508b = i5;
        }
        cVarL.m();
        if (R.string.sesl_action_bar_up_description != this.n) {
            this.n = R.string.sesl_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i7 = this.n;
                this.f7515j = i7 != 0 ? toolbar.getContext().getString(i7) : null;
                b();
            }
        }
        this.f7515j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new H1(this));
    }

    public final void a(int i5) {
        View view;
        int i6 = this.f7508b ^ i5;
        this.f7508b = i5;
        if (i6 != 0) {
            if ((i6 & 4) != 0) {
                if ((i5 & 4) != 0) {
                    b();
                }
                int i7 = this.f7508b & 4;
                Toolbar toolbar = this.f7507a;
                if (i7 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f7519o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i6 & 3) != 0) {
                c();
            }
            int i8 = i6 & 8;
            Toolbar toolbar2 = this.f7507a;
            if (i8 != 0) {
                if ((i5 & 8) != 0) {
                    toolbar2.setTitle(this.f7513h);
                    toolbar2.setSubtitle(this.f7514i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i6 & 16) == 0 || (view = this.f7509c) == null) {
                return;
            }
            if ((i5 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f7508b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f7515j);
            Toolbar toolbar = this.f7507a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.f7515j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i5 = this.f7508b;
        if ((i5 & 2) == 0) {
            drawable = null;
        } else if ((i5 & 1) == 0 || (drawable = this.f7511e) == null) {
            drawable = this.f7510d;
        }
        this.f7507a.setLogo(drawable);
    }
}
