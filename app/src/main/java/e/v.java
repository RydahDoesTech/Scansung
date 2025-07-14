package e;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static F.i b(Configuration configuration) {
        String languageTags = configuration.getLocales().toLanguageTags();
        if (languageTags != null) {
            F.i iVar = F.i.f622b;
            if (!languageTags.isEmpty()) {
                String[] strArrSplit = languageTags.split(",", -1);
                int length = strArrSplit.length;
                Locale[] localeArr = new Locale[length];
                for (int i5 = 0; i5 < length; i5++) {
                    localeArr[i5] = F.g.a(strArrSplit[i5]);
                }
                return new F.i(new F.j(F.h.a(localeArr)));
            }
        }
        return F.i.f622b;
    }

    public static void c(F.i iVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(iVar.f623a.f624a.toLanguageTags()));
    }

    public static void d(Configuration configuration, F.i iVar) {
        configuration.setLocales(LocaleList.forLanguageTags(iVar.f623a.f624a.toLanguageTags()));
    }
}
