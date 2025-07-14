package androidx.picker.widget;

import android.content.res.Resources;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import b0.C0198c;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4191e;

    public /* synthetic */ H(int i5, Object obj) {
        this.f4190d = i5;
        this.f4191e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        switch (this.f4190d) {
            case 0:
                H h3 = (H) this.f4191e;
                M m4 = (M) ((H) ((G.b) h3.f4191e).f).f4191e;
                m4.j(m4.f4265v);
                G.b bVar = (G.b) h3.f4191e;
                ((M) ((H) bVar.f).f4191e).f4265v.abortAnimation();
                ((M) ((H) bVar.f).f4191e).f4269x.abortAnimation();
                ((M) ((H) bVar.f).f4191e).c(0);
                M m5 = (M) ((H) bVar.f).f4191e;
                m5.f4265v = m5.f4247h0;
                m5.f4243e0 = false;
                ((SeslSpinningDatePickerSpinner) m5.f4189b).invalidate();
                ((M) ((H) bVar.f).f4191e).q(true);
                ((M) ((H) bVar.f).f4191e).getClass();
                break;
            case 1:
                G.b bVar2 = (G.b) this.f4191e;
                M m6 = (M) ((H) bVar2.f).f4191e;
                boolean zJ = m6.j(m6.f4265v);
                H h5 = (H) bVar2.f;
                if (!zJ) {
                    M m7 = (M) h5.f4191e;
                    m7.j(m7.f4269x);
                }
                M m8 = (M) h5.f4191e;
                m8.f4271y = 0;
                m8.f4265v.startScroll(0, 0, 0, -bVar2.f677e, 557);
                ((SeslSpinningDatePickerSpinner) ((M) h5.f4191e).f4189b).invalidate();
                new Handler().postDelayed(new H(0, this), 857L);
                break;
            case 2:
                M m9 = (M) this.f4191e;
                int i5 = m9.f4260s;
                if (i5 != 0) {
                    m9.f4243e0 = true;
                    m9.f4265v = m9.g0;
                    m9.n(i5 * 5);
                    ((SeslSpinningDatePickerSpinner) m9.f4189b).invalidate();
                    new Handler().postDelayed(new G.b((int) (i5 * 5.4d), this, 5), 0);
                    break;
                } else {
                    m9.f4244f0 = true;
                    break;
                }
            case 3:
                SeslDatePicker seslDatePicker = (SeslDatePicker) this.f4191e;
                seslDatePicker.f4356T.u(seslDatePicker.f4350L, false);
                break;
            case 4:
                x xVar = (x) this.f4191e;
                InputMethodManager inputMethodManager = (InputMethodManager) xVar.f4501e.f4188a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    D d5 = xVar.f4501e;
                    if (d5.f4110h0 && d5.f4105e.isFocused()) {
                        inputMethodManager.showSoftInput(xVar.f4501e.f4105e, 0);
                        break;
                    }
                }
                break;
            case 5:
                H h6 = (H) this.f4191e;
                D d6 = (D) ((G.b) ((G.b) h6.f4191e).f).f;
                d6.o(d6.f4053D);
                G.b bVar3 = (G.b) h6.f4191e;
                ((D) ((G.b) bVar3.f).f).f4053D.abortAnimation();
                ((D) ((G.b) bVar3.f).f).f4056F.abortAnimation();
                ((D) ((G.b) bVar3.f).f).e(0);
                D d7 = (D) ((G.b) bVar3.f).f;
                d7.f4053D = d7.q0;
                d7.n0 = false;
                ((SeslNumberPicker) d7.f4189b).invalidate();
                ((D) ((G.b) bVar3.f).f).z(true);
                C0198c c0198c = ((D) ((G.b) bVar3.f).f).f4093Y0;
                if (c0198c != null) {
                    ((f0.b) c0198c.f5001d).n = false;
                    break;
                }
                break;
            case 6:
                G.b bVar4 = (G.b) this.f4191e;
                D d8 = (D) ((G.b) bVar4.f).f;
                boolean zO = d8.o(d8.f4053D);
                G.b bVar5 = (G.b) bVar4.f;
                if (!zO) {
                    D d9 = (D) bVar5.f;
                    d9.o(d9.f4056F);
                }
                ((D) bVar5.f).z(false);
                D d10 = (D) bVar5.f;
                d10.f4058G = 0;
                d10.f4053D.startScroll(0, 0, 0, -bVar4.f677e, d10.f4107f0 ? 857 : 557);
                ((SeslNumberPicker) ((D) bVar5.f).f4189b).invalidate();
                new Handler().postDelayed(new H(5, this), 857L);
                break;
            case 7:
                T t4 = ((P) this.f4191e).f4276b;
                t4.f4454z = false;
                SeslNumberPicker seslNumberPicker = t4.f4440k;
                if (seslNumberPicker != null) {
                    seslNumberPicker.setEnabled(true);
                    break;
                }
                break;
            default:
                T t5 = (T) this.f4191e;
                InputMethodManager inputMethodManager2 = (InputMethodManager) t5.f4432b.getSystemService("input_method");
                if (t5.f4453y && inputMethodManager2 != null) {
                    inputMethodManager2.showSoftInput(t5.f4442m.hasFocus() ? t5.f4442m : t5.f4441l, 0);
                    break;
                }
                break;
        }
    }
}
