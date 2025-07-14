package com.idm.adapter.networkinfo;

import android.net.Network;
import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.network.IDMNetworkInterface;
import com.idm.network.IDMNetworkXTPTrustManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import o.C0704b;
import o.C0710h;

/* loaded from: classes.dex */
public abstract class IDMNetworkInfoAdapter implements IDMNetworkInterface, IDMDmInterface {
    private int[] networkRetryCount = new int[2];
    private int[] connectNetworkTimeOut = new int[2];
    private int[] recvNetworkTimeOut = new int[2];
    private int[] extraTime = new int[2];
    private C0704b httpHeadersMap = new C0704b();
    private Network mNetwork = null;

    public IDMNetworkInfoAdapter() {
        int i5 = 0;
        while (true) {
            int[] iArr = this.networkRetryCount;
            if (i5 >= iArr.length) {
                return;
            }
            iArr[i5] = 3;
            this.connectNetworkTimeOut[i5] = 60000;
            this.recvNetworkTimeOut[i5] = 60000;
            this.extraTime[i5] = 10;
            i5++;
        }
    }

    public boolean idmCheckContentTypeIfNecessary() {
        return true;
    }

    public abstract void idmCustomApnClose();

    public abstract boolean idmCustomApnOpen();

    public int idmGetConnectNetworkTimeOut(int i5) {
        return this.connectNetworkTimeOut[i5];
    }

    public int idmGetExtraTime(int i5) {
        return this.extraTime[i5];
    }

    public C0704b idmGetHttpHeadersMap() {
        return this.httpHeadersMap;
    }

    public abstract boolean idmGetIsCustomApn();

    public abstract boolean idmGetIsProxy();

    public boolean idmGetIsSSLCheck() {
        return false;
    }

    public Network idmGetNetwork() {
        return this.mNetwork;
    }

    public int idmGetNetworkRetryCount(int i5) {
        return this.networkRetryCount[i5];
    }

    public SSLSocketFactory idmGetNetworkTrustInfo(int i5) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new IDMNetworkXTPTrustManager(null, idmGetIsSSLCheck())}, new SecureRandom());
            sSLContext.getServerSessionContext().setSessionTimeout(idmGetConnectNetworkTimeOut(i5));
            return sSLContext.getSocketFactory();
        } catch (RuntimeException | GeneralSecurityException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public abstract String idmGetObjectUrlAddNetworkInfo(String str);

    public abstract String idmGetProxyIp();

    public abstract int idmGetProxyPort();

    public int idmGetRecvNetworkTimeOut(int i5) {
        return this.recvNetworkTimeOut[i5];
    }

    public void idmInitHttpHeadersMap() {
        this.httpHeadersMap = new C0704b();
    }

    public void idmMakeHttpHeader(int i5, HttpURLConnection httpURLConnection, String str, int i6) {
        IDMDebug.I("idmMakeHttpHeader");
        Iterator it = ((C0710h) this.httpHeadersMap.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!idmGetHttpHeadersMap().containsKey("User-Agent")) {
            httpURLConnection.setRequestProperty("User-Agent", IDMNetworkInterface.IDM_HTTP_DM_USER_AGENT);
        }
        if (!idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONNECTION)) {
            if (i6 == 0) {
                httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONNECTION, IDMNetworkInterface.IDM_HTTP_CLOSE);
            } else {
                httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONNECTION, IDMNetworkInterface.IDM_HTTP_KEEPALIVE);
            }
        }
        if (!idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/vnd.syncml.dm+wbxml");
        }
        if (!idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT, "application/vnd.syncml.dm+wbxml");
        }
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_X_SYNCML_HMAC, str);
        }
        URL url = httpURLConnection.getURL();
        httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_HOST, url.getHost() + ":" + (url.getPort() == -1 ? url.getDefaultPort() : url.getPort()));
    }

    public void idmSetConnectNetworkTimeOut(int i5, int i6) {
        this.connectNetworkTimeOut[i5] = i6;
    }

    public void idmSetExtraTime(int i5, int i6) {
        this.extraTime[i5] = i6;
    }

    public void idmSetHttpHeadersMap(String str, String str2) {
        this.httpHeadersMap.put(str, str2);
    }

    public abstract void idmSetIsCustomApn();

    public abstract void idmSetIsProxy(boolean z4);

    public void idmSetNetwork(Network network) {
        this.mNetwork = network;
    }

    public void idmSetNetworkRetryCount(int i5, int i6) {
        this.networkRetryCount[i5] = i6;
    }

    public abstract void idmSetProxyIp(String str);

    public abstract void idmSetProxyPort(int i5);

    public void idmSetRecvNetworkTimeOut(int i5, int i6) {
        this.recvNetworkTimeOut[i5] = i6;
    }

    public void idmSocketTrafficStats() {
        IDMDebug.I("No traffic stats");
    }
}
