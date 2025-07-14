package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class t implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3690d = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f3691e;

    public t(Spannable spannable) {
        this.f3691e = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f3691e.charAt(i5);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f3691e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f3691e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f3691e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f3691e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f3691e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i5, int i6, Class cls) {
        return this.f3691e.getSpans(i5, i6, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3691e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i5, int i6, Class cls) {
        return this.f3691e.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f3691e;
        if (!this.f3690d && (spannable instanceof PrecomputedText)) {
            this.f3691e = new SpannableString(spannable);
        }
        this.f3690d = true;
        this.f3691e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i5, int i6, int i7) {
        Spannable spannable = this.f3691e;
        if (!this.f3690d && (spannable instanceof PrecomputedText)) {
            this.f3691e = new SpannableString(spannable);
        }
        this.f3690d = true;
        this.f3691e.setSpan(obj, i5, i6, i7);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i6) {
        return this.f3691e.subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3691e.toString();
    }

    public t(CharSequence charSequence) {
        this.f3691e = new SpannableString(charSequence);
    }
}
