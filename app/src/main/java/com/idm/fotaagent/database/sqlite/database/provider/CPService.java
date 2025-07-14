package com.idm.fotaagent.database.sqlite.database.provider;

import android.content.ContentValues;
import android.database.Cursor;

/* loaded from: classes.dex */
public interface CPService {
    Cursor query();

    int update(ContentValues contentValues);
}
