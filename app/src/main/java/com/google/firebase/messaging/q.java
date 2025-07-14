package com.google.firebase.messaging;

import C3.C0012d;
import I3.C0028j;
import I3.C0037t;
import J.P;
import android.R;
import android.app.ActivityManager;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import androidx.viewpager2.widget.ViewPager2;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4;
import com.google.android.gms.internal.p000firebaseauthapi.B4;
import com.google.android.gms.internal.p000firebaseauthapi.C0306n;
import com.google.android.gms.internal.p000firebaseauthapi.C0345t3;
import com.google.android.gms.internal.p000firebaseauthapi.C0357v3;
import com.google.android.gms.internal.p000firebaseauthapi.C0358v4;
import com.google.android.gms.internal.p000firebaseauthapi.C0364w4;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import com.google.android.gms.internal.p000firebaseauthapi.C4;
import com.google.android.gms.internal.p000firebaseauthapi.G3;
import com.google.android.gms.internal.p000firebaseauthapi.H3;
import com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4;
import com.google.android.gms.internal.p000firebaseauthapi.M4;
import com.google.android.gms.internal.p000firebaseauthapi.X3;
import com.google.android.gms.internal.p000firebaseauthapi.Y3;
import com.google.android.gms.internal.p000firebaseauthapi.Z3;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.lib.episode.EternalContract;
import com.samsung.context.sdk.samsunganalytics.BuildConfig;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import i.AbstractC0476b;
import i.InterfaceC0475a;
import j.MenuC0492i;
import j.MenuC0507x;
import j.MenuItemC0499p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0704b;
import o.C0707e;
import o.C0713k;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C0739A;
import p3.C0741C;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0781y;
import q3.InterfaceC0792b;
import s3.C0843T;
import u3.C0879a;

/* loaded from: classes.dex */
public final class q implements G3.m, G3.n, I2.b, M0.b, a4.e, InterfaceC0257e4, Y3, InterfaceC0475a {

    /* renamed from: i, reason: collision with root package name */
    public static q f6166i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6167d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6168e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6169g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6170h;

    public q(Context context, X3 x32) {
        this.f6167d = 13;
        this.f = context;
        this.f6169g = x32;
        this.f6170h = K();
    }

