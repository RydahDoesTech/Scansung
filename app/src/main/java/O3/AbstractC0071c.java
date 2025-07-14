package O3;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: O3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071c implements y {
    static {
        int i5 = C0077i.f2076b;
    }

    public final AbstractC0070b b(ByteArrayInputStream byteArrayInputStream, C0077i c0077i) throws IOException {
        AbstractC0070b abstractC0070b;
        try {
            int i5 = byteArrayInputStream.read();
            if (i5 == -1) {
                abstractC0070b = null;
            } else {
                if ((i5 & 128) != 0) {
                    i5 &= 127;
                    int i6 = 7;
                    while (true) {
                        if (i6 >= 32) {
                            while (i6 < 64) {
                                int i7 = byteArrayInputStream.read();
                                if (i7 == -1) {
                                    throw C0086s.a();
                                }
                                if ((i7 & 128) != 0) {
                                    i6 += 7;
                                }
                            }
                            throw new C0086s("CodedInputStream encountered a malformed varint.");
                        }
                        int i8 = byteArrayInputStream.read();
                        if (i8 == -1) {
                            throw C0086s.a();
                        }
                        i5 |= (i8 & 127) << i6;
                        if ((i8 & 128) == 0) {
                            break;
                        }
                        i6 += 7;
                    }
                }
                C0074f c0074f = new C0074f(new C0069a(byteArrayInputStream, i5));
                abstractC0070b = (AbstractC0070b) a(c0074f, c0077i);
                try {
                    c0074f.a(0);
                } catch (C0086s e5) {
                    e5.f2092d = abstractC0070b;
                    throw e5;
                }
            }
            if (abstractC0070b == null || abstractC0070b.b()) {
                return abstractC0070b;
            }
            C0086s c0086s = new C0086s(new O2.d().getMessage());
            c0086s.f2092d = abstractC0070b;
            throw c0086s;
        } catch (IOException e6) {
            throw new C0086s(e6.getMessage());
        }
    }
}
