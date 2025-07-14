package com.samsung.android.knox.bluetooth;

import java.util.List;

/* loaded from: classes.dex */
public class BluetoothPolicy {

    public class BluetoothProfile {
        public static final int BLUETOOTH_A2DP_PROFILE = 8;
        public static final int BLUETOOTH_AVRCP_PROFILE = 16;
        public static final int BLUETOOTH_HFP_PROFILE = 2;
        public static final int BLUETOOTH_HSP_PROFILE = 1;
        public static final int BLUETOOTH_PBAP_PROFILE = 4;
        public static final int BLUETOOTH_SPP_PROFILE = 128;

        public BluetoothProfile() {
            throw new RuntimeException("Stub!");
        }
    }

    public class BluetoothUUID {
        public static final String A2DP_ADVAUDIODIST_UUID = "0000110D-0000-1000-8000-00805F9B34FB";
        public static final String A2DP_AUDIOSINK_UUID = "0000110B-0000-1000-8000-00805F9B34FB";
        public static final String A2DP_AUDIOSOURCE_UUID = "0000110A-0000-1000-8000-00805F9B34FB";
        public static final String AVRCP_CONTROLLER_UUID = "0000110E-0000-1000-8000-00805F9B34FB";
        public static final String AVRCP_TARGET_UUID = "0000110C-0000-1000-8000-00805F9B34FB";
        public static final String BNEP_UUID = "0000000f-0000-1000-8000-00805F9B34FB";
        public static final String BPP_UUID = "00001122-0000-1000-8000-00805f9b34fb";
        public static final String DUN_UUID = "00001103-0000-1000-8000-00805f9b34fb";
        public static final String FTP_UUID = "00001106-0000-1000-8000-00805f9b34fb";
        public static final String HFP_AG_UUID = "0000111F-0000-1000-8000-00805F9B34FB";
        public static final String HFP_UUID = "0000111E-0000-1000-8000-00805F9B34FB";
        public static final String HID_UUID = "00001124-0000-1000-8000-00805f9b34fb";
        public static final String HSP_AG_UUID = "00001112-0000-1000-8000-00805F9B34FB";
        public static final String HSP_UUID = "00001108-0000-1000-8000-00805F9B34FB";
        public static final String NAP_UUID = "00001116-0000-1000-8000-00805F9B34FB";
        public static final String OBEXOBJECTPUSH_UUID = "00001105-0000-1000-8000-00805f9b34fb";
        public static final String PANU_UUID = "00001115-0000-1000-8000-00805F9B34FB";
        public static final String PBAP_PSE_UUID = "0000112f-0000-1000-8000-00805F9B34FB";
        public static final String PBAP_UUID = "00001130-0000-1000-8000-00805f9b34fb";
        public static final String SAP_UUID = "0000112D-0000-1000-8000-00805F9B34FB";
        public static final String SPP_UUID = "00001101-0000-1000-8000-00805f9b34fb";

        public BluetoothUUID() {
            throw new RuntimeException("Stub!");
        }
    }

    public BluetoothPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean activateBluetoothDeviceRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean activateBluetoothUUIDRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBluetoothDevicesToBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBluetoothDevicesToWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBluetoothUUIDsToBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBluetoothUUIDsToWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowCallerIDDisplay(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowOutgoingCalls(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearBluetoothDevicesFromBlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearBluetoothDevicesFromList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearBluetoothDevicesFromWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearBluetoothUUIDsFromBlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearBluetoothUUIDsFromList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearBluetoothUUIDsFromWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean getAllowBluetoothDataTransfer() {
        throw new RuntimeException("Stub!");
    }

    public List<BluetoothControlInfo> getBluetoothDevicesFromBlackLists() {
        throw new RuntimeException("Stub!");
    }

    public List<BluetoothControlInfo> getBluetoothDevicesFromWhiteLists() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getBluetoothLog() {
        throw new RuntimeException("Stub!");
    }

    public List<BluetoothControlInfo> getBluetoothUUIDsFromBlackLists() {
        throw new RuntimeException("Stub!");
    }

    public List<BluetoothControlInfo> getBluetoothUUIDsFromWhiteLists() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothDeviceRestrictionActive() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothLogEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothUUIDRestrictionActive() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCallerIDDisplayAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDesktopConnectivityEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDiscoverableEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLimitedDiscoverableEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOutgoingCallsAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPairingEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isProfileEnabled(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeBluetoothDevicesFromBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeBluetoothDevicesFromWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeBluetoothUUIDsFromBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeBluetoothUUIDsFromWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAllowBluetoothDataTransfer(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setBluetoothLogEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDesktopConnectivityState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDiscoverableState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLimitedDiscoverableState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPairingState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setProfileState(boolean z4, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBluetoothDevicesToWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addBluetoothUUIDsToWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
