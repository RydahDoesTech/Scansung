package com.idm.fotaagent.database.sqlite.database.mo;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.providers.mo.IDMMoDatabaseManager;

/* loaded from: classes.dex */
public class IDMDatabaseMoNodeManager {
    private IDMMoDatabaseManager moDatabaseManager;

    public static class Singleton {
        private static final IDMDatabaseMoNodeManager instance = new IDMDatabaseMoNodeManager(IDMApplication.idmGetContext());

        private Singleton() {
        }
    }

    public static IDMDatabaseMoNodeManager getInstance() {
        return Singleton.instance;
    }

    public IDMMoDatabaseManager idmGetMoDatabaseManager() {
        return this.moDatabaseManager;
    }

    public void idmSetMoDatabaseManager(IDMMoDatabaseManager iDMMoDatabaseManager) {
        this.moDatabaseManager = iDMMoDatabaseManager;
    }

    private IDMDatabaseMoNodeManager(Context context) {
        IDMMoDatabaseManager iDMMoDatabaseManager = IDMMoDatabaseManager.getInstance(context);
        this.moDatabaseManager = iDMMoDatabaseManager;
        iDMMoDatabaseManager.idmMoDatabaseOpen();
    }
}
