package com.idm.fotaagent.receiver.callback;

import android.content.Context;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.callback.IDMCallbackStatus;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.IDMDlDownloadInfo;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ProviderEventHandler implements IDMCallback {
    private static final Map<Integer, String> NAME_FOR_CODE = new HashMap();

    static {
        for (Field field : IDMCallbackStatusInterface.class.getFields()) {
            String name = field.getName();
            try {
                Object obj = field.get(null);
                if ((obj instanceof Integer) && NAME_FOR_CODE.put((Integer) obj, name) != null) {
                    Log.W(obj + " is already used for " + name);
                }
            } catch (IllegalAccessException e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    private boolean ignoresIfSuCancelFor(int i5) {
        switch (i5) {
            case 10:
            case 20:
            case 30:
            case 35:
            case 40:
            case 50:
            case 200:
            case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL /* 230 */:
            case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE /* 242 */:
            case IDMCallbackStatusInterface.IDM_STATUS_FINISH_AND_EXECUTE /* 1013 */:
            case IDMCallbackStatusInterface.IDM_DL_STATUS_ABORT /* 1109 */:
                return true;
            default:
                return false;
        }
    }

    public static String nameWithCode(int i5) {
        String str = NAME_FOR_CODE.get(Integer.valueOf(i5));
        if (str == null) {
            return "undefined(" + i5 + ")";
        }
        return str + "(" + i5 + ")";
    }

    @Override // com.idm.adapter.callback.IDMCallback
    public void idmOnProgress(String str, IDMCallbackStatus iDMCallbackStatus) {
        try {
            IDMDlDownloadInfo iDMDlDownloadInfo = (IDMDlDownloadInfo) iDMCallbackStatus.idmGetObject();
            Log.I("Downloading : " + iDMDlDownloadInfo.idmGetDownloadPercent() + "% DownloadSize : " + iDMDlDownloadInfo.idmGetDownloadSize());
            DownloadProgressInfo.update(iDMDlDownloadInfo.idmGetDownloadSize(), iDMDlDownloadInfo.idmGetDownloadPercent(), str);
        } catch (ClassCastException | NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // com.idm.adapter.callback.IDMCallback
    public void idmOnStatus(String str, IDMCallbackStatus iDMCallbackStatus) {
        int iIdmGetStatus = iDMCallbackStatus.idmGetStatus();
        if (new ActionInfoDao(str).getSuCancel() && ignoresIfSuCancelFor(iIdmGetStatus)) {
            Log.I("taskId " + str + ", callbackStatus: " + nameWithCode(iIdmGetStatus) + " SuCancel Block");
            return;
        }
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        Object objIdmGetObject = iDMCallbackStatus.idmGetObject();
        int iIdmGetAbortCode = iDMCallbackStatus.idmGetAbortCode();
        int iIdmGetResults = iDMCallbackStatus.idmGetResults();
        if (iIdmGetResults == 10000) {
            new NormalEventHandler(contextIdmGetContext, str).handle(iIdmGetStatus, objIdmGetObject, iIdmGetAbortCode);
            return;
        }
        if (iIdmGetResults == 10002) {
            new AbortEventHandler(contextIdmGetContext, str).handle(iIdmGetStatus, objIdmGetObject, iIdmGetAbortCode);
            return;
        }
        Log.W("taskId " + str + ", callbackStatus: " + nameWithCode(iIdmGetStatus) + " unsupported callback result: " + iIdmGetResults);
    }
}
