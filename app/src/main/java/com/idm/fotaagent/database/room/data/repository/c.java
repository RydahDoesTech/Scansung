package com.idm.fotaagent.database.room.data.repository;

import com.idm.fotaagent.database.room.data.repository.PropertyRepository;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PropertyRepository.SpecificCategory f6251e;

    public /* synthetic */ c(PropertyRepository.SpecificCategory specificCategory, int i5) {
        this.f6250d = i5;
        this.f6251e = specificCategory;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f6250d;
        PropertyRepository.SpecificCategory specificCategory = this.f6251e;
        switch (i5) {
            case 0:
                ((DeviceRegistrationRepository) specificCategory).lambda$setRegister$0();
                break;
            default:
                ((PolicyRepository) specificCategory).lambda$clearVersionAndExpiredTime$1();
                break;
        }
    }
}
