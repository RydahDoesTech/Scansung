package com.idm.fotaagent.restapi.restclient.push;

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
import com.idm.fotaagent.restapi.restclient.push.PushStrategyFactory;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class PushRestClient extends BaseRestClient<Response.WithAttributes> {
    private int retry;

    public static class Received extends PushRestClient {
        private final String replyUrl;

        public Received(Context context, String str) {
            super(context, new PushStrategyFactory.Received());
            this.replyUrl = str;
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public void generateAndValidateBody() {
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String getHttpMethod() {
            return ObjectRequest.HttpMethod.GET.toString();
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String getUrl() {
            return this.replyUrl;
        }
    }

    public static class Registration extends PushRestClient {
        static final String URL_PUSH_REGISTRATION = "/device/fumo/ippushregister";
        private final DeviceInfo.ForPush pushInfo;

        public Registration(Context context, DeviceInfo.ForPush forPush) {
            super(context, new PushStrategyFactory.Registration());
            this.pushInfo = forPush;
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String generateBody() {
            return new FOTABody.ForPush().generate(this.pushInfo);
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String getHttpMethod() {
            return ObjectRequest.HttpMethod.POST.toString();
        }

        @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
        public String getUrl() {
            return getHostUrl(this.context) + URL_PUSH_REGISTRATION;
        }
    }

    public PushRestClient(Context context, StrategyFactory strategyFactory) {
        super(context, new Response.WithAttributes(), new XmlParser(), strategyFactory);
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public RequestPropertiesForOsp getRequestProperties(ObjectRequest objectRequest) {
        return new RequestPropertiesForOsp.WithAuth.ByServerTime(objectRequest.getMethod(), objectRequest.getUrl().toString(), objectRequest.getBody());
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
