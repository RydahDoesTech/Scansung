package com.idm.fotaagent.enabler.fumo.proxy;

import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ProxyHandler {
    private final Context context;
    private String proxyAddress = "";
    private int proxyPort;

    public ProxyHandler(Context context) {
        this.context = context;
        setProxy();
    }

    private int checkPort(String str) throws NumberFormatException {
        int i5 = Integer.parseInt(str);
        if (i5 != -1) {
            return i5;
        }
        throw new IllegalArgumentException();
    }

    private boolean setProxyViaCarrierFeature() {
        int dataSimSlotId = FotaTelephonyManager.getDataSimSlotId(this.context);
        String proxyAddress = CarrierFeature.getProxyAddress(dataSimSlotId);
        if (TextUtils.isEmpty(proxyAddress)) {
            return false;
        }
        this.proxyAddress = proxyAddress;
        this.proxyPort = CarrierFeature.getProxyPort(dataSimSlotId);
        Log.H("carrierProxyAddress: " + this.proxyAddress);
        Log.H("carrierProxyPort: " + this.proxyPort);
        return true;
    }

    private void setProxyViaSystemProperty() {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (TextUtils.isEmpty(property)) {
            return;
        }
        try {
            int iCheckPort = checkPort(property2);
            this.proxyAddress = property;
            this.proxyPort = iCheckPort;
            Log.H("http.proxyHost: " + this.proxyAddress);
            Log.H("http.proxyPort: " + this.proxyPort);
        } catch (IllegalArgumentException unused) {
            Log.W("Invalid port. Ignore proxy");
        }
    }

    public String getAddress() {
        return this.proxyAddress;
    }

    public int getPort() {
        return this.proxyPort;
    }

    public void setProxy() {
        if (!NetworkUtil.isAnyNetworkConnected(this.context)) {
            Log.W("no network");
        } else if (NetworkUtil.isWiFiNetworkConnected(this.context)) {
            Log.I("no need to set proxy");
        } else {
            if (setProxyViaCarrierFeature()) {
                return;
            }
            setProxyViaSystemProperty();
        }
    }
}
