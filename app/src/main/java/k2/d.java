package k2;

import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.firebase.messaging.C0388e;
import com.idm.network.IDMNetworkInterface;
import j2.InterfaceC0558a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.Q0;
import l2.C0682a;
import m2.C0685a;
import m2.C0686b;
import m2.C0687c;
import org.json.JSONException;
import org.json.JSONObject;
import r0.AbstractC0809c;
import t1.n;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f7882m = new Object();
    public static final c n = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final V1.g f7883a;

    /* renamed from: b, reason: collision with root package name */
    public final C0687c f7884b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.b f7885c;

    /* renamed from: d, reason: collision with root package name */
    public final k f7886d;

    /* renamed from: e, reason: collision with root package name */
    public final l2.b f7887e;
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7888g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f7889h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f7890i;

    /* renamed from: j, reason: collision with root package name */
    public String f7891j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f7892k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7893l;

    public d(V1.g gVar, InterfaceC0558a interfaceC0558a, InterfaceC0558a interfaceC0558a2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        c cVar = n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, cVar);
        gVar.a();
        C0687c c0687c = new C0687c(gVar.f2610a, interfaceC0558a, interfaceC0558a2);
        l2.b bVar = new l2.b(gVar, 1);
        if (b4.d.f5107e == null) {
            b4.d.f5107e = new b4.d();
        }
        b4.d dVar = b4.d.f5107e;
        if (k.f7901d == null) {
            k.f7901d = new k(dVar);
        }
        k kVar = k.f7901d;
        l2.b bVar2 = new l2.b(gVar, 0);
        i iVar = new i();
        this.f7888g = new Object();
        this.f7892k = new HashSet();
        this.f7893l = new ArrayList();
        this.f7883a = gVar;
        this.f7884b = c0687c;
        this.f7885c = bVar;
        this.f7886d = kVar;
        this.f7887e = bVar2;
        this.f = iVar;
        this.f7889h = threadPoolExecutor;
        this.f7890i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), cVar);
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        C0682a c0682aB;
        synchronized (f7882m) {
            try {
                V1.g gVar = this.f7883a;
                gVar.a();
                C0388e c0388eE = C0388e.e(gVar.f2610a);
                try {
                    c0682aB = this.f7885c.b();
                    int i5 = c0682aB.f8015b;
                    boolean z4 = true;
                    if (i5 != 2 && i5 != 1) {
                        z4 = false;
                    }
                    if (z4) {
                        String strF = f(c0682aB);
                        l2.b bVar = this.f7885c;
                        H3.b bVarA = c0682aB.a();
                        bVarA.f823b = strF;
                        bVarA.f824c = 3;
                        c0682aB = bVarA.a();
                        bVar.a(c0682aB);
                    }
                    if (c0388eE != null) {
                        c0388eE.B();
                    }
                } catch (Throwable th) {
                    if (c0388eE != null) {
                        c0388eE.B();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(c0682aB);
        this.f7890i.execute(new b(this, 2));
    }

    public final C0682a b(C0682a c0682a) throws NoSuchAlgorithmException, f {
        int responseCode;
        C0686b c0686bF;
        V1.g gVar = this.f7883a;
        gVar.a();
        String str = gVar.f2612c.f2617a;
        String str2 = c0682a.f8014a;
        V1.g gVar2 = this.f7883a;
        gVar2.a();
        String str3 = gVar2.f2612c.f2622g;
        String str4 = c0682a.f8017d;
        C0687c c0687c = this.f7884b;
        m2.d dVar = c0687c.f8049d;
        if (!dVar.a()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C0687c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i5 = 0; i5 <= 1; i5++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = c0687c.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(IDMNetworkInterface.IDM_HTTP_METHOD_POST);
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    C0687c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    c0686bF = C0687c.f(httpURLConnectionC);
                } else {
                    C0687c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        A.d dVarA = C0686b.a();
                        dVarA.f10a = 3;
                        c0686bF = dVarA.b();
                    } else {
                        if (responseCode == 429) {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            A.d dVarA2 = C0686b.a();
                            dVarA2.f10a = 2;
                            c0686bF = dVarA2.b();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                int iC = Q0.c(c0686bF.f8044c);
                if (iC == 0) {
                    k kVar = this.f7886d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f7902a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    H3.b bVarA = c0682a.a();
                    bVarA.f825d = c0686bF.f8042a;
                    bVarA.f = Long.valueOf(c0686bF.f8043b);
                    bVarA.f827g = Long.valueOf(seconds);
                    return bVarA.a();
                }
                if (iC == 1) {
                    H3.b bVarA2 = c0682a.a();
                    bVarA2.f828h = "BAD CONFIG";
                    bVarA2.f824c = 5;
                    return bVarA2.a();
                }
                if (iC != 2) {
                    throw new f("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f7891j = null;
                }
                H3.b bVarA3 = c0682a.a();
                bVarA3.f824c = 2;
                return bVarA3.a();
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final n c() {
        String str;
        e();
        synchronized (this) {
            str = this.f7891j;
        }
        if (str != null) {
            return AbstractC0809c.e(str);
        }
        t1.i iVar = new t1.i();
        h hVar = new h(iVar);
        synchronized (this.f7888g) {
            this.f7893l.add(hVar);
        }
        n nVar = iVar.f8959a;
        this.f7889h.execute(new b(this, 0));
        return nVar;
    }

    public final n d() {
        e();
        t1.i iVar = new t1.i();
        g gVar = new g(this.f7886d, iVar);
        synchronized (this.f7888g) {
            this.f7893l.add(gVar);
        }
        this.f7889h.execute(new b(this, 1));
        return iVar.f8959a;
    }

    public final void e() {
        V1.g gVar = this.f7883a;
        gVar.a();
        AbstractC0203C.d(gVar.f2612c.f2618b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        AbstractC0203C.d(gVar.f2612c.f2622g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        AbstractC0203C.d(gVar.f2612c.f2617a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f2612c.f2618b;
        Pattern pattern = k.f7900c;
        AbstractC0203C.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        AbstractC0203C.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f7900c.matcher(gVar.f2612c.f2617a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(l2.C0682a r6) {
        /*
            r5 = this;
            V1.g r0 = r5.f7883a
            r0.a()
            java.lang.String r0 = r0.f2611b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            V1.g r0 = r5.f7883a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f2611b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5b
        L1e:
            r0 = 1
            int r6 = r6.f8015b
            if (r6 != r0) goto L5b
            l2.b r6 = r5.f7887e
            java.lang.Object r0 = r6.f8021a
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            monitor-enter(r0)
            java.lang.Object r1 = r6.f8021a     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r6.f8021a     // Catch: java.lang.Throwable -> L56
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r5 = move-exception
            goto L59
        L41:
            java.lang.String r2 = r6.c()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L55
            k2.i r5 = r5.f
            r5.getClass()
            java.lang.String r2 = k2.i.a()
        L55:
            return r2
        L56:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r5     // Catch: java.lang.Throwable -> L3f
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L5b:
            k2.i r5 = r5.f
            r5.getClass()
            java.lang.String r5 = k2.i.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.d.f(l2.a):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [m2.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [m2.a] */
    public final C0682a g(C0682a c0682a) throws NoSuchAlgorithmException, f {
        int responseCode;
        String str = c0682a.f8014a;
        String string = null;
        if (str != null && str.length() == 11) {
            l2.b bVar = this.f7887e;
            synchronized (((SharedPreferences) bVar.f8021a)) {
                try {
                    String[] strArr = l2.b.f8020c;
                    int i5 = 0;
                    while (true) {
                        if (i5 < 4) {
                            String str2 = strArr[i5];
                            String string2 = ((SharedPreferences) bVar.f8021a).getString("|T|" + ((String) bVar.f8022b) + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i5++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C0687c c0687c = this.f7884b;
        V1.g gVar = this.f7883a;
        gVar.a();
        String str3 = gVar.f2612c.f2617a;
        String str4 = c0682a.f8014a;
        V1.g gVar2 = this.f7883a;
        gVar2.a();
        String str5 = gVar2.f2612c.f2622g;
        V1.g gVar3 = this.f7883a;
        gVar3.a();
        String str6 = gVar3.f2612c.f2618b;
        m2.d dVar = c0687c.f8049d;
        if (!dVar.a()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C0687c.a("projects/" + str5 + "/installations");
        int i6 = 0;
        C0685a c0685a = c0687c;
        while (i6 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c0685a.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(IDMNetworkInterface.IDM_HTTP_METHOD_POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C0687c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                C0685a c0685aE = C0687c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                c0685a = c0685aE;
            } else {
                try {
                    C0687c.b(httpURLConnectionC, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i6++;
                    c0685a = c0685a;
                }
                if (responseCode == 429) {
                    throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    C0685a c0685a2 = new C0685a(null, null, null, null, 2);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c0685a = c0685a2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i6++;
                    c0685a = c0685a;
                }
            }
            int iC = Q0.c(c0685a.f8041e);
            if (iC != 0) {
                if (iC != 1) {
                    throw new f("Firebase Installations Service is unavailable. Please try again later.");
                }
                H3.b bVarA = c0682a.a();
                bVarA.f828h = "BAD CONFIG";
                bVarA.f824c = 5;
                return bVarA.a();
            }
            String str7 = c0685a.f8038b;
            String str8 = c0685a.f8039c;
            k kVar = this.f7886d;
            kVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kVar.f7902a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C0686b c0686b = c0685a.f8040d;
            String str9 = c0686b.f8042a;
            long j5 = c0686b.f8043b;
            H3.b bVarA2 = c0682a.a();
            bVarA2.f823b = str7;
            bVarA2.f824c = 4;
            bVarA2.f825d = str9;
            bVarA2.f826e = str8;
            bVarA2.f = Long.valueOf(j5);
            bVarA2.f827g = Long.valueOf(seconds);
            return bVarA2.a();
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f7888g) {
            try {
                Iterator it = this.f7893l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C0682a c0682a) {
        synchronized (this.f7888g) {
            try {
                Iterator it = this.f7893l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(c0682a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
