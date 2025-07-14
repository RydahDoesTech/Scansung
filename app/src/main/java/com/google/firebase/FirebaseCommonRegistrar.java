package com.google.firebase;

import a2.C0103a;
import a2.C0104b;
import a2.f;
import a2.k;
import android.content.Context;
import android.os.Build;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import h2.c;
import java.util.ArrayList;
import java.util.List;
import r2.a;
import r2.b;
import r2.d;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements f {
    public static String a(String str) {
        return str.replace(' ', '_').replace(IDMTndsXmlWbxmlDefine.XML_SLASH, '_');
    }

    @Override // a2.f
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        C0103a c0103aA = C0104b.a(b.class);
        c0103aA.a(new k(2, 0, a.class));
        c0103aA.f = new com.idm.fotaagent.enabler.ui.notification.manager.a(11);
        arrayList.add(c0103aA.b());
        C0103a c0103aA2 = C0104b.a(h2.b.class);
        c0103aA2.a(new k(1, 0, Context.class));
        c0103aA2.a(new k(2, 0, c.class));
        c0103aA2.f = new com.idm.fotaagent.enabler.ui.notification.manager.a(9);
        arrayList.add(c0103aA2.b());
        arrayList.add(d.c("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(d.c("fire-core", "20.0.0"));
        arrayList.add(d.c("device-name", a(Build.PRODUCT)));
        arrayList.add(d.c("device-model", a(Build.DEVICE)));
        arrayList.add(d.c("device-brand", a(Build.BRAND)));
        arrayList.add(d.e("android-target-sdk", new C2.a(11)));
        arrayList.add(d.e("android-min-sdk", new C2.a(12)));
        arrayList.add(d.e("android-platform", new C2.a(13)));
        arrayList.add(d.e("android-installer", new C2.a(14)));
        try {
            string = O2.b.f2002h.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(d.c("kotlin", string));
        }
        return arrayList;
    }
}
