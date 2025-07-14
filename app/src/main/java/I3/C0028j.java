package I3;

import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0081m;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.wbxml.IDMWbxmlConstants;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028j extends AbstractC0081m {

    /* renamed from: M, reason: collision with root package name */
    public static final C0028j f1274M;

    /* renamed from: N, reason: collision with root package name */
    public static final C0019a f1275N = new C0019a(3);

    /* renamed from: A, reason: collision with root package name */
    public Q f1276A;

    /* renamed from: B, reason: collision with root package name */
    public int f1277B;

    /* renamed from: C, reason: collision with root package name */
    public List f1278C;

    /* renamed from: D, reason: collision with root package name */
    public int f1279D;
    public List E;

    /* renamed from: F, reason: collision with root package name */
    public List f1280F;

    /* renamed from: G, reason: collision with root package name */
    public int f1281G;

    /* renamed from: H, reason: collision with root package name */
    public X f1282H;

    /* renamed from: I, reason: collision with root package name */
    public List f1283I;

    /* renamed from: J, reason: collision with root package name */
    public e0 f1284J;

    /* renamed from: K, reason: collision with root package name */
    public byte f1285K;

    /* renamed from: L, reason: collision with root package name */
    public int f1286L;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1287e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1288g;

    /* renamed from: h, reason: collision with root package name */
    public int f1289h;

    /* renamed from: i, reason: collision with root package name */
    public int f1290i;

    /* renamed from: j, reason: collision with root package name */
    public List f1291j;

    /* renamed from: k, reason: collision with root package name */
    public List f1292k;

    /* renamed from: l, reason: collision with root package name */
    public List f1293l;

    /* renamed from: m, reason: collision with root package name */
    public int f1294m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public int f1295o;

    /* renamed from: p, reason: collision with root package name */
    public List f1296p;

    /* renamed from: q, reason: collision with root package name */
    public List f1297q;

    /* renamed from: r, reason: collision with root package name */
    public int f1298r;

    /* renamed from: s, reason: collision with root package name */
    public List f1299s;

    /* renamed from: t, reason: collision with root package name */
    public List f1300t;

    /* renamed from: u, reason: collision with root package name */
    public List f1301u;

    /* renamed from: v, reason: collision with root package name */
    public List f1302v;

    /* renamed from: w, reason: collision with root package name */
    public List f1303w;

    /* renamed from: x, reason: collision with root package name */
    public List f1304x;

    /* renamed from: y, reason: collision with root package name */
    public int f1305y;

    /* renamed from: z, reason: collision with root package name */
    public int f1306z;

    static {
        C0028j c0028j = new C0028j();
        f1274M = c0028j;
        c0028j.p();
    }

    public C0028j(C0026h c0026h) {
        super(c0026h);
        this.f1294m = -1;
        this.f1295o = -1;
        this.f1298r = -1;
        this.f1305y = -1;
        this.f1279D = -1;
        this.f1281G = -1;
        this.f1285K = (byte) -1;
        this.f1286L = -1;
        this.f1287e = c0026h.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1274M;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1285K;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f & 2) != 2) {
            this.f1285K = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f1291j.size(); i5++) {
            if (!((W) this.f1291j.get(i5)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f1292k.size(); i6++) {
            if (!((Q) this.f1292k.get(i6)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f1296p.size(); i7++) {
            if (!((Q) this.f1296p.get(i7)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f1299s.size(); i8++) {
            if (!((C0030l) this.f1299s.get(i8)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f1300t.size(); i9++) {
            if (!((C0042y) this.f1300t.get(i9)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f1301u.size(); i10++) {
            if (!((G) this.f1301u.get(i10)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f1302v.size(); i11++) {
            if (!((T) this.f1302v.get(i11)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f1303w.size(); i12++) {
            if (!((C0037t) this.f1303w.get(i12)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        if ((this.f & 16) == 16 && !this.f1276A.b()) {
            this.f1285K = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.E.size(); i13++) {
            if (!((Q) this.E.get(i13)).b()) {
                this.f1285K = (byte) 0;
                return false;
            }
        }
        if ((this.f & 64) == 64 && !this.f1282H.b()) {
            this.f1285K = (byte) 0;
            return false;
        }
        if (i()) {
            this.f1285K = (byte) 1;
            return true;
        }
        this.f1285K = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1286L;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 1) == 1 ? A1.j.b(1, this.f1288g) : 0;
        int iC = 0;
        for (int i6 = 0; i6 < this.f1293l.size(); i6++) {
            iC += A1.j.c(((Integer) this.f1293l.get(i6)).intValue());
        }
        int iD = iB + iC;
        if (!this.f1293l.isEmpty()) {
            iD = iD + 1 + A1.j.c(iC);
        }
        this.f1294m = iC;
        if ((this.f & 2) == 2) {
            iD += A1.j.b(3, this.f1289h);
        }
        if ((this.f & 4) == 4) {
            iD += A1.j.b(4, this.f1290i);
        }
        for (int i7 = 0; i7 < this.f1291j.size(); i7++) {
            iD += A1.j.d(5, (AbstractC0070b) this.f1291j.get(i7));
        }
        for (int i8 = 0; i8 < this.f1292k.size(); i8++) {
            iD += A1.j.d(6, (AbstractC0070b) this.f1292k.get(i8));
        }
        int iC2 = 0;
        for (int i9 = 0; i9 < this.n.size(); i9++) {
            iC2 += A1.j.c(((Integer) this.n.get(i9)).intValue());
        }
        int iD2 = iD + iC2;
        if (!this.n.isEmpty()) {
            iD2 = iD2 + 1 + A1.j.c(iC2);
        }
        this.f1295o = iC2;
        for (int i10 = 0; i10 < this.f1299s.size(); i10++) {
            iD2 += A1.j.d(8, (AbstractC0070b) this.f1299s.get(i10));
        }
        for (int i11 = 0; i11 < this.f1300t.size(); i11++) {
            iD2 += A1.j.d(9, (AbstractC0070b) this.f1300t.get(i11));
        }
        for (int i12 = 0; i12 < this.f1301u.size(); i12++) {
            iD2 += A1.j.d(10, (AbstractC0070b) this.f1301u.get(i12));
        }
        for (int i13 = 0; i13 < this.f1302v.size(); i13++) {
            iD2 += A1.j.d(11, (AbstractC0070b) this.f1302v.get(i13));
        }
        for (int i14 = 0; i14 < this.f1303w.size(); i14++) {
            iD2 += A1.j.d(13, (AbstractC0070b) this.f1303w.get(i14));
        }
        int iC3 = 0;
        for (int i15 = 0; i15 < this.f1304x.size(); i15++) {
            iC3 += A1.j.c(((Integer) this.f1304x.get(i15)).intValue());
        }
        int iD3 = iD2 + iC3;
        if (!this.f1304x.isEmpty()) {
            iD3 = iD3 + 2 + A1.j.c(iC3);
        }
        this.f1305y = iC3;
        if ((this.f & 8) == 8) {
            iD3 += A1.j.b(17, this.f1306z);
        }
        if ((this.f & 16) == 16) {
            iD3 += A1.j.d(18, this.f1276A);
        }
        if ((this.f & 32) == 32) {
            iD3 += A1.j.b(19, this.f1277B);
        }
        for (int i16 = 0; i16 < this.f1296p.size(); i16++) {
            iD3 += A1.j.d(20, (AbstractC0070b) this.f1296p.get(i16));
        }
        int iC4 = 0;
        for (int i17 = 0; i17 < this.f1297q.size(); i17++) {
            iC4 += A1.j.c(((Integer) this.f1297q.get(i17)).intValue());
        }
        int iC5 = iD3 + iC4;
        if (!this.f1297q.isEmpty()) {
            iC5 = iC5 + 2 + A1.j.c(iC4);
        }
        this.f1298r = iC4;
        int iC6 = 0;
        for (int i18 = 0; i18 < this.f1278C.size(); i18++) {
            iC6 += A1.j.c(((Integer) this.f1278C.get(i18)).intValue());
        }
        int iD4 = iC5 + iC6;
        if (!this.f1278C.isEmpty()) {
            iD4 = iD4 + 2 + A1.j.c(iC6);
        }
        this.f1279D = iC6;
        for (int i19 = 0; i19 < this.E.size(); i19++) {
            iD4 += A1.j.d(23, (AbstractC0070b) this.E.get(i19));
        }
        int iC7 = 0;
        for (int i20 = 0; i20 < this.f1280F.size(); i20++) {
            iC7 += A1.j.c(((Integer) this.f1280F.get(i20)).intValue());
        }
        int iD5 = iD4 + iC7;
        if (!this.f1280F.isEmpty()) {
            iD5 = iD5 + 2 + A1.j.c(iC7);
        }
        this.f1281G = iC7;
        if ((this.f & 64) == 64) {
            iD5 += A1.j.d(30, this.f1282H);
        }
        int iC8 = 0;
        for (int i21 = 0; i21 < this.f1283I.size(); i21++) {
            iC8 += A1.j.c(((Integer) this.f1283I.get(i21)).intValue());
        }
        int size = (this.f1283I.size() * 2) + iD5 + iC8;
        if ((this.f & 128) == 128) {
            size += A1.j.d(32, this.f1284J);
        }
        int size2 = this.f1287e.size() + j() + size;
        this.f1286L = size2;
        return size2;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0026h.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0026h c0026hH = C0026h.h();
        c0026hH.i(this);
        return c0026hH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.m(1, this.f1288g);
        }
        if (this.f1293l.size() > 0) {
            jVar.v(18);
            jVar.v(this.f1294m);
        }
        for (int i5 = 0; i5 < this.f1293l.size(); i5++) {
            jVar.n(((Integer) this.f1293l.get(i5)).intValue());
        }
        if ((this.f & 2) == 2) {
            jVar.m(3, this.f1289h);
        }
        if ((this.f & 4) == 4) {
            jVar.m(4, this.f1290i);
        }
        for (int i6 = 0; i6 < this.f1291j.size(); i6++) {
            jVar.o(5, (AbstractC0070b) this.f1291j.get(i6));
        }
        for (int i7 = 0; i7 < this.f1292k.size(); i7++) {
            jVar.o(6, (AbstractC0070b) this.f1292k.get(i7));
        }
        if (this.n.size() > 0) {
            jVar.v(58);
            jVar.v(this.f1295o);
        }
        for (int i8 = 0; i8 < this.n.size(); i8++) {
            jVar.n(((Integer) this.n.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.f1299s.size(); i9++) {
            jVar.o(8, (AbstractC0070b) this.f1299s.get(i9));
        }
        for (int i10 = 0; i10 < this.f1300t.size(); i10++) {
            jVar.o(9, (AbstractC0070b) this.f1300t.get(i10));
        }
        for (int i11 = 0; i11 < this.f1301u.size(); i11++) {
            jVar.o(10, (AbstractC0070b) this.f1301u.get(i11));
        }
        for (int i12 = 0; i12 < this.f1302v.size(); i12++) {
            jVar.o(11, (AbstractC0070b) this.f1302v.get(i12));
        }
        for (int i13 = 0; i13 < this.f1303w.size(); i13++) {
            jVar.o(13, (AbstractC0070b) this.f1303w.get(i13));
        }
        if (this.f1304x.size() > 0) {
            jVar.v(130);
            jVar.v(this.f1305y);
        }
        for (int i14 = 0; i14 < this.f1304x.size(); i14++) {
            jVar.n(((Integer) this.f1304x.get(i14)).intValue());
        }
        if ((this.f & 8) == 8) {
            jVar.m(17, this.f1306z);
        }
        if ((this.f & 16) == 16) {
            jVar.o(18, this.f1276A);
        }
        if ((this.f & 32) == 32) {
            jVar.m(19, this.f1277B);
        }
        for (int i15 = 0; i15 < this.f1296p.size(); i15++) {
            jVar.o(20, (AbstractC0070b) this.f1296p.get(i15));
        }
        if (this.f1297q.size() > 0) {
            jVar.v(170);
            jVar.v(this.f1298r);
        }
        for (int i16 = 0; i16 < this.f1297q.size(); i16++) {
            jVar.n(((Integer) this.f1297q.get(i16)).intValue());
        }
        if (this.f1278C.size() > 0) {
            jVar.v(178);
            jVar.v(this.f1279D);
        }
        for (int i17 = 0; i17 < this.f1278C.size(); i17++) {
            jVar.n(((Integer) this.f1278C.get(i17)).intValue());
        }
        for (int i18 = 0; i18 < this.E.size(); i18++) {
            jVar.o(23, (AbstractC0070b) this.E.get(i18));
        }
        if (this.f1280F.size() > 0) {
            jVar.v(IDMWbxmlConstants.WBXML_EXT_2);
            jVar.v(this.f1281G);
        }
        for (int i19 = 0; i19 < this.f1280F.size(); i19++) {
            jVar.n(((Integer) this.f1280F.get(i19)).intValue());
        }
        if ((this.f & 64) == 64) {
            jVar.o(30, this.f1282H);
        }
        for (int i20 = 0; i20 < this.f1283I.size(); i20++) {
            jVar.m(31, ((Integer) this.f1283I.get(i20)).intValue());
        }
        if ((this.f & 128) == 128) {
            jVar.o(32, this.f1284J);
        }
        dVar.P0(19000, jVar);
        jVar.r(this.f1287e);
    }

    public final void p() {
        this.f1288g = 6;
        this.f1289h = 0;
        this.f1290i = 0;
        this.f1291j = Collections.emptyList();
        this.f1292k = Collections.emptyList();
        this.f1293l = Collections.emptyList();
        this.n = Collections.emptyList();
        this.f1296p = Collections.emptyList();
        this.f1297q = Collections.emptyList();
        this.f1299s = Collections.emptyList();
        this.f1300t = Collections.emptyList();
        this.f1301u = Collections.emptyList();
        this.f1302v = Collections.emptyList();
        this.f1303w = Collections.emptyList();
        this.f1304x = Collections.emptyList();
        this.f1306z = 0;
        this.f1276A = Q.f1072w;
        this.f1277B = 0;
        this.f1278C = Collections.emptyList();
        this.E = Collections.emptyList();
        this.f1280F = Collections.emptyList();
        this.f1282H = X.f1134j;
        this.f1283I = Collections.emptyList();
        this.f1284J = e0.f1228h;
    }

    public C0028j() {
        this.f1294m = -1;
        this.f1295o = -1;
        this.f1298r = -1;
        this.f1305y = -1;
        this.f1279D = -1;
        this.f1281G = -1;
        this.f1285K = (byte) -1;
        this.f1286L = -1;
        this.f1287e = AbstractC0073e.f2065d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public C0028j(C0074f c0074f, C0077i c0077i) {
        boolean z4;
        this.f1294m = -1;
        this.f1295o = -1;
        this.f1298r = -1;
        this.f1305y = -1;
        this.f1279D = -1;
        this.f1281G = -1;
        this.f1285K = (byte) -1;
        this.f1286L = -1;
        p();
        C0072d c0072dS = AbstractC0073e.s();
        A1.j jVarJ = A1.j.j(c0072dS, 1);
        boolean z5 = false;
        char c2 = 0;
        while (true) {
            ?? N4 = 64;
            if (!z5) {
                try {
                    try {
                        try {
                            int iN = c0074f.n();
                            switch (iN) {
                                case 0:
                                    z4 = true;
                                    z5 = true;
                                    c2 = c2;
                                case 8:
                                    z4 = true;
                                    this.f |= 1;
                                    this.f1288g = c0074f.f();
                                    c2 = c2;
                                case 16:
                                    int i5 = (c2 == true ? 1 : 0) & 32;
                                    char c5 = c2;
                                    if (i5 != 32) {
                                        this.f1293l = new ArrayList();
                                        c5 = (c2 == true ? 1 : 0) | ' ';
                                    }
                                    this.f1293l.add(Integer.valueOf(c0074f.f()));
                                    c2 = c5;
                                    z4 = true;
                                    c2 = c2;
                                case 18:
                                    int iD = c0074f.d(c0074f.k());
                                    int i6 = (c2 == true ? 1 : 0) & 32;
                                    char c6 = c2;
                                    if (i6 != 32) {
                                        c6 = c2;
                                        if (c0074f.b() > 0) {
                                            this.f1293l = new ArrayList();
                                            c6 = (c2 == true ? 1 : 0) | ' ';
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.f1293l.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD);
                                    c2 = c6;
                                    z4 = true;
                                    c2 = c2;
                                case 24:
                                    this.f |= 2;
                                    this.f1289h = c0074f.f();
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                case 32:
                                    this.f |= 4;
                                    this.f1290i = c0074f.f();
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                case 42:
                                    int i7 = (c2 == true ? 1 : 0) & 8;
                                    char c7 = c2;
                                    if (i7 != 8) {
                                        this.f1291j = new ArrayList();
                                        c7 = (c2 == true ? 1 : 0) | '\b';
                                    }
                                    this.f1291j.add(c0074f.g(W.f1124q, c0077i));
                                    c2 = c7;
                                    z4 = true;
                                    c2 = c2;
                                case 50:
                                    int i8 = (c2 == true ? 1 : 0) & 16;
                                    char c8 = c2;
                                    if (i8 != 16) {
                                        this.f1292k = new ArrayList();
                                        c8 = (c2 == true ? 1 : 0) | 16;
                                    }
                                    this.f1292k.add(c0074f.g(Q.f1073x, c0077i));
                                    c2 = c8;
                                    z4 = true;
                                    c2 = c2;
                                case 56:
                                    int i9 = (c2 == true ? 1 : 0) & 64;
                                    char c9 = c2;
                                    if (i9 != 64) {
                                        this.n = new ArrayList();
                                        c9 = (c2 == true ? 1 : 0) | '@';
                                    }
                                    this.n.add(Integer.valueOf(c0074f.f()));
                                    c2 = c9;
                                    z4 = true;
                                    c2 = c2;
                                case 58:
                                    int iD2 = c0074f.d(c0074f.k());
                                    int i10 = (c2 == true ? 1 : 0) & 64;
                                    char c10 = c2;
                                    if (i10 != 64) {
                                        c10 = c2;
                                        if (c0074f.b() > 0) {
                                            this.n = new ArrayList();
                                            c10 = (c2 == true ? 1 : 0) | '@';
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.n.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD2);
                                    c2 = c10;
                                    z4 = true;
                                    c2 = c2;
                                case 66:
                                    int i11 = (c2 == true ? 1 : 0) & 512;
                                    char c11 = c2;
                                    if (i11 != 512) {
                                        this.f1299s = new ArrayList();
                                        c11 = (c2 == true ? 1 : 0) | 512;
                                    }
                                    this.f1299s.add(c0074f.g(C0030l.f1312m, c0077i));
                                    c2 = c11;
                                    z4 = true;
                                    c2 = c2;
                                case 74:
                                    int i12 = (c2 == true ? 1 : 0) & 1024;
                                    char c12 = c2;
                                    if (i12 != 1024) {
                                        this.f1300t = new ArrayList();
                                        c12 = (c2 == true ? 1 : 0) | 1024;
                                    }
                                    this.f1300t.add(c0074f.g(C0042y.f1392y, c0077i));
                                    c2 = c12;
                                    z4 = true;
                                    c2 = c2;
                                case 82:
                                    int i13 = (c2 == true ? 1 : 0) & 2048;
                                    char c13 = c2;
                                    if (i13 != 2048) {
                                        this.f1301u = new ArrayList();
                                        c13 = (c2 == true ? 1 : 0) | 2048;
                                    }
                                    this.f1301u.add(c0074f.g(G.f999y, c0077i));
                                    c2 = c13;
                                    z4 = true;
                                    c2 = c2;
                                case 90:
                                    int i14 = (c2 == true ? 1 : 0) & 4096;
                                    char c14 = c2;
                                    if (i14 != 4096) {
                                        this.f1302v = new ArrayList();
                                        c14 = (c2 == true ? 1 : 0) | 4096;
                                    }
                                    this.f1302v.add(c0074f.g(T.f1100s, c0077i));
                                    c2 = c14;
                                    z4 = true;
                                    c2 = c2;
                                case 106:
                                    int i15 = (c2 == true ? 1 : 0) & 8192;
                                    char c15 = c2;
                                    if (i15 != 8192) {
                                        this.f1303w = new ArrayList();
                                        c15 = (c2 == true ? 1 : 0) | 8192;
                                    }
                                    this.f1303w.add(c0074f.g(C0037t.f1350k, c0077i));
                                    c2 = c15;
                                    z4 = true;
                                    c2 = c2;
                                case 128:
                                    int i16 = (c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT;
                                    char c16 = c2;
                                    if (i16 != 16384) {
                                        this.f1304x = new ArrayList();
                                        c16 = (c2 == true ? 1 : 0) | 16384;
                                    }
                                    this.f1304x.add(Integer.valueOf(c0074f.f()));
                                    c2 = c16;
                                    z4 = true;
                                    c2 = c2;
                                case 130:
                                    int iD3 = c0074f.d(c0074f.k());
                                    int i17 = (c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT;
                                    char c17 = c2;
                                    if (i17 != 16384) {
                                        c17 = c2;
                                        if (c0074f.b() > 0) {
                                            this.f1304x = new ArrayList();
                                            c17 = (c2 == true ? 1 : 0) | 16384;
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.f1304x.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD3);
                                    c2 = c17;
                                    z4 = true;
                                    c2 = c2;
                                case 136:
                                    this.f |= 8;
                                    this.f1306z = c0074f.f();
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                case 146:
                                    P pS = (this.f & 16) == 16 ? this.f1276A.e() : null;
                                    Q q5 = (Q) c0074f.g(Q.f1073x, c0077i);
                                    this.f1276A = q5;
                                    if (pS != null) {
                                        pS.i(q5);
                                        this.f1276A = pS.g();
                                    }
                                    this.f |= 16;
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                case 152:
                                    this.f |= 32;
                                    this.f1277B = c0074f.f();
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                case 162:
                                    int i18 = (c2 == true ? 1 : 0) & 128;
                                    char c18 = c2;
                                    if (i18 != 128) {
                                        this.f1296p = new ArrayList();
                                        c18 = (c2 == true ? 1 : 0) | 128;
                                    }
                                    this.f1296p.add(c0074f.g(Q.f1073x, c0077i));
                                    c2 = c18;
                                    z4 = true;
                                    c2 = c2;
                                case 168:
                                    int i19 = (c2 == true ? 1 : 0) & 256;
                                    char c19 = c2;
                                    if (i19 != 256) {
                                        this.f1297q = new ArrayList();
                                        c19 = (c2 == true ? 1 : 0) | 256;
                                    }
                                    this.f1297q.add(Integer.valueOf(c0074f.f()));
                                    c2 = c19;
                                    z4 = true;
                                    c2 = c2;
                                case 170:
                                    int iD4 = c0074f.d(c0074f.k());
                                    int i20 = (c2 == true ? 1 : 0) & 256;
                                    char c20 = c2;
                                    if (i20 != 256) {
                                        c20 = c2;
                                        if (c0074f.b() > 0) {
                                            this.f1297q = new ArrayList();
                                            c20 = (c2 == true ? 1 : 0) | 256;
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.f1297q.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD4);
                                    c2 = c20;
                                    z4 = true;
                                    c2 = c2;
                                case 176:
                                    int i21 = (c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH;
                                    char c21 = c2;
                                    if (i21 != 262144) {
                                        this.f1278C = new ArrayList();
                                        c21 = (c2 == true ? 1 : 0) | 0;
                                    }
                                    this.f1278C.add(Integer.valueOf(c0074f.f()));
                                    c2 = c21;
                                    z4 = true;
                                    c2 = c2;
                                case 178:
                                    int iD5 = c0074f.d(c0074f.k());
                                    int i22 = (c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH;
                                    char c22 = c2;
                                    if (i22 != 262144) {
                                        c22 = c2;
                                        if (c0074f.b() > 0) {
                                            this.f1278C = new ArrayList();
                                            c22 = (c2 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.f1278C.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD5);
                                    c2 = c22;
                                    z4 = true;
                                    c2 = c2;
                                case 186:
                                    int i23 = (c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME;
                                    char c23 = c2;
                                    if (i23 != 524288) {
                                        this.E = new ArrayList();
                                        c23 = (c2 == true ? 1 : 0) | 0;
                                    }
                                    this.E.add(c0074f.g(Q.f1073x, c0077i));
                                    c2 = c23;
                                    z4 = true;
                                    c2 = c2;
                                case IDMWbxmlConstants.WBXML_EXT_0 /* 192 */:
                                    int i24 = (c2 == true ? 1 : 0) & IDMDmInterface.IDM_MAX_OBJ_SIZE;
                                    char c24 = c2;
                                    if (i24 != 1048576) {
                                        this.f1280F = new ArrayList();
                                        c24 = (c2 == true ? 1 : 0) | 0;
                                    }
                                    this.f1280F.add(Integer.valueOf(c0074f.f()));
                                    c2 = c24;
                                    z4 = true;
                                    c2 = c2;
                                case IDMWbxmlConstants.WBXML_EXT_2 /* 194 */:
                                    int iD6 = c0074f.d(c0074f.k());
                                    int i25 = (c2 == true ? 1 : 0) & IDMDmInterface.IDM_MAX_OBJ_SIZE;
                                    char c25 = c2;
                                    if (i25 != 1048576) {
                                        c25 = c2;
                                        if (c0074f.b() > 0) {
                                            this.f1280F = new ArrayList();
                                            c25 = (c2 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.f1280F.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD6);
                                    c2 = c25;
                                    z4 = true;
                                    c2 = c2;
                                case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE /* 242 */:
                                    C0024f c0024fJ = (this.f & 64) == 64 ? this.f1282H.j() : null;
                                    X x4 = (X) c0074f.g(X.f1135k, c0077i);
                                    this.f1282H = x4;
                                    if (c0024fJ != null) {
                                        c0024fJ.l(x4);
                                        this.f1282H = c0024fJ.h();
                                    }
                                    this.f |= 64;
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                case 248:
                                    int i26 = (c2 == true ? 1 : 0) & 4194304;
                                    char c26 = c2;
                                    if (i26 != 4194304) {
                                        this.f1283I = new ArrayList();
                                        c26 = (c2 == true ? 1 : 0) | 0;
                                    }
                                    this.f1283I.add(Integer.valueOf(c0074f.f()));
                                    c2 = c26;
                                    z4 = true;
                                    c2 = c2;
                                case 250:
                                    int iD7 = c0074f.d(c0074f.k());
                                    int i27 = (c2 == true ? 1 : 0) & 4194304;
                                    char c27 = c2;
                                    if (i27 != 4194304) {
                                        c27 = c2;
                                        if (c0074f.b() > 0) {
                                            this.f1283I = new ArrayList();
                                            c27 = (c2 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c0074f.b() > 0) {
                                        this.f1283I.add(Integer.valueOf(c0074f.f()));
                                    }
                                    c0074f.c(iD7);
                                    c2 = c27;
                                    z4 = true;
                                    c2 = c2;
                                case 258:
                                    C0031m c0031mI = (this.f & 128) == 128 ? this.f1284J.i() : null;
                                    e0 e0Var = (e0) c0074f.g(e0.f1229i, c0077i);
                                    this.f1284J = e0Var;
                                    if (c0031mI != null) {
                                        c0031mI.m(e0Var);
                                        this.f1284J = c0031mI.i();
                                    }
                                    this.f |= 128;
                                    c2 = c2;
                                    z4 = true;
                                    c2 = c2;
                                default:
                                    N4 = n(c0074f, jVarJ, c0077i, iN);
                                    c2 = c2;
                                    if (N4 == 0) {
                                        z5 = true;
                                        c2 = c2;
                                    }
                                    z4 = true;
                                    c2 = c2;
                            }
                        } catch (IOException e5) {
                            C0086s c0086s = new C0086s(e5.getMessage());
                            c0086s.f2092d = this;
                            throw c0086s;
                        }
                    } catch (C0086s e6) {
                        e6.f2092d = this;
                        throw e6;
                    }
                } catch (Throwable th) {
                    if (((c2 == true ? 1 : 0) & 32) == 32) {
                        this.f1293l = Collections.unmodifiableList(this.f1293l);
                    }
                    if (((c2 == true ? 1 : 0) & 8) == 8) {
                        this.f1291j = Collections.unmodifiableList(this.f1291j);
                    }
                    if (((c2 == true ? 1 : 0) & 16) == 16) {
                        this.f1292k = Collections.unmodifiableList(this.f1292k);
                    }
                    if (((c2 == true ? 1 : 0) & 64) == N4) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if (((c2 == true ? 1 : 0) & 512) == 512) {
                        this.f1299s = Collections.unmodifiableList(this.f1299s);
                    }
                    if (((c2 == true ? 1 : 0) & 1024) == 1024) {
                        this.f1300t = Collections.unmodifiableList(this.f1300t);
                    }
                    if (((c2 == true ? 1 : 0) & 2048) == 2048) {
                        this.f1301u = Collections.unmodifiableList(this.f1301u);
                    }
                    if (((c2 == true ? 1 : 0) & 4096) == 4096) {
                        this.f1302v = Collections.unmodifiableList(this.f1302v);
                    }
                    if (((c2 == true ? 1 : 0) & 8192) == 8192) {
                        this.f1303w = Collections.unmodifiableList(this.f1303w);
                    }
                    if (((c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT) == 16384) {
                        this.f1304x = Collections.unmodifiableList(this.f1304x);
                    }
                    if (((c2 == true ? 1 : 0) & 128) == 128) {
                        this.f1296p = Collections.unmodifiableList(this.f1296p);
                    }
                    if (((c2 == true ? 1 : 0) & 256) == 256) {
                        this.f1297q = Collections.unmodifiableList(this.f1297q);
                    }
                    if (((c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH) == 262144) {
                        this.f1278C = Collections.unmodifiableList(this.f1278C);
                    }
                    if (((c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME) == 524288) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (((c2 == true ? 1 : 0) & IDMDmInterface.IDM_MAX_OBJ_SIZE) == 1048576) {
                        this.f1280F = Collections.unmodifiableList(this.f1280F);
                    }
                    if (((c2 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.f1283I = Collections.unmodifiableList(this.f1283I);
                    }
                    try {
                        jVarJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f1287e = c0072dS.l();
                        throw th2;
                    }
                    this.f1287e = c0072dS.l();
                    m();
                    throw th;
                }
            } else {
                if (((c2 == true ? 1 : 0) & 32) == 32) {
                    this.f1293l = Collections.unmodifiableList(this.f1293l);
                }
                if (((c2 == true ? 1 : 0) & 8) == 8) {
                    this.f1291j = Collections.unmodifiableList(this.f1291j);
                }
                if (((c2 == true ? 1 : 0) & 16) == 16) {
                    this.f1292k = Collections.unmodifiableList(this.f1292k);
                }
                if (((c2 == true ? 1 : 0) & 64) == 64) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (((c2 == true ? 1 : 0) & 512) == 512) {
                    this.f1299s = Collections.unmodifiableList(this.f1299s);
                }
                if (((c2 == true ? 1 : 0) & 1024) == 1024) {
                    this.f1300t = Collections.unmodifiableList(this.f1300t);
                }
                if (((c2 == true ? 1 : 0) & 2048) == 2048) {
                    this.f1301u = Collections.unmodifiableList(this.f1301u);
                }
                if (((c2 == true ? 1 : 0) & 4096) == 4096) {
                    this.f1302v = Collections.unmodifiableList(this.f1302v);
                }
                if (((c2 == true ? 1 : 0) & 8192) == 8192) {
                    this.f1303w = Collections.unmodifiableList(this.f1303w);
                }
                if (((c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT) == 16384) {
                    this.f1304x = Collections.unmodifiableList(this.f1304x);
                }
                if (((c2 == true ? 1 : 0) & 128) == 128) {
                    this.f1296p = Collections.unmodifiableList(this.f1296p);
                }
                if (((c2 == true ? 1 : 0) & 256) == 256) {
                    this.f1297q = Collections.unmodifiableList(this.f1297q);
                }
                if (((c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH) == 262144) {
                    this.f1278C = Collections.unmodifiableList(this.f1278C);
                }
                if (((c2 == true ? 1 : 0) & NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME) == 524288) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (((c2 == true ? 1 : 0) & IDMDmInterface.IDM_MAX_OBJ_SIZE) == 1048576) {
                    this.f1280F = Collections.unmodifiableList(this.f1280F);
                }
                if (((c2 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f1283I = Collections.unmodifiableList(this.f1283I);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f1287e = c0072dS.l();
                    throw th3;
                }
                this.f1287e = c0072dS.l();
                m();
                return;
            }
        }
    }
}
