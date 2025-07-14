package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import androidx.lifecycle.C;
import com.idm.fotaagent.database.room.data.dao.PropertyDao;
import com.idm.fotaagent.database.room.data.entity.Property;
import com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public class PropertyRepository extends CategoryNameValueRepository<Property, PropertyDao> {

    public static class SpecificCategory extends CategoryNameValueRepository.SpecificCategory<Property, PropertyDao> {
        public SpecificCategory(FotaRoomDatabase fotaRoomDatabase, String str) {
            super(fotaRoomDatabase, fotaRoomDatabase.propertyDao(), str);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ int delete(String str) {
            return super.delete(str);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ int deleteAll() {
            return super.deleteAll();
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ List getAllEntities() {
            return super.getAllEntities();
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ C getLiveDataValueOf(String str, Serializable serializable) {
            return super.getLiveDataValueOf(str, serializable);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ Optional getValueOf(String str) {
            return super.getValueOf(str);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ long insertOrReplace(String str, Serializable serializable) {
            return super.insertOrReplace(str, serializable);
        }

        public long insertOrReplaceWithoutException(String str, Serializable serializable) {
            try {
                return insertOrReplace(str, serializable);
            } catch (IOException e5) {
                Log.printStackTrace(e5);
                try {
                    return this.insertOrReplace(str, serializable);
                } catch (IOException e6) {
                    Log.printStackTrace(e6);
                    return -1L;
                }
            }
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        public <V extends Serializable> V getValueOf(String str, V v2) {
            return (V) getValueOf(str).orElse(v2);
        }
    }

    public PropertyRepository(FotaRoomDatabase fotaRoomDatabase) {
        super(fotaRoomDatabase, fotaRoomDatabase.propertyDao());
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ int delete(String str, String str2) {
        return super.delete(str, str2);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ int deleteAll(String str) {
        return super.deleteAll(str);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository
    public /* bridge */ /* synthetic */ void deleteCategories(String[] strArr) {
        super.deleteCategories(strArr);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ List getAllEntitiesOf(String str) {
        return super.getAllEntitiesOf(str);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ C getLiveDataValueOf(String str, String str2, Serializable serializable) {
        return super.getLiveDataValueOf(str, str2, serializable);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ Optional getValueOf(String str, String str2) {
        return super.getValueOf(str, str2);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ long insertOrReplace(String str, String str2, Serializable serializable) {
        return super.insertOrReplace(str, str2, serializable);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public /* bridge */ /* synthetic */ int size(String str) {
        return super.size(str);
    }

    public PropertyRepository(Context context) {
        this(FotaRoomDatabase.get(context));
    }
}
