package e;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401d extends ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f6543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0404g f6544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401d(C0404g c0404g, ContextThemeWrapper contextThemeWrapper, int i5, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i5, R.id.text1, charSequenceArr);
        this.f6544e = c0404g;
        this.f6543d = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i5, view, viewGroup);
        boolean[] zArr = this.f6544e.f6564r;
        if (zArr != null && zArr[i5]) {
            this.f6543d.setItemChecked(i5, true);
        }
        return view2;
    }
}
