package E2;

import android.app.admin.SystemUpdatePolicy;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import com.idm.core.ddf.DDFTag;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.DownloadTask;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressModel;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmModel;
import com.idm.fotaagent.enabler.ui.whatsnew.AbstractClickableSpan;
import com.idm.fotaagent.utils.rangerequest.HttpRangeRequest;
import com.idm.fotaagent.utils.rangerequest.RangeRequest;
import com.idm.providers.mo.IDMMoNodeInfo;
import com.idm.service.actioninfo.IDMActionInfo;
import java.io.File;
import java.net.HttpURLConnection;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f615a;

    public /* synthetic */ b(int i5) {
        this.f615a = i5;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f615a) {
            case 0:
                return ((IDMMoNodeInfo) obj).idmMoNodeGetValue();
            case 1:
                return ((Path) obj).toFile();
            case 2:
                return ((DDFTag) obj).getValue();
            case 3:
                return DownloadTask.lambda$stopIfRunning$0((RangeRequest) obj);
            case 4:
                return ((HttpRangeRequest) obj).getConnection();
            case 5:
                return Integer.valueOf(((UpdateStatus.InstallationStep) obj).getStatus());
            case 6:
                return new File((String) obj);
            case 7:
                return ((File) obj).toPath();
            case 8:
                return obj.toString();
            case 9:
                return ((AdminRepository) obj).getDownloadType();
            case 10:
                return InstallPostponeType.of(((Byte) obj).byteValue());
            case 11:
                return ((AdminRepository) obj).getInstallPostponeType();
            case 12:
                return ((AdminRepository) obj).getInstallType();
            case 13:
                return ((AdminRepository) obj).getServiceType();
            case 14:
                return ((AdminRepository) obj).getUpdateType();
            case 15:
                return ((AdminRepository) obj).getWifiOnlyDevice();
            case 16:
                return ((AdminRepository) obj).getOperator();
            case 17:
                return Integer.valueOf(((SystemUpdatePolicy) obj).getInstallWindowStart());
            case 18:
                return ((SystemUpdatePolicy) obj).getFreezePeriods();
            case 19:
                return Integer.valueOf(((SystemUpdatePolicy) obj).getInstallWindowEnd());
            case 20:
                return Integer.valueOf(((SystemUpdatePolicy) obj).getPolicyType());
            case 21:
                return ((HttpURLConnection) obj).getRequestMethod();
            case 22:
                return WifiOnlyChecker.lambda$isWifiOnlyByDevice$0((AdminRepository.WifiOnlyDevice) obj);
            case 23:
                return ((Enum) obj).toString();
            case 24:
                return DownloadProgressModel.lambda$getScheduledExpirationTime$0((JobScheduler) obj);
            case 25:
                return DownloadProgressModel.lambda$getScheduledExpirationTime$1((JobInfo) obj);
            case 26:
                return InstallConfirmModel.lambda$getExpirationTimeString$0((JobScheduler) obj);
            case 27:
                return InstallConfirmModel.lambda$getExpirationTimeString$1((JobInfo) obj);
            case 28:
                return Integer.valueOf(((IDMActionInfo) obj).idmGetFumoStatus());
            default:
                return AbstractClickableSpan.ForAppUpdateInformation.lambda$onClick$0((Map.Entry) obj);
        }
    }
}
