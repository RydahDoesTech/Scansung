package com.idm.fotaagent.database.room.debug.dao;

import com.idm.fotaagent.database.room.debug.entity.PostponeReason;
import java.util.List;

/* loaded from: classes.dex */
public interface PostponeReasonDao {
    int deleteAll();

    List<String> getLimitedPostponeReasons();

    long insertOrReplace(PostponeReason postponeReason);
}
