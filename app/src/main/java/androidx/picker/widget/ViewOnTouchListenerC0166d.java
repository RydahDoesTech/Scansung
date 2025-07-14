package androidx.picker.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/* renamed from: androidx.picker.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0166d implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4468e;

    public /* synthetic */ ViewOnTouchListenerC0166d(int i5, Object obj) {
        this.f4467d = i5;
        this.f4468e = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f4467d) {
            case 0:
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return false;
                }
                ((SeslDatePicker) this.f4468e).l();
                return false;
            default:
                if (!(view instanceof EditText) || motionEvent.getActionMasked() != 0) {
                    return false;
                }
                ((EditText) view).selectAll();
                ((D) this.f4468e).x();
                return true;
        }
    }
}
