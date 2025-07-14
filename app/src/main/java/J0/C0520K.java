package j0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: j0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0520K extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b0 f7075a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7076b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7077c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7078d;

    public C0520K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7076b = new Rect();
        this.f7077c = true;
        this.f7078d = false;
    }

    public C0520K(int i5, int i6) {
        super(i5, i6);
        this.f7076b = new Rect();
        this.f7077c = true;
        this.f7078d = false;
    }

    public C0520K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7076b = new Rect();
        this.f7077c = true;
        this.f7078d = false;
    }

    public C0520K(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7076b = new Rect();
        this.f7077c = true;
        this.f7078d = false;
    }

    public C0520K(C0520K c0520k) {
        super((ViewGroup.LayoutParams) c0520k);
        this.f7076b = new Rect();
        this.f7077c = true;
        this.f7078d = false;
    }
}
