package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: Z, reason: collision with root package name */
    public final CharSequence f4524Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f4525a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Drawable f4526b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f4527c0;

    /* renamed from: d0, reason: collision with root package name */
    public final String f4528d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f4529e0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4556b, i5, i6);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f4524Z = string;
        if (string == null) {
            this.f4524Z = this.f4607k;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f4525a0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f4526b0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f4527c0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f4528d0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f4529e0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void o() {
        z zVar = this.f4602e.f4543i;
        if (zVar != null) {
            zVar.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A.b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), 0);
    }
}
