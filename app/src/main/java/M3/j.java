package m3;

import P2.B;
import g3.y;
import java.util.Set;

/* loaded from: classes.dex */
public enum j {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* renamed from: d, reason: collision with root package name */
    public final N3.f f8080d;

    /* renamed from: e, reason: collision with root package name */
    public final N3.f f8081e;
    public final Object f = y.M(2, new i(this, 1));

    /* renamed from: g, reason: collision with root package name */
    public final Object f8082g = y.M(2, new i(this, 0));

    /* renamed from: h, reason: collision with root package name */
    public static final Set f8071h = B.u0(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE);

    j(String str) {
        this.f8080d = N3.f.e(str);
        this.f8081e = N3.f.e(str.concat("Array"));
    }
}
