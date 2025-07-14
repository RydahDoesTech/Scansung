package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Y0.h f5864a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.h f5865b;

    public c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(J2.b.V(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, u1.a.n);
        Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListZ = V1.a.z(context, typedArrayObtainStyledAttributes, 7);
        this.f5864a = Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f5865b = Y0.h.c(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListZ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
