package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.wssyncmldm.R;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class SeslRingtonePreference extends Preference {
    public SeslRingtonePreference(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, R.attr.ringtonePreferenceStyle, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4563j, R.attr.ringtonePreferenceStyle, 0);
        typedArrayObtainStyledAttributes.getInt(0, 1);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f4611p = new Intent("android.intent.action.RINGTONE_PICKER");
        Method methodR = J2.b.r(UserHandle.class, "hidden_myUserId", new Class[0]);
        if (methodR != null) {
            Object objE = J2.b.E(null, methodR, new Object[0]);
            if (objE instanceof Integer) {
                ((Integer) objE).getClass();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i5) {
        return typedArray.getString(i5);
    }

    @Override // androidx.preference.Preference
    public final void u(Object obj, boolean z4) {
        String str = (String) obj;
        if (z4 || TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        w(uri != null ? uri.toString() : "");
    }
}
