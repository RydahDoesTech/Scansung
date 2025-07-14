package androidx.preference;

import J.P;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.idm.fotaagent.utils.storage.StorageConstants;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import j0.AbstractC0510A;
import j0.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D extends AbstractC0510A {

    /* renamed from: d, reason: collision with root package name */
    public final PreferenceScreen f4514d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4515e;
    public ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f4516g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4517h;
    public ViewGroup n;

    /* renamed from: j, reason: collision with root package name */
    public final t f4519j = new t(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final int f4520k = R.layout.sesl_preference_category;

    /* renamed from: l, reason: collision with root package name */
    public Preference f4521l = null;

    /* renamed from: m, reason: collision with root package name */
    public Preference f4522m = null;

    /* renamed from: o, reason: collision with root package name */
    public int f4523o = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f4518i = new Handler(Looper.getMainLooper());

    public D(PreferenceScreen preferenceScreen) {
        this.f4514d = preferenceScreen;
        preferenceScreen.f4588K = this;
        this.f4515e = new ArrayList();
        this.f = new ArrayList();
        this.f4517h = new ArrayList();
        this.f4516g = new ArrayList();
        h(preferenceScreen.f4628f0);
        p();
    }

    public static boolean n(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f4627e0 != Integer.MAX_VALUE;
    }

    public static boolean o(Preference preference) {
        int i5 = preference.f4585H;
        if (i5 == R.layout.sesl_preference_switch && preference.f4586I == R.layout.sesl_preference_widget_switch) {
            return true;
        }
        return i5 == R.layout.sesl_preference_switch_screen && preference.f4586I == R.layout.sesl_switch_preference_screen_widget_divider;
    }

    @Override // j0.AbstractC0510A
    public final int a() {
        return this.f.size();
    }

    @Override // j0.AbstractC0510A
    public final long b(int i5) {
        if (!this.f7051b || k(i5) == null) {
            return -1L;
        }
        return k(i5).e();
    }

    @Override // j0.AbstractC0510A
    public final int c(int i5) {
        C c2 = new C(k(i5));
        ArrayList arrayList = this.f4517h;
        int iIndexOf = arrayList.indexOf(c2);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(c2);
        return size;
    }

    @Override // j0.AbstractC0510A
    public final void d(b0 b0Var, int i5) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int paddingEnd;
        ColorStateList colorStateList;
        H h3 = (H) b0Var;
        Preference preferenceK = k(i5);
        View view = h3.f7128a;
        Drawable background = view.getBackground();
        Drawable drawable = h3.f4550v;
        if (background != drawable) {
            WeakHashMap weakHashMap = P.f1421a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) h3.r(android.R.id.title);
        if (textView != null && (colorStateList = h3.f4551w) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        if (!o(preferenceK)) {
            if ((preferenceK instanceof SeekBarPreference) && h3.f7145t) {
                h3.f7145t = false;
            }
            preferenceK.n(h3);
            return;
        }
        int width = this.n.getWidth();
        this.f4523o = width;
        if (preferenceK instanceof SwitchPreference) {
            SwitchPreference switchPreference = (SwitchPreference) preferenceK;
            switchPreference.f4641i0 = width;
            switchPreference.n(h3);
            View viewFindViewById = view.findViewById(R.id.widget_frame);
            View viewFindViewById2 = view.findViewById(android.R.id.widget_frame);
            View viewFindViewById3 = view.findViewById(R.id.switch_widget);
            View viewFindViewById4 = view.findViewById(android.R.id.switch_widget);
            Context context = switchPreference.f4601d;
            Configuration configuration = context.getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i7 = ((i6 > 320 || configuration.fontScale < 1.1f) && (i6 >= 411 || configuration.fontScale < 1.3f)) ? 2 : 1;
            if (i7 != 1) {
                if (switchPreference.f4640h0 != i7) {
                    switchPreference.f4640h0 = i7;
                    TextView textView2 = (TextView) view.findViewById(android.R.id.title);
                    viewFindViewById2.setVisibility(0);
                    viewFindViewById.setVisibility(8);
                    textView2.requestLayout();
                }
                switchPreference.F(viewFindViewById4);
                return;
            }
            switchPreference.f4640h0 = i7;
            TextView textView3 = (TextView) view.findViewById(android.R.id.title);
            float fMeasureText = textView3.getPaint().measureText(textView3.getText().toString());
            TextView textView4 = (TextView) view.findViewById(android.R.id.summary);
            float fMeasureText2 = textView4.getPaint().measureText(textView4.getText().toString());
            if (textView4.getVisibility() == 8) {
                fMeasureText2 = 0.0f;
            }
            float paddingEnd2 = ((switchPreference.f4641i0 - view.getPaddingEnd()) - view.getPaddingStart()) - context.getResources().getDimensionPixelSize(R.dimen.sesl_preference_item_switch_size);
            if (fMeasureText >= paddingEnd2 || fMeasureText2 >= paddingEnd2) {
                viewFindViewById.setVisibility(0);
                viewFindViewById2.setVisibility(8);
                textView3.requestLayout();
                SwitchCompat switchCompat = (SwitchCompat) viewFindViewById3;
                if (!switchCompat.c(switchPreference.f4648Z) && SwitchPreference.E(switchPreference.f4648Z, view, switchCompat)) {
                    switchCompat.performHapticFeedback(AbstractC0415a.R(27));
                }
                switchPreference.F(viewFindViewById3);
                SwitchCompat switchCompat2 = (SwitchCompat) viewFindViewById4;
                switchCompat2.setOnCheckedChangeListener(null);
                switchCompat2.setCheckedWithoutAnimation(switchPreference.f4648Z);
                return;
            }
            viewFindViewById2.setVisibility(0);
            viewFindViewById.setVisibility(8);
            textView3.requestLayout();
            SwitchCompat switchCompat3 = (SwitchCompat) viewFindViewById4;
            if (!switchCompat3.c(switchPreference.f4648Z) && SwitchPreference.E(switchPreference.f4648Z, view, switchCompat3)) {
                switchCompat3.performHapticFeedback(AbstractC0415a.R(27));
            }
            switchPreference.F(viewFindViewById4);
            SwitchCompat switchCompat4 = (SwitchCompat) viewFindViewById3;
            switchCompat4.setOnCheckedChangeListener(null);
            switchCompat4.setCheckedWithoutAnimation(switchPreference.f4648Z);
            return;
        }
        if (!(preferenceK instanceof SwitchPreferenceCompat)) {
            preferenceK.n(h3);
            return;
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) preferenceK;
        switchPreferenceCompat.f4646i0 = width;
        switchPreferenceCompat.n(h3);
        View viewFindViewById5 = view.findViewById(R.id.widget_frame);
        View viewFindViewById6 = view.findViewById(android.R.id.widget_frame);
        View viewFindViewById7 = view.findViewById(R.id.switch_widget);
        View viewFindViewById8 = view.findViewById(android.R.id.switch_widget);
        Context context2 = switchPreferenceCompat.f4601d;
        Configuration configuration2 = context2.getResources().getConfiguration();
        int i8 = configuration2.screenWidthDp;
        int i9 = ((i8 > 320 || configuration2.fontScale < 1.1f) && (i8 >= 411 || configuration2.fontScale < 1.3f)) ? 2 : 1;
        if (i9 != 1) {
            if (switchPreferenceCompat.f4645h0 != i9) {
                switchPreferenceCompat.f4645h0 = i9;
                TextView textView5 = (TextView) view.findViewById(android.R.id.title);
                viewFindViewById6.setVisibility(0);
                viewFindViewById5.setVisibility(8);
                textView5.requestLayout();
            }
            switchPreferenceCompat.F(viewFindViewById8);
            return;
        }
        switchPreferenceCompat.f4645h0 = i9;
        TextView textView6 = (TextView) view.findViewById(android.R.id.title);
        float fMeasureText3 = textView6.getPaint().measureText(textView6.getText().toString());
        TextView textView7 = (TextView) view.findViewById(android.R.id.summary);
        float fMeasureText4 = textView7.getPaint().measureText(textView7.getText().toString());
        if (textView7.getVisibility() == 8) {
            fMeasureText4 = 0.0f;
        }
        if (switchPreferenceCompat instanceof SeslSwitchPreferenceScreen) {
            dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.sesl_preference_screen_item_switch_size);
            paddingEnd = viewFindViewById6.getPaddingEnd();
        } else {
            dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.sesl_preference_item_switch_size);
            paddingEnd = viewFindViewById6.getPaddingEnd();
        }
        float paddingEnd3 = ((switchPreferenceCompat.f4646i0 - view.getPaddingEnd()) - view.getPaddingStart()) - (paddingEnd + dimensionPixelSize);
        if (fMeasureText3 >= paddingEnd3 || fMeasureText4 >= paddingEnd3) {
            viewFindViewById5.setVisibility(0);
            viewFindViewById6.setVisibility(8);
            textView6.requestLayout();
            SwitchCompat switchCompat5 = (SwitchCompat) viewFindViewById7;
            if (!switchCompat5.c(switchPreferenceCompat.f4648Z) && SwitchPreferenceCompat.E(switchPreferenceCompat.f4648Z, view, switchCompat5)) {
                switchCompat5.performHapticFeedback(AbstractC0415a.R(27));
            }
            switchPreferenceCompat.F(viewFindViewById7);
            SwitchCompat switchCompat6 = (SwitchCompat) viewFindViewById8;
            switchCompat6.setOnCheckedChangeListener(null);
            switchCompat6.setCheckedWithoutAnimation(switchPreferenceCompat.f4648Z);
            return;
        }
        viewFindViewById6.setVisibility(0);
        viewFindViewById5.setVisibility(8);
        textView6.requestLayout();
        SwitchCompat switchCompat7 = (SwitchCompat) viewFindViewById8;
        if (!switchCompat7.c(switchPreferenceCompat.f4648Z) && SwitchPreferenceCompat.E(switchPreferenceCompat.f4648Z, view, switchCompat7)) {
            switchCompat7.performHapticFeedback(AbstractC0415a.R(27));
        }
        switchPreferenceCompat.F(viewFindViewById8);
        SwitchCompat switchCompat8 = (SwitchCompat) viewFindViewById7;
        switchCompat8.setOnCheckedChangeListener(null);
        switchCompat8.setCheckedWithoutAnimation(switchPreferenceCompat.f4648Z);
    }

    @Override // j0.AbstractC0510A
    public final b0 e(ViewGroup viewGroup, int i5) {
        C c2 = (C) this.f4517h.get(i5);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        this.n = viewGroup;
        View viewInflate = layoutInflaterFrom.inflate(c2.f4509a, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i6 = c2.f4510b;
            if (i6 != 0) {
                layoutInflaterFrom.inflate(i6, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        View viewFindViewById = viewInflate.findViewById(R.id.badge_frame);
        if (viewFindViewById != null) {
            if (c2.f4511c) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        return new H(viewInflate);
    }

    @Override // j0.AbstractC0510A
    public final int f() {
        ArrayList arrayList = this.f4516g;
        if (arrayList != null && arrayList.size() > 0) {
            return ((Integer) this.f4516g.get(r4.size() - 1)).intValue() + 1;
        }
        Iterator it = this.f.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (((Preference) it.next()).f4585H == R.layout.sesl_preference_category_empty) {
                i5++;
            }
        }
        return this.f.size() - i5;
    }

    @Override // j0.AbstractC0510A
    public final int g(int i5) {
        ArrayList arrayList = this.f4516g;
        if (arrayList == null || i5 >= arrayList.size()) {
            return -1;
        }
        return ((Integer) this.f4516g.get(i5)).intValue();
    }

    public final ArrayList i(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f4623a0.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Preference preferenceE = preferenceGroup.E(i6);
            if (preferenceE.f4621z) {
                if (!n(preferenceGroup) || i5 < preferenceGroup.f4627e0) {
                    arrayList.add(preferenceE);
                } else {
                    arrayList2.add(preferenceE);
                }
                if (preferenceE instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceE;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (n(preferenceGroup) && n(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = i(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!n(preferenceGroup) || i5 < preferenceGroup.f4627e0) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i5++;
                        }
                    }
                } else {
                    i5++;
                }
            }
        }
        if (n(preferenceGroup) && i5 > preferenceGroup.f4627e0) {
            long j5 = preferenceGroup.f;
            C0186e c0186e = new C0186e(preferenceGroup.f4601d);
            c0186e.f4585H = R.layout.expand_button;
            Context context = c0186e.f4601d;
            Drawable drawableR = AbstractC0415a.r(context, R.drawable.ic_arrow_down_24dp);
            if (c0186e.n != drawableR) {
                c0186e.n = drawableR;
                c0186e.f4609m = 0;
                c0186e.j();
            }
            c0186e.f4609m = R.drawable.ic_arrow_down_24dp;
            String string = context.getString(R.string.expand_button_title);
            if (!TextUtils.equals(string, c0186e.f4607k)) {
                c0186e.f4607k = string;
                c0186e.j();
            }
            if (999 != c0186e.f4606j) {
                c0186e.f4606j = androidx.room.j.MAX_BIND_PARAMETER_CNT;
                D d5 = c0186e.f4588K;
                if (d5 != null) {
                    Handler handler = d5.f4518i;
                    t tVar = d5.f4519j;
                    handler.removeCallbacks(tVar);
                    handler.post(tVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            CharSequence string2 = null;
            while (it2.hasNext()) {
                Preference preference2 = (Preference) it2.next();
                CharSequence charSequence = preference2.f4607k;
                boolean z4 = preference2 instanceof PreferenceGroup;
                if (z4 && !TextUtils.isEmpty(charSequence)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.f4590M)) {
                    if (z4) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence)) {
                    string2 = string2 == null ? charSequence : context.getString(R.string.summary_collapsed_preference_list, string2, charSequence);
                }
            }
            c0186e.z(string2);
            c0186e.f4660Z = j5 + StorageConstants.MEGA_BYTES;
            c0186e.f4605i = new B(this, preferenceGroup);
            arrayList.add(c0186e);
        }
        return arrayList;
    }

    public final void j(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f4623a0);
        }
        int size = preferenceGroup.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            Preference preferenceE = preferenceGroup.E(i5);
            if (i5 == size - 1) {
                this.f4521l = null;
            } else {
                this.f4521l = preferenceGroup.E(i5 + 1);
                if (preferenceE == this.f4522m) {
                    this.f4522m = null;
                }
            }
            boolean z4 = preferenceE instanceof PreferenceCategory;
            if (z4 && !preferenceE.f4598W) {
                preferenceE.f4595T = true;
                preferenceE.f4597V = 15;
                preferenceE.f4596U = true;
                preferenceE.f4598W = true;
            }
            arrayList.add(preferenceE);
            if (z4 && TextUtils.isEmpty(preferenceE.f4607k) && this.f4520k == preferenceE.f4585H) {
                preferenceE.f4585H = R.layout.sesl_preference_category_empty;
            }
            C c2 = new C(preferenceE);
            if (!this.f4517h.contains(c2)) {
                this.f4517h.add(c2);
            }
            if (preferenceE instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceE;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    this.f4522m = this.f4521l;
                    j(arrayList, preferenceGroup2);
                }
            }
            preferenceE.f4588K = this;
        }
    }

    public final Preference k(int i5) {
        if (i5 < 0 || i5 >= this.f.size()) {
            return null;
        }
        return (Preference) this.f.get(i5);
    }

    public final int l(Preference preference) {
        int size = this.f.size();
        for (int i5 = 0; i5 < size; i5++) {
            Preference preference2 = (Preference) this.f.get(i5);
            if (preference2 != null && preference2.equals(preference)) {
                return i5;
            }
        }
        return -1;
    }

    public final int m(String str) {
        int size = this.f.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (TextUtils.equals(str, ((Preference) this.f.get(i5)).f4610o)) {
                return i5;
            }
        }
        return -1;
    }

    public final void p() {
        int i5;
        Iterator it = this.f4515e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f4588K = null;
        }
        ArrayList arrayList = new ArrayList(this.f4515e.size());
        this.f4515e = arrayList;
        PreferenceScreen preferenceScreen = this.f4514d;
        j(arrayList, preferenceScreen);
        this.f = i(preferenceScreen);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.f.iterator();
        int i6 = -1;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((Preference) it2.next()).f4585H != R.layout.sesl_preference_category_empty) {
                i6++;
            }
            arrayList2.add(Integer.valueOf(Math.max(i6, 0)));
        }
        if (arrayList2.size() > 0 && ((Integer) arrayList2.get(arrayList2.size() - 1)).intValue() >= this.f.size()) {
            Log.w("PreferenceGroupAdapter", "accessibilityPosition over visible size | last " + arrayList2.get(arrayList2.size() - 1) + " vsize " + this.f.size());
            for (i5 = 0; i5 < arrayList2.size(); i5++) {
                arrayList2.set(i5, Integer.valueOf(i5));
            }
        }
        this.f4516g = arrayList2;
        this.f7050a.b();
        Iterator it3 = this.f4515e.iterator();
        while (it3.hasNext()) {
            ((Preference) it3.next()).getClass();
        }
    }
}
