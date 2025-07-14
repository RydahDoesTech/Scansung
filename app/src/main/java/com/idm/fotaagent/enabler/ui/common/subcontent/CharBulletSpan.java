package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class CharBulletSpan implements LeadingMarginSpan {
    static final char DEFAULT_BULLET = 8226;
    static final int LEADING_MARGIN_BULLET_AND_ONE_SPACE = -1;
    private final char bullet;
    int leadingMargin;
    private Paint paint;

    public CharBulletSpan(char c2, int i5) {
        this.bullet = c2;
        this.leadingMargin = i5;
    }

    public static CharSequence applyTo(CharSequence charSequence) {
        return applyTo(charSequence, DEFAULT_BULLET, -1);
    }

    public static void setPaintIfNeeded(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spanned) {
            for (CharBulletSpan charBulletSpan : (CharBulletSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), CharBulletSpan.class)) {
                charBulletSpan.setPaint(paint);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
        if (z4) {
            Paint.Align textAlign = paint.getTextAlign();
            paint.setTextAlign(i6 < 0 ? Paint.Align.RIGHT : Paint.Align.LEFT);
            canvas.drawText(String.valueOf(this.bullet), i5, i8, paint);
            paint.setTextAlign(textAlign);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        if (this.leadingMargin == -1) {
            Paint paint = this.paint;
            if (paint == null) {
                Log.W("paint should not be null");
            } else {
                this.leadingMargin = (int) (paint.measureText(this.bullet + " ") + 0.5f);
            }
        }
        return this.leadingMargin;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    private static CharSequence applyTo(CharSequence charSequence, char c2, int i5) {
        SpannableString spannableString = new SpannableString(charSequence);
        String string = charSequence.toString();
        int i6 = 0;
        while (true) {
            int iIndexOf = string.indexOf(10, i6) + 1;
            if (iIndexOf == 0) {
                spannableString.setSpan(new CharBulletSpan(c2, i5), i6, charSequence.length(), 33);
                return spannableString;
            }
            spannableString.setSpan(new CharBulletSpan(c2, i5), i6, iIndexOf, 33);
            i6 = iIndexOf;
        }
    }
}
