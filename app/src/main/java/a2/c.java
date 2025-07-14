package A2;

import android.content.ContentValues;
import com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.Localtest;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.ProgressViewParams;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.network.HTTPHeader;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Changessl;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Deletememory;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Ioptest;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Memoryfull;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Roaming;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Rooting;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Server;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Validation;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaUpdater;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.PeriodicHeartbeatHandle;
import com.idm.fotaagent.tool.ddf.DDFManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Consumer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f76d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f77e;

    public /* synthetic */ c(int i5, Object obj) {
        this.f76d = i5;
        this.f77e = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws IOException {
        int i5 = this.f76d;
        Object obj2 = this.f77e;
        switch (i5) {
            case 0:
                ((Map) obj2).put(XmlParser.Polling.POLLING_VERSION, (String) obj);
                break;
            case 1:
                ((DDFManager) obj2).createDDFNode((String) obj);
                break;
            case 2:
                ((Localtest) obj2).lambda$prepare$0((String) obj);
                break;
            case 3:
                IDMFumoExecutor.HistoryUpdater.lambda$update$0((IDMUpdateHistoryInfo) obj2, (DescriptionContent) obj);
                break;
            case 4:
                ((FotaJobRepository) obj2).setServiceType((ServiceType) obj);
                break;
            case 5:
                ((HTTPHeader) obj2).lambda$makeProperties$0((HttpURLConnection) obj);
                break;
            case 6:
                ((HTTPHeader.ForDL) obj2).lambda$makeProperties$0((String) obj);
                break;
            case 7:
                ((Changessl) obj2).lambda$execute$0((Enum) obj);
                break;
            case 8:
                ((Deletememory) obj2).lambda$execute$0((Enum) obj);
                break;
            case 9:
                ((Ioptest) obj2).lambda$execute$0((Enum) obj);
                break;
            case 10:
                ((Memoryfull) obj2).lambda$execute$0((Enum) obj);
                break;
            case 11:
                ((Roaming) obj2).lambda$execute$0((Enum) obj);
                break;
            case 12:
                ((Rooting) obj2).lambda$execute$0((Enum) obj);
                break;
            case 13:
                ((Server) obj2).lambda$execute$0((Enum) obj);
                break;
            case 14:
                ((Validation) obj2).lambda$execute$0((Enum) obj);
                break;
            case 15:
                ((AppFotaUpdater) obj2).setContentValues((ContentValues) obj);
                break;
            case 16:
                ((BaseActivity.Managed.WithButtons.WithTwoProgressBars.ProgressView) obj).setProgressView((ProgressViewParams) obj2);
                break;
            case 17:
                ((PeriodicHeartbeatHandle) obj2).lambda$prepare$0((IllegalStateException) obj);
                break;
            default:
                ((ArrayList) obj2).add((byte[]) obj);
                break;
        }
    }
}
