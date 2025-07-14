package com.samsung.context.sdk.samsunganalytics.internal.policy;

import I2.b;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.internal.Callback;
import com.samsung.context.sdk.samsunganalytics.internal.connection.API;
import com.samsung.context.sdk.samsunganalytics.internal.connection.Directory;
import com.samsung.context.sdk.samsunganalytics.internal.connection.Domain;
import com.samsung.context.sdk.samsunganalytics.internal.security.CertificateManager;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PolicyClient implements b {
    private static final int RESULT_CODE_INVALID_TID = 1201;
    private static final int RESULT_CODE_SUCCESS = 1000;
    private final API api;
    private final Callback<Void, Boolean> callback;
    private HttpsURLConnection conn = null;
    private final SharedPreferences pref;
    private final Map<String, String> qParams;

    public PolicyClient(API api, Map<String, String> map, SharedPreferences sharedPreferences, Callback<Void, Boolean> callback) {
        this.api = api;
        this.qParams = map;
        this.pref = sharedPreferences;
        this.callback = callback;
    }

    private void cleanUp(BufferedReader bufferedReader) throws IOException {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
                return;
            }
        }
        HttpsURLConnection httpsURLConnection = this.conn;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    private void save(JSONObject jSONObject) {
        try {
            this.pref.edit().putInt(Constants.KEY_DATA_ONCE_QUOTA, jSONObject.getInt(Constants.KEY_DATA_ONCE_QUOTA) * 1024).putInt(Constants.KEY_DATA_QUOTA, jSONObject.getInt(Constants.KEY_DATA_QUOTA) * 1024).putInt(Constants.KEY_WIFI_ONCE_QUOTA, jSONObject.getInt(Constants.KEY_WIFI_ONCE_QUOTA) * 1024).putInt(Constants.KEY_WIFI_QUOTA, jSONObject.getInt(Constants.KEY_WIFI_QUOTA) * 1024).putString(Constants.KEY_DLS_DOMAIN, "https://" + jSONObject.getString(Constants.KEY_DLS_DOMAIN)).putString(Constants.KEY_DLS_URI, jSONObject.getString(Constants.KEY_DLS_URI)).putString(Constants.KEY_DLS_URI_BAT, jSONObject.getString(Constants.KEY_DLS_URI_BAT)).putString(Constants.KEY_LOG_TYPE, jSONObject.getString(Constants.KEY_LOG_TYPE)).putInt(Constants.POLICY_RINT, jSONObject.getInt(Constants.POLICY_RINT)).putLong(Constants.POLICY_RECEIVED_DATE, System.currentTimeMillis()).apply();
            Domain.DLS.setDomain("https://" + jSONObject.getString(Constants.KEY_DLS_DOMAIN));
            Directory.DLS_DIR.setDirectory(jSONObject.getString(Constants.KEY_DLS_URI));
            Directory.DLS_DIR_BAT.setDirectory(jSONObject.getString(Constants.KEY_DLS_URI_BAT));
            Debug.LogENG("dq-3g: " + (jSONObject.getInt(Constants.KEY_DATA_QUOTA) * 1024) + ", dq-w: " + (jSONObject.getInt(Constants.KEY_WIFI_QUOTA) * 1024) + ", oq-3g: " + (jSONObject.getInt(Constants.KEY_DATA_ONCE_QUOTA) * 1024) + ", oq-w: " + (jSONObject.getInt(Constants.KEY_WIFI_ONCE_QUOTA) * 1024));
        } catch (JSONException e5) {
            Debug.logwingE("Fail to save policy" + e5.getMessage());
            Debug.LogENG("[GetPolicyClient] " + e5.getMessage());
        }
    }

    @Override // I2.b
    public int onFinish() throws Throwable {
        int i5;
        BufferedReader bufferedReader = null;
        try {
            try {
                if (this.conn.getResponseCode() != 200) {
                    Debug.LogE("Fail to get Policy. Response code : " + this.conn.getResponseCode());
                    i5 = -61;
                } else {
                    i5 = 0;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.conn.getInputStream()));
                try {
                    String line = bufferedReader2.readLine();
                    Debug.LogENG(line);
                    JSONObject jSONObject = new JSONObject(line);
                    int i6 = jSONObject.getInt("rc");
                    if (i6 == 1000) {
                        Debug.LogD("GetPolicyClient", "Get Policy Success");
                        if (TextUtils.isEmpty(this.pref.getString(Constants.KEY_LOG_TYPE, "")) && this.callback != null && jSONObject.getString(Constants.KEY_LOG_TYPE).equals(Constants.VALUE_LOG_TYPE_MIX)) {
                            this.callback.onResult(Boolean.TRUE);
                        }
                        save(jSONObject);
                    } else if (i6 == RESULT_CODE_INVALID_TID) {
                        Debug.LogD("GetPolicyClient", "Result code : 1201, quota should be changed to zero");
                        this.pref.edit().putInt(Constants.KEY_DATA_ONCE_QUOTA, 0).putInt(Constants.KEY_DATA_QUOTA, 0).putInt(Constants.KEY_WIFI_ONCE_QUOTA, 0).putInt(Constants.KEY_WIFI_QUOTA, 0).putLong(Constants.POLICY_RECEIVED_DATE, System.currentTimeMillis()).apply();
                    } else {
                        Debug.logwingE("Fail to get Policy; Invalid Message. Result code : " + i6);
                        i5 = -61;
                    }
                    cleanUp(bufferedReader2);
                } catch (Exception unused) {
                    bufferedReader = bufferedReader2;
                    Debug.LogE("Fail to get Policy");
                    cleanUp(bufferedReader);
                    i5 = -61;
                    boolean zIsEmpty = TextUtils.isEmpty(this.pref.getString(Constants.KEY_DLS_DOMAIN, ""));
                    if (i5 == -61) {
                        this.pref.edit().putLong(Constants.POLICY_RECEIVED_DATE, System.currentTimeMillis()).apply();
                    }
                    return i5;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    cleanUp(bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.pref.getString(Constants.KEY_DLS_DOMAIN, ""));
        if (i5 == -61 && !zIsEmpty2) {
            this.pref.edit().putLong(Constants.POLICY_RECEIVED_DATE, System.currentTimeMillis()).apply();
        }
        return i5;
    }

    @Override // I2.b
    public void run() throws ProtocolException {
        try {
            Uri.Builder builderBuildUpon = Uri.parse(this.api.getUrl()).buildUpon();
            for (String str : this.qParams.keySet()) {
                builderBuildUpon.appendQueryParameter(str, this.qParams.get(str));
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(builderBuildUpon.build().toString()).openConnection();
            this.conn = httpsURLConnection;
            httpsURLConnection.setSSLSocketFactory(CertificateManager.getInstance().getSSLContext().getSocketFactory());
            this.conn.setRequestMethod(this.api.getMethod());
            this.conn.setConnectTimeout(Constants.TIMEOUT_IN_MILLISECONDS);
        } catch (Exception unused) {
            Debug.LogE("Fail to get Policy");
        }
    }
}
