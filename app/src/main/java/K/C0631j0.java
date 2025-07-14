package k;

import android.graphics.Canvas;
import g.C0448a;

/* renamed from: k.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631j0 extends C0448a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f7679e;

    @Override // g.C0448a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f7679e) {
            super.draw(canvas);
        }
    }

    @Override // g.C0448a, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f5) {
        if (this.f7679e) {
            super.setHotspot(f, f5);
        }
    }

    @Override // g.C0448a, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i5, int i6, int i7, int i8) {
        if (this.f7679e) {
            super.setHotspotBounds(i5, i6, i7, i8);
        }
    }

    @Override // g.C0448a, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f7679e) {
            return this.f6765d.setState(iArr);
        }
        return false;
    }

    @Override // g.C0448a, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        if (this.f7679e) {
            return super.setVisible(z4, z5);
        }
        return false;
    }
}
