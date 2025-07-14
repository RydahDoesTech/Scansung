package com.idm.adapter.common;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.idm.adapter.logmanager.IDMDebug;

/* loaded from: classes.dex */
public enum IDMDeviceLockControl {
    INSTANCE { // from class: com.idm.adapter.common.IDMDeviceLockControl.1
        @Override // com.idm.adapter.common.IDMDeviceLockControl
        public synchronized void idmLockAcquire(Context context, int i5) {
            IDMDeviceLockControl.WAKELOCK.idmLockAcquire(context, i5);
            IDMDeviceLockControl.WIFILOCK.idmLockAcquire(context, i5);
        }
    },
    WAKELOCK { // from class: com.idm.adapter.common.IDMDeviceLockControl.2
        private final long WAKE_LOCK_TIME_OUT = 900000;

        @Override // com.idm.adapter.common.IDMDeviceLockControl
        public synchronized void idmLockAcquire(Context context, int i5) {
            if (IDMDeviceLockControl.m_WakeLock == null) {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    IDMDebug.E("PowerManager is null!!");
                    return;
                }
                PowerManager.WakeLock unused = IDMDeviceLockControl.m_WakeLock = powerManager.newWakeLock(1, "com.idm:sdk_wakeLock");
                IDMDeviceLockControl.m_WakeLock.setReferenceCounted(false);
                if (i5 == 0) {
                    IDMDeviceLockControl.m_WakeLock.acquire(900000L);
                } else {
                    IDMDeviceLockControl.m_WakeLock.acquire();
                }
                IDMDebug.I("sdk_wakeLock is acquire!!");
            }
        }
    },
    WIFILOCK { // from class: com.idm.adapter.common.IDMDeviceLockControl.3
        @Override // com.idm.adapter.common.IDMDeviceLockControl
        public synchronized void idmLockAcquire(Context context, int i5) {
            if (IDMDeviceLockControl.m_WifiLock == null) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager == null) {
                    IDMDebug.E("WifiManager is null!!");
                    return;
                }
                WifiManager.WifiLock unused = IDMDeviceLockControl.m_WifiLock = wifiManager.createWifiLock(3, "com.idm:wifiLock");
                IDMDeviceLockControl.m_WifiLock.setReferenceCounted(false);
                IDMDeviceLockControl.m_WifiLock.acquire();
                IDMDebug.I("m_WifiLock is acquire!!");
            }
        }
    };

    private static volatile PowerManager.WakeLock m_WakeLock;
    private static volatile WifiManager.WifiLock m_WifiLock;

    public static IDMDeviceLockControl getInstance() {
        return INSTANCE;
    }

    public abstract void idmLockAcquire(Context context, int i5);

    public synchronized void idmLockRelease() {
        try {
            IDMDebug.I("idmLockRelease");
            if (m_WakeLock != null) {
                if (m_WakeLock.isHeld()) {
                    m_WakeLock.release();
                }
                m_WakeLock = null;
            }
            if (m_WifiLock != null) {
                if (m_WifiLock.isHeld()) {
                    m_WifiLock.release();
                }
                m_WifiLock = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
