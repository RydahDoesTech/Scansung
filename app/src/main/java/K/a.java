package K;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f1599a;

    /* renamed from: b, reason: collision with root package name */
    public final h f1600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1601c;

    public a(int i5, h hVar, int i6) {
        this.f1599a = i5;
        this.f1600b = hVar;
        this.f1601c = i6;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1599a);
        this.f1600b.f1615a.performAction(this.f1601c, bundle);
    }
}
