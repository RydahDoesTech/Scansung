package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import q.AbstractC0783a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f9119e;

    /* renamed from: a, reason: collision with root package name */
    public int f9120a;

    /* renamed from: b, reason: collision with root package name */
    public int f9121b;

    /* renamed from: c, reason: collision with root package name */
    public float f9122c;

    /* renamed from: d, reason: collision with root package name */
    public float f9123d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9119e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f9149e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            switch (f9119e.get(index)) {
                case 1:
                    this.f9123d = typedArrayObtainStyledAttributes.getFloat(index, this.f9123d);
                    break;
                case 2:
                    this.f9121b = typedArrayObtainStyledAttributes.getInt(index, this.f9121b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0783a.f8444a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f9120a = l.f(typedArrayObtainStyledAttributes, index, this.f9120a);
                    break;
                case 6:
                    this.f9122c = typedArrayObtainStyledAttributes.getFloat(index, this.f9122c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
