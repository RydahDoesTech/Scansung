package C1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import j0.C0530V;
import j0.C0553v;
import j0.C0555x;

/* loaded from: classes.dex */
public final class c extends C0553v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f341q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f342r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Context context, int i5) {
        super(context);
        this.f341q = i5;
        this.f342r = obj;
    }

    @Override // j0.C0553v
    public int b(View view, int i5) {
        switch (this.f341q) {
            case 0:
                ((CarouselLayoutManager) this.f342r).getClass();
                return 0;
            default:
                return super.b(view, i5);
        }
    }

    @Override // j0.C0553v
    public int c(View view, int i5) {
        switch (this.f341q) {
            case 0:
                ((CarouselLayoutManager) this.f342r).getClass();
                return 0;
            default:
                return super.c(view, i5);
        }
    }

    @Override // j0.C0553v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f341q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // j0.C0553v
    public int e(int i5) {
        switch (this.f341q) {
            case 1:
                return Math.min(100, super.e(i5));
            default:
                return super.e(i5);
        }
    }

    @Override // j0.C0553v
    public PointF f(int i5) {
        switch (this.f341q) {
            case 0:
                ((CarouselLayoutManager) this.f342r).getClass();
                return null;
            default:
                return super.f(i5);
        }
    }

    @Override // j0.C0553v
    public void h(View view, C0530V c0530v) {
        switch (this.f341q) {
            case 1:
                C0555x c0555x = (C0555x) this.f342r;
                int[] iArrB = c0555x.b(c0555x.f7315a.getLayoutManager(), view);
                int i5 = iArrB[0];
                int i6 = iArrB[1];
                int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i5), Math.abs(i6))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f7308j;
                    c0530v.f7094a = i5;
                    c0530v.f7095b = i6;
                    c0530v.f7096c = iCeil;
                    c0530v.f7098e = decelerateInterpolator;
                    c0530v.f = true;
                    break;
                }
                break;
            default:
                super.h(view, c0530v);
                break;
        }
    }
}
