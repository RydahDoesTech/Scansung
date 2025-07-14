package H3;

import b3.AbstractC0219i;
import java.io.Serializable;
import l2.C0682a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f822a = 1;

    /* renamed from: b, reason: collision with root package name */
    public String f823b;

    /* renamed from: c, reason: collision with root package name */
    public int f824c;

    /* renamed from: d, reason: collision with root package name */
    public Object f825d;

    /* renamed from: e, reason: collision with root package name */
    public Object f826e;
    public Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f827g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f828h;

    public /* synthetic */ b() {
    }

    public C0682a a() {
        String strC = this.f824c == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            strC = strC.concat(" expiresInSecs");
        }
        if (((Long) this.f827g) == null) {
            strC = g4.f.c(strC, " tokenCreationEpochInSecs");
        }
        if (strC.isEmpty()) {
            return new C0682a(this.f823b, this.f824c, (String) this.f825d, (String) this.f826e, ((Long) this.f).longValue(), ((Long) this.f827g).longValue(), (String) this.f828h);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }

    public String toString() {
        switch (this.f822a) {
            case 0:
                return ((a) this.f825d) + " version=" + ((M3.f) this.f826e);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, M3.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i5) {
        AbstractC0219i.e("kind", aVar);
        this.f825d = aVar;
        this.f826e = fVar;
        this.f = strArr;
        this.f827g = strArr2;
        this.f828h = strArr3;
        this.f823b = str;
        this.f824c = i5;
    }
}
