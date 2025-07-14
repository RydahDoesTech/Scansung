package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DeviceRegistrationRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "DeviceRegistration";
    private static final String NAME_CHALLENGE = "challenge";
    private static final String NAME_INITIAL_UPDATE = "initialUpdate";
    private static final String NAME_REQUESTER = "requester";
    public static final String NAME_STATE = "state";
    private static final int VALUE_REQUESTER_BOOTCOMPLETE = 5;
    private static final int VALUE_REQUESTER_DEVICEINIT = 2;
    private static final int VALUE_REQUESTER_DM = 8;
    private static final int VALUE_REQUESTER_FOTA_AGENT = 7;
    private static final int VALUE_REQUESTER_MDM = 6;
    private static final int VALUE_REQUESTER_NONE = 0;
    private static final int VALUE_REQUESTER_SERVERINIT = 3;
    private static final int VALUE_REQUESTER_SETUPWIZARD = 4;
    private static final int VALUE_REQUESTER_USERINIT = 1;
    public static final int VALUE_STATE_INVALID = 2;
    public static final int VALUE_STATE_REGISTERED = 1;
    public static final int VALUE_STATE_UNREGISTERED = 0;

    public enum Requester {
        NONE(0),
        USER_INIT(1),
        DEVICE_INIT(2),
        SERVER_INIT(3),
        SETUP_WIZARD(4),
        BOOT_COMPLETE(5),
        MDM(6),
        FOTA_AGENT(7),
        DM(8);

        private final int requester;

        Requester(int i5) {
            this.requester = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$of$0(int i5, Requester requester) {
            return requester.getRequester() == i5;
        }

        public static Requester of(int i5) {
            return (Requester) Arrays.stream(values()).filter(new com.idm.agent.dl.a(i5, 6)).findFirst().orElse(NONE);
        }

        public int getRequester() {
            return this.requester;
        }
    }

    public DeviceRegistrationRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    private int getState() {
        return ((Integer) getValueOf("state", 0)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRegister$0() {
        setState(1);
        clearChallenge();
    }

    private void setState(int i5) {
        insertOrReplaceWithoutException("state", Integer.valueOf(i5));
    }

    public void clearChallenge() {
        delete(NAME_CHALLENGE);
    }

    public void clearInitialUpdate() {
        delete(NAME_INITIAL_UPDATE);
    }

    public String getChallenge() {
        return (String) getValueOf(NAME_CHALLENGE, "");
    }

    public int getRequester() {
        return ((Integer) getValueOf(NAME_REQUESTER, 0)).intValue();
    }

    public boolean isInitialUpdate() {
        return ((Boolean) getValueOf(NAME_INITIAL_UPDATE, Boolean.FALSE)).booleanValue();
    }

    public boolean isInvalid() {
        return getState() == 2;
    }

    public boolean isRegistered() {
        return getState() == 1;
    }

    public boolean isUnregistered() {
        return getState() == 0;
    }

    public void setChallenge(String str) {
        insertOrReplaceWithoutException(NAME_CHALLENGE, str);
    }

    public void setInitialUpdate(boolean z4) {
        insertOrReplaceWithoutException(NAME_INITIAL_UPDATE, Boolean.valueOf(z4));
    }

    public void setInvalidRegister() {
        setState(2);
    }

    public void setRegister() {
        runInTransaction(new c(this, 0));
    }

    public void setRequesterAs(Requester requester) {
        setRequesterAs(requester.getRequester());
    }

    public void setUnregister() {
        setState(0);
    }

    private void setRequesterAs(int i5) {
        insertOrReplaceWithoutException(NAME_REQUESTER, Integer.valueOf(i5));
    }
}
