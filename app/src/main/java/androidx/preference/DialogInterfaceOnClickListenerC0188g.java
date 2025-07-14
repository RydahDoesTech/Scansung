package androidx.preference;

import android.content.DialogInterface;

/* renamed from: androidx.preference.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0188g implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0189h f4662d;

    public DialogInterfaceOnClickListenerC0188g(C0189h c0189h) {
        this.f4662d = c0189h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        C0189h c0189h = this.f4662d;
        c0189h.f4663l = i5;
        c0189h.f4681k = -1;
        dialogInterface.dismiss();
    }
}
