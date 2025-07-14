package com.idm.fotaagent.enabler.fumo.policy.checkers;

import com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager;
import com.idm.fotaagent.enabler.fumo.policy.mdm.MDMManager;

/* loaded from: classes.dex */
public class Policies {

    public static class ForDownload {
        public static Exceptional getExceptional() {
            AfWManager afWManager = new AfWManager();
            afWManager.restartPolicyTimerIfNeeded();
            return Exceptional.of(new b(afWManager, 0), new c(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getExceptional$0(AfWManager afWManager) {
            afWManager.getBehavior().checkDownloadable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getExceptional$1() {
            MDMManager.getBehavior().checkDownloadable();
        }
    }

    public static class ForInstall {
        public static Exceptional getExceptional() {
            AfWManager afWManager = new AfWManager();
            afWManager.restartPolicyTimerIfNeeded();
            return Exceptional.of(new b(afWManager, 1), new c(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getExceptional$0(AfWManager afWManager) {
            afWManager.getBehavior().checkInstallable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getExceptional$1() {
            MDMManager.getBehavior().checkInstallable();
        }
    }
}
