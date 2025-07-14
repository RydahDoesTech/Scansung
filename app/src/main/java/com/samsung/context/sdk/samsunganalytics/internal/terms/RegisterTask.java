package com.samsung.context.sdk.samsunganalytics.internal.terms;

import I2.a;
import I2.b;
import android.net.Uri;
import android.text.TextUtils;
import com.idm.network.IDMNetworkInterface;
import com.samsung.context.sdk.samsunganalytics.internal.connection.API;
import com.samsung.context.sdk.samsunganalytics.internal.policy.Constants;
import com.samsung.context.sdk.samsunganalytics.internal.security.CertificateManager;
import com.samsung.context.sdk.samsunganalytics.internal.util.AuthUtil;
import com.samsung.context.sdk.samsunganalytics.internal.util.ClientUtil;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RegisterTask implements b {
    private final a callback;
    private final String deviceID;
    private final long timestamp;
    private final String trid;
    private final API api = API.DATA_DELETE;
    private HttpsURLConnection conn = null;

    public RegisterTask(String str, String str2, long j5, a aVar) {
        this.trid = str;
        this.deviceID = str2;
        this.timestamp = j5;
        this.callback = aVar;
    }

    private void callback(int i5, String str) {
        if (this.callback == null) {
            return;
        }
        if (i5 == 200 && str.equalsIgnoreCase("1000")) {
            this.callback.onSuccess(0, "", "", "");
        } else {
            this.callback.onFail(i5, str, "", "");
        }
    }

    private void cleanUp(BufferedReader bufferedReader, InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                Debug.LogENG("[Register Client] " + e5.getMessage());
                return;
            }
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        HttpsURLConnection httpsURLConnection = this.conn;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    private String makeRequestBody() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", this.trid);
            jSONObject.put("lid", this.deviceID);
            jSONObject.put("ts", String.valueOf(this.timestamp));
        } catch (JSONException e5) {
            Debug.logwingW("failed to make body" + e5.getMessage());
        }
        return jSONObject.toString();
    }

    public a getCallback() {
        return this.callback;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getTrid() {
        return this.trid;
    }

    @Override // I2.b
    public int onFinish() throws Throwable {
        InputStream errorStream;
        BufferedReader bufferedReader = null;
        bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        bufferedReader = null;
        try {
            try {
                int responseCode = this.conn.getResponseCode();
                errorStream = responseCode >= 400 ? this.conn.getErrorStream() : this.conn.getInputStream();
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(errorStream));
                    try {
                        String string = new JSONObject(bufferedReader3.readLine()).getString("rc");
                        if (responseCode == 200 && string.equalsIgnoreCase("1000")) {
                            Debug.LogENG("Success : " + responseCode + " " + string);
                        } else {
                            Debug.LogENG("Fail : " + responseCode + " " + string);
                        }
                        callback(responseCode, string);
                        cleanUp(bufferedReader3, errorStream);
                        bufferedReader = string;
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader3;
                        callback(0, "");
                        cleanUp(bufferedReader2, errorStream);
                        bufferedReader = bufferedReader2;
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader3;
                        cleanUp(bufferedReader, errorStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                errorStream = null;
            } catch (Throwable th2) {
                th = th2;
                errorStream = null;
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // I2.b
    public void run() {
        try {
            Uri.Builder builderBuildUpon = Uri.parse(this.api.getUrl()).buildUpon();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            builderBuildUpon.appendQueryParameter("tid", this.trid).appendQueryParameter("ts", strValueOf).appendQueryParameter("hc", AuthUtil.sha256(this.trid + strValueOf + ClientUtil.SALT));
            URL url = new URL(builderBuildUpon.build().toString());
            String strMakeRequestBody = makeRequestBody();
            if (TextUtils.isEmpty(strMakeRequestBody)) {
                Debug.LogW("[Register Client] body is empty");
            } else {
                upload(url, strMakeRequestBody);
            }
        } catch (Exception e5) {
            Debug.LogENG("[Register Client] " + e5.getMessage());
        }
    }

    public void upload(URL url, String str) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        this.conn = httpsURLConnection;
        httpsURLConnection.setSSLSocketFactory(CertificateManager.getInstance().getSSLContext().getSocketFactory());
        this.conn.setRequestMethod(this.api.getMethod());
        this.conn.setConnectTimeout(Constants.TIMEOUT_IN_MILLISECONDS);
        this.conn.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/json");
        this.conn.setDoOutput(true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.conn.getOutputStream());
        bufferedOutputStream.write(str.getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
