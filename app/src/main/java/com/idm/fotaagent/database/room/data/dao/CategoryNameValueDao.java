package com.idm.fotaagent.database.room.data.dao;

import android.content.ContentValues;
import androidx.lifecycle.C;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.idm.fotaagent.database.room.data.entity.CategoryNameValue;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public interface CategoryNameValueDao<E extends CategoryNameValue> {
    static long insertOrReplace(SupportSQLiteDatabase supportSQLiteDatabase, CategoryNameValue categoryNameValue) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CategoryNameValue.COLUMN_CATEGORY, categoryNameValue.getCategory());
        contentValues.put("name", categoryNameValue.getName());
        contentValues.put("value", categoryNameValue.getValue());
        contentValues.put(CategoryNameValue.COLUMN_VALUE_STRING, categoryNameValue.valueString);
        return supportSQLiteDatabase.k(categoryNameValue.getTableName(), contentValues);
    }

    int delete(String str, String str2);

    int deleteAll(String str);

    void deleteCategories(String... strArr);

    List<E> getAllEntitiesOf(String str);

    C getEntityLiveDataOf(String str, String str2);

    Optional<E> getEntityOf(String str, String str2);

    long insertOrReplace(E e5);

    long insertOrReplace(String str, String str2, Serializable serializable);

    int size(String str);
}
