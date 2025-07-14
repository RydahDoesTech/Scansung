package com.idm.fotaagent.enabler.ui;

import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6321a;

    public /* synthetic */ d(int i5) {
        this.f6321a = i5;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f6321a) {
            case 0:
                return IDMUIManager.lambda$finishEntryActivityIfExists$2((Map.Entry) obj);
            case 1:
                return IDMUIManager.lambda$getActivityInMapEntryFirstly$7((Map.Entry) obj);
            case 2:
                return IDMUIManager.lambda$getActivityInMapWithoutEntry$5((Map.Entry) obj);
            case 3:
                return IDMUIManager.lambda$finishAllActivities$8((String) obj);
            default:
                return IDMUIManager.lambda$getActivityInMapEntryFirstly$6((Map.Entry) obj);
        }
    }
}
