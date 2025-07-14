package com.idm.fotaagent.scheduler;

import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.scheduler.DeviceInfoState;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6363a;

    public /* synthetic */ c(int i5) {
        this.f6363a = i5;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6363a) {
            case 0:
                return DeviceInfoState.Element.lambda$state$1((String) obj);
            case 1:
                return ((RegisteredDeviceRepository) obj).getDeviceId();
            case 2:
                return ((RegisteredDeviceRepository) obj).getModelName();
            default:
                return ((RegisteredDeviceRepository) obj).getSalesCode();
        }
    }
}
