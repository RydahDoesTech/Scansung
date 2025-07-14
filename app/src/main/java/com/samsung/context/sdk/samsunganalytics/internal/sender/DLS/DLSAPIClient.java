package com.samsung.context.sdk.samsunganalytics.internal.sender.DLS;

import I2.a;
import I2.b;
import android.net.Uri;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.internal.connection.API;
import com.samsung.context.sdk.samsunganalytics.internal.security.CertificateManager;
import com.samsung.context.sdk.samsunganalytics.internal.sender.LogType;
import com.samsung.context.sdk.samsunganalytics.internal.sender.SimpleLog;
import com.samsung.context.sdk.samsunganalytics.internal.util.AuthUtil;
import com.samsung.context.sdk.samsunganalytics.internal.util.ClientUtil;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Queue;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DLSAPIClient implements b {
    private static final int DEFAULT_TIMEOUT_IN_MILLISECONDS = 3000;
    private static final API REALTIME_API = API.SEND_LOG;
    private static final API RTB_API = API.SEND_BUFFERED_LOG;
    private final a asyncTaskCallback;
    private HttpsURLConnection conn;
    private Boolean isBatch;
    private final LogType logType;
    private Queue<SimpleLog> logs;
    private SimpleLog simpleLog;
    private final String trid;

    public DLSAPIClient(SimpleLog simpleLog, String str, a aVar) {
        this.conn = null;
        this.isBatch = Boolean.FALSE;
        this.simpleLog = simpleLog;
        this.trid = str;
        this.asyncTaskCallback = aVar;
        this.logType = simpleLog.getType();
    }

    private void callback(int i5, String str) {
        if (this.asyncTaskCallback == null) {
            return;
        }
        if (i5 == 200 && str.equalsIgnoreCase("1000")) {
            return;
        }
        if (!this.isBatch.booleanValue()) {
            this.asyncTaskCallback.onFail(i5, this.simpleLog.getTimestamp() + "", this.simpleLog.getData(), this.simpleLog.getType().getAbbrev());
            return;
        }
        while (!this.logs.isEmpty()) {
            SimpleLog simpleLogPoll = this.logs.poll();
            this.asyncTaskCallback.onFail(i5, simpleLogPoll.getTimestamp() + "", simpleLogPoll.getData(), simpleLogPoll.getType().getAbbrev());
        }
    }

    private void cleanUp(BufferedReader bufferedReader) throws IOException {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e5) {
                Debug.LogENG("[DLS Client] " + e5.getMessage());
                return;
            }
        }
        HttpsURLConnection httpsURLConnection = this.conn;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    private String getBody() {
        if (!this.isBatch.booleanValue()) {
            return this.simpleLog.getData();
        }
        Iterator<SimpleLog> it = this.logs.iterator();
        StringBuilder sb = new StringBuilder(it.next().getData());
        while (it.hasNext()) {
            SimpleLog next = it.next();
            sb.append(Utils.LOG_DELIMITER);
            sb.append(next.getData());
        }
        return sb.toString();
    }

    public a getCallback() {
        return this.asyncTaskCallback;
    }

    public SimpleLog getSimpleLog() {
        return this.simpleLog;
    }

    public String getTrid() {
        return this.trid;
    }

    @Override // I2.b
    public int onFinish() throws Throwable {
        int i5;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                int responseCode = this.conn.getResponseCode();
                BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(this.conn.getInputStream()));
                try {
                    String string = new JSONObject(bufferedReader3.readLine()).getString("rc");
                    if (responseCode == 200 && string.equalsIgnoreCase("1000")) {
                        Debug.LogD("[DLS Sender] send result success : " + responseCode + " " + string);
                        i5 = 1;
                    } else {
                        Debug.LogD("[DLS Sender] send result fail : " + responseCode + " " + string);
                        i5 = -7;
                    }
                    callback(responseCode, string);
                    cleanUp(bufferedReader3);
                    bufferedReader = string;
                } catch (Exception e5) {
                    e = e5;
                    bufferedReader2 = bufferedReader3;
                    Debug.LogE("[DLS Client] Send fail.");
                    Debug.LogENG("[DLS Client] " + e.getMessage());
                    callback(0, "");
                    cleanUp(bufferedReader2);
                    i5 = -41;
                    bufferedReader = bufferedReader2;
                    return i5;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader3;
                    cleanUp(bufferedReader);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
            return i5;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // I2.b
    public void run() {
        try {
            API api = this.isBatch.booleanValue() ? RTB_API : REALTIME_API;
            Uri.Builder builderBuildUpon = Uri.parse(api.getUrl()).buildUpon();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            builderBuildUpon.appendQueryParameter("ts", strValueOf).appendQueryParameter("type", this.logType.getAbbrev()).appendQueryParameter("tid", this.trid).appendQueryParameter("hc", AuthUtil.sha256(this.trid + strValueOf + ClientUtil.SALT));
            URL url = new URL(builderBuildUpon.build().toString());
            String body = getBody();
            if (TextUtils.isEmpty(body)) {
                Debug.LogW("[DLS Client] body is empty");
                return;
            }
            upload(url, body, api.getMethod());
            Debug.LogENG("[DLS Client] Send to DLS : " + body);
        } catch (Exception e5) {
            Debug.LogE("[DLS Client] Send fail.");
            Debug.LogENG("[DLS Client] " + e5.getMessage());
        }
    }

    public void upload(URL url, String str, String str2) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        this.conn = httpsURLConnection;
        httpsURLConnection.setSSLSocketFactory(CertificateManager.getInstance().getSSLContext().getSocketFactory());
        this.conn.setRequestMethod(str2);
        this.conn.addRequestProperty("Content-Encoding", this.isBatch.booleanValue() ? "gzip" : "text");
        this.conn.setConnectTimeout(3000);
        this.conn.setDoOutput(true);
        BufferedOutputStream bufferedOutputStream = this.isBatch.booleanValue() ? new BufferedOutputStream(new GZIPOutputStream(this.conn.getOutputStream())) : new BufferedOutputStream(this.conn.getOutputStream());
        bufferedOutputStream.write(str.getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public DLSAPIClient(LogType logType, Queue<SimpleLog> queue, String str, a aVar) {
        this.conn = null;
        this.logs = queue;
        this.trid = str;
        this.asyncTaskCallback = aVar;
        this.isBatch = Boolean.TRUE;
        this.logType = logType;
    }
}
