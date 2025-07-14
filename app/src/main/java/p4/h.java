package p4;

import b3.AbstractC0219i;
import e1.AbstractC0415a;
import f3.C0447c;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class h extends g {
    public static boolean g0(String str, String str2) {
        AbstractC0219i.e("<this>", str);
        return j0(2, str, str2, false) >= 0;
    }

    public static int h0(CharSequence charSequence) {
        AbstractC0219i.e("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int i0(int r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            b3.AbstractC0219i.e(r0, r10)
            java.lang.String r0 = "string"
            b3.AbstractC0219i.e(r0, r11)
            if (r12 != 0) goto L12
            int r9 = r10.indexOf(r11, r9)
            goto La8
        L12:
            int r0 = r10.length()
            r1 = -1
            r2 = 0
            f3.c r3 = new f3.c
            if (r9 >= 0) goto L1d
            r9 = r2
        L1d:
            int r2 = r10.length()
            if (r0 <= r2) goto L24
            r0 = r2
        L24:
            r2 = 1
            r3.<init>(r9, r0, r2)
            int r9 = r3.f
            int r0 = r3.f6730e
            int r2 = r3.f6729d
            if (r10 == 0) goto L60
            if (r11 == 0) goto L60
            if (r9 <= 0) goto L36
            if (r2 <= r0) goto L3a
        L36:
            if (r9 >= 0) goto La7
            if (r0 > r2) goto La7
        L3a:
            int r8 = r11.length()
            java.lang.String r3 = "<this>"
            b3.AbstractC0219i.e(r3, r11)
            java.lang.String r3 = "other"
            b3.AbstractC0219i.e(r3, r10)
            r5 = 0
            if (r12 != 0) goto L50
            boolean r3 = r11.regionMatches(r5, r10, r2, r8)
            goto L58
        L50:
            r3 = r11
            r4 = r12
            r6 = r10
            r7 = r2
            boolean r3 = r3.regionMatches(r4, r5, r6, r7, r8)
        L58:
            if (r3 == 0) goto L5c
        L5a:
            r9 = r2
            goto La8
        L5c:
            if (r2 == r0) goto La7
            int r2 = r2 + r9
            goto L3a
        L60:
            if (r9 <= 0) goto L64
            if (r2 <= r0) goto L68
        L64:
            if (r9 >= 0) goto La7
            if (r0 > r2) goto La7
        L68:
            int r3 = r11.length()
            java.lang.String r4 = "<this>"
            b3.AbstractC0219i.e(r4, r11)
            java.lang.String r4 = "other"
            b3.AbstractC0219i.e(r4, r10)
            r4 = 0
            if (r2 < 0) goto La0
            int r5 = r11.length()
            int r5 = r5 - r3
            if (r5 < 0) goto La0
            int r5 = r10.length()
            int r5 = r5 - r3
            if (r2 <= r5) goto L88
            goto La0
        L88:
            r5 = r4
        L89:
            if (r5 >= r3) goto L9f
            char r6 = r11.charAt(r5)
            int r7 = r2 + r5
            char r7 = r10.charAt(r7)
            boolean r6 = e1.AbstractC0415a.i(r6, r7, r12)
            if (r6 != 0) goto L9c
            goto La0
        L9c:
            int r5 = r5 + 1
            goto L89
        L9f:
            r4 = 1
        La0:
            if (r4 == 0) goto La3
            goto L5a
        La3:
            if (r2 == r0) goto La7
            int r2 = r2 + r9
            goto L68
        La7:
            r9 = r1
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.h.i0(int, java.lang.String, java.lang.String, boolean):int");
    }

    public static /* synthetic */ int j0(int i5, String str, String str2, boolean z4) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return i0(0, str, str2, z4);
    }

    public static int k0(String str, char c2, int i5, boolean z4, int i6) {
        int i7;
        boolean z5 = true;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        AbstractC0219i.e("<this>", str);
        if (!z4) {
            return str.indexOf(c2, i5);
        }
        char[] cArr = {c2};
        if (!z4) {
            return str.indexOf(cArr[0], i5);
        }
        if (i5 < 0) {
            i5 = 0;
        }
        C0447c c0447c = new C0447c(i5, h0(str), 1);
        int i8 = c0447c.f;
        int i9 = c0447c.f6730e;
        if (i8 <= 0 ? i5 < i9 : i5 > i9) {
            z5 = false;
        }
        if (!z5) {
            i5 = i9;
        }
        while (z5) {
            if (i5 != i9) {
                i7 = i5 + i8;
            } else {
                if (!z5) {
                    throw new NoSuchElementException();
                }
                i7 = i5;
                z5 = false;
            }
            if (AbstractC0415a.i(cArr[0], str.charAt(i5), z4)) {
                return i5;
            }
            i5 = i7;
        }
        return -1;
    }

    public static String l0(String str, String str2) {
        AbstractC0219i.e("<this>", str);
        if (!o0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
        return strSubstring;
    }

    public static String m0(String str, char c2, char c5) {
        AbstractC0219i.e("<this>", str);
        String strReplace = str.replace(c2, c5);
        AbstractC0219i.d("this as java.lang.String…replace(oldChar, newChar)", strReplace);
        return strReplace;
    }

    public static String n0(String str, String str2, String str3) {
        AbstractC0219i.e("<this>", str);
        int iI0 = i0(0, str, str2, false);
        if (iI0 < 0) {
            return str;
        }
        int length = str2.length();
        int i5 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i6 = 0;
        do {
            sb.append((CharSequence) str, i6, iI0);
            sb.append(str3);
            i6 = iI0 + length;
            if (iI0 >= str.length()) {
                break;
            }
            iI0 = i0(iI0 + i5, str, str2, false);
        } while (iI0 > 0);
        sb.append((CharSequence) str, i6, str.length());
        String string = sb.toString();
        AbstractC0219i.d("stringBuilder.append(this, i, length).toString()", string);
        return string;
    }

    public static boolean o0(String str, String str2) {
        AbstractC0219i.e("<this>", str);
        AbstractC0219i.e("prefix", str2);
        return str.startsWith(str2);
    }

    public static String p0(String str, String str2, String str3) {
        AbstractC0219i.e("delimiter", str2);
        AbstractC0219i.e("missingDelimiterValue", str3);
        int iJ0 = j0(6, str, str2, false);
        if (iJ0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iJ0, str.length());
        AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static String q0(String str, char c2) {
        AbstractC0219i.e("<this>", str);
        AbstractC0219i.e("missingDelimiterValue", str);
        int iLastIndexOf = str.lastIndexOf(c2, h0(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static String r0(String str, String str2) {
        AbstractC0219i.e("<this>", str);
        AbstractC0219i.e("missingDelimiterValue", str);
        int iJ0 = j0(6, str, str2, false);
        if (iJ0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iJ0);
        AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }
}
