package com.idm.fotaagent.enabler.ui;

import com.idm.fotaagent.enabler.ui.ActivityScreenIdMapper;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6317a;

    public /* synthetic */ b(int i5) {
        this.f6317a = i5;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6317a) {
            case 0:
                return ActivityScreenIdMapper.lambda$getScreenIdFrom$1((ActivityScreenIdMapper.ScreenId) obj);
            case 1:
                return IDMUIManager.lambda$finishEntryActivityIfExists$3((Map.Entry) obj);
            default:
                return IDMUIManager.lambda$startActivity$1((Map.Entry) obj);
        }
    }
}
