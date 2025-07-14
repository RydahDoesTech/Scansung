package C3;

import a3.InterfaceC0106a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u3.C0881c;

/* loaded from: classes.dex */
public final class s extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i5) {
        super(0);
        this.f438d = i5;
        this.f439e = tVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f438d) {
            case 0:
                t tVar = this.f439e;
                B3.b bVar = (B3.b) tVar.f442k.f255e;
                tVar.f8745h.b();
                bVar.f233l.getClass();
                return P2.z.k0(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) V1.a.Q(this.f439e.f443l, t.f440p[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    C0881c c0881c = (C0881c) entry.getValue();
                    V3.b bVarD = V3.b.d(str);
                    H3.b bVar2 = c0881c.f9188b;
                    H3.a aVar = (H3.a) bVar2.f825d;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarD, bVarD);
                    } else if (iOrdinal == 5) {
                        String str2 = aVar == H3.a.MULTIFILE_CLASS_PART ? bVar2.f823b : null;
                        if (str2 != null) {
                            map.put(bVarD, V3.b.d(str2));
                        }
                    }
                }
                return map;
            default:
                this.f439e.f441j.getClass();
                return new ArrayList(P2.o.l0(P2.u.f2163d));
        }
    }
}
