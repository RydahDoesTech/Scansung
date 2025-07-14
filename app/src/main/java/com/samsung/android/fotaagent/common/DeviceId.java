package com.samsung.android.fotaagent.common;

import android.content.Context;
import android.os.SemSystemProperties;
import android.text.TextUtils;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DeviceId {
    private static final String FIRST_API_LEVEL = "ro.product.first_api_level";

    public enum DeviceIdType {
        IMEI { // from class: com.samsung.android.fotaagent.common.DeviceId.DeviceIdType.1
            @Override // com.samsung.android.fotaagent.common.DeviceId.DeviceIdType
            public String getDeviceId(Context context) {
                String imei = FotaTelephonyManager.getIMEI(context);
                if (!TextUtils.isEmpty(imei) && imei.length() == 14) {
                    imei = DeviceIdType.appendChecksum(imei);
                }
                return toDeviceIdFormat(imei);
            }
        },
        MEID { // from class: com.samsung.android.fotaagent.common.DeviceId.DeviceIdType.2
            @Override // com.samsung.android.fotaagent.common.DeviceId.DeviceIdType
            public String getDeviceId(Context context) {
                String meid = FotaTelephonyManager.getMEID(context);
                if (!TextUtils.isEmpty(meid) && meid.length() >= 15) {
                    meid = TextUtils.substring(meid, 0, 14);
                }
                return toDeviceIdFormat(meid);
            }
        },
        TWID { // from class: com.samsung.android.fotaagent.common.DeviceId.DeviceIdType.3
            @Override // com.samsung.android.fotaagent.common.DeviceId.DeviceIdType
            public String getDeviceId(Context context) {
                return toDeviceIdFormat(DeviceUtils.getSerialNumber());
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static String appendChecksum(String str) {
            if (str.charAt(0) >= 'A' || str.length() != 14) {
                return str;
            }
            int iCharAt = 0;
            for (int i5 = 0; i5 < 14; i5++) {
                if (i5 % 2 == 0) {
                    iCharAt = (str.charAt(i5) - '0') + iCharAt;
                } else {
                    int iCharAt2 = (str.charAt(i5) - '0') * 2;
                    iCharAt = iCharAt2 < 10 ? iCharAt + iCharAt2 : (iCharAt2 % 10) + 1 + iCharAt;
                }
            }
            int i6 = iCharAt % 10;
            if (i6 == 0) {
                return str;
            }
            return str + (10 - i6);
        }

        private boolean isValid(String str) {
            return (TextUtils.isEmpty(str) || "000000000000000".equals(str) || "B0000000".equals(str) || "Default".equals(str)) ? false : true;
        }

        public static Optional<DeviceIdType> of(String str) {
            if (str == null) {
                return Optional.empty();
            }
            for (DeviceIdType deviceIdType : values()) {
                if (str.startsWith(deviceIdType.name())) {
                    return Optional.of(deviceIdType);
                }
            }
            return Optional.empty();
        }

        public abstract String getDeviceId(Context context);

        public String toDeviceIdFormat(String str) {
            if (!isValid(str)) {
                return "";
            }
            return name() + ":" + str;
        }
    }

    private static DeviceIdType getDeviceIdType(Context context) {
        if (DeviceUtils.isWifiOnly() || DeviceUtils.isLiveDemoDevice()) {
            return DeviceIdType.TWID;
        }
        if (getFirstApiLevel() >= 30) {
            return DeviceIdType.IMEI;
        }
        return DeviceIdType.of(new RegisteredDeviceRepository(context).getDeviceId().orElse(null)).orElse(isPhoneTypeCDMA(context) ? DeviceIdType.MEID : DeviceIdType.IMEI);
    }

    private static int getFirstApiLevel() {
        return SemSystemProperties.getInt(FIRST_API_LEVEL, 0);
    }

    private static boolean isPhoneTypeCDMA(Context context) {
        return FotaTelephonyManager.getCurrentPhoneType(context) == 2;
    }

    public static String readDeviceId(Context context) throws InterruptedException {
        for (int i5 = 0; i5 < 5; i5++) {
            DeviceIdType deviceIdType = getDeviceIdType(context);
            String deviceId = deviceIdType.getDeviceId(context);
            if (!TextUtils.isEmpty(deviceId)) {
                return deviceId;
            }
            Log.I("Failed to get Device ID for " + deviceIdType + " Count: " + i5);
            try {
                TimeUnit.MILLISECONDS.sleep(1000L);
            } catch (InterruptedException e5) {
                Log.printStackTrace(e5);
            }
        }
        return "";
    }
}
