package com.idm.fotaagent.restapi.restclient;

import android.content.Context;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.request.ObjectRequest;
import com.idm.fotaagent.restapi.request.RequestPropertiesForOsp;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class NonAuthRestClient<T extends Response> extends BaseRestClient<T> {
    private int retry;
    private final String urlString;

    public NonAuthRestClient(Context context, String str, T t4, XmlParser xmlParser, StrategyFactory strategyFactory) {
        super(context, t4, xmlParser, strategyFactory);
        this.urlString = str;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public boolean allowsRoaming() {
        return true;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public boolean doesRetryFor(Result result) {
        return super.doesRetryFor(result) || result.getValue() == 501;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public void generateAndValidateBody() {
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getHttpMethod() {
        return ObjectRequest.HttpMethod.GET.toString();
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public RequestPropertiesForOsp getRequestProperties(ObjectRequest objectRequest) {
        return new RequestPropertiesForOsp.WithoutAuth(0L);
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getUrl() {
        return this.urlString;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public boolean onRetry() {
        this.retry++;
        Log.D("retry: " + this.retry);
        if (this.retry >= 2) {
            return false;
        }
        return doesRetryFor(this.response.getResult());
    }
}
