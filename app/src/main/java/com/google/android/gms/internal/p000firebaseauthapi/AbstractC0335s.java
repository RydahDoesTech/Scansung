package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import E0.d;
import U0.b;
import X1.j;
import Y0.c;
import a1.C0097e;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import com.idm.network.IDMNetworkInterface;
import com.samsung.android.knox.ex.KnoxContract;
import com.samsung.android.lib.episode.EternalContract;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.Q0;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0335s {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5614a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final c[] f5615b = {new c("firebase_auth", 11), new c("firebase_auth_aidl_migration", 1), new c("firebase_auth_multi_factor_auth", 1)};

    /* renamed from: c, reason: collision with root package name */
    public static final d f5616c = new d("InternalFirebaseAuth.FIREBASE_AUTH_API", new b(1), new b4.d());

    public static final String A(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static BigInteger B(BigInteger bigInteger, boolean z4, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerQ = q(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerQ);
        if (bigIntegerQ.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerQ);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerQ.testBit(0) && bigIntegerQ.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerQ.add(BigInteger.ONE).shiftRight(2), bigIntegerQ);
            } else if (bigIntegerQ.testBit(0) && !bigIntegerQ.testBit(1)) {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerQ.subtract(bigIntegerAdd).shiftRight(1);
                int i5 = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerQ);
                    if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerQ);
                    BigInteger bigIntegerMod4 = BigInteger.ONE;
                    if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerQ)) {
                        BigInteger bigIntegerShiftRight2 = bigIntegerQ.add(bigIntegerMod4).shiftRight(1);
                        BigInteger bigIntegerMod5 = bigIntegerAdd;
                        for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                            BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                            bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerQ).multiply(bigIntegerMod3)).mod(bigIntegerQ);
                            BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerQ);
                            if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerQ);
                                bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerQ);
                                bigIntegerMod5 = bigIntegerMod7;
                            } else {
                                bigIntegerMod4 = bigIntegerMod6;
                            }
                        }
                        bigIntegerAdd = bigIntegerMod5;
                    } else {
                        if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                        i5++;
                        if (i5 == 128 && !bigIntegerQ.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            } else {
                bigIntegerAdd = null;
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerQ).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z4 != bigIntegerAdd.testBit(0) ? bigIntegerQ.subtract(bigIntegerAdd).mod(bigIntegerQ) : bigIntegerAdd;
    }

    public static byte[] C(byte[]... bArr) throws GeneralSecurityException {
        int i5 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i5 > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i5 += length;
        }
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i6, length2);
            i6 += length2;
        }
        return bArr3;
    }

    public static int D(int i5) throws GeneralSecurityException {
        int iC = Q0.c(i5);
        int i6 = 1;
        if (iC != 1) {
            i6 = 2;
            if (iC != 2) {
                if (iC == 3) {
                    return 3;
                }
                String str = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "UNRECOGNIZED" : "DO_NOT_USE_CRUNCHY_UNCOMPRESSED" : "COMPRESSED" : "UNCOMPRESSED" : "UNKNOWN_FORMAT";
                throw new GeneralSecurityException(f.p(new StringBuilder(str.length() + 22), "unknown point format: ", str));
            }
        }
        return i6;
    }

    public static int E(A a5, byte[] bArr, int i5, int i6, I0.d dVar) throws C0258f {
        int iU = i5 + 1;
        int i7 = bArr[i5];
        if (i7 < 0) {
            iU = U(i7, bArr, iU, dVar);
            i7 = dVar.f858a;
        }
        int i8 = iU;
        if (i7 < 0 || i7 > i6 - i8) {
            throw C0258f.e();
        }
        Object objA = a5.a();
        int i9 = i7 + i8;
        a5.e(objA, bArr, i8, i9, dVar);
        a5.b(objA);
        dVar.f860c = objA;
        return i9;
    }

    public static void F(m5 m5Var, StringBuilder sb, int i5) throws SecurityException {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : m5Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    t(sb, i5, A(strConcat), m5.e(method2, m5Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    t(sb, i5, A(strConcat2), m5.e(method3, m5Var, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objE = m5.e(method4, m5Var, new Object[0]);
                    if (method5 == null) {
                        if (objE instanceof Boolean) {
                            if (((Boolean) objE).booleanValue()) {
                                t(sb, i5, A(strConcat3), objE);
                            }
                        } else if (objE instanceof Integer) {
                            if (((Integer) objE).intValue() != 0) {
                                t(sb, i5, A(strConcat3), objE);
                            }
                        } else if (objE instanceof Float) {
                            if (((Float) objE).floatValue() != 0.0f) {
                                t(sb, i5, A(strConcat3), objE);
                            }
                        } else if (!(objE instanceof Double)) {
                            if (objE instanceof String) {
                                zEquals = objE.equals("");
                            } else if (objE instanceof Z4) {
                                zEquals = objE.equals(Z4.f5416e);
                            } else if (objE instanceof U4) {
                                if (objE != ((m5) ((m5) ((U4) objE)).h(6))) {
                                    t(sb, i5, A(strConcat3), objE);
                                }
                            } else if (!(objE instanceof Enum) || ((Enum) objE).ordinal() != 0) {
                                t(sb, i5, A(strConcat3), objE);
                            }
                            if (!zEquals) {
                                t(sb, i5, A(strConcat3), objE);
                            }
                        } else if (((Double) objE).doubleValue() != 0.0d) {
                            t(sb, i5, A(strConcat3), objE);
                        }
                    } else if (((Boolean) m5.e(method5, m5Var, new Object[0])).booleanValue()) {
                        t(sb, i5, A(strConcat3), objE);
                    }
                }
            }
        }
        D d5 = m5Var.zzc;
        if (d5 != null) {
            for (int i6 = 0; i6 < d5.f5283a; i6++) {
                t(sb, i5, String.valueOf(d5.f5284b[i6] >>> 3), d5.f5285c[i6]);
            }
        }
    }

    public static void G(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerQ = q(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerQ) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerQ) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerQ).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerQ))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static void H(byte[] bArr, long j5, int i5) {
        int i6 = 0;
        while (i6 < 4) {
            bArr[i5 + i6] = (byte) (255 & j5);
            i6++;
            j5 >>= 8;
        }
    }

    public static boolean I(String str) {
        int i5 = D4.f5291a;
        return str == null || str.isEmpty();
    }

    public static final byte[] J(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return M(bArr, 0, 0, bArr2, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static int K(A a5, int i5, byte[] bArr, int i6, int i7, InterfaceC0240c interfaceC0240c, I0.d dVar) throws C0258f {
        int iE = E(a5, bArr, i6, i7, dVar);
        interfaceC0240c.add(dVar.f860c);
        while (iE < i7) {
            int iT = T(bArr, iE, dVar);
            if (i5 != dVar.f858a) {
                break;
            }
            iE = E(a5, bArr, iT, i7, dVar);
            interfaceC0240c.add(dVar.f860c);
        }
        return iE;
    }

    public static boolean L(byte b2) {
        return b2 > -65;
    }

    public static final byte[] M(byte[] bArr, int i5, int i6, byte[] bArr2, int i7) {
        if (bArr.length - i7 < i5 || bArr2.length - i7 < i6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr3[i8] = (byte) (bArr[i8 + i5] ^ bArr2[i8 + i6]);
        }
        return bArr3;
    }

    public static int N(byte[] bArr, int i5, InterfaceC0240c interfaceC0240c, I0.d dVar) throws C0258f {
        if (interfaceC0240c != null) {
            throw new ClassCastException();
        }
        int iT = T(bArr, i5, dVar);
        int i6 = dVar.f858a + iT;
        if (iT < i6) {
            T(bArr, iT, dVar);
            throw null;
        }
        if (iT == i6) {
            return iT;
        }
        throw C0258f.e();
    }

    public static ECParameterSpec O(int i5) {
        int i6 = i5 - 1;
        return i6 != 0 ? i6 != 1 ? Q("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650") : Q("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f") : Q("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    public static int P(byte[] bArr, int i5, I0.d dVar) throws C0258f {
        int iT = T(bArr, i5, dVar);
        int i6 = dVar.f858a;
        if (i6 < 0) {
            throw C0258f.c();
        }
        if (i6 == 0) {
            dVar.f860c = "";
            return iT;
        }
        dVar.f860c = new String(bArr, iT, i6, AbstractC0246d.f5451a);
        return iT + i6;
    }

    public static ECParameterSpec Q(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static int R(byte[] bArr, int i5, I0.d dVar) throws C0258f {
        int iT = T(bArr, i5, dVar);
        int i6 = dVar.f858a;
        if (i6 < 0) {
            throw C0258f.c();
        }
        if (i6 == 0) {
            dVar.f860c = "";
            return iT;
        }
        dVar.f860c = O.d(bArr, iT, i6);
        return iT + i6;
    }

    public static int S(int i5, byte[] bArr, int i6, int i7, D d5, I0.d dVar) throws C0258f {
        if ((i5 >>> 3) == 0) {
            throw new C0258f("Protocol message contained an invalid tag (zero).");
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            int iW = W(bArr, i6, dVar);
            d5.c(i5, Long.valueOf(dVar.f859b));
            return iW;
        }
        if (i8 == 1) {
            d5.c(i5, Long.valueOf(X(i6, bArr)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int iT = T(bArr, i6, dVar);
            int i9 = dVar.f858a;
            if (i9 < 0) {
                throw C0258f.c();
            }
            if (i9 > bArr.length - iT) {
                throw C0258f.e();
            }
            if (i9 == 0) {
                d5.c(i5, Z4.f5416e);
            } else {
                d5.c(i5, Z4.q(bArr, iT, i9));
            }
            return iT + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw new C0258f("Protocol message contained an invalid tag (zero).");
            }
            d5.c(i5, Integer.valueOf(o(i6, bArr)));
            return i6 + 4;
        }
        int i10 = (i5 & (-8)) | 4;
        D dB = D.b();
        int i11 = 0;
        while (true) {
            if (i6 >= i7) {
                break;
            }
            int iT2 = T(bArr, i6, dVar);
            int i12 = dVar.f858a;
            if (i12 == i10) {
                i11 = i12;
                i6 = iT2;
                break;
            }
            i11 = i12;
            i6 = S(i12, bArr, iT2, i7, dB, dVar);
        }
        if (i6 > i7 || i11 != i10) {
            throw C0258f.d();
        }
        d5.c(i5, dB);
        return i6;
    }

    public static int T(byte[] bArr, int i5, I0.d dVar) {
        int i6 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 < 0) {
            return U(b2, bArr, i6, dVar);
        }
        dVar.f858a = b2;
        return i6;
    }

    public static int U(int i5, byte[] bArr, int i6, I0.d dVar) {
        int i7 = i5 & 127;
        int i8 = i6 + 1;
        byte b2 = bArr[i6];
        if (b2 >= 0) {
            dVar.f858a = i7 | (b2 << 7);
            return i8;
        }
        int i9 = i7 | ((b2 & Byte.MAX_VALUE) << 7);
        int i10 = i6 + 2;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            dVar.f858a = i9 | (b5 << 14);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 14);
        int i12 = i6 + 3;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            dVar.f858a = i11 | (b6 << 21);
            return i12;
        }
        int i13 = i11 | ((b6 & Byte.MAX_VALUE) << 21);
        int i14 = i6 + 4;
        byte b7 = bArr[i12];
        if (b7 >= 0) {
            dVar.f858a = i13 | (b7 << 28);
            return i14;
        }
        int i15 = i13 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                dVar.f858a = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    public static void V(byte[] bArr, int i5, InterfaceC0240c interfaceC0240c, I0.d dVar) {
        if (interfaceC0240c != null) {
            throw new ClassCastException();
        }
        T(bArr, i5, dVar);
        throw null;
    }

    public static int W(byte[] bArr, int i5, I0.d dVar) {
        int i6 = i5 + 1;
        long j5 = bArr[i5];
        if (j5 >= 0) {
            dVar.f859b = j5;
            return i6;
        }
        int i7 = i5 + 2;
        byte b2 = bArr[i6];
        long j6 = (j5 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i8 = 7;
        while (b2 < 0) {
            int i9 = i7 + 1;
            i8 += 7;
            j6 |= (r10 & Byte.MAX_VALUE) << i8;
            b2 = bArr[i7];
            i7 = i9;
        }
        dVar.f859b = j6;
        return i7;
    }

    public static long X(int i5, byte[] bArr) {
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public static int a(byte[] bArr, int i5, I0.d dVar) throws C0258f {
        int iT = T(bArr, i5, dVar);
        int i6 = dVar.f858a;
        if (i6 < 0) {
            throw C0258f.c();
        }
        if (i6 > bArr.length - iT) {
            throw C0258f.e();
        }
        if (i6 == 0) {
            dVar.f860c = Z4.f5416e;
            return iT;
        }
        dVar.f860c = Z4.q(bArr, iT, i6);
        return iT + i6;
    }

    public static C0097e b(j jVar) {
        if (TextUtils.isEmpty(jVar.f2729i)) {
            boolean z4 = jVar.f2728h;
            C0097e c0097e = new C0097e();
            String str = jVar.f2725d;
            AbstractC0203C.c(str);
            c0097e.f = str;
            String str2 = jVar.f2726e;
            AbstractC0203C.c(str2);
            c0097e.f2946g = str2;
            c0097e.f2944d = z4;
            return c0097e;
        }
        boolean z5 = jVar.f2728h;
        C0097e c0097e2 = new C0097e();
        String str3 = jVar.f2727g;
        AbstractC0203C.c(str3);
        c0097e2.f2945e = str3;
        String str4 = jVar.f2729i;
        AbstractC0203C.c(str4);
        c0097e2.f2947h = str4;
        c0097e2.f2944d = z5;
        return c0097e2;
    }

    public static V c(String str) throws GeneralSecurityException {
        ConcurrentHashMap concurrentHashMap;
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Logger logger = AbstractC0283j0.f5522a;
        synchronized (AbstractC0283j0.class) {
            concurrentHashMap = AbstractC0283j0.f;
            mapUnmodifiableMap = Collections.unmodifiableMap(concurrentHashMap);
        }
        if (!mapUnmodifiableMap.containsKey(str)) {
            throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
        }
        synchronized (AbstractC0283j0.class) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(concurrentHashMap);
        }
        return (V) mapUnmodifiableMap2.get(str);
    }

    public static C0369x3 d(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(str2).length() + String.valueOf(message).length());
        sb.append("Failed to parse ");
        sb.append(str);
        sb.append(" for string [");
        sb.append(str2);
        sb.append("] with exception: ");
        sb.append(message);
        Log.e(str, sb.toString());
        StringBuilder sb2 = new StringBuilder(str.length() + 30 + String.valueOf(str2).length());
        sb2.append("Failed to parse ");
        sb2.append(str);
        sb2.append(" for string [");
        sb2.append(str2);
        sb2.append("]");
        return new C0369x3(sb2.toString(), exc);
    }

    public static Object e(Class cls, String str) throws C0369x3 {
        if (cls == String.class) {
            try {
                C0317o4 c0317o4 = new C0317o4(0);
                c0317o4.a(str);
                if (!TextUtils.isEmpty((String) c0317o4.f5580e)) {
                    return (String) c0317o4.f5580e;
                }
                String strValueOf = String.valueOf(str);
                throw new C0369x3(strValueOf.length() != 0 ? "No error message: ".concat(strValueOf) : new String("No error message: "));
            } catch (Exception e5) {
                String strValueOf2 = String.valueOf(e5.getMessage());
                throw new C0369x3(strValueOf2.length() != 0 ? "Json conversion failed! ".concat(strValueOf2) : new String("Json conversion failed! "), e5);
            }
        }
        if (cls == Void.class) {
            return null;
        }
        try {
            Z3 z32 = (Z3) cls.getConstructor(null).newInstance(null);
            try {
                z32.b(str);
                return z32;
            } catch (Exception e6) {
                String strValueOf3 = String.valueOf(e6.getMessage());
                throw new C0369x3(strValueOf3.length() != 0 ? "Json conversion failed! ".concat(strValueOf3) : new String("Json conversion failed! "), e6);
            }
        } catch (Exception e7) {
            String strValueOf4 = String.valueOf(cls);
            throw new C0369x3(f.p(new StringBuilder(strValueOf4.length() + 38), "Instantiation of JsonResponse failed! ", strValueOf4), e7);
        }
    }

    public static String f() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb.append("-");
                    sb.append(country2);
                }
            }
        }
        return sb.toString();
    }

    public static String g(int i5) throws NoSuchAlgorithmException {
        String str;
        int iC = Q0.c(i5);
        if (iC == 1) {
            return "HmacSha1";
        }
        if (iC == 2) {
            return "HmacSha384";
        }
        if (iC == 3) {
            return "HmacSha256";
        }
        if (iC == 4) {
            return "HmacSha512";
        }
        if (iC == 5) {
            return "HmacSha224";
        }
        switch (i5) {
            case 1:
                str = "UNKNOWN_HASH";
                break;
            case 2:
                str = "SHA1";
                break;
            case 3:
                str = "SHA384";
                break;
            case 4:
                str = "SHA256";
                break;
            case 5:
                str = "SHA512";
                break;
            case 6:
                str = "SHA224";
                break;
            case 7:
                str = "UNRECOGNIZED";
                break;
            default:
                str = "null";
                break;
        }
        throw new NoSuchAlgorithmException(f.p(new StringBuilder(str.length() + 27), "hash unsupported for HMAC: ", str));
    }

    public static String h(Z4 z4) {
        StringBuilder sb = new StringBuilder(z4.n());
        for (int i5 = 0; i5 < z4.n(); i5++) {
            byte bL = z4.l(i5);
            if (bL == 34) {
                sb.append("\\\"");
            } else if (bL == 39) {
                sb.append("\\'");
            } else if (bL != 92) {
                switch (bL) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bL < 32 || bL > 126) {
                            sb.append('\\');
                            sb.append((char) (((bL >>> 6) & 3) + 48));
                            sb.append((char) (((bL >>> 3) & 7) + 48));
                            sb.append((char) ((bL & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bL);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String i(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke != null && String.class.isAssignableFrom(objInvoke.getClass())) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String j(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static void l(String str, Y3 y32, InterfaceC0257e4 interfaceC0257e4, Class cls, C0239b4 c0239b4) throws IOException {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                boolean z4 = true;
                httpURLConnection.setDoOutput(true);
                byte[] bytes = y32.a().getBytes(Charset.defaultCharset());
                int length = bytes.length;
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/json");
                httpURLConnection.setConnectTimeout(EternalContract.ONEUI_6_0_0);
                c0239b4.d(httpURLConnection);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
                try {
                    bufferedOutputStream.write(bytes, 0, length);
                    bufferedOutputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    String string = sb.toString();
                    if (responseCode < 200 || responseCode >= 300) {
                        z4 = false;
                    }
                    if (z4) {
                        interfaceC0257e4.e((Z3) e(cls, string));
                    } else {
                        interfaceC0257e4.b((String) e(String.class, string));
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (SocketTimeoutException unused) {
                interfaceC0257e4.b("TIMEOUT");
            } catch (UnknownHostException unused2) {
                interfaceC0257e4.b("<<Network Error>>");
            }
        } catch (C0369x3 | IOException | JSONException e5) {
            interfaceC0257e4.b(e5.getMessage());
        }
    }

    public static final void m(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i5) {
        if (i5 < 0 || byteBuffer2.remaining() < i5 || byteBuffer3.remaining() < i5 || byteBuffer.remaining() < i5) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] n(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b2 = 0;
        long jZ = z(0, bArr) & 67108863;
        long jZ2 = (z(3, bArr) >> 2) & 67108611;
        long jZ3 = (z(6, bArr) >> 4) & 67092735;
        long jZ4 = (z(9, bArr) >> 6) & 66076671;
        long jZ5 = (z(12, bArr) >> 8) & 1048575;
        long j5 = jZ2 * 5;
        long j6 = jZ3 * 5;
        long j7 = jZ4 * 5;
        long j8 = jZ5 * 5;
        int i5 = 17;
        byte[] bArr3 = new byte[17];
        long j9 = 0;
        int i6 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            int length = bArr2.length;
            if (i6 >= length) {
                long j14 = j9 + (j10 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j11 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j12 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = ((j18 >> 26) * 5) + j13;
                long j21 = j20 & 67108863;
                long j22 = (j10 & 67108863) + (j20 >> 26);
                long j23 = j21 + 5;
                long j24 = j22 + (j23 >> 26);
                long j25 = j15 + (j24 >> 26);
                long j26 = j17 + (j25 >> 26);
                long j27 = (j19 + (j26 >> 26)) - 67108864;
                long j28 = j27 >> 63;
                long j29 = ~j28;
                long j30 = (j22 & j28) | (j24 & 67108863 & j29);
                long j31 = (j15 & j28) | (j25 & 67108863 & j29);
                long j32 = (j17 & j28) | (j26 & 67108863 & j29);
                long jZ6 = z(16, bArr) + (((j21 & j28) | (j23 & 67108863 & j29) | (j30 << 26)) & 4294967295L);
                long jZ7 = z(20, bArr) + (((j30 >> 6) | (j31 << 20)) & 4294967295L) + (jZ6 >> 32);
                long jZ8 = z(24, bArr) + (((j31 >> 12) | (j32 << 14)) & 4294967295L) + (jZ7 >> 32);
                long jZ9 = z(28, bArr);
                byte[] bArr4 = new byte[16];
                H(bArr4, jZ6 & 4294967295L, 0);
                H(bArr4, jZ7 & 4294967295L, 4);
                H(bArr4, jZ8 & 4294967295L, 8);
                H(bArr4, ((((j32 >> 18) | (((j27 & j29) | (j19 & j28)) << 8)) & 4294967295L) + jZ9 + (jZ8 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i6);
            System.arraycopy(bArr2, i6, bArr3, b2, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i5, b2);
            }
            long jZ10 = j13 + (z(b2, bArr3) & 67108863);
            long jZ11 = j10 + ((z(3, bArr3) >> 2) & 67108863);
            long jZ12 = j9 + ((z(6, bArr3) >> 4) & 67108863);
            long jZ13 = j11 + ((z(9, bArr3) >> 6) & 67108863);
            long jZ14 = j12 + (((z(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j33 = (jZ14 * j5) + (jZ13 * j6) + (jZ12 * j7) + (jZ11 * j8) + (jZ10 * jZ);
            long j34 = (jZ14 * j6) + (jZ13 * j7) + (jZ12 * j8) + (jZ11 * jZ) + (jZ10 * jZ2) + (j33 >> 26);
            long j35 = (jZ14 * j7) + (jZ13 * j8) + (jZ12 * jZ) + (jZ11 * jZ2) + (jZ10 * jZ3) + (j34 >> 26);
            long j36 = (jZ14 * j8) + (jZ13 * jZ) + (jZ12 * jZ2) + (jZ11 * jZ3) + (jZ10 * jZ4) + (j35 >> 26);
            long j37 = jZ13 * jZ2;
            long j38 = jZ14 * jZ;
            long j39 = j38 + j37 + (jZ12 * jZ3) + (jZ11 * jZ4) + (jZ10 * jZ5) + (j36 >> 26);
            long j40 = ((j39 >> 26) * 5) + (j33 & 67108863);
            j13 = j40 & 67108863;
            j10 = (j34 & 67108863) + (j40 >> 26);
            i6 += 16;
            j12 = j39 & 67108863;
            j11 = j36 & 67108863;
            j9 = j35 & 67108863;
            b2 = 0;
            i5 = 17;
        }
    }

    public static int o(int i5, byte[] bArr) {
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }

    public static String p(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i6 >= length) {
                break;
            }
            Object obj = objArr[i6];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e5);
                    String name2 = e5.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 9 + name2.length());
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i6] = string;
            i6++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (iIndexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i7, iIndexOf);
            sb3.append(objArr[i5]);
            i7 = iIndexOf + 2;
            i5++;
        }
        sb3.append((CharSequence) str, i7, str.length());
        if (i5 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i5]);
            for (int i8 = i5 + 1; i8 < objArr.length; i8++) {
                sb3.append(", ");
                sb3.append(objArr[i8]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static BigInteger q(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static ArrayList r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(jSONArray.getString(i5));
            }
        }
        return arrayList;
    }

    public static void s(C1 c12) throws GeneralSecurityException {
        O(x(c12.q().o()));
        g(c12.q().p());
        if (c12.m() == 1) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        AbstractC0283j0.a(c12.n().o());
    }

    public static final void t(StringBuilder sb, int i5, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                t(sb, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                t(sb, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            Y4 y4 = Z4.f5416e;
            sb.append(h(new Y4(((String) obj).getBytes(AbstractC0246d.f5451a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof Z4) {
            sb.append(": \"");
            sb.append(h((Z4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof m5) {
            sb.append(" {");
            F((m5) obj, sb, i5 + 2);
            sb.append("\n");
            while (i6 < i5) {
                sb.append(' ');
                i6++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i8 = i5 + 2;
        t(sb, i8, KnoxContract.KEY, entry.getKey());
        t(sb, i8, "value", entry.getValue());
        sb.append("\n");
        while (i6 < i5) {
            sb.append(' ');
            i6++;
        }
        sb.append("}");
    }

    public static boolean u() throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean v(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i5 = 0;
            for (int i6 = 0; i6 < bArr.length; i6++) {
                i5 |= bArr[i6] ^ bArr2[i6];
            }
            if (i5 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] w(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i5 = 0; i5 < 16; i5++) {
            byte b2 = bArr[i5];
            byte b5 = (byte) ((b2 + b2) & 254);
            bArr2[i5] = b5;
            if (i5 < 15) {
                bArr2[i5] = (byte) (((bArr[i5 + 1] >> 7) & 1) | b5);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static int x(int i5) throws GeneralSecurityException {
        String str;
        int iC = Q0.c(i5);
        int i6 = 1;
        if (iC != 1) {
            i6 = 2;
            if (iC != 2) {
                if (iC == 3) {
                    return 3;
                }
                switch (i5) {
                    case 1:
                        str = "UNKNOWN_CURVE";
                        break;
                    case 2:
                        str = "NIST_P256";
                        break;
                    case 3:
                        str = "NIST_P384";
                        break;
                    case 4:
                        str = "NIST_P521";
                        break;
                    case 5:
                        str = "CURVE25519";
                        break;
                    case 6:
                        str = "UNRECOGNIZED";
                        break;
                    default:
                        str = "null";
                        break;
                }
                throw new GeneralSecurityException(f.p(new StringBuilder(str.length() + 20), "unknown curve type: ", str));
            }
        }
        return i6;
    }

    public static int y(A a5, byte[] bArr, int i5, int i6, int i7, I0.d dVar) {
        C0341t c0341t = (C0341t) a5;
        Object objA = c0341t.a();
        int iE = c0341t.E(objA, bArr, i5, i6, i7, dVar);
        c0341t.b(objA);
        dVar.f860c = objA;
        return iE;
    }

    public static long z(int i5, byte[] bArr) {
        return (((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16)) & 4294967295L;
    }

    public abstract void k(int i5, byte[] bArr);
}
