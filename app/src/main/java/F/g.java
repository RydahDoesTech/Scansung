package F;

import com.idm.network.IDMNetworkInterface;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f621a = {new Locale(IDMNetworkInterface.IDM_HTTP_LANGUAGE, "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f621a;
        int length = localeArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strC = H.c.c(H.c.a(H.c.b(locale)));
                if (!strC.isEmpty()) {
                    return strC.equals(H.c.c(H.c.a(H.c.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i5].equals(locale)) {
                break;
            }
            i5++;
        }
        return false;
    }
}
