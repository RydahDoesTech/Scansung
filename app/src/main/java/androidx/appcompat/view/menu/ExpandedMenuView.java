package androidx.appcompat.view.menu;

import D3.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j.C0494k;
import j.InterfaceC0491h;
import j.InterfaceC0506w;
import j.MenuC0492i;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0491h, InterfaceC0506w, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3207e = {R.attr.background, R.attr.divider};

    /* renamed from: d, reason: collision with root package name */
    public MenuC0492i f3208d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c cVarL = c.l(context, attributeSet, f3207e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) cVarL.f;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(cVarL.g(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(cVarL.g(1));
        }
        cVarL.m();
    }

    @Override // j.InterfaceC0506w
    public final void a(MenuC0492i menuC0492i) {
        this.f3208d = menuC0492i;
    }

    @Override // j.InterfaceC0491h
    public final boolean b(C0494k c0494k) {
        return this.f3208d.q(c0494k, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        b((C0494k) getAdapter().getItem(i5));
    }
}
