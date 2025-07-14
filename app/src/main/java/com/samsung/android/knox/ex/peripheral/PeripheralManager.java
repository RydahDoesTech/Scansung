package com.samsung.android.knox.ex.peripheral;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public class PeripheralManager {
    public static final int RESULT_CODE_FAIL_PERMISSION_ERROR = 3;
    public static final int RESULT_CODE_FAIL_SERVICE_UNAVAILABLE = 1;
    public static final int RESULT_CODE_FAIL_WRONG_ARGUMENT = 2;
    public static final int RESULT_CODE_INVALID = -1;
    public static final int RESULT_CODE_SUCCESS = 0;

    public PeripheralManager() {
        throw new RuntimeException("Stub!");
    }

    public static PeripheralManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int beep(String str, int i5, Bundle bundle, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int clearMemory(String str, String str2, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int connectPeripheral(BluetoothDevice bluetoothDevice, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int disable() {
        throw new RuntimeException("Stub!");
    }

    public int disconnectPeripheral(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int displayText(String str, String str2, int i5, Bundle bundle, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int enable(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int getAvailablePeripherals(PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getBluetoothPeripherals(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getConfiguration(String str, List<String> list, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getConnectionProfile(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getInformation(PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getPairingBarcodeData(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getStoredData(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int getSupportedPeripherals(PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }

    public int registerDataListener(PeripheralDataListener peripheralDataListener) {
        throw new RuntimeException("Stub!");
    }

    public int registerInfoListener(PeripheralInfoListener peripheralInfoListener) {
        throw new RuntimeException("Stub!");
    }

    public int registerStateListener(PeripheralStateListener peripheralStateListener) {
        throw new RuntimeException("Stub!");
    }

    public int resetPeripheral(String str, String str2, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int setConfiguration(String str, Bundle bundle, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int setConnectionProfile(String str, String str2, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int start(PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int startAutoTriggerMode(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int startBarcodeScan(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int stop(PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int stopAutoTriggerMode(String str, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int stopPairingPeripheral(PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }

    public int unregisterDataListener(PeripheralDataListener peripheralDataListener) {
        throw new RuntimeException("Stub!");
    }

    public int unregisterInfoListener(PeripheralInfoListener peripheralInfoListener) {
        throw new RuntimeException("Stub!");
    }

    public int unregisterStateListener(PeripheralStateListener peripheralStateListener) {
        throw new RuntimeException("Stub!");
    }

    public int vibrate(String str, int i5, Bundle bundle, PeripheralResultListener peripheralResultListener) {
        throw new RuntimeException("Stub!");
    }
}
