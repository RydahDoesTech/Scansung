package com.google.android.material.appbar.model;

import P2.m;
import android.content.Context;
import b3.AbstractC0219i;
import g3.InterfaceC0453c;
import g3.InterfaceC0456f;
import kotlin.Metadata;
import x1.AbstractC0909a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u000eB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/android/material/appbar/model/AppBarModel;", "Lx1/a;", "T", "", "Lg3/c;", "kclazz", "Landroid/content/Context;", "context", "<init>", "(Lg3/c;Landroid/content/Context;)V", "create", "()Lx1/a;", "Lg3/c;", "Landroid/content/Context;", "OnClickListener", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class AppBarModel<T extends AbstractC0909a> {
    private final Context context;
    private final InterfaceC0453c kclazz;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/google/android/material/appbar/model/AppBarModel$OnClickListener;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnClickListener {
        void onClick();
    }

    public AppBarModel(InterfaceC0453c interfaceC0453c, Context context) {
        AbstractC0219i.e("kclazz", interfaceC0453c);
        AbstractC0219i.e("context", context);
        this.kclazz = interfaceC0453c;
        this.context = context;
    }

    public T create() {
        return (T) init((AbstractC0909a) ((InterfaceC0456f) m.t0(this.kclazz.k())).i(this.context, null));
    }

    public AbstractC0909a init(AbstractC0909a abstractC0909a) {
        AbstractC0219i.e("moduleView", abstractC0909a);
        return abstractC0909a;
    }
}
