package com.idm.fotaagent.enabler.fumo;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IdleChecker;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeReason;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class IdleChecker {
    private static final String ACTION_WIRELESS_POWER_SHARING_ENABLED = "com.samsung.server.BatteryService.action.WIRELESS_POWER_SHARING_ENABLED";
    private static final String[] EXCEPTIONS = {"android.settings"};
    static final String EXTRA_TX_ENABLED = "enabled";
    static final String FLASH_LIGHT_ENABLED = "flashlight_enabled";
    private static final int RECORD_SOURCE_ALL = -1;
    static final String URI_SMART_SWITCH_RUNNING = "content://com.sec.android.easyMover.statusProvider/isRunning";
    private final Context context;
    private PostponeReason postponeReason = PostponeReason.NONE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class DeviceStatus {
        private final PostponeReason postponeReason;
        public static final DeviceStatus LCD = new DeviceStatus("LCD", 0, PostponeReason.BY_LCD) { // from class: com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus.1
            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    Log.W("PowerManager is null");
                    return false;
                }
                boolean zIsInteractive = powerManager.isInteractive();
                Log.I("isLcdOn : " + zIsInteractive);
                return zIsInteractive;
            }
        };
        public static final DeviceStatus AUDIO = new DeviceStatus("AUDIO", 1, PostponeReason.BY_AUDIO) { // from class: com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus.2
            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager == null) {
                    Log.W("AudioManager is null");
                    return false;
                }
                boolean zSemIsVoiceCallActive = audioManager.semIsVoiceCallActive();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zSemIsFmRadioActive = audioManager.semIsFmRadioActive();
                boolean zSemIsRecordActive = audioManager.semIsRecordActive(-1);
                Log.I("isVoiceCallActive : " + zSemIsVoiceCallActive + ", isMusicActive : " + zIsMusicActive + ", isFMActive : " + zSemIsFmRadioActive + ", isRecordActive : " + zSemIsRecordActive);
                return zSemIsVoiceCallActive || zIsMusicActive || zSemIsFmRadioActive || zSemIsRecordActive;
            }
        };
        public static final DeviceStatus SMART_SWITCH = new DeviceStatus("SMART_SWITCH", 2, PostponeReason.BY_SMART_SWITCH) { // from class: com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus.3
            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                String type = context.getContentResolver().getType(Uri.parse(IdleChecker.URI_SMART_SWITCH_RUNNING));
                Log.I("isSmartSwitchRunning : " + type);
                return "true".equalsIgnoreCase(type);
            }
        };
        public static final DeviceStatus DEX = new AnonymousClass4("DEX", 3, PostponeReason.BY_DEX);
        public static final DeviceStatus POWER_SHARING = new DeviceStatus("POWER_SHARING", 4, PostponeReason.BY_POWER_SHARING) { // from class: com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus.5
            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter(IdleChecker.ACTION_WIRELESS_POWER_SHARING_ENABLED));
                if (intentRegisterReceiver == null) {
                    return false;
                }
                boolean booleanExtra = intentRegisterReceiver.getBooleanExtra(IdleChecker.EXTRA_TX_ENABLED, false);
                Log.I("isPowerShare : " + booleanExtra);
                return booleanExtra;
            }
        };
        public static final DeviceStatus FLASH_LIGHT = new DeviceStatus("FLASH_LIGHT", 5, PostponeReason.BY_FLASH_LIGHT) { // from class: com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus.6
            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                boolean z4 = Settings.Secure.getInt(context.getContentResolver(), IdleChecker.FLASH_LIGHT_ENABLED, 0) == 1;
                Log.I("isFlashLightOn : " + z4);
                return z4;
            }
        };
        public static final DeviceStatus ALARM_CLOCK = new DeviceStatus("ALARM_CLOCK", 6, PostponeReason.BY_ALARM_CLOCK) { // from class: com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus.7
            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                if (new ActionInfoDao().getFumoStatus() != 50) {
                    Log.I("fumoStatus is not IDM_DL_STATE_READY_TO_UPDATE");
                    return false;
                }
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                if (alarmManager == null) {
                    Log.I("AlarmManager is null");
                    return false;
                }
                AlarmManager.AlarmClockInfo nextAlarmClock = alarmManager.getNextAlarmClock();
                if (nextAlarmClock == null) {
                    Log.I("alarm clock is not set");
                    return false;
                }
                long triggerTime = nextAlarmClock.getTriggerTime();
                if (triggerTime < System.currentTimeMillis()) {
                    Log.I("alarm clock time was passed");
                    return false;
                }
                boolean z4 = triggerTime - System.currentTimeMillis() <= ((long) TimeConstants.MINUTE_IN_MILLIS) * 30;
                Log.I("isAlarmClockSetWithin30Mins : " + z4);
                return z4;
            }
        };
        private static final /* synthetic */ DeviceStatus[] $VALUES = $values();

        /* renamed from: com.idm.fotaagent.enabler.fumo.IdleChecker$DeviceStatus$4, reason: invalid class name */
        public enum AnonymousClass4 extends DeviceStatus {
            public AnonymousClass4(String str, int i5, PostponeReason postponeReason) {
                super(str, i5, postponeReason);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ boolean lambda$runs$0(int i5, Display display) {
                return (i5 & display.getFlags()) != 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean lambda$runs$1(final int i5, DisplayManager displayManager) {
                boolean zAnyMatch = Stream.of((Object[]) displayManager.getDisplays()).anyMatch(new Predicate() { // from class: com.idm.fotaagent.enabler.fumo.h
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return IdleChecker.DeviceStatus.AnonymousClass4.lambda$runs$0(i5, (Display) obj);
                    }
                });
                Log.I("isDex : " + zAnyMatch);
                return Boolean.valueOf(zAnyMatch);
            }

            @Override // com.idm.fotaagent.enabler.fumo.IdleChecker.DeviceStatus
            public boolean runs(Context context) {
                return ((Boolean) Optional.ofNullable((DisplayManager) context.getSystemService("display")).map(new i()).orElse(Boolean.FALSE)).booleanValue();
            }
        }

        private static /* synthetic */ DeviceStatus[] $values() {
            return new DeviceStatus[]{LCD, AUDIO, SMART_SWITCH, DEX, POWER_SHARING, FLASH_LIGHT, ALARM_CLOCK};
        }

        public static DeviceStatus valueOf(String str) {
            return (DeviceStatus) Enum.valueOf(DeviceStatus.class, str);
        }

        public static DeviceStatus[] values() {
            return (DeviceStatus[]) $VALUES.clone();
        }

        public abstract boolean runs(Context context);

        private DeviceStatus(String str, int i5, PostponeReason postponeReason) {
            this.postponeReason = postponeReason;
        }
    }

    public IdleChecker(Context context) {
        this.context = context;
    }

    private boolean isDeviceIdle() {
        if (FloatingFeature.isMHSDevice() || DeviceUtils.isLiveDemoDevice()) {
            Log.I("MHS or Live Demo: true");
            return true;
        }
        if (isFotaAgentScreenOrExceptionsScreen()) {
            Log.I("FotaAgent Screen or Exceptions Screen");
            return true;
        }
        Stream.of((Object[]) DeviceStatus.values()).filter(new Predicate() { // from class: com.idm.fotaagent.enabler.fumo.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f6288a.lambda$isDeviceIdle$0((IdleChecker.DeviceStatus) obj);
            }
        }).findAny().ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.fumo.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f6289d.lambda$isDeviceIdle$1((IdleChecker.DeviceStatus) obj);
            }
        });
        return !r0.isPresent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$isDeviceIdle$0(DeviceStatus deviceStatus) {
        return deviceStatus.runs(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isDeviceIdle$1(DeviceStatus deviceStatus) {
        this.postponeReason = deviceStatus.postponeReason;
    }

    private String loadTopPackageName() throws SecurityException {
        try {
            ActivityManager activityManager = (ActivityManager) this.context.getSystemService(ActivityManager.class);
            Objects.requireNonNull(activityManager, "am should not be null");
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            Objects.requireNonNull(runningTasks, "tasks should not be null");
            return runningTasks.get(0).topActivity.getPackageName();
        } catch (IndexOutOfBoundsException | NullPointerException e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    public PostponeReason getPostponeReason() {
        return this.postponeReason;
    }

    public boolean isCallIdle() {
        int callStateForSubscription;
        TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService(TelephonyManager.class);
        if (telephonyManager != null) {
            callStateForSubscription = telephonyManager.getCallStateForSubscription();
            A3.f.t("Call state: ", callStateForSubscription);
        } else {
            Log.I("tm should not be null");
            callStateForSubscription = 0;
        }
        boolean z4 = callStateForSubscription == 0;
        if (!z4) {
            this.postponeReason = PostponeReason.BY_CALL;
        }
        return z4;
    }

    public boolean isFotaAgentScreenOrExceptionsScreen() throws SecurityException {
        String strLoadTopPackageName = loadTopPackageName();
        for (String str : EXCEPTIONS) {
            if (strLoadTopPackageName.contains(str)) {
                return true;
            }
        }
        return loadTopPackageName().contains(this.context.getPackageName());
    }

    public boolean isIdle() {
        return isCallIdle() && isDeviceIdle();
    }
}
