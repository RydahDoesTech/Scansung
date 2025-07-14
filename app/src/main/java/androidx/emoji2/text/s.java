package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import g3.y;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final l f3688b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f3687a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f3689c = 1.0f;

    public s(l lVar) {
        y.h("metadata cannot be null", lVar);
        this.f3688b = lVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f, int i7, int i8, int i9, Paint paint) {
        i.a().getClass();
        l lVar = this.f3688b;
        com.google.firebase.messaging.q qVar = lVar.f3666b;
        Typeface typeface = (Typeface) qVar.f6170h;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) qVar.f, lVar.f3665a * 2, 2, f, i8, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f3687a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        l lVar = this.f3688b;
        this.f3689c = fAbs / (lVar.c().a(14) != 0 ? ((ByteBuffer) r8.f1418d).getShort(r1 + r8.f1415a) : (short) 0);
        W.a aVarC = lVar.c();
        int iA = aVarC.a(14);
        if (iA != 0) {
            ((ByteBuffer) aVarC.f1418d).getShort(iA + aVarC.f1415a);
        }
        short s2 = (short) ((lVar.c().a(12) != 0 ? ((ByteBuffer) r5.f1418d).getShort(r7 + r5.f1415a) : (short) 0) * this.f3689c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
