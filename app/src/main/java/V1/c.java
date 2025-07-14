package V1;

import a2.C0104b;
import a2.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import j2.InterfaceC0558a;
import o2.C0716a;
import z.AbstractC0940c;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0558a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2602c;

    public /* synthetic */ c(Object obj, int i5, Object obj2) {
        this.f2600a = i5;
        this.f2601b = obj;
        this.f2602c = obj2;
    }

    @Override // j2.InterfaceC0558a
    public final Object get() {
        boolean z4;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f2600a) {
            case 0:
                g gVar = (g) this.f2601b;
                String strF = gVar.f();
                Context context = (Context) this.f2602c;
                C0716a c0716a = new C0716a();
                Context contextA = AbstractC0940c.a(context);
                SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + strF, 0);
                boolean z5 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z4 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextA.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z5 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z4 = z5;
                }
                c0716a.f8242a = z4;
                return c0716a;
            default:
                a2.h hVar = (a2.h) this.f2601b;
                hVar.getClass();
                C0104b c0104b = (C0104b) this.f2602c;
                return c0104b.f2989e.j(new s(c0104b, hVar));
        }
    }
}
