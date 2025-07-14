package com.idm.fotaagent.restapi.restclient.heartbeat;

import com.idm.fotaagent.restapi.restclient.strategies.OnHttpResponseStrategy;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;

/* loaded from: classes.dex */
public abstract class HeartbeatStrategyFactory implements StrategyFactory {

    public static class OneShot extends HeartbeatStrategyFactory {
        @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
        public OnHttpResponseStrategy createOnHttpResponseSuccessStrategy() {
            return OnHttpResponseStrategy.DO_NOTHING;
        }
    }

    public static class Periodic extends HeartbeatStrategyFactory {
        @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
        public OnHttpResponseStrategy createOnHttpResponseSuccessStrategy() {
            return OnHttpResponseStrategy.PARSE_FOR_SUCCESS;
        }
    }

    @Override // com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory
    public OnHttpResponseStrategy createOnHttpResponseFailureStrategy() {
        return OnHttpResponseStrategy.PARSE_FOR_FAILURE;
    }
}
