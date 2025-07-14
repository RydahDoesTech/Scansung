package O3;

import java.io.IOException;

/* renamed from: O3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086s extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0070b f2092d;

    public C0086s(String str) {
        super(str);
        this.f2092d = null;
    }

    public static C0086s a() {
        return new C0086s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
