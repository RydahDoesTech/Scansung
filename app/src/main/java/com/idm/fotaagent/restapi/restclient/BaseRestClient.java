package com.idm.fotaagent.restapi.restclient;

import android.content.Context;
import android.text.TextUtils;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.enabler.adapter.NetworkApnManager;
import com.idm.fotaagent.enabler.fumo.proxy.ProxyHandler;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.request.ObjectRequest;
import com.idm.fotaagent.restapi.request.RequestPropertiesForOsp;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.exception.OnSetUpFailedException;
import com.idm.fotaagent.restapi.restclient.strategies.StrategyFactory;
import com.idm.fotaagent.utils.NetworkUtil;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.lib.episode.EternalContract;
import com.wssyncmldm.Flavor;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class BaseRestClient<T extends Response> {
    protected static final int MAX_RETRY = 2;
    private static final String REGIST_ADDR_NODE = "registAddr";
    private static final String REGIST_STAGING_ADDR_NODE = "registStagingAddr";
    protected String body;
    protected final Context context;
    protected final XmlParser parser;
    protected final T response;
    private final StrategyFactory strategyFactory;

    public BaseRestClient(Context context, T t4, XmlParser xmlParser, StrategyFactory strategyFactory) {
        this.context = context;
        this.response = t4;
        this.parser = xmlParser;
        this.strategyFactory = strategyFactory;
    }

    private void closeNetworkApn() {
        NetworkApnManager.get().close();
    }

    private URL getURL() {
        try {
            return new URL(getUrl());
        } catch (MalformedURLException e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setHostNameIfSslDisabled$0(String str, SSLSession sSLSession) {
        return true;
    }

    private void printRequestHeaders(Map<String, String> map) {
        Log.H(">> Headers:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.H(entry.getKey() + "=" + entry.getValue());
        }
    }

    private void printRequestLog(ObjectRequest objectRequest) {
        Log.I(">> ------------------------------------------------------------- >>");
        Log.I(">> Request: " + objectRequest.getUrl().getPath() + " >>");
        StringBuilder sb = new StringBuilder(">> Method: ");
        sb.append(objectRequest.getMethod());
        Log.H(sb.toString());
        Log.H(">> URL: " + objectRequest.getUrl().toString());
        Log.H(">> Body: " + objectRequest.getBody());
        Log.H(">> Host: " + objectRequest.getUrl().getHost());
        printRequestHeaders(objectRequest.getRequestProperties());
        Log.I(">> ------------------------------------------------------------- >>");
    }

    private void printResponseHeaders(Map<String, List<String>> map) {
        Log.H("<< Headers:");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(XmlParser.Polling.POLLING_VERSION_SEPARATOR);
            }
            Log.H(entry.getKey() + "=" + ((Object) sb));
        }
    }

    private void printResponseLog(ObjectRequest objectRequest, HttpURLConnection httpURLConnection) {
        Log.I("<< ------------------------------------------------------------- <<");
        Log.I("<< Response: " + objectRequest.getUrl().getPath() + " <<");
        StringBuilder sb = new StringBuilder("<< Http Code: ");
        sb.append(httpURLConnection.getResponseCode());
        Log.I(sb.toString());
        if (!objectRequest.getUrl().getHost().equals(httpURLConnection.getURL().getHost())) {
            Log.W("Network Sign On");
            Log.H("<< Host: " + httpURLConnection.getURL().getHost());
        }
        printResponseHeaders(httpURLConnection.getHeaderFields());
        Log.I("<< ------------------------------------------------------------- <<");
    }

    public boolean allowsRoaming() {
        return false;
    }

    public void checkNetwork() throws OnSetUpFailedException {
        if (isNetworkAvailable(this.context, allowsRoaming())) {
            return;
        }
        this.response.setResult(new Result(100));
        throw new OnSetUpFailedException("Network is not available");
    }

    public boolean doesRetryFor(Result result) {
        return result.getValue() == 500 || result.getValue() == 900;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        com.samsung.android.fotaagent.common.log.Log.W("Request is null!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute() {
        /*
            r3 = this;
            boolean r0 = r3.onSetUp()
            if (r0 != 0) goto Ld
            java.lang.String r3 = "Fail to set up!"
            com.samsung.android.fotaagent.common.log.Log.W(r3)
            r3 = 0
            return r3
        Ld:
            java.lang.String r0 = "[[ ================================================================="
            com.samsung.android.fotaagent.common.log.Log.I(r0)
        L12:
            com.idm.fotaagent.restapi.request.ObjectRequest r0 = r3.onRequest()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L22
            java.lang.String r0 = "Request is null!"
            com.samsung.android.fotaagent.common.log.Log.W(r0)     // Catch: java.lang.Throwable -> L1f
            goto L97
        L1f:
            r0 = move-exception
            goto L94
        L22:
            r1 = 2904(0xb58, float:4.07E-42)
            android.net.TrafficStats.setThreadStatsUid(r1)
            java.net.URL r1 = r0.getUrl()     // Catch: java.io.IOException -> L39
            java.net.Proxy r2 = r0.getProxy()     // Catch: java.io.IOException -> L39
            r3.setHostNameIfSslDisabled()     // Catch: java.io.IOException -> L39
            if (r2 != 0) goto L3b
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.io.IOException -> L39
            goto L3f
        L39:
            r0 = move-exception
            goto L8e
        L3b:
            java.net.URLConnection r1 = r1.openConnection(r2)     // Catch: java.io.IOException -> L39
        L3f:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.io.IOException -> L39
            r3.printRequestLog(r0)
            r3.setProperties(r0, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b com.idm.fotaagent.restapi.restclient.exception.ParseFailedException -> L5d
            r3.sendStreamOrConnect(r0, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b com.idm.fotaagent.restapi.restclient.exception.ParseFailedException -> L5d
            r3.printResponseLog(r0, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b com.idm.fotaagent.restapi.restclient.exception.ParseFailedException -> L5d
            int r0 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b com.idm.fotaagent.restapi.restclient.exception.ParseFailedException -> L5d
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L5f
            r3.onHttpResponseSuccess(r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b com.idm.fotaagent.restapi.restclient.exception.ParseFailedException -> L5d
            goto L62
        L59:
            r3 = move-exception
            goto L8a
        L5b:
            r0 = move-exception
            goto L66
        L5d:
            r0 = move-exception
            goto L6a
        L5f:
            r3.onHttpResponseFailure(r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b com.idm.fotaagent.restapi.restclient.exception.ParseFailedException -> L5d
        L62:
            r1.disconnect()
            goto L77
        L66:
            com.samsung.android.fotaagent.common.log.Log.printStackTrace(r0)     // Catch: java.lang.Throwable -> L59
            goto L62
        L6a:
            com.samsung.android.fotaagent.common.log.Log.printStackTrace(r0)     // Catch: java.lang.Throwable -> L59
            T extends com.idm.fotaagent.restapi.response.Response r2 = r3.response     // Catch: java.lang.Throwable -> L59
            com.idm.fotaagent.restapi.response.Result r0 = r0.getResult()     // Catch: java.lang.Throwable -> L59
            r2.setResult(r0)     // Catch: java.lang.Throwable -> L59
            goto L62
        L77:
            T extends com.idm.fotaagent.restapi.response.Response r0 = r3.response
            com.idm.fotaagent.restapi.response.Result r0 = r0.getResult()
            boolean r0 = r0.isSuccess()
            if (r0 != 0) goto L97
            boolean r0 = r3.onRetry()
            if (r0 != 0) goto L12
            goto L97
        L8a:
            r1.disconnect()
            throw r3
        L8e:
            java.lang.String r1 = "Fail to open connection!"
            com.samsung.android.fotaagent.common.log.Log.printStackTrace(r0, r1)
            goto L97
        L94:
            com.samsung.android.fotaagent.common.log.Log.printStackTrace(r0)
        L97:
            java.lang.String r0 = "================================================================= ]]"
            com.samsung.android.fotaagent.common.log.Log.I(r0)
            r3.closeNetworkApn()
            T extends com.idm.fotaagent.restapi.response.Response r3 = r3.response
            com.idm.fotaagent.restapi.response.Result r3 = r3.getResult()
            boolean r3 = r3.isSuccess()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.fotaagent.restapi.restclient.BaseRestClient.execute():boolean");
    }

    public void generateAndValidateBody() throws OnSetUpFailedException {
        String strGenerateBody = generateBody();
        this.body = strGenerateBody;
        if (TextUtils.isEmpty(strGenerateBody)) {
            this.response.setResult(new Result(400));
            throw new OnSetUpFailedException("Body is empty");
        }
    }

    public String generateBody() {
        return null;
    }

    public String getHostUrl(Context context) throws MalformedURLException {
        boolean z4 = new AdminRepository(context).getServerType() == AdminRepository.ServerType.STAGING_SERVER;
        try {
            String strIdmGetServerId = IDMDatabaseManager.getInstance().getReleaseProfile().idmGetServerId();
            return z4 ? getServerUrlByXAddrPath(strIdmGetServerId, REGIST_STAGING_ADDR_NODE) : getServerUrlByXAddrPath(strIdmGetServerId, REGIST_ADDR_NODE);
        } catch (IDMMoExceptionNotFound e5) {
            Log.printStackTrace(e5);
            throw new MalformedURLException(e5.getMessage());
        }
    }

    public abstract String getHttpMethod();

    public abstract RequestPropertiesForOsp getRequestProperties(ObjectRequest objectRequest);

    public T getResponse() {
        return this.response;
    }

    public String getServerUrlByXAddrPath(String str, String str2) {
        return IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoGetNodeInfo(str, IDMDatabaseInterface.IDM_ACC + str + "/AppAddr/" + str2 + IDMDmInterface.IDM_DMACC_PATH_ADDR).idmMoNodeGetValue();
    }

    public abstract String getUrl();

    public boolean isNetworkAvailable(Context context, boolean z4) {
        if (!z4 && NetworkUtil.isBlockedByRoaming(context)) {
            Log.E("FAIL_NETWORK by roaming");
            return false;
        }
        if (NetworkUtil.isAnyNetworkConnected(context)) {
            return true;
        }
        Log.E("FAIL_NETWORK by no network");
        return false;
    }

    public void onHttpResponseFailure(HttpURLConnection httpURLConnection) {
        this.strategyFactory.createOnHttpResponseFailureStrategy().parse(httpURLConnection, this.parser, this.response);
    }

    public void onHttpResponseSuccess(HttpURLConnection httpURLConnection) {
        this.response.setResult(new Result(200));
        this.strategyFactory.createOnHttpResponseSuccessStrategy().parse(httpURLConnection, this.parser, this.response);
    }

    public ObjectRequest onRequest() {
        URL url = getURL();
        if (url == null) {
            this.response.setResult(new Result(400));
            return null;
        }
        ObjectRequest objectRequest = new ObjectRequest(url);
        objectRequest.setMethod(getHttpMethod());
        String str = this.body;
        if (str != null) {
            objectRequest.setBody(str);
        }
        setProxy(objectRequest);
        objectRequest.setRequestProperties(getRequestProperties(objectRequest).toMap());
        return objectRequest;
    }

    public boolean onRetry() {
        return false;
    }

    public boolean onSetUp() {
        try {
            checkNetwork();
            generateAndValidateBody();
            openNetworkApnIfNeeded(this.context);
            return true;
        } catch (OnSetUpFailedException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public void openNetworkApnIfNeeded(Context context) throws OnSetUpFailedException {
        if (Flavor.Apn.usesConfiguredApn(FotaTelephonyManager.getDataSimSlotId(context))) {
            try {
                NetworkApnManager.get().open();
            } catch (IllegalStateException e5) {
                throw new OnSetUpFailedException(e5);
            }
        }
    }

    public void sendStream(HttpURLConnection httpURLConnection, String str) throws IOException {
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void sendStreamOrConnect(ObjectRequest objectRequest, HttpURLConnection httpURLConnection) throws IOException {
        if (!objectRequest.hasBody()) {
            httpURLConnection.connect();
        } else {
            httpURLConnection.setDoOutput(true);
            sendStream(httpURLConnection, objectRequest.getBody());
        }
    }

    public void setHostNameIfSslDisabled() {
        if (new AdminRepository(this.context).isSslCheckEnabled()) {
            return;
        }
        HttpsURLConnection.setDefaultHostnameVerifier(new a(0));
    }

    public void setProperties(ObjectRequest objectRequest, HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setRequestMethod(objectRequest.getMethod());
        httpURLConnection.setConnectTimeout(EternalContract.ONEUI_6_0_0);
        httpURLConnection.setReadTimeout(EternalContract.ONEUI_6_0_0);
        httpURLConnection.setDoInput(true);
        for (Map.Entry<String, String> entry : objectRequest.getRequestProperties().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public void setProxy(ObjectRequest objectRequest) {
        ProxyHandler proxyHandler = new ProxyHandler(this.context);
        String address = proxyHandler.getAddress();
        if (TextUtils.isEmpty(address)) {
            return;
        }
        objectRequest.setProxy(address, proxyHandler.getPort());
    }
}
