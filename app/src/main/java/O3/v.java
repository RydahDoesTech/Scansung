package O3;

import com.google.android.gms.internal.p000firebaseauthapi.Z4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class v implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2095d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2096e = 0;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Iterable f2097g;

    public v(Z4 z4) {
        this.f2097g = z4;
        this.f = z4.n();
    }

    public byte a() {
        try {
            byte[] bArr = ((w) this.f2097g).f2098e;
            int i5 = this.f2096e;
            this.f2096e = i5 + 1;
            return bArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2095d) {
            case 0:
                if (this.f2096e < this.f) {
                }
                break;
            default:
                if (this.f2096e < this.f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2095d) {
            case 0:
                return Byte.valueOf(a());
            default:
                int i5 = this.f2096e;
                if (i5 >= this.f) {
                    throw new NoSuchElementException();
                }
                this.f2096e = i5 + 1;
                return Byte.valueOf(((Z4) this.f2097g).m(i5));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2095d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public v(w wVar) {
        this.f2097g = wVar;
        this.f = wVar.f2098e.length;
    }
}
