package com.idm.network;

/* loaded from: classes.dex */
public interface IDMNetworkInterface {
    public static final String IDM_HTTP_ACCEPT_CHARSET = "Accept-Charset";
    public static final String IDM_HTTP_CACHE_CONTROL = "Cache-Control";
    public static final String IDM_HTTP_CACHE_CONTROL_MODE = "no-store, private";
    public static final String IDM_HTTP_CHARSET_UFT8 = "utf-8";
    public static final String IDM_HTTP_CLOSE = "close";
    public static final int IDM_HTTP_CONN_TYPE_CLOSE = 0;
    public static final int IDM_HTTP_CONN_TYPE_KEEPALIVE = 1;
    public static final String IDM_HTTP_COOKIE = "Cookie";
    public static final String IDM_HTTP_DM_USER_AGENT = "SyncML DM Client";
    public static final String IDM_HTTP_HEADER_ACCEPT = "Accept";
    public static final String IDM_HTTP_HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String IDM_HTTP_HEADER_CONENTRANGE = "";
    public static final String IDM_HTTP_HEADER_CONNECTION = "Connection";
    public static final String IDM_HTTP_HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String IDM_HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    public static final String IDM_HTTP_HEADER_HOST = "Host";
    public static final String IDM_HTTP_HEADER_RANGE = "Range";
    public static final String IDM_HTTP_HEADER_USER_AGENT = "User-Agent";
    public static final String IDM_HTTP_HEADER_X_SYNCML_HMAC = "x-syncml-hmac";
    public static final String IDM_HTTP_KEEPALIVE = "Keep-Alive";
    public static final String IDM_HTTP_LANGUAGE = "en";
    public static final String IDM_HTTP_METHOD_CONNECT = "CONNECT";
    public static final String IDM_HTTP_METHOD_GET = "GET";
    public static final String IDM_HTTP_METHOD_POST = "POST";
    public static final String IDM_HTTP_METHOD_PUT = "PUT";
    public static final int IDM_IDM_NETWORK_TIMER_SECOND = 1000;
    public static final String IDM_MIMETYPE_FUMO_DD_XML = "application/vnd.oma.dd+xml";
    public static final int IDM_NETWORK_TIMER_ADD_COUNT = 10;
    public static final int IDM_NETWORK_TIMER_INTERVAL = 1000;
    public static final int MAX_AUTH_RETRY_COUNT = 4;
    public static final int RETRY_SECOND = 1000;

    public enum IDMNetworkTimerMode {
        IDM_NETWORK_TIMER_MODE_RECEIVE("Receive"),
        IDM_NETWORK_TIMER_MODE_CONNECT("Connect");

        private final String szValue;

        IDMNetworkTimerMode(String str) {
            this.szValue = str;
        }

        public String idmGetValue() {
            return this.szValue;
        }
    }
}
