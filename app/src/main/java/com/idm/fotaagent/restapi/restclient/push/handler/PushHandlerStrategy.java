package com.idm.fotaagent.restapi.restclient.push.handler;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.CampaignQueueRepository;
import com.idm.fotaagent.database.room.data.repository.HeartbeatRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.polling.PollingInfo;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.restapi.restclient.masscampaign.MassCampaignRestClient;
import com.idm.fotaagent.restapi.restclient.push.PushRestClient;
import com.idm.fotaagent.restapi.restclient.push.campaign.notification.CampaignNotificationHelper;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.Xpath;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
enum PushHandlerStrategy implements PushHandler {
    DM { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.1
        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            SchedulerInitiator.getInstance().initiateByServer(PushHandlerStrategy.decodeToBytes(str2));
        }
    },
    DS { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.2
        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            SchedulerInitiator.getInstance().cancelGeneric();
            PushHandlerStrategy.DM.process(str, str2);
        }
    },
    SC { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.3
        private static final String EXPRESSION_EXCEPTION_VERSION = "/SUCancelInfo/ExptVer";

        private boolean isUpdateFwVExceptedForSuCancel(String str) {
            try {
                String str2 = PushHandlerStrategy.parse(str, EXPRESSION_EXCEPTION_VERSION);
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                return new InstallParamRepository(PushHandlerStrategy.getContext()).getUpdateFwVersion().equals(str2);
            } catch (RuntimeException e5) {
                Log.printStackTrace(e5);
                return false;
            }
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            String strDecodeToString = PushHandlerStrategy.decodeToString(str2);
            Log.I(strDecodeToString);
            if (isUpdateFwVExceptedForSuCancel(strDecodeToString)) {
                Log.I("updateFwV is excepted for su cancel");
            } else {
                SchedulerInitiator.getInstance().cancelOrReset();
            }
        }
    },
    UB { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.4
        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
        }
    },
    AD { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.5
        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            String strDecodeToString = PushHandlerStrategy.decodeToString(str2);
            String str3 = PushHandlerStrategy.parse(strDecodeToString, XmlParser.Heartbeat.HEARTBEAT_URL);
            if (TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException(strDecodeToString);
            }
            new HeartbeatRepository.OneShot(PushHandlerStrategy.getContext()).setUrl(str3);
            PushHandlerStrategy.getContext().sendBroadcast(RestClientServiceType.ONE_SHOT_HEARTBEAT.getIntent(PushHandlerStrategy.getContext()));
        }
    },
    PU { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.6
        private String getPollingFileName(String str) {
            return PushHandlerStrategy.parse(str, XmlParser.Device.DEVICE_POLLING_TARGET);
        }

        private String getPollingUrl(String str) {
            return PushHandlerStrategy.parse(str, "versioninfo/url");
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            String strDecodeToString = PushHandlerStrategy.decodeToString(str2);
            String pollingUrl = getPollingUrl(strDecodeToString);
            String pollingFileName = getPollingFileName(strDecodeToString);
            if (TextUtils.isEmpty(pollingUrl) || TextUtils.isEmpty(pollingFileName)) {
                throw new IllegalArgumentException(strDecodeToString);
            }
            PollingInfo.get().setUrl(pollingUrl);
            PollingInfo.get().setTarget(PushHandlerStrategy.getContext(), pollingFileName);
        }
    },
    CM { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.7
        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            new CampaignQueueRepository(PushHandlerStrategy.getContext()).add(PushHandlerStrategy.decodeToString(str2));
            new CampaignNotificationHelper(PushHandlerStrategy.getContext()).notifyNotification();
        }
    },
    CU { // from class: com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy.8
        private static final String EXPRESSION_URL = "/msg_extension/url";

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandlerStrategy
        public void process(String str, String str2) {
            String strDecodeToString = PushHandlerStrategy.decodeToString(str2);
            String str3 = PushHandlerStrategy.parse(strDecodeToString, EXPRESSION_URL);
            if (TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException(strDecodeToString);
            }
            MassCampaignRestClient massCampaignRestClient = new MassCampaignRestClient(PushHandlerStrategy.getContext(), str3);
            if (!massCampaignRestClient.execute()) {
                throw new IllegalStateException("failed to retrieve campaign message");
            }
            String body = ((Response.WithBody) massCampaignRestClient.getResponse()).getBody();
            if (TextUtils.isEmpty(body)) {
                throw new IllegalStateException("empty body retrieved");
            }
            new CampaignQueueRepository(PushHandlerStrategy.getContext()).add(body);
            new CampaignNotificationHelper(PushHandlerStrategy.getContext()).notifyNotification();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] decodeToBytes(String str) {
        return Base64.decode(str, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String decodeToString(String str) {
        return new String(decodeToBytes(str), StandardCharsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static String parse(String str, String str2) {
        return new Xpath(str).getResultOfString(str2).orElse("");
    }

    private void reply(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.I("not replied due to empty url");
        } else {
            if (new PushRestClient.Received(getContext(), str).execute()) {
                return;
            }
            Log.W("failed to reply");
            Log.H("replyUrl: " + str);
        }
    }

    @Override // com.idm.fotaagent.restapi.restclient.push.handler.PushHandler
    public final void handle(String str, String str2, String str3) {
        Log.I("receive " + name());
        try {
            reply(str3);
            process(str, str2);
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }

    public abstract void process(String str, String str2);
}
