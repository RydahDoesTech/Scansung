package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f2652a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.e f2653b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        O1.e eVar = new O1.e(7);
        super(inputConnection, false);
        this.f2652a = editText;
        this.f2653b = eVar;
        if (androidx.emoji2.text.i.f3654j != null) {
            androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
            if (iVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.e eVar2 = iVarA.f3659e;
            eVar2.getClass();
            Bundle bundle = editorInfo.extras;
            W.b bVar = (W.b) eVar2.f3649c.f6168e;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f1418d).getInt(iA + bVar.f1415a) : 0);
            Bundle bundle2 = editorInfo.extras;
            eVar2.f3647a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        Editable editableText = this.f2652a.getEditableText();
        this.f2653b.getClass();
        return O1.e.h(this, editableText, i5, i6, false) || super.deleteSurroundingText(i5, i6);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        Editable editableText = this.f2652a.getEditableText();
        this.f2653b.getClass();
        return O1.e.h(this, editableText, i5, i6, true) || super.deleteSurroundingTextInCodePoints(i5, i6);
    }
}
