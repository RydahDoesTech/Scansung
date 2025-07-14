package com.google.android.material.appbar.model;

import b3.AbstractC0215e;
import com.google.android.material.appbar.model.AppBarModel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/material/appbar/model/ButtonModel;", "", "", "text", "Lcom/google/android/material/appbar/model/AppBarModel$OnClickListener;", "clickListener", "contentDescription", "<init>", "(Ljava/lang/String;Lcom/google/android/material/appbar/model/AppBarModel$OnClickListener;Ljava/lang/String;)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ButtonModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f5721a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarModel.OnClickListener f5722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5723c;

    public ButtonModel() {
        this(null, null, null, 7, null);
    }

    public ButtonModel(String str) {
        this(str, null, null, 6, null);
    }

    public ButtonModel(String str, AppBarModel.OnClickListener onClickListener) {
        this(str, onClickListener, null, 4, null);
    }

    public ButtonModel(String str, AppBarModel.OnClickListener onClickListener, String str2) {
        this.f5721a = str;
        this.f5722b = onClickListener;
        this.f5723c = str2;
    }

    public /* synthetic */ ButtonModel(String str, AppBarModel.OnClickListener onClickListener, String str2, int i5, AbstractC0215e abstractC0215e) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : onClickListener, (i5 & 4) != 0 ? null : str2);
    }
}
