package O1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1912a;

    public a(float f) {
        this.f1912a = f;
    }

    @Override // O1.c
    public final float a(RectF rectF) {
        return this.f1912a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1912a == ((a) obj).f1912a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1912a)});
    }
}
