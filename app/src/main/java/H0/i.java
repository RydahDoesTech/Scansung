package h0;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final p.h f6850a = new p.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6851b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Y0.h f6852c = null;

    public static Y0.h a() {
        Y0.h hVar = new Y0.h(14);
        f6852c = hVar;
        p.h hVar2 = f6850a;
        hVar2.getClass();
        if (p.g.f.e(hVar2, null, hVar)) {
            p.g.b(hVar2);
        }
        return f6852c;
    }

    public static void b(Context context) {
        h hVarA;
        int i5;
        if (f6852c != null) {
            return;
        }
        synchronized (f6851b) {
            try {
                if (f6852c != null) {
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i6 = 0;
                boolean z4 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z5 = file2.exists() && length2 > 0;
                try {
                    long j5 = g.a(context.getApplicationContext().getPackageManager(), context).lastUpdateTime;
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            hVarA = h.a(file3);
                        } catch (IOException unused) {
                            a();
                            return;
                        }
                    } else {
                        hVarA = null;
                    }
                    if (hVarA != null && hVarA.f6848c == j5 && (i5 = hVarA.f6847b) != 2) {
                        i6 = i5;
                    } else if (z4) {
                        i6 = 1;
                    } else if (z5) {
                        i6 = 2;
                    }
                    h hVar = new h(1, (hVarA == null || hVarA.f6847b != 2 || i6 != 1 || length >= hVarA.f6849d) ? i6 : 3, j5, length2);
                    if (hVarA == null || !hVarA.equals(hVar)) {
                        try {
                            hVar.b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    a();
                } catch (PackageManager.NameNotFoundException unused3) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
