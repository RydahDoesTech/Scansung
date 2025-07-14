package androidx.preference;

import J.P;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.idm.fotaagent.IDMApplication;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f4579A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f4580B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f4581C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f4582D;
    public final boolean E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f4583F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f4584G;

    /* renamed from: H, reason: collision with root package name */
    public int f4585H;

    /* renamed from: I, reason: collision with root package name */
    public int f4586I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f4587J;

    /* renamed from: K, reason: collision with root package name */
    public D f4588K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f4589L;

    /* renamed from: M, reason: collision with root package name */
    public PreferenceGroup f4590M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f4591N;

    /* renamed from: O, reason: collision with root package name */
    public p f4592O;

    /* renamed from: Q, reason: collision with root package name */
    public q f4593Q;

    /* renamed from: R, reason: collision with root package name */
    public final ViewOnClickListenerC0193l f4594R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4595T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4596U;

    /* renamed from: V, reason: collision with root package name */
    public int f4597V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4598W;

    /* renamed from: X, reason: collision with root package name */
    public final ColorStateList f4599X;

    /* renamed from: Y, reason: collision with root package name */
    public View f4600Y;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4601d;

    /* renamed from: e, reason: collision with root package name */
    public F f4602e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4603g;

    /* renamed from: h, reason: collision with root package name */
    public n f4604h;

    /* renamed from: i, reason: collision with root package name */
    public o f4605i;

    /* renamed from: j, reason: collision with root package name */
    public int f4606j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4607k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4608l;

    /* renamed from: m, reason: collision with root package name */
    public int f4609m;
    public Drawable n;

    /* renamed from: o, reason: collision with root package name */
    public final String f4610o;

    /* renamed from: p, reason: collision with root package name */
    public Intent f4611p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4612q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f4613r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4614s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f4615t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4616u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4617v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4618w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4619x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4620y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4621z;

    public Preference(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f4606j = Integer.MAX_VALUE;
        this.f4614s = true;
        this.f4615t = true;
        this.f4616u = true;
        this.f4619x = true;
        this.f4620y = true;
        this.f4621z = true;
        this.f4579A = true;
        this.f4580B = true;
        this.f4582D = true;
        this.f4584G = true;
        this.f4585H = R.layout.sesl_preference;
        this.f4594R = new ViewOnClickListenerC0193l(this, 0);
        this.f4595T = false;
        this.f4596U = false;
        this.f4597V = 0;
        this.f4598W = false;
        this.f4601d = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f, i5, i6);
        this.f4609m = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(27);
        this.f4610o = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        this.f4607k = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(34);
        this.f4608l = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f4606j = typedArrayObtainStyledAttributes.getInt(29, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f4612q = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f4585H = typedArrayObtainStyledAttributes.getResourceId(28, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f4586I = typedArrayObtainStyledAttributes.getResourceId(36, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f4587J = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, false));
        this.f4614s = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f4615t = z4;
        this.f4616u = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f4617v = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f4579A = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z4));
        this.f4580B = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z4));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f4618w = q(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f4618w = q(typedArrayObtainStyledAttributes, 11);
        }
        this.f4584G = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(33);
        this.f4581C = zHasValue;
        if (zHasValue) {
            this.f4582D = typedArrayObtainStyledAttributes.getBoolean(33, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f4621z = typedArrayObtainStyledAttributes.getBoolean(26, typedArrayObtainStyledAttributes.getBoolean(26, true));
        this.f4583F = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true);
        if (typedValue.resourceId > 0) {
            this.f4599X = context.getResources().getColorStateList(typedValue.resourceId);
        }
    }

    public static void x(View view, boolean z4) {
        view.setEnabled(z4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                x(viewGroup.getChildAt(childCount), z4);
            }
        }
    }

    private void y(TextView textView) {
        textView.setLineBreakWordStyle(1);
    }

    public boolean A() {
        return !h();
    }

    public final boolean B() {
        return (this.f4602e == null || !this.f4616u || TextUtils.isEmpty(this.f4610o)) ? false : true;
    }

    public final void a(Serializable serializable) {
        if (this.f4604h != null) {
            IDMApplication.getEnablerFactory().getAdminCommandExecutor(this.f4601d).execute(serializable.toString().trim());
        }
    }

    public void b() {
        o oVar = this.f4605i;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    public void c(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f4610o) || (parcelable = bundle.getParcelable(this.f4610o)) == null) {
            return;
        }
        this.f4591N = false;
        r(parcelable);
        if (!this.f4591N) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i5 = this.f4606j;
        int i6 = preference2.f4606j;
        if (i5 != i6) {
            return i5 - i6;
        }
        CharSequence charSequence = this.f4607k;
        CharSequence charSequence2 = preference2.f4607k;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f4607k.toString());
    }

    public void d(Bundle bundle) {
        if (TextUtils.isEmpty(this.f4610o)) {
            return;
        }
        this.f4591N = false;
        Parcelable parcelableS = s();
        if (!this.f4591N) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableS != null) {
            bundle.putParcelable(this.f4610o, parcelableS);
        }
    }

    public long e() {
        return this.f;
    }

    public final String f(String str) {
        return !B() ? str : this.f4602e.b().getString(this.f4610o, str);
    }

    public CharSequence g() {
        q qVar = this.f4593Q;
        return qVar != null ? qVar.b(this) : this.f4608l;
    }

    public boolean h() {
        return this.f4614s && this.f4619x && this.f4620y;
    }

    public final boolean i() {
        String string;
        Context context = this.f4601d;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services")) == null) {
            return false;
        }
        return string.matches("(?i).*com.samsung.accessibility/com.samsung.android.app.talkback.TalkBackService.*") || string.matches("(?i).*com.samsung.android.accessibility.talkback/com.samsung.android.marvin.talkback.TalkBackService.*") || string.matches("(?i).*com.google.android.marvin.talkback.TalkBackService.*") || string.matches("(?i).*com.samsung.accessibility/com.samsung.accessibility.universalswitch.UniversalSwitchService.*");
    }

    public void j() {
        int iIndexOf;
        D d5 = this.f4588K;
        if (d5 == null || (iIndexOf = d5.f.indexOf(this)) == -1) {
            return;
        }
        d5.f7050a.c(iIndexOf, 1, this);
    }

    public void k(boolean z4) {
        ArrayList arrayList = this.f4589L;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Preference preference = (Preference) arrayList.get(i5);
            if (preference.f4619x == z4) {
                preference.f4619x = !z4;
                preference.k(preference.A());
                preference.j();
            }
        }
    }

    public void l() {
        PreferenceScreen preferenceScreen;
        String str = this.f4617v;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        F f = this.f4602e;
        Preference preferenceD = null;
        if (f != null && (preferenceScreen = f.f4541g) != null) {
            preferenceD = preferenceScreen.D(str);
        }
        if (preferenceD == null) {
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.f4610o + "\" (title: \"" + ((Object) this.f4607k) + "\"");
        }
        if (preferenceD.f4589L == null) {
            preferenceD.f4589L = new ArrayList();
        }
        preferenceD.f4589L.add(this);
        boolean zA = preferenceD.A();
        if (this.f4619x == zA) {
            this.f4619x = !zA;
            k(A());
            j();
        }
    }

    public void m(F f) {
        long j5;
        this.f4602e = f;
        if (!this.f4603g) {
            synchronized (f) {
                j5 = f.f4537b;
                f.f4537b = 1 + j5;
            }
            this.f = j5;
        }
        if (B()) {
            F f5 = this.f4602e;
            if ((f5 != null ? f5.b() : null).contains(this.f4610o)) {
                u(null, true);
                return;
            }
        }
        Object obj = this.f4618w;
        if (obj != null) {
            u(obj, false);
        }
    }

    public void n(H h3) {
        Integer numValueOf;
        boolean z4 = this.f4582D;
        boolean z5 = this.f4581C;
        ViewOnClickListenerC0193l viewOnClickListenerC0193l = this.f4594R;
        View view = h3.f7128a;
        view.setOnClickListener(viewOnClickListenerC0193l);
        view.setId(0);
        TextView textView = (TextView) h3.r(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceG = g();
            if (TextUtils.isEmpty(charSequenceG)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceG);
                y(textView);
                ColorStateList colorStateList = this.f4599X;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        boolean z6 = this.f4595T;
        int i5 = this.f4597V;
        boolean z7 = this.f4596U;
        h3.f4548B = z6;
        h3.f4547A = i5;
        h3.f4549C = z7;
        TextView textView2 = (TextView) h3.r(android.R.id.title);
        boolean z8 = this.f4615t;
        if (textView2 != null) {
            CharSequence charSequence = this.f4607k;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (z5) {
                    textView2.setSingleLine(z4);
                }
                if (!z8 && h() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            } else if (TextUtils.isEmpty(charSequence) && (this instanceof PreferenceCategory)) {
                textView2.setVisibility(0);
                if (z5) {
                    textView2.setSingleLine(z4);
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) h3.r(android.R.id.icon);
        boolean z9 = this.E;
        if (imageView != null) {
            int i6 = this.f4609m;
            if (i6 != 0 || this.n != null) {
                if (this.n == null) {
                    this.n = AbstractC0415a.r(this.f4601d, i6);
                }
                Drawable drawable = this.n;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.n != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z9 ? 4 : 8);
            }
        }
        View viewR = h3.r(R.id.icon_frame);
        if (viewR == null) {
            viewR = h3.r(android.R.id.icon_frame);
        }
        if (viewR != null) {
            if (this.n != null) {
                viewR.setVisibility(0);
            } else {
                viewR.setVisibility(z9 ? 4 : 8);
            }
        }
        if (this.f4584G) {
            x(view, h());
        } else {
            x(view, true);
        }
        view.setFocusable(z8);
        view.setClickable(z8);
        h3.f4553y = this.f4579A;
        h3.f4554z = this.f4580B;
        boolean z10 = this.f4583F;
        if (z10 && this.f4592O == null) {
            this.f4592O = new p(this);
        }
        view.setOnCreateContextMenuListener(z10 ? this.f4592O : null);
        view.setLongClickable(z10);
        if (z10 && !z8) {
            WeakHashMap weakHashMap = P.f1421a;
            view.setBackground(null);
        }
        this.f4600Y = view;
    }

    public void o() {
    }

    public void p() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f4617v;
        if (str != null) {
            F f = this.f4602e;
            Preference preferenceD = null;
            if (f != null && (preferenceScreen = f.f4541g) != null) {
                preferenceD = preferenceScreen.D(str);
            }
            if (preferenceD == null || (arrayList = preferenceD.f4589L) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object q(TypedArray typedArray, int i5) {
        return null;
    }

    public void r(Parcelable parcelable) {
        this.f4591N = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable s() {
        this.f4591N = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void t(Object obj) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f4607k;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceG = g();
        if (!TextUtils.isEmpty(charSequenceG)) {
            sb.append(charSequenceG);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(Object obj, boolean z4) {
        t(obj);
    }

    public void v(View view) {
        Intent intent;
        z zVar;
        if (h() && this.f4615t) {
            o();
            o oVar = this.f4605i;
            if (oVar == null || !oVar.a(this)) {
                F f = this.f4602e;
                if ((f == null || (zVar = f.f4542h) == null || !zVar.onPreferenceTreeClick(this)) && (intent = this.f4611p) != null) {
                    this.f4601d.startActivity(intent);
                }
            }
        }
    }

    public final void w(String str) {
        if (B() && !TextUtils.equals(str, f(null))) {
            SharedPreferences.Editor editorA = this.f4602e.a();
            editorA.putString(this.f4610o, str);
            if (this.f4602e.f4540e) {
                return;
            }
            editorA.apply();
        }
    }

    public void z(CharSequence charSequence) {
        if (this.f4593Q != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f4608l, charSequence)) {
            return;
        }
        this.f4608l = charSequence;
        j();
    }

    public Preference(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A.b.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
