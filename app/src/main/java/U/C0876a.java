package u;

import s.C0819a;
import s.C0822d;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876a extends c {

    /* renamed from: k, reason: collision with root package name */
    public int f8978k;

    /* renamed from: l, reason: collision with root package name */
    public int f8979l;

    /* renamed from: m, reason: collision with root package name */
    public C0819a f8980m;

    @Override // u.c
    public final void g(C0822d c0822d, boolean z4) {
        int i5 = this.f8978k;
        this.f8979l = i5;
        if (z4) {
            if (i5 == 5) {
                this.f8979l = 1;
            } else if (i5 == 6) {
                this.f8979l = 0;
            }
        } else if (i5 == 5) {
            this.f8979l = 0;
        } else if (i5 == 6) {
            this.f8979l = 1;
        }
        if (c0822d instanceof C0819a) {
            ((C0819a) c0822d).m0 = this.f8979l;
        }
    }

    public int getMargin() {
        return this.f8980m.o0;
    }

    public int getType() {
        return this.f8978k;
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f8980m.n0 = z4;
    }

    public void setDpMargin(int i5) {
        this.f8980m.o0 = (int) ((i5 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i5) {
        this.f8980m.o0 = i5;
    }

    public void setType(int i5) {
        this.f8978k = i5;
    }
}
