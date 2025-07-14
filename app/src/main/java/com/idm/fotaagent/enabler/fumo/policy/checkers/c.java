package com.idm.fotaagent.enabler.fumo.policy.checkers;

import com.idm.fotaagent.enabler.fumo.policy.checkers.Policies;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Checker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6296a;

    public /* synthetic */ c(int i5) {
        this.f6296a = i5;
    }

    @Override // com.idm.fotaagent.enabler.fumo.policy.checkers.Checker
    public final void check() {
        switch (this.f6296a) {
            case 0:
                Policies.ForDownload.lambda$getExceptional$1();
                break;
            default:
                Policies.ForInstall.lambda$getExceptional$1();
                break;
        }
    }
}
