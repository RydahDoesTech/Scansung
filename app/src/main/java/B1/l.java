package b1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f5051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5053c;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public l(String str, String str2) {
        AbstractC0203C.c(str);
        this.f5051a = str;
        AbstractC0203C.c(str2);
        this.f5052b = str2;
        this.f5053c = 129;
    }

    public final Intent a(Context context) {
        String str = this.f5051a;
        return str != null ? new Intent(str).setPackage(this.f5052b) : new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC0203C.h(this.f5051a, lVar.f5051a) && AbstractC0203C.h(this.f5052b, lVar.f5052b) && AbstractC0203C.h(null, null) && this.f5053c == lVar.f5053c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f5053c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{this.f5051a, this.f5052b, null, numValueOf, bool});
    }

    public final String toString() {
        String str = this.f5051a;
        str.getClass();
        return str;
    }
}
