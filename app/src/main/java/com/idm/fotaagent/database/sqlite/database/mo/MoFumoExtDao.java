package com.idm.fotaagent.database.sqlite.database.mo;

import android.content.Context;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class MoFumoExtDao {
    private static final String DOWNLOAD_CONN_TYPE = "/DownloadConnType";
    public static final String DO_CHECKING_ROOTING = "/DoCheckingRooting";
    private static final String FORCE_DOWNLOAD = "/ForceDownload";
    private static final String FORCE_INSTALL = "/ForceInstall";
    private static final String POSTPONE = "/Postpone";
    private static final String PRIORITY = "/Priority";
    private static final String SVCSTATE = "/SvcState";
    private final String serverId;
    private final IDMMoDatabaseManager moDatabaseManager = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager();
    private final Context context = IDMApplication.idmGetContext();

    public MoFumoExtDao(String str) {
        this.serverId = str;
    }

    private String getValue(String str) {
        try {
            return this.moDatabaseManager.idmMoGetFumoNodeValue(IDMDlInterface.IDM_FUMO_EXT + str, this.serverId);
        } catch (IDMMoExceptionNotFound | RuntimeException e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    private byte getValueAsByte(String str) {
        return Byte.parseByte(getValue(str));
    }

    private void setRootingCheck(String str) {
        setValue(DO_CHECKING_ROOTING, str);
    }

    private void setSvcState(String str) {
        setValue(SVCSTATE, str);
    }

    private void setValue(String str, String str2) {
        try {
            this.moDatabaseManager.idmMoSetFumoNodeValue(IDMDlInterface.IDM_FUMO_EXT + str, str2, this.serverId);
            Log.I("set " + str + " [" + str2 + "]");
        } catch (IDMMoExceptionNotFound e5) {
            Log.printStackTrace(e5);
        }
    }

    private void setWifiOnlyForDl(String str) {
        setValue(DOWNLOAD_CONN_TYPE, str);
    }

    public DownloadType getDownloadType() {
        try {
            return new Feature.MockDownloadType(this.context).getValue().orElse(DownloadType.of(getValueAsByte(FORCE_DOWNLOAD)));
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            return DownloadType.Normal;
        }
    }

    public InstallPostponeType getInstallPostponeType() {
        try {
            return new Feature.MockInstallPostponeType(this.context).getValue().orElse(InstallPostponeType.of(getValueAsByte(POSTPONE)));
        } catch (ClassCastException | IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            return InstallPostponeType.UNLIMITED;
        }
    }

    public InstallType getInstallType() {
        try {
            return new Feature.MockInstallType(this.context).getValue().orElse(InstallType.of(getValueAsByte(FORCE_INSTALL)));
        } catch (ClassCastException | IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            return InstallType.Normal;
        }
    }

    public String getSvcState() {
        String value = getValue(SVCSTATE);
        Log.I("get SvcState : " + value);
        return value;
    }

    public UpdateType getUpdateType() {
        try {
            return new Feature.MockUpdateType(this.context).getValue().orElse(UpdateType.of(getValueAsByte(PRIORITY)));
        } catch (ClassCastException | IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            return UpdateType.Normal;
        }
    }

    public boolean getWifiOnlyForDl() {
        String value = getValue(DOWNLOAD_CONN_TYPE);
        Log.I("get WifiOnlyForDl : " + value);
        return IDMFumoExtInterface.IDM_FUMO_DOWNLOAD_TYPE_WIFI.equalsIgnoreCase(value);
    }

    public boolean isBinaryCheckEnabled() {
        boolean zIsRootingCheckEnabled = new AdminRepository(this.context).isRootingCheckEnabled();
        String value = getValue(DO_CHECKING_ROOTING);
        Log.I("binaryCheckEnabledByAdminCommand : " + zIsRootingCheckEnabled + ", binaryCheckEnabledByFumo : " + value);
        return zIsRootingCheckEnabled && "T".equals(value);
    }

    public void reset() {
        setWifiOnlyForDl("");
        setRootingCheck("");
        setSvcState("");
        setUpdateType(UpdateType.Normal);
        setInstallPostponeType(InstallPostponeType.UNLIMITED);
        setInstallType(InstallType.Normal);
        setDownloadType(DownloadType.Normal);
    }

    public void setDownloadType(DownloadType downloadType) {
        setValue(FORCE_DOWNLOAD, String.valueOf((int) downloadType.toCode()));
    }

    public void setInstallPostponeType(InstallPostponeType installPostponeType) {
        setValue(POSTPONE, String.valueOf((int) installPostponeType.toCode()));
    }

    public void setInstallType(InstallType installType) {
        setValue(FORCE_INSTALL, String.valueOf((int) installType.toCode()));
    }

    public void setUpdateType(UpdateType updateType) {
        setValue(PRIORITY, String.valueOf((int) updateType.toCode()));
    }
}
