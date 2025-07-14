package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final long f6173d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f6174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6175b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6176c;

    public s(String str, String str2, long j5) {
        this.f6174a = str;
        this.f6175b = str2;
        this.f6176c = j5;
    }

    public static String a(String str, String str2, long j5) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put(Preferences.PREFS_KEY_APP_VERSION, str2);
            jSONObject.put("timestamp", j5);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e5.toString()));
            return null;
        }
    }

    public static s b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new s(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new s(jSONObject.getString("token"), jSONObject.getString(Preferences.PREFS_KEY_APP_VERSION), jSONObject.getLong("timestamp"));
        } catch (JSONException e5) {
            Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e5.toString()));
            return null;
        }
    }
}
