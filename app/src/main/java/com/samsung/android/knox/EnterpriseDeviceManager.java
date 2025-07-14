package com.samsung.android.knox;

import android.content.ComponentName;
import android.content.Context;
import android.os.UserHandle;
import com.samsung.android.knox.accounts.DeviceAccountPolicy;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.EmailPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.bluetooth.BluetoothPolicy;
import com.samsung.android.knox.bluetooth.BluetoothSecureModePolicy;
import com.samsung.android.knox.browser.BrowserPolicy;
import com.samsung.android.knox.container.BasePasswordPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.ddar.DualDARPolicy;
import com.samsung.android.knox.deviceinfo.DeviceInventory;
import com.samsung.android.knox.devicesecurity.APMPolicy;
import com.samsung.android.knox.devicesecurity.DeviceSecurityPolicy;
import com.samsung.android.knox.devicesecurity.PasswordPolicy;
import com.samsung.android.knox.dex.DexManager;
import com.samsung.android.knox.display.Font;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.kpcc.KPCCManager;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.location.LocationPolicy;
import com.samsung.android.knox.lockscreen.BootBanner;
import com.samsung.android.knox.lockscreen.LockscreenOverlay;
import com.samsung.android.knox.multiuser.MultiUserManager;
import com.samsung.android.knox.net.GlobalProxy;
import com.samsung.android.knox.net.apn.ApnSettingsPolicy;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.vpn.VpnPolicy;
import com.samsung.android.knox.net.wifi.WifiPolicy;
import com.samsung.android.knox.nfc.NfcPolicy;
import com.samsung.android.knox.profile.ProfilePolicy;
import com.samsung.android.knox.remotecontrol.RemoteInjection;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import com.samsung.android.knox.restriction.RoamingPolicy;
import com.samsung.android.knox.restriction.SPDControlPolicy;

/* loaded from: classes.dex */
public class EnterpriseDeviceManager {
    public static final String ACTION_USER_STATE_CHANGED = "com.samsung.android.knox.intent.action.USER_STATE_CHANGED";
    public static final String EXTRA_USER_ID = "com.samsung.android.knox.intent.extra.USER_ID";
    public static final String EXTRA_USER_STATE = "com.samsung.android.knox.intent.extra.USER_STATE";
    public static final int USER_ACTIVE = 91;
    public static final int USER_CREATION_IN_PROGRESS = 93;
    public static final int USER_DOESNT_EXIST = -1;
    public static final int USER_LOCKED = 95;

    public static class KNOX_VERSION_CODES {
        public static final int BASE = 6;
        public static final int KNOX_1_0_1 = 7;
        public static final int KNOX_1_0_2 = 8;
        public static final int KNOX_1_1 = 9;
        public static final int KNOX_1_2 = 10;
        public static final int KNOX_2_0 = 11;
        public static final int KNOX_2_1 = 12;
        public static final int KNOX_2_2 = 13;
        public static final int KNOX_2_3 = 14;
        public static final int KNOX_2_4 = 15;
        public static final int KNOX_2_4_1 = 16;
        public static final int KNOX_2_5 = 17;
        public static final int KNOX_2_5_1 = 18;
        public static final int KNOX_2_6 = 19;
        public static final int KNOX_2_7 = 20;
        public static final int KNOX_2_7_1 = 21;
        public static final int KNOX_2_8 = 22;
        public static final int KNOX_2_9 = 23;
        public static final int KNOX_3_0 = 24;
        public static final int KNOX_3_1 = 25;
        public static final int KNOX_3_2 = 26;
        public static final int KNOX_3_2_1 = 27;
        public static final int KNOX_3_3 = 28;
        public static final int KNOX_3_4 = 29;
        public static final int KNOX_3_4_1 = 30;
        public static final int KNOX_3_5 = 31;
        public static final int KNOX_3_6 = 32;
        public static final int KNOX_3_7 = 33;
        public static final int KNOX_3_7_1 = 34;
        public static final int KNOX_3_8 = 35;
        public static final int KNOX_NOT_SUPPORTED = -1;

