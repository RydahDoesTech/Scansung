package O1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f1913a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1914b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1913a;
            f += ((b) cVar).f1914b;
        }
        this.f1913a = cVar;
        this.f1914b = f;
    }

    @Override // O1.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1913a.a(rectF) + this.f1914b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1913a.equals(bVar.f1913a) && this.f1914b == bVar.f1914b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1913a, Float.valueOf(this.f1914b)});
    }
}
