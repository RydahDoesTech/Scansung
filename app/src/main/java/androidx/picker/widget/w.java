package androidx.picker.widget;

import android.icu.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
public final class w implements InterfaceC0180s {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f4496a;

    /* renamed from: b, reason: collision with root package name */
    public char f4497b;

    /* renamed from: c, reason: collision with root package name */
    public Formatter f4498c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f4499d;

    public w() {
        StringBuilder sb = new StringBuilder();
        this.f4496a = sb;
        this.f4499d = new Object[1];
        Locale locale = Locale.getDefault();
        this.f4498c = new Formatter(sb, locale);
        this.f4497b = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }
}
