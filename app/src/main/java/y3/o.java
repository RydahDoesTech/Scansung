package y3;

import com.samsung.android.knox.ex.KnoxContract;
import java.util.HashMap;
import p3.AbstractC0771o;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0742D;
import p3.InterfaceC0759c;
import p3.InterfaceC0766j;
import p3.InterfaceC0769m;
import s3.AbstractC0828D;
import t3.C0875a;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0770n f9418a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0770n f9419b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0770n f9420c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f9421d;

    static {
        C0875a c0875a = C0875a.f8975c;
        C0770n c0770n = new C0770n(c0875a, 9);
        f9418a = c0770n;
        t3.c cVar = t3.c.f8977c;
        C0770n c0770n2 = new C0770n(cVar, 10);
        f9419b = c0770n2;
        t3.b bVar = t3.b.f8976c;
        C0770n c0770n3 = new C0770n(bVar, 11);
        f9420c = c0770n3;
        HashMap map = new HashMap();
        f9421d = map;
        map.put(c0875a, c0770n);
        map.put(cVar, c0770n2);
        map.put(bVar, c0770n3);
    }

    public static /* synthetic */ void a(int i5) {
        String str = (i5 == 5 || i5 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 5 || i5 == 6) ? 2 : 3];
        switch (i5) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = KnoxContract.Config.DateTime.PARAM_SECOND;
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i5 == 5 || i5 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i5 == 2 || i5 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i5 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i5 != 5 && i5 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 5 && i5 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(C0753O c0753o, InterfaceC0769m interfaceC0769m, InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(1);
            throw null;
        }
        int i5 = Q3.f.f2341a;
        if (c(interfaceC0769m instanceof InterfaceC0759c ? Q3.f.u((InterfaceC0759c) interfaceC0769m) : interfaceC0769m, interfaceC0766j)) {
            return true;
        }
        return AbstractC0771o.f8421c.a(c0753o, interfaceC0769m, interfaceC0766j);
    }

    public static boolean c(InterfaceC0769m interfaceC0769m, InterfaceC0766j interfaceC0766j) {
        if (interfaceC0769m == null) {
            a(2);
            throw null;
        }
        if (interfaceC0766j == null) {
            a(3);
            throw null;
        }
        InterfaceC0742D interfaceC0742D = (InterfaceC0742D) Q3.f.j(interfaceC0769m, InterfaceC0742D.class, false);
        InterfaceC0742D interfaceC0742D2 = (InterfaceC0742D) Q3.f.j(interfaceC0766j, InterfaceC0742D.class, false);
        return (interfaceC0742D2 == null || interfaceC0742D == null || !((AbstractC0828D) interfaceC0742D).f8745h.equals(((AbstractC0828D) interfaceC0742D2).f8745h)) ? false : true;
    }
}
