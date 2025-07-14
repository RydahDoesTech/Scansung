package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import android.database.Cursor;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao;
import com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao;
import com.idm.fotaagent.database.room.data.dao.PropertyDao;
import com.idm.fotaagent.database.room.data.entity.Property;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;
import u0.AbstractC0877a;

/* loaded from: classes.dex */
public abstract class FotaRoomDatabase extends androidx.room.j {
    public static String DATABASE_NAME = "fota_room";
    private static volatile FotaRoomDatabase INSTANCE;
    static final AbstractC0877a MIGRATION_6_7 = new PreferenceSettingPopulation.ByMigration();
    static final AbstractC0877a MIGRATION_7_8 = new PolicySettingPopulation.ByMigration();
    static final AbstractC0877a MIGRATION_8_9 = new BaseInfoPopulation.ByMigration();
    static final AbstractC0877a MIGRATION_9_10 = new DeviceRegistrationPopulation.ByMigration();

    public static class BaseInfoPopulation {

        public static class ByMigration extends AbstractC0877a {
            public ByMigration() {
                super(8, 9);
            }

            @Override // u0.AbstractC0877a
            public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                Log.I(this.startVersion + " to " + this.endVersion);
                BaseInfoPopulation.populate(supportSQLiteDatabase);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void populate(SupportSQLiteDatabase supportSQLiteDatabase) {
            try {
                String basicInfo = IDMDatabaseManager.getInstance().getBasicInfo(IDMDatabaseInterface.IDM_DB_ENABLER_BASIC_PREVIOUS_FIRMWAREVERSION);
                if (TextUtils.isEmpty(basicInfo)) {
                    Log.I("no data for migration");
                } else {
                    CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(GeneralRepository.CATEGORY, "previousFirmwareVersion", basicInfo));
                }
            } catch (IOException e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    public static class DeviceRegistrationPopulation {

        public static class ByMigration extends AbstractC0877a {
            public ByMigration() {
                super(9, 10);
            }

            @Override // u0.AbstractC0877a
            public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                Log.I(this.startVersion + " to " + this.endVersion);
                DeviceRegistrationPopulation.populate(supportSQLiteDatabase);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void populate(SupportSQLiteDatabase supportSQLiteDatabase) {
            try {
                Cursor cursorI = supportSQLiteDatabase.i("SELECT * FROM property WHERE category = 'DeviceRegistration' AND name = 'state' LIMIT 1");
                try {
                    if (!cursorI.moveToNext()) {
                        Log.W("empty!!");
                        cursorI.close();
                        return;
                    }
                    ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(cursorI.getBlob(cursorI.getColumnIndex("value"))));
                    try {
                        Object object = objectInputStream.readObject();
                        Objects.requireNonNull(object, "readObject() should not be null");
                        int iIntValue = ((Integer) object).intValue();
                        Log.I("state : " + iIntValue);
                        if (iIntValue == 2) {
                            Log.I("change the state from invalid to unregister");
                            CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(DeviceRegistrationRepository.CATEGORY, "state", 0));
                        }
                        objectInputStream.close();
                        cursorI.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    public static class PolicySettingPopulation {
        private static final String POLICY_OTA_VERSION = "FOTA_SYSTEM_POLICY_OTA_VERSION";
        private static final String POLICY_TYPE = "FOTA_SYSTEM_POLICY_TYPE";
        private static final String POLICY_VALID_TIME = "FOTA_SYSTEM_POLICY_VALID_TIME";

        public static class ByMigration extends AbstractC0877a {
            public ByMigration() {
                super(7, 8);
            }

            @Override // u0.AbstractC0877a
            public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                Log.I(this.startVersion + " to " + this.endVersion);
                PolicySettingPopulation.populate(supportSQLiteDatabase);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void populate(SupportSQLiteDatabase supportSQLiteDatabase) {
            try {
                Context contextIdmGetContext = IDMApplication.idmGetContext();
                int i5 = Settings.System.getInt(contextIdmGetContext.getContentResolver(), POLICY_TYPE, -1);
                if (i5 == -1) {
                    return;
                }
                CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(PolicyRepository.CATEGORY, "type", Integer.valueOf(i5)));
                long j5 = Settings.System.getLong(contextIdmGetContext.getContentResolver(), POLICY_VALID_TIME, -1L);
                if (j5 != -1) {
                    CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(PolicyRepository.CATEGORY, PolicyRepository.NAME_EXPIRED_TIME, Long.valueOf(j5)));
                }
                String string = Settings.System.getString(contextIdmGetContext.getContentResolver(), POLICY_OTA_VERSION);
                if (string != null) {
                    CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(PolicyRepository.CATEGORY, PolicyRepository.NAME_OTA_VERSION, string));
                }
            } catch (IOException e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    public static class PreferenceSettingPopulation {
        private static final String DEVICE_REGISTRATION = "FOTA_CLIENT_REGISTRATION";
        private static final String FCM_REGISTRATION = "Push.Registration.FCM";
        private static final String POLLING_FILE_NAME = "Polling.File.Name";
        private static final String POLLING_TIME = "FOTA_CLIENT_POLLING_TIME";
        private static final String SPP_REGISTRATION = "Push.Registration.SPP";
        private static final int TERMS_AGREE = 1;
        private static final int TERMS_NONE = 0;

        public static class ByMigration extends AbstractC0877a {
            public ByMigration() {
                super(6, 7);
            }

            @Override // u0.AbstractC0877a
            public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                Log.I(this.startVersion + " to " + this.endVersion);
                PreferenceSettingPopulation.populate(supportSQLiteDatabase);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void populate(SupportSQLiteDatabase supportSQLiteDatabase) {
            try {
                Context contextIdmGetContext = IDMApplication.idmGetContext();
                int i5 = Settings.System.getInt(contextIdmGetContext.getContentResolver(), DEVICE_REGISTRATION, 0);
                if (i5 == 0) {
                    Log.I("Device is not registered. Do Nothing");
                    return;
                }
                if (i5 == 1) {
                    CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(DeviceRegistrationRepository.CATEGORY, "state", 1));
                } else {
                    CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(DeviceRegistrationRepository.CATEGORY, "state", 0));
                }
                CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(PollingRepository.CATEGORY, PollingRepository.NAME_NEXT_TIME, Long.valueOf(Settings.System.getLong(contextIdmGetContext.getContentResolver(), POLLING_TIME, 0L))));
                CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(PollingRepository.CATEGORY, PollingRepository.NAME_FILE_NAME, contextIdmGetContext.getSharedPreferences("DEVICE_PREFERENCE", 0).getString(POLLING_FILE_NAME, "")));
                CategoryNameValueDao.insertOrReplace(supportSQLiteDatabase, new Property(PushRegistrationRepository.CATEGORY, "state", Integer.valueOf((contextIdmGetContext.getSharedPreferences("DEVICE_PREFERENCE", 0).getBoolean(FCM_REGISTRATION, false) || contextIdmGetContext.getSharedPreferences("DEVICE_PREFERENCE", 0).getBoolean(SPP_REGISTRATION, false)) ? 1 : 0)));
            } catch (IOException e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    public static FotaRoomDatabase get(Context context) {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (FotaRoomDatabase.class) {
            try {
                if (INSTANCE != null) {
                    return INSTANCE;
                }
                Context applicationContext = context.getApplicationContext();
                String str = DATABASE_NAME;
                if (str == null || str.trim().length() == 0) {
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
                androidx.room.h hVar = new androidx.room.h(applicationContext, FotaRoomDatabase.class, str);
                hVar.f = true;
                hVar.a(MIGRATION_6_7, MIGRATION_7_8, MIGRATION_8_9, MIGRATION_9_10);
                FotaRoomDatabase fotaRoomDatabase = (FotaRoomDatabase) hVar.b();
                INSTANCE = fotaRoomDatabase;
                return fotaRoomDatabase;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InjectedFeatureDao injectedFeatureDao();

    public abstract PropertyDao propertyDao();
}
