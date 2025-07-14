package P0;

import J0.l;
import J0.n;
import J0.t;
import J0.u;
import J0.w;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.samsung.android.knox.ex.KnoxContract;
import com.samsung.android.lib.episode.EternalContract;
import e1.AbstractC0415a;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final L0.f f2133b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0.c f2134c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2135d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f2136e;
    public final R0.c f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.a f2137g;

    public j(Context context, L0.f fVar, Q0.c cVar, d dVar, Executor executor, R0.c cVar2, S0.a aVar) {
        this.f2132a = context;
        this.f2133b = fVar;
        this.f2134c = cVar;
        this.f2135d = dVar;
        this.f2136e = executor;
        this.f = cVar2;
        this.f2137g = aVar;
    }

    public final void a(final K0.b bVar, final int i5) {
        L0.a aVar;
        String str;
        I0.d dVarA;
        String str2;
        Integer numValueOf;
        G3.c cVar;
        int i6 = 0;
        L0.g gVarA = this.f2133b.a(bVar.f1623a);
        h hVar = new h(this, bVar);
        Q0.h hVar2 = (Q0.h) this.f;
        final Iterable iterable = (Iterable) hVar2.m(hVar);
        if (iterable.iterator().hasNext()) {
            if (gVarA == null) {
                AbstractC0415a.h("Uploader", "Unknown backend for %s, deleting event batch for it...", bVar);
                aVar = new L0.a(3, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Q0.b) it.next()).f2281c);
                }
                I0.e eVar = (I0.e) gVarA;
                HashMap map = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    K0.a aVar2 = (K0.a) it2.next();
                    String str3 = aVar2.f1618a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(aVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(aVar2);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    K0.a aVar3 = (K0.a) ((List) entry.getValue()).get(i6);
                    w wVar = w.f1568d;
                    long jA = eVar.f.a();
                    long jA2 = eVar.f865e.a();
                    J0.j jVar = new J0.j(new J0.h(Integer.valueOf(aVar3.b("sdk-version")), aVar3.a("model"), aVar3.a("hardware"), aVar3.a(KnoxContract.Config.Device.ID), aVar3.a("product"), aVar3.a("os-uild"), aVar3.a(EternalContract.EXTRA_MANUFACTURER), aVar3.a("fingerprint"), aVar3.a("locale"), aVar3.a("country"), aVar3.a("mcc_mnc"), aVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (K0.a aVar4 : (List) entry.getValue()) {
                        K0.e eVar2 = aVar4.f1620c;
                        H0.b bVar2 = eVar2.f1631a;
                        boolean zEquals = bVar2.equals(new H0.b("proto"));
                        byte[] bArr = eVar2.f1632b;
                        if (zEquals) {
                            cVar = new G3.c();
                            cVar.f742h = bArr;
                        } else if (bVar2.equals(new H0.b("json"))) {
                            String str4 = new String(bArr, Charset.forName("UTF-8"));
                            G3.c cVar2 = new G3.c();
                            cVar2.f743i = str4;
                            cVar = cVar2;
                        } else {
                            Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + bVar2 + ". Skipping...");
                        }
                        cVar.f740e = Long.valueOf(aVar4.f1621d);
                        cVar.f741g = Long.valueOf(aVar4.f1622e);
                        String str5 = (String) aVar4.f.get("tz-offset");
                        cVar.f744j = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        cVar.f745k = new n((u) u.f1566d.get(aVar4.b("net-type")), (t) t.f1564d.get(aVar4.b("mobile-subtype")));
                        Integer num = aVar4.f1619b;
                        if (num != null) {
                            cVar.f = num;
                        }
                        String strC = ((Long) cVar.f740e) == null ? " eventTimeMs" : "";
                        if (((Long) cVar.f741g) == null) {
                            strC = strC.concat(" eventUptimeMs");
                        }
                        if (((Long) cVar.f744j) == null) {
                            strC = g4.f.c(strC, " timezoneOffsetSeconds");
                        }
                        if (!strC.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strC));
                        }
                        arrayList4.add(new J0.k(((Long) cVar.f740e).longValue(), (Integer) cVar.f, ((Long) cVar.f741g).longValue(), (byte[]) cVar.f742h, (String) cVar.f743i, ((Long) cVar.f744j).longValue(), (n) cVar.f745k));
                    }
                    arrayList3.add(new l(jA, jA2, jVar, numValueOf, str2, arrayList4));
                    i6 = 0;
                }
                J0.i iVar = new J0.i(arrayList3);
                byte[] bArr2 = bVar.f1624b;
                URL urlB = eVar.f864d;
                if (bArr2 != null) {
                    try {
                        I0.a aVarA = I0.a.a(bArr2);
                        str = aVarA.f852b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f851a;
                        if (str6 != null) {
                            urlB = I0.e.b(str6);
                        }
                    } catch (IllegalArgumentException unused2) {
                        aVar = new L0.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    I0.c cVar3 = new I0.c(urlB, iVar, str);
                    I0.b bVar3 = new I0.b(0, eVar);
                    int i7 = 5;
                    do {
                        dVarA = bVar3.a(cVar3);
                        URL url = (URL) dVarA.f860c;
                        if (url != null) {
                            AbstractC0415a.h("CctTransportBackend", "Following redirect to: %s", url);
                            cVar3 = new I0.c(url, cVar3.f856b, cVar3.f857c);
                        } else {
                            cVar3 = null;
                        }
                        if (cVar3 == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = dVarA.f858a;
                    aVar = i8 == 200 ? new L0.a(1, dVarA.f859b) : (i8 >= 500 || i8 == 404) ? new L0.a(2, -1L) : new L0.a(3, -1L);
                } catch (IOException e5) {
                    Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e5);
                    aVar = new L0.a(2, -1L);
                }
            }
            final L0.a aVar5 = aVar;
            hVar2.m(new R0.b() { // from class: P0.i
                @Override // R0.b
                public final Object execute() {
                    SQLiteDatabase sQLiteDatabaseG;
                    Boolean bool;
                    j jVar2 = this.f2128d;
                    jVar2.getClass();
                    L0.a aVar6 = aVar5;
                    Iterable iterable2 = iterable;
                    final K0.b bVar4 = bVar;
                    int i9 = aVar6.f1698a;
                    d dVar = jVar2.f2135d;
                    Q0.c cVar4 = jVar2.f2134c;
                    if (i9 == 2) {
                        Q0.h hVar3 = (Q0.h) cVar4;
                        hVar3.getClass();
                        if (iterable2.iterator().hasNext()) {
                            String str7 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Q0.h.n(iterable2);
                            sQLiteDatabaseG = hVar3.g();
                            sQLiteDatabaseG.beginTransaction();
                            try {
                                sQLiteDatabaseG.compileStatement(str7).execute();
                                sQLiteDatabaseG.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseG.setTransactionSuccessful();
                            } finally {
                            }
                        }
                        dVar.a(bVar4, i5 + 1, false);
                        return null;
                    }
                    Q0.h hVar4 = (Q0.h) cVar4;
                    hVar4.getClass();
                    if (iterable2.iterator().hasNext()) {
                        hVar4.g().compileStatement("DELETE FROM events WHERE _id in " + Q0.h.n(iterable2)).execute();
                    }
                    if (i9 == 1) {
                        final long jA3 = jVar2.f2137g.a() + aVar6.f1699b;
                        hVar4.l(new Q0.f() { // from class: Q0.e
                            @Override // Q0.f
                            public final Object apply(Object obj) {
                                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("next_request_ms", Long.valueOf(jA3));
                                K0.b bVar5 = bVar4;
                                String str8 = bVar5.f1623a;
                                H0.c cVar5 = bVar5.f1625c;
                                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str8, String.valueOf(T0.a.a(cVar5))}) < 1) {
                                    contentValues.put("backend_name", bVar5.f1623a);
                                    contentValues.put("priority", Integer.valueOf(T0.a.a(cVar5)));
                                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                                }
                                return null;
                            }
                        });
                    }
                    sQLiteDatabaseG = hVar4.g();
                    sQLiteDatabaseG.beginTransaction();
                    try {
                        Long lH = Q0.h.h(sQLiteDatabaseG, bVar4);
                        if (lH == null) {
                            bool = Boolean.FALSE;
                        } else {
                            Cursor cursorRawQuery = hVar4.g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH.toString()});
                            try {
                                Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                cursorRawQuery.close();
                                bool = boolValueOf;
                            } catch (Throwable th) {
                                cursorRawQuery.close();
                                throw th;
                            }
                        }
                        sQLiteDatabaseG.setTransactionSuccessful();
                        sQLiteDatabaseG.endTransaction();
                        if (!bool.booleanValue()) {
                            return null;
                        }
                        dVar.a(bVar4, 1, true);
                        return null;
                    } finally {
                    }
                }
            });
        }
    }
}
