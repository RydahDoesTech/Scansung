package v0;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9213a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9214b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9215c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9216d;

    public e(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f9213a = str;
        this.f9214b = Collections.unmodifiableMap(map);
        this.f9215c = Collections.unmodifiableSet(hashSet);
        this.f9216d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        int i5;
        int i6;
        ArrayList arrayList;
        int i7;
        Cursor cursorI = supportSQLiteDatabase.i("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorI.getColumnCount() > 0) {
                int columnIndex = cursorI.getColumnIndex("name");
                int columnIndex2 = cursorI.getColumnIndex("type");
                int columnIndex3 = cursorI.getColumnIndex("notnull");
                int columnIndex4 = cursorI.getColumnIndex("pk");
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(columnIndex);
                    map.put(string, new a(cursorI.getInt(columnIndex4), string, cursorI.getString(columnIndex2), cursorI.getInt(columnIndex3) != 0));
                }
            }
            cursorI.close();
            HashSet hashSet = new HashSet();
            cursorI = supportSQLiteDatabase.i("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex5 = cursorI.getColumnIndex("id");
                int columnIndex6 = cursorI.getColumnIndex("seq");
                int columnIndex7 = cursorI.getColumnIndex("table");
                int columnIndex8 = cursorI.getColumnIndex("on_delete");
                int columnIndex9 = cursorI.getColumnIndex("on_update");
                ArrayList arrayListB = b(cursorI);
                int count = cursorI.getCount();
                int i8 = 0;
                while (i8 < count) {
                    cursorI.moveToPosition(i8);
                    if (cursorI.getInt(columnIndex6) != 0) {
                        i5 = columnIndex5;
                        i6 = columnIndex6;
                        arrayList = arrayListB;
                        i7 = count;
                    } else {
                        int i9 = cursorI.getInt(columnIndex5);
                        i5 = columnIndex5;
                        ArrayList arrayList2 = new ArrayList();
                        i6 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayListB.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = arrayListB;
                            c cVar = (c) it.next();
                            int i10 = count;
                            if (cVar.f9207d == i9) {
                                arrayList2.add(cVar.f);
                                arrayList3.add(cVar.f9209g);
                            }
                            arrayListB = arrayList4;
                            count = i10;
                        }
                        arrayList = arrayListB;
                        i7 = count;
                        hashSet.add(new b(cursorI.getString(columnIndex7), cursorI.getString(columnIndex8), cursorI.getString(columnIndex9), arrayList2, arrayList3));
                    }
                    i8++;
                    columnIndex5 = i5;
                    columnIndex6 = i6;
                    arrayListB = arrayList;
                    count = i7;
                }
                cursorI.close();
                cursorI = supportSQLiteDatabase.i("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex10 = cursorI.getColumnIndex("name");
                    int columnIndex11 = cursorI.getColumnIndex("origin");
                    int columnIndex12 = cursorI.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex10 == -1 || columnIndex11 == -1 || columnIndex12 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorI.moveToNext()) {
                        if ("c".equals(cursorI.getString(columnIndex11))) {
                            d dVarC = c(supportSQLiteDatabase, cursorI.getString(columnIndex10), cursorI.getInt(columnIndex12) == 1);
                            if (dVarC == null) {
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    cursorI.close();
                    hashSet2 = hashSet3;
                    return new e(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < count; i5++) {
            cursor.moveToPosition(i5);
            arrayList.add(new c(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getString(columnIndex4), cursor.getInt(columnIndex2)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z4) {
        Cursor cursorI = supportSQLiteDatabase.i("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorI.getColumnIndex("seqno");
            int columnIndex2 = cursorI.getColumnIndex("cid");
            int columnIndex3 = cursorI.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorI.moveToNext()) {
                    if (cursorI.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorI.getInt(columnIndex)), cursorI.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, arrayList, z4);
                cursorI.close();
                return dVar;
            }
            cursorI.close();
            return null;
        } catch (Throwable th) {
            cursorI.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = eVar.f9213a;
        String str2 = this.f9213a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = eVar.f9214b;
        Map map2 = this.f9214b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = eVar.f9215c;
        Set set3 = this.f9215c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f9216d;
        if (set4 == null || (set = eVar.f9216d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f9213a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f9214b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f9215c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f9213a + "', columns=" + this.f9214b + ", foreignKeys=" + this.f9215c + ", indices=" + this.f9216d + '}';
    }
}
