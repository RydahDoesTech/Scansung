package com.google.android.material.datepicker;

import J.H;
import J.P;
import J.b0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import com.google.android.material.internal.CheckableImageButton;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o<S> extends DialogInterfaceOnCancelListenerC0130s {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f5892A;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5893d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5894e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public v f5895g;

    /* renamed from: h, reason: collision with root package name */
    public b f5896h;

    /* renamed from: i, reason: collision with root package name */
    public l f5897i;

    /* renamed from: j, reason: collision with root package name */
    public int f5898j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f5899k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5900l;

    /* renamed from: m, reason: collision with root package name */
    public int f5901m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f5902o;

    /* renamed from: p, reason: collision with root package name */
    public int f5903p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f5904q;

    /* renamed from: r, reason: collision with root package name */
    public int f5905r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f5906s;

    /* renamed from: t, reason: collision with root package name */
    public int f5907t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f5908u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f5909v;

    /* renamed from: w, reason: collision with root package name */
    public CheckableImageButton f5910w;

    /* renamed from: x, reason: collision with root package name */
    public O1.g f5911x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5912y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f5913z;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f5893d = new LinkedHashSet();
        this.f5894e = new LinkedHashSet();
    }

    public static int h(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = y.b();
        calendarB.set(5, 1);
        Calendar calendarA = y.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean i(Context context, int i5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(J2.b.V(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i5});
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z4;
    }

    public final void g() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f5893d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5896h = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5898j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f5899k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f5901m = bundle.getInt("INPUT_MODE_KEY");
        this.n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5902o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f5903p = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5904q = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f5905r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5906s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f5907t = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5908u = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f5899k;
        if (text == null) {
            text = requireContext().getResources().getText(this.f5898j);
        }
        this.f5913z = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f5892A = text;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i5 = this.f;
        if (i5 == 0) {
            g();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i5);
        Context context = dialog.getContext();
        this.f5900l = i(context, android.R.attr.windowFullscreen);
        this.f5911x = new O1.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, u1.a.n, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f5911x.g(context);
        this.f5911x.i(ColorStateList.valueOf(color));
        O1.g gVar = this.f5911x;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = P.f1421a;
        gVar.h(H.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f5900l ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f5900l) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(h(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(h(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = P.f1421a;
        textView.setAccessibilityLiveRegion(1);
        this.f5910w = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f5909v = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f5910w.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f5910w;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0415a.r(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0415a.r(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f5910w.setChecked(this.f5901m != 0);
        P.h(this.f5910w, null);
        CheckableImageButton checkableImageButton2 = this.f5910w;
        this.f5910w.setContentDescription(this.f5901m == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f5910w.setOnClickListener(new E1.u(4, this));
        g();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f5894e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f5896h;
        C0383a c0383a = new C0383a();
        int i5 = C0383a.f5856b;
        int i6 = C0383a.f5856b;
        long j5 = bVar.f5858d.f5919i;
        long j6 = bVar.f5859e.f5919i;
        c0383a.f5857a = Long.valueOf(bVar.f5860g.f5919i);
        l lVar = this.f5897i;
        q qVar = lVar == null ? null : lVar.f5880g;
        if (qVar != null) {
            c0383a.f5857a = Long.valueOf(qVar.f5919i);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f);
        q qVarB = q.b(j5);
        q qVarB2 = q.b(j6);
        e eVar = (e) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = c0383a.f5857a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(qVarB, qVarB2, eVar, l4 == null ? null : q.b(l4.longValue()), bVar.f5861h));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f5898j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f5899k);
        bundle.putInt("INPUT_MODE_KEY", this.f5901m);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f5902o);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5903p);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5904q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5905r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f5906s);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5907t);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5908u);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f5900l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5911x);
            if (!this.f5912y) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Drawable background = viewFindViewById.getBackground();
                ColorStateList colorStateListValueOf = background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : background instanceof ColorStateListDrawable ? ((ColorStateListDrawable) background).getColorStateList() : null;
                Integer numValueOf = colorStateListValueOf != null ? Integer.valueOf(colorStateListValueOf.getDefaultColor()) : null;
                boolean z4 = numValueOf == null || numValueOf.intValue() == 0;
                int iO = AbstractC0415a.o(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z4) {
                    numValueOf = Integer.valueOf(iO);
                }
                b0.a(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z5 = AbstractC0415a.F(0) || AbstractC0415a.F(numValueOf.intValue());
                E0.d dVar = new E0.d(window.getInsetsController(), new b4.d(window.getDecorView()));
                dVar.f = window;
                Window window2 = (Window) dVar.f;
                WindowInsetsController windowInsetsController = (WindowInsetsController) dVar.f520e;
                if (z5) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                    }
                    windowInsetsController.setSystemBarsAppearance(8, 8);
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
                    }
                    windowInsetsController.setSystemBarsAppearance(0, 8);
                }
                boolean z6 = AbstractC0415a.F(0) || AbstractC0415a.F(iO);
                E0.d dVar2 = new E0.d(window.getInsetsController(), new b4.d(window.getDecorView()));
                dVar2.f = window;
                Window window3 = (Window) dVar2.f;
                WindowInsetsController windowInsetsController2 = (WindowInsetsController) dVar2.f520e;
                if (z6) {
                    if (window3 != null) {
                        View decorView3 = window3.getDecorView();
                        decorView3.setSystemUiVisibility(decorView3.getSystemUiVisibility() | 16);
                    }
                    windowInsetsController2.setSystemBarsAppearance(16, 16);
                } else {
                    if (window3 != null) {
                        View decorView4 = window3.getDecorView();
                        decorView4.setSystemUiVisibility(decorView4.getSystemUiVisibility() & (-17));
                    }
                    windowInsetsController2.setSystemBarsAppearance(0, 16);
                }
                n nVar = new n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = P.f1421a;
                H.u(viewFindViewById, nVar);
                this.f5912y = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5911x, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new G1.a(requireDialog(), rect));
        }
        requireContext();
        int i5 = this.f;
        if (i5 == 0) {
            g();
            throw null;
        }
        g();
        b bVar = this.f5896h;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f5860g);
        lVar.setArguments(bundle);
        this.f5897i = lVar;
        v vVar = lVar;
        if (this.f5901m == 1) {
            g();
            b bVar2 = this.f5896h;
            v pVar = new p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            pVar.setArguments(bundle2);
            vVar = pVar;
        }
        this.f5895g = vVar;
        this.f5909v.setText((this.f5901m == 1 && getResources().getConfiguration().orientation == 2) ? this.f5892A : this.f5913z);
        g();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f5895g.f5931d.clear();
        super.onStop();
    }
}
