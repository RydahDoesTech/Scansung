package com.idm.fotaagent.utils.storage;

import android.os.Environment;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CACHE' uses external variables
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
/* loaded from: classes.dex */
public abstract class StorageType {
    private static final /* synthetic */ StorageType[] $VALUES = $values();
    public static final StorageType CACHE;
    public static final StorageType DATA;
    static final String NAME_DELTA_FILE = "update.zip";
    public static final String PATH_CACHE = "/cache";
    private final int type;

    private static /* synthetic */ StorageType[] $values() {
        return new StorageType[]{CACHE, DATA};
    }

    static {
        int i5 = 0;
        CACHE = new StorageType("CACHE", i5, i5) { // from class: com.idm.fotaagent.utils.storage.StorageType.1
            @Override // com.idm.fotaagent.utils.storage.StorageType
            public String path() {
                return StorageType.PATH_CACHE;
            }
        };
        int i6 = 1;
        DATA = new StorageType("DATA", i6, i6) { // from class: com.idm.fotaagent.utils.storage.StorageType.2
            @Override // com.idm.fotaagent.utils.storage.StorageType
            public String path() {
                return Environment.getDataDirectory().getPath();
            }
        };
    }

    public static StorageType get(int i5) {
        return (StorageType) Arrays.stream(values()).filter(new com.idm.agent.dl.a(i5, 8)).findFirst().orElse(DATA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$get$0(int i5, StorageType storageType) {
        return i5 == storageType.type;
    }

    public static StorageType valueOf(String str) {
        return (StorageType) Enum.valueOf(StorageType.class, str);
    }

    public static StorageType[] values() {
        return (StorageType[]) $VALUES.clone();
    }

    public abstract String path();

    public String pathForDeltaFile() {
        return path() + "/fota/update.zip";
    }

    public String pathForFotaFolder() {
        return path() + "/fota";
    }

    public int type() {
        return this.type;
    }

    private StorageType(String str, int i5, int i6) {
        this.type = i6;
    }
}
