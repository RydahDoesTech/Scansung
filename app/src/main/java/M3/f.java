package M3;

import b3.AbstractC0219i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends K3.a {

    /* renamed from: g, reason: collision with root package name */
    public static final f f1821g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f1822h;
    public final boolean f;

    static {
        f fVar = new f(new int[]{1, 8, 0}, false);
        f1821g = fVar;
        int i5 = fVar.f1654c;
        int i6 = fVar.f1653b;
        f1822h = (i6 == 1 && i5 == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i6, i5 + 1, 0}, false);
        new f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] iArr, boolean z4) {
        super(Arrays.copyOf(iArr, iArr.length));
        AbstractC0219i.e("versionArray", iArr);
        this.f = z4;
    }

    public final boolean b(f fVar) {
        AbstractC0219i.e("metadataVersionFromLanguageVersion", fVar);
        f fVar2 = f1821g;
        int i5 = this.f1653b;
        int i6 = this.f1654c;
        if (i5 == 2 && i6 == 0 && fVar2.f1653b == 1 && fVar2.f1654c == 8) {
            return true;
        }
        if (!this.f) {
            fVar2 = f1822h;
        }
        fVar2.getClass();
        int i7 = fVar.f1653b;
        int i8 = fVar2.f1653b;
        if (i8 > i7 || (i8 >= i7 && fVar2.f1654c > fVar.f1654c)) {
            fVar = fVar2;
        }
        boolean z4 = false;
        if ((i5 == 1 && i6 == 0) || i5 == 0) {
            return false;
        }
        int i9 = fVar.f1653b;
        if (i5 > i9 || (i5 >= i9 && i6 > fVar.f1654c)) {
            z4 = true;
        }
        return !z4;
    }
}
