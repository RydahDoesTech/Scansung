package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import androidx.lifecycle.C;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao;
import com.idm.fotaagent.database.room.data.entity.InjectedFeature;
import com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class InjectedFeatureRepository implements CategoryNameValueDataSource<InjectedFeature> {

    public static class PersistentDataSource extends CategoryNameValueRepository<InjectedFeature, InjectedFeatureDao> {
        public PersistentDataSource(Context context) {
            super(FotaRoomDatabase.get(context), FotaRoomDatabase.get(context).injectedFeatureDao());
        }
    }

    public static class SpecificCategory implements CategoryNameValueDataSource.SpecificCategory<InjectedFeature> {
        private static final CategoryNameValueDataSource<InjectedFeature> PERSISTENT_DATA_SOURCE = new PersistentDataSource(IDMApplication.idmGetContext());
        private static final Map<String, SpecificCategory> REPOSITORIES = new ConcurrentHashMap();
        private final Map<String, Serializable> cache = new ConcurrentHashMap();
        private final String category;

        private SpecificCategory(String str) {
            this.category = str;
            for (E e5 : PERSISTENT_DATA_SOURCE.getAllEntitiesOf(str)) {
                try {
                    this.cache.put(e5.getName(), e5.getDeserializedValue());
                } catch (RuntimeException e6) {
                    Log.printStackTrace(e6);
                }
            }
        }

        public static SpecificCategory get(String str) {
            Map<String, SpecificCategory> map = REPOSITORIES;
            SpecificCategory specificCategory = map.get(str);
            if (specificCategory != null) {
                return specificCategory;
            }
            SpecificCategory specificCategory2 = new SpecificCategory(str);
            SpecificCategory specificCategoryPutIfAbsent = map.putIfAbsent(str, specificCategory2);
            return specificCategoryPutIfAbsent == null ? specificCategory2 : specificCategoryPutIfAbsent;
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public int delete(String str) {
            Log.V("previous: " + this.cache.remove(str));
            return PERSISTENT_DATA_SOURCE.delete(this.category, str);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public int deleteAll() {
            this.cache.clear();
            return PERSISTENT_DATA_SOURCE.deleteAll(this.category);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public List<InjectedFeature> getAllEntities() {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Serializable> entry : this.cache.entrySet()) {
                try {
                    arrayList.add(new InjectedFeature(this.category, entry.getKey(), entry.getValue()));
                } catch (IOException e5) {
                    Log.printStackTrace(e5);
                }
            }
            return arrayList;
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public <V extends Serializable> C getLiveDataValueOf(String str, Serializable serializable) {
            return PERSISTENT_DATA_SOURCE.getLiveDataValueOf(this.category, str, serializable);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public <V extends Serializable> Optional<V> getValueOf(String str) {
            return Optional.ofNullable(this.cache.get(str));
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public long insertOrReplace(String str, Serializable serializable) {
            this.cache.put(str, serializable);
            return PERSISTENT_DATA_SOURCE.insertOrReplace(this.category, str, serializable);
        }

        @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
        public int size() {
            return this.cache.size();
        }
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public int delete(String str, String str2) {
        return SpecificCategory.get(str).delete(str2);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public int deleteAll(String str) {
        return SpecificCategory.get(str).deleteAll();
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public List<InjectedFeature> getAllEntitiesOf(String str) {
        return SpecificCategory.get(str).getAllEntities();
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public <V extends Serializable> C getLiveDataValueOf(String str, String str2, Serializable serializable) {
        return SpecificCategory.get(str).getLiveDataValueOf(str2, serializable);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public <V extends Serializable> Optional<V> getValueOf(String str, String str2) {
        return SpecificCategory.get(str).getValueOf(str2);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public long insertOrReplace(String str, String str2, Serializable serializable) {
        return SpecificCategory.get(str).insertOrReplace(str2, serializable);
    }

    @Override // com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource
    public int size(String str) {
        return SpecificCategory.get(str).size();
    }
}
