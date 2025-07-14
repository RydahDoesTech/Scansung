package R1;

import J.P;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u extends ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f2461d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2462e;
    public final /* synthetic */ v f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, int i5, String[] strArr) {
        super(context, i5, strArr);
        this.f = vVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        v vVar = this.f;
        ColorStateList colorStateList2 = vVar.n;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f2462e = colorStateList;
        if (vVar.f2469m != 0 && vVar.n != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0415a.J(vVar.f2469m, vVar.n.getColorForState(iArr3, 0)), AbstractC0415a.J(vVar.f2469m, vVar.n.getColorForState(iArr2, 0)), vVar.f2469m});
        }
        this.f2461d = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i5, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            v vVar = this.f;
            Drawable rippleDrawable = null;
            if (vVar.getText().toString().contentEquals(textView.getText()) && vVar.f2469m != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(vVar.f2469m);
                if (this.f2462e != null) {
                    C.a.h(colorDrawable, this.f2461d);
                    rippleDrawable = new RippleDrawable(this.f2462e, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = P.f1421a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
