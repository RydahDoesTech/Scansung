package m3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public enum q {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(N3.b.e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(N3.b.e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(N3.b.e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(N3.b.e("kotlin/ULong", false));


    /* renamed from: d, reason: collision with root package name */
    public final N3.b f8162d;

    /* renamed from: e, reason: collision with root package name */
    public final N3.f f8163e;
    public final N3.b f;

    q(N3.b bVar) {
        this.f8162d = bVar;
        N3.f fVarI = bVar.i();
        AbstractC0219i.d("classId.shortClassName", fVarI);
        this.f8163e = fVarI;
        this.f = new N3.b(bVar.g(), N3.f.e(fVarI.b() + "Array"));
    }
}
