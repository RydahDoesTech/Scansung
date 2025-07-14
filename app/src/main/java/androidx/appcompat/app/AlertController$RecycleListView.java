package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import c.AbstractC0220a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final int f3175d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3176e;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5130u);
        this.f3176e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f3175d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
