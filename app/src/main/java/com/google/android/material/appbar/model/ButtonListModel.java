package com.google.android.material.appbar.model;

import b3.AbstractC0219i;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/material/appbar/model/ButtonListModel;", "", "Lcom/google/android/material/appbar/model/ButtonStyle;", "buttonStyle", "", "Lcom/google/android/material/appbar/model/ButtonModel;", "buttonModels", "<init>", "(Lcom/google/android/material/appbar/model/ButtonStyle;Ljava/util/List;)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonListModel {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonStyle f5719a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5720b;

    public ButtonListModel(ButtonStyle buttonStyle, List<? extends ButtonModel> list) {
        AbstractC0219i.e("buttonStyle", buttonStyle);
        AbstractC0219i.e("buttonModels", list);
        this.f5719a = buttonStyle;
        this.f5720b = list;
    }
}
