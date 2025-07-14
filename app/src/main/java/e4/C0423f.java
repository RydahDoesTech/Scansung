package e4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* renamed from: e4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423f extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0423f f6678e = new C0423f(1, 0);
    public static final C0423f f = new C0423f(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0423f(int i5, int i6) {
        super(i5);
        this.f6679d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f6679d) {
            case 0:
                ((Boolean) obj).getClass();
                return new C0422e(g3.y.N(g4.j.f6840d));
            default:
                AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
                AbstractC0219i.e("it", abstractC0438v);
                return abstractC0438v.toString();
        }
    }
}
