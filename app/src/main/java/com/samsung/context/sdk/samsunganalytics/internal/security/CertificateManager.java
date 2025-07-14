package com.samsung.context.sdk.samsunganalytics.internal.security;

import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes.dex */
public class CertificateManager {
    private static final String CA_STORE_NAME = "AndroidCAStore";
    private static final String SSL_PROTOCOL = "TLS";
    private SSLContext sslContext;

    public static class Singleton {
        private static final CertificateManager instance = new CertificateManager();

        private Singleton() {
        }
    }

    public static CertificateManager getInstance() {
        return Singleton.instance;
    }

    private void pinningSystemCA() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            KeyStore keyStore2 = KeyStore.getInstance(CA_STORE_NAME);
            keyStore2.load(null, null);
            Enumeration<String> enumerationAliases = keyStore2.aliases();
            while (enumerationAliases.hasMoreElements()) {
                String strNextElement = enumerationAliases.nextElement();
                X509Certificate x509Certificate = (X509Certificate) keyStore2.getCertificate(strNextElement);
                if (strNextElement.startsWith("system:")) {
                    keyStore.setCertificateEntry(strNextElement, x509Certificate);
                }
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            SSLContext sSLContext = SSLContext.getInstance(SSL_PROTOCOL);
            this.sslContext = sSLContext;
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            Debug.LogENG("pinning success");
        } catch (Exception e5) {
            Debug.logwingW("pinning fail : " + e5.getMessage());
        }
    }

    public SSLContext getSSLContext() {
        return this.sslContext;
    }

    private CertificateManager() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        pinningSystemCA();
    }
}
