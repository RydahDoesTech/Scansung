package androidx.activity;

import a3.InterfaceC0106a;
import androidx.fragment.app.S;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f3135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(v vVar, int i5) {
        super(0);
        this.f3134d = i5;
        this.f3135e = vVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        Object objPrevious;
        switch (this.f3134d) {
            case 0:
                this.f3135e.b();
                break;
            default:
                v vVar = this.f3135e;
                P2.h hVar = vVar.f3170b;
                ListIterator listIterator = hVar.listIterator(hVar.l());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((S) objPrevious).f3737a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                vVar.f3171c = null;
                break;
        }
        return O2.l.f2016a;
    }
}
