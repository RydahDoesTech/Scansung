package R1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f2430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f2431e;

    public q(s sVar, int i5, TextView textView, int i6, TextView textView2) {
        this.f2431e = sVar;
        this.f2427a = i5;
        this.f2428b = textView;
        this.f2429c = i6;
        this.f2430d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i5 = this.f2427a;
        s sVar = this.f2431e;
        sVar.n = i5;
        sVar.f2446l = null;
        TextView textView = this.f2428b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2429c == 1 && (appCompatTextView = sVar.f2451r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2430d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2430d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
