package com.idm.fotaagent.database.sqlite.database.mo;

import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand;
import java.util.function.IntFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6275a;

    public /* synthetic */ b(int i5) {
        this.f6275a = i5;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i5) {
        switch (this.f6275a) {
            case 0:
                return Feature.MockInstallPostponeType.lambda$new$0(i5);
            default:
                return HiddenCommand.lambda$showDialog$0(i5);
        }
    }
}
