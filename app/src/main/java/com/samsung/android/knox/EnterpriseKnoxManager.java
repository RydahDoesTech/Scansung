package com.samsung.android.knox;

import android.content.Context;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.integrity.EnhancedAttestationPolicy;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.keystore.ClientCertificateManager;
import com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy;
import com.samsung.android.knox.keystore.TimaKeystore;
import com.samsung.android.knox.kpm.KnoxPushService;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.billing.EnterpriseBillingPolicy;
import com.samsung.android.knox.net.nap.NetworkAnalytics;
import com.samsung.android.knox.net.vpn.GenericVpnPolicy;
import com.samsung.android.knox.restriction.AdvancedRestrictionPolicy;
import com.samsung.android.knox.ucm.configurator.UniversalCredentialManager;

/* loaded from: classes.dex */
public class EnterpriseKnoxManager {
    public EnterpriseKnoxManager() {
        throw new RuntimeException("Stub!");
    }

    public static EnterpriseKnoxManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static EnterpriseKnoxManager getParentInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public AdvancedRestrictionPolicy getAdvancedRestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public AuditLog getAuditLogPolicy() {
        throw new RuntimeException("Stub!");
    }

    public CertificatePolicy getCertificatePolicy() {
        throw new RuntimeException("Stub!");
    }

    public ClientCertificateManager getClientCertificateManagerPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EnhancedAttestationPolicy getEnhancedAttestationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EnterpriseBillingPolicy getEnterpriseBillingPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EnterpriseCertEnrollPolicy getEnterpriseCertEnrollPolicy(String str) {
        throw new RuntimeException("Stub!");
    }

    public GenericVpnPolicy getGenericVpnPolicy(String str, int i5) {
        throw new RuntimeException("Stub!");
    }

    public synchronized KnoxContainerManager getKnoxContainerManager(int i5) {
        throw new RuntimeException("Stub!");
    }

    public KnoxPushService getKnoxPushService() {
        throw new RuntimeException("Stub!");
    }

    public NetworkAnalytics getNetworkAnalytics() {
        throw new RuntimeException("Stub!");
    }

    public TimaKeystore getTimaKeystorePolicy() {
        throw new RuntimeException("Stub!");
    }

    public UniversalCredentialManager getUCMManager() {
        throw new RuntimeException("Stub!");
    }
}
