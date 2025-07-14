package com.idm.fotaagent.enabler.fumo.policy.mdm;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.DownloadNotAllowedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.InstallFailedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class MDMManager {
    private static final int EDM_FALSE = 0;
    private static final int EDM_NULL = -1;
    private static final int EDM_TRUE = 1;

    public static class MDMDisabled implements Behavior {
        private MDMDisabled() {
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkDownloadable() {
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkInstallable() {
        }
    }

    public static class MDMEnabled implements Behavior {
        private MDMEnabled() {
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkDownloadable() throws DownloadNotAllowedByPolicyException {
            throw new DownloadNotAllowedByPolicyException("Download blocked by MDM", DLResultCode.BLOCKED_BY_MDM.getIndex());
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkInstallable() throws InstallFailedByPolicyException {
            throw new InstallFailedByPolicyException("Install blocked by MDM", DLResultCode.BLOCKED_BY_MDM.getDmResultCode());
        }
    }

    private MDMManager() {
    }

    public static Behavior getBehavior() {
        return getFOTABlocked() ? new MDMEnabled() : new MDMDisabled();
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private static boolean getFOTABlocked() {
        return !(getOTAAllowed() != 0);
    }

    private static int getOTAAllowed() {
        try {
            Cursor cursorQuery = getContext().getContentResolver().query(Uri.parse("content://com.sec.knox.provider/RestrictionPolicy3"), null, "isOTAUpgradeAllowed", null, null);
            try {
                if (cursorQuery == null) {
                    Log.W("cursor is null. return EDM_NULL");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                cursorQuery.moveToFirst();
                if (cursorQuery.getString(cursorQuery.getColumnIndex("isOTAUpgradeAllowed")).equalsIgnoreCase("true")) {
                    cursorQuery.close();
                    return 1;
                }
                cursorQuery.close();
                return 0;
            } finally {
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return -1;
        }
    }
}
