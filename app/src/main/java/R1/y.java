package R1;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class y implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2482e;

    public /* synthetic */ y(int i5, Object obj) {
        this.f2481d = i5;
        this.f2482e = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i5, int i6, int i7, CharSequence charSequence) {
    }

    private final void c(int i5, int i6, int i7, CharSequence charSequence) {
    }

    private final void d(int i5, int i6, int i7, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f2481d) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.f2482e;
                textInputLayout.u(!textInputLayout.f5991E0, false);
                if (textInputLayout.n) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f6037v) {
                    textInputLayout.v(editable);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        int i8 = this.f2481d;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        switch (this.f2481d) {
            case 0:
                break;
            default:
                androidx.databinding.h hVar = (androidx.databinding.h) this.f2482e;
                if (hVar != null) {
                    hVar.onChange();
                    break;
                }
                break;
        }
    }
}
