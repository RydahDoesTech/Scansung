package com.idm.fotaagent.database.sqlite.database.dao;

import android.database.Cursor;
import com.idm.fotaagent.database.sqlite.database.dao.Dao;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Dao.Getter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6272a;

    public /* synthetic */ b(int i5) {
        this.f6272a = i5;
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao.Getter
    public final Object getAt(Cursor cursor, int i5) {
        switch (this.f6272a) {
            case 0:
                return cursor.getString(i5);
            case 1:
                return Dao.lambda$getCount$1(cursor, i5);
            case 2:
                return Integer.valueOf(cursor.getInt(i5));
            case 3:
                return Dao.lambda$getCount$0(cursor, i5);
            default:
                return Long.valueOf(cursor.getLong(i5));
        }
    }
}
