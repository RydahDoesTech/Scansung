package androidx.viewpager2.widget;

import B.g;
import F0.a;
import G0.b;
import G0.c;
import G0.d;
import G0.e;
import G0.f;
import G0.i;
import G0.l;
import G0.m;
import G0.n;
import G0.o;
import J.P;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import com.google.firebase.messaging.q;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import j0.AbstractC0510A;
import j0.AbstractC0515F;
import j0.AbstractC0519J;
import j0.C0554w;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: D, reason: collision with root package name */
    public static final PathInterpolator f4974D = new PathInterpolator(0.22f, 0.25f, 0.0f, 1.0f);

    /* renamed from: A, reason: collision with root package name */
    public boolean f4975A;

    /* renamed from: B, reason: collision with root package name */
    public int f4976B;

    /* renamed from: C, reason: collision with root package name */
    public C0554w f4977C;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4978d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4979e;
    public final f f;

    /* renamed from: g, reason: collision with root package name */
    public int f4980g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4981h;

    /* renamed from: i, reason: collision with root package name */
    public final e f4982i;

    /* renamed from: j, reason: collision with root package name */
    public final i f4983j;

    /* renamed from: k, reason: collision with root package name */
    public int f4984k;

    /* renamed from: l, reason: collision with root package name */
    public Parcelable f4985l;

    /* renamed from: m, reason: collision with root package name */
    public final n f4986m;
    public final m n;

    /* renamed from: o, reason: collision with root package name */
    public final d f4987o;

    /* renamed from: p, reason: collision with root package name */
    public final f f4988p;

    /* renamed from: q, reason: collision with root package name */
    public final g f4989q;

    /* renamed from: r, reason: collision with root package name */
    public final b f4990r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0515F f4991s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4992t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4993u;

    /* renamed from: v, reason: collision with root package name */
    public int f4994v;

    /* renamed from: w, reason: collision with root package name */
    public final q f4995w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f4996x;

    /* renamed from: y, reason: collision with root package name */
    public ValueAnimator f4997y;

    /* renamed from: z, reason: collision with root package name */
    public float f4998z;

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4978d = new Rect();
        this.f4979e = new Rect();
        f fVar = new f();
        this.f = fVar;
        int i5 = 0;
        this.f4981h = false;
        this.f4982i = new e(i5, this);
        this.f4984k = -1;
        this.f4991s = null;
        this.f4992t = false;
        int i6 = 1;
        this.f4993u = true;
        this.f4994v = -1;
        this.f4998z = 1.0f;
        this.f4975A = false;
        this.f4976B = 0;
        this.f4995w = new q(this);
        n nVar = new n(this, context);
        this.f4986m = nVar;
        WeakHashMap weakHashMap = P.f1421a;
        nVar.setId(View.generateViewId());
        this.f4986m.setDescendantFocusability(NetworkAnalyticsConstants.DataPoints.FLAG_PPID);
        i iVar = new i(this);
        this.f4983j = iVar;
        this.f4986m.setLayoutManager(iVar);
        this.f4986m.setScrollingTouchSlop(1);
        int[] iArr = a.f625a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f4986m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            n nVar2 = this.f4986m;
            G0.g gVar = new G0.g();
            if (nVar2.f4739F == null) {
                nVar2.f4739F = new ArrayList();
            }
            nVar2.f4739F.add(gVar);
            d dVar = new d(this);
            this.f4987o = dVar;
            this.f4989q = new g(7, dVar);
            m mVar = new m(this);
            this.n = mVar;
            mVar.a(this.f4986m);
            this.f4986m.k(this.f4987o);
            f fVar2 = new f();
            this.f4988p = fVar2;
            this.f4987o.f707a = fVar2;
            f fVar3 = new f(this, i5);
            f fVar4 = new f(this, i6);
            ((ArrayList) fVar2.f721b).add(fVar3);
            ((ArrayList) this.f4988p.f721b).add(fVar4);
            q qVar = this.f4995w;
            n nVar3 = this.f4986m;
            qVar.getClass();
            nVar3.setImportantForAccessibility(2);
            qVar.f6169g = new e(i6, qVar);
            ViewPager2 viewPager2 = (ViewPager2) qVar.f6170h;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f4988p.f721b).add(fVar);
            b bVar = new b();
            this.f4990r = bVar;
            ((ArrayList) this.f4988p.f721b).add(bVar);
            n nVar4 = this.f4986m;
            attachViewToParent(nVar4, 0, nVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void a(ViewPager2 viewPager2) {
        View viewE;
        m mVar = viewPager2.n;
        if (mVar == null || (viewE = mVar.e(viewPager2.f4983j)) == null) {
            return;
        }
        int iIndexOfChild = viewPager2.f4986m.indexOfChild(viewE);
        i iVar = viewPager2.f4983j;
        C0554w c0554w = viewPager2.f4977C;
        if (c0554w == null || ((AbstractC0519J) c0554w.f3651b) != iVar) {
            viewPager2.f4977C = new C0554w(iVar, 0);
        }
        C0554w c0554w2 = viewPager2.f4977C;
        viewPager2.f4977C = c0554w2;
        int iE = c0554w2.e(viewE);
        View childAt = viewPager2.f4986m.getChildAt(iE < 0 ? iIndexOfChild + 1 : iIndexOfChild - 1);
        int i5 = iE < 0 ? iE * (-1) : iE;
        float width = ((((viewE.getWidth() - i5) / viewE.getWidth()) * 0.1f) + 0.9f) * viewPager2.f4998z;
        float f = i5;
        float width2 = (((f / viewE.getWidth()) * 0.1f) + 0.9f) * viewPager2.f4998z;
        float f5 = iE > 0 ? -4 : 4;
        float width3 = ((viewE.getWidth() - i5) / viewE.getWidth()) * f5;
        viewE.setScaleX(width);
        viewE.setScaleY(width);
        viewE.setRotationY((f / viewE.getWidth()) * f5);
        if (childAt != null) {
            childAt.setScaleX(width2);
            childAt.setScaleY(width2);
            childAt.setRotationY(-width3);
        }
    }

    public final void b() {
        AbstractC0510A adapter;
        if (this.f4984k == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f4985l != null) {
            this.f4985l = null;
        }
        int iMax = Math.max(0, Math.min(this.f4984k, adapter.a() - 1));
        this.f4980g = iMax;
        this.f4984k = -1;
        this.f4986m.v0(iMax);
        this.f4995w.D();
    }

    public final void c(int i5) {
        Object obj = this.f4989q.f95e;
        d(i5);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i5) {
        return this.f4986m.canScrollHorizontally(i5);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i5) {
        return this.f4986m.canScrollVertically(i5);
    }

    public final void d(int i5) {
        f fVar;
        AbstractC0510A adapter = getAdapter();
        if (adapter == null) {
            if (this.f4984k != -1) {
                this.f4984k = Math.max(i5, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i5, 0), adapter.a() - 1);
        int i6 = this.f4980g;
        if ((iMin == i6 && this.f4987o.f == 0) || iMin == i6) {
            return;
        }
        double d5 = i6;
        this.f4980g = iMin;
        this.f4995w.D();
        d dVar = this.f4987o;
        if (dVar.f != 0) {
            dVar.e();
            c cVar = dVar.f712g;
            d5 = cVar.f704a + cVar.f705b;
        }
        d dVar2 = this.f4987o;
        dVar2.getClass();
        dVar2.f711e = 2;
        boolean z4 = dVar2.f714i != iMin;
        dVar2.f714i = iMin;
        dVar2.c(2);
        if (z4 && (fVar = dVar2.f707a) != null) {
            fVar.c(iMin);
        }
        double d6 = iMin;
        if (Math.abs(d6 - d5) <= 3.0d) {
            this.f4986m.A0(iMin);
            return;
        }
        this.f4986m.v0(d6 > d5 ? iMin - 3 : iMin + 3);
        n nVar = this.f4986m;
        nVar.post(new G.b(iMin, nVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof o) {
            int i5 = ((o) parcelable).f728d;
            sparseArray.put(this.f4986m.getId(), (Parcelable) sparseArray.get(i5));
            sparseArray.remove(i5);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e() {
        m mVar = this.n;
        if (mVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = mVar.e(this.f4983j);
        if (viewE == null) {
            return;
        }
        this.f4983j.getClass();
        int iF = AbstractC0519J.F(viewE);
        if (iF != this.f4980g && getScrollState() == 0) {
            this.f4988p.c(iF);
        }
        this.f4981h = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f4995w.getClass();
        this.f4995w.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC0510A getAdapter() {
        return this.f4986m.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4980g;
    }

    public int getItemDecorationCount() {
        return this.f4986m.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4994v;
    }

    public int getOrientation() {
        return this.f4983j.f4708p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        n nVar = this.f4986m;
        if (getOrientation() == 0) {
            height = nVar.getWidth() - nVar.getPaddingLeft();
            paddingBottom = nVar.getPaddingRight();
        } else {
            height = nVar.getHeight() - nVar.getPaddingTop();
            paddingBottom = nVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f4987o.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f4995w.f6170h;
        if (viewPager2.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iA = viewPager2.getAdapter().a();
            iA2 = 0;
        } else {
            iA2 = viewPager2.getAdapter().a();
            iA = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iA, iA2, false, 0));
        AbstractC0510A adapter = viewPager2.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !viewPager2.f4993u) {
            return;
        }
        if (viewPager2.f4980g > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f4980g < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int measuredWidth = this.f4986m.getMeasuredWidth();
        int measuredHeight = this.f4986m.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f4978d;
        rect.left = paddingLeft;
        rect.right = (i7 - i5) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i8 - i6) - getPaddingBottom();
        Rect rect2 = this.f4979e;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f4986m.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f4981h) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        measureChild(this.f4986m, i5, i6);
        int measuredWidth = this.f4986m.getMeasuredWidth();
        int measuredHeight = this.f4986m.getMeasuredHeight();
        int measuredState = this.f4986m.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i5, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i6, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.getSuperState());
        this.f4984k = oVar.f729e;
        this.f4985l = oVar.f;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f728d = this.f4986m.getId();
        int i5 = this.f4984k;
        if (i5 == -1) {
            i5 = this.f4980g;
        }
        oVar.f729e = i5;
        Parcelable parcelable = this.f4985l;
        if (parcelable != null) {
            oVar.f = parcelable;
        } else {
            this.f4986m.getAdapter();
        }
        return oVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i5, Bundle bundle) {
        this.f4995w.getClass();
        if (i5 != 8192 && i5 != 4096) {
            return super.performAccessibilityAction(i5, bundle);
        }
        q qVar = this.f4995w;
        qVar.getClass();
        if (i5 != 8192 && i5 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) qVar.f6170h;
        int currentItem = i5 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f4993u) {
            viewPager2.d(currentItem);
        }
        return true;
    }

    public void setAdapter(AbstractC0510A abstractC0510A) {
        AbstractC0510A adapter = this.f4986m.getAdapter();
        q qVar = this.f4995w;
        if (adapter != null) {
            adapter.f7050a.unregisterObserver((e) qVar.f6169g);
        } else {
            qVar.getClass();
        }
        e eVar = this.f4982i;
        if (adapter != null) {
            adapter.f7050a.unregisterObserver(eVar);
        }
        this.f4986m.setAdapter(abstractC0510A);
        this.f4980g = 0;
        b();
        q qVar2 = this.f4995w;
        qVar2.D();
        if (abstractC0510A != null) {
            abstractC0510A.f7050a.registerObserver((e) qVar2.f6169g);
        }
        if (abstractC0510A != null) {
            abstractC0510A.f7050a.registerObserver(eVar);
        }
    }

    public void setCurrentItem(int i5) {
        c(i5);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        super.setLayoutDirection(i5);
        this.f4995w.D();
    }

    public void setOffscreenPageLimit(int i5) {
        if (i5 < 1 && i5 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4994v = i5;
        this.f4986m.requestLayout();
    }

    public void setOrientation(int i5) {
        this.f4983j.b1(i5);
        this.f4995w.D();
    }

    public void setPageTransformer(l lVar) {
        if (lVar != null) {
            if (!this.f4992t) {
                this.f4991s = this.f4986m.getItemAnimator();
                this.f4992t = true;
            }
            this.f4986m.setItemAnimator(null);
        } else if (this.f4992t) {
            this.f4986m.setItemAnimator(this.f4991s);
            this.f4991s = null;
            this.f4992t = false;
        }
        this.f4990r.getClass();
        if (lVar == null) {
            return;
        }
        this.f4990r.getClass();
        this.f4990r.getClass();
    }

    public void setUserInputEnabled(boolean z4) {
        this.f4993u = z4;
        this.f4995w.D();
    }
}
