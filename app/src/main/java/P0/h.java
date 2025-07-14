package P0;

import a2.s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.FirebaseCommonRegistrar;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.ucm.configurator.UniversalCredentialManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements R0.b, Q0.f, a2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2127e;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.f2127e = obj;
        this.f2126d = obj2;
    }

    @Override // Q0.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Q0.h hVar = (Q0.h) this.f2127e;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        K0.b bVar = (K0.b) this.f2126d;
        Long lH = Q0.h.h(sQLiteDatabase, bVar);
        if (lH != null) {
            Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, "inline"}, "context_id = ?", new String[]{lH.toString()}, null, null, null, String.valueOf(hVar.f2290g.f2275b));
            try {
                new O0.b(hVar, arrayList, bVar).apply(cursorQuery);
            } finally {
                cursorQuery.close();
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            sb.append(((Q0.b) arrayList.get(i5)).f2279a);
            if (i5 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery2 = sQLiteDatabase.query("event_metadata", new String[]{UniversalCredentialManager.BUNDLE_EXTRA_EVENT_ID, "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery2.moveToNext()) {
            try {
                long j5 = cursorQuery2.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j5));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j5), hashSet);
                }
                hashSet.add(new Q0.g(cursorQuery2.getString(1), cursorQuery2.getString(2)));
            } catch (Throwable th) {
                cursorQuery2.close();
                throw th;
            }
        }
        cursorQuery2.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Q0.b bVar2 = (Q0.b) listIterator.next();
            if (map.containsKey(Long.valueOf(bVar2.f2279a))) {
                G3.d dVarC = bVar2.f2281c.c();
                long j6 = bVar2.f2279a;
                for (Q0.g gVar : (Set) map.get(Long.valueOf(j6))) {
                    dVarC.c(gVar.f2285a, gVar.f2286b);
                }
                listIterator.set(new Q0.b(j6, bVar2.f2280b, dVarC.e()));
            }
        }
        return arrayList;
    }

    @Override // R0.b
    public Object execute() {
        Q0.h hVar = (Q0.h) ((j) this.f2127e).f2134c;
        hVar.getClass();
        return (Iterable) hVar.l(new h(hVar, (K0.b) this.f2126d));
    }

    @Override // a2.e
    public Object j(s sVar) {
        String strValueOf;
        Context context = (Context) sVar.a(Context.class);
        switch (((C2.a) this.f2126d).f348d) {
            case 11:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    strValueOf = "";
                    break;
                } else {
                    strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
            case 12:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 == null) {
                    strValueOf = "";
                    break;
                } else {
                    strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                    break;
                }
            case 13:
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                strValueOf = "";
                                break;
                            } else {
                                strValueOf = "embedded";
                                break;
                            }
                        } else {
                            strValueOf = "auto";
                            break;
                        }
                    } else {
                        strValueOf = "watch";
                        break;
                    }
                } else {
                    strValueOf = "tv";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    strValueOf = "";
                    break;
                } else {
                    strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                    break;
                }
        }
        return new r2.a((String) this.f2127e, strValueOf);
    }
}
