package k;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import b0.C0198c;
import b3.AbstractC0219i;
import com.google.android.material.appbar.model.AppBarModel;
import com.google.android.material.appbar.model.ButtonModel;
import com.google.android.material.appbar.model.view.SuggestAppBarView;
import com.google.android.material.appbar.model.view.ViewPagerAppBarView;
import java.util.ArrayList;

/* renamed from: k.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0608b1 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7653e;
    public final /* synthetic */ ViewGroup f;

    public /* synthetic */ ViewOnClickListenerC0608b1(Object obj, ViewGroup viewGroup, int i5) {
        this.f7652d = i5;
        this.f7653e = obj;
        this.f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7652d) {
            case 0:
                InterfaceC0611c1 interfaceC0611c1 = (InterfaceC0611c1) this.f7653e;
                AbstractC0219i.e("$itemClickListener", interfaceC0611c1);
                C0620f1 c0620f1 = (C0620f1) this.f;
                AbstractC0219i.e("this$0", c0620f1);
                ArrayList arrayList = c0620f1.f7662d;
                AbstractC0219i.e("<this>", arrayList);
                int iIndexOf = arrayList.indexOf(view);
                ViewPager2 viewpager = ((ViewPagerAppBarView) ((C0198c) interfaceC0611c1).f5001d).getViewpager();
                if (viewpager != null) {
                    viewpager.c(iIndexOf);
                    break;
                }
                break;
            case 1:
                SuggestAppBarView.generateButton$lambda$9$lambda$8((ButtonModel) this.f7653e, (SuggestAppBarView) this.f, view);
                break;
            default:
                SuggestAppBarView.setCloseClickListener$lambda$4$lambda$3((AppBarModel.OnClickListener) this.f7653e, (SuggestAppBarView) this.f, view);
                break;
        }
    }
}
