package com.idm.fotaagent.restapi.restclient.heartbeat;

import android.content.Context;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.request.DeviceInfo;
import com.idm.fotaagent.restapi.request.FOTABody;
import com.idm.fotaagent.restapi.request.ObjectRequest;
import com.idm.fotaagent.restapi.request.RequestPropertiesForOsp;
import com.idm.fotaagent.restapi.request.TimestampForAuth;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.BaseRestClient;
import com.idm.fotaagent.restapi.restclient.heartbeat.HeartbeatStrategyFactory;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class HeartbeatRestClient extends BaseRestClient<Response.WithAttributes> {
    final DeviceInfo.ForHeartBeat deviceInfo;
    private int retry;
    private final String url;

    public static class OneShot extends HeartbeatRestClient {
        public OneShot(Context context, String str, DeviceInfo.ForHeartBeat forHeartBeat) {
            super(context, str, forHeartBeat, new HeartbeatStrategyFactory.OneShot());
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String generateBody() {
            return new FOTABody.OneShot().generate(this.deviceInfo);
        }
    }

    public static class Periodic extends HeartbeatRestClient {
        public Periodic(Context context, String str, DeviceInfo.ForHeartBeat forHeartBeat) {
            super(context, str, forHeartBeat, new HeartbeatStrategyFactory.Periodic());
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String generateBody() {
            return new FOTABody.Periodic().generate(this.deviceInfo);
        }
    }

    public HeartbeatRestClient(Context context, String str, DeviceInfo.ForHeartBeat forHeartBeat, StrategyFactory strategyFactory) {
        super(context, new Response.WithAttributes(), new XmlParser.Heartbeat(), strategyFactory);
        this.url = str;
        this.deviceInfo = forHeartBeat;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getHttpMethod() {
        return ObjectRequest.HttpMethod.POST.toString();
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public RequestPropertiesForOsp getRequestProperties(ObjectRequest objectRequest) {
        return new RequestPropertiesForOsp.WithAuth.ByServerTime(objectRequest.getMethod(), objectRequest.getUrl().toString(), objectRequest.getBody());
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getUrl() {
        return this.url;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public boolean onRetry() {
        this.retry++;
        Log.D("retry: " + this.retry);
        if (this.retry >= 2) {
            return false;
        }
        if (doesRetryFor(((Response.WithAttributes) this.response).getResult())) {
            return true;
        }
        if (!Result.ERROR_TYPE_INVALID_TIMESTAMP.equals(((Response.WithAttributes) this.response).getErrorCode())) {
            return false;
        }
        new TimestampForAuth(this.context).clear();
        return true;
    }
}
