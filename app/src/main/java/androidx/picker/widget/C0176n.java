package androidx.picker.widget;

/* renamed from: androidx.picker.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176n implements InterfaceC0181t, v, r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeslDatePickerSpinnerLayout f4484a;

    public /* synthetic */ C0176n(SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout) {
        this.f4484a = seslDatePickerSpinnerLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // androidx.picker.widget.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(androidx.picker.widget.SeslNumberPicker r8, int r9, int r10) throws java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.C0176n.a(androidx.picker.widget.SeslNumberPicker, int, int):void");
    }

    @Override // androidx.picker.widget.InterfaceC0181t
    public void b(boolean z4) {
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4484a;
        seslDatePickerSpinnerLayout.d(z4);
        if (seslDatePickerSpinnerLayout.f4395d == z4 || z4) {
            return;
        }
        SeslNumberPicker seslNumberPicker = seslDatePickerSpinnerLayout.f4403m;
        if (seslNumberPicker.f4417d.f4110h0) {
            seslNumberPicker.setEditTextMode(false);
        }
        SeslNumberPicker seslNumberPicker2 = seslDatePickerSpinnerLayout.n;
        if (seslNumberPicker2.f4417d.f4110h0) {
            seslNumberPicker2.setEditTextMode(false);
        }
        SeslNumberPicker seslNumberPicker3 = seslDatePickerSpinnerLayout.f4404o;
        if (seslNumberPicker3.f4417d.f4110h0) {
            seslNumberPicker3.setEditTextMode(false);
        }
    }
}
