package androidx.picker.widget;

import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import java.util.Locale;

/* loaded from: classes.dex */
public final class C extends NumberKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f4046a;

    public C(D d5) {
        this.f4046a = d5;
    }

    @Override // android.text.method.NumberKeyListener, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        D d5 = this.f4046a;
        if (d5.f4116l == null) {
            CharSequence charSequenceFilter = super.filter(charSequence, i5, i6, spanned, i7, i8);
            if (charSequenceFilter == null) {
                charSequenceFilter = charSequence.subSequence(i5, i6);
            }
            String str = String.valueOf(spanned.subSequence(0, i7)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i8, spanned.length()));
            if ("".equals(str)) {
                return str;
            }
            if (d5.h(str) <= d5.n && str.length() <= d5.f(d5.n).length()) {
                return charSequenceFilter;
            }
            if (d5.f4110h0) {
                if (d5.f4091X0 == null) {
                    D.a(d5);
                }
                d5.f4091X0.show();
            }
            return "";
        }
        String strValueOf = String.valueOf(charSequence.subSequence(i5, i6));
        String lowerCase = String.valueOf(String.valueOf(spanned.subSequence(0, i7)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i8, spanned.length()))).toLowerCase();
        d5.getClass();
        boolean z4 = "vi".equals(Locale.getDefault().getLanguage()) && "inputType=month_edittext".equals(d5.f4105e.getPrivateImeOptions());
        for (String str2 : d5.f4116l) {
            String lowerCase2 = str2.toLowerCase();
            if ((z4 && lowerCase2.equals(lowerCase)) || lowerCase2.startsWith(lowerCase)) {
                return strValueOf;
            }
        }
        if (d5.f4110h0 && !TextUtils.isEmpty(lowerCase)) {
            if (d5.f4091X0 == null) {
                D.a(d5);
            }
            d5.f4091X0.show();
        }
        return "";
    }

    @Override // android.text.method.NumberKeyListener
    public final char[] getAcceptedChars() {
        return D.f4047e1;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return 1;
    }
}
