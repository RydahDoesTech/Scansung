package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;

/* loaded from: classes.dex */
public class PushRegistrationRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "PushRegistration";
    public static final String NAME_STATE = "state";
    public static final int VALUE_STATE_REGISTERED = 1;
    public static final int VALUE_STATE_UNREGISTERED = 0;

    public PushRegistrationRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    private int getState() {
        return ((Integer) getValueOf("state", 0)).intValue();
    }

    public boolean isRegistered() {
        return getState() == 1;
    }

    public void register() {
        insertOrReplaceWithoutException("state", 1);
    }

    public void unregister() {
        insertOrReplaceWithoutException("state", 0);
    }
}
