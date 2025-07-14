package k3;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Field field, boolean z4, int i5) {
        super(field, z4);
        this.f7918e = i5;
    }

    @Override // k3.t
    public void a(Object[] objArr) {
        switch (this.f7918e) {
            case 1:
                Y0.j.d(this, objArr);
                b(objArr.length == 0 ? null : objArr[0]);
                break;
            default:
                super.a(objArr);
                break;
        }
    }
}
