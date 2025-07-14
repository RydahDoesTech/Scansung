package com.idm.fotaagent.restapi.restclient.strategies;

/* loaded from: classes.dex */
public interface StrategyFactory {
    OnHttpResponseStrategy createOnHttpResponseFailureStrategy();

    OnHttpResponseStrategy createOnHttpResponseSuccessStrategy();
}
