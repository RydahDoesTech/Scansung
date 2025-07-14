package O;

import J.P;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.widget.EdgeEffect;
import androidx.core.widget.NestedScrollView;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1898a = 1;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f1899b;

    public /* synthetic */ l() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f1898a) {
            case 0:
                NestedScrollView nestedScrollView = (NestedScrollView) this.f1899b.get();
                if (nestedScrollView != null) {
                    float f = NestedScrollView.f3571i0;
                    if (message.what == 1) {
                        int scrollRange = nestedScrollView.getScrollRange();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        nestedScrollView.f3588R = (jCurrentTimeMillis - nestedScrollView.f3589T) / 1000;
                        if (jCurrentTimeMillis - nestedScrollView.f3591V >= nestedScrollView.f3590U) {
                            int iApplyDimension = (int) (TypedValue.applyDimension(1, 10.0f, nestedScrollView.f3593a0.getResources().getDisplayMetrics()) + 0.5f);
                            nestedScrollView.E = iApplyDimension;
                            long j5 = nestedScrollView.f3588R;
                            if (j5 > 2 && j5 < 4) {
                                nestedScrollView.E = iApplyDimension + ((int) (iApplyDimension * 0.1d));
                            } else if (j5 >= 4 && j5 < 5) {
                                nestedScrollView.E = iApplyDimension + ((int) (iApplyDimension * 0.2d));
                            } else if (j5 >= 5) {
                                nestedScrollView.E = iApplyDimension + ((int) (iApplyDimension * 0.3d));
                            }
                            int i5 = nestedScrollView.f3587Q == 2 ? nestedScrollView.E * (-1) : nestedScrollView.E;
                            WeakHashMap weakHashMap = P.f1421a;
                            nestedScrollView.getLayoutDirection();
                            boolean z4 = false;
                            if ((i5 < 0 && nestedScrollView.getScrollY() > 0) || (i5 > 0 && nestedScrollView.getScrollY() < scrollRange)) {
                                nestedScrollView.x(2, 1);
                                if (!nestedScrollView.f3574B.c(0, i5, null, null, 1)) {
                                    nestedScrollView.w(0, i5, 250);
                                } else if (nestedScrollView.f3595c0 && (!nestedScrollView.canScrollVertically(-1) || nestedScrollView.f3599e0 != 0)) {
                                    int i6 = nestedScrollView.f3599e0 - i5;
                                    nestedScrollView.f3599e0 = i6;
                                    if (i6 < 0) {
                                        nestedScrollView.f3599e0 = 0;
                                    } else {
                                        int i7 = nestedScrollView.f3600f0;
                                        if (i6 > i7) {
                                            nestedScrollView.f3599e0 = i7;
                                        }
                                    }
                                }
                                nestedScrollView.f3584M.sendEmptyMessageDelayed(1, 7L);
                                break;
                            } else {
                                int overScrollMode = nestedScrollView.getOverScrollMode();
                                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                                    z4 = true;
                                }
                                if (z4 && !nestedScrollView.f3592W) {
                                    int i8 = nestedScrollView.f3587Q;
                                    EdgeEffect edgeEffect = nestedScrollView.f3604i;
                                    EdgeEffect edgeEffect2 = nestedScrollView.f3602h;
                                    if (i8 == 2) {
                                        edgeEffect2.setSize((nestedScrollView.getWidth() - nestedScrollView.getPaddingLeft()) - nestedScrollView.getPaddingRight(), nestedScrollView.getHeight());
                                        edgeEffect2.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                                        if (!edgeEffect.isFinished()) {
                                            edgeEffect.onRelease();
                                        }
                                    } else if (i8 == 1) {
                                        edgeEffect.setSize((nestedScrollView.getWidth() - nestedScrollView.getPaddingLeft()) - nestedScrollView.getPaddingRight(), nestedScrollView.getHeight());
                                        edgeEffect.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                                        if (!edgeEffect2.isFinished()) {
                                            edgeEffect2.onRelease();
                                        }
                                    }
                                    if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                                        nestedScrollView.invalidate();
                                    }
                                    nestedScrollView.f3592W = true;
                                }
                                if (!z4 && !nestedScrollView.f3592W) {
                                    nestedScrollView.f3592W = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                int i9 = message.what;
                if (i9 != -3 && i9 != -2 && i9 != -1) {
                    if (i9 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1899b.get(), message.what);
                    break;
                }
                break;
        }
    }

    public l(NestedScrollView nestedScrollView) {
        this.f1899b = new WeakReference(nestedScrollView);
    }
}
