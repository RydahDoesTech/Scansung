package com.samsung.context.sdk.samsunganalytics.internal.connection;

import com.idm.network.IDMNetworkInterface;

/* loaded from: classes.dex */
public enum HttpMethod {
    GET(IDMNetworkInterface.IDM_HTTP_METHOD_GET),
    POST(IDMNetworkInterface.IDM_HTTP_METHOD_POST);

    String method;

    HttpMethod(String str) {
        this.method = str;
    }

    public String getMethod() {
        return this.method;
    }
}
