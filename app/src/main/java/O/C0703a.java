package o;

import a4.v;
import java.util.Map;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703a extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8200e;
    public final /* synthetic */ Object f;

    public /* synthetic */ C0703a(int i5, Object obj) {
        this.f8200e = i5;
        this.f = obj;
    }

    @Override // a4.v
    public final void a() {
        switch (this.f8200e) {
            case 0:
                ((C0704b) this.f).clear();
                break;
            default:
                ((C0705c) this.f).clear();
                break;
        }
    }

    @Override // a4.v
    public final Object b(int i5, int i6) {
        switch (this.f8200e) {
            case 0:
                return ((C0704b) this.f).f8237e[(i5 << 1) + i6];
            default:
                return ((C0705c) this.f).f8209e[i5];
        }
    }

    @Override // a4.v
    public final Map c() {
        switch (this.f8200e) {
            case 0:
                return (C0704b) this.f;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // a4.v
    public final int d() {
        switch (this.f8200e) {
            case 0:
                return ((C0704b) this.f).f;
            default:
                return ((C0705c) this.f).f;
        }
    }

    @Override // a4.v
    public final int e(Object obj) {
        switch (this.f8200e) {
            case 0:
                return ((C0704b) this.f).e(obj);
            default:
                return ((C0705c) this.f).indexOf(obj);
        }
    }

    @Override // a4.v
    public final int f(Object obj) {
        switch (this.f8200e) {
            case 0:
                return ((C0704b) this.f).g(obj);
            default:
                return ((C0705c) this.f).indexOf(obj);
        }
    }

    @Override // a4.v
    public final void g(Object obj, Object obj2) {
        switch (this.f8200e) {
            case 0:
                ((C0704b) this.f).put(obj, obj2);
                break;
            default:
                ((C0705c) this.f).add(obj);
                break;
        }
    }

    @Override // a4.v
    public final void h(int i5) {
        switch (this.f8200e) {
            case 0:
                ((C0704b) this.f).i(i5);
                break;
            default:
                ((C0705c) this.f).p(i5);
                break;
        }
    }

    @Override // a4.v
    public final Object i(int i5, Object obj) {
        switch (this.f8200e) {
            case 0:
                int i6 = (i5 << 1) + 1;
                Object[] objArr = ((C0704b) this.f).f8237e;
                Object obj2 = objArr[i6];
                objArr[i6] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
