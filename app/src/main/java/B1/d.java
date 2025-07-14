package B1;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f208b;

    public /* synthetic */ d(int i5, Object obj) {
        this.f207a = i5;
        this.f208b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f207a) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f5804s).compareTo(Boolean.valueOf(materialButton2.f5804s));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f208b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
                AbstractC0219i.d("it", abstractC0438v);
                InterfaceC0107b interfaceC0107b = (InterfaceC0107b) this.f208b;
                String string = interfaceC0107b.d(abstractC0438v).toString();
                AbstractC0438v abstractC0438v2 = (AbstractC0438v) obj2;
                AbstractC0219i.d("it", abstractC0438v2);
                return AbstractC0415a.e(string, interfaceC0107b.d(abstractC0438v2).toString());
        }
    }
}
