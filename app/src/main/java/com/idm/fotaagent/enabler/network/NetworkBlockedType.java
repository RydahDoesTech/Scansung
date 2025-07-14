package com.idm.fotaagent.enabler.network;

import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedNetworkDisconnected;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedRoaming;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedWifiDisconnected;

/* loaded from: classes.dex */
public enum NetworkBlockedType {
    NO_BLOCKING { // from class: com.idm.fotaagent.enabler.network.NetworkBlockedType.1
        @Override // com.idm.fotaagent.enabler.network.NetworkBlockedType
        public boolean isBlocked() {
            return false;
        }
    },
    ROAMING { // from class: com.idm.fotaagent.enabler.network.NetworkBlockedType.2
        @Override // com.idm.fotaagent.enabler.network.NetworkBlockedType
        public IDMFumoTaskCommon getFumoTaskEvent(String str) {
            return new IDMFumoTaskDownloadFailedRoaming(str);
        }
    },
    WIFI_DISCONNECTED { // from class: com.idm.fotaagent.enabler.network.NetworkBlockedType.3
        @Override // com.idm.fotaagent.enabler.network.NetworkBlockedType
        public IDMFumoTaskCommon getFumoTaskEvent(String str) {
            return new IDMFumoTaskDownloadFailedWifiDisconnected(str);
        }
    },
    NETWORK_DISCONNECTED { // from class: com.idm.fotaagent.enabler.network.NetworkBlockedType.4
        @Override // com.idm.fotaagent.enabler.network.NetworkBlockedType
        public IDMFumoTaskCommon getFumoTaskEvent(String str) {
            return new IDMFumoTaskDownloadFailedNetworkDisconnected(str);
        }
    };

    public IDMFumoTaskCommon getFumoTaskEvent(String str) {
        return null;
    }

    public boolean isBlocked() {
        return true;
    }
}
