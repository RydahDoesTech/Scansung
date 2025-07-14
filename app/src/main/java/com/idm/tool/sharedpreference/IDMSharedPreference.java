package com.idm.tool.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class IDMSharedPreference {
    private static final String LOGFILE_SESSIONID_KEY = "LogFileSessionID";
    private static final String SDK_SHARED_PREF = "PrefSDK";
    private Context context;

    public IDMSharedPreference(Context context) {
        this.context = context;
    }

    private String idmGetSharedPreference(String str, String str2, String str3) {
        return this.context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    private void idmSetSharedPreference(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    public String getLogFileSessionID() {
        return idmGetSharedPreference(SDK_SHARED_PREF, LOGFILE_SESSIONID_KEY, "");
    }

    public void setLogFileSessionID(String str) {
        idmSetSharedPreference(SDK_SHARED_PREF, LOGFILE_SESSIONID_KEY, str);
    }
}
