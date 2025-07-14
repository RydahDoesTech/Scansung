package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f3524d;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f3524d = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f3524d;
        if (searchAutoComplete.f3372k || !searchAutoComplete.f3370i) {
            return;
        }
        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
        searchAutoComplete.f3370i = false;
    }
}
