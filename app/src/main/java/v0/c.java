package v0;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f9207d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9208e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9209g;

    public c(String str, int i5, String str2, int i6) {
        this.f9207d = i5;
        this.f9208e = i6;
        this.f = str;
        this.f9209g = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i5 = this.f9207d - cVar.f9207d;
        return i5 == 0 ? this.f9208e - cVar.f9208e : i5;
    }
}
