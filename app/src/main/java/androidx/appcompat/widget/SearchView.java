package androidx.appcompat.widget;

import J.H;
import J.M;
import J.P;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import c.AbstractC0220a;
import com.idm.core.wbxml.IDMWbxmlConstants;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import i.InterfaceC0477c;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC0649q0;
import k.C0596K;
import k.C0644o;
import k.C0650r0;
import k.H0;
import k.I0;
import k.J0;
import k.J1;
import k.K0;
import k.L0;
import k.M0;
import k.N0;
import k.O0;
import k.P0;
import k.R0;
import k.s1;
import s0.AbstractC0823a;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0649q0 implements InterfaceC0477c {
    public static final /* synthetic */ int o0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final View f3331A;

    /* renamed from: B, reason: collision with root package name */
    public R0 f3332B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f3333C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f3334D;
    public final int[] E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f3335F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f3336G;

    /* renamed from: H, reason: collision with root package name */
    public final Drawable f3337H;

    /* renamed from: I, reason: collision with root package name */
    public final int f3338I;

    /* renamed from: J, reason: collision with root package name */
    public final int f3339J;

    /* renamed from: K, reason: collision with root package name */
    public final Intent f3340K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f3341L;

    /* renamed from: M, reason: collision with root package name */
    public final CharSequence f3342M;

    /* renamed from: N, reason: collision with root package name */
    public View.OnFocusChangeListener f3343N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnClickListener f3344O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3345Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3346R;

    /* renamed from: T, reason: collision with root package name */
    public P.b f3347T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3348U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f3349V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3350W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3351a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f3352b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3353c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f3354d0;

    /* renamed from: e0, reason: collision with root package name */
    public CharSequence f3355e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3356f0;
    public int g0;

    /* renamed from: h0, reason: collision with root package name */
    public SearchableInfo f3357h0;

    /* renamed from: i0, reason: collision with root package name */
    public Bundle f3358i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InputMethodManager f3359j0;
    public final Context k0;
    public final I0 l0;
    public final I0 m0;
    public final WeakHashMap n0;

    /* renamed from: s, reason: collision with root package name */
    public final SearchAutoComplete f3360s;

    /* renamed from: t, reason: collision with root package name */
    public final View f3361t;

    /* renamed from: u, reason: collision with root package name */
    public final View f3362u;

    /* renamed from: v, reason: collision with root package name */
    public final View f3363v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f3364w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f3365x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f3366y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f3367z;

    public static class SearchAutoComplete extends C0644o {

        /* renamed from: g, reason: collision with root package name */
        public int f3368g;

        /* renamed from: h, reason: collision with root package name */
        public SearchView f3369h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f3370i;

        /* renamed from: j, reason: collision with root package name */
        public final d f3371j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3372k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3371j = new d(this);
            this.f3368g = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            if (i5 >= 960 && i6 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i5 >= 600) {
                return IDMWbxmlConstants.WBXML_EXT_0;
            }
            if (i5 < 640 || i6 < 480) {
                return 160;
            }
            return IDMWbxmlConstants.WBXML_EXT_0;
        }

        public final void a() {
            c.b(this, 1);
            if (getFilter() == null || !enoughToFilter()) {
                return;
            }
            showDropDown();
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3368g <= 0 || super.enoughToFilter();
        }

        @Override // k.C0644o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3370i) {
                d dVar = this.f3371j;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i5, Rect rect) {
            super.onFocusChanged(z4, i5, rect);
            SearchView searchView = this.f3369h;
            searchView.z(searchView.f3346R);
            searchView.post(searchView.l0);
            SearchAutoComplete searchAutoComplete = searchView.f3360s;
            if (searchAutoComplete.hasFocus()) {
                c.a(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f3369h.hasFocus() && getVisibility() == 0) {
                this.f3370i = true;
                Context context = getContext();
                int i5 = SearchView.o0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f3371j;
            if (!z4) {
                this.f3370i = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3370i = true;
                    return;
                }
                this.f3370i = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setNotCallShowSoftInput(boolean z4) {
            this.f3372k = z4;
        }

        public void setSearchView(SearchView searchView) {
            this.f3369h = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i5) {
            super.setThreshold(i5);
            this.f3368g = i5;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.sesl_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.sesl_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f3360s;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z4) {
        int i5 = 8;
        if (this.f3353c0 && !this.f3346R && z4) {
            this.f3365x.setVisibility(8);
            i5 = 0;
        }
        Drawable drawable = this.f3337H;
        ImageView imageView = this.f3367z;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(i5);
    }

    @Override // i.InterfaceC0477c
    public final void c() {
        if (this.f3356f0) {
            return;
        }
        this.f3356f0 = true;
        SearchAutoComplete searchAutoComplete = this.f3360s;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.g0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3351a0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3360s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3351a0 = false;
    }

    @Override // i.InterfaceC0477c
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f3360s;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f3355e0 = "";
        clearFocus();
        z(true);
        searchAutoComplete.setImeOptions(this.g0);
        this.f3356f0 = false;
    }

    public int getImeOptions() {
        return this.f3360s.getImeOptions();
    }

    public int getInputType() {
        return this.f3360s.getInputType();
    }

    public int getMaxWidth() {
        return this.f3352b0;
    }

    public CharSequence getQuery() {
        return this.f3360s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3349V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3357h0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3342M : getContext().getText(this.f3357h0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3339J;
    }

    public int getSuggestionRowLayout() {
        return this.f3338I;
    }

    public P.b getSuggestionsAdapter() {
        return this.f3347T;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3355e0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3358i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3357h0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3358i0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        SearchAutoComplete searchAutoComplete = this.f3360s;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f3345Q) {
                clearFocus();
                z(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.announceForAccessibility(getResources().getString(R.string.sesl_searchview_description_clear_field));
        if (AbstractC0823a.b(this.f3359j0) != 0) {
            searchAutoComplete.setImeVisibility(false);
        } else {
            searchAutoComplete.setImeVisibility(true);
        }
    }

    public final void o(int i5) {
        int position;
        String strH;
        Cursor cursor = this.f3347T.f;
        if (cursor != null && cursor.moveToPosition(i5)) {
            Intent intentL = null;
            try {
                int i6 = s1.f7797B;
                String strH2 = s1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f3357h0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = s1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f3357h0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = s1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentL = l(strH2, strH3 == null ? null : Uri.parse(strH3), s1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), s1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException e6) {
                    Log.e("SearchView", "Failed launch activity: " + intentL, e6);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3360s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.l0);
        post(this.m0);
        super.onDetachedFromWindow();
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        if (z4) {
            int[] iArr = this.E;
            SearchAutoComplete searchAutoComplete = this.f3360s;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3335F;
            getLocationInWindow(iArr2);
            int i9 = iArr[1] - iArr2[1];
            int i10 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i10;
            int height = searchAutoComplete.getHeight() + i9;
            Rect rect = this.f3333C;
            rect.set(i10, i9, width, height);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = i8 - i6;
            Rect rect2 = this.f3334D;
            rect2.set(i11, 0, i12, i13);
            R0 r02 = this.f3332B;
            if (r02 == null) {
                R0 r03 = new R0(rect2, rect, searchAutoComplete);
                this.f3332B = r03;
                setTouchDelegate(r03);
            } else {
                r02.f7540b.set(rect2);
                Rect rect3 = r02.f7542d;
                rect3.set(rect2);
                int i14 = -r02.f7543e;
                rect3.inset(i14, i14);
                r02.f7541c.set(rect);
            }
        }
    }

    @Override // k.AbstractC0649q0, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        if (this.f3346R) {
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            int i8 = this.f3352b0;
            if (i8 > 0) {
                size = Math.min(i8, size);
            }
        } else if (mode == 0) {
            size = this.f3352b0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i7 = this.f3352b0) > 0) {
            size = Math.min(i7, size);
        }
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof P0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        P0 p0 = (P0) parcelable;
        super.onRestoreInstanceState(p0.f2363d);
        z(p0.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        P0 p0 = new P0(super.onSaveInstanceState());
        p0.f = this.f3346R;
        return p0;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (AbstractC0823a.b(this.f3359j0) != 0) {
            return;
        }
        post(this.l0);
    }

    public final void p(int i5) {
        Editable text = this.f3360s.getText();
        Cursor cursor = this.f3347T.f;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i5)) {
            setQuery(text);
            return;
        }
        String strC = this.f3347T.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void r() {
        z(false);
        SearchAutoComplete searchAutoComplete = this.f3360s;
        searchAutoComplete.requestFocus();
        if (AbstractC0823a.b(this.f3359j0) != 0) {
            searchAutoComplete.setImeVisibility(false);
        } else {
            searchAutoComplete.setImeVisibility(true);
        }
        View.OnClickListener onClickListener = this.f3344O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i5, Rect rect) {
        if (this.f3351a0 || !isFocusable()) {
            return false;
        }
        if (this.f3346R) {
            return super.requestFocus(i5, rect);
        }
        boolean zRequestFocus = this.f3360s.requestFocus(i5, rect);
        if (zRequestFocus) {
            z(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f3360s;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3357h0 != null) {
            getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3358i0 = bundle;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        View view = this.f3362u;
        if (view != null) {
            WeakHashMap weakHashMap = P.f1421a;
            view.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) throws Resources.NotFoundException {
        View view = this.f3362u;
        if (view != null) {
            Drawable drawable = getContext().getResources().getDrawable(i5);
            WeakHashMap weakHashMap = P.f1421a;
            view.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        View view = this.f3362u;
        if (view != null) {
            WeakHashMap weakHashMap = P.f1421a;
            H.s(view, f);
        }
    }

    public void setIconified(boolean z4) {
        if (z4) {
            n();
        } else {
            r();
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f3345Q == z4) {
            return;
        }
        this.f3345Q = z4;
        z(z4);
        w();
    }

    public void setImeOptions(int i5) {
        this.f3360s.setImeOptions(i5);
    }

    public void setInputType(int i5) {
        this.f3360s.setInputType(i5);
    }

    public void setMaxWidth(int i5) {
        this.f3352b0 = i5;
        requestLayout();
    }

    public void setOnCloseListener(M0 m0) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3343N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(N0 n0) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3344O = onClickListener;
    }

    public void setOnSuggestionListener(O0 o02) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3349V = charSequence;
        w();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f3350W = z4;
        P.b bVar = this.f3347T;
        if (bVar instanceof s1) {
            ((s1) bVar).f7806s = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3357h0 = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            int suggestThreshold = searchableInfo.getSuggestThreshold();
            SearchAutoComplete searchAutoComplete = this.f3360s;
            searchAutoComplete.setThreshold(suggestThreshold);
            searchAutoComplete.setImeOptions(this.f3357h0.getImeOptions());
            int inputType = this.f3357h0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= KnoxContainerManager.TZ_COMMON_COMMUNICATION_ERROR;
                if (this.f3357h0.getSuggestAuthority() != null) {
                    inputType |= NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID;
                }
            }
            searchAutoComplete.setInputType(inputType);
            P.b bVar = this.f3347T;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f3357h0.getSuggestAuthority() != null) {
                s1 s1Var = new s1(getContext(), this, this.f3357h0, this.n0);
                this.f3347T = s1Var;
                searchAutoComplete.setAdapter(s1Var);
                ((s1) this.f3347T).f7806s = this.f3350W ? 2 : 1;
            }
            w();
        }
        SearchableInfo searchableInfo2 = this.f3357h0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3357h0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3340K;
            } else if (this.f3357h0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3341L;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID) != null;
            }
        }
        this.f3353c0 = z4;
        z(this.f3346R);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f3348U = z4;
        z(this.f3346R);
    }

    public void setSuggestionsAdapter(P.b bVar) {
        this.f3347T = bVar;
        this.f3360s.setAdapter(bVar);
    }

    public final void t() throws Resources.NotFoundException {
        float f = getContext().getResources().getConfiguration().fontScale;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.sesl_search_view_search_text_size);
        SearchAutoComplete searchAutoComplete = this.f3360s;
        if (f > 1.3f) {
            searchAutoComplete.setTextSize(0, (dimensionPixelSize / f) * 1.3f);
        } else {
            searchAutoComplete.setTextSize(0, dimensionPixelSize);
        }
    }

    public final void u() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f3360s.getText());
        int i5 = !zIsEmpty ? 0 : 8;
        ImageView imageView = this.f3366y;
        imageView.setVisibility(i5);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void v() {
        int[] iArr = this.f3360s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3362u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3363v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void w() {
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        this.f3360s.setHint(queryHint);
    }

    public final void x() {
        this.f3363v.setVisibility(((this.f3348U || this.f3353c0) && !this.f3346R && (this.f3365x.getVisibility() == 0 || this.f3367z.getVisibility() == 0)) ? 0 : 8);
    }

    public final void y(boolean z4) {
        boolean z5 = this.f3348U;
        this.f3365x.setVisibility((!z5 || !(z5 || this.f3353c0) || this.f3346R || !hasFocus() || (!z4 && this.f3353c0)) ? 8 : 0);
    }

    public final void z(boolean z4) {
        this.f3346R = z4;
        int i5 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f3360s.getText());
        this.f3364w.setVisibility(i5);
        y(!zIsEmpty);
        this.f3361t.setVisibility(z4 ? 8 : 0);
        this.f3336G.setVisibility(8);
        u();
        A(zIsEmpty);
        x();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i5) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        int i6;
        int[] iArr;
        String str;
        int i7;
        int i8;
        int i9;
        super(context, attributeSet, i5);
        this.f3333C = new Rect();
        this.f3334D = new Rect();
        this.E = new int[2];
        this.f3335F = new int[2];
        this.l0 = new I0(this, 0);
        int i10 = 1;
        this.m0 = new I0(this, i10);
        this.n0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        L0 l0 = new L0(this);
        C0596K c0596k = new C0596K(i10, this);
        C0650r0 c0650r0 = new C0650r0(1, this);
        H0 h02 = new H0(this);
        int[] iArr2 = AbstractC0220a.f5131v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        D3.c cVar = new D3.c(context, typedArrayObtainStyledAttributes);
        WeakHashMap weakHashMap = P.f1421a;
        M.d(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i5, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.sesl_search_view), (ViewGroup) this, true);
        this.k0 = context;
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3360s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3361t = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f3362u = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f3363v = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f3364w = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3365x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f3366y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f3367z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_more_btn);
        ImageView imageView6 = (ImageView) findViewById(R.id.search_back_btn);
        ImageView imageView7 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f3336G = imageView7;
        viewFindViewById.setBackground(cVar.g(20));
        viewFindViewById2.setBackground(cVar.g(25));
        typedArrayObtainStyledAttributes.getResourceId(23, 0);
        imageView.setImageDrawable(cVar.g(23));
        imageView2.setImageDrawable(cVar.g(15));
        imageView3.setImageDrawable(cVar.g(12));
        imageView7.setImageDrawable(cVar.g(23));
        Drawable drawableG = cVar.g(28);
        this.f3337H = drawableG;
        cVar.g(29);
        imageView4.setImageDrawable(drawableG);
        cVar.g(22);
        J1.a(imageView, imageView.getContentDescription());
        J1.a(imageView3, imageView3.getContentDescription());
        J1.a(imageView2, imageView2.getContentDescription());
        J1.a(imageView4, imageView4.getContentDescription());
        J1.a(imageView5, imageView5.getContentDescription());
        J1.a(imageView6, imageView6.getContentDescription());
        this.f3338I = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.sesl_search_dropdown_item_icons_2line);
        this.f3339J = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(h02);
        searchAutoComplete.setOnEditorActionListener(l0);
        searchAutoComplete.setOnItemClickListener(c0596k);
        searchAutoComplete.setOnItemSelectedListener(c0650r0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new J0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3342M = typedArrayObtainStyledAttributes.getText(14);
        this.f3349V = typedArrayObtainStyledAttributes.getText(21);
        int i11 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i11 != -1) {
            setImeOptions(i11);
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i12 != -1) {
            setInputType(i12);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        imageView7.setImageDrawable(cVar.g(23));
        imageView.setImageDrawable(cVar.g(23));
        Resources resources = context.getResources();
        searchAutoComplete.setTypeface(Typeface.create(Typeface.create("sec", 0), 600, false));
        int i13 = viewFindViewById.getBackground() != null ? 1 : 0;
        if (J2.b.I(context)) {
            i6 = 1;
            iArr = new int[]{1, 2};
        } else {
            i6 = 1;
            iArr = new int[]{3, 4};
        }
        int i14 = iArr[i13 ^ i6];
        List<ImageView> listAsList = Arrays.asList(imageView2, imageView3, imageView4, imageView5, imageView);
        if (i14 != 0) {
            if (i14 == i6) {
                str = "LIGHT_WITH_BACKGROUND";
            } else if (i14 == 2) {
                str = "LIGHT_WITHOUT_BACKGROUND";
            } else if (i14 != 3) {
                str = i14 != 4 ? "null" : "DARK_WITHOUT_BACKGROUND";
            } else {
                str = "DARK_WITH_BACKGROUND";
            }
            Log.d("SearchView", "[SeslSearchViewStyle] apply ".concat(str));
            if (i14 == 1) {
                i7 = R.color.sesl_search_view_background_text_color_light;
            } else if (i14 == 2) {
                i7 = R.color.sesl_search_view_text_color;
            } else if (i14 == 3) {
                i7 = R.color.sesl_search_view_background_text_color_dark;
            } else {
                if (i14 != 4) {
                    throw null;
                }
                i7 = R.color.sesl_search_view_text_color_dark;
            }
            searchAutoComplete.setTextColor(resources.getColor(i7));
            if (i14 == 1) {
                i8 = R.color.sesl_search_view_background_hint_text_color_light;
            } else if (i14 == 2) {
                i8 = R.color.sesl_search_view_hint_text_color;
            } else if (i14 == 3) {
                i8 = R.color.sesl_search_view_background_hint_text_color_dark;
            } else {
                if (i14 != 4) {
                    throw null;
                }
                i8 = R.color.sesl_search_view_hint_text_color_dark;
            }
            searchAutoComplete.setHintTextColor(resources.getColor(i8));
            for (ImageView imageView8 : listAsList) {
                if (i14 == 1) {
                    i9 = R.color.sesl_search_view_background_icon_color_light;
                } else if (i14 == 2) {
                    i9 = R.color.sesl_search_view_icon_color;
                } else if (i14 == 3) {
                    i9 = R.color.sesl_search_view_background_icon_color_dark;
                } else {
                    if (i14 != 4) {
                        throw null;
                    }
                    i9 = R.color.sesl_search_view_icon_color_dark;
                }
                imageView8.setColorFilter(resources.getColor(i9));
            }
            cVar.m();
            Intent intent = new Intent("android.speech.action.WEB_SEARCH");
            this.f3340K = intent;
            intent.addFlags(268435456);
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
            Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            this.f3341L = intent2;
            intent2.addFlags(268435456);
            new Intent("samsung.honeyboard.honeyvoice.action.RECOGNIZE_SPEECH").addFlags(268435456);
            View viewFindViewById3 = findViewById(this.f3360s.getDropDownAnchor());
            this.f3331A = viewFindViewById3;
            if (viewFindViewById3 != null) {
                viewFindViewById3.addOnLayoutChangeListener(new K0(this));
            }
            z(this.f3345Q);
            w();
            this.f3359j0 = (InputMethodManager) getContext().getSystemService("input_method");
            Method methodR = J2.b.r(TextView.class, "hidden_SEM_AUTOFILL_ID", new Class[0]);
            Object objE = methodR != null ? J2.b.E(null, methodR, new Object[0]) : null;
            int iIntValue = objE instanceof Integer ? ((Integer) objE).intValue() : 0;
            if (iIntValue != 0) {
                SearchAutoComplete searchAutoComplete2 = this.f3360s;
                Method methodR2 = J2.b.r(TextView.class, "hidden_semSetActionModeMenuItemEnabled", Integer.TYPE, Boolean.TYPE);
                if (methodR2 != null) {
                    J2.b.E(searchAutoComplete2, methodR2, Integer.valueOf(iIntValue), Boolean.FALSE);
                }
            }
            t();
            return;
        }
        throw null;
    }
}
