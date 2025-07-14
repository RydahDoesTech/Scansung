package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import c.AbstractC0220a;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import j.InterfaceC0508y;

/* renamed from: k.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0662x0 implements InterfaceC0508y {

    /* renamed from: C, reason: collision with root package name */
    public static final boolean f7835C;

    /* renamed from: A, reason: collision with root package name */
    public final C0665z f7836A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7837B;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7838d;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f7839e;
    public C0637l0 f;

    /* renamed from: i, reason: collision with root package name */
    public int f7842i;

    /* renamed from: j, reason: collision with root package name */
    public int f7843j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7845l;

    /* renamed from: o, reason: collision with root package name */
    public E0.i f7847o;

    /* renamed from: p, reason: collision with root package name */
    public View f7848p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f7849q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f7850r;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f7855w;

    /* renamed from: y, reason: collision with root package name */
    public Rect f7857y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7858z;

    /* renamed from: g, reason: collision with root package name */
    public final int f7840g = -2;

    /* renamed from: h, reason: collision with root package name */
    public int f7841h = -2;

    /* renamed from: k, reason: collision with root package name */
    public final int f7844k = IDMCallbackStatusInterface.IDM_STATUS_INITIALIZED;

    /* renamed from: m, reason: collision with root package name */
    public int f7846m = 0;
    public final int n = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public final RunnableC0656u0 f7851s = new RunnableC0656u0(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final ViewOnTouchListenerC0660w0 f7852t = new ViewOnTouchListenerC0660w0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0658v0 f7853u = new C0658v0(this);

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0656u0 f7854v = new RunnableC0656u0(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final Rect f7856x = new Rect();

    static {
        f7835C = Y0.j.B() >= 140500;
    }

    public C0662x0(Context context, AttributeSet attributeSet, int i5) {
        this.f7838d = context;
        this.f7855w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5124o, i5, 0);
        this.f7842i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f7843j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f7845l = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0665z c0665z = new C0665z(context, attributeSet, i5);
        this.f7836A = c0665z;
        c0665z.setInputMethodMode(1);
    }

    @Override // j.InterfaceC0508y
    public final boolean b() {
        return this.f7836A.isShowing();
    }

    public final void c(int i5) {
        this.f7842i = i5;
    }

    public final int d() {
        return this.f7842i;
    }

    @Override // j.InterfaceC0508y
    public final void dismiss() {
        C0665z c0665z = this.f7836A;
        c0665z.dismiss();
        c0665z.setContentView(null);
        this.f = null;
        this.f7855w.removeCallbacks(this.f7851s);
    }

    public final int f() {
        if (this.f7845l) {
            return this.f7843j;
        }
        return 0;
    }

    public final Drawable g() {
        return this.f7836A.getBackground();
    }

    @Override // j.InterfaceC0508y
    public final C0637l0 i() {
        return this.f;
    }

    public final void l(Drawable drawable) {
        this.f7836A.setBackgroundDrawable(drawable);
    }

    public final void m(int i5) {
        this.f7843j = i5;
        this.f7845l = true;
    }

    public void n(ListAdapter listAdapter) {
        E0.i iVar = this.f7847o;
        if (iVar == null) {
            this.f7847o = new E0.i(2, this);
        } else {
            ListAdapter listAdapter2 = this.f7839e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(iVar);
            }
        }
        this.f7839e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f7847o);
        }
        C0637l0 c0637l0 = this.f;
        if (c0637l0 != null) {
            c0637l0.setAdapter(this.f7839e);
        }
    }

    public C0637l0 p(Context context, boolean z4) {
        return new C0637l0(context, z4);
    }

    public final void q(int i5) {
        Drawable background = this.f7836A.getBackground();
        if (background == null) {
            this.f7841h = i5;
            return;
        }
        Rect rect = this.f7856x;
        background.getPadding(rect);
        this.f7841h = rect.left + rect.right + i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0662x0.r():void");
    }
}
