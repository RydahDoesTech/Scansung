package D0;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.idm.providers.mo.IDMMoInterface;
import java.lang.reflect.Method;
import o.C0704b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0704b f459a;

    /* renamed from: b, reason: collision with root package name */
    public final C0704b f460b;

    /* renamed from: d, reason: collision with root package name */
    public final Parcel f462d;

    /* renamed from: e, reason: collision with root package name */
    public final int f463e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final String f464g;

    /* renamed from: i, reason: collision with root package name */
    public final int f466i;

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f461c = new SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    public final int f465h = -1;

    public b(Parcel parcel, int i5, int i6, String str, C0704b c0704b, C0704b c0704b2, C0704b c0704b3) {
        this.f459a = c0704b2;
        this.f460b = c0704b3;
        this.f462d = parcel;
        this.f463e = i5;
        this.f = i6;
        this.f466i = i5;
        this.f464g = str;
    }

    public final Class a(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0704b c0704b = this.f460b;
        Class cls2 = (Class) c0704b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + IDMMoInterface.IDM_MO_ROOT_PATH + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0704b.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method b(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C0704b c0704b = this.f459a;
        Method method = (Method) c0704b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsA = a(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsA.getDeclaredMethod("write", cls, b.class);
        c0704b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }
}
