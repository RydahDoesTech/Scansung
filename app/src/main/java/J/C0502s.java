package j;

import J.P;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.wssyncmldm.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.B0;
import k.C0637l0;
import k.C0665z;

/* renamed from: j.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0502s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7017a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0492i f7018b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7020d;

    /* renamed from: e, reason: collision with root package name */
    public View f7021e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7022g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0503t f7023h;

    /* renamed from: i, reason: collision with root package name */
    public ViewOnKeyListenerC0509z f7024i;

    /* renamed from: j, reason: collision with root package name */
    public C0500q f7025j;
    public int f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7026k = true;

    /* renamed from: l, reason: collision with root package name */
    public final C0500q f7027l = new C0500q(this);

    public C0502s(int i5, Context context, View view, MenuC0492i menuC0492i, boolean z4) {
        this.f7017a = context;
        this.f7018b = menuC0492i;
        this.f7021e = view;
        this.f7019c = z4;
        this.f7020d = i5;
    }

    public final ViewOnKeyListenerC0509z a() throws Resources.NotFoundException {
        if (this.f7024i == null) {
            Context context = this.f7017a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0501r.a(defaultDisplay, point);
            Math.min(point.x, point.y);
            context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            View view = this.f7021e;
            Context context2 = this.f7017a;
            boolean z4 = this.f7019c;
            ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = new ViewOnKeyListenerC0509z(this.f7020d, context2, view, this.f7018b, z4);
            if (!this.f7026k) {
                viewOnKeyListenerC0509z.n = false;
            }
            viewOnKeyListenerC0509z.f7040q = this.f7027l;
            viewOnKeyListenerC0509z.f7041r = this.f7021e;
            viewOnKeyListenerC0509z.f7043t = this.f7023h;
            viewOnKeyListenerC0509z.f7031g.f6950h = this.f7022g;
            viewOnKeyListenerC0509z.f7048y = this.f;
            this.f7024i = viewOnKeyListenerC0509z;
        }
        return this.f7024i;
    }

    public final boolean b() {
        ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = this.f7024i;
        return viewOnKeyListenerC0509z != null && viewOnKeyListenerC0509z.b();
    }

    public void c() {
        this.f7024i = null;
        C0500q c0500q = this.f7025j;
        if (c0500q != null) {
            c0500q.onDismiss();
        }
    }

    public final void d(boolean z4, boolean z5) {
        View view;
        C0665z c0665z;
        Method methodR;
        ViewOnKeyListenerC0509z viewOnKeyListenerC0509zA = a();
        viewOnKeyListenerC0509zA.f7049z = z5;
        if (z4) {
            View view2 = this.f7021e;
            WeakHashMap weakHashMap = P.f1421a;
            boolean z6 = view2.getLayoutDirection() == 1;
            Context context = this.f7017a;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.sesl_menu_popup_offset_horizontal);
            if (z6) {
                viewOnKeyListenerC0509zA.f7035k.f7842i = dimensionPixelOffset;
            } else {
                viewOnKeyListenerC0509zA.f7035k.f7842i = 0 - dimensionPixelOffset;
            }
            viewOnKeyListenerC0509zA.f7035k.m(0);
            int i5 = (int) ((context.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i6 = 0 - i5;
            viewOnKeyListenerC0509zA.f7029d = new Rect(i6, i6, i5, i5);
        }
        if (viewOnKeyListenerC0509zA.b()) {
            return;
        }
        if (viewOnKeyListenerC0509zA.f7045v || (view = viewOnKeyListenerC0509zA.f7041r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        viewOnKeyListenerC0509zA.f7042s = view;
        boolean z7 = viewOnKeyListenerC0509zA.n;
        B0 b02 = viewOnKeyListenerC0509zA.f7035k;
        if (!z7 && (c0665z = b02.f7836A) != null && (methodR = J2.b.r(PopupWindow.class, "setAllowScrollingAnchorParent", Boolean.TYPE)) != null) {
            J2.b.E(c0665z, methodR, Boolean.valueOf(z7));
        }
        b02.f7836A.setOnDismissListener(viewOnKeyListenerC0509zA);
        b02.f7849q = viewOnKeyListenerC0509zA;
        b02.f7858z = true;
        b02.f7836A.setFocusable(true);
        View view3 = viewOnKeyListenerC0509zA.f7042s;
        boolean z8 = viewOnKeyListenerC0509zA.f7044u == null;
        ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
        viewOnKeyListenerC0509zA.f7044u = viewTreeObserver;
        if (z8) {
            viewTreeObserver.addOnGlobalLayoutListener(viewOnKeyListenerC0509zA.f7038o);
        }
        view3.addOnAttachStateChangeListener(viewOnKeyListenerC0509zA.f7039p);
        b02.f7848p = view3;
        b02.f7846m = viewOnKeyListenerC0509zA.f7048y;
        boolean z9 = viewOnKeyListenerC0509zA.f7046w;
        Context context2 = viewOnKeyListenerC0509zA.f7030e;
        C0489f c0489f = viewOnKeyListenerC0509zA.f7031g;
        if (!z9) {
            int i7 = viewOnKeyListenerC0509zA.f7033i;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = c0489f.getCount();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            FrameLayout frameLayout = null;
            View view4 = null;
            while (true) {
                if (i8 >= count) {
                    i7 = i9;
                    break;
                }
                int itemViewType = c0489f.getItemViewType(i8);
                if (itemViewType != i10) {
                    i10 = itemViewType;
                    view4 = null;
                }
                if (frameLayout == null) {
                    frameLayout = new FrameLayout(context2);
                }
                view4 = c0489f.getView(i8, view4, frameLayout);
                view4.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view4.getMeasuredWidth();
                if (measuredWidth >= i7) {
                    break;
                }
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                i8++;
            }
            viewOnKeyListenerC0509zA.f7047x = i7;
            viewOnKeyListenerC0509zA.f7046w = true;
        }
        b02.q(viewOnKeyListenerC0509zA.f7047x);
        b02.f7836A.setInputMethodMode(2);
        Rect rect = viewOnKeyListenerC0509zA.f7029d;
        b02.f7857y = rect != null ? new Rect(rect) : null;
        b02.r();
        C0637l0 c0637l0 = b02.f;
        c0637l0.setOnKeyListener(viewOnKeyListenerC0509zA);
        boolean z10 = viewOnKeyListenerC0509zA.f7036l;
        viewOnKeyListenerC0509zA.f7037m = z10 ? null : c0637l0;
        if (viewOnKeyListenerC0509zA.f7049z) {
            MenuC0492i menuC0492i = viewOnKeyListenerC0509zA.f;
            if (menuC0492i.f6966m != null && !z10) {
                FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(context2).inflate(R.layout.sesl_popup_menu_header_item_layout, (ViewGroup) c0637l0, false);
                TextView textView = (TextView) frameLayout2.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0492i.f6966m);
                }
                frameLayout2.setEnabled(false);
                c0637l0.addHeaderView(frameLayout2, null, false);
            }
        }
        b02.n(c0489f);
        b02.r();
    }
}