        public KNOX_VERSION_CODES() {
            throw new RuntimeException("Stub!");
        }
    }

    public EnterpriseDeviceManager() {
        throw new RuntimeException("Stub!");
    }

    public static int getAPILevel() {
        throw new RuntimeException("Stub!");
    }

    public static EnterpriseDeviceManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static EnterpriseDeviceManager getParentInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static int getUserId(UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }

    public APMPolicy getAPMPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean getAdminRemovable(String str) {
        throw new RuntimeException("Stub!");
    }

    public ApnSettingsPolicy getApnSettingsPolicy() {
        throw new RuntimeException("Stub!");
    }

    public ApplicationPolicy getApplicationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public BasePasswordPolicy getBasePasswordPolicy() {
        throw new RuntimeException("Stub!");
    }

    public BluetoothPolicy getBluetoothPolicy() {
        throw new RuntimeException("Stub!");
    }

    public BluetoothSecureModePolicy getBluetoothSecureModePolicy() {
        throw new RuntimeException("Stub!");
    }

    public BootBanner getBootBanner() {
        throw new RuntimeException("Stub!");
    }

    public BrowserPolicy getBrowserPolicy() {
        throw new RuntimeException("Stub!");
    }

    public CertificateProvisioning getCertificateProvisioning() {
        throw new RuntimeException("Stub!");
    }

    public DateTimePolicy getDateTimePolicy() {
        throw new RuntimeException("Stub!");
    }

    public DeviceAccountPolicy getDeviceAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public DeviceInventory getDeviceInventory() {
        throw new RuntimeException("Stub!");
    }

    public DeviceSecurityPolicy getDeviceSecurityPolicy() {
        throw new RuntimeException("Stub!");
    }

    public DexManager getDexManager() {
        throw new RuntimeException("Stub!");
    }

    public DualDARPolicy getDualDARPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EmailAccountPolicy getEmailAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EmailPolicy getEmailPolicy() {
        throw new RuntimeException("Stub!");
    }

    public ExchangeAccountPolicy getExchangeAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public Firewall getFirewall() {
        throw new RuntimeException("Stub!");
    }

    public Font getFont() {
        throw new RuntimeException("Stub!");
    }

    public Geofencing getGeofencing() {
        throw new RuntimeException("Stub!");
    }

    public GlobalProxy getGlobalProxy() {
        throw new RuntimeException("Stub!");
    }

    public KPCCManager getKPCCManager() {
        throw new RuntimeException("Stub!");
    }

    public KioskMode getKioskMode() {
        throw new RuntimeException("Stub!");
    }

    public LDAPAccountPolicy getLDAPAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public LocationPolicy getLocationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public LockscreenOverlay getLockscreenOverlay() {
        throw new RuntimeException("Stub!");
    }

    public MultiUserManager getMultiUserManager() {
        throw new RuntimeException("Stub!");
    }

    public NfcPolicy getNfcPolicy() {
        throw new RuntimeException("Stub!");
    }

    public PasswordPolicy getPasswordPolicy() {
        throw new RuntimeException("Stub!");
    }

    public PhoneRestrictionPolicy getPhoneRestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public ProfilePolicy getProfilePolicy() {
        throw new RuntimeException("Stub!");
    }

    public RemoteInjection getRemoteInjection() {
        throw new RuntimeException("Stub!");
    }

    public RestrictionPolicy getRestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public RoamingPolicy getRoamingPolicy() {
        throw new RuntimeException("Stub!");
    }

    public SPDControlPolicy getSPDControlPolicy() {
        throw new RuntimeException("Stub!");
    }

    public int getUserStatus(int i5) {
        throw new RuntimeException("Stub!");
    }

    public VpnPolicy getVpnPolicy() {
        throw new RuntimeException("Stub!");
    }

    public WifiPolicy getWifiPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAdminActive(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAdminRemovable(boolean z4, String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAdminRemovable() {
        throw new RuntimeException("Stub!");
    }

    public PhoneRestrictionPolicy getPhoneRestrictionPolicy(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAdminRemovable(boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
