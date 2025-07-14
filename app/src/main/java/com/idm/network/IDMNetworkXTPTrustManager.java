package com.idm.network;

import com.idm.adapter.logmanager.IDMDebug;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class IDMNetworkXTPTrustManager implements X509TrustManager {
    private boolean bSSLCheck;
    private X509TrustManager trustManager;

    public IDMNetworkXTPTrustManager(KeyStore keyStore, boolean z4) throws NoSuchAlgorithmException, KeyStoreException {
        IDMDebug.I("SSLCheck Condition : " + z4);
        this.bSSLCheck = z4;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            X509TrustManager x509TrustManagerIdmGetX509TrustManager = idmGetX509TrustManager(trustManagerFactory);
            this.trustManager = x509TrustManagerIdmGetX509TrustManager;
            if (x509TrustManagerIdmGetX509TrustManager != null) {
            } else {
                throw new IllegalStateException("X509TrustManager is null");
            }
        } catch (GeneralSecurityException e5) {
            throw new RuntimeException(e5);
        }
    }

    private X509TrustManager idmGetX509TrustManager(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.bSSLCheck) {
            IDMDebug.I("checkClientTrusted");
            this.trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.bSSLCheck) {
            IDMDebug.I("checkServerTrusted");
            this.trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.trustManager.getAcceptedIssuers();
    }
}
