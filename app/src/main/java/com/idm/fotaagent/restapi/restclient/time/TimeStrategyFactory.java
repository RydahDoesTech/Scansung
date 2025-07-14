package com.idm.fotaagent.restapi.restclient.time;

import com.idm.fotaagent.restapi.restclient.strategies.OnHttpResponseStrategy;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;

/* loaded from: classes.dex */
public class TimeStrategyFactory implements StrategyFactory {
    @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
    public OnHttpResponseStrategy createOnHttpResponseFailureStrategy() {
        return OnHttpResponseStrategy.PARSE_FOR_FAILURE;
    }

    @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
    public OnHttpResponseStrategy createOnHttpResponseSuccessStrategy() {
        return OnHttpResponseStrategy.PARSE_FOR_SUCCESS;
    }
}
