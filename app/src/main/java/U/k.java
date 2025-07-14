package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f9128m;

    /* renamed from: a, reason: collision with root package name */
    public float f9129a;

    /* renamed from: b, reason: collision with root package name */
    public float f9130b;

    /* renamed from: c, reason: collision with root package name */
    public float f9131c;

    /* renamed from: d, reason: collision with root package name */
    public float f9132d;

    /* renamed from: e, reason: collision with root package name */
    public float f9133e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f9134g;

    /* renamed from: h, reason: collision with root package name */
    public float f9135h;

    /* renamed from: i, reason: collision with root package name */
    public float f9136i;

    /* renamed from: j, reason: collision with root package name */
    public float f9137j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9138k;

    /* renamed from: l, reason: collision with root package name */
    public float f9139l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9128m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f9151h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            switch (f9128m.get(index)) {
                case 1:
                    this.f9129a = typedArrayObtainStyledAttributes.getFloat(index, this.f9129a);
                    break;
                case 2:
                    this.f9130b = typedArrayObtainStyledAttributes.getFloat(index, this.f9130b);
                    break;
                case 3:
                    this.f9131c = typedArrayObtainStyledAttributes.getFloat(index, this.f9131c);
                    break;
                case 4:
                    this.f9132d = typedArrayObtainStyledAttributes.getFloat(index, this.f9132d);
                    break;
                case 5:
                    this.f9133e = typedArrayObtainStyledAttributes.getFloat(index, this.f9133e);
                    break;
                case 6:
                    this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.f9134g = typedArrayObtainStyledAttributes.getDimension(index, this.f9134g);
                    break;
                case 8:
                    this.f9135h = typedArrayObtainStyledAttributes.getDimension(index, this.f9135h);
                    break;
                case 9:
                    this.f9136i = typedArrayObtainStyledAttributes.getDimension(index, this.f9136i);
                    break;
                case 10:
                    this.f9137j = typedArrayObtainStyledAttributes.getDimension(index, this.f9137j);
                    break;
                case 11:
                    this.f9138k = true;
                    this.f9139l = typedArrayObtainStyledAttributes.getDimension(index, this.f9139l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
