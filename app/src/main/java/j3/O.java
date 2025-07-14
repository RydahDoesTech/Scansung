package j3;

import O3.C0086s;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import e1.AbstractC0415a;
import g3.InterfaceC0466p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o3.C0728k;
import u3.C0880b;
import u3.C0881c;
import u3.C0884f;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public final class O extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f7346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(P p2, int i5) {
        super(0);
        this.f7345d = i5;
        this.f7346e = p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable] */
    @Override // a3.InterfaceC0106a
    public final Object a() throws C0086s {
        String[] strArr;
        ?? N4;
        switch (this.f7345d) {
            case 0:
                P p2 = this.f7346e;
                p2.getClass();
                InterfaceC0466p interfaceC0466p = P.f7347g[0];
                C0881c c0881c = (C0881c) p2.f7348c.a();
                if (c0881c == null) {
                    return null;
                }
                H3.b bVar = c0881c.f9188b;
                String[] strArr2 = (String[]) bVar.f;
                if (strArr2 == null || (strArr = (String[]) bVar.f828h) == null) {
                    return null;
                }
                O2.f fVarH = M3.h.h(strArr2, strArr);
                return new O2.j((M3.g) fVarH.f2006d, (I3.C) fVarH.f2007e, (M3.f) bVar.f826e);
            default:
                P p5 = this.f7346e;
                p5.getClass();
                InterfaceC0466p interfaceC0466p2 = P.f7347g[0];
                C0881c c0881c2 = (C0881c) p5.f7348c.a();
                if (c0881c2 == null) {
                    return X3.m.f2791b;
                }
                InterfaceC0466p interfaceC0466p3 = AbstractC0559A.f7323b[0];
                Object objA = p5.f7324a.a();
                AbstractC0219i.d("<get-moduleData>(...)", objA);
                D3.c cVar = ((C0884f) objA).f9193b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f508g;
                Class cls = c0881c2.f9187a;
                N3.b bVarA = AbstractC0897d.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    N3.c cVarG = AbstractC0897d.a(cls).g();
                    AbstractC0219i.d("fileClass.classId.packageFqName", cVarG);
                    H3.b bVar2 = c0881c2.f9188b;
                    H3.a aVar = H3.a.MULTIFILE_CLASS;
                    G3.f fVar = (G3.f) cVar.f507e;
                    H3.a aVar2 = (H3.a) bVar2.f825d;
                    if (aVar2 == aVar) {
                        String[] strArr3 = aVar2 == aVar ? (String[]) bVar2.f : null;
                        List listI0 = strArr3 != null ? P2.i.i0(strArr3) : null;
                        if (listI0 == null) {
                            listI0 = P2.u.f2163d;
                        }
                        N4 = new ArrayList();
                        Iterator it = listI0.iterator();
                        while (it.hasNext()) {
                            N3.b bVarJ = N3.b.j(new N3.c(V3.b.d((String) it.next()).f2625a.replace(IDMTndsXmlWbxmlDefine.XML_SLASH, '.')));
                            AbstractC0219i.e("<this>", fVar.c().f3039c);
                            C0881c c0881cK = AbstractC0415a.k((C0880b) cVar.f, bVarJ, M3.f.f1821g);
                            if (c0881cK != null) {
                                N4.add(c0881cK);
                            }
                        }
                    } else {
                        N4 = g3.y.N(c0881c2);
                    }
                    C0728k c0728k = new C0728k(fVar.c().f3038b, cVarG, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = N4.iterator();
                    while (it2.hasNext()) {
                        c4.p pVarA = fVar.a(c0728k, (C0881c) it2.next());
                        if (pVarA != null) {
                            arrayList.add(pVarA);
                        }
                    }
                    X3.n nVarL = g3.y.l("package " + cVarG + " (" + c0881c2 + ')', P2.m.O0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, nVarL);
                    obj = objPutIfAbsent == null ? nVarL : objPutIfAbsent;
                }
                AbstractC0219i.d("cache.getOrPut(fileClass…ileClass)\", scopes)\n    }", obj);
                return (X3.n) obj;
        }
    }
}
