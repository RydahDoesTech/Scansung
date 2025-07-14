package j0;

import android.view.View;

/* renamed from: j0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549r {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.f f7278a;

    /* renamed from: b, reason: collision with root package name */
    public int f7279b;

    /* renamed from: c, reason: collision with root package name */
    public int f7280c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7281d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7282e;

    public C0549r() {
        d();
    }

    public final void a() {
        this.f7280c = this.f7281d ? this.f7278a.g() : this.f7278a.k();
    }

    public final void b(int i5, View view) {
        if (this.f7281d) {
            this.f7280c = this.f7278a.m() + this.f7278a.b(view);
        } else {
            this.f7280c = this.f7278a.e(view);
        }
        this.f7279b = i5;
    }

    public final void c(int i5, View view) {
        int iM = this.f7278a.m();
        if (iM >= 0) {
            b(i5, view);
            return;
        }
        this.f7279b = i5;
        if (!this.f7281d) {
            int iE = this.f7278a.e(view);
            int iK = iE - this.f7278a.k();
            this.f7280c = iE;
            if (iK > 0) {
                int iG = (this.f7278a.g() - Math.min(0, (this.f7278a.g() - iM) - this.f7278a.b(view))) - (this.f7278a.c(view) + iE);
                if (iG < 0) {
                    this.f7280c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f7278a.g() - iM) - this.f7278a.b(view);
        this.f7280c = this.f7278a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f7280c - this.f7278a.c(view);
            int iK2 = this.f7278a.k();
            int iMin = iC - (Math.min(this.f7278a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f7280c = Math.min(iG2, -iMin) + this.f7280c;
            }
        }
    }

    public final void d() {
        this.f7279b = -1;
        this.f7280c = Integer.MIN_VALUE;
        this.f7281d = false;
        this.f7282e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f7279b + ", mCoordinate=" + this.f7280c + ", mLayoutFromEnd=" + this.f7281d + ", mValid=" + this.f7282e + '}';
    }
}
