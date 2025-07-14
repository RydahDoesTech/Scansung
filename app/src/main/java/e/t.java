package e;

import J.InterfaceC0060q;
import J.g0;
import J.p0;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.wssyncmldm.R;
import j.InterfaceC0503t;
import j.MenuC0492i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0610c0;
import k.M1;
import z.AbstractC0939b;

/* loaded from: classes.dex */
public final class t implements InterfaceC0060q, InterfaceC0610c0, InterfaceC0503t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f6618e;

    public /* synthetic */ t(B b2, int i5) {
        this.f6617d = i5;
        this.f6618e = b2;
    }

    @Override // J.InterfaceC0060q
    public p0 Z(View view, p0 p0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z4;
        View view2;
        p0 p0VarB;
        boolean z5;
        int iD = p0Var.d();
        B b2 = this.f6618e;
        b2.getClass();
        int iD2 = p0Var.d();
        ActionBarContextView actionBarContextView = b2.f6479w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b2.f6479w.getLayoutParams();
            if (b2.f6479w.isShown()) {
                if (b2.f6464f0 == null) {
                    b2.f6464f0 = new Rect();
                    b2.g0 = new Rect();
                }
                Rect rect = b2.f6464f0;
                Rect rect2 = b2.g0;
                rect.set(p0Var.b(), p0Var.d(), p0Var.c(), p0Var.a());
                ViewGroup viewGroup = b2.f6437B;
                Method method = M1.f7533a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e5) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                ViewGroup viewGroup2 = b2.f6437B;
                WeakHashMap weakHashMap = J.P.f1421a;
                p0 p0VarA = J.I.a(viewGroup2);
                int iB = p0VarA == null ? 0 : p0VarA.b();
                int iC = p0VarA == null ? 0 : p0VarA.c();
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z5 = true;
                }
                Context context = b2.f6469l;
                if (i5 <= 0 || b2.f6439D != null) {
                    View view3 = b2.f6439D;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            b2.f6439D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view4 = new View(context);
                    b2.f6439D = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    b2.f6437B.addView(b2.f6439D, -1, layoutParams);
                }
                View view5 = b2.f6439D;
                z = view5 != null;
                if (z && view5.getVisibility() != 0) {
                    View view6 = b2.f6439D;
                    view6.setBackgroundColor((view6.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0939b.a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0939b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!b2.f6443I && z && !b2.k0) {
                    iD2 = 0;
                }
                b2.x();
                View viewFindViewById = b2.f6470m.findViewById(android.R.id.content);
                if (viewFindViewById instanceof ContentFrameLayout) {
                    if (viewFindViewById.getPaddingTop() != 0) {
                        marginLayoutParams.topMargin = 0;
                    }
                    if (viewFindViewById.getPaddingRight() != 0) {
                        marginLayoutParams.rightMargin = 0;
                    }
                    if (viewFindViewById.getPaddingLeft() != 0) {
                        marginLayoutParams.leftMargin = 0;
                    }
                }
                z4 = z;
                z = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z = false;
            }
            if (z) {
                b2.f6479w.setLayoutParams(marginLayoutParams);
                View view7 = b2.f6439D;
                if (view7 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view7.getLayoutParams();
                    if (layoutParams2.height != iD2) {
                        layoutParams2.height = iD2;
                        b2.f6439D.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
        View view8 = b2.f6439D;
        if (view8 != null) {
            view8.setVisibility(z4 ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = p0Var.b();
            int iC2 = p0Var.c();
            int iA = p0Var.a();
            g0 g0Var = new g0(p0Var);
            g0Var.e(B.c.b(iB2, iD2, iC2, iA));
            p0VarB = g0Var.b();
            view2 = view;
        } else {
            view2 = view;
            p0VarB = p0Var;
        }
        return J.P.e(view2, p0VarB);
    }

    @Override // j.InterfaceC0503t
    public void a(MenuC0492i menuC0492i, boolean z4) {
        A a5;
        switch (this.f6617d) {
            case 2:
                this.f6618e.s(menuC0492i);
                break;
            default:
                MenuC0492i menuC0492iK = menuC0492i.k();
                int i5 = 0;
                boolean z5 = menuC0492iK != menuC0492i;
                if (z5) {
                    menuC0492i = menuC0492iK;
                }
                B b2 = this.f6618e;
                A[] aArr = b2.f6447M;
                int length = aArr != null ? aArr.length : 0;
                while (true) {
                    if (i5 >= length) {
                        a5 = null;
                    } else {
                        a5 = aArr[i5];
                        if (a5 == null || a5.f6428h != menuC0492i) {
                            i5++;
                        }
                    }
                }
                if (a5 != null) {
                    if (!z5) {
                        b2.t(a5, z4);
                        break;
                    } else {
                        b2.r(a5.f6422a, a5, menuC0492iK);
                        b2.t(a5, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // j.InterfaceC0503t
    public boolean b(MenuC0492i menuC0492i) {
        Window.Callback callback;
        switch (this.f6617d) {
            case 2:
                Window.Callback callback2 = this.f6618e.f6470m.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0492i);
                    break;
                }
                break;
            default:
                if (menuC0492i == menuC0492i.k()) {
                    B b2 = this.f6618e;
                    if (b2.f6441G && (callback = b2.f6470m.getCallback()) != null && !b2.f6452T) {
                        callback.onMenuOpened(108, menuC0492i);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
