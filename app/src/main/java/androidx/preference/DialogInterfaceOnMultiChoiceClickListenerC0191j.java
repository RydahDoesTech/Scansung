package androidx.preference;

import android.content.DialogInterface;

/* renamed from: androidx.preference.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC0191j implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0192k f4668a;

    public DialogInterfaceOnMultiChoiceClickListenerC0191j(C0192k c0192k) {
        this.f4668a = c0192k;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i5, boolean z4) {
        C0192k c0192k = this.f4668a;
        if (z4) {
            c0192k.f4670m |= c0192k.f4669l.add(c0192k.f4671o[i5].toString());
        } else {
            c0192k.f4670m |= c0192k.f4669l.remove(c0192k.f4671o[i5].toString());
        }
    }
}
