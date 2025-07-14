package com.google.android.material.chip;

import E1.s;
import E1.u;
import E1.v;
import E1.x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.chip.SeslExpandableContainer;
import com.wssyncmldm.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes.dex */
public class SeslExpandableContainer extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f5844o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final HorizontalScrollView f5845d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f5846e;
    public final x f;

    /* renamed from: g, reason: collision with root package name */
    public final View f5847g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5848h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5849i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5850j;

    /* renamed from: k, reason: collision with root package name */
    public int f5851k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5852l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5853m;
    public final boolean n;

    public SeslExpandableContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1, -1);
        this.f5848h = false;
        this.f5850j = true;
        this.f5851k = 0;
        this.f5853m = true;
        boolean z4 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.n = z4;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sesl_expandable_container, (ViewGroup) null);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) viewInflate.findViewById(R.id.sesl_scroll_view);
        this.f5845d = horizontalScrollView;
        horizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: E1.t
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i5, int i6, int i7, int i8) {
                int i9 = SeslExpandableContainer.f5844o;
                this.f606a.b();
            }
        });
        this.f5846e = (LinearLayout) viewInflate.findViewById(R.id.sesl_scrolling_chips_container);
        this.f5847g = viewInflate.findViewById(R.id.sesl_padding_view);
        addView(viewInflate);
        int iGenerateViewId = View.generateViewId();
        this.f5849i = iGenerateViewId;
        x xVar = new x(context);
        this.f = xVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(R.dimen.expansion_button_margin_top), 0, 0);
        xVar.setLayoutParams(layoutParams);
        xVar.setBackground(context.getDrawable(R.drawable.sesl_expansion_button_background));
        xVar.setImageDrawable(context.getDrawable(R.drawable.sesl_expansion_button_foreground));
        xVar.setAutomaticDisappear(true);
        xVar.setExpanded(false);
        xVar.setFloated(true);
        xVar.setVisibility(8);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setId(iGenerateViewId);
        if (z4) {
            relativeLayout.setGravity(3);
        } else {
            relativeLayout.setGravity(5);
        }
        addView(relativeLayout);
        relativeLayout.addView(xVar);
    }

    public final void a() {
        setLayoutTransition(null);
        boolean z4 = this.f5848h;
        View view = this.f5847g;
        boolean z5 = this.n;
        x xVar = this.f;
        HorizontalScrollView horizontalScrollView = this.f5845d;
        LinearLayout linearLayout = this.f5846e;
        int i5 = 1;
        if (z4) {
            if (linearLayout.getChildCount() > 0) {
                xVar.setAutomaticDisappear(false);
                this.f5851k = horizontalScrollView.getScrollX();
                int childCount = linearLayout.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i6 = 0; i6 < linearLayout.getChildCount(); i6++) {
                    viewArr[i6] = linearLayout.getChildAt(i6);
                }
                if (z5) {
                    Collections.reverse(Arrays.asList(viewArr));
                }
                int height = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    View view2 = viewArr[i7];
                    if (!this.f5850j || view2.getId() != view.getId()) {
                        linearLayout.removeView(view2);
                        addView(view2, i5);
                        height += view2.getHeight();
                        i5++;
                    }
                }
                horizontalScrollView.setVisibility(8);
                if (xVar.getVisibility() == 0 || height <= 0) {
                    return;
                }
                xVar.setVisibility(0);
                return;
            }
            return;
        }
        if (getChildCount() > 2) {
            xVar.setAutomaticDisappear(true);
            horizontalScrollView.setVisibility(0);
            int childCount2 = getChildCount();
            View[] viewArr2 = new View[childCount2];
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                viewArr2[i8] = getChildAt(i8);
            }
            if (z5) {
                Collections.reverse(Arrays.asList(viewArr2));
            }
            int i9 = 0;
            for (int i10 = 0; i10 < childCount2; i10++) {
                View view3 = viewArr2[i10];
                if (!this.f5852l && (view3 instanceof SeslChipGroup)) {
                    ((SeslChipGroup) view3).setMaxChipWidth(getWidth());
                    this.f5852l = true;
                }
                int id = view3.getId();
                if (id != horizontalScrollView.getId() && id != this.f5849i && id != view.getId()) {
                    removeView(view3);
                    linearLayout.addView(view3, i9);
                    i9++;
                }
            }
            horizontalScrollView.scrollTo(this.f5851k, 0);
            b();
        }
    }

    public final void b() {
        boolean z4;
        int scrollContentsWidth = getScrollContentsWidth();
        int width = getWidth() + 10;
        View view = this.f5847g;
        int width2 = view.getWidth();
        boolean z5 = this.f5850j;
        x xVar = this.f;
        if (z5) {
            if ((view.getVisibility() == 0 && scrollContentsWidth - width2 > width) || (view.getVisibility() == 8 && scrollContentsWidth > width)) {
                if (xVar.getVisibility() != 0) {
                    xVar.setVisibility(0);
                }
                xVar.setOnClickListener(new u(0, this));
            } else if (xVar.getVisibility() == 0) {
                xVar.setVisibility(4);
            }
        } else if (scrollContentsWidth > width) {
            if (xVar.getVisibility() != 0) {
                xVar.setVisibility(0);
            }
            xVar.setOnClickListener(new u(0, this));
        } else if (xVar.getVisibility() == 0) {
            xVar.setVisibility(4);
        }
        if (this.f5853m) {
            HorizontalScrollView horizontalScrollView = this.f5845d;
            if (horizontalScrollView.getVisibility() == 0) {
                if (!z5 || (((z4 = this.n) && horizontalScrollView.getScrollX() > getPaddingView().getWidth() / 2) || (!z4 && horizontalScrollView.getScrollX() < getScrollContentsWidth() - getWidth()))) {
                    xVar.setFloated(true);
                } else {
                    xVar.setFloated(false);
                }
            }
        }
    }

    public x getExpansionButton() {
        return this.f;
    }

    public View getPaddingView() {
        return this.f5847g;
    }

    public int getScrollContentsWidth() {
        int i5 = 0;
        if (this.f5848h) {
            return 0;
        }
        int totalWidth = 0;
        while (true) {
            LinearLayout linearLayout = this.f5846e;
            if (i5 >= linearLayout.getChildCount()) {
                return totalWidth;
            }
            View childAt = linearLayout.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                totalWidth = (childAt instanceof SeslChipGroup ? ((SeslChipGroup) childAt).getTotalWidth() : childAt.getWidth()) + totalWidth;
            }
            i5++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        a();
    }

    public void setExpanded(boolean z4) {
        this.f5848h = z4;
        a();
        post(new s(this, 0));
        Log.i("SeslExpandableContainer", "expansion state: " + z4);
    }

    public void setExpansionBackGroundImage(Drawable drawable) {
        this.f.setBackground(drawable);
        Log.i("SeslExpandableContainer", "expansion button background changed");
    }

    public void setExpansionImageDrawable(Drawable drawable) {
        this.f.setImageDrawable(drawable);
        Log.i("SeslExpandableContainer", "expansion button image changed");
    }

    public void setOnExpansionButtonClickedListener(v vVar) {
    }
}
