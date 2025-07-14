package com.idm.fotaagent.enabler.adapter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class NetworkApnManager extends ConnectivityManager.NetworkCallback {
    private volatile boolean alreadyRequested;
    private final ConnectivityManager connMgr;
    private volatile boolean succeedToBind;

    public static class LazyInstanceHolder {
        private static final NetworkApnManager INSTANCE = new NetworkApnManager();

        private LazyInstanceHolder() {
        }
    }

    public static NetworkApnManager get() {
        return LazyInstanceHolder.INSTANCE;
    }

    public synchronized void close() {
        if (!this.succeedToBind) {
            Log.I("no need to close");
            return;
        }
        this.connMgr.bindProcessToNetwork(null);
        try {
            this.connMgr.unregisterNetworkCallback(this);
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
        }
        this.succeedToBind = false;
        this.alreadyRequested = false;
        Log.I("Close the network APN");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Log.I("");
        super.onAvailable(network);
        if (network.equals(this.connMgr.getBoundNetworkForProcess())) {
            return;
        }
        boolean zBindProcessToNetwork = this.connMgr.bindProcessToNetwork(network);
        Log.I("bindProcessToNetwork : " + zBindProcessToNetwork);
        if (zBindProcessToNetwork) {
            this.succeedToBind = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Log.I("");
        super.onLost(network);
        this.succeedToBind = false;
        this.alreadyRequested = false;
    }

    public void open() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        if (this.connMgr.getBoundNetworkForProcess() != null) {
            Log.I("Already used");
            return;
        }
        synchronized (this) {
            try {
                if (this.alreadyRequested) {
                    Log.I("Already requested");
                    return;
                }
                this.connMgr.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(NetworkUtil.getCapabilityType(contextIdmGetContext)).build(), this);
                this.alreadyRequested = true;
                for (int i5 = 0; i5 <= 50; i5++) {
                    if (i5 % 5 == 0) {
                        Log.I("============Apn Req wait============");
                        Log.I("===== Wait Timer[" + (i5 / 5) + "] ======");
                        Log.I("===================================");
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e5) {
                        Log.printStackTrace(e5);
                    }
                    synchronized (this) {
                        try {
                            if (this.succeedToBind) {
                                Log.I("The network APN is available");
                                return;
                            } else {
                                if (i5 == 50) {
                                    close();
                                    throw new IllegalStateException("Timeout for a request of the network APN");
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private NetworkApnManager() {
        ConnectivityManager connectivityManager = (ConnectivityManager) IDMApplication.idmGetContext().getSystemService(ConnectivityManager.class);
        this.connMgr = connectivityManager;
        if (connectivityManager == null) {
            throw new IllegalStateException("ConnectivityManager is null");
        }
    }
}
