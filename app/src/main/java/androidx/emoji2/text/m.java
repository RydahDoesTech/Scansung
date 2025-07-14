package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f3668a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final p f3669b;

    /* renamed from: c, reason: collision with root package name */
    public p f3670c;

    /* renamed from: d, reason: collision with root package name */
    public p f3671d;

    /* renamed from: e, reason: collision with root package name */
    public int f3672e;
    public int f;

    public m(p pVar) {
        this.f3669b = pVar;
        this.f3670c = pVar;
    }

    public final int a(int i5) {
        SparseArray sparseArray = this.f3670c.f3681a;
        p pVar = sparseArray == null ? null : (p) sparseArray.get(i5);
        int i6 = 1;
        int i7 = 2;
        if (this.f3668a == 2) {
            if (pVar != null) {
                this.f3670c = pVar;
                this.f++;
            } else if (i5 == 65038) {
                b();
            } else if (i5 != 65039) {
                p pVar2 = this.f3670c;
                if (pVar2.f3682b != null) {
                    i7 = 3;
                    if (this.f != 1) {
                        this.f3671d = pVar2;
                        b();
                    } else if (c()) {
                        this.f3671d = this.f3670c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i6 = i7;
        } else if (pVar == null) {
            b();
        } else {
            this.f3668a = 2;
            this.f3670c = pVar;
            this.f = 1;
            i6 = i7;
        }
        this.f3672e = i5;
        return i6;
    }

    public final void b() {
        this.f3668a = 1;
        this.f3670c = this.f3669b;
        this.f = 0;
    }

    public final boolean c() {
        W.a aVarC = this.f3670c.f3682b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.f1418d).get(iA + aVarC.f1415a) == 0) || this.f3672e == 65039;
    }
}
