package k;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s1 extends P.b implements View.OnClickListener {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f7797B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f7798A;

    /* renamed from: k, reason: collision with root package name */
    public final int f7799k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7800l;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutInflater f7801m;
    public final SearchView n;

    /* renamed from: o, reason: collision with root package name */
    public final SearchableInfo f7802o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f7803p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f7804q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7805r;

    /* renamed from: s, reason: collision with root package name */
    public int f7806s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f7807t;

    /* renamed from: u, reason: collision with root package name */
    public int f7808u;

    /* renamed from: v, reason: collision with root package name */
    public int f7809v;

    /* renamed from: w, reason: collision with root package name */
    public int f7810w;

    /* renamed from: x, reason: collision with root package name */
    public int f7811x;

    /* renamed from: y, reason: collision with root package name */
    public int f7812y;

    /* renamed from: z, reason: collision with root package name */
    public int f7813z;

    public s1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) throws Resources.NotFoundException {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f2103e = true;
        this.f = null;
        this.f2102d = false;
        this.f2104g = -1;
        this.f2105h = new P.a(this);
        this.f2106i = new E0.i(1, this);
        this.f7800l = suggestionRowLayout;
        this.f7799k = suggestionRowLayout;
        this.f7801m = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f7806s = 1;
        this.f7808u = -1;
        this.f7809v = -1;
        this.f7810w = -1;
        this.f7811x = -1;
        this.f7812y = -1;
        this.f7813z = -1;
        this.f7798A = -16736050;
        this.n = searchView;
        this.f7802o = searchableInfo;
        this.f7805r = searchView.getSuggestionCommitIconResId();
        this.f7803p = context;
        this.f7804q = weakHashMap;
        TypedValue typedValue = new TypedValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{R.attr.colorPrimaryDark});
        this.f7798A = typedArrayObtainStyledAttributes.getColor(0, -16736050);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static String h(Cursor cursor, int i5) {
        if (i5 == -1) {
            return null;
        }
        try {
            return cursor.getString(i5);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    public static void i(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    @Override // P.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r24, android.database.Cursor r25) throws java.lang.NoSuchMethodException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s1.a(android.view.View, android.database.Cursor):void");
    }

    @Override // P.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f7808u = cursor.getColumnIndex("suggest_text_1");
                this.f7809v = cursor.getColumnIndex("suggest_text_2");
                this.f7810w = cursor.getColumnIndex("suggest_text_2_url");
                this.f7811x = cursor.getColumnIndex("suggest_icon_1");
                this.f7812y = cursor.getColumnIndex("suggest_icon_2");
                this.f7813z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // P.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f7802o;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // P.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f7801m.inflate(this.f7799k, viewGroup, false);
        viewInflate.setTag(new r1(viewInflate));
        ((ImageView) viewInflate.findViewById(com.wssyncmldm.R.id.edit_query)).setImageResource(this.f7805r);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f7803p.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s1.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f7803p.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // P.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i5, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f7801m.inflate(this.f7800l, viewGroup, false);
            if (viewInflate != null) {
                ((r1) viewInflate.getTag()).f7790a.setText(e5.toString());
            }
            return viewInflate;
        }
    }

    @Override // P.b, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i5, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewD = this.d(viewGroup);
            ((r1) viewD.getTag()).f7790a.setText(e5.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.n.q((CharSequence) tag);
        }
    }
}