    public static void B(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.delete()) {
                J2.b.k("Removed zipFile : ".concat(str));
            } else {
                J2.b.k("Couldn't removed zipFile : ".concat(str));
            }
        }
    }

    public static Z1.t H(V1.g gVar, C0364w4 c0364w4) {
        AbstractC0203C.e(gVar);
        AbstractC0203C.e(c0364w4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Z1.r(c0364w4));
        List list = c0364w4.f5669i.f5282d;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                arrayList.add(new Z1.r((B4) list.get(i5)));
            }
        }
        Z1.t tVar = new Z1.t(gVar, arrayList);
        tVar.f2903l = new Z1.u(c0364w4.f5673m, c0364w4.f5672l);
        tVar.f2904m = c0364w4.n;
        tVar.n = c0364w4.f5674o;
        tVar.g(Y0.j.W(c0364w4.f5675p));
        return tVar;
    }

    public static void g(Bundle bundle, String str) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        try {
            parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(str), 268435456);
            J2.b.k("Zipping logs is completed");
            J2.b.k("Zipped file size : " + parcelFileDescriptorOpen.getStatSize());
        } catch (Exception e5) {
            J2.b.l(e5.getMessage());
            parcelFileDescriptorOpen = null;
        }
        bundle.putParcelable("fileDescriptor", parcelFileDescriptorOpen);
    }

    public static String h(Context context, String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            J2.b.c0("No Log Path, You have to set LogPath to report logs");
            throw new IOException("Not found");
        }
        try {
            String str2 = context.getFilesDir().getAbsolutePath() + "/zip";
            new File(str2).mkdir();
            String str3 = str2 + "/" + (System.currentTimeMillis() + ".zip");
            J2.b.d0(str, str3);
            return str3;
        } catch (Exception e5) {
            J2.b.c0("Zipping failure");
            J2.b.c0("Exception : " + e5.getMessage());
            throw e5;
        }
    }

    public static synchronized q u() {
        try {
            if (f6166i == null) {
                f6166i = new q(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6166i;
    }

    public Intent A(Context context, J2.a aVar, J2.c cVar) throws JSONException {
        String strValueOf;
        JSONObject jSONObject = new JSONObject();
        Intent intent = context.getApplicationInfo().uid == 1000 ? new Intent("com.sec.android.diagmonagent.intent.REPORT_ERROR_V2") : new Intent("com.sec.android.diagmonagent.intent.REPORT_ERROR_APP");
        Bundle bundle = new Bundle();
        intent.addFlags(32);
        bundle.putBundle("DiagMon", new Bundle());
        bundle.getBundle("DiagMon").putBundle("CFailLogUpload", new Bundle());
        bundle.getBundle("DiagMon").getBundle("CFailLogUpload").putString("ServiceID", aVar.f1571b);
        bundle.getBundle("DiagMon").getBundle("CFailLogUpload").putBundle("Ext", new Bundle());
        bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("ClientV", AbstractC0415a.y(context));
        cVar.getClass();
        if (!TextUtils.isEmpty("")) {
            bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("RelayClient", "");
        }
        if (!TextUtils.isEmpty("")) {
            bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("RelayClientV", "");
        }
        bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("UiMode", "0");
        bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString(UpdateHistoryInfoDao.IDM_DB_UPDATE_HISTORY_RESULTCODE, cVar.f1586d);
        if (!TextUtils.isEmpty(cVar.f1585c)) {
            bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("EventID", cVar.f1585c);
        }
        try {
            jSONObject.put("SasdkV", "6.05.077");
            String str = L2.a.f1731a;
            try {
                strValueOf = String.valueOf(BuildConfig.VERSION_CODE);
            } catch (Exception unused) {
                strValueOf = "";
            }
            jSONObject.put("SdkV", strValueOf);
            jSONObject.put("TrackingID", "");
            jSONObject.put(UpdateHistoryInfoDao.IDM_DB_UPDATE_HISTORY_DESCRIPTION, cVar.f1587e);
        } catch (JSONException e5) {
            J2.b.l(e5.getMessage());
        }
        bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString(UpdateHistoryInfoDao.IDM_DB_UPDATE_HISTORY_DESCRIPTION, jSONObject.toString());
        if (((Bundle) this.f6169g).getBoolean("wifiOnly", true)) {
            bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("WifiOnlyFeature", "1");
        } else {
            bundle.getBundle("DiagMon").getBundle("CFailLogUpload").getBundle("Ext").putString("WifiOnlyFeature", "0");
        }
        intent.putExtra("uploadMO", bundle);
        intent.setFlags(32);
        J2.b.C("EventObject is generated");
        return intent;
    }

    public void C() {
        try {
            String str = ((J2.a) this.f).f1571b;
            String str2 = L2.a.f1731a;
            String strConcat = "com.sec.android.log.".concat(str);
            ((Context) this.f6168e).getContentResolver().call(Uri.parse("content://" + strConcat), "update_path", ((J2.c) this.f6170h).f1584b, (Bundle) null);
        } catch (Exception e5) {
            J2.b.c0("fail to send log path: " + e5.getMessage());
        }
    }

    public void D() {
        int iA;
        int i5 = R.id.accessibilityActionPageLeft;
        ViewPager2 viewPager2 = (ViewPager2) this.f6170h;
        P.f(R.id.accessibilityActionPageLeft, viewPager2);
        P.d(0, viewPager2);
        P.f(R.id.accessibilityActionPageRight, viewPager2);
        P.d(0, viewPager2);
        P.f(R.id.accessibilityActionPageUp, viewPager2);
        P.d(0, viewPager2);
        P.f(R.id.accessibilityActionPageDown, viewPager2);
        P.d(0, viewPager2);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.f4993u) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        G0.k kVar = (G0.k) this.f;
        G0.k kVar2 = (G0.k) this.f6168e;
        if (orientation != 0) {
            if (viewPager2.f4980g < iA - 1) {
                P.g(viewPager2, new K.c(R.id.accessibilityActionPageDown), kVar2);
            }
            if (viewPager2.f4980g > 0) {
                P.g(viewPager2, new K.c(R.id.accessibilityActionPageUp), kVar);
                return;
            }
            return;
        }
        boolean z4 = viewPager2.f4983j.A() == 1;
        int i6 = z4 ? 16908360 : 16908361;
        if (z4) {
            i5 = 16908361;
        }
        if (viewPager2.f4980g < iA - 1) {
            P.g(viewPager2, new K.c(i6), kVar2);
        }
        if (viewPager2.f4980g > 0) {
            P.g(viewPager2, new K.c(i5), kVar);
        }
    }

    public G3.c E(int i5, N3.b bVar, C0879a c0879a) {
        G3.p pVar = new G3.p(((G3.p) this.f6168e).f773a + '@' + i5);
        E0.d dVar = (E0.d) this.f6170h;
        List arrayList = (List) ((HashMap) dVar.f).get(pVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) dVar.f).put(pVar, arrayList);
        }
        return ((G3.d) dVar.f520e).p(bVar, c0879a, arrayList);
    }

    @Override // a4.e
    public a4.d F(N3.b bVar) {
        AbstractC0219i.e("classId", bVar);
        C0028j c0028j = (C0028j) ((LinkedHashMap) this.f6170h).get(bVar);
        if (c0028j == null) {
            return null;
        }
        ((B3.d) this.f6169g).d(bVar);
        return new a4.d((E0.d) this.f6168e, c0028j, (J3.a) this.f, InterfaceC0752N.f8400b);
    }

    @Override // G3.n
    public G3.m G(N3.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new q(((G3.d) this.f).o(bVar, InterfaceC0752N.f8400b, arrayList), this, arrayList);
    }

    public t1.n I(AbstractC0251d4 abstractC0251d4) {
        return J().f5655a.b(1, abstractC0251d4.a());
    }

    public C0357v3 J() {
        C0357v3 c0357v3;
        synchronized (this) {
            if (((C0357v3) this.f6168e) == null) {
                try {
                    this.f6168e = (C0357v3) K().get();
                } catch (Exception e5) {
                    String strValueOf = String.valueOf(e5.getMessage());
                    throw new RuntimeException(strValueOf.length() != 0 ? "There was an error while initializing the connection to the GoogleApi: ".concat(strValueOf) : new String("There was an error while initializing the connection to the GoogleApi: "));
                }
            }
            c0357v3 = (C0357v3) this.f6168e;
        }
        return c0357v3;
    }

    public Future K() {
        Future future = (Future) this.f6170h;
        if (future != null) {
            return future;
        }
        G3 g32 = new G3((Context) this.f, (X3) this.f6169g);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor).submit(g32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ((String) this.f6168e).getClass();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", (String) this.f);
        JSONObject jSONObject2 = new JSONObject();
        String str = (String) this.f6169g;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = (String) this.f6170h;
        if (str2 != null) {
            jSONObject2.put(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void b(String str) {
        switch (this.f6167d) {
            case 11:
                ((C0345t3) this.f6168e).b(str);
                break;
            default:
                ((H3) this.f6169g).b(V1.a.q0(str));
                break;
        }
    }

    @Override // i.InterfaceC0475a
    public boolean c(AbstractC0476b abstractC0476b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f6168e).onActionItemClicked(s(abstractC0476b), new MenuItemC0499p((Context) this.f, (D.a) menuItem));
    }

    @Override // i.InterfaceC0475a
    public boolean d(AbstractC0476b abstractC0476b, MenuC0492i menuC0492i) {
        i.g gVarS = s(abstractC0476b);
        C0713k c0713k = (C0713k) this.f6170h;
        Menu menuC0507x = (Menu) c0713k.getOrDefault(menuC0492i, null);
        if (menuC0507x == null) {
            menuC0507x = new MenuC0507x((Context) this.f, menuC0492i);
            c0713k.put(menuC0492i, menuC0507x);
        }
        return ((ActionMode.Callback) this.f6168e).onCreateActionMode(gVarS, menuC0507x);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void e(Z3 z32) {
        switch (this.f6167d) {
            case 11:
                List list = ((C0358v4) z32).f5656d.f5683d;
                if (list == null || list.isEmpty()) {
                    ((C0345t3) this.f6168e).b("No users.");
                    break;
                } else {
                    C0364w4 c0364w4 = (C0364w4) list.get(0);
                    C4 c42 = c0364w4.f5669i;
                    List list2 = c42 != null ? c42.f5282d : null;
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(null)) {
                            ((B4) list2.get(0)).f5271h = null;
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 < list2.size()) {
                                    if (((B4) list2.get(i5)).f5270g.equals(null)) {
                                        ((B4) list2.get(i5)).f5271h = null;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                    }
                    c0364w4.n = ((Boolean) this.f).booleanValue();
                    c0364w4.f5674o = null;
                    H3 h3 = (H3) this.f6169g;
                    try {
                        h3.f5313a.c((C0382z4) this.f6170h, c0364w4);
                        break;
                    } catch (RemoteException e5) {
                        h3.f5314b.d("RemoteException when sending get token and account info user response", e5, new Object[0]);
                        return;
                    }
                }
                break;
            default:
                C0382z4 c0382z4 = (C0382z4) z32;
                a4.k kVar = new a4.k();
                kVar.d(c0382z4.f5703e);
                M4 m4 = (M4) kVar.f3063j;
                String str = (String) this.f6168e;
                if (str == null) {
                    m4.f5353e.add("EMAIL");
                } else {
                    kVar.f = str;
                }
                String str2 = (String) this.f;
                if (str2 == null) {
                    m4.f5353e.add("PASSWORD");
                } else {
                    kVar.f3060g = str2;
                }
                C0306n.p(kVar, (C0306n) this.f6170h, (H3) this.f6169g, this, c0382z4);
                break;
        }
    }

    @Override // i.InterfaceC0475a
    public boolean f(AbstractC0476b abstractC0476b, MenuC0492i menuC0492i) {
        i.g gVarS = s(abstractC0476b);
        C0713k c0713k = (C0713k) this.f6170h;
        Menu menuC0507x = (Menu) c0713k.getOrDefault(menuC0492i, null);
        if (menuC0507x == null) {
            menuC0507x = new MenuC0507x((Context) this.f, menuC0492i);
            c0713k.put(menuC0492i, menuC0507x);
        }
        return ((ActionMode.Callback) this.f6168e).onPrepareActionMode(gVarS, menuC0507x);
    }

    @Override // N2.a
    public Object get() {
        return new P0.k((Executor) ((N2.a) this.f6168e).get(), (Q0.c) ((N2.a) this.f).get(), (P0.d) ((D3.c) this.f6169g).get(), (R0.c) ((N2.a) this.f6170h).get());
    }

    @Override // i.InterfaceC0475a
    public void i(AbstractC0476b abstractC0476b) {
        ((ActionMode.Callback) this.f6168e).onDestroyActionMode(s(abstractC0476b));
    }

    public void j(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0713k) this.f).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                j(arrayList2.get(i5), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: NullPointerException | Exception -> 0x005e, TryCatch #0 {NullPointerException | Exception -> 0x005e, blocks: (B:3:0x0001, B:5:0x000a, B:15:0x002b, B:17:0x0031, B:19:0x0039, B:22:0x0043, B:24:0x0049, B:7:0x0011, B:9:0x0019, B:12:0x0022, B:10:0x001e), top: B:27:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: NullPointerException | Exception -> 0x005e, TryCatch #0 {NullPointerException | Exception -> 0x005e, blocks: (B:3:0x0001, B:5:0x000a, B:15:0x002b, B:17:0x0031, B:19:0x0039, B:22:0x0043, B:24:0x0049, B:7:0x0011, B:9:0x0019, B:12:0x0022, B:10:0x001e), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(android.content.Context r4, J2.a r5, J2.c r6) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r5.f1571b     // Catch: java.lang.Throwable -> L5e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5e
            r2 = 1
            if (r1 == 0) goto L11
            java.lang.String r1 = "Service ID has to be set"
            J2.b.c0(r1)     // Catch: java.lang.Throwable -> L5e
        Lf:
            r1 = r0
            goto L29
        L11:
            android.content.Context r1 = r5.f1570a     // Catch: java.lang.Throwable -> L5e
            int r1 = L2.a.a(r1)     // Catch: java.lang.Throwable -> L5e
            if (r1 != r2) goto L1e
            A1.c r1 = r5.f1575g     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r1.f53e     // Catch: java.lang.Throwable -> L5e
            goto L20
        L1e:
            boolean r1 = r5.f1574e     // Catch: java.lang.Throwable -> L5e
        L20:
            if (r1 != 0) goto L28
            java.lang.String r1 = "You have to agree to terms and conditions"
            J2.b.c0(r1)     // Catch: java.lang.Throwable -> L5e
            goto Lf
        L28:
            r1 = r2
        L29:
            if (r1 != 0) goto L31
            java.lang.String r3 = "Invalid DiagMonConfiguration"
            J2.b.c0(r3)     // Catch: java.lang.Throwable -> L5e
            return r0
        L31:
            java.lang.String r1 = r6.f1586d     // Catch: java.lang.Throwable -> L5e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L40
            java.lang.String r1 = "No Result code - you have to set"
            J2.b.c0(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = r0
            goto L41
        L40:
            r1 = r2
        L41:
            if (r1 != 0) goto L49
            java.lang.String r3 = "Invalid EventBuilder"
            J2.b.c0(r3)     // Catch: java.lang.Throwable -> L5e
            return r0
        L49:
            java.lang.String r1 = "Valid EventBuilder"
            J2.b.k(r1)     // Catch: java.lang.Throwable -> L5e
            r3.C()     // Catch: java.lang.Throwable -> L5e
            android.content.Intent r3 = r3.A(r4, r5, r6)     // Catch: java.lang.Throwable -> L5e
            r4.sendBroadcast(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "Report your logs"
            J2.b.k(r3)     // Catch: java.lang.Throwable -> L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.k(android.content.Context, J2.a, J2.c):boolean");
    }

    public boolean l(Context context, J2.a aVar, J2.c cVar, Bundle bundle) {
        try {
            if (aVar == null) {
                J2.b.c0("No Configuration");
                J2.b.c0("You have to set DiagMonConfiguration");
                return false;
            }
            Bundle bundleZ = z(aVar, cVar);
            if (bundleZ == null) {
                J2.b.c0("No EventObject");
                return false;
            }
            if (!g3.y.L(bundle)) {
                J2.b.c0("Invalid SR object");
                return false;
            }
            if (!g3.y.L(bundleZ)) {
                J2.b.c0("Invalid ER object");
                return false;
            }
            J2.b.C("Valid SR, ER object");
            J2.b.C("Report your logs");
            J2.b.C("networkMode : " + bundle.getBoolean("wifiOnly", true));
            bundleZ.putBoolean("wifiOnly", bundle.getBoolean("wifiOnly", true));
            String strH = h(context, cVar.f1584b);
            g(bundleZ, strH);
            L2.a.c(context.getContentResolver().call(L2.a.f1732b, "event_report", "eventReport", bundleZ));
            if (!strH.isEmpty()) {
                B(strH);
            }
            return true;
        } catch (NullPointerException | Exception unused) {
            return false;
        }
    }

    @Override // G3.m
    public void m() {
        switch (this.f6167d) {
            case 3:
                ArrayList arrayList = (ArrayList) this.f;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((E0.d) this.f6169g).f).put((G3.p) this.f6168e, arrayList);
                    break;
                }
                break;
            case 4:
                ((G3.c) this.f).m();
                ((ArrayList) ((q) this.f6169g).f6168e).add(new S3.a((InterfaceC0792b) P2.m.J0((ArrayList) this.f6170h)));
                break;
            default:
                ArrayList arrayList2 = (ArrayList) this.f6168e;
                G3.c cVar = (G3.c) this.f6170h;
                cVar.getClass();
                AbstractC0219i.e("elements", arrayList2);
                N3.f fVar = (N3.f) this.f6169g;
                if (fVar != null) {
                    C0843T c0843tF = r2.d.f(fVar, (InterfaceC0761e) cVar.f742h);
                    if (c0843tF == null) {
                        if (((G3.d) cVar.f).n((N3.b) cVar.f743i) && AbstractC0219i.a(fVar.b(), "value")) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof S3.a) {
                                    arrayList3.add(next);
                                }
                            }
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                ((List) cVar.f744j).add((InterfaceC0792b) ((S3.a) it2.next()).f2531a);
                            }
                            break;
                        }
                    } else {
                        HashMap map = (HashMap) cVar.f741g;
                        List listD = n4.k.d(arrayList2);
                        AbstractC0438v abstractC0438vD = c0843tF.d();
                        AbstractC0219i.d("parameter.type", abstractC0438vD);
                        map.put(fVar, new S3.w(listD, abstractC0438vD));
                        break;
                    }
                }
                break;
        }
    }

    @Override // G3.m
    public void n(N3.f fVar, Object obj) {
        ((G3.c) this.f6168e).n(fVar, obj);
    }

    @Override // G3.n
    public void n0(N3.b bVar, N3.f fVar) {
        ((ArrayList) this.f6168e).add(new S3.i(bVar, fVar));
    }

    @Override // G3.m
    public void o(N3.f fVar, S3.f fVar2) {
        ((G3.c) this.f6168e).o(fVar, fVar2);
    }

    @Override // I2.b
    public int onFinish() {
        return 0;
    }

    @Override // G3.m
    public G3.m p(N3.b bVar, N3.f fVar) {
        return ((G3.c) this.f6168e).p(bVar, fVar);
    }

    @Override // G3.m
    public void q(N3.f fVar, N3.b bVar, N3.f fVar2) {
        ((G3.c) this.f6168e).q(fVar, bVar, fVar2);
    }

    @Override // G3.m
    public G3.n r(N3.f fVar) {
        return ((G3.c) this.f6168e).r(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:3:0x000a, B:6:0x0011, B:32:0x006c, B:9:0x001a, B:12:0x0026, B:15:0x002d, B:17:0x0031, B:23:0x0040, B:31:0x0068, B:26:0x004d, B:27:0x0056, B:28:0x0060), top: B:36:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // I2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "failed to customEventReport"
            java.lang.Object r1 = r6.f6168e
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r6.f6170h
            J2.c r2 = (J2.c) r2
            boolean r3 = L2.a.b()     // Catch: java.lang.Exception -> L4b
            if (r3 == 0) goto L11
            return
        L11:
            java.lang.String r3 = r2.f1584b     // Catch: java.lang.Exception -> L4b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L4b
            if (r4 == 0) goto L1a
            goto L6c
        L1a:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L4b
            r4.<init>(r3)     // Catch: java.lang.Exception -> L4b
            boolean r3 = r4.isDirectory()     // Catch: java.lang.Exception -> L4b
            if (r3 != 0) goto L26
            goto L6c
        L26:
            java.io.File[] r3 = r4.listFiles()     // Catch: java.lang.Exception -> L4b
            if (r3 != 0) goto L2d
            goto L6c
        L2d:
            int r3 = r3.length     // Catch: java.lang.Exception -> L4b
            r4 = 1
            if (r3 < r4) goto L6c
            int r3 = L2.a.a(r1)     // Catch: java.lang.Exception -> L4b
            if (r3 == 0) goto L60
            java.lang.Object r5 = r6.f
            J2.a r5 = (J2.a) r5
            if (r3 == r4) goto L56
            r4 = 2
            if (r3 == r4) goto L4d
            java.lang.String r6 = "Exceptional case"
            J2.b.c0(r6)     // Catch: java.lang.Exception -> L4b
            java.lang.String r6 = "customEventReport is aborted"
            J2.b.c0(r6)     // Catch: java.lang.Exception -> L4b
            goto L65
        L4b:
            r6 = move-exception
            goto L72
        L4d:
            java.lang.Object r3 = r6.f6169g     // Catch: java.lang.Exception -> L4b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Exception -> L4b
            boolean r6 = r6.l(r1, r5, r2, r3)     // Catch: java.lang.Exception -> L4b
            goto L66
        L56:
            java.lang.String r3 = "LEGACY DMA"
            J2.b.k(r3)     // Catch: java.lang.Exception -> L4b
            boolean r6 = r6.k(r1, r5, r2)     // Catch: java.lang.Exception -> L4b
            goto L66
        L60:
            java.lang.String r6 = "not installed"
            J2.b.c0(r6)     // Catch: java.lang.Exception -> L4b
        L65:
            r6 = 0
        L66:
            if (r6 != 0) goto L81
            J2.b.c0(r0)     // Catch: java.lang.Exception -> L4b
            goto L81
        L6c:
            java.lang.String r6 = "You have to properly set LogPath"
            J2.b.c0(r6)     // Catch: java.lang.Exception -> L4b
            return
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            J2.b.c0(r6)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.run():void");
    }

    public i.g s(AbstractC0476b abstractC0476b) {
        ArrayList arrayList = (ArrayList) this.f6169g;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            i.g gVar = (i.g) arrayList.get(i5);
            if (gVar != null && gVar.f6873b == abstractC0476b) {
                return gVar;
            }
        }
        i.g gVar2 = new i.g((Context) this.f, abstractC0476b);
        arrayList.add(gVar2);
        return gVar2;
    }

    @Override // G3.n
    public void s0(Object obj) {
        ((ArrayList) this.f6168e).add(G3.d.b((G3.d) this.f, (N3.f) this.f6169g, obj));
    }

    public InterfaceC0761e t(N3.b bVar, List list) {
        AbstractC0219i.e("classId", bVar);
        return (InterfaceC0761e) ((d4.e) this.f6170h).d(new C0739A(bVar, list));
    }

    public boolean v(Context context) {
        if (((Boolean) this.f6169g) == null) {
            this.f6169g = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6169g).booleanValue();
    }

    public boolean w(Context context) {
        if (((Boolean) this.f) == null) {
            this.f = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f).booleanValue();
    }

    @Override // G3.n
    public void x(S3.f fVar) {
        ((ArrayList) this.f6168e).add(new S3.r(new S3.p(fVar)));
    }

    public boolean y(c4.s sVar) {
        AbstractC0219i.e("descriptor", sVar);
        if (!AbstractC0219i.a((c4.s) this.f, sVar)) {
            q qVar = (q) this.f6168e;
            if (!(qVar != null ? qVar.y(sVar) : false)) {
                return false;
            }
        }
        return true;
    }

    public Bundle z(J2.a aVar, J2.c cVar) throws JSONException {
        String str;
        String strValueOf = "";
        Bundle bundle = new Bundle();
        try {
            bundle.putString("serviceId", aVar.f1571b);
            bundle.putString("serviceVersion", aVar.f1572c);
            bundle.putString(DiagMon.Reporter.KEY_SERVICE_DEFINED_KEY, cVar.f1585c);
            bundle.putString(DiagMon.Reporter.KEY_ERROR_CODE, cVar.f1586d);
            bundle.putString("errorDesc", cVar.f1587e);
            bundle.putString("relayClientVersion", "");
            bundle.putString("relayClientType", "");
            bundle.putString("extension", "");
            bundle.putString(Preferences.PREFS_KEY_DID, aVar.f);
            bundle.putString("serviceAgreeType", L2.a.a(aVar.f1570a) == 1 ? (String) aVar.f1575g.f : aVar.f1573d);
            try {
                strValueOf = String.valueOf(BuildConfig.VERSION_CODE);
            } catch (Exception unused) {
            }
            bundle.putString("sdkVersion", strValueOf);
            Context context = (Context) this.f6168e;
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(ActivityManager.class)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "No";
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.importance == 100 && next.processName.equals(context.getPackageName())) {
                    str = "Yes";
                    break;
                }
            }
            bundle.putString("FOREGROUND", str);
            bundle.putString("sdkType", "S");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("VM", J2.c.c());
                jSONObject.put("NATIVE", J2.c.b());
                J2.b.k(jSONObject.toString());
            } catch (JSONException unused2) {
            }
            bundle.putString("memory", jSONObject.toString());
            bundle.putString("storage", J2.c.a().toString());
            J2.b.k("Generated EventObject");
            return bundle;
        } catch (Exception unused3) {
            return null;
        }
    }

    public q(C0306n c0306n, String str, String str2, H3 h3) {
        this.f6167d = 12;
        this.f6170h = c0306n;
        this.f6168e = str;
        this.f = str2;
        this.f6169g = h3;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f6167d = i5;
        this.f6168e = obj;
        this.f = obj2;
        this.f6169g = obj3;
        this.f6170h = obj4;
    }

    public q(int i5) {
        this.f6167d = i5;
        switch (i5) {
            case 1:
                this.f6168e = new C0704b();
                this.f = new SparseArray();
                this.f6169g = new C0707e();
                this.f6170h = new C0704b();
                break;
            case 19:
                this.f6168e = new I.c(10);
                this.f = new C0713k();
                this.f6169g = new ArrayList();
                this.f6170h = new HashSet();
                break;
            default:
                this.f6168e = null;
                this.f = null;
                this.f6169g = null;
                this.f6170h = new ArrayDeque();
                break;
        }
    }

    public q(String str, String str2, String str3) {
        this.f6167d = 14;
        AbstractC0203C.c(EternalContract.DEVICE_TYPE_PHONE);
        this.f6168e = EternalContract.DEVICE_TYPE_PHONE;
        AbstractC0203C.c(str);
        this.f = str;
        this.f6169g = str2;
        this.f6170h = str3;
    }

    public q(d4.o oVar, InterfaceC0781y interfaceC0781y) {
        this.f6167d = 17;
        AbstractC0219i.e("storageManager", oVar);
        AbstractC0219i.e("module", interfaceC0781y);
        this.f6168e = oVar;
        this.f = interfaceC0781y;
        d4.l lVar = (d4.l) oVar;
        this.f6169g = lVar.b(new C0741C(this, 1));
        this.f6170h = lVar.b(new C0741C(this, 0));
    }

    public q(I3.E e5, E0.d dVar, J3.a aVar, B3.d dVar2) {
        this.f6167d = 8;
        this.f6168e = dVar;
        this.f = aVar;
        this.f6169g = dVar2;
        List list = e5.f981j;
        AbstractC0219i.d("proto.class_List", list);
        int iG0 = P2.z.g0(P2.o.l0(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0 < 16 ? 16 : iG0);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC0415a.m((E0.d) this.f6168e, ((C0028j) obj).f1289h), obj);
        }
        this.f6170h = linkedHashMap;
    }

    public q(J2.a aVar, Bundle bundle, J2.c cVar) {
        this.f6167d = 6;
        this.f6168e = aVar.f1570a;
        this.f = aVar;
        this.f6169g = bundle;
        this.f6170h = cVar;
    }

    public q(y.p pVar) {
        this.f6167d = 20;
        new ArrayList();
        Bundle bundle = new Bundle();
        this.f6170h = bundle;
        this.f6169g = pVar;
        Context context = pVar.f9329a;
        this.f6168e = context;
        Notification.Builder builderA = y.u.a(context, pVar.f9343q);
        this.f = builderA;
        Notification notification = pVar.f9345s;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.f9333e).setContentText(pVar.f).setContentInfo(null).setContentIntent(pVar.f9334g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(pVar.f9336i).setProgress(0, 0, false);
        IconCompat iconCompat = pVar.f9335h;
        y.s.b(builderA, iconCompat == null ? null : C.c.c(iconCompat, context));
        builderA.setSubText(null).setUsesChronometer(false).setPriority(pVar.f9337j);
        Iterator it = pVar.f9330b.iterator();
        if (!it.hasNext()) {
            Bundle bundle2 = pVar.n;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            builderA.setShowWhen(pVar.f9338k);
            y.q.i(builderA, pVar.f9340m);
            y.q.g(builderA, null);
            y.q.j(builderA, null);
            y.q.h(builderA, false);
            y.r.b(builderA, null);
            y.r.c(builderA, pVar.f9341o);
            y.r.f(builderA, pVar.f9342p);
            y.r.d(builderA, null);
            y.r.e(builderA, notification.sound, notification.audioAttributes);
            ArrayList arrayList = pVar.f9346t;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    y.r.a((Notification.Builder) this.f, (String) it2.next());
                }
            }
            ArrayList arrayList2 = pVar.f9332d;
            if (arrayList2.size() > 0) {
                if (pVar.n == null) {
                    pVar.n = new Bundle();
                }
                Bundle bundle3 = pVar.n.getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                if (arrayList2.size() <= 0) {
                    bundle3.putBundle("invisible_actions", bundle5);
                    bundle4.putBundle("invisible_actions", bundle5);
                    if (pVar.n == null) {
                        pVar.n = new Bundle();
                    }
                    pVar.n.putBundle("android.car.EXTENSIONS", bundle3);
                    ((Bundle) this.f6170h).putBundle("android.car.EXTENSIONS", bundle4);
                } else {
                    Integer.toString(0);
                    y.j jVar = (y.j) arrayList2.get(0);
                    Bundle bundle6 = new Bundle();
                    jVar.getClass();
                    bundle6.putInt("icon", 0);
                    bundle6.putCharSequence("title", null);
                    throw null;
                }
            }
            ((Notification.Builder) this.f).setExtras(pVar.n);
            y.t.e((Notification.Builder) this.f, null);
            y.u.b((Notification.Builder) this.f, 0);
            y.u.e((Notification.Builder) this.f, null);
            y.u.f((Notification.Builder) this.f, null);
            y.u.g((Notification.Builder) this.f, 0L);
            y.u.d((Notification.Builder) this.f, 0);
            if (!TextUtils.isEmpty(pVar.f9343q)) {
                ((Notification.Builder) this.f).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
            Iterator it3 = pVar.f9331c.iterator();
            if (!it3.hasNext()) {
                y.v.a((Notification.Builder) this.f, pVar.f9344r);
                y.v.b((Notification.Builder) this.f, null);
                return;
            } else {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        ((y.j) it.next()).getClass();
        throw null;
    }

    public q(Typeface typeface, W.b bVar) {
        int i5;
        int i6;
        this.f6167d = 9;
        this.f6170h = typeface;
        this.f6168e = bVar;
        this.f6169g = new androidx.emoji2.text.p(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i7 = iA + bVar.f1415a;
            i5 = ((ByteBuffer) bVar.f1418d).getInt(((ByteBuffer) bVar.f1418d).getInt(i7) + i7);
        } else {
            i5 = 0;
        }
        this.f = new char[i5 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i8 = iA2 + bVar.f1415a;
            i6 = ((ByteBuffer) bVar.f1418d).getInt(((ByteBuffer) bVar.f1418d).getInt(i8) + i8);
        } else {
            i6 = 0;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            androidx.emoji2.text.l lVar = new androidx.emoji2.text.l(this, i9);
            W.a aVarC = lVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f1418d).getInt(iA3 + aVarC.f1415a) : 0, (char[]) this.f, i9 * 2);
            g3.y.f("invalid metadata codepoint length", lVar.b() > 0);
            ((androidx.emoji2.text.p) this.f6169g).a(lVar, 0, lVar.b() - 1);
        }
    }

    public q(E0.d dVar, G3.p pVar) {
        this.f6167d = 3;
        this.f6170h = dVar;
        this.f6167d = 3;
        this.f6169g = dVar;
        this.f6168e = pVar;
        this.f = new ArrayList();
    }

    public q(Context context, ActionMode.Callback callback) {
        this.f6167d = 16;
        this.f = context;
        this.f6168e = callback;
        this.f6169g = new ArrayList();
        this.f6170h = new C0713k();
    }

    public q(G3.d dVar, N3.f fVar, G3.c cVar) {
        this.f6167d = 5;
        this.f = dVar;
        this.f6169g = fVar;
        this.f6170h = cVar;
        this.f6168e = new ArrayList();
    }

    public q(G3.c cVar, q qVar, ArrayList arrayList) {
        this.f6167d = 4;
        this.f = cVar;
        this.f6169g = qVar;
        this.f6170h = arrayList;
        this.f6168e = cVar;
    }

    public q(c4.i iVar) {
        this.f6167d = 10;
        this.f6170h = iVar;
        List list = iVar.f5159h.f1303w;
        AbstractC0219i.d("classProto.enumEntryList", list);
        int iG0 = P2.z.g0(P2.o.l0(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0 < 16 ? 16 : iG0);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC0415a.x((K3.f) iVar.f5165o.f3059e, ((C0037t) obj).f1352g), obj);
        }
        this.f6168e = linkedHashMap;
        c4.i iVar2 = (c4.i) this.f6170h;
        this.f = ((d4.l) ((a4.i) iVar2.f5165o.f3058d).f3037a).c(new C3.q(this, 6, iVar2));
        d4.o oVar = ((a4.i) ((c4.i) this.f6170h).f5165o.f3058d).f3037a;
        C0012d c0012d = new C0012d(11, this);
        d4.l lVar = (d4.l) oVar;
        lVar.getClass();
        this.f6169g = new d4.i(lVar, c0012d);
    }

    public q(ViewPager2 viewPager2) {
        this.f6167d = 2;
        this.f6170h = viewPager2;
        this.f6168e = new G0.k(this, 0);
        this.f = new G0.k(this, 1);
    }
}
