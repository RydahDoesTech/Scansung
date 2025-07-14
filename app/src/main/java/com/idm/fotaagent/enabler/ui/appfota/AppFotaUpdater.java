package com.idm.fotaagent.enabler.ui.appfota;

import A2.c;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes.dex */
public abstract class AppFotaUpdater {
    private static final String NAME_FIRMWARE_VERSION = "firmware_version";
    public final Context context;
    public final InstallParamRepository installParamRepository;

    public static class ForCHN extends AppFotaUpdater {
        static final String URI = "content://com.samsung.android.preloadappprovider/target_fw";

        public ForCHN(Context context) {
            super(context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater
        public ContentValues getContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppFotaUpdater.NAME_FIRMWARE_VERSION, this.installParamRepository.getUpdateFwVersion());
            for (String str : contentValues.keySet()) {
                Log.I("key : " + str + ", value : " + contentValues.get(str));
            }
            return contentValues;
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater
        public void setContentValues(ContentValues contentValues) {
            try {
                this.context.getContentResolver().update(Uri.parse(URI), contentValues, null);
                Log.I("succeeded to inform CHN AppUpdateCenter");
            } catch (RuntimeException e5) {
                Log.W("failed to inform CHN AppUpdateCenter\n" + android.util.Log.getStackTraceString(e5));
            }
        }
    }

    public static class ForGlobal extends AppFotaUpdater {
        private static final String NAME_ONEUI_VERSION = "oneui_version";
        private static final String NAME_SPEC_VERSION = "spec_version";
        private static final String URI = "content://com.samsung.android.app.updatecenter.provider/target";

        public ForGlobal(Context context) {
            super(context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater
        public ContentValues getContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppFotaUpdater.NAME_FIRMWARE_VERSION, this.installParamRepository.getUpdateFwVersion());
            contentValues.put(NAME_SPEC_VERSION, (Integer) 2);
            if (MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context)) {
                contentValues.put(NAME_ONEUI_VERSION, this.installParamRepository.getUpdateOneUiVersion());
            }
            for (String str : contentValues.keySet()) {
                Log.I("key : " + str + ", value : " + contentValues.get(str));
            }
            return contentValues;
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater
        public void setContentValues(ContentValues contentValues) {
            try {
                Objects.requireNonNull(this.context.getContentResolver().insert(Uri.parse(URI), contentValues), "Uri resulting from insert should not be null");
                Log.I("succeeded to inform Global AppUpdateCenter");
            } catch (RuntimeException e5) {
                Log.W("failed to inform Global AppUpdateCenter\n" + android.util.Log.getStackTraceString(e5));
            }
        }
    }

    public static class ForNothing extends AppFotaUpdater {
        public ForNothing(Context context) {
            super(context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater
        public ContentValues getContentValues() {
            return null;
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater
        public void setContentValues(ContentValues contentValues) {
        }
    }

    public AppFotaUpdater(Context context) {
        this.context = context;
        this.installParamRepository = new InstallParamRepository(context);
    }

    public abstract ContentValues getContentValues();

    public void informAppUpdateCenterOfTargetIfRequired() {
        Optional.ofNullable(getContentValues()).ifPresent(new c(15, this));
    }

    public abstract void setContentValues(ContentValues contentValues);
}
