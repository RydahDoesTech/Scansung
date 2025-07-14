package androidx.picker.widget;

/* loaded from: classes.dex */
public final class P implements v, InterfaceC0181t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f4276b;

    public /* synthetic */ P(T t4, int i5) {
        this.f4275a = i5;
        this.f4276b = t4;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    @Override // androidx.picker.widget.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(androidx.picker.widget.SeslNumberPicker r4, int r5, int r6) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.P.a(androidx.picker.widget.SeslNumberPicker, int, int):void");
    }

    @Override // androidx.picker.widget.InterfaceC0181t
    public void b(boolean z4) {
        T t4 = this.f4276b;
        t4.g(z4);
        if (t4.f4453y == z4 || z4) {
            return;
        }
        SeslNumberPicker seslNumberPicker = t4.f4438i;
        if (seslNumberPicker.f4417d.f4110h0) {
            seslNumberPicker.setEditTextMode(false);
        }
        SeslNumberPicker seslNumberPicker2 = t4.f4439j;
        if (seslNumberPicker2.f4417d.f4110h0) {
            seslNumberPicker2.setEditTextMode(false);
        }
    }
}
