package com.samsung.android.fotaagent.common.feature;

import com.idm.fotaagent.IDMApplication;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public enum InRoaming {
    MOBILE_ALLOWED { // from class: com.samsung.android.fotaagent.common.feature.InRoaming.1
        @Override // com.samsung.android.fotaagent.common.feature.InRoaming
        public boolean matches(List<String> list) {
            return list.size() == 1 && InRoaming.ACTION_ROAMINGINFO.equals(list.get(0));
        }
    },
    DOMESTIC_MOBILE_ALLOWED { // from class: com.samsung.android.fotaagent.common.feature.InRoaming.2
        @Override // com.samsung.android.fotaagent.common.feature.InRoaming
        public boolean matches(List<String> list) {
            if (list.size() == 1) {
                return InRoaming.ACTION_DOMESTICROAMING.equals(list.get(0));
            }
            return false;
        }
    },
    ONLY_WIFI_ALLOWED { // from class: com.samsung.android.fotaagent.common.feature.InRoaming.3
        @Override // com.samsung.android.fotaagent.common.feature.InRoaming
        public boolean matches(List<String> list) {
            return list.size() == 1 ? InRoaming.ACTION_ONLYWIFI.equals(list.get(0)) : list.size() == 2 && InRoaming.ACTION_ONLYWIFI.equals(list.get(0)) && InRoaming.ACTION_ROAMINGINFO.equals(list.get(1));
        }
    },
    ONLY_WIFI_PULL_ALLOWED { // from class: com.samsung.android.fotaagent.common.feature.InRoaming.4
        @Override // com.samsung.android.fotaagent.common.feature.InRoaming
        public boolean matches(List<String> list) {
            return list.size() == 1 ? InRoaming.ACTION_ONLYWIFIPULL.equals(list.get(0)) : list.size() == 2 && InRoaming.ACTION_ONLYWIFIPULL.equals(list.get(0)) && InRoaming.ACTION_ROAMINGINFO.equals(list.get(1));
        }
    };

    static final String ACTION_DOMESTICROAMING = "domestic_roaming";
    static final String ACTION_ONLYWIFI = "onlywifi";
    static final String ACTION_ONLYWIFIPULL = "onlywifipull";
    static final String ACTION_ROAMINGINFO = "roaminginfo";
    private static InRoaming inRoaming = getFeature();

    public static InRoaming get() {
        return inRoaming;
    }

    private static List<String> getActions() {
        int dataSimSlotId = FotaTelephonyManager.getDataSimSlotId(IDMApplication.idmGetContext());
        ArrayList arrayList = new ArrayList();
        for (String str : CarrierFeature.getActionDuringRoaming(dataSimSlotId).split(",")) {
            arrayList.add(str.trim());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static InRoaming getFeature() {
        List<String> actions = getActions();
        for (InRoaming inRoaming2 : values()) {
            if (inRoaming2.matches(actions)) {
                Log.I("roaming action: " + inRoaming2);
                return inRoaming2;
            }
        }
        Log.W("unexpected action: " + actions);
        return ONLY_WIFI_ALLOWED;
    }

    public static void reloadFeature() {
        inRoaming = getFeature();
    }

    public abstract boolean matches(List<String> list);
}
