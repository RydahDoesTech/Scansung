package R1;

import android.text.Editable;

/* loaded from: classes.dex */
public final class l extends I1.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f2399d;

    public l(o oVar) {
        this.f2399d = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2399d.b().a();
    }

    @Override // I1.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        this.f2399d.b().b();
    }
}
