package androidx.appcompat.util;

import A3.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class b {
    public static final int ROUNDED_CORNER_ALL = 15;
    public static final int ROUNDED_CORNER_BOTTOM_LEFT = 4;
    public static final int ROUNDED_CORNER_BOTTOM_RIGHT = 8;
    public static final int ROUNDED_CORNER_NONE = 0;
    public static final int ROUNDED_CORNER_TOP_LEFT = 1;
    public static final int ROUNDED_CORNER_TOP_RIGHT = 2;
    static final String TAG = "SeslRoundedCorner";
    protected final a mBottomLeftRound;
    private int mBottomLeftRoundColor;
    protected final a mBottomRightRound;
    private int mBottomRightRoundColor;
    final int mRoundRadius;
    int mRoundedCornerMode;
    protected final a mTopLeftRound;
    private int mTopLeftRoundColor;
    protected final a mTopRightRound;
    private int mTopRightRoundColor;
    final Rect mRoundedCornerBounds = new Rect();
    private B.c mInsets = null;

    public b(Context context) throws Resources.NotFoundException {
        int color;
        int i5;
        int i6;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sesl_rounded_corner_radius);
        this.mRoundRadius = dimensionPixelSize;
        boolean zI = J2.b.I(context);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.roundedCornerColor, typedValue, true);
        int i7 = typedValue.resourceId;
        if (i7 <= 0 || (i6 = typedValue.type) < 28 || i6 > 31) {
            color = typedValue.data;
            if (color <= 0 || (i5 = typedValue.type) < 28 || i5 > 31) {
                color = resources.getColor(!zI ? R.color.sesl_round_and_bgcolor_dark : R.color.sesl_round_and_bgcolor_light);
            }
        } else {
            color = resources.getColor(i7);
        }
        this.mBottomRightRoundColor = color;
        this.mBottomLeftRoundColor = color;
        this.mTopRightRoundColor = color;
        this.mTopLeftRoundColor = color;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
        a aVar = new a(dimensionPixelSize, paint, 0.0f);
        this.mTopLeftRound = aVar;
        aVar.f3190d = porterDuffColorFilter;
        a aVar2 = new a(dimensionPixelSize, paint, 90.0f);
        this.mTopRightRound = aVar2;
        aVar2.f3190d = porterDuffColorFilter;
        a aVar3 = new a(dimensionPixelSize, paint, 270.0f);
        this.mBottomLeftRound = aVar3;
        aVar3.f3190d = porterDuffColorFilter;
        a aVar4 = new a(dimensionPixelSize, paint, 180.0f);
        this.mBottomRightRound = aVar4;
        aVar4.f3190d = porterDuffColorFilter;
    }

    @Deprecated
    public static Path getSmoothCornerRectPath(float f, float f5, float f6) {
        Log.w(TAG, "This method is deprecated. Use getSmoothCornerRectPath(float, float, float, float, float) instead.");
        return getSmoothCornerRectPath(f, 0.0f, 0.0f, f5, f6);
    }

    public final void a(Canvas canvas) {
        Rect rect = this.mRoundedCornerBounds;
        int i5 = rect.left;
        B.c cVar = this.mInsets;
        int i6 = i5 + (cVar != null ? cVar.f87a : 0);
        int i7 = rect.right - (cVar != null ? cVar.f89c : 0);
        int i8 = rect.top + (cVar != null ? cVar.f88b : 0);
        int i9 = rect.bottom - (cVar != null ? cVar.f90d : 0);
        if ((this.mRoundedCornerMode & 1) != 0) {
            a aVar = this.mTopLeftRound;
            int i10 = this.mRoundRadius;
            aVar.setBounds(i6, i8, i6 + i10, i10 + i8);
            this.mTopLeftRound.draw(canvas);
        }
        if ((this.mRoundedCornerMode & 2) != 0) {
            a aVar2 = this.mTopRightRound;
            int i11 = this.mRoundRadius;
            aVar2.setBounds(i7 - i11, i8, i7, i11 + i8);
            this.mTopRightRound.draw(canvas);
        }
        if ((this.mRoundedCornerMode & 4) != 0) {
            a aVar3 = this.mBottomLeftRound;
            int i12 = this.mRoundRadius;
            aVar3.setBounds(i6, i9 - i12, i12 + i6, i9);
            this.mBottomLeftRound.draw(canvas);
        }
        if ((this.mRoundedCornerMode & 8) != 0) {
            a aVar4 = this.mBottomRightRound;
            int i13 = this.mRoundRadius;
            aVar4.setBounds(i7 - i13, i9 - i13, i7, i9);
            this.mBottomRightRound.draw(canvas);
        }
        int i14 = this.mTopLeftRoundColor;
        if (i14 == this.mTopRightRoundColor && i14 == this.mBottomLeftRoundColor && i14 == this.mBottomRightRoundColor) {
            Paint paint = new Paint();
            paint.setColor(i14);
            B.c cVar2 = this.mInsets;
            if (cVar2 != null && cVar2.f88b > 0) {
                B.c cVar3 = this.mInsets;
                canvas.drawRect(new Rect(i6 - cVar3.f87a, i8 - cVar3.f88b, cVar3.f89c + i7, i8), paint);
            }
            B.c cVar4 = this.mInsets;
            if (cVar4 != null && cVar4.f90d > 0) {
                B.c cVar5 = this.mInsets;
                canvas.drawRect(new Rect(i6 - cVar5.f87a, i9, cVar5.f89c + i7, cVar5.f90d + i9), paint);
            }
            B.c cVar6 = this.mInsets;
            if (cVar6 != null && cVar6.f87a > 0) {
                B.c cVar7 = this.mInsets;
                canvas.drawRect(new Rect(i6 - cVar7.f87a, i8 - cVar7.f88b, i6, cVar7.f90d + i9), paint);
            }
            B.c cVar8 = this.mInsets;
            if (cVar8 == null || cVar8.f89c <= 0) {
                return;
            }
            B.c cVar9 = this.mInsets;
            canvas.drawRect(new Rect(i7, i8 - cVar9.f88b, cVar9.f89c + i7, i9 + cVar9.f90d), paint);
        }
    }

    public void drawRoundedCorner(Canvas canvas) {
        canvas.getClipBounds(this.mRoundedCornerBounds);
        a(canvas);
    }

    public int getRoundedCornerColor(int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("There is no rounded corner on = " + this);
        }
        if (i5 == 1 || i5 == 2 || i5 == 4 || i5 == 8) {
            return (i5 & 1) != 0 ? this.mTopLeftRoundColor : (i5 & 2) != 0 ? this.mTopRightRoundColor : (i5 & 4) != 0 ? this.mBottomLeftRoundColor : this.mBottomRightRoundColor;
        }
        throw new IllegalArgumentException("Use multiple rounded corner as param on = " + this);
    }

    public int getRoundedCornerRadius() {
        return this.mRoundRadius;
    }

    public int getRoundedCorners() {
        return this.mRoundedCornerMode;
    }

    public void setRoundedCornerColor(int i5, int i6) {
        if (i5 == 0) {
            throw new IllegalArgumentException("There is no rounded corner on = " + this);
        }
        if ((i5 & (-16)) != 0) {
            throw new IllegalArgumentException(f.l(i5, "Use wrong rounded corners to the param, corners = "));
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN);
        if ((i5 & 1) != 0) {
            this.mTopLeftRoundColor = i6;
            this.mTopLeftRound.f3190d = porterDuffColorFilter;
        }
        if ((i5 & 2) != 0) {
            this.mTopRightRoundColor = i6;
            this.mTopRightRound.f3190d = porterDuffColorFilter;
        }
        if ((i5 & 4) != 0) {
            this.mBottomLeftRoundColor = i6;
            this.mBottomLeftRound.f3190d = porterDuffColorFilter;
        }
        if ((i5 & 8) != 0) {
            this.mBottomRightRoundColor = i6;
            this.mBottomRightRound.f3190d = porterDuffColorFilter;
        }
    }

    public void setRoundedCorners(int i5) {
        if ((i5 & (-16)) != 0) {
            throw new IllegalArgumentException(f.l(i5, "Use wrong rounded corners to the param, corners = "));
        }
        this.mRoundedCornerMode = i5;
    }

    public static Path getSmoothCornerRectPath(float f, float f5, float f6, float f7, float f8) {
        Path path = new Path();
        if (f7 > 0.0f && f8 > 0.0f) {
            float f9 = f7 / 2.0f;
            float f10 = f8 / 2.0f;
            float fMin = Math.min(f9, f10);
            float fMin2 = Math.min(Math.max(f, 0.0f), fMin);
            float f11 = fMin2 / fMin;
            float fMin3 = f11 > 0.5f ? 1.0f - (Math.min(1.0f, (f11 - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
            float fMin4 = ((double) f11) > 0.6d ? 1.0f + (Math.min(1.0f, (f11 - 0.6f) / 0.3f) * 0.042454004f) : 1.0f;
            path.moveTo(f5 + f9, f6);
            float f12 = fMin2 / 100.0f;
            float f13 = 128.19f * f12 * fMin3;
            float f14 = f7 - f13;
            path.lineTo(Math.max(f9, f14) + f5, f6);
            float f15 = f5 + f7;
            float f16 = 83.62f * f12 * fMin4;
            float f17 = f15 - f16;
            float f18 = f12 * 67.45f;
            float f19 = f15 - f18;
            float f20 = f12 * 4.64f;
            float f21 = f6 + f20;
            float f22 = f12 * 51.16f;
            float f23 = f15 - f22;
            float f24 = f12 * 13.36f;
            float f25 = f6 + f24;
            path.cubicTo(f17, f6, f19, f21, f23, f25);
            float f26 = f12 * 34.86f;
            float f27 = f15 - f26;
            float f28 = f12 * 22.07f;
            float f29 = f6 + f28;
            float f30 = f15 - f28;
            float f31 = f6 + f26;
            float f32 = f15 - f24;
            float f33 = f6 + f22;
            path.cubicTo(f27, f29, f30, f31, f32, f33);
            float f34 = f15 - f20;
            float f35 = f6 + f18;
            float f36 = f6 + f16;
            path.cubicTo(f34, f35, f15, f36, f15, Math.min(f10, f13) + f6);
            float f37 = f8 - f13;
            path.lineTo(f15, Math.max(f10, f37) + f6);
            float f38 = f6 + f8;
            float f39 = f38 - f16;
            float f40 = f38 - f18;
            float f41 = f38 - f22;
            path.cubicTo(f15, f39, f34, f40, f32, f41);
            float f42 = f38 - f26;
            float f43 = f38 - f28;
            float f44 = f38 - f24;
            path.cubicTo(f30, f42, f27, f43, f23, f44);
            float f45 = f38 - f20;
            path.cubicTo(f19, f45, f17, f38, Math.max(f9, f14) + f5, f38);
            path.lineTo(Math.min(f9, f13) + f5, f38);
            float f46 = f5 + f16;
            float f47 = f5 + f18;
            float f48 = f5 + f22;
            path.cubicTo(f46, f38, f47, f45, f48, f44);
            float f49 = f5 + f26;
            float f50 = f28 + f5;
            float f51 = f5 + f24;
            path.cubicTo(f49, f43, f50, f42, f51, f41);
            float f52 = f5 + f20;
            path.cubicTo(f52, f40, f5, f39, f5, Math.max(f10, f37) + f6);
            path.lineTo(f5, Math.min(f10, f13) + f6);
            path.cubicTo(f5, f36, f52, f35, f51, f33);
            path.cubicTo(f50, f31, f49, f29, f48, f25);
            path.cubicTo(f47, f21, f46, f6, Math.min(f9, f13) + f5, f6);
            path.close();
            return path;
        }
        return new Path();
    }

    public void drawRoundedCorner(View view, Canvas canvas) {
        int left;
        int top;
        if (view.getTranslationY() != 0.0f) {
            left = Math.round(view.getX());
            top = Math.round(view.getY());
            canvas.translate((view.getX() - left) + 0.5f, (view.getY() - top) + 0.5f);
        } else {
            left = view.getLeft();
            top = view.getTop();
        }
        this.mRoundedCornerBounds.set(left, top, view.getWidth() + left, view.getHeight() + top);
        a(canvas);
    }

    public void drawRoundedCorner(Canvas canvas, B.c cVar) {
        this.mInsets = cVar;
        drawRoundedCorner(canvas);
    }

    public void drawRoundedCorner(Rect rect, Canvas canvas) {
        this.mRoundedCornerBounds.set(rect);
        a(canvas);
    }
}
