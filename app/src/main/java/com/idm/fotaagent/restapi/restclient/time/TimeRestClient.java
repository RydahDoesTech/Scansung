package com.idm.fotaagent.restapi.restclient.time;

import android.content.Context;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.request.ObjectRequest;
import com.idm.fotaagent.restapi.request.RequestPropertiesForOsp;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.BaseRestClient;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;
import java.net.MalformedURLException;

/* loaded from: classes.dex */
public class TimeRestClient extends BaseRestClient<Response.WithAttributes> {
    private static final String TIME_ADDR_NODE = "timeAddr";

    public TimeRestClient(Context context) {
        super(context, new Response.WithAttributes(), new XmlParser.Time(), new TimeStrategyFactory());
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public void checkNetwork() {
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
        return new RequestPropertiesForOsp.WithAuth.ByCurrentTime(objectRequest.getMethod(), objectRequest.getUrl().toString(), objectRequest.getBody());
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getUrl() throws MalformedURLException {
        try {
            return getServerUrlByXAddrPath(IDMDatabaseManager.getInstance().getReleaseProfile().idmGetServerId(), TIME_ADDR_NODE);
        } catch (IDMMoExceptionNotFound e5) {
            Log.printStackTrace(e5);
            throw new MalformedURLException(e5.getMessage());
        }
    }
}
