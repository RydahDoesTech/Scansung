package com.samsung.android.fotaagent.common.feature;

import A3.f;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadDefaultValues;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.feature.SemCarrierFeature;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class CarrierFeature {
    private static final int INDEX_PROXY_ADDRESS = 0;
    private static final int INDEX_PROXY_PORT = 1;
    private static final String SYNCML_CONFIG_DEF_STATUS_AUTO_DOWNLOAD = "CarrierFeature_SyncML_ConfigDefStatusAutoDownload";
    private static final String SYNCML_CONFIG_PROXY_ADDR = "CarrierFeature_SyncML_ConfigProxyAddr";
    private static final String SYNCML_DELTA_BINARY_DOWN_VIA = "CarrierFeature_SyncML_DeltaBinaryDownVia";
    private static final String SYNCML_DISABLE_WARNING_FOR_DATA_COST_DURING_FOTA = "CarrierFeature_SyncML_DisableWarning4DataCostDuringFota";
    private static final String SYNCML_IS_FIRST_NET = "CarrierFeature_SyncML_IsFirstNet";
    public static final String SYNCML_SW_UPDATE_ACTION_DURING_ROAMING = "CarrierFeature_SyncML_SwUpdateActionDuringRoaming";
    public static final String VALUE_AUTO_DOWNLOAD_OFF = "off";
    public static final String VALUE_AUTO_DOWNLOAD_REMOVE = "remove";
    public static final String VALUE_AUTO_DOWNLOAD_REMOVE_OFF = "remove,off";
    public static final String VALUE_AUTO_DOWNLOAD_REMOVE_WIFI = "remove,wifi";
    public static final String VALUE_AUTO_DOWNLOAD_WIFI = "wifi";
    public static final String VALUE_AUTO_DOWNLOAD_WIFI_AND_CELLULAR = "wifiandcellular";

    @FeatureDelegate
    private static final Delegate DELEGATE = new Delegate.Impl();
    private static final Context CONTEXT = IDMApplication.idmGetContext();

    @FeatureDelegate
    public interface Delegate {

        public static class Impl implements Delegate {
            @Override // com.samsung.android.fotaagent.common.feature.CarrierFeature.Delegate
            public boolean disableWarning4DataCostDuringFota(int i5) {
                return CarrierFeature.getCarrierFeature(i5, CarrierFeature.SYNCML_DISABLE_WARNING_FOR_DATA_COST_DURING_FOTA, false);
            }

            @Override // com.samsung.android.fotaagent.common.feature.CarrierFeature.Delegate
            public String getActionDuringRoaming(int i5) {
                return CarrierFeature.getCarrierFeature(i5, CarrierFeature.SYNCML_SW_UPDATE_ACTION_DURING_ROAMING, "onlywifi");
            }

            @Override // com.samsung.android.fotaagent.common.feature.CarrierFeature.Delegate
            public String getDefaultWifiAutoDownload(int i5) {
                return CarrierFeature.getCarrierFeature(i5, CarrierFeature.SYNCML_CONFIG_DEF_STATUS_AUTO_DOWNLOAD, "wifi");
            }

            @Override // com.samsung.android.fotaagent.common.feature.CarrierFeature.Delegate
            public String getDeltaBinaryDownloadVia(int i5) {
                return CarrierFeature.getCarrierFeature(i5, CarrierFeature.SYNCML_DELTA_BINARY_DOWN_VIA, "Unlimited");
            }

            @Override // com.samsung.android.fotaagent.common.feature.CarrierFeature.Delegate
            public boolean isFirstNetReady(Context context) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                    Objects.requireNonNull(telephonyManager, "defaultTelephonyManager should not be null");
                    SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                    Objects.requireNonNull(subscriptionManager, "subscriptionManager should not be nulll");
                    List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                    Objects.requireNonNull(activeSubscriptionInfoList, "subscriptionInfos should not be null");
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        if (CarrierFeature.getCarrierFeature(subscriptionInfo.getSimSlotIndex(), CarrierFeature.SYNCML_IS_FIRST_NET, false) && telephonyManager.createForSubscriptionId(subscriptionInfo.getSubscriptionId()).getSimState() == 5) {
                            Log.I("FirstNet ready");
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e5) {
                    Log.printStackTrace(e5);
                    return false;
                }
            }
        }

        @FeatureAttribute(description = "Whether to disable warning message for data cost of mobile networks\n\n1. true: do not show warning message\n2. false: show warning message", values = {"true", "false"})
        boolean disableWarning4DataCostDuringFota(int i5);

        @FeatureAttribute(description = "Whether to allow software update (FOTA) in roaming\n\n1. onlywifi: only Wi-Fi allowed\n2. onlywifipull: only pull via Wi-Fi allowed (push/polling via Wi-Fi not allowed)\n3. domestic_roaming: domestic roaming network allowed\n4. roaminginfo: roaming network allowed\n\nonlywifi,roaminginfo is the same as onlywifi\n\nNote that roaminginfo allows to proceed software update via roaming network.\nTo prevent software update via roaming network, set onlywifi.", values = {"onlywifi", "onlywifipull", "domestic_roaming", "roaminginfo"})
        String getActionDuringRoaming(int i5);

        @FeatureAttribute(description = "Default status for \"Auto download over Wifi\" in Settings\n\n1. off: set the default status to off\n2. wifi: set the default status to wifi\n3. wifiandcellular: set the default status to wifi/cellular\n4. remove,off: remove the menu and disable auto download5. remove,wifi: remove the menu and enable auto download over wifi6. remove: remove the menu and enable auto download over wifi/cellular", values = {CarrierFeature.VALUE_AUTO_DOWNLOAD_OFF, "wifi", CarrierFeature.VALUE_AUTO_DOWNLOAD_WIFI_AND_CELLULAR, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE_OFF, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE_WIFI, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE})
        String getDefaultWifiAutoDownload(int i5);

        @FeatureAttribute(description = "Unlimited: no restrictions for networks during FOTA\nwifi_dedicated: delta binary can be downloaded via only Wi-Fi\nmobile_only: no Internet access via Wi-Fi", values = {"Unlimited", "wifi_dedicated", "mobile_only"})
        String getDeltaBinaryDownloadVia(int i5);

        @FeatureAttribute(description = "Is FirstNet ready?", values = {"true", "false"})
        boolean isFirstNetReady(Context context);
    }

    public static String getActionDuringRoaming(int i5) {
        return DELEGATE.getActionDuringRoaming(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getCarrierFeature(int i5, String str, String str2) {
        return SemCarrierFeature.getInstance().getString(i5, str, str2, false);
    }

    @FeatureAttribute
    @Deprecated
    public static String getConfigApnType(int i5) {
        return "";
    }

    private static String getConfigProxyURL(int i5, int i6) {
        if (i6 != 0 && i6 != 1) {
            f.t("unknown proxy tag : ", i6);
            return "";
        }
        String[] strArrSplit = getCarrierFeature(i5, SYNCML_CONFIG_PROXY_ADDR, "").split(":");
        if (strArrSplit.length == 2) {
            return strArrSplit[i6];
        }
        Log.E("proxy url is not valid");
        return "";
    }

    public static String getDefaultAutoDownload() {
        return DELEGATE.getDefaultWifiAutoDownload(FotaTelephonyManager.getDataSimSlotId(CONTEXT));
    }

    private static String getDeltaBinaryDownloadVia() {
        return DELEGATE.getDeltaBinaryDownloadVia(FotaTelephonyManager.getDataSimSlotId(CONTEXT));
    }

    public static String getProxyAddress(int i5) {
        return getConfigProxyURL(i5, 0);
    }

    public static int getProxyPort(int i5) {
        return GeneralUtils.parseInt(getConfigProxyURL(i5, 1), -1);
    }

    public static boolean isApnEnabled(int i5) {
        return (TextUtils.isEmpty(getConfigApnType(i5)) || CONTEXT.getPackageName().contains("utagent")) ? false : true;
    }

    public static boolean isFirstNetReady(Context context) {
        return DELEGATE.isFirstNetReady(context);
    }

    public static boolean isMobileNetworkOnlyByCarrier() {
        return "mobile_only".equalsIgnoreCase(getDeltaBinaryDownloadVia());
    }

    public static boolean isShowMobileNetworkWarning() {
        Context context = CONTEXT;
        return !Operator.get().isSimAllowed(context) || isShowMobileNetworkWarning(FotaTelephonyManager.getDataSimSlotId(context));
    }

    public static boolean isWifiOnlyForDl() {
        return "wifi_dedicated".equalsIgnoreCase(getDeltaBinaryDownloadVia());
    }

    public static boolean needsToRemoveAutoDownloadMenu() {
        return AutoDownloadDefaultValues.get().needsToRemoveAutoDownloadMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getCarrierFeature(int i5, String str, boolean z4) {
        return SemCarrierFeature.getInstance().getBoolean(i5, str, z4, false);
    }

    private static boolean isShowMobileNetworkWarning(int i5) {
        return !DELEGATE.disableWarning4DataCostDuringFota(i5);
    }
}
