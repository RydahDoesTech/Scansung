package com.idm.adapter.filesystem;

import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.enabler.adapter.IDMAdapterNetworkImpl;
import com.idm.fotaagent.enabler.network.HTTPHeader;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.network.IDMNetworkInterface;
import java.io.File;
import java.nio.file.Path;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6203a;

    public /* synthetic */ a(int i5) {
        this.f6203a = i5;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f6203a) {
            case 0:
                return IDMFileSystemAdapter.lambda$idmGetDirSize$0((Path) obj);
            case 1:
                return UpdateStatus.InstallationStep.lambda$containsExceptIdle$4((UpdateStatus.InstallationStep) obj);
            case 2:
                return UpdateStatus.InstallationStep.lambda$ofNullable$1((UpdateStatus.InstallationStep) obj);
            case 3:
                return ((File) obj).exists();
            case 4:
                return DiagMon.Reporter.lambda$prepareFilesToReport$1((Path) obj);
            case 5:
                return IDMAdapterNetworkImpl.lambda$makeHttpUserAgent$1((String) obj);
            case 6:
                return HTTPHeader.lambda$makeHttpUserAgent$1((String) obj);
            case 7:
                return IDMNetworkInterface.IDM_HTTP_METHOD_GET.equals((String) obj);
            default:
                return InstallPolicy.lambda$enableFirstNetInstallIfNeeded$0((Integer) obj);
        }
    }
}
