package E1;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.viewpager2.widget.ViewPager2;
import b0.C0198c;
import b3.AbstractC0219i;
import com.google.android.material.appbar.model.view.ViewPagerAppBarView;
import com.google.android.material.chip.SeslExpandableContainer;
import java.util.ArrayList;
import k.C0620f1;
import k.InterfaceC0611c1;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f608e;

    public /* synthetic */ u(int i5, Object obj) {
        this.f607d = i5;
        this.f608e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f607d) {
            case 0:
                SeslExpandableContainer seslExpandableContainer = (SeslExpandableContainer) this.f608e;
                seslExpandableContainer.f5848h = !seslExpandableContainer.f5848h;
                seslExpandableContainer.a();
                seslExpandableContainer.post(new s(seslExpandableContainer, 1));
                return;
            case 1:
                R1.d dVar = (R1.d) this.f608e;
                EditText editText = dVar.f2374i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.q();
                return;
            case 2:
                ((R1.k) this.f608e).u();
                return;
            case 3:
                R1.w wVar = (R1.w) this.f608e;
                EditText editText2 = wVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = wVar.f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    wVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    wVar.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    wVar.f.setSelection(selectionEnd);
                }
                wVar.q();
                return;
            case 4:
                ((com.google.android.material.datepicker.o) this.f608e).g();
                throw null;
            case 5:
                C0620f1 c0620f1 = (C0620f1) this.f608e;
                InterfaceC0611c1 interfaceC0611c1 = c0620f1.f7663e;
                if (interfaceC0611c1 != null) {
                    ArrayList arrayList = c0620f1.f7662d;
                    AbstractC0219i.e("<this>", arrayList);
                    int iIndexOf = arrayList.indexOf(view);
                    ViewPager2 viewpager = ((ViewPagerAppBarView) ((C0198c) interfaceC0611c1).f5001d).getViewpager();
                    if (viewpager != null) {
                        viewpager.c(iIndexOf);
                        return;
                    }
                    return;
                }
                return;
            default:
                f0.b bVar = (f0.b) this.f608e;
                bVar.onClick(bVar, -1);
                return;
        }
    }
}
