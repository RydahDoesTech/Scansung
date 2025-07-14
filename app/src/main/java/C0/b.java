package C0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D1.a f269a;

    public b(D1.a aVar) {
        this.f269a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f269a.f468b.f483r;
        if (colorStateList != null) {
            C.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        D1.c cVar = this.f269a.f468b;
        ColorStateList colorStateList = cVar.f483r;
        if (colorStateList != null) {
            C.a.g(drawable, colorStateList.getColorForState(cVar.f487v, colorStateList.getDefaultColor()));
        }
    }
}
