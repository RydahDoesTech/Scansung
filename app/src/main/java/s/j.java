package s;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f8721a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:179:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0710 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(s.e r37, r.c r38, java.util.ArrayList r39, int r40) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.a(s.e, r.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, r.c cVar, C0822d c0822d) {
        c0822d.f8650j = -1;
        c0822d.f8652k = -1;
        int i5 = eVar.f8651j0[0];
        int[] iArr = c0822d.f8651j0;
        if (i5 != 2 && iArr[0] == 4) {
            C0821c c0821c = c0822d.f8611C;
            int i6 = c0821c.f8606g;
            int iN = eVar.n();
            C0821c c0821c2 = c0822d.E;
            int i7 = iN - c0821c2.f8606g;
            c0821c.f8608i = cVar.k(c0821c);
            c0821c2.f8608i = cVar.k(c0821c2);
            cVar.d(c0821c.f8608i, i6);
            cVar.d(c0821c2.f8608i, i7);
            c0822d.f8650j = 2;
            c0822d.f8626S = i6;
            int i8 = i7 - i6;
            c0822d.f8622O = i8;
            int i9 = c0822d.f8629V;
            if (i8 < i9) {
                c0822d.f8622O = i9;
            }
        }
        if (eVar.f8651j0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0821c c0821c3 = c0822d.f8612D;
        int i10 = c0821c3.f8606g;
        int iK = eVar.k();
        C0821c c0821c4 = c0822d.f8613F;
        int i11 = iK - c0821c4.f8606g;
        c0821c3.f8608i = cVar.k(c0821c3);
        c0821c4.f8608i = cVar.k(c0821c4);
        cVar.d(c0821c3.f8608i, i10);
        cVar.d(c0821c4.f8608i, i11);
        if (c0822d.f8628U > 0 || c0822d.f8635a0 == 8) {
            C0821c c0821c5 = c0822d.f8614G;
            r.f fVarK = cVar.k(c0821c5);
            c0821c5.f8608i = fVarK;
            cVar.d(fVarK, c0822d.f8628U + i10);
        }
        c0822d.f8652k = 2;
        c0822d.f8627T = i10;
        int i12 = i11 - i10;
        c0822d.f8623P = i12;
        int i13 = c0822d.f8630W;
        if (i12 < i13) {
            c0822d.f8623P = i13;
        }
    }

    public static final boolean c(int i5, int i6) {
        return (i5 & i6) == i6;
    }
}
