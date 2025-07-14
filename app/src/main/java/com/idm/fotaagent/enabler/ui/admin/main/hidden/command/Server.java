package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class Server extends HiddenCommand {
    private static final String STAGING_HOST = "stg-fota-cloud.samsungdms.net";
    private final AdminRepository repository;

    /* renamed from: com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Server$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$ServerType;

        static {
            int[] iArr = new int[AdminRepository.ServerType.values().length];
            $SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$ServerType = iArr;
            try {
                iArr[AdminRepository.ServerType.PRODUCTION_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$ServerType[AdminRepository.ServerType.STAGING_SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Server(Context context) {
        super(context);
        this.repository = new AdminRepository(context);
    }

    private String getServerUri() {
        return IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoGetAccServerUriInfo("x6g1q14r75");
    }

    private void setServerUri(String str) {
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoSetAccServerUriInfo(str, "x6g1q14r75");
    }

    /* renamed from: changeServer, reason: merged with bridge method [inline-methods] */
    public void lambda$execute$0(AdminRepository.ServerType serverType) {
        try {
            if (this.repository.getServerType() == serverType) {
                Log.I(serverType + " already applied");
                return;
            }
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$ServerType[serverType.ordinal()];
            if (i5 == 1) {
                setServerUri(getProductionServerUri().toString());
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException("serverType: " + serverType);
                }
                this.repository.setProductionServerUri(getServerUri());
                setServerUri(getStagingServerUri().toString());
            }
            Log.I(serverType + " successfully applied");
            this.repository.setServerType(serverType);
        } catch (IDMMoExceptionNotFound | RuntimeException | URISyntaxException e5) {
            Log.printStackTrace(e5);
            showToast("Failed to change server");
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        if (DeviceUtils.isUserShipBinary()) {
            showToast("Not allowed in user-ship binary");
        } else {
            showDialog("Select server for SFOTA", AdminRepository.ServerType.values(), this.repository.getServerType(), new A2.c(13, this));
        }
    }

    public URI getProductionServerUri() {
        return new URI(this.repository.getProductionServerUri());
    }

    public URI getStagingServerUri() {
        URI productionServerUri = getProductionServerUri();
        return new URI("https", STAGING_HOST, productionServerUri.getPath(), productionServerUri.getFragment());
    }
}
