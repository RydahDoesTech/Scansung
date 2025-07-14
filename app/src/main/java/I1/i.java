package I1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f932a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f934c;

    /* renamed from: d, reason: collision with root package name */
    public int f935d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f940j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f936e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f937g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f938h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f939i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f941k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i5) {
        this.f932a = charSequence;
        this.f933b = textPaint;
        this.f934c = i5;
        this.f935d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f932a == null) {
            this.f932a = "";
        }
        int iMax = Math.max(0, this.f934c);
        CharSequence charSequenceEllipsize = this.f932a;
        int i5 = this.f;
        TextPaint textPaint = this.f933b;
        if (i5 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f941k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f935d);
        this.f935d = iMin;
        if (this.f940j && this.f == 1) {
            this.f936e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f936e);
        builderObtain.setIncludePad(this.f939i);
        builderObtain.setTextDirection(this.f940j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f941k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.f937g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.f938h);
        }
        return builderObtain.build();
    }
}
