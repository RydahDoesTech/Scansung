package androidx.activity;

import a3.InterfaceC0107b;
import androidx.fragment.app.S;
import b3.AbstractC0219i;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f3133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(v vVar, int i5) {
        super(1);
        this.f3132d = i5;
        this.f3133e = vVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f3132d) {
            case 0:
                AbstractC0219i.e("backEvent", (b) obj);
                v vVar = this.f3133e;
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
                vVar.f3171c = (S) objPrevious;
                break;
            default:
                AbstractC0219i.e("backEvent", (b) obj);
                P2.h hVar2 = this.f3133e.f3170b;
                ListIterator listIterator2 = hVar2.listIterator(hVar2.l());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((S) objPrevious2).f3737a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return O2.l.f2016a;
    }
}
