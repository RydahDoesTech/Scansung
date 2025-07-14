package com.idm.fotaagent;

import android.app.ActivityOptions;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.fotaagent.abupdate.abenabler.enablerfactory.ABEnablerFactory;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.cpservice.CPServiceFactory;
import com.idm.fotaagent.database.sqlite.database.provider.CPService;
import com.idm.fotaagent.enabler.adapter.IDMAdapterLogImpl;
import com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory;
import com.idm.fotaagent.enabler.enablerfactory.NonABEnablerFactory;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.log.Where;

/* loaded from: classes.dex */
public class IDMApplication extends Application {
    private static Context context = null;
    private static boolean isLogEnabled = false;

    public IDMApplication() {
        context = this;
    }

    public static void enableLog() {
        if (isLogEnabled) {
            Log.I("called at " + Where.callerOf(1));
            return;
        }
        new IDMDebug(new IDMAdapterLogImpl(Log.defaultLogger(context)));
        DiagMon.setup(context);
        SALogging.setup((Application) context);
        Log.I("called at " + Where.callerOf(1));
        isLogEnabled = true;
    }

    public static CPService getCPService() {
        return CPServiceFactory.get();
    }

    public static AbstractEnablerFactory getEnablerFactory() {
        if (DeviceUtils.isABModel()) {
            return new ABEnablerFactory();
        }
        Log.I("NonABEnablerFactory");
        return new NonABEnablerFactory();
    }

    public static Context idmGetContext() {
        return context;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        enableLog();
        Log.I(">>>>>>>>>>   com.wssyncmldm starts   <<<<<<<<<<");
        InitExecutor.get().initialize();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        Log.I("IDMApplication.startActivity() called at " + Where.callerOf(1));
        intent.setFlags(872677376);
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.setLaunchDisplayId(0);
        try {
            startActivity(intent, activityOptionsMakeBasic.toBundle());
        } catch (ActivityNotFoundException e5) {
            Log.printStackTrace(e5);
        }
    }
}
