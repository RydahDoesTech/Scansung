package b3;

import g3.InterfaceC0452b;
import g3.InterfaceC0455e;
import java.io.Serializable;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0212b implements InterfaceC0452b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient InterfaceC0452b f5086d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5087e;
    public final Class f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5088g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5089h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5090i;

    public AbstractC0212b(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f5087e = obj;
        this.f = cls;
        this.f5088g = str;
        this.f5089h = str2;
        this.f5090i = z4;
    }

    public InterfaceC0452b b() {
        InterfaceC0452b interfaceC0452b = this.f5086d;
        if (interfaceC0452b != null) {
            return interfaceC0452b;
        }
        InterfaceC0452b interfaceC0452bG = g();
        this.f5086d = interfaceC0452bG;
        return interfaceC0452bG;
    }

    public abstract InterfaceC0452b g();

    @Override // g3.InterfaceC0452b
    public String getName() {
        return this.f5088g;
    }

    @Override // g3.InterfaceC0452b
    public final Object i(Object... objArr) {
        return k().i(objArr);
    }

    public InterfaceC0455e j() {
        Class cls = this.f;
        if (cls == null) {
            return null;
        }
        return this.f5090i ? q.f5100a.c(cls, "") : q.f5100a.b(cls);
    }

    public abstract InterfaceC0452b k();

    public String l() {
        return this.f5089h;
    }
}
