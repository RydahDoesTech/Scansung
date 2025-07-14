package C0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import k.C0632j1;
import k.U0;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f276b;

    public /* synthetic */ e(Drawable drawable, int i5) {
        this.f275a = i5;
        this.f276b = drawable;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f275a) {
            case 0:
                return ((Drawable.ConstantState) this.f276b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f275a) {
            case 0:
                return ((Drawable.ConstantState) this.f276b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f275a) {
            case 0:
                f fVar = new f(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f276b).newDrawable(resources);
                fVar.f281d = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f280i);
                return fVar;
            default:
                return super.newDrawable(resources);
        }
    }

    public e(Drawable.ConstantState constantState) {
        this.f275a = 0;
        this.f276b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f275a) {
            case 0:
                f fVar = new f(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f276b).newDrawable(resources, theme);
                fVar.f281d = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f280i);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f275a) {
            case 0:
                f fVar = new f(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f276b).newDrawable();
                fVar.f281d = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f280i);
                return fVar;
            case 1:
                return (U0) this.f276b;
            default:
                return (C0632j1) this.f276b;
        }
    }
}
