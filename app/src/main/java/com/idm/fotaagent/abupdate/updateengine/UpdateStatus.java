package com.idm.fotaagent.abupdate.updateengine;

import E2.b;
import com.idm.agent.dl.a;
import java.util.Arrays;
import java.util.Optional;

/* loaded from: classes.dex */
public class UpdateStatus {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IDLE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class EngineStatus {
        public static final EngineStatus IDLE;
        private final int status;
        public static final EngineStatus UPDATE_AVAILABLE = new EngineStatus("UPDATE_AVAILABLE", 1, 2);
        public static final EngineStatus DOWNLOADING = new EngineStatus("DOWNLOADING", 2, 3);
        public static final EngineStatus VERIFYING = new EngineStatus("VERIFYING", 3, 4);
        public static final EngineStatus OPTIMIZING = new EngineStatus("OPTIMIZING", 4, 5);
        public static final EngineStatus UPDATED_NEED_REBOOT = new EngineStatus("UPDATED_NEED_REBOOT", 5, 6) { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateStatus.EngineStatus.2
            @Override // com.idm.fotaagent.abupdate.updateengine.UpdateStatus.EngineStatus
            public boolean isRunning() {
                return false;
            }
        };
        public static final EngineStatus CLEANUP_PREVIOUS_UPDATE = new EngineStatus("CLEANUP_PREVIOUS_UPDATE", 6, 11);
        public static final EngineStatus PREPARING_UPDATE = new EngineStatus("PREPARING_UPDATE", 7, -2);
        private static final /* synthetic */ EngineStatus[] $VALUES = $values();

        private static /* synthetic */ EngineStatus[] $values() {
            return new EngineStatus[]{IDLE, UPDATE_AVAILABLE, DOWNLOADING, VERIFYING, OPTIMIZING, UPDATED_NEED_REBOOT, CLEANUP_PREVIOUS_UPDATE, PREPARING_UPDATE};
        }

        static {
            int i5 = 0;
            IDLE = new EngineStatus("IDLE", i5, i5) { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateStatus.EngineStatus.1
                @Override // com.idm.fotaagent.abupdate.updateengine.UpdateStatus.EngineStatus
                public boolean isRunning() {
                    return false;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$of$0(int i5, EngineStatus engineStatus) {
            return engineStatus.getStatus() == i5;
        }

        public static EngineStatus of(int i5) {
            return (EngineStatus) Arrays.stream(values()).filter(new a(i5, 2)).findFirst().orElse(IDLE);
        }

        public static EngineStatus valueOf(String str) {
            return (EngineStatus) Enum.valueOf(EngineStatus.class, str);
        }

        public static EngineStatus[] values() {
            return (EngineStatus[]) $VALUES.clone();
        }

        public int getStatus() {
            return this.status;
        }

        public boolean isRunning() {
            return true;
        }

        private EngineStatus(String str, int i5, int i6) {
            this.status = i6;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IDLE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class InstallationStep {
        public static final InstallationStep IDLE;
        private final int status;
        public static final InstallationStep DOWNLOADING = new InstallationStep("DOWNLOADING", 1, 3) { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateStatus.InstallationStep.2
            @Override // com.idm.fotaagent.abupdate.updateengine.UpdateStatus.InstallationStep
            public boolean needsNetwork() {
                return true;
            }
        };
        public static final InstallationStep VERIFYING = new InstallationStep("VERIFYING", 2, 4);
        public static final InstallationStep OPTIMIZING = new InstallationStep("OPTIMIZING", 3, 5);
        private static final /* synthetic */ InstallationStep[] $VALUES = $values();

        private static /* synthetic */ InstallationStep[] $values() {
            return new InstallationStep[]{IDLE, DOWNLOADING, VERIFYING, OPTIMIZING};
        }

        static {
            int i5 = 0;
            IDLE = new InstallationStep("IDLE", i5, i5) { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateStatus.InstallationStep.1
                @Override // com.idm.fotaagent.abupdate.updateengine.UpdateStatus.InstallationStep
                public boolean needsNetwork() {
                    return true;
                }
            };
        }

        public static boolean containsExceptIdle(int i5) {
            return Arrays.stream(values()).filter(new a(i5, 3)).anyMatch(new com.idm.adapter.filesystem.a(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$containsExceptIdle$3(int i5, InstallationStep installationStep) {
            return installationStep.getStatus() == i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$containsExceptIdle$4(InstallationStep installationStep) {
            return installationStep != IDLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$of$2(int i5, InstallationStep installationStep) {
            return installationStep.getStatus() == i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$ofNullable$0(int i5, InstallationStep installationStep) {
            return installationStep.getStatus() == i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$ofNullable$1(InstallationStep installationStep) {
            return installationStep != IDLE;
        }

        public static InstallationStep of(int i5) {
            return (InstallationStep) Arrays.stream(values()).filter(new a(i5, 5)).findFirst().orElse(IDLE);
        }

        public static Optional<Integer> ofNullable(int i5) {
            return Arrays.stream(values()).filter(new a(i5, 4)).filter(new com.idm.adapter.filesystem.a(2)).map(new b(5)).findFirst();
        }

        public static InstallationStep valueOf(String str) {
            return (InstallationStep) Enum.valueOf(InstallationStep.class, str);
        }

        public static InstallationStep[] values() {
            return (InstallationStep[]) $VALUES.clone();
        }

        public int getStatus() {
            return this.status;
        }

        public boolean needsNetwork() {
            return false;
        }

        private InstallationStep(String str, int i5, int i6) {
            this.status = i6;
        }
    }

    public static class StatusConstants {
        private static final int CLEANUP_PREVIOUS_UPDATE = 11;
        private static final int DOWNLOADING = 3;
        private static final int IDLE = 0;
        private static final int OPTIMIZING = 5;
        private static final int PREPARING_UPDATE = -2;
        private static final int UPDATED_NEED_REBOOT = 6;
        private static final int UPDATE_AVAILABLE = 2;
        private static final int VERIFYING = 4;

        private StatusConstants() {
        }
    }
}
