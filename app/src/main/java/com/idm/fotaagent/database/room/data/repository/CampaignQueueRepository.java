package com.idm.fotaagent.database.room.data.repository;

import A.o;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/* loaded from: classes.dex */
public class CampaignQueueRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "Campaign";
    public static final String NAME_BACK = "back";
    public static final String NAME_FRONT = "front";

    public CampaignQueueRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    private int back() {
        return ((Integer) getValueOf(NAME_BACK, 0)).intValue();
    }

    private int front() {
        return ((Integer) getValueOf(NAME_FRONT, 0)).intValue();
    }

    private Optional<String> get(int i5) {
        return getValueOf(String.valueOf(i5));
    }

    private boolean isEmpty() {
        return ((Boolean) runInTransaction(new a(this, 3))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$add$0(String str) {
        insertOrReplaceWithoutException(String.valueOf(back()), str);
        insertOrReplaceWithoutException(NAME_BACK, Integer.valueOf(back() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isEmpty$5() {
        return Boolean.valueOf(front() == back());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Optional lambda$peek$2() {
        return isEmpty() ? Optional.empty() : get(front());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$peekAll$3() {
        int iBack = back();
        ArrayList arrayList = new ArrayList();
        for (int iFront = front(); iFront < iBack; iFront++) {
            try {
                arrayList.add(get(iFront).get());
            } catch (NoSuchElementException e5) {
                Log.printStackTrace(e5);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Optional lambda$remove$1() {
        if (isEmpty()) {
            return Optional.empty();
        }
        int iFront = front();
        insertOrReplaceWithoutException(NAME_FRONT, Integer.valueOf(iFront + 1));
        return get(iFront);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$size$4() {
        return Integer.valueOf(back() - front());
    }

    public void add(String str) {
        runInTransaction(new o(this, 6, str));
    }

    public Optional<String> peek() {
        return (Optional) runInTransaction(new a(this, 2));
    }

    public List<String> peekAll() {
        return (List) runInTransaction(new a(this, 0));
    }

    public Optional<String> remove() {
        return (Optional) runInTransaction(new a(this, 4));
    }

    @Override // com.idm.fotaagent.database.room.data.repository.PropertyRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueRepository.SpecificCategory, com.idm.fotaagent.database.room.data.repository.CategoryNameValueDataSource.SpecificCategory
    public int size() {
        return ((Integer) runInTransaction(new a(this, 1))).intValue();
    }
}
