package com.idm.fotaagent.enabler.ui.appfota;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater;
import com.idm.fotaagent.enabler.ui.common.subcontent.AppUpdate;
import com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class AppFotaFactory {
    private static final int APP_FOTA_ENABLED = 1;
    private static final int APP_FOTA_ENABLED_IN_V2_ONLY = 0;
    private static final String EXTRA_FW_VERSION = "EXTRA_FW_VERSION";
    protected final Context context;

    public static class CHN extends AppFotaFactory {
        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public AppFotaUpdater getAppFota() {
            return new AppFotaUpdater.ForCHN(this.context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public ContentInjector.Model getAppUpdateModel() {
            return new AppUpdate.Link(this.context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public Intent getIntent() {
            Intent intent = new Intent("com.samsung.preloadapp.AUC_LIST");
            intent.setPackage("com.samsung.preloadapp");
            intent.putExtra(AppFotaFactory.EXTRA_FW_VERSION, new InstallParamRepository(this.context).getUpdateFwVersion());
            return intent;
        }

        private CHN(Context context) {
            super(context);
        }
    }

    public static class Global extends AppFotaFactory {
        private static final String PACKAGE_APP_UPDATE_CENTER = "com.samsung.android.app.updatecenter";

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public AppFotaUpdater getAppFota() {
            return new AppFotaUpdater.ForGlobal(this.context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public ContentInjector.Model getAppUpdateModel() {
            return new AppUpdate.Link(this.context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public Intent getIntent() {
            Intent intent = new Intent("com.samsung.android.app.updatecenter.AUC_LIST");
            intent.setPackage(PACKAGE_APP_UPDATE_CENTER);
            intent.putExtra(AppFotaFactory.EXTRA_FW_VERSION, new InstallParamRepository(this.context).getUpdateFwVersion());
            return intent;
        }

        private Global(Context context) {
            super(context);
        }
    }

    public static class Nothing extends AppFotaFactory {
        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public AppFotaUpdater getAppFota() {
            return new AppFotaUpdater.ForNothing(this.context);
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public ContentInjector.Model getAppUpdateModel() {
            return new AppUpdate.Nothing();
        }

        @Override // com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory
        public Intent getIntent() {
            return null;
        }

        private Nothing(Context context) {
            super(context);
        }
    }

    public static AppFotaFactory create(Context context) {
        int appFota = new InstallParamRepository(context).getAppFota();
        if (appFota == 1 || appFota == 0) {
            return existsCHNUri(context) ? new CHN(context) : getSpecVersion(context) == 2 ? new Global(context) : new Nothing(context);
        }
        Log.I("AppFota Not Required: appFota=" + appFota);
        return new Nothing(context);
    }

    private static boolean existsCHNUri(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.samsung.android.preloadappprovider/target_fw"), null, null, null);
            boolean z4 = cursorQuery != null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return z4;
        } catch (Exception unused) {
            Log.I("Not exist CHN URI");
            return false;
        }
    }

    private static int getSpecVersion(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Objects.requireNonNull(packageManager, "PackageManager should not be null");
            int i5 = packageManager.getPackageInfo("com.samsung.android.app.updatecenter", 128).applicationInfo.metaData.getInt("com.samsung.android.app.updatecenter.provider.spec_version", 1);
            Log.I("App update center specVersion : " + i5);
            return i5;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.I("Global app fota package not found");
            return 0;
        } catch (NullPointerException e5) {
            Log.W("AppFota Not Required\n" + android.util.Log.getStackTraceString(e5));
            return 0;
        }
    }

    public abstract AppFotaUpdater getAppFota();

    public abstract ContentInjector.Model getAppUpdateModel();

    public abstract Intent getIntent();

    private AppFotaFactory(Context context) {
        this.context = context;
    }
}
