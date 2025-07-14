package X;

import android.text.Editable;
import androidx.emoji2.text.r;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2649a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f2650b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f2651c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2651c;
        return cls != null ? new r(cls, charSequence) : super.newEditable(charSequence);
    }
}
