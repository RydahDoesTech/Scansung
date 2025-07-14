package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.idm.fotaagent.enabler.security.IDMSecurityAESCryptImpl;
import java.util.Optional;

/* loaded from: classes.dex */
public class RegisteredDeviceRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "RegisteredDevice";
    private static final String NAME_DEVICE_ID = "deviceId";
    private static final String NAME_MODEL_NAME = "modelName";
    private static final String NAME_SALES_CODE = "salesCode";

    public RegisteredDeviceRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String decrypt(String str) {
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = new IDMSecurityAESCryptImpl();
        return iDMSecurityAESCryptImpl.idmDecryptorStrBase64(str, iDMSecurityAESCryptImpl.idmGetCryptionkey());
    }

    public static String encrypt(String str) {
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = new IDMSecurityAESCryptImpl();
        return iDMSecurityAESCryptImpl.idmEncryptorStrBase64(str, iDMSecurityAESCryptImpl.idmGetCryptionkey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$0(String str, String str2, String str3) {
        insertOrReplaceWithoutException("deviceId", encrypt(str));
        insertOrReplaceWithoutException(NAME_MODEL_NAME, str2);
        insertOrReplaceWithoutException(NAME_SALES_CODE, str3);
    }

    public void clear() {
        deleteAll();
    }

    public Optional<String> getDeviceId() {
        return getValueOf("deviceId").map(new h(13));
    }

    public Optional<String> getModelName() {
        return getValueOf(NAME_MODEL_NAME);
    }

    public Optional<String> getSalesCode() {
        return getValueOf(NAME_SALES_CODE);
    }

    public void save(final String str, final String str2, final String str3) {
        runInTransaction(new Runnable() { // from class: com.idm.fotaagent.database.room.data.repository.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f6268d.lambda$save$0(str, str2, str3);
            }
        });
    }
}
