package g1;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.idm.core.dd.IDMDDConstants;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f6772a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f6773b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f6774c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f6775d;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f6772a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f6773b = method2;
        try {
            method3 = WorkSource.class.getMethod(IDMDDConstants.tagSize, null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f6774c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            method4 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method4 = null;
        }
        f6775d = method4;
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e5) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e5);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e6) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e6);
        }
    }
}
