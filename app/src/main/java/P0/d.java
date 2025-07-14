package P0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e1.AbstractC0415a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2115a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.c f2116b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2117c;

    public d(Context context, Q0.c cVar, b bVar) {
        this.f2115a = context;
        this.f2116b = cVar;
        this.f2117c = bVar;
    }

    public final void a(K0.b bVar, int i5, boolean z4) {
        Context context = this.f2115a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(bVar.f1623a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        H0.c cVar = bVar.f1625c;
        adler32.update(byteBufferAllocate.putInt(T0.a.a(cVar)).array());
        byte[] bArr = bVar.f1624b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z4) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i6 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i6 >= i5) {
                        AbstractC0415a.h("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", bVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseG = ((Q0.h) this.f2116b).g();
        String strValueOf = String.valueOf(T0.a.a(cVar));
        String str = bVar.f1623a;
        Cursor cursorRawQuery = sQLiteDatabaseG.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar2 = this.f2117c;
            builder.setMinimumLatency(bVar2.a(cVar, jLongValue, i5));
            Set set = ((c) bVar2.f2111b.get(cVar)).f2114c;
            if (set.contains(e.f2118d)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f2119e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i5);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", T0.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", bVar, Integer.valueOf(value), Long.valueOf(bVar2.a(cVar, jLongValue, i5)), lValueOf, Integer.valueOf(i5)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
