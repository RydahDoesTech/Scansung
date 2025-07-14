package com.samsung.android.fotaagent.common.feature;

import android.os.SemSystemProperties;
import android.text.TextUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class SalesCode {
    static final String COUNTRYCODE_CHINA = "CN";
    private static final String PRODUCTCODE_LTN_MOVISTAR_ALL = "TMM/UFN/UFU/COB/CHT/SAM/VMT/TGU/SAL/NBS/PBS/EBE/CRM";
    static final String PRODUCTCODE_RIL = "ril.product_code";
    private static final String SALESCODE_CHINA_ALL = "CTC/CHN/CHM/CHU/CHC/CBK";
    static final String SALESCODE_CSC = "ro.csc.sales_code";
    public static final String SALESCODE_KDI_ALL = "KDI/KDR";
    public static final String SALESCODE_KOO_ALL = "ANY/KOO";
    private static final String SALESCODE_KOREA_ALL = "KT/KTC/KTO/LG/LUC/LUO//SKT/SKC/SKO/ANY/KOO";
    public static final String SALESCODE_KT_ALL = "KT/KTC/KTO";
    static final String SALESCODE_KT_DEFAULT = "KT";
    private static final String SALESCODE_KT_UNUSED_ALL = "MKT/KTT";
    public static final String SALESCODE_LGT_ALL = "LG/LUC/LUO";
    static final String SALESCODE_LGT_DEFAULT = "LG";
    private static final String SALESCODE_LGT_UNUSED_ALL = "MLG/LGT";
    static final String SALESCODE_LTN_OPEN = "TFG";
    static final String SALESCODE_RIL = "ril.sales_code";
    public static final String SALESCODE_SKT_ALL = "SKT/SKC/SKO";
    static final String SALESCODE_SKT_DEFAULT = "SKT";
    private static final String SALESCODE_SKT_UNUSED_ALL = "MSK";
    static final String SALESCODE_SPR = "SPR";
    private static final String SALESCODE_SPR_ALL = "BST/SPR/VMU/XAS";
    private final String salesCode;

    public static class LazyInstanceHolder {
        private static final SalesCode INSTANCE = new SalesCode();

        private LazyInstanceHolder() {
        }
    }

    public static SalesCode get() {
        return LazyInstanceHolder.INSTANCE;
    }

    public boolean isChinaCountryFeature() {
        return COUNTRYCODE_CHINA.equalsIgnoreCase(SemSystemProperties.getCountryIso()) || SALESCODE_CHINA_ALL.contains(this.salesCode);
    }

    public boolean isKoreaCountryFeature() {
        return SALESCODE_KOREA_ALL.contains(this.salesCode);
    }

    public String loadSalesCode() {
        String str = SemSystemProperties.get(SALESCODE_CSC, "");
        if (TextUtils.isEmpty(str)) {
            str = SemSystemProperties.get(SALESCODE_RIL, "BTU");
        }
        if (SALESCODE_KT_UNUSED_ALL.contains(str)) {
            return SALESCODE_KT_DEFAULT;
        }
        if (SALESCODE_LGT_UNUSED_ALL.contains(str)) {
            return SALESCODE_LGT_DEFAULT;
        }
        if (SALESCODE_SKT_UNUSED_ALL.contains(str)) {
            return SALESCODE_SKT_DEFAULT;
        }
        if (SALESCODE_SPR_ALL.contains(str)) {
            return SALESCODE_SPR;
        }
        if (SALESCODE_LTN_OPEN.equals(str)) {
            String str2 = SemSystemProperties.get(PRODUCTCODE_RIL, "");
            if (!TextUtils.isEmpty(str2) && str2.length() >= 3) {
                String strSubstring = str2.substring(str2.length() - 3);
                if (PRODUCTCODE_LTN_MOVISTAR_ALL.contains(strSubstring)) {
                    Log.I("Use product code as customerCode for Movistar single binary(TFG)");
                    return strSubstring;
                }
            }
        }
        return str;
    }

    public String toString() {
        return this.salesCode;
    }

    private SalesCode() {
        this.salesCode = loadSalesCode();
    }
}
