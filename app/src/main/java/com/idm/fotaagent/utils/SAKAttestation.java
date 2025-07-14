package com.idm.fotaagent.utils;

import A2.c;
import android.security.keystore.KeyGenParameterSpec;
import com.idm.fotaagent.IDMApplication;
import com.samsung.android.security.keystore.AttestationUtils;
import g4.f;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SAKAttestation {
    private static final String ALIAS;
    private static final String CLIENT_ID;

    static {
        String strReplace = IDMApplication.idmGetContext().getPackageName().replace('.', '_');
        CLIENT_ID = strReplace;
        ALIAS = f.d("AttestationKey_", strReplace);
    }

    private List<byte[]> attestKey(String str) throws NoSuchAlgorithmException, IOException, CertificateException {
        KeyStore.getInstance("AndroidKeyStore").load(null);
        ArrayList arrayList = new ArrayList();
        new AttestationUtils().attestKey(ALIAS, str.getBytes()).forEach(new c(18, arrayList));
        return arrayList;
    }

    private void generateKeyPair() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(ALIAS, 12).setDigests("SHA-256").setSignaturePaddings("PSS").setKeySize(2048).build());
        keyPairGenerator.generateKeyPair();
    }

    public List<byte[]> retrieveCertificateChain(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        generateKeyPair();
        return attestKey(str);
    }
}
