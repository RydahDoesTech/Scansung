package X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class f extends AbstractC0415a {

    /* renamed from: d, reason: collision with root package name */
    public final TextView f2660d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2661e;
    public boolean f = true;

    public f(TextView textView) {
        this.f2660d = textView;
        this.f2661e = new d(textView);
    }

    @Override // e1.AbstractC0415a
    public final boolean G() {
        return this.f;
    }

    @Override // e1.AbstractC0415a
    public final void S(boolean z4) {
        if (z4) {
            TextView textView = this.f2660d;
            textView.setTransformationMethod(X(textView.getTransformationMethod()));
        }
    }

    @Override // e1.AbstractC0415a
    public final void T(boolean z4) {
        this.f = z4;
        TextView textView = this.f2660d;
        textView.setTransformationMethod(X(textView.getTransformationMethod()));
        textView.setFilters(v(textView.getFilters()));
    }

    @Override // e1.AbstractC0415a
    public final TransformationMethod X(TransformationMethod transformationMethod) {
        return this.f ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f2667a : transformationMethod;
    }

    @Override // e1.AbstractC0415a
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i5 = 0; i5 < inputFilterArr.length; i5++) {
                InputFilter inputFilter = inputFilterArr[i5];
                if (inputFilter instanceof d) {
                    sparseArray.put(i5, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (sparseArray.indexOfKey(i7) < 0) {
                    inputFilterArr2[i6] = inputFilterArr[i7];
                    i6++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i8 = 0;
        while (true) {
            d dVar = this.f2661e;
            if (i8 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i8] == dVar) {
                return inputFilterArr;
            }
            i8++;
        }
    }
}
