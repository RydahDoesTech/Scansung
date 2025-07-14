package T;

import android.view.View;
import android.widget.AdapterView;
import androidx.databinding.h;

/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final a f2543d;

    /* renamed from: e, reason: collision with root package name */
    public final h f2544e;

    public b(a aVar, h hVar) {
        this.f2543d = aVar;
        this.f2544e = hVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i5, long j5) {
        a aVar = this.f2543d;
        if (aVar != null) {
            aVar.onItemSelected(adapterView, view, i5, j5);
        }
        h hVar = this.f2544e;
        if (hVar != null) {
            hVar.onChange();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        h hVar = this.f2544e;
        if (hVar != null) {
            hVar.onChange();
        }
    }
}
