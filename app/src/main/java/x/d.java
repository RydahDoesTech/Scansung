package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2656a;

    /* renamed from: b, reason: collision with root package name */
    public c f2657b;

    public d(TextView textView) {
        this.f2656a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        TextView textView = this.f2656a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = androidx.emoji2.text.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i8 == 0 && i7 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i5 != 0 || i6 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i5, i6);
                }
                return androidx.emoji2.text.i.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
        if (this.f2657b == null) {
            this.f2657b = new c(textView, this);
        }
        iVarA.f(this.f2657b);
        return charSequence;
    }
}
