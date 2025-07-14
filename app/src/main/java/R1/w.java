package R1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f2470e;
    public EditText f;

    /* renamed from: g, reason: collision with root package name */
    public final E1.u f2471g;

    public w(o oVar, int i5) {
        super(oVar);
        this.f2470e = R.drawable.design_password_eye;
        this.f2471g = new E1.u(3, this);
        if (i5 != 0) {
            this.f2470e = i5;
        }
    }

    @Override // R1.p
    public final void b() {
        q();
    }

    @Override // R1.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // R1.p
    public final int d() {
        return this.f2470e;
    }

    @Override // R1.p
    public final View.OnClickListener f() {
        return this.f2471g;
    }

    @Override // R1.p
    public final boolean k() {
        return true;
    }

    @Override // R1.p
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // R1.p
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // R1.p
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // R1.p
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
