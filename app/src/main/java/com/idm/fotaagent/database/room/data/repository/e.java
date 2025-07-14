package com.idm.fotaagent.database.room.data.repository;

import com.idm.fotaagent.database.room.data.repository.PropertyRepository;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6254e;
    public final /* synthetic */ long f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PropertyRepository.SpecificCategory f6255g;

    public /* synthetic */ e(PropertyRepository.SpecificCategory specificCategory, String str, long j5, int i5) {
        this.f6253d = i5;
        this.f6255g = specificCategory;
        this.f6254e = str;
        this.f = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6253d) {
            case 0:
                ((GeneralRepository) this.f6255g).lambda$setDeviceRegistrationReportInfo$0(this.f6254e, this.f);
                break;
            default:
                ((PolicyRepository) this.f6255g).lambda$setVersionAndExpiredTime$0(this.f6254e, this.f);
                break;
        }
    }
}
