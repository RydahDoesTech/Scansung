package h0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b0.C0198c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0472c {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0.h f6844a = new Y0.h(13);

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : fileArrListFiles) {
            z4 = a(file2) && z4;
        }
        return z4;
    }

    public static void b(Context context, Executor executor, InterfaceC0471b interfaceC0471b, boolean z4) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        applicationContext.getAssets();
        new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j5 = dataInputStream.readLong();
                            dataInputStream.close();
                            z = j5 == packageInfo.lastUpdateTime;
                            if (z) {
                                interfaceC0471b.j(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                }
                if (z) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    i.b(context);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i5 = Build.VERSION.SDK_INT;
            new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0198c c0198c = new C0198c();
            c0198c.f5001d = interfaceC0471b;
            executor.execute(new com.idm.fotaagent.utils.a(c0198c, 3, Integer.valueOf(i5)));
            i.b(context);
        } catch (PackageManager.NameNotFoundException e5) {
            interfaceC0471b.j(7, e5);
            i.b(context);
        }
    }
}
