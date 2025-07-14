package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class g extends AbstractC0415a {

    /* renamed from: d, reason: collision with root package name */
    public final f f2662d;

    public g(TextView textView) {
        this.f2662d = new f(textView);
    }

    @Override // e1.AbstractC0415a
    public final boolean G() {
        return this.f2662d.f;
    }

    @Override // e1.AbstractC0415a
    public final void S(boolean z4) {
        if (androidx.emoji2.text.i.f3654j != null) {
            this.f2662d.S(z4);
        }
    }

    @Override // e1.AbstractC0415a
    public final void T(boolean z4) {
        boolean z5 = androidx.emoji2.text.i.f3654j != null;
        f fVar = this.f2662d;
        if (z5) {
            fVar.T(z4);
        } else {
            fVar.f = z4;
        }
    }

    @Override // e1.AbstractC0415a
    public final TransformationMethod X(TransformationMethod transformationMethod) {
        return !(androidx.emoji2.text.i.f3654j != null) ? transformationMethod : this.f2662d.X(transformationMethod);
    }

    @Override // e1.AbstractC0415a
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        return !(androidx.emoji2.text.i.f3654j != null) ? inputFilterArr : this.f2662d.v(inputFilterArr);
    }
}
