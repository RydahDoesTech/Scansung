package com.idm.fotaagent.database.room.data.repository;

import A.o;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.TypeLengthValueField;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class DmNotificationRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "DmNotification";
    private static final String NAME_SESSION_ID = "sessionId";

    public DmNotificationRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    private <T extends TypeLengthValueField> Optional<T> getValueOf(Class<T> cls) {
        return getValueOf(cls.getSimpleName());
    }

    private void insertOrReplaceWithoutException(Optional<? extends TypeLengthValueField> optional) {
        optional.ifPresent(new Consumer() { // from class: com.idm.fotaagent.database.room.data.repository.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f6252d.lambda$insertOrReplaceWithoutException$1((TypeLengthValueField) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertOrReplaceWithoutException$1(TypeLengthValueField typeLengthValueField) {
        insertOrReplaceWithoutException(typeLengthValueField.getClass().getSimpleName(), typeLengthValueField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$0(DmNotificationMessage dmNotificationMessage) {
        insertOrReplaceWithoutException(NAME_SESSION_ID, dmNotificationMessage.sessionId());
        insertOrReplaceWithoutException(dmNotificationMessage.installType());
        insertOrReplaceWithoutException(dmNotificationMessage.installPostponeType());
        insertOrReplaceWithoutException(dmNotificationMessage.updateType());
        insertOrReplaceWithoutException(dmNotificationMessage.serviceType());
        insertOrReplaceWithoutException(dmNotificationMessage.downloadType());
    }

    public Optional<DownloadType> downloadType() {
        return getValueOf(DownloadType.class);
    }

    public Optional<InstallPostponeType> installPostponeType() {
        return getValueOf(InstallPostponeType.class);
    }

    public Optional<InstallType> installType() {
        return getValueOf(InstallType.class);
    }

    public void save(DmNotificationMessage dmNotificationMessage) {
        runInTransaction(new o(this, 7, dmNotificationMessage));
    }

    public Optional<ServiceType> serviceType() {
        return getValueOf(ServiceType.class);
    }

    public Optional<String> sessionId() {
        return getValueOf(NAME_SESSION_ID);
    }

    public Optional<UpdateType> updateType() {
        return getValueOf(UpdateType.class);
    }
}
