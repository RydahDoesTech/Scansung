package E1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class x extends ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f610d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f611e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final w f612g;

    public x(Context context) {
        super(context, null, -1);
        this.f = false;
        setElevation(getResources().getDimension(R.dimen.expansion_button_elevation));
        long integer = context.getResources().getInteger(R.integer.expansion_button_duration);
        this.f612g = new w(this, integer, integer);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (this.f610d) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.state_expansion_button_expanded});
        }
        if (this.f611e) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.state_expansion_button_floated});
        }
        return iArrOnCreateDrawableState;
    }

    public void setAutomaticDisappear(boolean z4) {
        this.f = z4;
        if (z4) {
            return;
        }
        this.f612g.cancel();
    }

    public void setExpanded(boolean z4) {
        this.f610d = z4;
        refreshDrawableState();
    }

    public void setFloated(boolean z4) {
        this.f611e = z4;
        refreshDrawableState();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (i5 == 0) {
            w wVar = this.f612g;
            wVar.cancel();
            wVar.start();
        }
    }
}
