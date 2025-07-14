package E1;

import J.P;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.SeslChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SeslChipGroup f590b;

    public j(SeslChipGroup seslChipGroup) {
        this.f590b = seslChipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        SeslChipGroup seslChipGroup = this.f590b;
        if (view == seslChipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = P.f1421a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            F3.p pVar = seslChipGroup.f594j;
            ((HashMap) pVar.f667c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                pVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new B.g(10, pVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f589a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        SeslChipGroup seslChipGroup = this.f590b;
        if (view == seslChipGroup && (view2 instanceof Chip)) {
            Chip chip = (Chip) view2;
            F3.p pVar = seslChipGroup.f594j;
            pVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) pVar.f667c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) pVar.f668d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f589a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
