package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.H;
import b.AbstractC0195a;
import java.util.Arrays;
import java.util.HashSet;
import y.AbstractC0918b;

/* loaded from: classes.dex */
public final class g extends androidx.activity.result.h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f3121h;

    public g(H h3) {
        this.f3121h = h3;
    }

    @Override // androidx.activity.result.h
    public final void b(int i5, AbstractC0195a abstractC0195a, Object obj) {
        Bundle bundle;
        H h3 = this.f3121h;
        M0.c cVarB = abstractC0195a.b(h3, obj);
        if (cVarB != null) {
            new Handler(Looper.getMainLooper()).post(new A1.a(this, i5, cVarB, 1));
            return;
        }
        Intent intentA = abstractC0195a.a(h3, obj);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(h3.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                h3.startActivityForResult(intentA, i5, bundle);
                return;
            }
            androidx.activity.result.j jVar = (androidx.activity.result.j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                h3.startIntentSenderForResult(jVar.f3162d, i5, jVar.f3163e, jVar.f, jVar.f3164g, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new A1.a(this, i5, e5, 2));
                return;
            }
        }
        String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (String str : stringArrayExtra) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(A3.f.p(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < stringArrayExtra.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr[i6] = stringArrayExtra[i7];
                    i6++;
                }
            }
        }
        h3.validateRequestPermissionsRequestCode(i5);
        AbstractC0918b.b(h3, stringArrayExtra, i5);
    }
}
