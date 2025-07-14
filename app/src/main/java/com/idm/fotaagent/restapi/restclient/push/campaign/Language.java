package com.idm.fotaagent.restapi.restclient.push.campaign;

import android.os.SemSystemProperties;
import android.text.TextUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.Xpath;
import java.util.Locale;

/* loaded from: classes.dex */
class Language {
    static final String LANGUAGE_DEFAULT_CODE = "en";
    static final String LOCALE_DEFAULT_CODE = "en-us";
    static final String PERSIST_SYS_LOCALE = "persist.sys.locale";
    static final String PERSIST_SYS_LOCALE_DEFAULT = "persist.sys.localedefault";

    public static String getCountry() {
        return Locale.getDefault().getCountry();
    }

    public static String getDefaultLanguage(String str) {
        return new Xpath(str).getResultOfString("noti/@default").orElse("");
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String readLanguage() {
        String language = getLanguage();
        if (TextUtils.isEmpty(language)) {
            language = readLanguageFromProperties();
            if (TextUtils.isEmpty(language)) {
                language = "en";
            }
        }
        Log.I("langCode : " + language);
        return language.toLowerCase();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String readLanguageFromProperties() {
        /*
            java.lang.String r0 = "persist.sys.locale"
            java.lang.String r1 = ""
            java.lang.String r0 = android.os.SemSystemProperties.get(r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r4 = 2
            java.lang.String r5 = "-"
            if (r2 != 0) goto L1c
            java.lang.String[] r0 = r0.split(r5)
            int r2 = r0.length
            if (r2 != r4) goto L1c
            r0 = r0[r3]
            goto L1d
        L1c:
            r0 = r1
        L1d:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L38
            java.lang.String r2 = "persist.sys.localedefault"
            java.lang.String r1 = android.os.SemSystemProperties.get(r2, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L38
            java.lang.String[] r1 = r1.split(r5)
            int r2 = r1.length
            if (r2 != r4) goto L38
            r0 = r1[r3]
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.fotaagent.restapi.restclient.push.campaign.Language.readLanguageFromProperties():java.lang.String");
    }

    public static String readLocaleCode() {
        String language = getLanguage();
        String country = getCountry();
        Log.I("language : " + language + ", country : " + country);
        if (TextUtils.isEmpty(language) || TextUtils.isEmpty(country)) {
            return readLocaleFromProperties();
        }
        return language + "-" + country;
    }

    private static String readLocaleFromProperties() {
        String str = SemSystemProperties.get(PERSIST_SYS_LOCALE, "");
        return TextUtils.isEmpty(str) ? SemSystemProperties.get(PERSIST_SYS_LOCALE_DEFAULT, LOCALE_DEFAULT_CODE) : str;
    }
}
