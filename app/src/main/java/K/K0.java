package k;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class K0 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f7525a;

    public K0(SearchView searchView) {
        this.f7525a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        SearchView searchView = this.f7525a;
        View view2 = searchView.f3331A;
        if (view2.getWidth() > 1) {
            Rect rect = new Rect();
            boolean zA = M1.a(searchView);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3360s;
            if (searchAutoComplete.getDropDownBackground() != null) {
                searchAutoComplete.getDropDownBackground().getPadding(rect);
            }
            searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : 0 - rect.left);
            searchAutoComplete.setDropDownWidth(view2.getWidth() + rect.left + rect.right);
            if (searchAutoComplete.isPopupShowing()) {
                searchAutoComplete.showDropDown();
            }
        }
    }
}
