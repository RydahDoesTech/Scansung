package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.wssyncmldm.R;

/* renamed from: k.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0637l0 extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7716d;

    /* renamed from: e, reason: collision with root package name */
    public int f7717e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f7718g;

    /* renamed from: h, reason: collision with root package name */
    public int f7719h;

    /* renamed from: i, reason: collision with root package name */
    public int f7720i;

    /* renamed from: j, reason: collision with root package name */
    public C0631j0 f7721j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7722k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7723l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7724m;
    public O.g n;

    /* renamed from: o, reason: collision with root package name */
    public RunnableC0634k0 f7725o;

    public C0637l0(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f7716d = new Rect();
        this.f7717e = 0;
        this.f = 0;
        this.f7718g = 0;
        this.f7719h = 0;
        this.f7723l = z4;
        setCacheColorHint(0);
    }

    public final int a(int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i5, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i6) {
                return i6;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0637l0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f7716d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f7725o != null) {
            return;
        }
        super.drawableStateChanged();
        C0631j0 c0631j0 = this.f7721j;
        if (c0631j0 != null) {
            c0631j0.f7679e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f7724m && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f7723l || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f7723l || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f7723l || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f7723l && this.f7722k) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f7725o = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHoverEvent(android.view.MotionEvent r5) throws java.lang.NoSuchFieldException, java.lang.SecurityException {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L17
            k.k0 r1 = r4.f7725o
            if (r1 != 0) goto L17
            k.k0 r1 = new k.k0
            r2 = 0
            r1.<init>(r2, r4)
            r4.f7725o = r1
            r4.post(r1)
        L17:
            boolean r1 = super.onHoverEvent(r5)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L28
            r2 = 7
            if (r0 != r2) goto L24
            goto L28
        L24:
            r4.setSelection(r3)
            goto L73
        L28:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r5 = r5.getY()
            int r5 = (int) r5
            int r5 = r4.pointToPosition(r0, r5)
            java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
            java.lang.String r2 = "mSelectedPosition"
            java.lang.reflect.Field r0 = J2.b.q(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.Object r0 = J2.b.n(r4, r0)
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L4f
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L50
        L4f:
            r0 = r3
        L50:
            if (r5 == r3) goto L73
            if (r5 == r0) goto L73
            int r0 = r4.getFirstVisiblePosition()
            int r5 = r5 - r0
            android.view.View r5 = r4.getChildAt(r5)
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L70
            r4.requestFocus()
            boolean r5 = r4.isHovered()
            if (r5 != 0) goto L70
            r5 = 1
            r4.setHovered(r5)
        L70:
            r4.drawableStateChanged()
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0637l0.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7720i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0634k0 runnableC0634k0 = this.f7725o;
        if (runnableC0634k0 != null) {
            C0637l0 c0637l0 = (C0637l0) runnableC0634k0.f7713e;
            c0637l0.f7725o = null;
            c0637l0.removeCallbacks(runnableC0634k0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f7722k = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0631j0 c0631j0;
        if (drawable != null) {
            c0631j0 = new C0631j0(drawable);
            c0631j0.f7679e = true;
        } else {
            c0631j0 = null;
        }
        this.f7721j = c0631j0;
        super.setSelector(c0631j0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f7717e = rect.left;
        this.f = rect.top;
        this.f7718g = rect.right;
        this.f7719h = rect.bottom;
    }
}
