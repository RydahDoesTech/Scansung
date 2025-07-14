package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class U extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1112g;

    /* renamed from: h, reason: collision with root package name */
    public int f1113h;

    /* renamed from: i, reason: collision with root package name */
    public int f1114i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1115j;

    /* renamed from: k, reason: collision with root package name */
    public V f1116k;

    /* renamed from: l, reason: collision with root package name */
    public List f1117l;

    /* renamed from: m, reason: collision with root package name */
    public List f1118m;

    public static U h() {
        U u4 = new U();
        u4.f1116k = V.INV;
        u4.f1117l = Collections.emptyList();
        u4.f1118m = Collections.emptyList();
        return u4;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        W wG = g();
        if (wG.b()) {
            return wG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        U uH = h();
        uH.i(g());
        return uH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r3, O3.C0077i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            I3.a r1 = I3.W.f1124q     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.W r1 = new I3.W     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.W r4 = (I3.W) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.U.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((W) abstractC0084p);
        return this;
    }

    public final W g() {
        W w3 = new W(this);
        int i5 = this.f1112g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        w3.f1126g = this.f1113h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        w3.f1127h = this.f1114i;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        w3.f1128i = this.f1115j;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        w3.f1129j = this.f1116k;
        if ((i5 & 16) == 16) {
            this.f1117l = Collections.unmodifiableList(this.f1117l);
            this.f1112g &= -17;
        }
        w3.f1130k = this.f1117l;
        if ((this.f1112g & 32) == 32) {
            this.f1118m = Collections.unmodifiableList(this.f1118m);
            this.f1112g &= -33;
        }
        w3.f1131l = this.f1118m;
        w3.f = i6;
        return w3;
    }

    public final void i(W w3) {
        if (w3 == W.f1123p) {
            return;
        }
        int i5 = w3.f;
        if ((i5 & 1) == 1) {
            int i6 = w3.f1126g;
            this.f1112g = 1 | this.f1112g;
            this.f1113h = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = w3.f1127h;
            this.f1112g = 2 | this.f1112g;
            this.f1114i = i7;
        }
        if ((i5 & 4) == 4) {
            boolean z4 = w3.f1128i;
            this.f1112g = 4 | this.f1112g;
            this.f1115j = z4;
        }
        if ((i5 & 8) == 8) {
            V v2 = w3.f1129j;
            v2.getClass();
            this.f1112g = 8 | this.f1112g;
            this.f1116k = v2;
        }
        if (!w3.f1130k.isEmpty()) {
            if (this.f1117l.isEmpty()) {
                this.f1117l = w3.f1130k;
                this.f1112g &= -17;
            } else {
                if ((this.f1112g & 16) != 16) {
                    this.f1117l = new ArrayList(this.f1117l);
                    this.f1112g |= 16;
                }
                this.f1117l.addAll(w3.f1130k);
            }
        }
        if (!w3.f1131l.isEmpty()) {
            if (this.f1118m.isEmpty()) {
                this.f1118m = w3.f1131l;
                this.f1112g &= -33;
            } else {
                if ((this.f1112g & 32) != 32) {
                    this.f1118m = new ArrayList(this.f1118m);
                    this.f1112g |= 32;
                }
                this.f1118m.addAll(w3.f1131l);
            }
        }
        f(w3);
        this.f2081d = this.f2081d.m(w3.f1125e);
    }
}
