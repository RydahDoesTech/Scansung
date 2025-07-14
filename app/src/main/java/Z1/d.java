package Z1;

import com.google.android.gms.internal.p000firebaseauthapi.G2;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final A.d f2867a = new A.d("GetTokenResultFactory", new String[0]);

    public static B.g a(String str) {
        Object map;
        try {
            map = e.b(str);
        } catch (G2 e5) {
            f2867a.d("Error parsing token claims", e5, new Object[0]);
            map = new HashMap();
        }
        B.g gVar = new B.g(24, false);
        gVar.f95e = map;
        return gVar;
    }
}
