package V1;

import android.content.Context;
import android.text.TextUtils;
import b1.AbstractC0203C;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2618b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2619c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2620d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2621e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2622g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i5 = g1.b.f6771a;
        AbstractC0203C.g("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f2618b = str;
        this.f2617a = str2;
        this.f2619c = str3;
        this.f2620d = str4;
        this.f2621e = str5;
        this.f = str6;
        this.f2622g = str7;
    }

    public static j a(Context context) {
        E0.d dVar = new E0.d(context, 28);
        String strJ0 = dVar.J0("google_app_id");
        if (TextUtils.isEmpty(strJ0)) {
            return null;
        }
        return new j(strJ0, dVar.J0("google_api_key"), dVar.J0("firebase_database_url"), dVar.J0("ga_trackingId"), dVar.J0("gcm_defaultSenderId"), dVar.J0("google_storage_bucket"), dVar.J0("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC0203C.h(this.f2618b, jVar.f2618b) && AbstractC0203C.h(this.f2617a, jVar.f2617a) && AbstractC0203C.h(this.f2619c, jVar.f2619c) && AbstractC0203C.h(this.f2620d, jVar.f2620d) && AbstractC0203C.h(this.f2621e, jVar.f2621e) && AbstractC0203C.h(this.f, jVar.f) && AbstractC0203C.h(this.f2622g, jVar.f2622g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2618b, this.f2617a, this.f2619c, this.f2620d, this.f2621e, this.f, this.f2622g});
    }

    public final String toString() {
        E0.d dVar = new E0.d(this);
        dVar.C0("applicationId", this.f2618b);
        dVar.C0("apiKey", this.f2617a);
        dVar.C0("databaseUrl", this.f2619c);
        dVar.C0("gcmSenderId", this.f2621e);
        dVar.C0("storageBucket", this.f);
        dVar.C0("projectId", this.f2622g);
        return dVar.toString();
    }
}
