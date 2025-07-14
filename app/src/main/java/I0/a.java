package I0;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f848c = J2.b.M("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d, reason: collision with root package name */
    public static final Set f849d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f850e;

    /* renamed from: a, reason: collision with root package name */
    public final String f851a;

    /* renamed from: b, reason: collision with root package name */
    public final String f852b;

    static {
        String strM = J2.b.M("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM2 = J2.b.M("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f849d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new H0.b("proto"), new H0.b("json"))));
        f850e = new a(strM, strM2);
    }

    public a(String str, String str2) {
        this.f851a = str;
        this.f852b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
