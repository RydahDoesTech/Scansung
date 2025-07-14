package com.idm.fotaagent.restapi.restclient.push;

import com.idm.fotaagent.restapi.restclient.strategies.OnHttpResponseStrategy;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;

/* loaded from: classes.dex */
public abstract class PushStrategyFactory implements StrategyFactory {

    public static class Received extends PushStrategyFactory {
        @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
        public OnHttpResponseStrategy createOnHttpResponseFailureStrategy() {
            return OnHttpResponseStrategy.DO_NOTHING;
        }
    }

    public static class Registration extends PushStrategyFactory {
        @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
        public OnHttpResponseStrategy createOnHttpResponseFailureStrategy() {
            return OnHttpResponseStrategy.PARSE_FOR_FAILURE;
        }
    }

    @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
    public OnHttpResponseStrategy createOnHttpResponseSuccessStrategy() {
        return OnHttpResponseStrategy.DO_NOTHING;
    }
}
