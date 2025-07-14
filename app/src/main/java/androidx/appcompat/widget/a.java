package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f3522d;

    public a(SearchView searchView) {
        this.f3522d = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f3522d;
        if (view == searchView.f3364w) {
            searchView.r();
            return;
        }
        if (view == searchView.f3366y) {
            searchView.n();
            return;
        }
        if (view == searchView.f3365x) {
            searchView.s();
            return;
        }
        if (view != searchView.f3367z) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3360s;
            if (view == searchAutoComplete) {
                c.a(searchAutoComplete);
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f3357h0;
        if (searchableInfo == null) {
            return;
        }
        try {
            boolean voiceSearchLaunchWebSearch = searchableInfo.getVoiceSearchLaunchWebSearch();
            Context context = searchView.k0;
            if (!voiceSearchLaunchWebSearch) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    context.startActivity(searchView.m(searchView.f3341L, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f3340K);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                context.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
