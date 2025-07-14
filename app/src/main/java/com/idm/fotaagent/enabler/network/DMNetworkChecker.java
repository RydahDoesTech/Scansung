package com.idm.fotaagent.enabler.network;

/* loaded from: classes.dex */
public class DMNetworkChecker extends NetworkChecker {

    public static class InstanceLazyHolder {
        private static final DMNetworkChecker INSTANCE = new DMNetworkChecker();

        private InstanceLazyHolder() {
        }
    }

    public static DMNetworkChecker getInstance() {
        return InstanceLazyHolder.INSTANCE;
    }

    @Override // com.idm.fotaagent.enabler.network.NetworkChecker
    public NetworkBlockedType getBlockedTypeOfWifiBackgroundPush(String str) {
        return NetworkBlockedType.NO_BLOCKING;
    }

    @Override // com.idm.fotaagent.enabler.network.NetworkChecker
    public NetworkBlockedType getBlockedTypeOfWifiOnlyForDl(String str) {
        return NetworkBlockedType.NO_BLOCKING;
    }

    @Override // com.idm.fotaagent.enabler.network.NetworkChecker
    public /* bridge */ /* synthetic */ NetworkBlockedType getNetworkBlockedType(String str) {
        return super.getNetworkBlockedType(str);
    }

    private DMNetworkChecker() {
    }
}
