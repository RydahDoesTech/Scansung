package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class S4 extends C {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.C
    public final int a(int i5) {
        return i5 + 1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.C
    public final int b(int i5) {
        String strP;
        String str = this.f;
        int length = str.length();
        if (i5 >= 0 && i5 <= length) {
            while (i5 < length) {
                if (str.charAt(i5) == '.') {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        if (i5 < 0) {
            strP = AbstractC0335s.p("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (length < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            strP = AbstractC0335s.p("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(length));
        }
        throw new IndexOutOfBoundsException(strP);
    }
}
