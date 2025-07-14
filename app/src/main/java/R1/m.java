package R1;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f2400a;

    public m(o oVar) {
        this.f2400a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f2400a;
        if (oVar.f2419v == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f2419v;
        l lVar = oVar.f2422y;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (oVar.f2419v.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f2419v.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f2419v = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        oVar.b().m(oVar.f2419v);
        oVar.j(oVar.b());
    }
}
