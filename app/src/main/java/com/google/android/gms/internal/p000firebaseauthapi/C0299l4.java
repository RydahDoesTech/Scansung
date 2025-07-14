package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import U0.a;
import X1.j;
import Y0.c;
import Z0.b;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import b1.AbstractC0203C;
import com.samsung.android.knox.ucm.plugin.agent.UcmAgentService;
import i1.C0480a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l1.AbstractC0678a;
import l1.C0681d;
import t1.n;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299l4 {

    /* renamed from: d, reason: collision with root package name */
    public static final d f5553d = new d("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a, reason: collision with root package name */
    public final Context f5554a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5555b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5556c = new HashMap();

    public C0299l4(Context context) {
        AbstractC0203C.e(context);
        this.f5554a = context;
        this.f5555b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    public static String e(String str, String str2) throws NoSuchAlgorithmException {
        d dVar = f5553d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String string = sb.toString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(string.getBytes(AbstractC0375y3.f5695a));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(strSubstring).length());
            sb2.append("Package: ");
            sb2.append(str);
            sb2.append(" -- Hash: ");
            sb2.append(strSubstring);
            String string2 = sb2.toString();
            Object[] objArr = new Object[0];
            if (dVar.f10a <= 3) {
                Log.d((String) dVar.f11b, dVar.f(string2, objArr));
            }
            return strSubstring;
        } catch (NoSuchAlgorithmException e5) {
            String strValueOf = String.valueOf(e5.getMessage());
            dVar.e(strValueOf.length() != 0 ? "NoSuchAlgorithm: ".concat(strValueOf) : new String("NoSuchAlgorithm: "), new Object[0]);
            return null;
        }
    }

    public final String a() throws NoSuchAlgorithmException {
        d dVar = f5553d;
        Context context = this.f5554a;
        try {
            String packageName = context.getPackageName();
            String strE = e(packageName, C0480a.a(context).f1626a.getPackageManager().getPackageInfo(packageName, UcmAgentService.ERROR_APPLET_UNKNOWN).signingInfo.getApkContentsSigners()[0].toCharsString());
            if (strE != null) {
                return strE;
            }
            dVar.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            dVar.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void b(H3 h3, String str) {
        C0293k4 c0293k4 = (C0293k4) this.f5556c.get(str);
        if (c0293k4 == null) {
            return;
        }
        c0293k4.f5538b.add(h3);
        if (c0293k4.f) {
            h3.a();
        }
        boolean z4 = c0293k4.f5542g;
        d dVar = h3.f5314b;
        R3 r32 = h3.f5313a;
        if (z4) {
            try {
                r32.d(new j(null, c0293k4.f5540d, false, null, true, null, null));
            } catch (RemoteException e5) {
                dVar.d("RemoteException when sending verification completed response.", e5, new Object[0]);
            }
        }
        if (c0293k4.f5543h) {
            try {
                r32.s();
            } catch (RemoteException e6) {
                dVar.d("RemoteException when sending auto retrieval timeout response.", e6, new Object[0]);
            }
        }
    }

    public final void c(String str) {
        HashMap map = this.f5556c;
        C0293k4 c0293k4 = (C0293k4) map.get(str);
        if (c0293k4 == null) {
            return;
        }
        ScheduledFuture scheduledFuture = c0293k4.f5541e;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            c0293k4.f5541e.cancel(false);
        }
        c0293k4.f5538b.clear();
        map.remove(str);
    }

    public final void d(final String str, H3 h3, long j5, boolean z4) {
        HashMap map = this.f5556c;
        map.put(str, new C0293k4(j5, z4));
        b(h3, str);
        C0293k4 c0293k4 = (C0293k4) map.get(str);
        long j6 = c0293k4.f5537a;
        d dVar = f5553d;
        if (j6 <= 0) {
            Log.w((String) dVar.f11b, dVar.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]));
            return;
        }
        c0293k4.f5541e = this.f5555b.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.h4
            @Override // java.lang.Runnable
            public final void run() {
                C0299l4 c0299l4 = this.f5507d;
                HashMap map2 = c0299l4.f5556c;
                String str2 = str;
                C0293k4 c0293k42 = (C0293k4) map2.get(str2);
                if (c0293k42 == null) {
                    return;
                }
                if (!c0293k42.f5543h) {
                    c0299l4.f(str2);
                }
                c0299l4.c(str2);
            }
        }, j6, TimeUnit.SECONDS);
        if (!c0293k4.f5539c) {
            Log.w((String) dVar.f11b, dVar.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]));
            return;
        }
        C0287j4 c0287j4 = new C0287j4(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        Context context = this.f5554a;
        context.getApplicationContext().registerReceiver(c0287j4, intentFilter);
        C0681d c0681d = new C0681d(context, a.f2558h, null, b.f2852b);
        E0.d dVar2 = new E0.d(19, false);
        dVar2.f520e = new b4.d();
        dVar2.f = new c[]{AbstractC0678a.f8009a};
        n nVarB = c0681d.b(1, dVar2.D0());
        M m4 = new M(9);
        nVarB.getClass();
        nVarB.b(t1.j.f8960a, m4);
    }

    public final void f(String str) {
        C0293k4 c0293k4 = (C0293k4) this.f5556c.get(str);
        if (c0293k4 == null || c0293k4.f5542g) {
            return;
        }
        int i5 = D4.f5291a;
    }
}
