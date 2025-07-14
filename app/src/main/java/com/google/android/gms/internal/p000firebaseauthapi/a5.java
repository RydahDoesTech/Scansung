package com.google.android.gms.internal.p000firebaseauthapi;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import k.Q0;
import s.C0821c;
import s.C0822d;
import s.e;
import s.g;
import s.j;
import t.C0870b;
import u.p;

/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public int f5424a;

    /* renamed from: b, reason: collision with root package name */
    public int f5425b;

    /* renamed from: c, reason: collision with root package name */
    public int f5426c;

    /* renamed from: d, reason: collision with root package name */
    public int f5427d;

    /* renamed from: e, reason: collision with root package name */
    public int f5428e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5429g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5430h;

    public /* synthetic */ a5(byte[] bArr, int i5) {
        this.f = Integer.MAX_VALUE;
        this.f5430h = bArr;
        this.f5425b = i5;
        this.f5427d = 0;
    }

    public static boolean a(int i5, int i6, int i7) {
        if (i5 == i6) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i7 == size;
        }
        return false;
    }

    public static int k(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    public static long l(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    public void b(C0822d c0822d, C0870b c0870b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i5;
        int iMin;
        boolean z4;
        int baseline;
        int i6;
        if (c0822d == null) {
            return;
        }
        if (c0822d.f8635a0 == 8) {
            c0870b.f8913e = 0;
            c0870b.f = 0;
            c0870b.f8914g = 0;
            return;
        }
        if (c0822d.f8621N == null) {
            return;
        }
        int i7 = c0870b.f8909a;
        int i8 = c0870b.f8910b;
        int i9 = c0870b.f8911c;
        int i10 = c0870b.f8912d;
        int i11 = this.f5424a + this.f5425b;
        int i12 = this.f5426c;
        View view = c0822d.f8633Z;
        int iC = Q0.c(i7);
        C0821c c0821c = c0822d.E;
        C0821c c0821c2 = c0822d.f8611C;
        if (iC == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else if (iC == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5428e, i12, -2);
        } else if (iC != 2) {
            iMakeMeasureSpec = iC != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.f5428e, c0821c2.f8606g + c0821c.f8606g + i12, -1);
        } else {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5428e, i12, -2);
            boolean z5 = c0822d.f8653l == 1;
            int i13 = c0870b.f8917j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredHeight() == c0822d.k();
                if (c0870b.f8917j == 2 || !z5 || ((z5 && z6) || c0822d.w())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0822d.n(), 1073741824);
                }
            }
        }
        int iC2 = Q0.c(i8);
        if (iC2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (iC2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
        } else if (iC2 != 2) {
            iMakeMeasureSpec2 = iC2 != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.f, c0822d.f8612D.f8606g + c0822d.f8613F.f8606g + i11, -1);
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
            boolean z7 = c0822d.f8654m == 1;
            int i14 = c0870b.f8917j;
            if (i14 == 1 || i14 == 2) {
                boolean z8 = view.getMeasuredWidth() == c0822d.n();
                if (c0870b.f8917j == 2 || !z7 || ((z7 && z8) || c0822d.x())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0822d.k(), 1073741824);
                }
            }
        }
        e eVar = (e) c0822d.f8621N;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f5430h;
        if (eVar != null && j.c(constraintLayout.f3535l, 256) && view.getMeasuredWidth() == c0822d.n() && view.getMeasuredWidth() < eVar.n() && view.getMeasuredHeight() == c0822d.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == c0822d.f8628U && !c0822d.v() && a(c0822d.f8609A, iMakeMeasureSpec, c0822d.n()) && a(c0822d.f8610B, iMakeMeasureSpec2, c0822d.k())) {
            c0870b.f8913e = c0822d.n();
            c0870b.f = c0822d.k();
            c0870b.f8914g = c0822d.f8628U;
            return;
        }
        boolean z9 = i7 == 3;
        boolean z10 = i8 == 3;
        boolean z11 = i8 == 4 || i8 == 1;
        boolean z12 = i7 == 4 || i7 == 1;
        boolean z13 = z9 && c0822d.f8624Q > 0.0f;
        boolean z14 = z10 && c0822d.f8624Q > 0.0f;
        if (view == null) {
            return;
        }
        u.e eVar2 = (u.e) view.getLayoutParams();
        int i15 = c0870b.f8917j;
        if (i15 != 1 && i15 != 2 && z9 && c0822d.f8653l == 0 && z10 && c0822d.f8654m == 0) {
            i6 = -1;
            baseline = 0;
            z4 = false;
            iMin = 0;
            iMax = 0;
        } else {
            if ((view instanceof p) && (c0822d instanceof g)) {
                ((p) view).i((g) c0822d, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c0822d.f8609A = iMakeMeasureSpec;
            c0822d.f8610B = iMakeMeasureSpec2;
            c0822d.f8645g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i16 = c0822d.f8655o;
            iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
            int i17 = c0822d.f8656p;
            if (i17 > 0) {
                iMax = Math.min(i17, iMax);
            }
            int i18 = c0822d.f8658r;
            if (i18 > 0) {
                iMin = Math.max(i18, measuredHeight);
                i5 = iMakeMeasureSpec;
            } else {
                i5 = iMakeMeasureSpec;
                iMin = measuredHeight;
            }
            int i19 = c0822d.f8659s;
            if (i19 > 0) {
                iMin = Math.min(i19, iMin);
            }
            if (!j.c(constraintLayout.f3535l, 1)) {
                if (z13 && z11) {
                    iMax = (int) ((iMin * c0822d.f8624Q) + 0.5f);
                } else if (z14 && z12) {
                    iMin = (int) ((iMax / c0822d.f8624Q) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMin) {
                baseline = baseline2;
                i6 = -1;
                z4 = false;
            } else {
                int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i5;
                if (measuredHeight != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                c0822d.f8609A = iMakeMeasureSpec3;
                c0822d.f8610B = iMakeMeasureSpec2;
                z4 = false;
                c0822d.f8645g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMin = measuredHeight2;
                i6 = -1;
            }
        }
        boolean z15 = baseline != i6 ? true : z4;
        if (iMax != c0870b.f8911c || iMin != c0870b.f8912d) {
            z4 = true;
        }
        c0870b.f8916i = z4;
        boolean z16 = eVar2.f9015X ? true : z15;
        if (z16 && baseline != -1 && c0822d.f8628U != baseline) {
            c0870b.f8916i = true;
        }
        c0870b.f8913e = iMax;
        c0870b.f = iMin;
        c0870b.f8915h = z16;
        c0870b.f8914g = baseline;
    }

    public int c(int i5) {
        if (i5 < 0) {
            throw C0258f.c();
        }
        int i6 = i5 + this.f5427d;
        if (i6 < 0) {
            throw C0258f.d();
        }
        int i7 = this.f;
        if (i6 > i7) {
            throw C0258f.e();
        }
        this.f = i6;
        int i8 = this.f5425b + this.f5426c;
        this.f5425b = i8;
        if (i8 > i6) {
            int i9 = i8 - i6;
            this.f5426c = i9;
            this.f5425b = i8 - i9;
        } else {
            this.f5426c = 0;
        }
        return i7;
    }

    public int d() throws C0258f {
        int i5 = this.f5427d;
        if (this.f5425b - i5 < 4) {
            throw C0258f.e();
        }
        this.f5427d = i5 + 4;
        byte[] bArr = (byte[]) this.f5430h;
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }

    public int e() {
        int i5;
        int i6 = this.f5427d;
        int i7 = this.f5425b;
        if (i7 != i6) {
            int i8 = i6 + 1;
            byte[] bArr = (byte[]) this.f5430h;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                this.f5427d = i8;
                return b2;
            }
            if (i7 - i8 >= 9) {
                int i9 = i6 + 2;
                int i10 = (bArr[i8] << 7) ^ b2;
                if (i10 < 0) {
                    i5 = i10 ^ (-128);
                } else {
                    int i11 = i6 + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    if (i12 >= 0) {
                        i5 = i12 ^ 16256;
                    } else {
                        int i13 = i6 + 4;
                        int i14 = i12 ^ (bArr[i11] << 21);
                        if (i14 < 0) {
                            i5 = (-2080896) ^ i14;
                        } else {
                            i11 = i6 + 5;
                            byte b5 = bArr[i13];
                            int i15 = (i14 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i13 = i6 + 6;
                                if (bArr[i11] < 0) {
                                    i11 = i6 + 7;
                                    if (bArr[i13] < 0) {
                                        i13 = i6 + 8;
                                        if (bArr[i11] < 0) {
                                            i11 = i6 + 9;
                                            if (bArr[i13] < 0) {
                                                int i16 = i6 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i9 = i16;
                                                    i5 = i15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i15;
                            }
                            i5 = i15;
                        }
                        i9 = i13;
                    }
                    i9 = i11;
                }
                this.f5427d = i9;
                return i5;
            }
        }
        return (int) i();
    }

    public int f() throws C0258f {
        if (j()) {
            this.f5428e = 0;
            return 0;
        }
        int iE = e();
        this.f5428e = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new C0258f("Protocol message contained an invalid tag (zero).");
    }

    public long g() throws C0258f {
        int i5 = this.f5427d;
        if (this.f5425b - i5 < 8) {
            throw C0258f.e();
        }
        this.f5427d = i5 + 8;
        byte[] bArr = (byte[]) this.f5430h;
        return ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    public long h() {
        long j5;
        long j6;
        long j7;
        int i5 = this.f5427d;
        int i6 = this.f5425b;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = (byte[]) this.f5430h;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                this.f5427d = i7;
                return b2;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b2;
                if (i9 < 0) {
                    j5 = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        j5 = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            long j8 = (-2080896) ^ i13;
                            i8 = i12;
                            j5 = j8;
                        } else {
                            i10 = i5 + 5;
                            long j9 = (bArr[i12] << 28) ^ i13;
                            if (j9 >= 0) {
                                j7 = 266354560;
                            } else {
                                int i14 = i5 + 6;
                                long j10 = j9 ^ (bArr[i10] << 35);
                                if (j10 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i10 = i5 + 7;
                                    j9 = j10 ^ (bArr[i14] << 42);
                                    if (j9 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i14 = i5 + 8;
                                        j10 = j9 ^ (bArr[i10] << 49);
                                        if (j10 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i10 = i5 + 9;
                                            long j11 = (j10 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    j5 = j11;
                                                    i8 = i15;
                                                }
                                            } else {
                                                j5 = j11;
                                            }
                                        }
                                    }
                                }
                                j5 = j10 ^ j6;
                                i8 = i14;
                            }
                            j5 = j9 ^ j7;
                        }
                    }
                    i8 = i10;
                }
                this.f5427d = i8;
                return j5;
            }
        }
        return i();
    }

    public long i() throws C0258f {
        long j5 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int i6 = this.f5427d;
            if (i6 == this.f5425b) {
                throw C0258f.e();
            }
            this.f5427d = i6 + 1;
            j5 |= (r3 & Byte.MAX_VALUE) << i5;
            if ((((byte[]) this.f5430h)[i6] & 128) == 0) {
                return j5;
            }
        }
        throw new C0258f("CodedInputStream encountered a malformed varint.");
    }

    public boolean j() {
        return this.f5427d == this.f5425b;
    }

    public a5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5430h = constraintLayout;
        this.f5429g = constraintLayout2;
    }
}
