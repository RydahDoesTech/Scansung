package androidx.preference;

import android.os.SystemClock;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4683e;

    public /* synthetic */ t(int i5, Object obj) {
        this.f4682d = i5;
        this.f4683e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4682d) {
            case 0:
                RecyclerView recyclerView = ((z) this.f4683e).mList;
                recyclerView.focusableViewAvailable(recyclerView);
                break;
            case 1:
                C0185d c0185d = (C0185d) this.f4683e;
                long j5 = c0185d.f4659o;
                if (j5 != -1 && j5 + 1000 > SystemClock.currentThreadTimeMillis()) {
                    EditText editText = c0185d.f4657l;
                    if (editText != null && editText.isFocused()) {
                        if (!((InputMethodManager) c0185d.f4657l.getContext().getSystemService("input_method")).showSoftInput(c0185d.f4657l, 0)) {
                            EditText editText2 = c0185d.f4657l;
                            t tVar = c0185d.n;
                            editText2.removeCallbacks(tVar);
                            c0185d.f4657l.postDelayed(tVar, 50L);
                            break;
                        } else {
                            c0185d.f4659o = -1L;
                            break;
                        }
                    } else {
                        c0185d.f4659o = -1L;
                        break;
                    }
                }
                break;
            default:
                ((D) this.f4683e).p();
                break;
        }
    }
}
