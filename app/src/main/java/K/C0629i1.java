package k;

import android.util.IntProperty;

/* renamed from: k.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629i1 extends IntProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0632j1 f7677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629i1(C0632j1 c0632j1) {
        super("visual_progress");
        this.f7677a = c0632j1;
    }

    @Override // android.util.Property
    public final Integer get(Object obj) {
        return Integer.valueOf(((C0632j1) obj).f7684e);
    }

    @Override // android.util.IntProperty
    public final void setValue(Object obj, int i5) {
        ((C0632j1) obj).f7684e = i5;
        this.f7677a.invalidateSelf();
    }
}
