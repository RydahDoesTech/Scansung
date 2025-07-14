package com.idm.fotaagent.enabler.ui.notification.manager;

import a2.d;
import a2.e;
import a2.o;
import a2.s;
import android.content.Context;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy;
import com.idm.fotaagent.enabler.ui.whatsnew.DescriptionBody;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.wssyncmldm.R;
import h2.c;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements NotificationBuilderStrategy.SmallIcon, DescriptionBody, MajorUpdate, e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6337d;

    public /* synthetic */ a(int i5) {
        this.f6337d = i5;
    }

    @Override // com.idm.fotaagent.enabler.ui.whatsnew.DescriptionBody
    public CharSequence get(Context context, DescriptionContent descriptionContent) {
        switch (this.f6337d) {
            case 4:
                return DescriptionBody.lambda$static$0(context, descriptionContent);
            case 5:
                return DescriptionBody.lambda$static$1(context, descriptionContent);
            default:
                return DescriptionBody.lambda$static$2(context, descriptionContent);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy.SmallIcon
    public int getSmallIcon() {
        switch (this.f6337d) {
            case 0:
                return R.drawable.stat_fota_postpone;
            case 1:
                return R.drawable.stat_fota_completion;
            case 2:
                return R.drawable.stat_fota_fail;
            default:
                return NotificationBuilderStrategy.SmallIcon.lambda$static$4();
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate
    public boolean isMajorUpdate(Context context) {
        switch (this.f6337d) {
            case 7:
                return MajorUpdate.lambda$static$0(context);
            default:
                return MajorUpdate.lambda$static$1(context);
        }
    }

    @Override // a2.e
    public Object j(s sVar) {
        switch (this.f6337d) {
            case 9:
                Context context = (Context) sVar.a(Context.class);
                sVar.c(c.class);
                o oVar = new o(new d(2, context));
                new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), h2.b.f6855b);
                h2.b bVar = new h2.b();
                bVar.f6856a = oVar;
                return bVar;
            case 10:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
            default:
                Set setC = sVar.c(r2.a.class);
                r2.c cVar = r2.c.f8578b;
                if (cVar == null) {
                    synchronized (r2.c.class) {
                        try {
                            cVar = r2.c.f8578b;
                            if (cVar == null) {
                                cVar = new r2.c(0);
                                r2.c.f8578b = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new r2.b(setC, cVar);
        }
    }
}
