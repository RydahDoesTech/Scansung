package androidx.room;

import java.util.Collections;
import java.util.Set;
import o.C0705c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4888a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4889b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f4890c;

    /* renamed from: d, reason: collision with root package name */
    public final f f4891d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f4892e;

    public e(f fVar, int[] iArr, String[] strArr, long[] jArr) {
        this.f4891d = fVar;
        this.f4888a = iArr;
        this.f4889b = strArr;
        this.f4890c = jArr;
        if (iArr.length != 1) {
            this.f4892e = null;
            return;
        }
        C0705c c0705c = new C0705c(0);
        c0705c.add(strArr[0]);
        this.f4892e = Collections.unmodifiableSet(c0705c);
    }

    public final void a(long[] jArr) {
        int[] iArr = this.f4888a;
        int length = iArr.length;
        Set c0705c = null;
        for (int i5 = 0; i5 < length; i5++) {
            long j5 = jArr[iArr[i5]];
            long[] jArr2 = this.f4890c;
            if (jArr2[i5] < j5) {
                jArr2[i5] = j5;
                if (length == 1) {
                    c0705c = this.f4892e;
                } else {
                    if (c0705c == null) {
                        c0705c = new C0705c(length);
                    }
                    c0705c.add(this.f4889b[i5]);
                }
            }
        }
        if (c0705c != null) {
            this.f4891d.onInvalidated(c0705c);
        }
    }
}
