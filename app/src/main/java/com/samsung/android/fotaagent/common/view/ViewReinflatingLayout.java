package com.samsung.android.fotaagent.common.view;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ViewReinflatingLayout extends FrameLayout {
    private final int configChanges;
    private final int layout;
    protected Configuration oldConfig;

    public ViewReinflatingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.configChanges, R.attr.layout}, 0, 0);
        try {
            this.configChanges = typedArrayObtainStyledAttributes.getInt(0, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.layout = resourceId;
            typedArrayObtainStyledAttributes.recycle();
            View.inflate(getContext(), resourceId, this);
            this.oldConfig = new Configuration(getResources().getConfiguration());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((configuration.diff(this.oldConfig) & this.configChanges) != 0) {
            removeAllViews();
            View.inflate(getContext(), this.layout, this);
        }
        this.oldConfig = new Configuration(configuration);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ViewReinflatingLayoutResource can host only one direct child");
        }
        super.addView(view, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("ViewReinflatingLayoutResource can host only one direct child");
    }
}
