package com.samsung.android.fotaagent.common.feature;

import com.samsung.android.feature.SemFloatingFeature;

/* loaded from: classes.dex */
public class FloatingFeature {
    private static final String COMMON_SUPPORT_MHS_DONGLE = "SEC_FLOATING_FEATURE_COMMON_SUPPORT_MHS_DONGLE";
    private static final String COMMON_SUPPORT_UNPACK = "SEC_FLOATING_FEATURE_COMMON_SUPPORT_UNPACK";

    @FeatureDelegate
    private static final Delegate DELEGATE = new Delegate.Impl();
    private static final String SETTINGS_SUPPORT_DIGITAL_ASSISTANT_WELCOME = "SEC_FLOATING_FEATURE_SETTINGS_SUPPORT_DIGITAL_ASSISTANT_WELCOME";
    private static final String SMP_CONFIG_SPP_ACTIVATION_MODE = "SEC_FLOATING_FEATURE_SMP_CONFIG_SPP_ACTIVATION_MODE";

    @FeatureDelegate
    public interface Delegate {

        public static class Impl implements Delegate {
            @Override // com.samsung.android.fotaagent.common.feature.FloatingFeature.Delegate
            public boolean isDigitalAssistantWelcome() {
                return SemFloatingFeature.getInstance().getBoolean(FloatingFeature.SETTINGS_SUPPORT_DIGITAL_ASSISTANT_WELCOME);
            }

            @Override // com.samsung.android.fotaagent.common.feature.FloatingFeature.Delegate
            public boolean isMHSDevice() {
                return SemFloatingFeature.getInstance().getBoolean(FloatingFeature.COMMON_SUPPORT_MHS_DONGLE);
            }

            @Override // com.samsung.android.fotaagent.common.feature.FloatingFeature.Delegate
            public boolean isUnpackDevice() {
                return SemFloatingFeature.getInstance().getBoolean(FloatingFeature.COMMON_SUPPORT_UNPACK);
            }

            @Override // com.samsung.android.fotaagent.common.feature.FloatingFeature.Delegate
            public String smpConfigSppActivationMode() {
                return SemFloatingFeature.getInstance().getString(FloatingFeature.SMP_CONFIG_SPP_ACTIVATION_MODE);
            }
        }

        @FeatureAttribute(description = "Return true if digital assistant welcome feature is enabled", values = {"true", "false"})
        boolean isDigitalAssistantWelcome();

        @FeatureAttribute(description = "Return true if MHS device.", values = {"true", "false"})
        boolean isMHSDevice();

        @FeatureAttribute(description = "Return true if unpack model.", values = {"true", "false"})
        boolean isUnpackDevice();

        @FeatureAttribute(description = "force_action_mode: force to use SPP for push", values = {"force_activation_mode"})
        String smpConfigSppActivationMode();
    }

    public static boolean forcesSpp() {
        return "force_activation_mode".equals(DELEGATE.smpConfigSppActivationMode());
    }

    public static boolean isMHSDevice() {
        return DELEGATE.isMHSDevice();
    }

    public static boolean isMinorWelcomeMode() {
        return DELEGATE.isDigitalAssistantWelcome();
    }

    public static boolean isUnpackDevice() {
        return DELEGATE.isUnpackDevice();
    }
}
