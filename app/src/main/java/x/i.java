package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final EditText f2665d;

    /* renamed from: e, reason: collision with root package name */
    public h f2666e;
    public boolean f = true;

    public i(EditText editText) {
        this.f2665d = editText;
    }

    public static void a(EditText editText, int i5) {
        int length;
        if (i5 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                iVarA.getClass();
                length = editableText.length();
            }
            iVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        EditText editText = this.f2665d;
        if (editText.isInEditMode() || !this.f || androidx.emoji2.text.i.f3654j == null || i6 > i7 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = androidx.emoji2.text.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                androidx.emoji2.text.i.a().e((Spannable) charSequence, i5, i7 + i5);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
        if (this.f2666e == null) {
            this.f2666e = new h(editText);
        }
        iVarA.f(this.f2666e);
    }
}
