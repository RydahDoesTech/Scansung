package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f3664d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f3665a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.q f3666b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3667c = 0;

    public l(com.google.firebase.messaging.q qVar, int i5) {
        this.f3666b = qVar;
        this.f3665a = i5;
    }

    public final int a(int i5) {
        W.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarC.f1418d;
        int i6 = iA + aVarC.f1415a;
        return byteBuffer.getInt((i5 * 4) + byteBuffer.getInt(i6) + i6 + 4);
    }

    public final int b() {
        W.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i5 = iA + aVarC.f1415a;
        return ((ByteBuffer) aVarC.f1418d).getInt(((ByteBuffer) aVarC.f1418d).getInt(i5) + i5);
    }

    public final W.a c() {
        ThreadLocal threadLocal = f3664d;
        W.a aVar = (W.a) threadLocal.get();
        if (aVar == null) {
            aVar = new W.a();
            threadLocal.set(aVar);
        }
        W.b bVar = (W.b) this.f3666b.f6168e;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i5 = iA + bVar.f1415a;
            int i6 = (this.f3665a * 4) + ((ByteBuffer) bVar.f1418d).getInt(i5) + i5 + 4;
            int i7 = ((ByteBuffer) bVar.f1418d).getInt(i6) + i6;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1418d;
            aVar.f1418d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1415a = i7;
                int i8 = i7 - byteBuffer.getInt(i7);
                aVar.f1416b = i8;
                aVar.f1417c = ((ByteBuffer) aVar.f1418d).getShort(i8);
            } else {
                aVar.f1415a = 0;
                aVar.f1416b = 0;
                aVar.f1417c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        W.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.f1418d).getInt(iA + aVarC.f1415a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i5 = 0; i5 < iB; i5++) {
            sb.append(Integer.toHexString(a(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
