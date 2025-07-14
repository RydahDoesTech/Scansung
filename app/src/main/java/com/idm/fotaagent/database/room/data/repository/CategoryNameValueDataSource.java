package com.idm.fotaagent.database.room.data.repository;

import androidx.lifecycle.C;
import com.idm.fotaagent.database.room.data.entity.CategoryNameValue;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public interface CategoryNameValueDataSource<E extends CategoryNameValue> {

    public interface SpecificCategory<E extends CategoryNameValue> {
        int delete(String str);

        int deleteAll();

        List<E> getAllEntities();

        <V extends Serializable> C getLiveDataValueOf(String str, Serializable serializable);

        <V extends Serializable> Optional<V> getValueOf(String str);

        long insertOrReplace(String str, Serializable serializable);

        int size();
    }

    int delete(String str, String str2);

    int deleteAll(String str);

    List<E> getAllEntitiesOf(String str);

    <V extends Serializable> C getLiveDataValueOf(String str, String str2, Serializable serializable);

    <V extends Serializable> Optional<V> getValueOf(String str, String str2);

    long insertOrReplace(String str, String str2, Serializable serializable);

    int size(String str);
}
