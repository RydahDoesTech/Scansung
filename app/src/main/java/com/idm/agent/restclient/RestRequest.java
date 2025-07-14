package com.idm.agent.restclient;

import android.text.TextUtils;
import com.idm.network.IDMNetworkInterface;

/* loaded from: classes.dex */
public class RestRequest {
    private final String body;
    private final MethodType methodType;
    private final String url;

    public static class Builder {
        private String body;
        private final MethodType methodType;
        private final String url;

        public Builder(MethodType methodType, String str) {
            this.methodType = methodType;
            this.url = str;
        }

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public RestRequest build() {
            if (this.methodType == MethodType.REST_METHOD_POST && TextUtils.isEmpty(this.body)) {
                throw new IllegalArgumentException("body should not be empty.");
            }
            return new RestRequest(this);
        }
    }

    public enum MethodType {
        REST_METHOD_POST(IDMNetworkInterface.IDM_HTTP_METHOD_POST),
        REST_METHOD_GET(IDMNetworkInterface.IDM_HTTP_METHOD_GET);

        private final String methodType;

        MethodType(String str) {
            this.methodType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.methodType;
        }
    }

    public RestRequest(Builder builder) {
        this.methodType = builder.methodType;
        this.url = builder.url;
        this.body = builder.body;
    }

    public String getBody() {
        return this.body;
    }

    public MethodType getMethodType() {
        return this.methodType;
    }

    public String getUrl() {
        return this.url;
    }
}
