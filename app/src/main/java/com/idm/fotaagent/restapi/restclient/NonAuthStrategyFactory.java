package com.idm.fotaagent.restapi.restclient;

import com.idm.fotaagent.restapi.restclient.strategies.OnHttpResponseStrategy;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;

/* loaded from: classes.dex */
public abstract class NonAuthStrategyFactory implements StrategyFactory {

    public static class MassCampaign extends NonAuthStrategyFactory {
        @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
        public OnHttpResponseStrategy createOnHttpResponseSuccessStrategy() {
            return OnHttpResponseStrategy.STORE_BODY;
        }
    }

    public static class Polling extends NonAuthStrategyFactory {
        @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
        public OnHttpResponseStrategy createOnHttpResponseSuccessStrategy() {
            return OnHttpResponseStrategy.PARSE_FOR_SUCCESS;
        }
    }

    @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
    public OnHttpResponseStrategy createOnHttpResponseFailureStrategy() {
        return OnHttpResponseStrategy.STORE_RESULT_FROM_RESPONSE_CODE;
    }
}
