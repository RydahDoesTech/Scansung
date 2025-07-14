package L0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final E0.d f1709a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1710b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1711c;

    public f(Context context, d dVar) {
        E0.d dVar2 = new E0.d(context, 9);
        this.f1711c = new HashMap();
        this.f1709a = dVar2;
        this.f1710b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f1711c.containsKey(str)) {
            return (g) this.f1711c.get(str);
        }
        CctBackendFactory cctBackendFactoryI0 = this.f1709a.I0(str);
        if (cctBackendFactoryI0 == null) {
            return null;
        }
        d dVar = this.f1710b;
        g gVarCreate = cctBackendFactoryI0.create(new b(dVar.f1704a, dVar.f1705b, dVar.f1706c, str));
        this.f1711c.put(str, gVarCreate);
        return gVarCreate;
    }
}
