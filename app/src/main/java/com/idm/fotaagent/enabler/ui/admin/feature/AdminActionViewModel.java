package com.idm.fotaagent.enabler.ui.admin.feature;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.X;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseServerInfo;
import com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationRawData;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UiMode;
import com.idm.fotaagent.enabler.ui.userinit.UserInitEntryActivity;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.utils.EnablerUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AdminActionViewModel extends X {

    public enum Action {
        PUSH_BACKGROUND { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.1
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() throws Throwable {
                Action.initiatePush(UiMode.BACKGROUND);
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_PUSH_BACKGROUND);
            }
        },
        PUSH_INFORMATIVE { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.2
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() throws Throwable {
                Action.initiatePush(UiMode.INFORMATIVE);
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_PUSH_INFORMATIVE);
            }
        },
        PUSH_INTERACTIVE { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.3
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() throws Throwable {
                Action.initiatePush(UiMode.USER_INTERACTION);
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_PUSH_INTERACTIVE);
            }
        },
        PUSH_WIFIBACKROUND { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.4
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() throws Throwable {
                Action.initiatePush(UiMode.WIFI_BACKGROUND);
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_PUSH_WIFIBACKGROUND);
            }
        },
        PULL { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.5
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() {
                Context contextIdmGetContext = IDMApplication.idmGetContext();
                contextIdmGetContext.startActivity(new Intent(contextIdmGetContext, (Class<?>) UserInitEntryActivity.class));
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_PULL);
            }
        },
        POLLING { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.6
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() {
                IDMApplication.idmGetContext().sendBroadcast(RestClientServiceType.POLLING.getIntent(IDMApplication.idmGetContext()));
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_POLLING);
            }
        },
        RESET_REGISTER { // from class: com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action.7
            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public void doAction() {
                RegistrationHelper.unregister();
            }

            @Override // com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel.Action
            public String getString(Context context) {
                return context.getString(R.string.STR_ADMIN_RESET_REGISTER);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static void initiatePush(UiMode uiMode) throws Throwable {
            IDMDatabaseServerInfo releaseServerInfo = IDMDatabaseManager.getInstance().getReleaseServerInfo();
            if (releaseServerInfo == null) {
                Log.E("releaseServerInfo should not be null");
                return;
            }
            String strIdmGetServer = releaseServerInfo.idmGetServer();
            if (TextUtils.isEmpty(strIdmGetServer)) {
                Log.E("serverId should not be null");
                return;
            }
            byte[] bArrGenerate = new DmNotificationRawData.Builder(strIdmGetServer.getBytes(StandardCharsets.US_ASCII)).uiMode(uiMode).build().generate();
            Log.I("notiData : " + EnablerUtils.toHexString(bArrGenerate));
            SchedulerInitiator.getInstance().initiateByServer(bArrGenerate);
        }

        public abstract void doAction();

        public abstract String getString(Context context);
    }

    public static class Actions {
        public Action leftAction;
        public String leftButtonName;
        public Action rightAction;
        public String rightButtonName;

        public Actions(Context context, Action action, Action action2) {
            this.leftButtonName = action.getString(context);
            this.leftAction = action;
            if (action2 != null) {
                this.rightButtonName = action2.getString(context);
                this.rightAction = action2;
            }
        }
    }

    public List<Actions> getActionsList(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Actions(context, Action.PUSH_BACKGROUND, Action.PUSH_INFORMATIVE));
        arrayList.add(new Actions(context, Action.PUSH_INTERACTIVE, Action.PUSH_WIFIBACKROUND));
        arrayList.add(new Actions(context, Action.PULL, Action.POLLING));
        arrayList.add(new Actions(context, Action.RESET_REGISTER, null));
        return arrayList;
    }
}
