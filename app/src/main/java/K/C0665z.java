package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.PopupWindow;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import java.lang.reflect.Method;
import r0.AbstractC0807a;
import r0.AbstractC0809c;

/* renamed from: k.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665z extends PopupWindow {
    public static final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7866g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7867a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7868b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7869c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7870d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7871e;

    static {
        f = Y0.j.B() >= 140500;
        f7866g = new int[]{R.drawable.sesl_menu_popup_background, R.drawable.sesl_menu_popup_background_dark};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0665z(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5, 0);
        boolean z4 = false;
        this.f7868b = new Rect();
        D3.c cVarL = D3.c.l(context, attributeSet, AbstractC0220a.f5128s, i5);
        TypedArray typedArray = (TypedArray) cVarL.f;
        if (typedArray.hasValue(2)) {
            O.o.c(this, typedArray.getBoolean(2, false));
        }
        this.f7867a = context;
        Transition transitionA = a(typedArray.getResourceId(3, 0));
        Transition transitionA2 = a(typedArray.getResourceId(4, 0));
        setEnterTransition(transitionA);
        setExitTransition(transitionA2);
        int resourceId = typedArray.getResourceId(0, -1);
        boolean z5 = false;
        for (int i6 : f7866g) {
            if (i6 == resourceId) {
                z5 = true;
            }
        }
        setBackgroundDrawable(cVarL.g(0));
        this.f7871e = !z5;
        cVarL.m();
        if (!ViewConfiguration.get(context).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4)) {
            z4 = true;
        }
        this.f7869c = z4;
        this.f7870d = this.f7867a.getResources().getDimensionPixelSize(R.dimen.sesl_navigation_bar_height);
    }

    public final Transition a(int i5) {
        Transition transitionInflateTransition;
        if (i5 == 0 || i5 == 17760256 || (transitionInflateTransition = TransitionInflater.from(this.f7867a).inflateTransition(i5)) == null) {
            return null;
        }
        if ((transitionInflateTransition instanceof TransitionSet) && ((TransitionSet) transitionInflateTransition).getTransitionCount() == 0) {
            return null;
        }
        return transitionInflateTransition;
    }

    @Override // android.widget.PopupWindow
    public final int getMaxAvailableHeight(View view, int i5, boolean z4) throws NoSuchMethodException, SecurityException {
        Context context;
        DisplayManager displayManager;
        Display display;
        Activity activity;
        int i6;
        Rect rect = new Rect();
        if (z4) {
            Method methodR = J2.b.r(View.class, "getWindowDisplayFrame", Rect.class);
            if (methodR != null) {
                J2.b.E(view, methodR, rect);
            }
            if (this.f7869c && this.f7867a.getResources().getConfiguration().orientation != 2) {
                rect.bottom -= this.f7870d;
            }
        } else {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i7 = 0;
        if (f && (context = this.f7867a) != null && (displayManager = (DisplayManager) context.getSystemService("display")) != null && (display = displayManager.getDisplay(0)) != null && AbstractC0807a.c()) {
            Context baseContext = this.f7867a;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (activity == null || !activity.isInMultiWindowMode()) {
                Point point = new Point();
                display.getRealSize(point);
                if (AbstractC0809c.h()) {
                    if (this.f7867a.getResources().getConfiguration().orientation == 2) {
                        int i8 = point.y;
                        int i9 = point.x;
                        if (i8 > i9) {
                            i7 = i9 / 2;
                        } else {
                            i6 = i8 / 2;
                            i7 = i6;
                        }
                    }
                } else if (AbstractC0809c.i() && this.f7867a.getResources().getConfiguration().orientation == 1) {
                    int i10 = point.y;
                    int i11 = point.x;
                    if (i10 > i11) {
                        i6 = i10 / 2;
                        i7 = i6;
                    } else {
                        i7 = i11 / 2;
                    }
                }
            }
        }
        int height = (((i7 == 0 || iArr[1] >= i7) ? rect.bottom : i7) - (O.o.a(this) ? iArr[1] : view.getHeight() + iArr[1])) - i5;
        int i12 = iArr[1];
        if (i7 == 0 || i12 < i7) {
            i7 = rect.top;
        }
        int iMax = Math.max(height, (i12 - i7) + i5);
        if (getBackground() == null) {
            return iMax;
        }
        Drawable background = getBackground();
        Rect rect2 = this.f7868b;
        background.getPadding(rect2);
        return iMax - (rect2.top + rect2.bottom);
    }

    @Override // android.widget.PopupWindow
    public final void setBackgroundDrawable(Drawable drawable) {
        this.f7871e = true;
        super.setBackgroundDrawable(drawable);
    }
}
