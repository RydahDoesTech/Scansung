package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596K implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7524e;

    public /* synthetic */ C0596K(int i5, Object obj) {
        this.f7523d = i5;
        this.f7524e = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        switch (this.f7523d) {
            case 0:
                C0598M c0598m = (C0598M) this.f7524e;
                c0598m.f7532G.setSelection(i5);
                AppCompatSpinner appCompatSpinner = c0598m.f7532G;
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i5, c0598m.E.getItemId(i5));
                }
                c0598m.dismiss();
                break;
            default:
                ((SearchView) this.f7524e).o(i5);
                break;
        }
    }
}
