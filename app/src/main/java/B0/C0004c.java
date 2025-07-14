package B0;

import J.P;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0004c(String str, int i5, Class cls) {
        super(cls, str);
        this.f115a = i5;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f115a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            case 6:
                WeakHashMap weakHashMap = P.f1421a;
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f3429B);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f115a) {
            case 0:
                C0007f c0007f = (C0007f) obj;
                PointF pointF = (PointF) obj2;
                c0007f.getClass();
                c0007f.f118a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0007f.f119b = iRound;
                int i5 = c0007f.f + 1;
                c0007f.f = i5;
                if (i5 == c0007f.f123g) {
                    int i6 = c0007f.f118a;
                    int i7 = c0007f.f120c;
                    int i8 = c0007f.f121d;
                    C0004c c0004c = A.f98a;
                    c0007f.f122e.setLeftTopRightBottom(i6, iRound, i7, i8);
                    c0007f.f = 0;
                    c0007f.f123g = 0;
                    break;
                }
                break;
            case 1:
                C0007f c0007f2 = (C0007f) obj;
                PointF pointF2 = (PointF) obj2;
                c0007f2.getClass();
                c0007f2.f120c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0007f2.f121d = iRound2;
                int i9 = c0007f2.f123g + 1;
                c0007f2.f123g = i9;
                if (c0007f2.f == i9) {
                    int i10 = c0007f2.f118a;
                    int i11 = c0007f2.f119b;
                    int i12 = c0007f2.f120c;
                    C0004c c0004c2 = A.f98a;
                    c0007f2.f122e.setLeftTopRightBottom(i10, i11, i12, iRound2);
                    c0007f2.f = 0;
                    c0007f2.f123g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int iRound3 = Math.round(pointF3.x);
                int iRound4 = Math.round(pointF3.y);
                C0004c c0004c3 = A.f98a;
                view.setLeftTopRightBottom(left, top, iRound3, iRound4);
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int iRound5 = Math.round(pointF4.x);
                int iRound6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                C0004c c0004c4 = A.f98a;
                view2.setLeftTopRightBottom(iRound5, iRound6, right, bottom);
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound7 = Math.round(pointF5.x);
                int iRound8 = Math.round(pointF5.y);
                int width = view3.getWidth() + iRound7;
                int height = view3.getHeight() + iRound8;
                C0004c c0004c5 = A.f98a;
                view3.setLeftTopRightBottom(iRound7, iRound8, width, height);
                break;
            case 5:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                break;
            case 6:
                WeakHashMap weakHashMap = P.f1421a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
