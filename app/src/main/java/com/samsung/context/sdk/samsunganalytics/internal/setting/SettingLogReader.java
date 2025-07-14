package com.samsung.context.sdk.samsunganalytics.internal.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.internal.policy.Validation;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import g4.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class SettingLogReader {
    private static final int STATUS_LOG_BODY_LENGTH_LIMIT = 512;
    private final Set<String> appPrefNames;
    private final Context context;
    private final String threeDepthCollectionDelimiter;
    private final String twoDepthCollectionDelimiter;
    private final String twoDepthKeyValueDelimiter;

    public SettingLogReader(Context context) {
        this.context = context;
        this.appPrefNames = Preferences.getPreferences(context).getStringSet(Preferences.APP_PREF_NAMES, new HashSet());
        Utils.Depth depth = Utils.Depth.TWO_DEPTH;
        this.twoDepthKeyValueDelimiter = depth.getKeyValueDLM();
        this.twoDepthCollectionDelimiter = depth.getCollectionDLM();
        this.threeDepthCollectionDelimiter = Utils.Depth.THREE_DEPTH.getCollectionDLM();
    }

    private String convertSetToString(Set<String> set) {
        String strC = "";
        for (String str : set) {
            if (!TextUtils.isEmpty(strC)) {
                strC = strC + this.threeDepthCollectionDelimiter;
            }
            strC = f.c(strC, str);
            if (strC.length() >= 1024) {
                break;
            }
        }
        return strC;
    }

    private Map<String, String> getKeyValues(String str) {
        TreeMap treeMap = new TreeMap();
        Iterator<String> it = Preferences.getPreferences(this.context).getStringSet(str, new HashSet()).iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(this.threeDepthCollectionDelimiter, 2);
            treeMap.put(strArrSplit[0], strArrSplit.length == 2 ? strArrSplit[1] : "");
        }
        return treeMap;
    }

    private SharedPreferences getPreference(String str) {
        return this.context.getSharedPreferences(str, 0);
    }

    public List<String> read() {
        if (this.appPrefNames.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strC = "";
        for (String str : this.appPrefNames) {
            Map<String, ?> all = getPreference(str).getAll();
            for (Map.Entry<String, String> entry : getKeyValues(str).entrySet()) {
                Object obj = all.get(entry.getKey());
                String value = obj == null ? entry.getValue() : !(obj instanceof Set) ? String.valueOf(obj) : convertSetToString((Set) obj);
                String strCheckSizeLimit = Validation.checkSizeLimit(entry.getKey(), 100);
                String strCheckSizeLimit2 = Validation.checkSizeLimit(value, 1024);
                StringBuilder sb = new StringBuilder();
                sb.append(strCheckSizeLimit);
                String strP = A3.f.p(sb, this.twoDepthKeyValueDelimiter, strCheckSizeLimit2);
                if (!TextUtils.isEmpty(strC)) {
                    if (strP.length() + strC.length() > 512) {
                        arrayList.add(strC);
                        strC = "";
                    } else {
                        strC = strC + this.twoDepthCollectionDelimiter;
                    }
                }
                strC = f.c(strC, strP);
            }
        }
        if (!strC.isEmpty()) {
            arrayList.add(strC);
        }
        return arrayList;
    }
}
