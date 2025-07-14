package B0;

import J.P;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008g extends t {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f124A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final C0004c f125B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0004c f126C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0004c f127D;
    public static final C0004c E;

    /* renamed from: F, reason: collision with root package name */
    public static final C0004c f128F;

    static {
        new C0003b(PointF.class, "boundsOrigin").f114a = new Rect();
        f125B = new C0004c("topLeft", 0, PointF.class);
        f126C = new C0004c("bottomRight", 1, PointF.class);
        f127D = new C0004c("bottomRight", 2, PointF.class);
        E = new C0004c("topLeft", 3, PointF.class);
        f128F = new C0004c("position", 4, PointF.class);
    }

    public static void I(z zVar) {
        View view = zVar.f187b;
        WeakHashMap weakHashMap = P.f1421a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = zVar.f186a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", zVar.f187b.getParent());
    }

    @Override // B0.t
    public final void e(z zVar) {
        I(zVar);
    }

    @Override // B0.t
    public final void h(z zVar) {
        I(zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B0.t
    public final Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        C0008g c0008g;
        ObjectAnimator objectAnimatorOfObject;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        HashMap map = zVar.f186a;
        HashMap map2 = zVar2.f186a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i5 = rect.left;
        int i6 = rect2.left;
        int i7 = rect.top;
        int i8 = rect2.top;
        int i9 = rect.right;
        int i10 = rect2.right;
        int i11 = rect.bottom;
        int i12 = rect2.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i13 != 0 && i14 != 0) || (i15 != 0 && i16 != 0)) {
            i = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        C0004c c0004c = A.f98a;
        View view = zVar2.f187b;
        view.setLeftTopRightBottom(i5, i7, i9, i11);
        if (i != 2) {
            c0008g = this;
            if (i5 == i6 && i7 == i8) {
                c0008g.f174w.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, f127D, (TypeConverter) null, Y0.h.g(i9, i11, i10, i12));
            } else {
                c0008g.f174w.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, E, (TypeConverter) null, Y0.h.g(i5, i7, i6, i8));
            }
        } else if (i13 == i15 && i14 == i16) {
            c0008g = this;
            c0008g.f174w.getClass();
            objectAnimatorOfObject = ObjectAnimator.ofObject(view, f128F, (TypeConverter) null, Y0.h.g(i5, i7, i6, i8));
        } else {
            c0008g = this;
            C0007f c0007f = new C0007f();
            c0007f.f122e = view;
            c0008g.f174w.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c0007f, f125B, (TypeConverter) null, Y0.h.g(i5, i7, i6, i8));
            c0008g.f174w.getClass();
            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(c0007f, f126C, (TypeConverter) null, Y0.h.g(i9, i11, i10, i12));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
            animatorSet.addListener(new C0005d(c0007f));
            objectAnimatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            c0008g.a(new C0006e(viewGroup4));
        }
        return objectAnimatorOfObject;
    }

    @Override // B0.t
    public final String[] q() {
        return f124A;
    }
}
