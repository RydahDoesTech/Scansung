package com.idm.fotaagent.enabler.network;

import A2.c;
import E2.b;
import android.text.TextUtils;
import com.idm.adapter.filesystem.a;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.adapter.IDMAdapterDeviceInfoImpl;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public abstract class HTTPHeader {
    private static final String DEFAULT_MANUFACTURER = "samsung";
    protected static final String KEY_ACCEPT = "Accept";
    private static final String KEY_ACCEPT_CHARSET = "Accept-Charset";
    private static final String KEY_ACCEPT_LANGUAGE = "Accept-Language";
    private static final String KEY_CACHE_CONTROL = "Cache-Control";
    private static final String KEY_CONNECTION = "Connection";
    private static final String KEY_HOST = "Host";
    public static final String KEY_USER_AGENT = "User-Agent";
    private static final String VALUE_CACHE_CONTROL_NO_STORE = "no-store,private";
    private static final String VALUE_CHARSET_UTF8 = "utf-8";
    private static final String VALUE_CONNECTION_KEEP_ALIVE = "Keep-Alive";
    private static final String VALUE_LANGUAGE_EN = "en";
    protected Map<String, String> requestProperties = new HashMap();

    public static class ForDL extends HTTPHeader {
        private static final String KEY_NETWORK_BEARER = "X-Sec-Download-Network-Bearer";
        private static final String VALUE_ACCEPT_DD = "application/vnd.oma.dd+xml";

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$makeProperties$0(String str) {
            this.requestProperties.put(KEY_NETWORK_BEARER, new IDMAdapterDeviceInfoImpl().idmGetUsingBearer(IDMApplication.idmGetContext()));
        }

        private String makeAccept() {
            ActionInfoDao actionInfoDao = new ActionInfoDao();
            int fumoStatus = actionInfoDao.getFumoStatus();
            return (fumoStatus == 10 || fumoStatus == 35 || fumoStatus == 230) ? "application/vnd.oma.dd+xml" : actionInfoDao.getDownloadType();
        }

        @Override // com.idm.fotaagent.enabler.network.HTTPHeader
        public Map<String, String> makeProperties(HttpURLConnection httpURLConnection) {
            Optional.ofNullable(httpURLConnection).map(new b(21)).filter(new a(7)).ifPresent(new c(6, this));
            this.requestProperties.put("Accept", makeAccept());
            return super.makeProperties(httpURLConnection);
        }
    }

    public static class ForDM extends HTTPHeader {
        private static final String VALUE_ACCEPT_DM = "application/vnd.syncml.dm+wbxml";

        @Override // com.idm.fotaagent.enabler.network.HTTPHeader
        public Map<String, String> makeProperties(HttpURLConnection httpURLConnection) {
            this.requestProperties.put("Accept", "application/vnd.syncml.dm+wbxml");
            return super.makeProperties(httpURLConnection);
        }
    }

    public static abstract class ForRestClient extends HTTPHeader {
        private static final String VALUE_ACCEPT_ALL = "*, */*";

        public static class ForAuth extends ForRestClient {
            private static final String KEY_ACCEPT_ENCODING = "Accept-Encoding";
            private static final String KEY_CONTENT_TYPE = "Content-Type";
            private static final String KEY_MODEL = "X-Sec-Dm-DeviceModel";
            private static final String KEY_OSP_VERSION = "x-osp-version";
            private static final String KEY_SALES_CODE = "X-Sec-Dm-CustomerCode";
            private static final String VALUE_CONTENT_TYPE_TEXT_XML = "text/xml";
            private static final String VALUE_ENCODING_IDENTITY = "identity";
            private static final String VALUE_OSP_VERSION_V1 = "v1";

            @Override // com.idm.fotaagent.enabler.network.HTTPHeader.ForRestClient, com.idm.fotaagent.enabler.network.HTTPHeader
            public Map<String, String> makeProperties(HttpURLConnection httpURLConnection) {
                this.requestProperties.put(KEY_ACCEPT_ENCODING, VALUE_ENCODING_IDENTITY);
                this.requestProperties.put("Content-Type", VALUE_CONTENT_TYPE_TEXT_XML);
                this.requestProperties.put(KEY_OSP_VERSION, VALUE_OSP_VERSION_V1);
                String modelName = DeviceUtils.readModelName();
                if (!TextUtils.isEmpty(modelName)) {
                    this.requestProperties.put(KEY_MODEL, modelName);
                }
                if (!TextUtils.isEmpty(SalesCode.get().toString())) {
                    this.requestProperties.put(KEY_SALES_CODE, SalesCode.get().toString());
                }
                return super.makeProperties(httpURLConnection);
            }
        }

        public static class ForNonAuth extends ForRestClient {
        }

        @Override // com.idm.fotaagent.enabler.network.HTTPHeader
        public Map<String, String> makeProperties(HttpURLConnection httpURLConnection) {
            this.requestProperties.put("Accept", VALUE_ACCEPT_ALL);
            return super.makeProperties(httpURLConnection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$makeHttpUserAgent$1(String str) {
        return !str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeProperties$0(HttpURLConnection httpURLConnection) {
        this.requestProperties.put("Host", makeHost(httpURLConnection));
    }

    private String makeHost(HttpURLConnection httpURLConnection) {
        URL url = httpURLConnection.getURL();
        return url.getHost() + ":" + (url.getPort() == -1 ? url.getDefaultPort() : url.getPort());
    }

    private String makeHttpUserAgent() {
        String strIdmGetDeviceManufacturer = new IDMAdapterDeviceInfoImpl().idmGetDeviceManufacturer();
        if (TextUtils.isEmpty(strIdmGetDeviceManufacturer)) {
            strIdmGetDeviceManufacturer = DEFAULT_MANUFACTURER;
        }
        return strIdmGetDeviceManufacturer + ' ' + new RegisteredDeviceRepository(IDMApplication.idmGetContext()).getModelName().filter(new a(6)).orElse(DeviceUtils.readModelName()) + " SyncML DM Client";
    }

    public Map<String, String> makeProperties(HttpURLConnection httpURLConnection) {
        this.requestProperties.put("Cache-Control", VALUE_CACHE_CONTROL_NO_STORE);
        this.requestProperties.put("User-Agent", makeHttpUserAgent());
        this.requestProperties.put("Connection", "Keep-Alive");
        this.requestProperties.put("Accept-Language", "en");
        this.requestProperties.put("Accept-Charset", "utf-8");
        Optional.ofNullable(httpURLConnection).ifPresent(new c(5, this));
        return this.requestProperties;
    }
}
