package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.InterfaceC0506w;
import j.MenuC0492i;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0506w {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // j.InterfaceC0506w
    public final void a(MenuC0492i menuC0492i) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
