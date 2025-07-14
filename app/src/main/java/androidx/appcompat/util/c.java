package androidx.appcompat.util;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class c extends b {
    public final void b(int i5, int i6, int i7, int i8, Canvas canvas) {
        this.mRoundedCornerBounds.set(i5, i6, i7, i8);
        c(canvas);
    }

    public final void c(Canvas canvas) {
        Rect rect = this.mRoundedCornerBounds;
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if ((this.mRoundedCornerMode & 1) != 0) {
            a aVar = this.mTopLeftRound;
            int i9 = this.mRoundRadius;
            aVar.setBounds(i5, i8, i5 + i9, i9 + i8);
            this.mTopLeftRound.draw(canvas);
        }
        if ((this.mRoundedCornerMode & 2) != 0) {
            a aVar2 = this.mTopRightRound;
            int i10 = this.mRoundRadius;
            aVar2.setBounds(i6 - i10, i8, i6, i10 + i8);
            this.mTopRightRound.draw(canvas);
        }
        if ((this.mRoundedCornerMode & 4) != 0) {
            a aVar3 = this.mBottomLeftRound;
            int i11 = this.mRoundRadius;
            aVar3.setBounds(i5, i7 - i11, i11 + i5, i7);
            this.mBottomLeftRound.draw(canvas);
        }
        if ((this.mRoundedCornerMode & 8) != 0) {
            a aVar4 = this.mBottomRightRound;
            int i12 = this.mRoundRadius;
            aVar4.setBounds(i6 - i12, i7 - i12, i6, i7);
            this.mBottomRightRound.draw(canvas);
        }
    }

    @Override // androidx.appcompat.util.b
    public final void drawRoundedCorner(View view, Canvas canvas) {
        int left;
        int top;
        if (view.getTranslationY() != 0.0f) {
            left = Math.round(view.getX());
            top = Math.round(view.getY());
        } else {
            left = view.getLeft();
            top = view.getTop();
        }
        this.mRoundedCornerBounds.set(left, top, view.getWidth() + left, view.getHeight() + top);
        c(canvas);
    }
}
