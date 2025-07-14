package com.idm.fotaagent.database.room.data.dao;

import androidx.lifecycle.C;
import com.idm.fotaagent.database.room.data.entity.InjectedFeature;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public abstract class InjectedFeatureDao implements CategoryNameValueDao<InjectedFeature> {
    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract int delete(String str, String str2);

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract int deleteAll(String str);

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract void deleteCategories(String... strArr);

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract List<InjectedFeature> getAllEntitiesOf(String str);

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract C getEntityLiveDataOf(String str, String str2);

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract Optional<InjectedFeature> getEntityOf(String str, String str2);

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public long insertOrReplace(String str, String str2, Serializable serializable) {
        return insertOrReplace(new InjectedFeature(str, str2, serializable));
    }

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public abstract int size(String str);
}
