package com.idm.network;

import android.net.Network;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.exception.http.IDMExceptionHttpConnect;
import com.idm.exception.http.IDMExceptionHttpHeader;
import com.idm.exception.http.IDMExceptionHttpNetwork;
import com.idm.exception.http.IDMExceptionHttpReceive;
import com.idm.exception.http.IDMExceptionHttpSend;
import com.idm.exception.http.IDMExceptionHttpUrlConnect;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class IDMNetworkHttpAdapter implements IDMNetworkInterface {
    private byte[] idmGetDataStream(InputStream inputStream) throws IDMExceptionHttpReceive, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i5 = inputStream.read(bArr);
                if (i5 <= 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            } catch (IOException e5) {
                throw new IDMExceptionHttpReceive(e5);
            }
        }
    }

    private byte[] idmGetDataStreamUsingBuffer(InputStream inputStream, int i5) throws IDMExceptionHttpReceive, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i5];
        try {
            int i6 = inputStream.read(bArr);
            if (i6 > 0) {
                byteArrayOutputStream.write(bArr, 0, i6);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            throw new IDMExceptionHttpReceive(e5);
        }
    }

    private int idmGetHttpHeaderResponseCode(HttpURLConnection httpURLConnection) throws IDMExceptionHttpReceive, IOException {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("\r\n");
                }
            }
            sb.append("\r\n");
            IDMDebug.H(sb.toString());
            int responseCode = httpURLConnection.getResponseCode();
            IDMDebug.I("statusCode : " + responseCode);
            return responseCode;
        } catch (SSLException e5) {
            throw new IDMExceptionHttpReceive(e5);
        } catch (IOException e6) {
            throw new IDMExceptionHttpReceive(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$idmCreateHttpUrlConnection$1(String str, SSLSession sSLSession) {
        return true;
    }

    private HttpURLConnection openConnection(URL url, Proxy proxy, Network network) {
        return proxy == null ? network == null ? (HttpURLConnection) url.openConnection() : (HttpURLConnection) network.openConnection(url) : network == null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) network.openConnection(url, proxy);
    }

    public void idmConnectHttpUrlConnection(HttpURLConnection httpURLConnection, IDMNetworkTimer iDMNetworkTimer) throws IOException {
        try {
            httpURLConnection.connect();
            iDMNetworkTimer.idmNetworkEndTimer();
        } catch (IOException e5) {
            throw new IDMExceptionHttpUrlConnect(e5);
        }
    }

    public HttpURLConnection idmCreateHttpUrlConnection(String str, int i5, int i6, SSLSocketFactory sSLSocketFactory, IDMNetworkInfoAdapter iDMNetworkInfoAdapter) throws IDMExceptionHttpNetwork {
        HttpURLConnection httpURLConnectionOpenConnection = null;
        try {
            httpURLConnectionOpenConnection = openConnection(new URL(str), iDMNetworkInfoAdapter.idmGetIsProxy() ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress(iDMNetworkInfoAdapter.idmGetProxyIp(), iDMNetworkInfoAdapter.idmGetProxyPort())) : null, iDMNetworkInfoAdapter.idmGetNetwork());
            if (str.contains("https")) {
                IDMDebug.I("idmCreateHttpUrlConnection https");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionOpenConnection;
                if (iDMNetworkInfoAdapter.idmGetIsSSLCheck()) {
                    IDMDebug.I("set HostNameVerifier : default");
                    final HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
                    httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.idm.network.a
                        @Override // javax.net.ssl.HostnameVerifier
                        public final boolean verify(String str2, SSLSession sSLSession) {
                            return defaultHostnameVerifier.verify(str2, sSLSession);
                        }
                    });
                } else {
                    IDMDebug.I("set HostNameVerifier : true");
                    httpsURLConnection.setHostnameVerifier(new com.idm.fotaagent.restapi.restclient.a(1));
                }
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
            httpURLConnectionOpenConnection.setConnectTimeout(i5);
            httpURLConnectionOpenConnection.setReadTimeout(i6);
            return httpURLConnectionOpenConnection;
        } catch (Exception e5) {
            if (httpURLConnectionOpenConnection != null) {
                httpURLConnectionOpenConnection.disconnect();
            }
            throw new IDMExceptionHttpNetwork(e5);
        }
    }

    public void idmDisconnectHttpUrlConnection(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void idmDisplayHttpHeaderRequestCode(HttpURLConnection httpURLConnection) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
            sb.append(entry.getKey());
            sb.append(": ");
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("\r\n");
            }
        }
        sb.append("\r\n");
        IDMDebug.H("Request header = " + ((Object) sb));
    }

    public byte[] idmRecvHttpBodyDataUrlConnection(InputStream inputStream, int i5) {
        return idmGetDataStreamUsingBuffer(inputStream, i5);
    }

    public void idmRecvHttpHeaderUrlConnection(HttpURLConnection httpURLConnection, IDMNetworkHttpHeaderInfo iDMNetworkHttpHeaderInfo, IDMNetworkTimer iDMNetworkTimer) throws IDMExceptionHttpReceive, IDMExceptionHttpHeader, IOException {
        int iIdmGetHttpHeaderResponseCode = idmGetHttpHeaderResponseCode(httpURLConnection);
        iDMNetworkTimer.idmNetworkEndTimer();
        if (200 > iIdmGetHttpHeaderResponseCode || iIdmGetHttpHeaderResponseCode >= 300) {
            iDMNetworkHttpHeaderInfo.idmSetResponseCode(iIdmGetHttpHeaderResponseCode);
            throw new IDMExceptionHttpHeader("HTTP Header Response Code Error!!!");
        }
        iDMNetworkHttpHeaderInfo.idmSetContentType(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE));
        iDMNetworkHttpHeaderInfo.idmSetContentLength(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH));
        iDMNetworkHttpHeaderInfo.idmSetMacData(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_X_SYNCML_HMAC));
        iDMNetworkHttpHeaderInfo.idmSetConnectionType(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_CONNECTION));
    }

    public byte[] idmRecvHttpUrlConnection(HttpURLConnection httpURLConnection, IDMNetworkHttpHeaderInfo iDMNetworkHttpHeaderInfo, IDMNetworkTimer iDMNetworkTimer) throws IDMExceptionHttpReceive, IOException {
        IDMDebug.I("idmRecvHttpUrlConnection");
        InputStream inputStream = null;
        try {
            try {
                int iIdmGetHttpHeaderResponseCode = idmGetHttpHeaderResponseCode(httpURLConnection);
                iDMNetworkTimer.idmNetworkEndTimer();
                if (200 > iIdmGetHttpHeaderResponseCode || iIdmGetHttpHeaderResponseCode >= 300) {
                    iDMNetworkHttpHeaderInfo.idmSetResponseCode(iIdmGetHttpHeaderResponseCode);
                    if (httpURLConnection.getErrorStream() != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream(), Charset.defaultCharset()));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            IDMDebug.I(line);
                        }
                        IDMDebug.I(httpURLConnection.getErrorStream().toString());
                    }
                    throw new IDMExceptionHttpHeader("HTTP Header Response Code Error!!!");
                }
                iDMNetworkHttpHeaderInfo.idmSetContentType(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE));
                iDMNetworkHttpHeaderInfo.idmSetMacData(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_X_SYNCML_HMAC));
                iDMNetworkHttpHeaderInfo.idmSetConnectionType(httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_CONNECTION));
                InputStream inputStream2 = httpURLConnection.getInputStream();
                byte[] bArrIdmGetDataStream = idmGetDataStream(inputStream2);
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e5) {
                        throw new IDMExceptionHttpReceive(e5);
                    }
                }
                return bArrIdmGetDataStream;
            } catch (IOException e6) {
                throw new IDMExceptionHttpReceive(e6);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new IDMExceptionHttpReceive(e7);
                }
            }
            throw th;
        }
    }

    public void idmSendHttpUrlConnection(HttpURLConnection httpURLConnection, byte[] bArr, IDMNetworkTimer iDMNetworkTimer) {
        try {
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(bArr);
                    outputStream.flush();
                    outputStream.close();
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                throw new IDMExceptionHttpSend(e5);
            }
        } finally {
            iDMNetworkTimer.idmNetworkEndTimer();
        }
    }

    public void idmSetRequestMethod(HttpURLConnection httpURLConnection, String str) throws ProtocolException, IDMExceptionHttpConnect {
        try {
            httpURLConnection.setRequestMethod(str);
        } catch (ProtocolException e5) {
            throw new IDMExceptionHttpConnect(e5);
        }
    }

    public byte[] idmRecvHttpBodyDataUrlConnection(InputStream inputStream) {
        return idmGetDataStream(inputStream);
    }
}
