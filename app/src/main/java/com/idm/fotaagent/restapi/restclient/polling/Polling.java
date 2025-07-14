package com.idm.fotaagent.restapi.restclient.polling;

import android.content.Context;
import android.text.TextUtils;
import com.idm.core.security.IDMSecurityInterface;
import com.idm.fotaagent.database.sqlite.database.polling.PollingInfo;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* loaded from: classes.dex */
public class Polling {
    public static String getUrlString(Context context) {
        return PollingInfo.get().getUrl() + SalesCode.get().toString() + "/" + DeviceUtils.readModelName() + "/" + PollingInfo.get().getTarget(context);
    }

    public static boolean isDisabled() {
        if (!FloatingFeature.isUnpackDevice()) {
            return false;
        }
        Log.W("Polling disabled: unpack device");
        return true;
    }

    public static boolean isUpdatable(String[] strArr) throws NoSuchAlgorithmException {
        String firmwareVersion = DeviceUtils.readFirmwareVersion();
        if (TextUtils.isEmpty(firmwareVersion)) {
            Log.E("Can not read Device firmware version");
            return false;
        }
        String strGenerateHash = GeneralUtils.generateHash(firmwareVersion, IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
        for (String str : strArr) {
            if (firmwareVersion.equals(str)) {
                Log.I("Find matched Device firmware version - plain version");
                return true;
            }
            if (strGenerateHash.equalsIgnoreCase(str)) {
                Log.I("Find matched Device firmware version - hashed version");
                return true;
            }
        }
        Log.I("Can not find matched Device firmware version");
        return false;
    }

    public static void updateFrom(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.D(entry.getKey() + "=" + entry.getValue());
        }
        PollingInfo.get().setUrl(map.get("versioninfo/url"));
        PollingInfo.get().setPollingPeriodInfo(map.get(XmlParser.Polling.POLLING_UNIT), map.get(XmlParser.Polling.POLLING_PERIOD), map.get(XmlParser.Polling.POLLING_TIME), map.get(XmlParser.Polling.POLLING_RANGE));
    }
}
