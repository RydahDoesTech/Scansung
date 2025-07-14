package com.idm.fotaagent.restapi.restclient.masscampaign;

import android.content.Context;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.NonAuthRestClient;
import com.idm.fotaagent.restapi.restclient.NonAuthStrategyFactory;

/* loaded from: classes.dex */
public class MassCampaignRestClient extends NonAuthRestClient<Response.WithBody> {
    public MassCampaignRestClient(Context context, String str) {
        super(context, str, new Response.WithBody(), null, new NonAuthStrategyFactory.MassCampaign());
    }
}
