package com.google.android.gms.internal.p000firebaseauthapi;

import B3.g;
import G3.c;
import V1.a;
import X1.d;
import X1.j;
import Z1.t;
import a1.k;
import a4.v;
import android.content.Context;
import android.content.SharedPreferences;
import b1.AbstractC0203C;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.Q0;
import org.json.JSONException;
import t1.i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306n implements P, InterfaceC0257e4, k {
    public static final k5 f = new k5(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f5566g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5567d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5568e;

    public /* synthetic */ C0306n(int i5, Object obj) {
        this.f5567d = i5;
        this.f5568e = obj;
    }

    public static C0306n l() {
        int i5 = D4.f5291a;
        U3 u32 = new U3(Pattern.compile("[.-]"));
        Matcher matcher = u32.f5396d.matcher("");
        matcher.getClass();
        if (matcher.matches()) {
            throw new IllegalArgumentException(AbstractC0335s.p("The pattern may not match the empty string: %s", u32));
        }
        return new C0306n(2, new C0306n(1, u32));
    }

    public static void p(a4.k kVar, C0306n c0306n, H3 h3, InterfaceC0257e4 interfaceC0257e4, C0382z4 c0382z4) {
        AbstractC0203C.e(c0382z4);
        ((c) c0306n.f5568e).i(new C0311n4(c0382z4.f5703e, 3), new g(kVar, c0306n, h3, interfaceC0257e4, c0382z4));
    }

    public static final C0306n u(C0306n c0306n, C0307n0 c0307n0) throws GeneralSecurityException {
        K1 k1N = K1.n(c0306n.m(), g5.a());
        if (k1N.o().n() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            C0231a2 c0231a2Q = C0231a2.q(c0307n0.a(k1N.o().r(), new byte[0]), g5.a());
            if (c0231a2Q.m() > 0) {
                return new C0306n(4, c0231a2Q);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (C0258f unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public void A(int i5, int i6) {
        ((f5) this.f5568e).k0(i5, i6);
    }

    public void B(int i5, long j5) {
        ((f5) this.f5568e).r0(i5, j5);
    }

    public void C(int i5, A a5, Object obj) {
        ((f5) this.f5568e).m0(i5, (U4) obj, a5);
    }

    public void D(int i5, int i6) {
        ((f5) this.f5568e).g0(i5, i6);
    }

    public void E(int i5, long j5) {
        ((f5) this.f5568e).i0(i5, j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.P
    public Iterator a(C0306n c0306n, String str) {
        return new C0234b(c0306n, str, new C0306n(((U3) this.f5568e).f5396d.matcher(str)));
    }

    @Override // a1.k
    public void accept(Object obj, Object obj2) throws JSONException {
        int i5 = this.f5567d;
        I3 i32 = (I3) obj;
        i iVar = (i) obj2;
        Object obj3 = this.f5568e;
        switch (i5) {
            case 14:
                C0381z3 c0381z3 = (C0381z3) obj3;
                c0381z3.getClass();
                c0381z3.f5467m = new U(c0381z3, iVar);
                ((V3) ((J3) i32).h()).q((R2) c0381z3.f5701o, c0381z3.f5457b);
                break;
            case 15:
                A3 a32 = (A3) obj3;
                a32.getClass();
                a32.f5467m = new U(a32, iVar);
                V3 v32 = (V3) ((J3) i32).h();
                d dVar = a32.f5258o;
                v32.l(new T2(dVar.f2717d, dVar.f2718e, a32.f5459d.f2896d.e()), a32.f5457b);
                break;
            case 16:
                C0381z3 c0381z32 = (C0381z3) obj3;
                c0381z32.getClass();
                c0381z32.f5467m = new U(c0381z32, iVar);
                ((V3) ((J3) i32).h()).h(new U2(c0381z32.f5459d.f2896d.e(), (N4) c0381z32.f5701o), c0381z32.f5457b);
                break;
            case 17:
                C0381z3 c0381z33 = (C0381z3) obj3;
                c0381z33.getClass();
                c0381z33.f5467m = new U(c0381z33, iVar);
                ((V3) ((J3) i32).h()).x(new V2((j) c0381z33.f5701o, c0381z33.f5459d.f2896d.e()), c0381z33.f5457b);
                break;
            case 18:
                A3 a33 = (A3) obj3;
                a33.getClass();
                a33.f5467m = new U(a33, iVar);
                t tVar = a33.f5459d;
                d dVar2 = a33.f5258o;
                dVar2.getClass();
                dVar2.f2719g = tVar.f2896d.e();
                dVar2.f2720h = true;
                ((V3) ((J3) i32).h()).b(new C0262f3(dVar2), a33.f5457b);
                break;
            case 19:
                B3 b32 = (B3) obj3;
                b32.getClass();
                b32.f5467m = new U(b32, iVar);
                ((V3) ((J3) i32).h()).o(b32.f5267o, b32.f5457b);
                break;
            case 20:
                C3 c32 = (C3) obj3;
                c32.getClass();
                c32.f5467m = new U(c32, iVar);
                ((V3) ((J3) i32).h()).b(c32.f5281o, c32.f5457b);
                break;
            case 21:
                D3 d32 = (D3) obj3;
                d32.getClass();
                d32.f5467m = new U(d32, iVar);
                ((V3) ((J3) i32).h()).k(d32.f5290o, d32.f5457b);
                break;
            case 22:
                E3 e32 = (E3) obj3;
                e32.getClass();
                e32.f5467m = new U(e32, iVar);
                ((V3) ((J3) i32).h()).t(e32.f5292o, e32.f5457b);
                break;
            case 23:
                B3 b33 = (B3) obj3;
                b33.getClass();
                b33.f5467m = new U(b33, iVar);
                ((V3) ((J3) i32).h()).o(b33.f5267o, b33.f5457b);
                break;
            case 24:
                D3 d33 = (D3) obj3;
                d33.getClass();
                d33.f5467m = new U(d33, iVar);
                ((V3) ((J3) i32).h()).k(d33.f5290o, d33.f5457b);
                break;
            case 25:
                C3 c33 = (C3) obj3;
                c33.getClass();
                c33.f5467m = new U(c33, iVar);
                ((V3) ((J3) i32).h()).b(c33.f5281o, c33.f5457b);
                break;
            default:
                E3 e33 = (E3) obj3;
                e33.getClass();
                e33.f5467m = new U(e33, iVar);
                ((V3) ((J3) i32).h()).t(e33.f5292o, e33.f5457b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void b(String str) {
        switch (this.f5567d) {
            case 9:
                ((A2) this.f5568e).b(str);
                break;
            case 10:
                ((C0351u3) this.f5568e).f.b(a.q0(str));
                break;
            case 11:
                ((H3) ((A2) this.f5568e).f).b(a.q0(str));
                break;
            default:
                ((InterfaceC0257e4) this.f5568e).b(str);
                break;
        }
    }

    public void c(int i5, int i6) {
        f5 f5Var = (f5) this.f5568e;
        f5Var.p0(i5, (i6 >> 31) ^ (i6 + i6));
    }

    public void d(int i5, long j5) {
        f5 f5Var = (f5) this.f5568e;
        f5Var.r0(i5, (j5 >> 63) ^ (j5 + j5));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void e(Z3 z32) {
        switch (this.f5567d) {
            case 9:
                z32.getClass();
                throw new ClassCastException();
            case 10:
                z32.getClass();
                throw new ClassCastException();
            case 11:
                z32.getClass();
                throw new ClassCastException();
            default:
                ((InterfaceC0257e4) this.f5568e).e((C0382z4) z32);
                return;
        }
    }

    public void f(int i5, int i6) {
        ((f5) this.f5568e).p0(i5, i6);
    }

    public void g(int i5, long j5) {
        ((f5) this.f5568e).r0(i5, j5);
    }

    public void h(String str, InterfaceC0257e4 interfaceC0257e4) {
        AbstractC0203C.c(str);
        C0382z4 c0382z4D = C0382z4.d(str);
        if (c0382z4D.f()) {
            interfaceC0257e4.e(c0382z4D);
            return;
        }
        C0311n4 c0311n4 = new C0311n4(c0382z4D.f5702d, 2);
        C0306n c0306n = new C0306n(12, interfaceC0257e4);
        c cVar = (c) this.f5568e;
        W3 w3 = (W3) cVar.f741g;
        AbstractC0335s.l(w3.j("/token", (String) cVar.f744j), c0311n4, c0306n, C0382z4.class, (C0239b4) w3.f5381b);
    }

    public void i(C0334r4 c0334r4, H3 h3) {
        C0333r3 c0333r3 = new C0333r3(this, h3, 2);
        c cVar = (c) this.f5568e;
        cVar.getClass();
        W3 w3 = (W3) cVar.f740e;
        AbstractC0335s.l(w3.j("/emailLinkSignin", (String) cVar.f744j), c0334r4, c0333r3, AbstractC0340s4.class, (C0239b4) w3.f5381b);
    }

    public C0306n j() throws GeneralSecurityException {
        C0231a2 c0231a2 = (C0231a2) this.f5568e;
        X1 x1O = C0231a2.o();
        for (Z1 z1 : c0231a2.r()) {
            T1 t1N = z1.n();
            if (t1N.n() != 3) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            String strQ = t1N.q();
            Z4 z4P = t1N.p();
            U uG = AbstractC0283j0.g(null, strQ);
            if (!(uG instanceof C0259f0)) {
                StringBuilder sb = new StringBuilder(String.valueOf(strQ).length() + 48);
                sb.append("manager for key type ");
                sb.append(strQ);
                sb.append(" is not a PrivateKeyManager");
                throw new GeneralSecurityException(sb.toString());
            }
            C0259f0 c0259f0 = (C0259f0) uG;
            try {
                E1 e1O = E1.o(z4P, g5.a());
                C0378z0.x(e1O);
                G1 g1P = e1O.p();
                c0259f0.f5474g.s(g1P);
                S1 s1M = T1.m();
                if (s1M.f) {
                    s1M.d();
                    s1M.f = false;
                }
                ((T1) s1M.f5558e).zze = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
                Y4 y4B = g1P.b();
                if (s1M.f) {
                    s1M.d();
                    s1M.f = false;
                }
                ((T1) s1M.f5558e).zzf = y4B;
                if (s1M.f) {
                    s1M.d();
                    s1M.f = false;
                }
                T1.t((T1) s1M.f5558e, 4);
                T1 t12 = (T1) s1M.b();
                String strQ2 = t12.q();
                Z4 z4P2 = t12.p();
                U uG2 = AbstractC0283j0.g(null, strQ2);
                v vVar = (v) uG2.f;
                try {
                    U4 u4P = vVar.p(z4P2);
                    Class cls = (Class) uG2.f5393e;
                    if (Void.class.equals(cls)) {
                        throw new GeneralSecurityException("Cannot create a primitive for Void");
                    }
                    vVar.s(u4P);
                    vVar.q(u4P, cls);
                    Y1 y1P = Z1.p();
                    y1P.a(z1);
                    if (y1P.f) {
                        y1P.d();
                        y1P.f = false;
                    }
                    ((Z1) y1P.f5558e).zze = t12;
                    Z1 z12 = (Z1) y1P.b();
                    if (x1O.f) {
                        x1O.d();
                        x1O.f = false;
                    }
                    C0231a2.t((C0231a2) x1O.f5558e, z12);
                } catch (C0258f e5) {
                    String name = ((Class) vVar.f3093b).getName();
                    throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e5);
                }
            } catch (C0258f e6) {
                throw new GeneralSecurityException("expected serialized proto of type ", e6);
            }
        }
        int iN = c0231a2.n();
        if (x1O.f) {
            x1O.d();
            x1O.f = false;
        }
        ((C0231a2) x1O.f5558e).zze = iN;
        return new C0306n(4, (C0231a2) x1O.b());
    }

    public void k(int i5, boolean z4) {
        ((f5) this.f5568e).e0(i5, z4);
    }

    public byte[] m() throws CharConversionException, FileNotFoundException {
        try {
            String string = ((SharedPreferences) this.f5568e).getString("GenericIdpKeyset", null);
            if (string == null) {
                throw new FileNotFoundException("can't read keyset; the pref value GenericIdpKeyset does not exist");
            }
            if (string.length() % 2 != 0) {
                throw new IllegalArgumentException("Expected a string of even length");
            }
            int length = string.length() / 2;
            byte[] bArr = new byte[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = i5 + i5;
                int iDigit = Character.digit(string.charAt(i6), 16);
                int iDigit2 = Character.digit(string.charAt(i6 + 1), 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i5] = (byte) ((iDigit * 16) + iDigit2);
            }
            return bArr;
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException("can't read keyset; the pref value GenericIdpKeyset is not a valid hex string");
        }
    }

    public List n(String str) {
        str.getClass();
        Iterator itA = ((P) this.f5568e).a(this, str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C c2 = (C) itA;
            if (!c2.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) c2.next());
        }
    }

    public void o(int i5, Z4 z4) {
        ((f5) this.f5568e).f0(i5, z4);
    }

    public Object q() throws GeneralSecurityException {
        byte[] bArrArray;
        byte b2 = 1;
        InterfaceC0253e0 interfaceC0253e0 = (InterfaceC0253e0) AbstractC0283j0.f5526e.get(T.class);
        Class clsA = interfaceC0253e0 == null ? null : interfaceC0253e0.a();
        if (clsA == null) {
            String name = T.class.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        int i5 = AbstractC0289k0.f5535a;
        C0231a2 c0231a2 = (C0231a2) this.f5568e;
        int iN = c0231a2.n();
        boolean z4 = true;
        int i6 = 0;
        boolean z5 = false;
        for (Z1 z1 : c0231a2.r()) {
            if (z1.o() == 2) {
                if (!z1.v()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(z1.m())));
                }
                if (z1.q() == 1) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(z1.m())));
                }
                if (z1.o() == 1) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(z1.m())));
                }
                if (z1.m() == iN) {
                    if (z5) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z5 = true;
                }
                z4 &= z1.n().n() == 4;
                i6++;
            }
        }
        if (i6 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z5 && !z4) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        U u4 = new U(clsA);
        for (Z1 z12 : c0231a2.r()) {
            if (z12.o() == 2) {
                T1 t1N = z12.n();
                String strQ = t1N.q();
                Z4 z4P = t1N.p();
                U uG = AbstractC0283j0.g(clsA, strQ);
                v vVar = (v) uG.f;
                try {
                    U4 u4P = vVar.p(z4P);
                    Class cls = (Class) uG.f5393e;
                    if (Void.class.equals(cls)) {
                        throw new GeneralSecurityException("Cannot create a primitive for Void");
                    }
                    vVar.s(u4P);
                    Object objQ = vVar.q(u4P, cls);
                    if (z12.o() != 2) {
                        throw new GeneralSecurityException("only ENABLED key is allowed");
                    }
                    int iC = Q0.c(z12.q());
                    if (iC == b2) {
                        bArrArray = ByteBuffer.allocate(5).put(b2).putInt(z12.m()).array();
                    } else if (iC == 2) {
                        bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(z12.m()).array();
                    } else if (iC != 3) {
                        if (iC != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                        bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(z12.m()).array();
                    } else {
                        bArrArray = AbstractC0335s.f5614a;
                    }
                    C0241c0 c0241c0 = new C0241c0(objQ, bArrArray, z12.o(), z12.q());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c0241c0);
                    byte[] bArr = c0241c0.f5443b;
                    C0247d0 c0247d0 = new C0247d0(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) u4.f;
                    List list = (List) concurrentHashMap.put(c0247d0, Collections.unmodifiableList(arrayList));
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(list);
                        arrayList2.add(c0241c0);
                        concurrentHashMap.put(c0247d0, Collections.unmodifiableList(arrayList2));
                    }
                    if (z12.m() == c0231a2.n()) {
                        if (c0241c0.f5444c != 2) {
                            throw new IllegalArgumentException("the primary entry has to be ENABLED");
                        }
                        if (u4.f(bArr == null ? null : Arrays.copyOf(bArr, bArr.length)).isEmpty()) {
                            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                        }
                    }
                    b2 = 1;
                } catch (C0258f e5) {
                    String name2 = ((Class) vVar.f3093b).getName();
                    throw new GeneralSecurityException(name2.length() != 0 ? "Failures parsing proto of type ".concat(name2) : new String("Failures parsing proto of type "), e5);
                }
            }
        }
        InterfaceC0253e0 interfaceC0253e02 = (InterfaceC0253e0) AbstractC0283j0.f5526e.get(T.class);
        Class cls2 = (Class) u4.f5393e;
        if (interfaceC0253e02 == null) {
            String name3 = cls2.getName();
            throw new GeneralSecurityException(name3.length() != 0 ? "No wrapper found for ".concat(name3) : new String("No wrapper found for "));
        }
        if (interfaceC0253e02.a().equals(cls2)) {
            return interfaceC0253e02.c(u4);
        }
        String strValueOf = String.valueOf(interfaceC0253e02.a());
        String strValueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 44 + strValueOf2.length());
        sb.append("Wrong input primitive class, expected ");
        sb.append(strValueOf);
        sb.append(", got ");
        sb.append(strValueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public void r(int i5, double d5) {
        ((f5) this.f5568e).i0(i5, Double.doubleToRawLongBits(d5));
    }

    public void s(C0306n c0306n, C0307n0 c0307n0) throws GeneralSecurityException, InterruptedException, IOException {
        C0231a2 c0231a2 = (C0231a2) this.f5568e;
        byte[] bArrB = c0307n0.b(c0231a2.c(), new byte[0]);
        try {
            if (!C0231a2.q(c0307n0.a(bArrB, new byte[0]), g5.a()).equals(c0231a2)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            J1 j1M = K1.m();
            Y4 y4Q = Z4.q(bArrB, 0, bArrB.length);
            if (j1M.f) {
                j1M.d();
                j1M.f = false;
            }
            ((K1) j1M.f5558e).zze = y4Q;
            C0255e2 c0255e2A = AbstractC0289k0.a(c0231a2);
            if (j1M.f) {
                j1M.d();
                j1M.f = false;
            }
            ((K1) j1M.f5558e).zzf = c0255e2A;
            K1 k12 = (K1) j1M.b();
            c0306n.getClass();
            if (!((SharedPreferences.Editor) c0306n.f5568e).putString("GenericIdpKeyset", AbstractC0335s.j(k12.c())).commit()) {
                throw new IOException("Failed to write to SharedPreferences");
            }
        } catch (C0258f unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public void t(C0306n c0306n) throws GeneralSecurityException, IOException {
        String str;
        C0231a2 c0231a2 = (C0231a2) this.f5568e;
        for (Z1 z1 : c0231a2.r()) {
            if (z1.n().n() == 1 || z1.n().n() == 2 || z1.n().n() == 3) {
                switch (z1.n().n()) {
                    case 1:
                        str = "UNKNOWN_KEYMATERIAL";
                        break;
                    case 2:
                        str = "SYMMETRIC";
                        break;
                    case 3:
                        str = "ASYMMETRIC_PRIVATE";
                        break;
                    case 4:
                        str = "ASYMMETRIC_PUBLIC";
                        break;
                    case 5:
                        str = "REMOTE";
                        break;
                    case 6:
                        str = "UNRECOGNIZED";
                        break;
                    default:
                        throw null;
                }
                throw new GeneralSecurityException("keyset contains key material of type " + str + " for type url " + z1.n().q());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c0306n.f5568e;
        try {
            int iD = c0231a2.d();
            Logger logger = f5.f5478e;
            if (iD > 4096) {
                iD = 4096;
            }
            e5 e5Var = new e5(byteArrayOutputStream, iD);
            c0231a2.a(e5Var);
            if (e5Var.f5472i > 0) {
                e5Var.v0();
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public String toString() {
        switch (this.f5567d) {
            case 4:
                return AbstractC0289k0.a((C0231a2) this.f5568e).toString();
            default:
                return super.toString();
        }
    }

    public void v(int i5, int i6) {
        ((f5) this.f5568e).k0(i5, i6);
    }

    public void w(int i5, int i6) {
        ((f5) this.f5568e).g0(i5, i6);
    }

    public void x(int i5, long j5) {
        ((f5) this.f5568e).i0(i5, j5);
    }

    public void y(int i5, float f5) {
        ((f5) this.f5568e).g0(i5, Float.floatToRawIntBits(f5));
    }

    public void z(int i5, A a5, Object obj) {
        f5 f5Var = (f5) this.f5568e;
        f5Var.o0(i5, 3);
        a5.f((U4) obj, f5Var.f5479d);
        f5Var.o0(i5, 4);
    }

    public /* synthetic */ C0306n(G3.d dVar) {
        this.f5567d = 5;
        Object obj = dVar.f746d;
        this.f5568e = (Y) dVar.f749h;
    }

    public C0306n(A2 a22, A2 a23) {
        this.f5567d = 9;
        this.f5568e = a23;
    }

    public C0306n(Matcher matcher) {
        this.f5567d = 27;
        matcher.getClass();
        this.f5568e = matcher;
    }

    public C0306n() {
        r rVar;
        this.f5567d = 0;
        k5 k5Var = k5.f5544b;
        try {
            rVar = (r) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            rVar = f;
        }
        C0300m c0300m = new C0300m(k5Var, rVar);
        Charset charset = AbstractC0246d.f5451a;
        this.f5568e = c0300m;
    }

    public C0306n(Context context, int i5, String str) {
        this.f5567d = i5;
        switch (i5) {
            case 7:
                this.f5568e = context.getApplicationContext().getSharedPreferences(str, 0).edit();
                break;
            default:
                this.f5568e = context.getApplicationContext().getSharedPreferences(str, 0);
                break;
        }
    }

    public C0306n(f5 f5Var) {
        this.f5567d = 28;
        Charset charset = AbstractC0246d.f5451a;
        this.f5568e = f5Var;
        f5Var.f5479d = this;
    }
}
