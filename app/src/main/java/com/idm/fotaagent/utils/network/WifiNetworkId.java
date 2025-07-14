package com.idm.fotaagent.utils.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.idm.fotaagent.IDMApplication;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class WifiNetworkId {
    public static final long NOT_SPECIFIC_NETWORK_ID = 0;

    public static long getNetworkId() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) IDMApplication.idmGetContext().getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) {
            return 0L;
        }
        Log.I("networkId : " + activeNetwork.getNetworkHandle());
        return activeNetwork.getNetworkHandle();
    }
}
