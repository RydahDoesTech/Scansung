package com.idm.fotaagent.database.room.data.repository;

import com.idm.fotaagent.database.room.data.entity.CategoryNameValue;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6266a;

    public /* synthetic */ h(int i5) {
        this.f6266a = i5;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6266a) {
            case 0:
                return InstallParamRepository.Internal.lambda$static$0((String) obj);
            case 1:
                return InstallParamRepository.Internal.lambda$static$4((String) obj);
            case 2:
                return InstallParamRepository.Internal.lambda$static$5((String) obj);
            case 3:
                return InstallParamRepository.Internal.lambda$static$6((String) obj);
            case 4:
                return InstallParamRepository.Internal.lambda$static$7((String) obj);
            case 5:
                return InstallParamRepository.Internal.lambda$static$8((String) obj);
            case 6:
                return InstallParamRepository.Internal.lambda$static$9((String) obj);
            case 7:
                return InstallParamRepository.Internal.lambda$static$1((String) obj);
            case 8:
                return InstallParamRepository.Internal.lambda$static$2((String) obj);
            case 9:
                return InstallParamRepository.Internal.lambda$static$3((String) obj);
            case 10:
                return ((CategoryNameValue) obj).getDeserializedValue();
            case 11:
                return Long.valueOf(Long.parseLong((String) obj));
            case 12:
                return Integer.valueOf(Integer.parseInt((String) obj));
            default:
                return RegisteredDeviceRepository.decrypt((String) obj);
        }
    }
}
