package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import s.C0822d;
import s.g;
import t.C0870b;
import u.o;
import u.p;

/* loaded from: classes.dex */
public class Flow extends p {

    /* renamed from: m, reason: collision with root package name */
    public final g f3527m;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8986d = new int[32];
        this.f8991j = new HashMap();
        this.f = context;
        super.f(attributeSet);
        g gVar = new g();
        gVar.m0 = 0;
        gVar.n0 = 0;
        gVar.o0 = 0;
        gVar.p0 = 0;
        gVar.q0 = 0;
        gVar.f8713r0 = 0;
        gVar.f8714s0 = false;
        gVar.t0 = 0;
        gVar.f8715u0 = 0;
        gVar.f8716v0 = new C0870b();
        gVar.f8717w0 = null;
        gVar.f8718x0 = -1;
        gVar.f8719y0 = -1;
        gVar.f8720z0 = -1;
        gVar.A0 = -1;
        gVar.f8694B0 = -1;
        gVar.f8695C0 = -1;
        gVar.f8696D0 = 0.5f;
        gVar.f8697E0 = 0.5f;
        gVar.f8698F0 = 0.5f;
        gVar.f8699G0 = 0.5f;
        gVar.f8700H0 = 0.5f;
        gVar.f8701I0 = 0.5f;
        gVar.f8702J0 = 0;
        gVar.f8703K0 = 0;
        gVar.f8704L0 = 2;
        gVar.f8705M0 = 2;
        gVar.N0 = 0;
        gVar.f8706O0 = -1;
        gVar.f8707P0 = 0;
        gVar.f8708Q0 = new ArrayList();
        gVar.f8709R0 = null;
        gVar.f8710S0 = null;
        gVar.f8711T0 = null;
        gVar.V0 = 0;
        this.f3527m = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f9146b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 0) {
                    this.f3527m.f8707P0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f3527m;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.m0 = dimensionPixelSize;
                    gVar2.n0 = dimensionPixelSize;
                    gVar2.o0 = dimensionPixelSize;
                    gVar2.p0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar3 = this.f3527m;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.o0 = dimensionPixelSize2;
                    gVar3.q0 = dimensionPixelSize2;
                    gVar3.f8713r0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f3527m.p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f3527m.q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f3527m.m0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f3527m.f8713r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f3527m.n0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 38) {
                    this.f3527m.N0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 28) {
                    this.f3527m.f8718x0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 37) {
                    this.f3527m.f8719y0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 22) {
                    this.f3527m.f8720z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 30) {
                    this.f3527m.f8694B0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 24) {
                    this.f3527m.A0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 32) {
                    this.f3527m.f8695C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 26) {
                    this.f3527m.f8696D0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 21) {
                    this.f3527m.f8698F0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 29) {
                    this.f3527m.f8700H0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 23) {
                    this.f3527m.f8699G0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 31) {
                    this.f3527m.f8701I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 35) {
                    this.f3527m.f8697E0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 25) {
                    this.f3527m.f8704L0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 34) {
                    this.f3527m.f8705M0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 27) {
                    this.f3527m.f8702J0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 36) {
                    this.f3527m.f8703K0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 33) {
                    this.f3527m.f8706O0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8988g = this.f3527m;
        h();
    }

    @Override // u.c
    public final void g(C0822d c0822d, boolean z4) {
        g gVar = this.f3527m;
        int i5 = gVar.o0;
        if (i5 > 0 || gVar.p0 > 0) {
            if (z4) {
                gVar.q0 = gVar.p0;
                gVar.f8713r0 = i5;
            } else {
                gVar.q0 = i5;
                gVar.f8713r0 = gVar.p0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00ce A[EDGE_INSN: B:334:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    @Override // u.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(s.g r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.i(s.g, int, int):void");
    }

    @Override // u.c, android.view.View
    public final void onMeasure(int i5, int i6) {
        i(this.f3527m, i5, i6);
    }

    public void setFirstHorizontalBias(float f) {
        this.f3527m.f8698F0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i5) {
        this.f3527m.f8720z0 = i5;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f3527m.f8699G0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i5) {
        this.f3527m.A0 = i5;
        requestLayout();
    }

    public void setHorizontalAlign(int i5) {
        this.f3527m.f8704L0 = i5;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f3527m.f8696D0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i5) {
        this.f3527m.f8702J0 = i5;
        requestLayout();
    }

    public void setHorizontalStyle(int i5) {
        this.f3527m.f8718x0 = i5;
        requestLayout();
    }

    public void setMaxElementsWrap(int i5) {
        this.f3527m.f8706O0 = i5;
        requestLayout();
    }

    public void setOrientation(int i5) {
        this.f3527m.f8707P0 = i5;
        requestLayout();
    }

    public void setPadding(int i5) {
        g gVar = this.f3527m;
        gVar.m0 = i5;
        gVar.n0 = i5;
        gVar.o0 = i5;
        gVar.p0 = i5;
        requestLayout();
    }

    public void setPaddingBottom(int i5) {
        this.f3527m.n0 = i5;
        requestLayout();
    }

    public void setPaddingLeft(int i5) {
        this.f3527m.q0 = i5;
        requestLayout();
    }

    public void setPaddingRight(int i5) {
        this.f3527m.f8713r0 = i5;
        requestLayout();
    }

    public void setPaddingTop(int i5) {
        this.f3527m.m0 = i5;
        requestLayout();
    }

    public void setVerticalAlign(int i5) {
        this.f3527m.f8705M0 = i5;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f3527m.f8697E0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i5) {
        this.f3527m.f8703K0 = i5;
        requestLayout();
    }

    public void setVerticalStyle(int i5) {
        this.f3527m.f8719y0 = i5;
        requestLayout();
    }

    public void setWrapMode(int i5) {
        this.f3527m.N0 = i5;
        requestLayout();
    }
}
