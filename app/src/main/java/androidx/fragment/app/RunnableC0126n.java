package androidx.fragment.app;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0126n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3897e;

    public /* synthetic */ RunnableC0126n(int i5, Object obj) {
        this.f3896d = i5;
        this.f3897e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3896d) {
            case 0:
                DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s = (DialogInterfaceOnCancelListenerC0130s) this.f3897e;
                dialogInterfaceOnCancelListenerC0130s.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC0130s.mDialog);
                break;
            case 1:
                ((C0125m) this.f3897e).e();
                break;
            default:
                ((a0) this.f3897e).x(true);
                break;
        }
    }
}
