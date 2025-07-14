package com.idm.fotaagent.enabler.adapter;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.feature.InRoaming;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class IDMAdapterDeviceInfoImpl extends IDMDeviceInfoAdapter {
    static final String NETWORK_CONNECT_TYPE_3G = "3G";
    static final String NETWORK_CONNECT_TYPE_5G = "5G";
    static final String NETWORK_CONNECT_TYPE_LTE = "LTE";
    static final String NETWORK_CONNECT_TYPE_WIFI = "WIFI";

    @Override // com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter
    public String idmGetDeviceID(Context context) {
        return new RegisteredDeviceRepository(context).getDeviceId().orElse(null);
    }

    @Override // com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter
    public ArrayList<String> idmGetExtendDevInfo() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(IDMAdapterCommandImpl.PATH_DEVNETWORKCONNTYPE);
        arrayList.add("./DevInfo/Ext/TelephonyMcc");
        arrayList.add("./DevInfo/Ext/TelephonyMnc");
        arrayList.add("./DevInfo/Ext/OmcCode");
        arrayList.add("./DevInfo/Ext/FotaClientVer");
        arrayList.add("./DevInfo/Ext/DMClientVer");
        arrayList.add("./DevInfo/Ext/ModemZeroBilling");
        if (!WifiOnlyChecker.getInstance().isWifiOnly()) {
            arrayList.add("./DevInfo/Ext/SIMCardMcc");
            arrayList.add("./DevInfo/Ext/SIMCardMnc");
        }
        if (DeviceUtils.isTSS2_0() && !TextUtils.isEmpty(DeviceUtils.getCountryIsoCode()) && !TextUtils.isEmpty(DeviceUtils.getActivatedId())) {
            arrayList.add("./DevInfo/Ext/AidCode");
            arrayList.add("./DevInfo/Ext/CountryISOCode");
        }
        if (new DeviceRegistrationRepository(IDMApplication.idmGetContext()).isInitialUpdate()) {
            arrayList.add("./DevInfo/Ext/InitialUpdate");
        }
        return arrayList;
    }

    public String idmGetUsingBearer(Context context) {
        String str;
        try {
            if (NetworkUtil.isWiFiNetworkConnected(context)) {
                str = NETWORK_CONNECT_TYPE_WIFI;
            } else {
                int dataNetworkType = FotaTelephonyManager.getDataNetworkType(context);
                str = dataNetworkType != 13 ? dataNetworkType != 20 ? "3G" : NETWORK_CONNECT_TYPE_5G : NETWORK_CONNECT_TYPE_LTE;
            }
            Log.H("szBearer : ".concat(str));
            return str;
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    @Override // com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter
    public boolean idmIsAvailableFOTAWithRoamingNetwork(Context context, String str) {
        if (new AdminRepository(context).isRoamingCheckEnabled()) {
            return (NetworkUtil.isConnectedDataNetworkDomesticRoaming(context) && InRoaming.get() == InRoaming.DOMESTIC_MOBILE_ALLOWED) || !NetworkUtil.isConnectedDataNetworkRoaming(context) || InRoaming.get() == InRoaming.MOBILE_ALLOWED;
        }
        return true;
    }
}
