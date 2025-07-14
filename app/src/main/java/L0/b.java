package L0;

import android.content.Context;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1700a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.a f1701b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.a f1702c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1703d;

    public b(Context context, S0.a aVar, S0.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f1700a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f1701b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f1702c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1703d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1700a.equals(((b) cVar).f1700a)) {
            b bVar = (b) cVar;
            if (this.f1701b.equals(bVar.f1701b) && this.f1702c.equals(bVar.f1702c) && this.f1703d.equals(bVar.f1703d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1703d.hashCode() ^ ((((((this.f1700a.hashCode() ^ 1000003) * 1000003) ^ this.f1701b.hashCode()) * 1000003) ^ this.f1702c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f1700a);
        sb.append(", wallClock=");
        sb.append(this.f1701b);
        sb.append(", monotonicClock=");
        sb.append(this.f1702c);
        sb.append(", backendName=");
        return A3.f.p(sb, this.f1703d, "}");
    }
}
