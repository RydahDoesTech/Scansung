package k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class H0 implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f7499d;

    public H0(SearchView searchView) {
        this.f7499d = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        SearchView searchView = this.f7499d;
        Editable text = searchView.f3360s.getText();
        searchView.f3355e0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.y(!zIsEmpty);
        searchView.A(zIsEmpty);
        searchView.u();
        searchView.x();
        if (TextUtils.equals(charSequence, searchView.f3354d0)) {
            return;
        }
        searchView.f3354d0 = charSequence.toString();
    }
}
