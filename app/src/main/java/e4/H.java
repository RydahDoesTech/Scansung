package e4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class H extends AbstractC0420c {

    /* renamed from: b, reason: collision with root package name */
    public static final H f6647b = new H(0);

    /* renamed from: c, reason: collision with root package name */
    public static final H f6648c = new H(1);

    /* renamed from: d, reason: collision with root package name */
    public static final H f6649d = new H(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6650a;

    public /* synthetic */ H(int i5) {
        this.f6650a = i5;
    }

    @Override // e4.AbstractC0420c
    public final h4.d x(I i5, h4.c cVar) {
        switch (this.f6650a) {
            case 0:
                AbstractC0219i.e("state", i5);
                AbstractC0219i.e("type", cVar);
                return i5.f6653c.z(cVar);
            case 1:
                AbstractC0219i.e("state", i5);
                AbstractC0219i.e("type", cVar);
                throw new UnsupportedOperationException("Should not be called");
            default:
                AbstractC0219i.e("state", i5);
                AbstractC0219i.e("type", cVar);
                return i5.f6653c.b0(cVar);
        }
    }
}
