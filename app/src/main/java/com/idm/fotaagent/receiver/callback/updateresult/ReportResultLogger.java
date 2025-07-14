package com.idm.fotaagent.receiver.callback.updateresult;

import android.content.Context;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ReportResultLogger {
    private static final String KEY_ERROR_CODE = "errorCode";
    private static final String KEY_STATUS = "status";

    public static void addStatusIfNeeded(Context context, ReportStatus reportStatus) {
        Log.I("");
        ActionInfoDao actionInfoDao = new ActionInfoDao();
        if (actionInfoDao.isReportFumoStatus() || actionInfoDao.isUpdatingFumoStatus()) {
            FotaJobRepository fotaJobRepository = new FotaJobRepository(context);
            int reportResult = fotaJobRepository.getReportResult();
            int value = reportStatus.toValue() | reportResult;
            Log.I("prevStatus : " + reportResult + ", status : " + reportStatus + ", newStatus : " + value);
            fotaJobRepository.setReportResult(value);
        }
    }

    public static void send(Context context, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", str);
        map.put("status", String.valueOf(new FotaJobRepository(context).getReportResult()));
        SALogging.send(SAConstants.EventId.EVENT_ID_REPORT_STATUS, map);
    }
}
