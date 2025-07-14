package K1;

import O.b;
import android.R;
import android.content.res.ColorStateList;
import e1.AbstractC0415a;
import k.C0587B;

/* loaded from: classes.dex */
public final class a extends C0587B {

    /* renamed from: j, reason: collision with root package name */
    public static final int[][] f1646j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f1647h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1648i;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1647h == null) {
            int iN = AbstractC0415a.n(com.wssyncmldm.R.attr.colorControlActivated, this);
            int iN2 = AbstractC0415a.n(com.wssyncmldm.R.attr.colorOnSurface, this);
            int iN3 = AbstractC0415a.n(com.wssyncmldm.R.attr.colorSurface, this);
            this.f1647h = new ColorStateList(f1646j, new int[]{AbstractC0415a.I(iN3, 1.0f, iN), AbstractC0415a.I(iN3, 0.54f, iN2), AbstractC0415a.I(iN3, 0.38f, iN2), AbstractC0415a.I(iN3, 0.38f, iN2)});
        }
        return this.f1647h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1648i && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f1648i = z4;
        if (z4) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
