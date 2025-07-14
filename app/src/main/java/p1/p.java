package p1;

import d2.C0393b;

/* loaded from: classes.dex */
public final class p implements d2.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8381a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8382b = false;

    /* renamed from: c, reason: collision with root package name */
    public d2.c f8383c;

    /* renamed from: d, reason: collision with root package name */
    public final o f8384d;

    public p(o oVar) {
        this.f8384d = oVar;
    }

    @Override // d2.g
    public final d2.g a(String str) {
        if (this.f8381a) {
            throw new C0393b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8381a = true;
        this.f8384d.a(this.f8383c, str, this.f8382b);
        return this;
    }

    @Override // d2.g
    public final d2.g b(boolean z4) {
        if (this.f8381a) {
            throw new C0393b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8381a = true;
        this.f8384d.b(this.f8383c, z4 ? 1 : 0, this.f8382b);
        return this;
    }
}
