package A;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f23a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f24b;

    public j(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f23a = new int[size];
        this.f24b = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            this.f23a[i5] = ((Integer) arrayList.get(i5)).intValue();
            this.f24b[i5] = ((Float) arrayList2.get(i5)).floatValue();
        }
    }

    public j(int i5, int i6) {
        this.f23a = new int[]{i5, i6};
        this.f24b = new float[]{0.0f, 1.0f};
    }

    public j(int i5, int i6, int i7) {
        this.f23a = new int[]{i5, i6, i7};
        this.f24b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j() {
        this.f23a = new int[5];
        this.f24b = new float[5];
    }
}
