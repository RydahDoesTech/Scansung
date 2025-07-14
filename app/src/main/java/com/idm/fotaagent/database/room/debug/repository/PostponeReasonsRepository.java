package com.idm.fotaagent.database.room.debug.repository;

import A.o;
import C1.b;
import android.content.Context;
import com.idm.fotaagent.database.room.debug.DBThreadExecutor;
import com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao;
import com.idm.fotaagent.database.room.debug.entity.PostponeReason;
import java.util.Objects;

/* loaded from: classes.dex */
public class PostponeReasonsRepository {
    private static volatile PostponeReasonsRepository INSTANCE;
    private final PostponeReasonDao dao;
    private final DBThreadExecutor executor;

    private PostponeReasonsRepository(DBThreadExecutor dBThreadExecutor, PostponeReasonDao postponeReasonDao) {
        this.executor = dBThreadExecutor;
        this.dao = postponeReasonDao;
    }

    public static PostponeReasonsRepository get(Context context) {
        if (INSTANCE == null) {
            synchronized (PostponeReasonsRepository.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new PostponeReasonsRepository(new DBThreadExecutor(), FotaDebugRoomDatabase.get(context).postponeReasonDao());
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$add$0(String str) {
        this.dao.insertOrReplace(new PostponeReason(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLimitedPostponeReasons$1(PostponeReasonsCallback postponeReasonsCallback) {
        postponeReasonsCallback.onPostponeReasonsLoaded(this.dao.getLimitedPostponeReasons());
    }

    public void add(String str) {
        this.executor.execute(new o(this, 10, str));
    }

    public void deleteAll() {
        DBThreadExecutor dBThreadExecutor = this.executor;
        PostponeReasonDao postponeReasonDao = this.dao;
        Objects.requireNonNull(postponeReasonDao);
        dBThreadExecutor.execute(new b(18, postponeReasonDao));
    }

    public void getLimitedPostponeReasons(PostponeReasonsCallback postponeReasonsCallback) {
        this.executor.execute(new o(this, 11, postponeReasonsCallback));
    }
}
