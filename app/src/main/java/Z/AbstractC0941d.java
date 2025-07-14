package z;

import A.r;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Binder;
import android.os.Process;
import java.util.Objects;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0941d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9472a = null;

    public static int a(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = y.e.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                AppOpsManager appOpsManagerC = y.f.c(context);
                iC = y.f.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = y.f.a(appOpsManagerC, strD, iMyUid, y.f.b(context));
                }
            } else {
                iC = y.e.c((AppOpsManager) y.e.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static ColorStateList b(Context context, int i5) {
        return r.a(context.getResources(), i5, context.getTheme());
    }
}
