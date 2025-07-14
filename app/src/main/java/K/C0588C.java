package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.wssyncmldm.R;

/* renamed from: k.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588C extends RatingBar {

    /* renamed from: d, reason: collision with root package name */
    public final C0586A f7478d;

    public C0588C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        v1.a(this, getContext());
        C0586A c0586a = new C0586A();
        this.f7478d = c0586a;
        D3.c cVarL = D3.c.l(getContext(), attributeSet, C0586A.f7467e, R.attr.ratingBarStyle);
        Drawable drawableH = cVarL.h(0);
        if (drawableH != null) {
            if (drawableH instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableH;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i5 = 0; i5 < numberOfFrames; i5++) {
                    Drawable drawableE = c0586a.e(animationDrawable.getFrame(i5), true);
                    drawableE.setLevel(IDMCallbackStatusInterface.IDM_RESULTS);
                    animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i5));
                }
                animationDrawable2.setLevel(IDMCallbackStatusInterface.IDM_RESULTS);
                drawableH = animationDrawable2;
            }
            setIndeterminateDrawable(drawableH);
        }
        Drawable drawableH2 = cVarL.h(1);
        if (drawableH2 != null) {
            setProgressDrawable(c0586a.e(drawableH2, false));
        }
        cVarL.m();
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        Bitmap bitmap = (Bitmap) this.f7478d.f7468d;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i5, 0), getMeasuredHeight());
        }
    }
}
