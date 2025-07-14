package i;

import e1.AbstractC0415a;
import k.I1;

/* loaded from: classes.dex */
public final class k extends AbstractC0415a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6909d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6910e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6911g;

    public k(l lVar) {
        this.f6909d = 0;
        this.f6911g = lVar;
        this.f6910e = false;
        this.f = 0;
    }

    @Override // J.a0
    public final void a() {
        switch (this.f6909d) {
            case 0:
                int i5 = this.f + 1;
                this.f = i5;
                l lVar = (l) this.f6911g;
                if (i5 == lVar.f6912a.size()) {
                    AbstractC0415a abstractC0415a = lVar.f6915d;
                    if (abstractC0415a != null) {
                        abstractC0415a.a();
                    }
                    this.f = 0;
                    this.f6910e = false;
                    lVar.f6916e = false;
                    break;
                }
                break;
            default:
                if (!this.f6910e) {
                    ((I1) this.f6911g).f7507a.setVisibility(this.f);
                    break;
                }
                break;
        }
    }

    @Override // e1.AbstractC0415a, J.a0
    public void b() {
        switch (this.f6909d) {
            case 1:
                this.f6910e = true;
                break;
        }
    }

    @Override // e1.AbstractC0415a, J.a0
    public final void c() {
        switch (this.f6909d) {
            case 0:
                if (!this.f6910e) {
                    this.f6910e = true;
                    AbstractC0415a abstractC0415a = ((l) this.f6911g).f6915d;
                    if (abstractC0415a != null) {
                        abstractC0415a.c();
                        break;
                    }
                }
                break;
            default:
                ((I1) this.f6911g).f7507a.setVisibility(0);
                break;
        }
    }

    public k(I1 i12, int i5) {
        this.f6909d = 1;
        this.f6911g = i12;
        this.f = i5;
        this.f6910e = false;
    }
}
