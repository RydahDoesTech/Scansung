package com.idm.fotaagent.enabler.feature;

import E2.b;
import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.idm.fotaagent.database.sqlite.database.mo.a;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public enum Operator {
    COMMON(""),
    DCM { // from class: com.idm.fotaagent.enabler.feature.Operator.1
        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getInvalidDeltaMessageId() {
            return R.string.STR_FOTA_UPDATE_FAIL_DCM;
        }

        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getUpdateFailedMessageId() {
            return R.string.STR_FOTA_UPDATE_FAIL_DCM;
        }
    },
    KDI(SalesCode.SALESCODE_KDI_ALL) { // from class: com.idm.fotaagent.enabler.feature.Operator.2
        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getUpdateFailedMessageId() {
            return R.string.STR_FOTA_UPDATE_FAIL_KDI;
        }
    },
    KT(SalesCode.SALESCODE_KT_ALL) { // from class: com.idm.fotaagent.enabler.feature.Operator.3
        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getDownloadConfirmOperatorBody(String str) {
            return Operator.getMobileDataFreeStringId(str);
        }

        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getInstallConfirmOperatorBody(String str) {
            return Operator.getMobileDataFreeStringId(str);
        }
    },
    LGT(SalesCode.SALESCODE_LGT_ALL) { // from class: com.idm.fotaagent.enabler.feature.Operator.4
        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getDownloadConfirmOperatorBody(String str) {
            return Operator.getMobileDataFreeStringId(str);
        }

        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getInstallConfirmOperatorBody(String str) {
            return Operator.getMobileDataFreeStringId(str);
        }
    },
    SKT(SalesCode.SALESCODE_SKT_ALL),
    KOO(SalesCode.SALESCODE_KOO_ALL),
    TMB { // from class: com.idm.fotaagent.enabler.feature.Operator.5
        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getBatteryLevel() {
            return 30;
        }
    },
    TMK { // from class: com.idm.fotaagent.enabler.feature.Operator.6
        @Override // com.idm.fotaagent.enabler.feature.Operator
        public int getBatteryLevel() {
            return 30;
        }
    },
    USC { // from class: com.idm.fotaagent.enabler.feature.Operator.7
        private final String[] allowSPNList = {"U.S. Cellular"};

        @Override // com.idm.fotaagent.enabler.feature.Operator
        public boolean isSimAllowed(Context context) {
            String simOperatorName = FotaTelephonyManager.getSimOperatorName(context);
            Log.D("service provider name - " + simOperatorName);
            if (TextUtils.isEmpty(simOperatorName)) {
                return false;
            }
            for (String str : this.allowSPNList) {
                if (simOperatorName.equals(str)) {
                    return true;
                }
            }
            Log.I("It is not USC sim");
            return false;
        }
    };

    private static final Operator[] values = values();
    private final String salesCode;

    public static class MockOperator extends Feature<Operator> {
        public MockOperator(Context context) {
            super(context, Operator.values(), new a(6), new b(16), new c(13));
        }
    }

    public static boolean belongsTo(Operator... operatorArr) {
        if (operatorArr == null) {
            return false;
        }
        for (Operator operator : operatorArr) {
            if (get() == operator) {
                return true;
            }
        }
        return false;
    }

    public static Operator get() {
        return getDeviceOperator();
    }

    private static Operator getDeviceOperator() {
        Log.I("getDeviceOperator");
        return new MockOperator(IDMApplication.idmGetContext()).getValue().orElseGet(new A2.b(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMobileDataFreeStringId(String str) {
        if (WifiOnlyChecker.getInstance().isWifiOnlyForDl(str)) {
            return -1;
        }
        if (!CarrierFeature.isShowMobileNetworkWarning()) {
            return R.string.STR_FOTA_CONFIRM_MOBILE_DATA_FREE;
        }
        Log.W("isShowMobileNetworkWarning should be false");
        return R.string.STR_FOTA_CONFIRM_MOBILE_DATA_FREE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Operator getOperator() {
        String string = SalesCode.get().toString();
        for (Operator operator : values()) {
            if (operator.getSalesCode().contains(string)) {
                return operator;
            }
        }
        return COMMON;
    }

    public int getBatteryLevel() {
        return 20;
    }

    public int getDownloadConfirmOperatorBody(String str) {
        return -1;
    }

    public int getInstallConfirmOperatorBody(String str) {
        return -1;
    }

    public int getInvalidDeltaMessageId() {
        return R.string.STR_FOTA_UPDATE_FAIL_OSP;
    }

    public String getSalesCode() {
        return this.salesCode;
    }

    public int getUpdateFailedMessageId() {
        return R.string.STR_FOTA_UPDATE_FAIL_OSP;
    }

    public boolean isSimAllowed(Context context) {
        return true;
    }

    public static Operator valueOf(int i5) {
        try {
            return values[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    Operator(String str) {
        this.salesCode = str;
    }

    Operator() {
        this.salesCode = name();
    }
}
