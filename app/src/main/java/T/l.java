package t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f8941a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8942b;

    public static long a(f fVar, long j5) {
        o oVar = fVar.f8930d;
        if (oVar instanceof j) {
            return j5;
        }
        ArrayList arrayList = fVar.f8936k;
        int size = arrayList.size();
        long jMin = j5;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC0872d interfaceC0872d = (InterfaceC0872d) arrayList.get(i5);
            if (interfaceC0872d instanceof f) {
                f fVar2 = (f) interfaceC0872d;
                if (fVar2.f8930d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f + j5));
                }
            }
        }
        if (fVar != oVar.f8957i) {
            return jMin;
        }
        long j6 = oVar.j();
        long j7 = j5 - j6;
        return Math.min(Math.min(jMin, a(oVar.f8956h, j7)), j7 - r9.f);
    }

    public static long b(f fVar, long j5) {
        o oVar = fVar.f8930d;
        if (oVar instanceof j) {
            return j5;
        }
        ArrayList arrayList = fVar.f8936k;
        int size = arrayList.size();
        long jMax = j5;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC0872d interfaceC0872d = (InterfaceC0872d) arrayList.get(i5);
            if (interfaceC0872d instanceof f) {
                f fVar2 = (f) interfaceC0872d;
                if (fVar2.f8930d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f + j5));
                }
            }
        }
        if (fVar != oVar.f8956h) {
            return jMax;
        }
        long j6 = oVar.j();
        long j7 = j5 + j6;
        return Math.max(Math.max(jMax, b(oVar.f8957i, j7)), j7 - r9.f);
    }
}
