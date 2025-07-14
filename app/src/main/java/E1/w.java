package E1;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class w extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, long j5, long j6) {
        super(j5, j6);
        this.f609a = xVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        x xVar = this.f609a;
        if (xVar.f && xVar.getVisibility() == 0) {
            xVar.setVisibility(4);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j5) {
    }
}
