package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import b.AbstractC0195a;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class W extends AbstractC0195a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3745a;

    public /* synthetic */ W(int i5) {
        this.f3745a = i5;
    }

    @Override // b.AbstractC0195a
    public final Intent a(H h3, Object obj) {
        Bundle bundleExtra;
        switch (this.f3745a) {
            case 0:
                androidx.activity.result.j jVar = (androidx.activity.result.j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f3163e;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = jVar.f3162d;
                        AbstractC0219i.e("intentSender", intentSender);
                        jVar = new androidx.activity.result.j(intentSender, null, jVar.f, jVar.f3164g);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                AbstractC0219i.e("input", strArr);
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                AbstractC0219i.d("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", intentPutExtra);
                return intentPutExtra;
            default:
                Intent intent3 = (Intent) obj;
                AbstractC0219i.e("input", intent3);
                return intent3;
        }
    }

    @Override // b.AbstractC0195a
    public M0.c b(H h3, Object obj) {
        switch (this.f3745a) {
            case 1:
                String[] strArr = (String[]) obj;
                AbstractC0219i.e("input", strArr);
                if (strArr.length == 0) {
                    return new M0.c(P2.v.f2164d);
                }
                for (String str : strArr) {
                    if (str == null) {
                        throw new NullPointerException("permission must be non-null");
                    }
                    if (h3.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                        return null;
                    }
                }
                int iG0 = P2.z.g0(strArr.length);
                if (iG0 < 16) {
                    iG0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new M0.c(linkedHashMap);
            default:
                return super.b(h3, obj);
        }
    }

    @Override // b.AbstractC0195a
    public final Object c(Intent intent, int i5) {
        switch (this.f3745a) {
            case 0:
                return new androidx.activity.result.a(intent, i5);
            case 1:
                P2.v vVar = P2.v.f2164d;
                if (i5 != -1 || intent == null) {
                    return vVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return vVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i6 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i6 == 0));
                }
                return P2.z.k0(P2.m.T0(P2.i.n0(stringArrayExtra), arrayList));
            default:
                return new androidx.activity.result.a(intent, i5);
        }
    }
}
