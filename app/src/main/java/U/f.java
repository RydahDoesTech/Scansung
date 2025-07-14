package u;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f9051a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9052b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9053c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9055e;

    public f(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f9051a = Float.NaN;
        this.f9052b = Float.NaN;
        this.f9053c = Float.NaN;
        this.f9054d = Float.NaN;
        this.f9055e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), o.f9152i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f9055e);
                this.f9055e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9054d = typedArrayObtainStyledAttributes.getDimension(index, this.f9054d);
            } else if (index == 2) {
                this.f9052b = typedArrayObtainStyledAttributes.getDimension(index, this.f9052b);
            } else if (index == 3) {
                this.f9053c = typedArrayObtainStyledAttributes.getDimension(index, this.f9053c);
            } else if (index == 4) {
                this.f9051a = typedArrayObtainStyledAttributes.getDimension(index, this.f9051a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
