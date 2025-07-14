package L3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public enum h implements InterfaceC0085q {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f1776d;

    h(int i5) {
        this.f1776d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1776d;
    }
}
