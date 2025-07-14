package com.samsung.android.knox.ucm.plugin.agent;

import android.os.Bundle;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyPairGeneratorSpi;
import java.security.KeyStore;
import java.security.KeyStoreSpi;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.crypto.CipherSpi;

/* loaded from: classes.dex */
public class UcmAgentProviderImpl extends Provider {
    public static final String CIPHER = "Cipher";
    public static final String CIPHER_RSA_ECB_PKCS1PADDING = "RSA/ECB/PKCS1Padding";
    public static final String KEYPAIRGENERATOR = "KeyPairGenerator";
    public static final String KEYPAIRGENERATOR_RSA = "RSA";
    public static final String KEYSTORE = "KeyStore";
    public static final String KEYSTORE_TYPE = "KNOX";
    public static final String SECURERANDOM = "SecureRandom";
    public static final String SECURERANDOM_SHA1PRNG = "SHA1PRNG";

    public static abstract class UcmAgentCipherSpi extends CipherSpi implements UcmAgentSpiProperty {
        public UcmAgentCipherSpi() {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public int engineDoFinal(byte[] bArr, int i5, int i6, byte[] bArr2, int i7) {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public abstract byte[] engineDoFinal(byte[] bArr, int i5, int i6);

        @Override // javax.crypto.CipherSpi
        public int engineGetBlockSize() {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public byte[] engineGetIV() {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public int engineGetOutputSize(int i5) {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public AlgorithmParameters engineGetParameters() {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public abstract void engineInit(int i5, Key key, SecureRandom secureRandom);

        @Override // javax.crypto.CipherSpi
        public void engineInit(int i5, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public byte[] engineUpdate(byte[] bArr, int i5, int i6) {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public Bundle getProperty() {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public void setErrorCode(int i5) {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public void engineInit(int i5, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
            throw new RuntimeException("Stub!");
        }

        @Override // javax.crypto.CipherSpi
        public int engineUpdate(byte[] bArr, int i5, int i6, byte[] bArr2, int i7) {
            throw new RuntimeException("Stub!");
        }
    }

    public static abstract class UcmAgentKeyPairGeneratorSpi extends KeyPairGeneratorSpi implements UcmAgentSpiProperty {
        public UcmAgentKeyPairGeneratorSpi() {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public Bundle getProperty() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyPairGeneratorSpi
        public void initialize(int i5, SecureRandom secureRandom) {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public void setErrorCode(int i5) {
            throw new RuntimeException("Stub!");
        }
    }

    public static abstract class UcmAgentKeyStoreSpi extends KeyStoreSpi implements UcmAgentSpiProperty {
        public UcmAgentKeyStoreSpi() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public String engineGetCertificateAlias(Certificate certificate) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public Date engineGetCreationDate(String str) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public abstract void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter);

        @Override // java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public abstract void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter);

        @Override // java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public Bundle getProperty() {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public void setErrorCode(int i5) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            throw new RuntimeException("Stub!");
        }
    }

    public static abstract class UcmAgentSecureRandomSpi extends SecureRandomSpi implements UcmAgentSpiProperty {
        public UcmAgentSecureRandomSpi() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.SecureRandomSpi
        public abstract byte[] engineGenerateSeed(int i5);

        public void engineMixSeed(byte[] bArr) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public Bundle getProperty() {
            throw new RuntimeException("Stub!");
        }

        @Override // com.samsung.android.knox.ucm.plugin.agent.UcmAgentProviderImpl.UcmAgentSpiProperty
        public void setErrorCode(int i5) {
            throw new RuntimeException("Stub!");
        }
    }

    public interface UcmAgentSpiProperty {
        public static final String KEY_ADMIN_ID = "admin_id";
        public static final String KEY_ALGORITHM = "algorithm";
        public static final String KEY_CALLER_UID = "callerUid";
        public static final String KEY_ENTRY_TYPE = "entryType";
        public static final String KEY_EXTRA_ARGS = "extraArgs";
        public static final String KEY_ISALLOWWIFI = "allow_wifi";
        public static final String KEY_ISMANAGED = "ismanaged";
        public static final String KEY_IS_CALLER_MDM = "ismdm";
        public static final String KEY_KEYSIZE = "keysize";
        public static final String KEY_OWNER_ID = "ownerUid";
        public static final String KEY_RENEW_CERT = "renew";
        public static final String KEY_RESOURCE_ID = "resource";
        public static final String KEY_USER_ID = "user_id";
        public static final int PRIVATE_RESOURCE = 2;
        public static final int SHARED_KEYCHAIN_RESOURCE = 1;
        public static final int SHARED_WIFI_RESOURCE = 3;
        public static final int UCS_ALL_RESOURCE = 4;

        Bundle getProperty();

        void setErrorCode(int i5);
    }

    public UcmAgentProviderImpl() {
        super(null, 0.0d, null);
        throw new RuntimeException("Stub!");
    }

    public void putServiceImpl(Provider.Service service) {
        throw new RuntimeException("Stub!");
    }

    public void removeServiceImpl(Provider.Service service) {
        throw new RuntimeException("Stub!");
    }
}
