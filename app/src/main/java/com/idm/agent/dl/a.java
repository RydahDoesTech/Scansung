package com.idm.agent.dl;

import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions;
import com.idm.fotaagent.utils.storage.StorageType;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6213b;

    public /* synthetic */ a(int i5, int i6) {
        this.f6212a = i6;
        this.f6213b = i5;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i5 = this.f6212a;
        int i6 = this.f6213b;
        switch (i5) {
            case 0:
                return DLResultCode.lambda$of$0(i6, (DLResultCode) obj);
            case 1:
                return ErrorCode.lambda$of$0(i6, (ErrorCode) obj);
            case 2:
                return UpdateStatus.EngineStatus.lambda$of$0(i6, (UpdateStatus.EngineStatus) obj);
            case 3:
                return UpdateStatus.InstallationStep.lambda$containsExceptIdle$3(i6, (UpdateStatus.InstallationStep) obj);
            case 4:
                return UpdateStatus.InstallationStep.lambda$ofNullable$0(i6, (UpdateStatus.InstallationStep) obj);
            case 5:
                return UpdateStatus.InstallationStep.lambda$of$2(i6, (UpdateStatus.InstallationStep) obj);
            case 6:
                return DeviceRegistrationRepository.Requester.lambda$of$0(i6, (DeviceRegistrationRepository.Requester) obj);
            case 7:
                return AutoDownloadOptions.lambda$of$0(i6, (AutoDownloadOptions) obj);
            default:
                return StorageType.lambda$get$0(i6, (StorageType) obj);
        }
    }
}
