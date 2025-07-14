package com.idm.fotaagent.enabler.fumo.expiration;

import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationService;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EXPIRATION_NOTIFY' uses external variables
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
public final class SessionExpiration {
    private static final /* synthetic */ SessionExpiration[] $VALUES;
    public static final SessionExpiration EXPIRATION_CANCEL;
    public static final SessionExpiration EXPIRATION_NOTIFY;
    public static final SessionExpiration RESCHEDULE_CANCEL;
    private final int jobId;
    private final long latencyInMillis;
    private final Class<?> serviceClass;

    private static /* synthetic */ SessionExpiration[] $values() {
        return new SessionExpiration[]{EXPIRATION_NOTIFY, EXPIRATION_CANCEL, RESCHEDULE_CANCEL};
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        EXPIRATION_NOTIFY = new SessionExpiration("EXPIRATION_NOTIFY", 0, SessionExpirationService.ForNotify.class, 760745596, timeUnit.toMillis(28L));
        EXPIRATION_CANCEL = new SessionExpiration("EXPIRATION_CANCEL", 1, SessionExpirationService.ForCancel.class, 760745597, timeUnit.toMillis(30L));
        RESCHEDULE_CANCEL = new SessionExpiration("RESCHEDULE_CANCEL", 2, SessionExpirationService.ForCancel.class, 760745597, timeUnit.toMillis(1L));
        $VALUES = $values();
    }

    private SessionExpiration(String str, int i5, Class cls, int i6, long j5) {
        this.serviceClass = cls;
        this.jobId = i6;
        this.latencyInMillis = j5;
    }

    public static SessionExpiration valueOf(String str) {
        return (SessionExpiration) Enum.valueOf(SessionExpiration.class, str);
    }

    public static SessionExpiration[] values() {
        return (SessionExpiration[]) $VALUES.clone();
    }

    public int getJobId() {
        return this.jobId;
    }

    public long getLatencyInMillis() {
        return this.latencyInMillis;
    }

    public Class<?> getServiceClass() {
        return this.serviceClass;
    }
}
