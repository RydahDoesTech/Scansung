package k;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class L0 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f7529a;

    public L0(SearchView searchView) {
        this.f7529a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
        this.f7529a.s();
        return true;
    }
}
