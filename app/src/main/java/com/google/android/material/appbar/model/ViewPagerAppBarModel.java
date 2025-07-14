package com.google.android.material.appbar.model;

import P2.u;
import android.content.Context;
import b3.AbstractC0215e;
import b3.AbstractC0219i;
import com.google.android.material.appbar.model.view.ViewPagerAppBarView;
import g3.InterfaceC0453c;
import java.util.List;
import kotlin.Metadata;
import x1.AbstractC0909a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/material/appbar/model/ViewPagerAppBarModel;", "Lcom/google/android/material/appbar/model/view/ViewPagerAppBarView;", "T", "Lcom/google/android/material/appbar/model/AppBarModel;", "Lg3/c;", "kclazz", "Landroid/content/Context;", "context", "", "Lx1/a;", "appBarModels", "<init>", "(Lg3/c;Landroid/content/Context;Ljava/util/List;)V", "moduleView", "init", "(Lcom/google/android/material/appbar/model/view/ViewPagerAppBarView;)Lcom/google/android/material/appbar/model/view/ViewPagerAppBarView;", "Ljava/util/List;", "Builder", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewPagerAppBarModel<T extends ViewPagerAppBarView> extends AppBarModel<T> {
    private final List<AppBarModel<? extends AbstractC0909a>> appBarModels;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/material/appbar/model/ViewPagerAppBarModel$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public Builder(Context context) {
            AbstractC0219i.e("context", context);
        }
    }

    public /* synthetic */ ViewPagerAppBarModel(InterfaceC0453c interfaceC0453c, Context context, List list, int i5, AbstractC0215e abstractC0215e) {
        this(interfaceC0453c, context, (i5 & 4) != 0 ? u.f2163d : list);
    }

    @Override // com.google.android.material.appbar.model.AppBarModel
    public T init(T moduleView) {
        AbstractC0219i.e("moduleView", moduleView);
        return moduleView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewPagerAppBarModel(InterfaceC0453c interfaceC0453c, Context context, List<? extends AppBarModel<? extends AbstractC0909a>> list) {
        super(interfaceC0453c, context);
        AbstractC0219i.e("kclazz", interfaceC0453c);
        AbstractC0219i.e("context", context);
        AbstractC0219i.e("appBarModels", list);
        this.appBarModels = list;
    }
}
