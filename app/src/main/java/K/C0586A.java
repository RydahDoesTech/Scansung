package k;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0490g;
import j.InterfaceC0503t;
import j.MenuC0492i;
import j.SubMenuC0483A;

/* renamed from: k.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586A implements InterfaceC0503t, InterfaceC0490g {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7467e = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: d, reason: collision with root package name */
    public Object f7468d;

    public /* synthetic */ C0586A(Object obj) {
        this.f7468d = obj;
    }

    @Override // j.InterfaceC0503t
    public void a(MenuC0492i menuC0492i, boolean z4) {
        if (menuC0492i instanceof SubMenuC0483A) {
            ((SubMenuC0483A) menuC0492i).f6924z.k().c(false);
        }
        InterfaceC0503t interfaceC0503t = ((C0633k) this.f7468d).f7694h;
        if (interfaceC0503t != null) {
            interfaceC0503t.a(menuC0492i, z4);
        }
    }

    @Override // j.InterfaceC0503t
    public boolean b(MenuC0492i menuC0492i) {
        C0633k c0633k = (C0633k) this.f7468d;
        if (menuC0492i == c0633k.f) {
            return false;
        }
        ((SubMenuC0483A) menuC0492i).f6923A.getClass();
        c0633k.getClass();
        InterfaceC0503t interfaceC0503t = c0633k.f7694h;
        if (interfaceC0503t != null) {
            return interfaceC0503t.b(menuC0492i);
        }
        return false;
    }

    @Override // j.InterfaceC0490g
    public void c(MenuC0492i menuC0492i) {
        InterfaceC0490g interfaceC0490g = ((ActionMenuView) this.f7468d).f3299y;
        if (interfaceC0490g != null) {
            interfaceC0490g.c(menuC0492i);
        }
    }

    @Override // j.InterfaceC0490g
    public boolean d(MenuC0492i menuC0492i, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC0642n interfaceC0642n = ((ActionMenuView) this.f7468d).f3285D;
        if (interfaceC0642n == null) {
            return false;
        }
        Toolbar toolbar = ((B1) interfaceC0642n).f7477d;
        if (toolbar.f3480J.a(menuItem)) {
            zOnMenuItemSelected = true;
        } else {
            F1 f12 = toolbar.f3482L;
            zOnMenuItemSelected = f12 != null ? ((e.J) f12).f6497d.f6499b.f6621d.onMenuItemSelected(0, menuItem) : false;
        }
        return zOnMenuItemSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z4) {
        if (drawable instanceof C.g) {
            ((C.h) ((C.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    int id = layerDrawable.getId(i5);
                    drawableArr[i5] = e(layerDrawable.getDrawable(i5), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    layerDrawable2.setId(i6, layerDrawable.getId(i6));
                    layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
                    layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
                    layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
                    layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
                    layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
                    layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
                    layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
                    layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
                    layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f7468d) == null) {
                    this.f7468d = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
