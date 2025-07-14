package androidx.picker.widget;

import android.util.SparseArray;

/* renamed from: androidx.picker.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169g extends E0.a {

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f4471c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SeslDatePicker f4472d;

    public C0169g(SeslDatePicker seslDatePicker) {
        this.f4472d = seslDatePicker;
    }

    @Override // E0.a
    public final int b() {
        SeslDatePicker seslDatePicker = this.f4472d;
        int maxYear = ((seslDatePicker.getMaxYear() - seslDatePicker.getMinYear()) * 12) + (seslDatePicker.getMaxMonth() - seslDatePicker.getMinMonth()) + 1;
        seslDatePicker.f4351M = maxYear;
        return maxYear;
    }
}
