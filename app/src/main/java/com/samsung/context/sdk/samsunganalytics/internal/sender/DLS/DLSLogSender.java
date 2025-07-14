package com.samsung.context.sdk.samsunganalytics.internal.sender.DLS;

import I2.a;
import Y0.h;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.internal.device.DeviceInfo;
import com.samsung.context.sdk.samsunganalytics.internal.policy.Constants;
import com.samsung.context.sdk.samsunganalytics.internal.policy.PolicyUtils;
import com.samsung.context.sdk.samsunganalytics.internal.sender.BaseLogSender;
import com.samsung.context.sdk.samsunganalytics.internal.sender.LogType;
import com.samsung.context.sdk.samsunganalytics.internal.sender.SimpleLog;
import com.samsung.context.sdk.samsunganalytics.internal.sender.buffering.Manager;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class DLSLogSender extends BaseLogSender {
    public static final int DB_SELECT_LIMIT = 200;
    private final DeviceInfo deviceInfo;

    public DLSLogSender(Context context, Configuration configuration) {
        super(context, configuration);
        this.deviceInfo = DeviceInfo.getDeviceInfo(context);
    }

    private int checkAvailableLogging(int i5) {
        if (i5 == -4) {
            Debug.LogD("DLS Sender", "Network unavailable.");
            return -4;
        }
        if (!PolicyUtils.isPolicyExpired(this.context)) {
            return 0;
        }
        Debug.LogD("DLS Sender", "policy expired. request policy");
        return -6;
    }

    private void flushBufferedLogs(int i5, LogType logType, Queue<SimpleLog> queue, a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<SimpleLog> it = queue.iterator();
        while (it.hasNext()) {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            int iMin = Math.min(Constants.MAXIMUM_LOG_LENGTH, PolicyUtils.getRemainingQuota(this.context, i5));
            int length = 0;
            while (it.hasNext()) {
                SimpleLog next = it.next();
                if (next.getType() == logType) {
                    if (next.getData().getBytes().length + length > iMin) {
                        break;
                    }
                    length += next.getData().getBytes().length;
                    linkedBlockingQueue.add(next);
                    it.remove();
                    arrayList.add(next.getId());
                    if (queue.isEmpty()) {
                        this.manager.remove(arrayList);
                        queue = this.manager.get(200);
                        it = queue.iterator();
                    }
                }
            }
            if (linkedBlockingQueue.isEmpty()) {
                return;
            }
            this.manager.remove(arrayList);
            sendSum(i5, logType, linkedBlockingQueue, length, aVar);
            Debug.LogD("DLSLogSender", "send packet : num(" + linkedBlockingQueue.size() + ") size(" + length + ")");
        }
    }

    private int getNetworkType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return -4;
        }
        return activeNetworkInfo.getType();
    }

    private int sendOne(int i5, SimpleLog simpleLog, a aVar) {
        if (simpleLog == null) {
            return -100;
        }
        int length = simpleLog.getData().getBytes().length;
        int iHasQuota = PolicyUtils.hasQuota(this.context, i5, length);
        if (iHasQuota != 0) {
            return iHasQuota;
        }
        PolicyUtils.useQuota(this.context, i5, length);
        ((h) this.executor).e(new DLSAPIClient(simpleLog, this.configuration.getTrackingId(), aVar));
        return 0;
    }

    private void sendSum(int i5, LogType logType, Queue<SimpleLog> queue, int i6, a aVar) {
        PolicyUtils.useQuota(this.context, i5, i6);
        ((h) this.executor).e(new DLSAPIClient(logType, queue, this.configuration.getTrackingId(), aVar));
    }

    @Override // com.samsung.context.sdk.samsunganalytics.internal.sender.LogSender
    public int send(Map<String, String> map) {
        final int networkType = getNetworkType();
        int iCheckAvailableLogging = checkAvailableLogging(networkType);
        if (iCheckAvailableLogging != 0) {
            insert(map);
            if (iCheckAvailableLogging == -6) {
                PolicyUtils.updatePolicy(this.context, this.configuration, this.executor, this.deviceInfo);
                this.manager.delete();
            }
            return iCheckAvailableLogging;
        }
        a aVar = new a() { // from class: com.samsung.context.sdk.samsunganalytics.internal.sender.DLS.DLSLogSender.1
            @Override // I2.a
            public void onFail(int i5, String str, String str2, String str3) throws NumberFormatException {
                Manager manager = ((BaseLogSender) DLSLogSender.this).manager;
                long j5 = Long.parseLong(str);
                LogType logType = LogType.DEVICE;
                if (!str3.equals(logType.getAbbrev())) {
                    logType = LogType.UIX;
                }
                manager.insert(j5, str2, logType);
                PolicyUtils.useQuota(((BaseLogSender) DLSLogSender.this).context, networkType, str2.getBytes().length * (-1));
            }

            @Override // I2.a
            public void onSuccess(int i5, String str, String str2, String str3) {
            }
        };
        int iSendOne = sendOne(networkType, new SimpleLog(Long.parseLong(map.get("ts")), makeBodyString(setCommonParamToLog(map)), getLogType(map)), aVar);
        if (iSendOne == -1) {
            return iSendOne;
        }
        Queue<SimpleLog> queue = this.manager.get(200);
        if (this.manager.isEnabledDatabaseBuffering()) {
            flushBufferedLogs(networkType, LogType.UIX, queue, aVar);
            flushBufferedLogs(networkType, LogType.DEVICE, queue, aVar);
        } else {
            while (!queue.isEmpty() && (iSendOne = sendOne(networkType, queue.poll(), aVar)) != -1) {
            }
        }
        return iSendOne;
    }

    @Override // com.samsung.context.sdk.samsunganalytics.internal.sender.BaseLogSender
    public Map<String, String> setCommonParamToLog(Map<String, String> map) {
        map.put("la", this.deviceInfo.getLanguage());
        if (!TextUtils.isEmpty(this.deviceInfo.getMcc())) {
            map.put("mcc", this.deviceInfo.getMcc());
        }
        if (!TextUtils.isEmpty(this.deviceInfo.getMnc())) {
            map.put("mnc", this.deviceInfo.getMnc());
        }
        map.put("dm", this.deviceInfo.getDeviceModel());
        map.put("auid", this.configuration.getDeviceId());
        map.put("do", this.deviceInfo.getAndroidVersion());
        map.put("av", AbstractC0415a.y(this.context));
        map.put("uv", this.configuration.getVersion());
        map.put("v", "6.05.077");
        map.put("at", String.valueOf(this.configuration.getAuidType()));
        map.put("fv", this.deviceInfo.getFirmwareVersion());
        map.put("tid", this.configuration.getTrackingId());
        map.put("tz", String.valueOf(Utils.getTimeZoneOffset()));
        return map;
    }
}
