package com.idm.fotaagent.enabler.ui.admin.profile;

import android.database.SQLException;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.lifecycle.F;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.syncml.Constants;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseProfile;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class AdminProfileViewModel {
    private final List<String> authTypes;
    public final F clientAuthTypeIndex;
    public final F clientId;
    public final F clientPwd;
    private final IDMDatabaseProfile profile;
    public final F profileName;
    public final F serverAuthTypeIndex;
    public final F serverId;
    public final F serverPwd;
    public final F serverUrl;
    private final F toastMessageId;

    public AdminProfileViewModel(IDMDatabaseProfile iDMDatabaseProfile) {
        F f = new F();
        this.profileName = f;
        F f5 = new F();
        this.serverUrl = f5;
        F f6 = new F();
        this.serverId = f6;
        F f7 = new F();
        this.serverPwd = f7;
        F f8 = new F();
        this.clientId = f8;
        F f9 = new F();
        this.clientPwd = f9;
        F f10 = new F();
        this.serverAuthTypeIndex = f10;
        F f11 = new F();
        this.clientAuthTypeIndex = f11;
        this.toastMessageId = new F();
        this.profile = iDMDatabaseProfile;
        f.k(iDMDatabaseProfile.idmGetName());
        f5.k(iDMDatabaseProfile.idmGetServerUrl());
        f6.k(iDMDatabaseProfile.idmGetServerId());
        f7.k(iDMDatabaseProfile.idmGetServerPwd());
        f8.k(iDMDatabaseProfile.idmGetClientId());
        f9.k(iDMDatabaseProfile.idmGetClientPwd());
        ArrayList arrayList = new ArrayList();
        this.authTypes = arrayList;
        arrayList.add(Constants.AUTH_TYPE_BASIC);
        arrayList.add(Constants.AUTH_TYPE_MD5);
        arrayList.add(Constants.AUTH_TYPE_HMAC);
        f10.k(Integer.valueOf(arrayList.indexOf(iDMDatabaseProfile.idmGetServerAuthtype()) < 0 ? 0 : arrayList.indexOf(iDMDatabaseProfile.idmGetServerAuthtype())));
        f11.k(Integer.valueOf(arrayList.indexOf(iDMDatabaseProfile.idmGetClientAuthtype()) >= 0 ? arrayList.indexOf(iDMDatabaseProfile.idmGetClientAuthtype()) : 0));
    }

    private String getPortFrom(String str) {
        try {
            URL url = new URL(str);
            int port = url.getPort();
            return port > 0 ? String.valueOf(port) : "http".equals(url.getProtocol()) ? "80" : "443";
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    private boolean isEmptyText() {
        return TextUtils.isEmpty((CharSequence) this.profileName.d()) || TextUtils.isEmpty((CharSequence) this.serverUrl.d()) || TextUtils.isEmpty((CharSequence) this.serverId.d()) || TextUtils.isEmpty((CharSequence) this.serverPwd.d()) || TextUtils.isEmpty((CharSequence) this.clientId.d()) || TextUtils.isEmpty((CharSequence) this.clientPwd.d());
    }

    private boolean isSameDBTable(String str) {
        return IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoIsSameMoDBTable(str);
    }

    private boolean isServerIdFirstletterNumeric(String str) {
        return str.length() > 0 && Character.isDigit(str.charAt(0));
    }

    private void replaceServerIdEnablerProfileTable(String str, String str2) throws SQLException {
        IDMDatabaseManager.getInstance().idmChangeServerIdProfileName(str, str2);
    }

    private void replaceServerIdMoProfileTable(String str, String str2) {
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoChangeServerIdProfileTable(str, str2);
    }

    private void replaceServerIdMoProfileTableName(String str, String str2) {
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoChangeServerIdProfileTableName(str, str2);
    }

    private void replaceServerIdMoXNodeName(String str, String str2) {
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoChangeServerIdXNodeName(str, str2);
    }

    private void replaceServerIdMoXfumoTable(String str, String str2) {
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoChangeServerIdXfumoTable(str, str2);
    }

    private void replaceServerIdMoXnodeTable(String str, String str2) {
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoChangeServerIdXnodeTable(str, str2);
    }

    private boolean saveProfileToDB() {
        try {
            this.profile.idmSetName((String) this.profileName.d());
            this.profile.idmSetServerUrl((String) this.serverUrl.d());
            this.profile.idmSetServerId((String) this.serverId.d());
            this.profile.idmSetServerPwd((String) this.serverPwd.d());
            IDMDatabaseProfile iDMDatabaseProfile = this.profile;
            List<String> list = this.authTypes;
            Integer num = (Integer) this.serverAuthTypeIndex.d();
            Objects.requireNonNull(num);
            iDMDatabaseProfile.idmSetServerAuthtype(list.get(num.intValue()));
            this.profile.idmSetClientId((String) this.clientId.d());
            this.profile.idmSetClientPwd((String) this.clientPwd.d());
            IDMDatabaseProfile iDMDatabaseProfile2 = this.profile;
            List<String> list2 = this.authTypes;
            Integer num2 = (Integer) this.clientAuthTypeIndex.d();
            Objects.requireNonNull(num2);
            iDMDatabaseProfile2.idmSetClientAuthtype(list2.get(num2.intValue()));
            setServerInfo(this.profile);
            Log.I(this.profile.toString());
            return true;
        } catch (IDMMoExceptionNotFound | RuntimeException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    private void setServerInfo(IDMDatabaseProfile iDMDatabaseProfile) {
        IDMMoDatabaseManager iDMMoDatabaseManagerIdmGetMoDatabaseManager = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager();
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetServerId());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetServerAuthtype());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetServerPwd());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetServerNonce());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetClientId());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetClientAuthtype());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetClientPwd());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, iDMDatabaseProfile.idmGetServerId(), iDMDatabaseProfile.idmGetClientNonce());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccProfileName(iDMDatabaseProfile.idmGetName(), iDMDatabaseProfile.idmGetServerId());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccServerUriInfo(iDMDatabaseProfile.idmGetServerUrl(), iDMDatabaseProfile.idmGetServerId());
        iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAppAddrPortInfo(getPortFrom(iDMDatabaseProfile.idmGetServerUrl()), iDMDatabaseProfile.idmGetServerId());
    }

    public List<String> getAuthTypes() {
        return this.authTypes;
    }

    public F getToastMessageId() {
        return this.toastMessageId;
    }

    public void saveProfileToDBIfPossible() throws SQLException {
        if (isEmptyText()) {
            Log.W("Empty text");
            this.toastMessageId.k(Integer.valueOf(R.string.profile_empty_field));
            return;
        }
        if (!URLUtil.isValidUrl((String) this.serverUrl.d())) {
            this.toastMessageId.k(Integer.valueOf(R.string.serverAddress_Incorrect));
            return;
        }
        if (!this.profile.idmGetServerId().equalsIgnoreCase((String) this.serverId.d())) {
            String str = (String) this.serverId.d();
            Objects.requireNonNull(str);
            if (isServerIdFirstletterNumeric(str)) {
                this.toastMessageId.k(Integer.valueOf(R.string.serverId_Numeric));
                return;
            }
            if (isSameDBTable((String) this.serverId.d())) {
                this.toastMessageId.k(Integer.valueOf(R.string.serverId_Exist));
                return;
            }
            String strIdmGetServerId = this.profile.idmGetServerId();
            String str2 = (String) this.serverId.d();
            replaceServerIdMoXfumoTable(strIdmGetServerId, str2);
            replaceServerIdMoXnodeTable(strIdmGetServerId, str2);
            replaceServerIdMoXNodeName(strIdmGetServerId, str2);
            replaceServerIdMoProfileTable(strIdmGetServerId, str2);
            replaceServerIdMoProfileTableName(strIdmGetServerId, str2);
            replaceServerIdEnablerProfileTable(strIdmGetServerId, str2);
        }
        if (saveProfileToDB()) {
            Log.I("Success to save");
            new AdminRepository(IDMApplication.idmGetContext()).setCustomProfileMode(true);
            this.toastMessageId.k(Integer.valueOf(R.string.success_to_save));
        }
    }
}
