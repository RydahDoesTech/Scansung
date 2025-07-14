package k;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import c.AbstractC0220a;
import e1.AbstractC0415a;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f7824a;

    /* renamed from: b, reason: collision with root package name */
    public final B.g f7825b;

    public C0657v(TextView textView) {
        this.f7824a = textView;
        this.f7825b = new B.g(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((AbstractC0415a) this.f7825b.f95e).v(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i5) {
        TypedArray typedArrayObtainStyledAttributes = this.f7824a.getContext().obtainStyledAttributes(attributeSet, AbstractC0220a.f5119i, i5, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z4) {
        ((AbstractC0415a) this.f7825b.f95e).S(z4);
    }

    public final void d(boolean z4) {
        ((AbstractC0415a) this.f7825b.f95e).T(z4);
    }
}
