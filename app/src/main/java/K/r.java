package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import c.AbstractC0220a;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f7783a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f7784b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7785c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7786d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7787e;
    public final TextView f;

    public /* synthetic */ r(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableA = O.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f7785c || this.f7786d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f7785c) {
                    C.a.h(drawableMutate, this.f7783a);
                }
                if (this.f7786d) {
                    C.a.i(drawableMutate, this.f7784b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C0648q c0648q = (C0648q) this.f;
        Drawable checkMarkDrawable = c0648q.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f7785c || this.f7786d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f7785c) {
                    C.a.h(drawableMutate, this.f7783a);
                }
                if (this.f7786d) {
                    C.a.i(drawableMutate, this.f7784b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0648q.getDrawableState());
                }
                c0648q.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i5) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0220a.f5123m;
        D3.c cVarL = D3.c.l(context, attributeSet, iArr, i5);
        TypedArray typedArray = (TypedArray) cVarL.f;
        Context context2 = compoundButton.getContext();
        WeakHashMap weakHashMap = J.P.f1421a;
        J.M.d(compoundButton, context2, iArr, attributeSet, (TypedArray) cVarL.f, i5, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0415a.r(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0415a.r(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                O.b.c(compoundButton, cVarL.f(2));
            }
            if (typedArray.hasValue(3)) {
                O.b.d(compoundButton, AbstractC0622g0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            cVarL.m();
        }
    }
}
