package T1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2552a = {R.attr.theme, com.wssyncmldm.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2553b = {com.wssyncmldm.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i5, int i6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2553b, i5, i6);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z4 = (context instanceof e) && ((e) context).f6862a == resourceId;
        if (resourceId == 0 || z4) {
            return context;
        }
        e eVar = new e(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2552a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            eVar.getTheme().applyStyle(resourceId2, true);
        }
        return eVar;
    }
}
