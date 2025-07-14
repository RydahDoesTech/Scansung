package B1;

import J.P;
import O1.g;
import O1.k;
import O1.u;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f189a;

    /* renamed from: b, reason: collision with root package name */
    public k f190b;

    /* renamed from: c, reason: collision with root package name */
    public int f191c;

    /* renamed from: d, reason: collision with root package name */
    public int f192d;

    /* renamed from: e, reason: collision with root package name */
    public int f193e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f194g;

    /* renamed from: h, reason: collision with root package name */
    public int f195h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f196i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f197j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f198k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f199l;

    /* renamed from: m, reason: collision with root package name */
    public g f200m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f203q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f205s;

    /* renamed from: t, reason: collision with root package name */
    public int f206t;
    public boolean n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f201o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f202p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f204r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f189a = materialButton;
        this.f190b = kVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f205s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f205s.getNumberOfLayers() > 2 ? (u) this.f205s.getDrawable(2) : (u) this.f205s.getDrawable(1);
    }

    public final g b(boolean z4) {
        RippleDrawable rippleDrawable = this.f205s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f205s.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f190b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i5, int i6) {
        WeakHashMap weakHashMap = P.f1421a;
        MaterialButton materialButton = this.f189a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i7 = this.f193e;
        int i8 = this.f;
        this.f = i6;
        this.f193e = i5;
        if (!this.f201o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i5) - i7, paddingEnd, (paddingBottom + i6) - i8);
    }

    public final void e() {
        g gVar = new g(this.f190b);
        MaterialButton materialButton = this.f189a;
        gVar.g(materialButton.getContext());
        C.a.h(gVar, this.f197j);
        PorterDuff.Mode mode = this.f196i;
        if (mode != null) {
            C.a.i(gVar, mode);
        }
        float f = this.f195h;
        ColorStateList colorStateList = this.f198k;
        gVar.f1931d.f1924j = f;
        gVar.invalidateSelf();
        O1.f fVar = gVar.f1931d;
        if (fVar.f1919d != colorStateList) {
            fVar.f1919d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f190b);
        gVar2.setTint(0);
        float f5 = this.f195h;
        int iN = this.n ? AbstractC0415a.n(R.attr.colorSurface, materialButton) : 0;
        gVar2.f1931d.f1924j = f5;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
        O1.f fVar2 = gVar2.f1931d;
        if (fVar2.f1919d != colorStateListValueOf) {
            fVar2.f1919d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f190b);
        this.f200m = gVar3;
        C.a.g(gVar3, -1);
        ColorStateList colorStateListValueOf2 = this.f199l;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f191c, this.f193e, this.f192d, this.f), this.f200m);
        this.f205s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.h(this.f206t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f = this.f195h;
            ColorStateList colorStateList = this.f198k;
            gVarB.f1931d.f1924j = f;
            gVarB.invalidateSelf();
            O1.f fVar = gVarB.f1931d;
            if (fVar.f1919d != colorStateList) {
                fVar.f1919d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f5 = this.f195h;
                int iN = this.n ? AbstractC0415a.n(R.attr.colorSurface, this.f189a) : 0;
                gVarB2.f1931d.f1924j = f5;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
                O1.f fVar2 = gVarB2.f1931d;
                if (fVar2.f1919d != colorStateListValueOf) {
                    fVar2.f1919d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
