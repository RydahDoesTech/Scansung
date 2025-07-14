package com.idm.fotaagent.restapi.restclient.polling;

import android.content.Context;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.NonAuthRestClient;
import com.idm.fotaagent.restapi.restclient.NonAuthStrategyFactory;

/* loaded from: classes.dex */
public class PollingRestClient extends NonAuthRestClient<Response.WithAttributes.ForPolling> {
    public PollingRestClient(Context context, String str) {
        super(context, str, new Response.WithAttributes.ForPolling(), new XmlParser.Polling(), new NonAuthStrategyFactory.Polling());
    }
}
