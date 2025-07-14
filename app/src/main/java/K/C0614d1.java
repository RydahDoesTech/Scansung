package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: k.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614d1 extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public Drawable f7656d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f7657e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f7658g;

    public C0614d1(Context context) {
        super(context, null);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(this.f7657e);
        addView(imageView);
        this.f7658g = imageView;
    }

    public final void a(boolean z4) {
        this.f7658g.setImageDrawable(z4 ? this.f7657e : this.f7656d);
        setSelected(z4);
        this.f = z4;
    }
}
