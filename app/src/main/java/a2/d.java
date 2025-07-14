package a2;

import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.idm.providers.mo.IDMMoInterface;
import j2.InterfaceC0558a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0558a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2991b;

    public /* synthetic */ d(int i5, Object obj) {
        this.f2990a = i5;
        this.f2991b = obj;
    }

    @Override // j2.InterfaceC0558a
    public final Object get() throws ClassNotFoundException {
        h2.d dVar;
        int i5 = this.f2990a;
        Object obj = this.f2991b;
        switch (i5) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (f.class.isAssignableFrom(cls)) {
                        return (f) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new n("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e5) {
                    throw new n(A3.f.o("Could not instantiate ", str, IDMMoInterface.IDM_MO_ROOT_PATH), e5);
                } catch (InstantiationException e6) {
                    throw new n(A3.f.o("Could not instantiate ", str, IDMMoInterface.IDM_MO_ROOT_PATH), e6);
                } catch (NoSuchMethodException e7) {
                    throw new n(g4.f.d("Could not instantiate ", str), e7);
                } catch (InvocationTargetException e8) {
                    throw new n(g4.f.d("Could not instantiate ", str), e8);
                }
            case 1:
                return (FirebaseCommonRegistrar) obj;
            default:
                Context context = (Context) obj;
                h2.d dVar2 = h2.d.f6857b;
                synchronized (h2.d.class) {
                    try {
                        if (h2.d.f6857b == null) {
                            h2.d.f6857b = new h2.d(context);
                        }
                        dVar = h2.d.f6857b;
                    } finally {
                    }
                }
                return dVar;
        }
    }
}
