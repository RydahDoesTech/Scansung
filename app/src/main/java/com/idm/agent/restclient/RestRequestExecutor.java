package com.idm.agent.restclient;

import C1.b;
import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.callback.IDMCallbackStatus;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.common.IDMDeviceLockControl;
import com.idm.adapter.handler.AdaptersHolder;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.agent.restclient.RestRequest;
import com.idm.exception.http.IDMExceptionHttpConnect;
import com.idm.exception.http.IDMExceptionHttpNetwork;
import com.idm.network.IDMNetworkHttpAdapter;
import com.idm.network.IDMNetworkInterface;
import com.idm.network.IDMNetworkTimer;
import com.idm.service.actioninfo.IDMActionInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class RestRequestExecutor {
    private static final String LINE_SEPARATOR = "\r\n";
    private final IDMActionInfo actionInfo;
    private final IDMCallback callback;
    private final Context context;
    private final IDMNetworkInfoAdapter networkAdapter;
    private final RestRequest restRequest;
    private final String taskId;

    public RestRequestExecutor(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback, RestRequest restRequest) {
        this.context = context;
        this.actionInfo = iDMActionInfo;
        this.networkAdapter = adaptersHolder.getNetworkAdapter();
        this.callback = iDMCallback;
        this.restRequest = restRequest;
        this.taskId = iDMActionInfo.idmGetSessionId();
    }

    private void appendResponseBody(StringBuilder sb, HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArrIdmRecvHttpBodyDataUrlConnection = new IDMNetworkHttpAdapter().idmRecvHttpBodyDataUrlConnection(inputStream);
                if (bArrIdmRecvHttpBodyDataUrlConnection.length != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.reset();
                    byteArrayOutputStream.write(bArrIdmRecvHttpBodyDataUrlConnection, 0, bArrIdmRecvHttpBodyDataUrlConnection.length);
                    sb.append(byteArrayOutputStream);
                    sb.append(LINE_SEPARATOR);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private void createHttpHeader(HttpURLConnection httpURLConnection) {
        this.networkAdapter.idmMakeHttpHeader(this.actionInfo.idmGetAppId(), httpURLConnection, null, 0);
        if (!this.networkAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT, "application/vnd.oma.dd+xml");
        }
        if (!this.networkAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/vnd.oma.dd+xml");
        }
        if (this.networkAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH)) {
            return;
        }
        if (TextUtils.isEmpty(this.restRequest.getBody())) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH, "0");
        } else {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH, Integer.toString(this.restRequest.getBody().length()));
        }
    }

    private HttpURLConnection createUrlConnectionAndSend() throws IOException, IDMExceptionHttpNetwork, IDMExceptionHttpConnect {
        int iIdmGetAppId = this.actionInfo.idmGetAppId();
        IDMNetworkHttpAdapter iDMNetworkHttpAdapter = new IDMNetworkHttpAdapter();
        HttpURLConnection httpURLConnectionIdmCreateHttpUrlConnection = iDMNetworkHttpAdapter.idmCreateHttpUrlConnection(this.restRequest.getUrl(), this.networkAdapter.idmGetConnectNetworkTimeOut(iIdmGetAppId), this.networkAdapter.idmGetRecvNetworkTimeOut(iIdmGetAppId), this.networkAdapter.idmGetNetworkTrustInfo(iIdmGetAppId), this.networkAdapter);
        iDMNetworkHttpAdapter.idmSetRequestMethod(httpURLConnectionIdmCreateHttpUrlConnection, this.restRequest.getMethodType().toString());
        httpURLConnectionIdmCreateHttpUrlConnection.setDoInput(true);
        createHttpHeader(httpURLConnectionIdmCreateHttpUrlConnection);
        printRequestProperties(httpURLConnectionIdmCreateHttpUrlConnection);
        if (this.restRequest.getMethodType() == RestRequest.MethodType.REST_METHOD_POST) {
            iDMNetworkHttpAdapter.idmSendHttpUrlConnection(httpURLConnectionIdmCreateHttpUrlConnection, this.restRequest.getBody().getBytes(Charset.defaultCharset()), new IDMNetworkTimer(IDMNetworkInterface.IDMNetworkTimerMode.IDM_NETWORK_TIMER_MODE_CONNECT, this.networkAdapter.idmGetConnectNetworkTimeOut(iIdmGetAppId), this.networkAdapter.idmGetExtraTime(iIdmGetAppId), iDMNetworkHttpAdapter, httpURLConnectionIdmCreateHttpUrlConnection));
        } else {
            httpURLConnectionIdmCreateHttpUrlConnection.connect();
        }
        return httpURLConnectionIdmCreateHttpUrlConnection;
    }

    private void execute() {
        IDMDebug.I("App ID : " + this.actionInfo.idmGetAppId());
        HttpURLConnection httpURLConnectionCreateUrlConnectionAndSend = null;
        try {
            try {
                httpURLConnectionCreateUrlConnectionAndSend = createUrlConnectionAndSend();
                printResponseProperties(httpURLConnectionCreateUrlConnectionAndSend);
                int responseCode = httpURLConnectionCreateUrlConnectionAndSend.getResponseCode();
                IDMDebug.I("HTTP status is " + responseCode);
                IDMCallbackStatus iDMCallbackStatus = new IDMCallbackStatus();
                if (200 > responseCode || responseCode >= 300) {
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS_FAIL, 300, 505);
                } else {
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, 301, 0);
                }
                executeCallback(this.taskId, iDMCallbackStatus);
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
                executeFailureCallback();
                if (httpURLConnectionCreateUrlConnectionAndSend == null) {
                    return;
                }
            }
            httpURLConnectionCreateUrlConnectionAndSend.disconnect();
        } catch (Throwable th) {
            if (httpURLConnectionCreateUrlConnectionAndSend != null) {
                httpURLConnectionCreateUrlConnectionAndSend.disconnect();
            }
            throw th;
        }
    }

    private void executeCallback(String str, IDMCallbackStatus iDMCallbackStatus) {
        this.callback.idmOnStatus(str, iDMCallbackStatus);
    }

    private void executeFailureCallback() {
        IDMCallbackStatus iDMCallbackStatus = new IDMCallbackStatus();
        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS_FAIL, 300, 501);
        executeCallback(this.taskId, iDMCallbackStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        lock();
        execute();
        release();
    }

    private void lock() {
        IDMDebug.I("lock");
        IDMDeviceLockControl.getInstance().idmLockAcquire(this.context, 1);
    }

    private void printRequestProperties(HttpURLConnection httpURLConnection) {
        StringBuilder sb = new StringBuilder("\r\n-----------Device RestClient RequestProperty-----------\r\n \r\n");
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
            sb.append(entry.getKey());
            sb.append(": ");
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(LINE_SEPARATOR);
            }
        }
        if (!TextUtils.isEmpty(this.restRequest.getBody())) {
            sb.append(LINE_SEPARATOR);
            sb.append(this.restRequest.getBody());
        }
        sb.append("\r\n---------------- End ----------------");
        IDMDebug.H(sb.toString());
    }

    private void printResponseProperties(HttpURLConnection httpURLConnection) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n-----------Device RestClient response -----------\r\n");
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            sb.append(entry.getKey());
            sb.append(": ");
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(LINE_SEPARATOR);
            }
        }
        sb.append(LINE_SEPARATOR);
        appendResponseBody(sb, httpURLConnection);
        sb.append("---------------- End ----------------");
        IDMDebug.H(sb.toString());
    }

    private void release() {
        IDMDebug.I("release");
        IDMDeviceLockControl.getInstance().idmLockRelease();
    }

    public void start() {
        new Thread(new b(24, this)).start();
    }
}
