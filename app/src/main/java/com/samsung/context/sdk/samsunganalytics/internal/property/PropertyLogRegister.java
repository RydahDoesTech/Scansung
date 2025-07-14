package com.samsung.context.sdk.samsunganalytics.internal.property;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import java.util.Map;

/* loaded from: classes.dex */
public class PropertyLogRegister {
    private final Context context;

    public PropertyLogRegister(Context context) {
        this.context = context;
    }

    public void registerLog(Map<String, String> map) {
        map.remove("t");
        SharedPreferences propertyPreferences = Preferences.getPropertyPreferences(this.context);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (TextUtils.isEmpty(entry.getValue())) {
                propertyPreferences.edit().remove(entry.getKey()).apply();
            } else {
                propertyPreferences.edit().putString(entry.getKey(), entry.getValue()).apply();
            }
        }
    }
}
