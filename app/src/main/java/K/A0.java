package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import j.C0489f;
import j.C0494k;
import j.MenuC0492i;

/* loaded from: classes.dex */
public final class A0 extends C0637l0 {

    /* renamed from: p, reason: collision with root package name */
    public final int f7469p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7470q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0664y0 f7471r;

    /* renamed from: s, reason: collision with root package name */
    public C0494k f7472s;

    public A0(Context context, boolean z4) {
        super(context, z4);
        if (1 == AbstractC0666z0.a(context.getResources().getConfiguration())) {
            this.f7469p = 21;
            this.f7470q = 22;
        } else {
            this.f7469p = 22;
            this.f7470q = 21;
        }
    }

    @Override // k.C0637l0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0489f c0489f;
        int headersCount;
        int iPointToPosition;
        int i5;
        if (this.f7471r != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0489f = (C0489f) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0489f = (C0489f) adapter;
                headersCount = 0;
            }
            C0494k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = iPointToPosition - headersCount) < 0 || i5 >= c0489f.getCount()) ? null : c0489f.getItem(i5);
            C0494k c0494k = this.f7472s;
            if (c0494k != item) {
                MenuC0492i menuC0492i = c0489f.f6947d;
                if (c0494k != null) {
                    this.f7471r.k(menuC0492i, c0494k);
                }
                this.f7472s = item;
                if (item != null) {
                    this.f7471r.a(menuC0492i, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i5 == this.f7469p) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i5 != this.f7470q) {
            return super.onKeyDown(i5, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0489f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0489f) adapter).f6947d.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0664y0 interfaceC0664y0) {
        this.f7471r = interfaceC0664y0;
    }

    @Override // k.C0637l0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
