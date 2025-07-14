package androidx.picker.widget;

import android.icu.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: androidx.picker.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168f implements E0.h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4470a;

    public C0168f() {
        this.f4470a = new Object[1];
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.SIMPLIFIED_CHINESE;
        if (language.equals(locale2.getLanguage()) && locale.getCountry().equals(locale2.getCountry())) {
            new SimpleDateFormat("EEEEE, MMM dd", locale);
            return;
        }
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        if (directionality == 1 || directionality == 2) {
            new SimpleDateFormat("EEEEE, MMM dd", locale);
        } else {
            new SimpleDateFormat("EEE, MMM dd", locale);
        }
    }
}
