package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import com.samsung.android.knox.custom.CustomDeviceManager;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5336a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5337b;

    /* renamed from: c, reason: collision with root package name */
    public static final K f5338c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5339d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5340e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5341g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d A[PHI: r2
  0x013d: PHI (r2v23 java.lang.reflect.Field) = (r2v17 java.lang.reflect.Field), (r2v19 java.lang.reflect.Field) binds: [B:47:0x012b, B:53:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.L.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f5340e) {
            f5338c.i(cls);
        }
    }

    public static void b(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        K k5 = f5338c;
        int iJ = k5.j(j6, obj);
        int i5 = ((~((int) j5)) & 3) << 3;
        k5.n(((255 & b2) << i5) | (iJ & (~(CustomDeviceManager.CALL_SCREEN_ALL << i5))), j6, obj);
    }

    public static void c(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        K k5 = f5338c;
        int i5 = (((int) j5) & 3) << 3;
        k5.n(((255 & b2) << i5) | (k5.j(j6, obj) & (~(CustomDeviceManager.CALL_SCREEN_ALL << i5))), j6, obj);
    }

    public static double d(long j5, Object obj) {
        return f5338c.a(j5, obj);
    }

    public static float e(long j5, Object obj) {
        return f5338c.b(j5, obj);
    }

    public static int f(U4 u4, long j5) {
        return f5338c.j(j5, u4);
    }

    public static long g(U4 u4, long j5) {
        return f5338c.k(j5, u4);
    }

    public static Object h(Class cls) {
        try {
            return f5336a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static Object i(long j5, Object obj) {
        return f5338c.m(j5, obj);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new I());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void k(Throwable th) {
        Logger logger = Logger.getLogger(L.class.getName());
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", f.p(new StringBuilder(strValueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", strValueOf));
    }

    public static void l(Object obj, long j5, boolean z4) {
        f5338c.c(obj, j5, z4);
    }

    public static void m(byte[] bArr, long j5, byte b2) {
        f5338c.d(bArr, f + j5, b2);
    }

    public static void n(Object obj, long j5, double d5) {
        f5338c.e(obj, j5, d5);
    }

    public static void o(Object obj, long j5, float f5) {
        f5338c.f(obj, j5, f5);
    }

    public static void p(int i5, long j5, Object obj) {
        f5338c.n(i5, j5, obj);
    }

    public static void q(Object obj, long j5, long j6) {
        f5338c.o(obj, j5, j6);
    }

    public static void r(Object obj, long j5, Object obj2) {
        f5338c.p(obj, j5, obj2);
    }

    public static /* synthetic */ boolean s(long j5, Object obj) {
        return ((byte) ((f5338c.j((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & CustomDeviceManager.CALL_SCREEN_ALL)) != 0;
    }

    public static /* synthetic */ boolean t(long j5, Object obj) {
        return ((byte) ((f5338c.j((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & CustomDeviceManager.CALL_SCREEN_ALL)) != 0;
    }

    public static boolean u(Class cls) {
        int i5 = W4.f5404a;
        try {
            Class cls2 = f5337b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean v(long j5, Object obj) {
        return f5338c.g(j5, obj);
    }

    public static int w(Class cls) {
        if (f5340e) {
            return f5338c.h(cls);
        }
        return -1;
    }
}
