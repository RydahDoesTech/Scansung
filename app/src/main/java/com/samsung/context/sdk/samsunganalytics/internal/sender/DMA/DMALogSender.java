package com.samsung.context.sdk.samsunganalytics.internal.sender.DMA;

import M2.a;
import Y0.h;
import android.content.ContentValues;
import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.internal.Callback;
import com.samsung.context.sdk.samsunganalytics.internal.policy.PolicyUtils;
import com.samsung.context.sdk.samsunganalytics.internal.sender.BaseLogSender;
import com.samsung.context.sdk.samsunganalytics.internal.sender.SimpleLog;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import e1.AbstractC0415a;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public class DMALogSender extends BaseLogSender {
    private static final int TYPE_COMMON = 1;
    private static final int TYPE_LOG = 2;
    private DMABinder dmaBinder;
    private int dmaStatus;
    private boolean isReset;

    public DMALogSender(Context context, Configuration configuration) {
        super(context, configuration);
        this.isReset = false;
        this.dmaStatus = 0;
        if (PolicyUtils.getSenderType() == 2) {
            DMABinder dMABinder = new DMABinder(context, new Callback<Void, String>() { // from class: com.samsung.context.sdk.samsunganalytics.internal.sender.DMA.DMALogSender.1
                @Override // com.samsung.context.sdk.samsunganalytics.internal.Callback
                public Void onResult(String str) {
                    DMALogSender.this.sendCommon();
                    DMALogSender.this.sendAll();
                    return null;
                }
            });
            this.dmaBinder = dMABinder;
            dMABinder.bind();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAll() {
        if (PolicyUtils.getSenderType() == 2 && this.dmaStatus == 0) {
            Queue<SimpleLog> queue = this.manager.get();
            while (!queue.isEmpty()) {
                ((h) this.executor).e(new SendLogTask(this.dmaBinder.getDmaInterface(), this.configuration, queue.poll()));
            }
        }
    }

    public void reset() {
        this.isReset = true;
    }

    @Override // com.samsung.context.sdk.samsunganalytics.internal.sender.LogSender
    public int send(Map<String, String> map) {
        Trace.beginSection("DMALogSender send");
        if (PolicyUtils.getSenderType() == 3) {
            ContentValues contentValues = new ContentValues();
            if (!Utils.isSendingAppCommonSupported(this.context)) {
                Utils.addAppCommonData(this.context, contentValues, this.configuration);
            } else if (!Preferences.getPreferences(this.context).getBoolean(Preferences.PREFS_KEY_SEND_COMMON_SUCCESS, false)) {
                sendCommon();
            }
            if (map.containsKey("pd")) {
                String str = map.get("pd");
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("pd", str);
                }
                map.remove("pd");
            }
            if (map.containsKey("ps")) {
                String str2 = map.get("ps");
                if (!TextUtils.isEmpty(str2)) {
                    contentValues.put("ps", str2);
                }
                map.remove("ps");
            }
            boolean z4 = Boolean.parseBoolean(map.remove("is"));
            contentValues.put("tcType", Integer.valueOf(this.configuration.isEnableUseInAppLogging() ? 1 : 0));
            contentValues.put("agree", Integer.valueOf(this.configuration.getUserAgreement().isAgreement() ? 1 : 0));
            contentValues.put("tid", this.configuration.getTrackingId());
            contentValues.put("logType", getLogType(map).getAbbrev());
            contentValues.put("timeStamp", Long.valueOf(map.get("ts")));
            contentValues.put(PhoneRestrictionPolicy.BODY, makeBodyString(setCommonParamToLog(map)));
            if (Utils.isAddingContentValueKeyAllowed(this.context)) {
                contentValues.put("networkType", Integer.valueOf(this.configuration.getNetworkType()));
                contentValues.put("isSummary", Boolean.valueOf(z4));
            }
            ((h) this.executor).e(new SendLogTaskV2(this.context, 2, contentValues));
        } else {
            if (this.dmaBinder.isTokenfail()) {
                Trace.endSection();
                return -8;
            }
            if (this.dmaStatus != 0) {
                Trace.endSection();
                return this.dmaStatus;
            }
            insert(map);
            if (!this.dmaBinder.isBind()) {
                this.dmaBinder.bind();
            } else if (this.dmaBinder.getDmaInterface() != null) {
                sendAll();
                if (this.isReset) {
                    sendCommon();
                    this.isReset = false;
                }
            }
        }
        Trace.endSection();
        return this.dmaStatus;
    }

    public void sendCommon() {
        String strMakeDelimiterString;
        Trace.beginSection("DMALogSender sendCommon");
        boolean zIsEnableUseInAppLogging = this.configuration.isEnableUseInAppLogging();
        String trackingId = this.configuration.getTrackingId();
        HashMap map = new HashMap();
        map.put("av", AbstractC0415a.y(this.context));
        map.put("uv", this.configuration.getVersion());
        map.put("v", "6.05.077");
        Utils.Depth depth = Utils.Depth.ONE_DEPTH;
        String strMakeDelimiterString2 = Utils.makeDelimiterString(map, depth);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(this.configuration.getDeviceId())) {
            strMakeDelimiterString = null;
        } else {
            map2.put("auid", this.configuration.getDeviceId());
            map2.put("at", String.valueOf(this.configuration.getAuidType()));
            strMakeDelimiterString = Utils.makeDelimiterString(map2, depth);
        }
        if (PolicyUtils.getSenderType() == 3) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tcType", Integer.valueOf(zIsEnableUseInAppLogging ? 1 : 0));
            contentValues.put("tid", trackingId);
            contentValues.put("data", strMakeDelimiterString2);
            contentValues.put("did", strMakeDelimiterString);
            ((h) this.executor).e(new SendLogTaskV2(this.context, 1, contentValues));
        } else {
            try {
                this.dmaStatus = ((a) this.dmaBinder.getDmaInterface()).f(zIsEnableUseInAppLogging ? 1 : 0, trackingId, strMakeDelimiterString2, strMakeDelimiterString);
            } catch (Exception e5) {
                Debug.logwingW("failed to send app common" + e5.getMessage());
                this.dmaStatus = -9;
            }
        }
        Trace.endSection();
    }

    @Override // com.samsung.context.sdk.samsunganalytics.internal.sender.BaseLogSender
    public Map<String, String> setCommonParamToLog(Map<String, String> map) {
        map.put("tz", String.valueOf(Utils.getTimeZoneOffset()));
        return map;
    }
}
