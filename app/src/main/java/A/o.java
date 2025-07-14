package A;

import J.C0062t;
import J.C0065w;
import J.C0067y;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.idm.agent.dl.DlAgent;
import com.idm.fotaagent.database.room.data.repository.CampaignQueueRepository;
import com.idm.fotaagent.database.room.data.repository.DmNotificationRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsCallback;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage;
import com.idm.fotaagent.enabler.fumo.DLReporter;
import com.idm.fotaagent.enabler.fumo.InstallReporter;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor;
import com.idm.fotaagent.restapi.restclient.RestClientReceiver;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.utils.BinaryStatus;
import com.idm.network.IDMNetworkHttpAdapter;
import com.samsung.android.fotaagent.common.log.Log;
import e.H;
import j2.InterfaceC0558a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import w2.C0903a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o(Object obj, int i5, Object obj2) {
        this.f30d = i5;
        this.f31e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        C2.a aVar;
        boolean z4;
        int i5 = 2;
        View view = null;
        switch (this.f30d) {
            case 0:
                ((b) this.f31e).i((Typeface) this.f);
                return;
            case 1:
                E0.d dVar = (E0.d) this.f31e;
                C0067y c0067y = new C0067y((View) dVar.f520e);
                Iterator it = ((LinkedList) dVar.f).iterator();
                while (it.hasNext()) {
                    ((I.a) it.next()).accept(c0067y);
                }
                ((C0062t) this.f).accept(c0067y);
                int i6 = C0067y.f1496c;
                return;
            case 2:
                int i7 = JobInfoSchedulerService.f5221d;
                ((JobInfoSchedulerService) this.f31e).jobFinished((JobParameters) this.f, false);
                return;
            case 3:
                a2.q qVar = (a2.q) this.f31e;
                InterfaceC0558a interfaceC0558a = (InterfaceC0558a) this.f;
                if (qVar.f3017b != a2.q.f3015d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (qVar) {
                    aVar = qVar.f3016a;
                    qVar.f3016a = null;
                    qVar.f3017b = interfaceC0558a;
                }
                aVar.getClass();
                return;
            case 4:
                a2.p pVar = (a2.p) this.f31e;
                InterfaceC0558a interfaceC0558a2 = (InterfaceC0558a) this.f;
                synchronized (pVar) {
                    try {
                        if (pVar.f3013b == null) {
                            pVar.f3012a.add(interfaceC0558a2);
                        } else {
                            pVar.f3013b.add(interfaceC0558a2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                ((DlAgent) this.f31e).lambda$createUrlConnector$0((IDMNetworkHttpAdapter) this.f);
                return;
            case 6:
                ((CampaignQueueRepository) this.f31e).lambda$add$0((String) this.f);
                return;
            case 7:
                ((DmNotificationRepository) this.f31e).lambda$save$0((DmNotificationMessage) this.f);
                return;
            case 8:
                ((InstallParamRepository) this.f31e).lambda$save$0((String) this.f);
                return;
            case 9:
                ((PostponeRepository) this.f31e).lambda$save$0((HashMap) this.f);
                return;
            case 10:
                ((PostponeReasonsRepository) this.f31e).lambda$add$0((String) this.f);
                return;
            case 11:
                ((PostponeReasonsRepository) this.f31e).lambda$getLimitedPostponeReasons$1((PostponeReasonsCallback) this.f);
                return;
            case 12:
                ((DLReporter) this.f31e).lambda$getCallback$0((String) this.f);
                return;
            case 13:
                ((InstallReporter) this.f31e).lambda$getCallback$0((String) this.f);
                return;
            case 14:
                ((InstallConfirmContractor.View) this.f31e).setMainBody((String) this.f);
                return;
            case 15:
                ((RestClientReceiver) this.f31e).lambda$handle$0((RestClientServiceType) this.f);
                return;
            case 16:
                Runnable runnable = (Runnable) this.f;
                H h3 = (H) this.f31e;
                h3.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    h3.b();
                }
            case 17:
                ((ProfileInstallerInitializer) this.f31e).getClass();
                h0.f.a(Looper.getMainLooper()).postDelayed(new com.idm.fotaagent.analytics.diagmon.b((Context) this.f, i5), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 18:
                int i8 = Toolbar.g0;
                Toolbar toolbar = (Toolbar) this.f31e;
                toolbar.getClass();
                ViewGroup viewGroup = (ViewGroup) this.f;
                C0067y c0067y2 = new C0067y(viewGroup);
                if (toolbar.v(toolbar.f3500g)) {
                    c0067y2.a(toolbar.f3500g, C0065w.a(0, toolbar.f3500g.getTop(), 0, viewGroup.getHeight() - toolbar.f3500g.getBottom()));
                    z4 = true;
                } else {
                    z4 = false;
                }
                int childCount = viewGroup.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 < childCount) {
                        View childAt = viewGroup.getChildAt(i9);
                        if (childAt instanceof ActionMenuView) {
                            view = childAt;
                        } else {
                            i9++;
                        }
                    }
                }
                if (view != null && view.getVisibility() == 0) {
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    int childCount2 = viewGroup2.getChildCount();
                    int i10 = 0;
                    while (i10 < childCount2) {
                        View childAt2 = viewGroup2.getChildAt(i10);
                        if (childAt2.getVisibility() == 0) {
                            int measuredWidth = childAt2.getMeasuredWidth() / 2;
                            c0067y2.a(childAt2, C0065w.a(i10 == 0 ? measuredWidth : 0, measuredWidth, 0, measuredWidth));
                            z4 = true;
                        }
                        i10++;
                    }
                }
                if (z4) {
                    viewGroup.setTouchDelegate(c0067y2);
                    return;
                }
                return;
            case 19:
                C0903a c0903a = (C0903a) this.f31e;
                c0903a.getClass();
                Preference preference = (Preference) this.f;
                C1.b bVar = new C1.b(26, preference);
                androidx.fragment.app.H h5 = c0903a.f9298a;
                h5.runOnUiThread(bVar);
                try {
                    TimeUnit.MILLISECONDS.sleep(500L);
                } catch (InterruptedException e5) {
                    Log.printStackTrace(e5);
                }
                h5.runOnUiThread(new o(preference, 20, BinaryStatus.getBinaryStatus().toString()));
                return;
            default:
                ((Preference) this.f31e).z((String) this.f);
                return;
        }
    }
}
