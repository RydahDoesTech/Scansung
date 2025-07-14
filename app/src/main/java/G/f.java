package G;

import java.util.ArrayList;
import o.C0713k;

/* loaded from: classes.dex */
public final class f implements I.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f686b;

    public /* synthetic */ f(int i5, Object obj) {
        this.f685a = i5;
        this.f686b = obj;
    }

    @Override // I.a
    public final void accept(Object obj) {
        switch (this.f685a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((E0.d) this.f686b).L0(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f691c) {
                    try {
                        C0713k c0713k = h.f692d;
                        ArrayList arrayList = (ArrayList) c0713k.getOrDefault((String) this.f686b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0713k.remove((String) this.f686b);
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            ((I.a) arrayList.get(i5)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
