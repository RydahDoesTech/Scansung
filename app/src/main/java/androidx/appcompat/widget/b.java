package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f3523d;

    public b(SearchView searchView) {
        this.f3523d = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        InputMethodManager inputMethodManager;
        SearchView searchView = this.f3523d;
        if (searchView.k0.getPackageManager().hasSystemFeature("com.sec.feature.folder_type") && (inputMethodManager = (InputMethodManager) searchView.getContext().getSystemService("input_method")) != null && i5 == 23) {
            inputMethodManager.viewClicked(view);
            inputMethodManager.showSoftInput(view, 1);
        }
        if (searchView.f3357h0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3360s;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || (i5 != 66 && i5 != 160)) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f3357h0 != null && searchView.f3347T != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i5 == 66 || i5 == 84 || i5 == 61 || i5 == 160) {
                searchView.o(searchAutoComplete.getListSelection());
                return true;
            }
            if (i5 == 21 || i5 == 22) {
                searchAutoComplete.setSelection(i5 == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
                return true;
            }
            if (i5 == 19) {
                searchAutoComplete.getListSelection();
            }
        }
        return false;
    }
}
