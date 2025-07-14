package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f9124a;

    /* renamed from: b, reason: collision with root package name */
    public int f9125b;

    /* renamed from: c, reason: collision with root package name */
    public float f9126c;

    /* renamed from: d, reason: collision with root package name */
    public float f9127d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 1) {
                this.f9126c = typedArrayObtainStyledAttributes.getFloat(index, this.f9126c);
            } else if (index == 0) {
                int i6 = typedArrayObtainStyledAttributes.getInt(index, this.f9124a);
                this.f9124a = i6;
                this.f9124a = l.f9140d[i6];
            } else if (index == 4) {
                this.f9125b = typedArrayObtainStyledAttributes.getInt(index, this.f9125b);
            } else if (index == 3) {
                this.f9127d = typedArrayObtainStyledAttributes.getFloat(index, this.f9127d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
