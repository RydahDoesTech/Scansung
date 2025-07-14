package s1;

import A1.h;
import O1.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import e1.AbstractC0415a;
import g1.b;
import g1.c;
import g3.y;
import i1.C0480a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824a {

    /* renamed from: k, reason: collision with root package name */
    public static ScheduledExecutorService f8722k;

    /* renamed from: a, reason: collision with root package name */
    public final C0824a f8723a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f8724b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSource f8725c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8726d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8727e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8728g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f8729h;

    /* renamed from: i, reason: collision with root package name */
    public int f8730i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f8731j;

    public C0824a(Context context) throws IllegalAccessException, PackageManager.NameNotFoundException, IllegalArgumentException, InvocationTargetException {
        e eVar;
        Context context2;
        WorkSource workSource = null;
        String packageName = context == null ? null : context.getPackageName();
        this.f8723a = this;
        this.f8728g = true;
        this.f8729h = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f8731j = new AtomicInteger(0);
        AbstractC0203C.f("WakeLock: context must not be null", context);
        AbstractC0203C.d("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.f8726d = 1;
        this.f = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f8727e = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f8727e = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        this.f8724b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = c.f6772a;
        if (context.getPackageManager() != null) {
            if (C0480a.a(context).f1626a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                int i5 = b.f6771a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = C0480a.a(context).f1626a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            Log.e("WorkSourceUtil", packageName.length() != 0 ? "Could not get applicationInfo from package: ".concat(packageName) : new String("Could not get applicationInfo from package: "));
                        } else {
                            int i6 = applicationInfo.uid;
                            workSource = new WorkSource();
                            Method method2 = c.f6773b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i6), packageName);
                                } catch (Exception e5) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e5);
                                }
                            } else {
                                Method method3 = c.f6772a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, Integer.valueOf(i6));
                                    } catch (Exception e6) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e6);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", packageName.length() != 0 ? "Could not find package: ".concat(packageName) : new String("Could not find package: "));
                    }
                }
                this.f8725c = workSource;
                if (workSource != null && (context2 = this.f) != null && context2.getPackageManager() != null) {
                    if (C0480a.a(context2).f1626a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context2.getPackageName()) == 0) {
                        workSource.add(workSource);
                        try {
                            this.f8724b.setWorkSource(workSource);
                        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                            Log.wtf("WakeLock", e7.toString());
                        }
                    }
                }
            }
        }
        if (f8722k == null) {
            synchronized (AbstractC0415a.class) {
                try {
                    if (AbstractC0415a.f6634a == null) {
                        AbstractC0415a.f6634a = new e(13);
                    }
                    eVar = AbstractC0415a.f6634a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar.getClass();
            f8722k = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    public final void a(long j5) {
        this.f8731j.incrementAndGet();
        if (this.f8728g) {
            TextUtils.isEmpty(null);
        }
        synchronized (this.f8723a) {
            try {
                if (!this.f8729h.isEmpty() || this.f8730i > 0) {
                    if (!this.f8724b.isHeld()) {
                        this.f8729h.clear();
                        this.f8730i = 0;
                    }
                }
                if (this.f8728g) {
                    Integer[] numArr = (Integer[]) this.f8729h.get(null);
                    if (numArr == null) {
                        this.f8729h.put(null, new Integer[]{1});
                        J2.b.P(this.f, y.t(this.f8724b, null), 7, this.f8727e, null, this.f8726d, c(), j5);
                        this.f8730i++;
                    } else {
                        numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                        if (!this.f8728g) {
                            J2.b.P(this.f, y.t(this.f8724b, null), 7, this.f8727e, null, this.f8726d, c(), j5);
                            this.f8730i++;
                        }
                    }
                } else if (!this.f8728g && this.f8730i == 0) {
                    J2.b.P(this.f, y.t(this.f8724b, null), 7, this.f8727e, null, this.f8726d, c(), j5);
                    this.f8730i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8724b.acquire();
        if (j5 > 0) {
            f8722k.schedule(new h(17, this), j5, TimeUnit.MILLISECONDS);
        }
    }

    public final void b() {
        Integer[] numArr;
        if (this.f8731j.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f8727e).concat(" release without a matched acquire!"));
        }
        if (this.f8728g) {
            TextUtils.isEmpty(null);
        }
        synchronized (this.f8723a) {
            try {
                if (!this.f8728g || (numArr = (Integer[]) this.f8729h.get(null)) == null) {
                    if (!this.f8728g && this.f8730i == 1) {
                        J2.b.P(this.f, y.t(this.f8724b, null), 8, this.f8727e, null, this.f8726d, c(), 0L);
                        this.f8730i--;
                    }
                } else if (numArr[0].intValue() == 1) {
                    this.f8729h.remove(null);
                    J2.b.P(this.f, y.t(this.f8724b, null), 8, this.f8727e, null, this.f8726d, c(), 0L);
                    this.f8730i--;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    if (!this.f8728g) {
                        J2.b.P(this.f, y.t(this.f8724b, null), 8, this.f8727e, null, this.f8726d, c(), 0L);
                        this.f8730i--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c() {
        /*
            r8 = this;
            android.os.WorkSource r8 = r8.f8725c
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            java.lang.String r1 = "WorkSourceUtil"
            r2 = 0
            r3 = 0
            if (r8 != 0) goto Le
            java.lang.reflect.Method r4 = g1.c.f6772a
        Lc:
            r4 = r3
            goto L22
        Le:
            java.lang.reflect.Method r4 = g1.c.f6774c
            if (r4 == 0) goto Lc
            java.lang.Object r4 = r4.invoke(r8, r2)     // Catch: java.lang.Exception -> L1d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L1d
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L1d
            goto L22
        L1d:
            r4 = move-exception
            android.util.Log.wtf(r1, r0, r4)
            goto Lc
        L22:
            if (r4 != 0) goto L29
            java.util.List r8 = java.util.Collections.emptyList()
            goto L5e
        L29:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L2e:
            if (r3 >= r4) goto L5d
            java.lang.reflect.Method r6 = g1.c.f6775d
            if (r6 == 0) goto L47
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L43
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L43
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch: java.lang.Exception -> L43
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L43
            goto L48
        L43:
            r6 = move-exception
            android.util.Log.wtf(r1, r0, r6)
        L47:
            r6 = r2
        L48:
            int r7 = g1.b.f6771a
            if (r6 == 0) goto L5a
            java.lang.String r7 = r6.trim()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L57
            goto L5a
        L57:
            r5.add(r6)
        L5a:
            int r3 = r3 + 1
            goto L2e
        L5d:
            r8 = r5
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C0824a.c():java.util.List");
    }

    public final void d() {
        PowerManager.WakeLock wakeLock = this.f8724b;
        if (wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (RuntimeException e5) {
                if (!e5.getClass().equals(RuntimeException.class)) {
                    throw e5;
                }
                Log.e("WakeLock", String.valueOf(this.f8727e).concat(" was already released!"), e5);
            }
            wakeLock.isHeld();
        }
    }
}
