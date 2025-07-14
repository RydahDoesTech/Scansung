package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import com.idm.agent.dm.IDMDmInterface;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026h extends AbstractC0080l {

    /* renamed from: A, reason: collision with root package name */
    public List f1245A;

    /* renamed from: B, reason: collision with root package name */
    public List f1246B;

    /* renamed from: C, reason: collision with root package name */
    public X f1247C;

    /* renamed from: D, reason: collision with root package name */
    public List f1248D;
    public e0 E;

    /* renamed from: g, reason: collision with root package name */
    public int f1249g;

    /* renamed from: h, reason: collision with root package name */
    public int f1250h;

    /* renamed from: i, reason: collision with root package name */
    public int f1251i;

    /* renamed from: j, reason: collision with root package name */
    public int f1252j;

    /* renamed from: k, reason: collision with root package name */
    public List f1253k;

    /* renamed from: l, reason: collision with root package name */
    public List f1254l;

    /* renamed from: m, reason: collision with root package name */
    public List f1255m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public List f1256o;

    /* renamed from: p, reason: collision with root package name */
    public List f1257p;

    /* renamed from: q, reason: collision with root package name */
    public List f1258q;

    /* renamed from: r, reason: collision with root package name */
    public List f1259r;

    /* renamed from: s, reason: collision with root package name */
    public List f1260s;

    /* renamed from: t, reason: collision with root package name */
    public List f1261t;

    /* renamed from: u, reason: collision with root package name */
    public List f1262u;

    /* renamed from: v, reason: collision with root package name */
    public List f1263v;

    /* renamed from: w, reason: collision with root package name */
    public int f1264w;

    /* renamed from: x, reason: collision with root package name */
    public Q f1265x;

    /* renamed from: y, reason: collision with root package name */
    public int f1266y;

    /* renamed from: z, reason: collision with root package name */
    public List f1267z;

    public static C0026h h() {
        C0026h c0026h = new C0026h();
        c0026h.f1250h = 6;
        c0026h.f1253k = Collections.emptyList();
        c0026h.f1254l = Collections.emptyList();
        c0026h.f1255m = Collections.emptyList();
        c0026h.n = Collections.emptyList();
        c0026h.f1256o = Collections.emptyList();
        c0026h.f1257p = Collections.emptyList();
        c0026h.f1258q = Collections.emptyList();
        c0026h.f1259r = Collections.emptyList();
        c0026h.f1260s = Collections.emptyList();
        c0026h.f1261t = Collections.emptyList();
        c0026h.f1262u = Collections.emptyList();
        c0026h.f1263v = Collections.emptyList();
        c0026h.f1265x = Q.f1072w;
        c0026h.f1267z = Collections.emptyList();
        c0026h.f1245A = Collections.emptyList();
        c0026h.f1246B = Collections.emptyList();
        c0026h.f1247C = X.f1134j;
        c0026h.f1248D = Collections.emptyList();
        c0026h.E = e0.f1228h;
        return c0026h;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C0028j c0028jG = g();
        if (c0028jG.b()) {
            return c0028jG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0026h c0026hH = h();
        c0026hH.i(g());
        return c0026hH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r3, O3.C0077i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            I3.a r1 = I3.C0028j.f1275N     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.j r1 = new I3.j     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.j r4 = (I3.C0028j) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0026h.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((C0028j) abstractC0084p);
        return this;
    }

    public final C0028j g() {
        C0028j c0028j = new C0028j(this);
        int i5 = this.f1249g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0028j.f1288g = this.f1250h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        c0028j.f1289h = this.f1251i;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        c0028j.f1290i = this.f1252j;
        if ((i5 & 8) == 8) {
            this.f1253k = Collections.unmodifiableList(this.f1253k);
            this.f1249g &= -9;
        }
        c0028j.f1291j = this.f1253k;
        if ((this.f1249g & 16) == 16) {
            this.f1254l = Collections.unmodifiableList(this.f1254l);
            this.f1249g &= -17;
        }
        c0028j.f1292k = this.f1254l;
        if ((this.f1249g & 32) == 32) {
            this.f1255m = Collections.unmodifiableList(this.f1255m);
            this.f1249g &= -33;
        }
        c0028j.f1293l = this.f1255m;
        if ((this.f1249g & 64) == 64) {
            this.n = Collections.unmodifiableList(this.n);
            this.f1249g &= -65;
        }
        c0028j.n = this.n;
        if ((this.f1249g & 128) == 128) {
            this.f1256o = Collections.unmodifiableList(this.f1256o);
            this.f1249g &= -129;
        }
        c0028j.f1296p = this.f1256o;
        if ((this.f1249g & 256) == 256) {
            this.f1257p = Collections.unmodifiableList(this.f1257p);
            this.f1249g &= -257;
        }
        c0028j.f1297q = this.f1257p;
        if ((this.f1249g & 512) == 512) {
            this.f1258q = Collections.unmodifiableList(this.f1258q);
            this.f1249g &= -513;
        }
        c0028j.f1299s = this.f1258q;
        if ((this.f1249g & 1024) == 1024) {
            this.f1259r = Collections.unmodifiableList(this.f1259r);
            this.f1249g &= KnoxContainerManager.ERROR_INVALID_PASSWORD_RESET_TOKEN;
        }
        c0028j.f1300t = this.f1259r;
        if ((this.f1249g & 2048) == 2048) {
            this.f1260s = Collections.unmodifiableList(this.f1260s);
            this.f1249g &= -2049;
        }
        c0028j.f1301u = this.f1260s;
        if ((this.f1249g & 4096) == 4096) {
            this.f1261t = Collections.unmodifiableList(this.f1261t);
            this.f1249g &= -4097;
        }
        c0028j.f1302v = this.f1261t;
        if ((this.f1249g & 8192) == 8192) {
            this.f1262u = Collections.unmodifiableList(this.f1262u);
            this.f1249g &= -8193;
        }
        c0028j.f1303w = this.f1262u;
        if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT) == 16384) {
            this.f1263v = Collections.unmodifiableList(this.f1263v);
            this.f1249g &= -16385;
        }
        c0028j.f1304x = this.f1263v;
        if ((i5 & NetworkAnalyticsConstants.DataPoints.FLAG_UID) == 32768) {
            i6 |= 8;
        }
        c0028j.f1306z = this.f1264w;
        if ((i5 & NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID) == 65536) {
            i6 |= 16;
        }
        c0028j.f1276A = this.f1265x;
        if ((i5 & NetworkAnalyticsConstants.DataPoints.FLAG_PPID) == 131072) {
            i6 |= 32;
        }
        c0028j.f1277B = this.f1266y;
        if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH) == 262144) {
            this.f1267z = Collections.unmodifiableList(this.f1267z);
            this.f1249g &= -262145;
        }
        c0028j.f1278C = this.f1267z;
        if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME) == 524288) {
            this.f1245A = Collections.unmodifiableList(this.f1245A);
            this.f1249g &= -524289;
        }
        c0028j.E = this.f1245A;
        if ((this.f1249g & IDMDmInterface.IDM_MAX_OBJ_SIZE) == 1048576) {
            this.f1246B = Collections.unmodifiableList(this.f1246B);
            this.f1249g &= -1048577;
        }
        c0028j.f1280F = this.f1246B;
        if ((i5 & 2097152) == 2097152) {
            i6 |= 64;
        }
        c0028j.f1282H = this.f1247C;
        if ((this.f1249g & 4194304) == 4194304) {
            this.f1248D = Collections.unmodifiableList(this.f1248D);
            this.f1249g &= -4194305;
        }
        c0028j.f1283I = this.f1248D;
        if ((i5 & 8388608) == 8388608) {
            i6 |= 128;
        }
        c0028j.f1284J = this.E;
        c0028j.f = i6;
        return c0028j;
    }

    public final void i(C0028j c0028j) {
        e0 e0Var;
        X x4;
        Q q5;
        if (c0028j == C0028j.f1274M) {
            return;
        }
        int i5 = c0028j.f;
        if ((i5 & 1) == 1) {
            int i6 = c0028j.f1288g;
            this.f1249g = 1 | this.f1249g;
            this.f1250h = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = c0028j.f1289h;
            this.f1249g = 2 | this.f1249g;
            this.f1251i = i7;
        }
        if ((i5 & 4) == 4) {
            int i8 = c0028j.f1290i;
            this.f1249g = 4 | this.f1249g;
            this.f1252j = i8;
        }
        if (!c0028j.f1291j.isEmpty()) {
            if (this.f1253k.isEmpty()) {
                this.f1253k = c0028j.f1291j;
                this.f1249g &= -9;
            } else {
                if ((this.f1249g & 8) != 8) {
                    this.f1253k = new ArrayList(this.f1253k);
                    this.f1249g |= 8;
                }
                this.f1253k.addAll(c0028j.f1291j);
            }
        }
        if (!c0028j.f1292k.isEmpty()) {
            if (this.f1254l.isEmpty()) {
                this.f1254l = c0028j.f1292k;
                this.f1249g &= -17;
            } else {
                if ((this.f1249g & 16) != 16) {
                    this.f1254l = new ArrayList(this.f1254l);
                    this.f1249g |= 16;
                }
                this.f1254l.addAll(c0028j.f1292k);
            }
        }
        if (!c0028j.f1293l.isEmpty()) {
            if (this.f1255m.isEmpty()) {
                this.f1255m = c0028j.f1293l;
                this.f1249g &= -33;
            } else {
                if ((this.f1249g & 32) != 32) {
                    this.f1255m = new ArrayList(this.f1255m);
                    this.f1249g |= 32;
                }
                this.f1255m.addAll(c0028j.f1293l);
            }
        }
        if (!c0028j.n.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c0028j.n;
                this.f1249g &= -65;
            } else {
                if ((this.f1249g & 64) != 64) {
                    this.n = new ArrayList(this.n);
                    this.f1249g |= 64;
                }
                this.n.addAll(c0028j.n);
            }
        }
        if (!c0028j.f1296p.isEmpty()) {
            if (this.f1256o.isEmpty()) {
                this.f1256o = c0028j.f1296p;
                this.f1249g &= -129;
            } else {
                if ((this.f1249g & 128) != 128) {
                    this.f1256o = new ArrayList(this.f1256o);
                    this.f1249g |= 128;
                }
                this.f1256o.addAll(c0028j.f1296p);
            }
        }
        if (!c0028j.f1297q.isEmpty()) {
            if (this.f1257p.isEmpty()) {
                this.f1257p = c0028j.f1297q;
                this.f1249g &= -257;
            } else {
                if ((this.f1249g & 256) != 256) {
                    this.f1257p = new ArrayList(this.f1257p);
                    this.f1249g |= 256;
                }
                this.f1257p.addAll(c0028j.f1297q);
            }
        }
        if (!c0028j.f1299s.isEmpty()) {
            if (this.f1258q.isEmpty()) {
                this.f1258q = c0028j.f1299s;
                this.f1249g &= -513;
            } else {
                if ((this.f1249g & 512) != 512) {
                    this.f1258q = new ArrayList(this.f1258q);
                    this.f1249g |= 512;
                }
                this.f1258q.addAll(c0028j.f1299s);
            }
        }
        if (!c0028j.f1300t.isEmpty()) {
            if (this.f1259r.isEmpty()) {
                this.f1259r = c0028j.f1300t;
                this.f1249g &= KnoxContainerManager.ERROR_INVALID_PASSWORD_RESET_TOKEN;
            } else {
                if ((this.f1249g & 1024) != 1024) {
                    this.f1259r = new ArrayList(this.f1259r);
                    this.f1249g |= 1024;
                }
                this.f1259r.addAll(c0028j.f1300t);
            }
        }
        if (!c0028j.f1301u.isEmpty()) {
            if (this.f1260s.isEmpty()) {
                this.f1260s = c0028j.f1301u;
                this.f1249g &= -2049;
            } else {
                if ((this.f1249g & 2048) != 2048) {
                    this.f1260s = new ArrayList(this.f1260s);
                    this.f1249g |= 2048;
                }
                this.f1260s.addAll(c0028j.f1301u);
            }
        }
        if (!c0028j.f1302v.isEmpty()) {
            if (this.f1261t.isEmpty()) {
                this.f1261t = c0028j.f1302v;
                this.f1249g &= -4097;
            } else {
                if ((this.f1249g & 4096) != 4096) {
                    this.f1261t = new ArrayList(this.f1261t);
                    this.f1249g |= 4096;
                }
                this.f1261t.addAll(c0028j.f1302v);
            }
        }
        if (!c0028j.f1303w.isEmpty()) {
            if (this.f1262u.isEmpty()) {
                this.f1262u = c0028j.f1303w;
                this.f1249g &= -8193;
            } else {
                if ((this.f1249g & 8192) != 8192) {
                    this.f1262u = new ArrayList(this.f1262u);
                    this.f1249g |= 8192;
                }
                this.f1262u.addAll(c0028j.f1303w);
            }
        }
        if (!c0028j.f1304x.isEmpty()) {
            if (this.f1263v.isEmpty()) {
                this.f1263v = c0028j.f1304x;
                this.f1249g &= -16385;
            } else {
                if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT) != 16384) {
                    this.f1263v = new ArrayList(this.f1263v);
                    this.f1249g |= NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT;
                }
                this.f1263v.addAll(c0028j.f1304x);
            }
        }
        int i9 = c0028j.f;
        if ((i9 & 8) == 8) {
            int i10 = c0028j.f1306z;
            this.f1249g |= NetworkAnalyticsConstants.DataPoints.FLAG_UID;
            this.f1264w = i10;
        }
        if ((i9 & 16) == 16) {
            Q q6 = c0028j.f1276A;
            if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID) != 65536 || (q5 = this.f1265x) == Q.f1072w) {
                this.f1265x = q6;
            } else {
                P pR = Q.r(q5);
                pR.i(q6);
                this.f1265x = pR.g();
            }
            this.f1249g |= NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID;
        }
        if ((c0028j.f & 32) == 32) {
            int i11 = c0028j.f1277B;
            this.f1249g |= NetworkAnalyticsConstants.DataPoints.FLAG_PPID;
            this.f1266y = i11;
        }
        if (!c0028j.f1278C.isEmpty()) {
            if (this.f1267z.isEmpty()) {
                this.f1267z = c0028j.f1278C;
                this.f1249g &= -262145;
            } else {
                if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH) != 262144) {
                    this.f1267z = new ArrayList(this.f1267z);
                    this.f1249g |= NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH;
                }
                this.f1267z.addAll(c0028j.f1278C);
            }
        }
        if (!c0028j.E.isEmpty()) {
            if (this.f1245A.isEmpty()) {
                this.f1245A = c0028j.E;
                this.f1249g &= -524289;
            } else {
                if ((this.f1249g & NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME) != 524288) {
                    this.f1245A = new ArrayList(this.f1245A);
                    this.f1249g |= NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME;
                }
                this.f1245A.addAll(c0028j.E);
            }
        }
        if (!c0028j.f1280F.isEmpty()) {
            if (this.f1246B.isEmpty()) {
                this.f1246B = c0028j.f1280F;
                this.f1249g &= -1048577;
            } else {
                if ((this.f1249g & IDMDmInterface.IDM_MAX_OBJ_SIZE) != 1048576) {
                    this.f1246B = new ArrayList(this.f1246B);
                    this.f1249g |= IDMDmInterface.IDM_MAX_OBJ_SIZE;
                }
                this.f1246B.addAll(c0028j.f1280F);
            }
        }
        if ((c0028j.f & 64) == 64) {
            X x5 = c0028j.f1282H;
            if ((this.f1249g & 2097152) != 2097152 || (x4 = this.f1247C) == X.f1134j) {
                this.f1247C = x5;
            } else {
                C0024f c0024fI = X.i(x4);
                c0024fI.l(x5);
                this.f1247C = c0024fI.h();
            }
            this.f1249g |= 2097152;
        }
        if (!c0028j.f1283I.isEmpty()) {
            if (this.f1248D.isEmpty()) {
                this.f1248D = c0028j.f1283I;
                this.f1249g &= -4194305;
            } else {
                if ((this.f1249g & 4194304) != 4194304) {
                    this.f1248D = new ArrayList(this.f1248D);
                    this.f1249g |= 4194304;
                }
                this.f1248D.addAll(c0028j.f1283I);
            }
        }
        if ((c0028j.f & 128) == 128) {
            e0 e0Var2 = c0028j.f1284J;
            if ((this.f1249g & 8388608) != 8388608 || (e0Var = this.E) == e0.f1228h) {
                this.E = e0Var2;
            } else {
                C0031m c0031m = new C0031m(2);
                c0031m.f1320g = Collections.emptyList();
                c0031m.m(e0Var);
                c0031m.m(e0Var2);
                this.E = c0031m.i();
            }
            this.f1249g |= 8388608;
        }
        f(c0028j);
        this.f2081d = this.f2081d.m(c0028j.f1287e);
    }
}
