package com.samsung.android.knox.net.wifi;

import android.net.wifi.WifiConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public class WifiPolicy {
    public static final int SECURITY_LEVEL_EAP_AKA = 25;
    public static final int SECURITY_LEVEL_EAP_AKA_CCKM = 27;
    public static final int SECURITY_LEVEL_EAP_AKA_FT = 26;
    public static final int SECURITY_LEVEL_EAP_AKA_PRIME = 28;
    public static final int SECURITY_LEVEL_EAP_AKA_PRIME_CCKM = 30;
    public static final int SECURITY_LEVEL_EAP_AKA_PRIME_FT = 29;
    public static final int SECURITY_LEVEL_EAP_FAST = 4;
    public static final int SECURITY_LEVEL_EAP_FAST_CCKM = 18;
    public static final int SECURITY_LEVEL_EAP_FAST_FT = 17;
    public static final int SECURITY_LEVEL_EAP_LEAP = 3;
    public static final int SECURITY_LEVEL_EAP_LEAP_CCKM = 16;
    public static final int SECURITY_LEVEL_EAP_LEAP_FT = 15;
    public static final int SECURITY_LEVEL_EAP_PEAP = 5;
    public static final int SECURITY_LEVEL_EAP_PEAP_CCKM = 10;
    public static final int SECURITY_LEVEL_EAP_PEAP_FT = 9;
    public static final int SECURITY_LEVEL_EAP_PWD = 19;
    public static final int SECURITY_LEVEL_EAP_PWD_CCKM = 21;
    public static final int SECURITY_LEVEL_EAP_PWD_FT = 20;
    public static final int SECURITY_LEVEL_EAP_SIM = 22;
    public static final int SECURITY_LEVEL_EAP_SIM_CCKM = 24;
    public static final int SECURITY_LEVEL_EAP_SIM_FT = 23;
    public static final int SECURITY_LEVEL_EAP_TLS = 7;
    public static final int SECURITY_LEVEL_EAP_TLS_CCKM = 14;
    public static final int SECURITY_LEVEL_EAP_TLS_FT = 13;
    public static final int SECURITY_LEVEL_EAP_TTLS = 6;
    public static final int SECURITY_LEVEL_EAP_TTLS_CCKM = 12;
    public static final int SECURITY_LEVEL_EAP_TTLS_FT = 11;
    public static final int SECURITY_LEVEL_FT_PSK = 8;
    public static final int SECURITY_LEVEL_OPEN = 0;
    public static final int SECURITY_LEVEL_SAE = 31;
    public static final int SECURITY_LEVEL_WEP = 1;
    public static final int SECURITY_LEVEL_WPA = 2;
    public static final String SECURITY_TYPE_OPEN = "Open";
    public static final String SECURITY_TYPE_SAE = "SAE";
    public static final String SECURITY_TYPE_WPA2_PSK = "WPA2_PSK";
    public static final String SECURITY_TYPE_WPA_PSK = "WPA_PSK";

    public WifiPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean activateWifiSsidRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBlockedNetwork(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addWifiSsidsToBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addWifiSsidsToWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowOpenWifiAp(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowWifiApSettingUserModification(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearWifiSsidsFromBlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearWifiSsidsFromList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearWifiSsidsFromWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean getAllowUserPolicyChanges() {
        throw new RuntimeException("Stub!");
    }

    public boolean getAllowUserProfiles(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAutomaticConnectionToWifi() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getBlockedNetworks() {
        throw new RuntimeException("Stub!");
    }

    public int getMinimumRequiredSecurity() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getNetworkSSIDList() {
        throw new RuntimeException("Stub!");
    }

    public boolean getPasswordHidden() {
        throw new RuntimeException("Stub!");
    }

    public boolean getPromptCredentialsEnabled() {
        throw new RuntimeException("Stub!");
    }

    public WifiConfiguration getWifiApSetting() {
        throw new RuntimeException("Stub!");
    }

    public WifiAdminProfile getWifiProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public List<WifiControlInfo> getWifiSsidsFromBlackLists() {
        throw new RuntimeException("Stub!");
    }

    public List<WifiControlInfo> getWifiSsidsFromWhiteLists() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNetworkBlocked(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOpenWifiApAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWifiApSettingUserModificationAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWifiSsidRestrictionActive() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWifiStateChangeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeBlockedNetwork(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeNetworkConfiguration(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeWifiSsidsFromBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeWifiSsidsFromWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAllowUserPolicyChanges(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAllowUserProfiles(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAutomaticConnectionToWifi(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMinimumRequiredSecurity(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPasswordHidden(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPromptCredentialsEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setWifiApSetting(String str, String str2, String str3) {
        throw new RuntimeException("Stub!");
    }

    public boolean setWifiProfile(WifiAdminProfile wifiAdminProfile) {
        throw new RuntimeException("Stub!");
    }

    public boolean setWifiStateChangeAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addWifiSsidsToWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
