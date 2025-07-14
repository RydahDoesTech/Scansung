package S;

import K.h;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2502a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2503b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2504c;

    /* renamed from: d, reason: collision with root package name */
    public final b4.d f2505d;

    public c(boolean z4, b4.d dVar) {
        this.f2504c = z4;
        this.f2505d = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f2505d.getClass();
        Rect rect = this.f2502a;
        ((h) obj).e(rect);
        Rect rect2 = this.f2503b;
        ((h) obj2).e(rect2);
        int i5 = rect.top;
        int i6 = rect2.top;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.left;
        int i8 = rect2.left;
        boolean z4 = this.f2504c;
        if (i7 < i8) {
            return z4 ? 1 : -1;
        }
        if (i7 > i8) {
            return z4 ? -1 : 1;
        }
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        if (i9 < i10) {
            return -1;
        }
        if (i9 > i10) {
            return 1;
        }
        int i11 = rect.right;
        int i12 = rect2.right;
        if (i11 < i12) {
            return z4 ? 1 : -1;
        }
        if (i11 > i12) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
