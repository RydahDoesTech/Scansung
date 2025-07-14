package O0;

import K0.e;
import Q0.f;
import Q0.h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.ucm.configurator.UniversalCredentialManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements R0.b, f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K0.b f1905e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1906g;

    public /* synthetic */ b(h hVar, ArrayList arrayList, K0.b bVar) {
        this.f1904d = 2;
        this.f1906g = hVar;
        this.f = arrayList;
        this.f1905e = bVar;
    }

    @Override // Q0.f
    public Object apply(Object obj) {
        long jInsert;
        switch (this.f1904d) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h hVar = (h) this.f1906g;
                long jSimpleQueryForLong = hVar.g().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.g().compileStatement("PRAGMA page_count").simpleQueryForLong();
                Q0.a aVar = hVar.f2290g;
                if (jSimpleQueryForLong >= aVar.f2274a) {
                    return -1L;
                }
                K0.b bVar = this.f1905e;
                Long lH = h.h(sQLiteDatabase, bVar);
                if (lH != null) {
                    jInsert = lH.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", bVar.f1623a);
                    contentValues.put("priority", Integer.valueOf(T0.a.a(bVar.f1625c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = bVar.f1624b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                K0.a aVar2 = (K0.a) this.f;
                e eVar = aVar2.f1620c;
                byte[] bArr2 = eVar.f1632b;
                int length = bArr2.length;
                int i5 = aVar.f2278e;
                boolean z4 = length <= i5;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", aVar2.f1618a);
                contentValues2.put("timestamp_ms", Long.valueOf(aVar2.f1621d));
                contentValues2.put("uptime_ms", Long.valueOf(aVar2.f1622e));
                contentValues2.put("payload_encoding", eVar.f1631a.f805a);
                contentValues2.put(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, aVar2.f1619b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z4));
                contentValues2.put("payload", z4 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z4) {
                    int iCeil = (int) Math.ceil(bArr2.length / i5);
                    for (int i6 = 1; i6 <= iCeil; i6++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i6 - 1) * i5, Math.min(i6 * i5, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(UniversalCredentialManager.BUNDLE_EXTRA_EVENT_ID, Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i6));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(aVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put(UniversalCredentialManager.BUNDLE_EXTRA_EVENT_ID, Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                Cursor cursor = (Cursor) obj;
                h hVar2 = (h) this.f1906g;
                hVar2.getClass();
                while (cursor.moveToNext()) {
                    long j5 = cursor.getLong(0);
                    boolean z5 = cursor.getInt(7) != 0;
                    G3.d dVar = new G3.d();
                    dVar.f750i = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    dVar.f746d = string;
                    dVar.f748g = Long.valueOf(cursor.getLong(2));
                    dVar.f749h = Long.valueOf(cursor.getLong(3));
                    if (z5) {
                        String string2 = cursor.getString(4);
                        dVar.f = new e(string2 == null ? h.f2287h : new H0.b(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        H0.b bVar2 = string3 == null ? h.f2287h : new H0.b(string3);
                        Cursor cursorQuery = hVar2.g().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j5)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                            }
                            byte[] bArr3 = new byte[length2];
                            int length3 = 0;
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                byte[] bArr4 = (byte[]) arrayList.get(i7);
                                System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                length3 += bArr4.length;
                            }
                            cursorQuery.close();
                            dVar.f = new e(bVar2, bArr3);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        dVar.f747e = Integer.valueOf(cursor.getInt(6));
                    }
                    ((ArrayList) this.f).add(new Q0.b(j5, this.f1905e, dVar.e()));
                }
                return null;
        }
    }

    @Override // R0.b
    public Object execute() {
        c cVar = (c) this.f1906g;
        h hVar = (h) cVar.f1910d;
        hVar.getClass();
        K0.b bVar = this.f1905e;
        K0.a aVar = (K0.a) this.f;
        Log.d("TransportRuntime.".concat("SQLiteEventStore"), "Storing event with priority=" + bVar.f1625c + ", name=" + aVar.f1618a + " for destination " + bVar.f1623a);
        ((Long) hVar.l(new b(hVar, bVar, aVar, 1))).getClass();
        cVar.f1907a.a(bVar, 1, false);
        return null;
    }

    public /* synthetic */ b(Object obj, K0.b bVar, K0.a aVar, int i5) {
        this.f1904d = i5;
        this.f1906g = obj;
        this.f1905e = bVar;
        this.f = aVar;
    }
}
