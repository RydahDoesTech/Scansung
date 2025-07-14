package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f2667a;

    public j(TransformationMethod transformationMethod) {
        this.f2667a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2667a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.i.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
        iVarA.getClass();
        return iVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i5, Rect rect) {
        TransformationMethod transformationMethod = this.f2667a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i5, rect);
        }
    }
}
