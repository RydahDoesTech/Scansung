package com.idm.fotaagent.enabler.ui.whatsnew;

import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;

/* loaded from: classes.dex */
public interface MajorUpdate {
    public static final MajorUpdate FOR_WHATS_NEW = new com.idm.fotaagent.enabler.ui.notification.manager.a(7);
    public static final MajorUpdate FOR_LAST_UPDATE = new com.idm.fotaagent.enabler.ui.notification.manager.a(8);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Context context) {
        FotaJobRepository fotaJobRepository = new FotaJobRepository(context.getApplicationContext());
        if (new InstallParamRepository(context.getApplicationContext()).isMinor()) {
            return false;
        }
        return ((Boolean) fotaJobRepository.descriptionContent().map(new a(1)).orElse(Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(Context context) {
        if (new UpdateHistoryInfoDao().getLastSuccessUpdateHistoryInfo().isMinor()) {
            return false;
        }
        return !TextUtils.isEmpty(r1.summaryDescription());
    }

    boolean isMajorUpdate(Context context);
}
