package com.idm.fotaagent.restapi.request;

import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ObjectRequest {
    private String body;
    private String method;
    private Proxy proxy;
    private Map<String, String> requestProperties;
    private URL url;

    public enum HttpMethod {
        POST,
        GET,
        PUT,
        DELETE
    }

    public ObjectRequest(URL url) {
        this.url = url;
    }

    public String getBody() {
        return this.body;
    }

    public String getMethod() {
        return this.method;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public Map<String, String> getRequestProperties() {
        Map<String, String> map = this.requestProperties;
        return map != null ? map : new HashMap();
    }

    public URL getUrl() {
        return this.url;
    }

    public boolean hasBody() {
        return !TextUtils.isEmpty(this.body);
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setProxy(String str, int i5) {
        if (str == null || i5 == -1) {
            return;
        }
        this.proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i5));
    }

    public void setRequestProperties(Map<String, String> map) {
        this.requestProperties = map;
    }
}
