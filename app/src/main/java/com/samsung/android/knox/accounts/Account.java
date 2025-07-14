package com.samsung.android.knox.accounts;

/* loaded from: classes.dex */
public class Account {
    public static final int FLAGS_NOTIFY_NEW_MAIL = 1;
    public static final int FLAGS_VIBRATE_ALWAYS = 2;
    public static final int FLAGS_VIBRATE_WHEN_SILENT = 64;
    public String compatibilityUuid;
    public String displayName;
    public String emailAddress;
    public int emailBodyTruncationSize;
    public boolean emailNotificationVibrateAlways;
    public int emailRoamingBodyTruncationSize;
    public int flags;
    public long hostAuthKeyRecv;
    public long hostAuthKeySend;
    public HostAuth hostAuthRecv;
    public HostAuth hostAuthSend;
    public int id;
    public boolean isDefault;
    public int newMessageCount;
    public int offPeakSyncSchedule;
    public int peakDays;
    public int peakEndMinute;
    public int peakStartMinute;
    public int peakSyncSchedule;
    public String protocolVersion;
    public String ringtoneUri;
    public int roamingSyncSchedule;
    public int securityFlags;
    public String securitySyncKey;
    public String senderName;
    public String signature;
    public boolean syncCalendar;
    public int syncCalendarAge;
    public boolean syncContacts;
    public int syncInterval;
    public String syncKey;
    public int syncLookback;
    public boolean syncNotes;
    public boolean syncTasks;

    public Account() {
        throw new RuntimeException("Stub!");
    }
}
