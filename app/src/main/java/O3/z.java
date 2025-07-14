package O3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class z implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final Stack f2099d = new Stack();

    /* renamed from: e, reason: collision with root package name */
    public w f2100e;

    public z(AbstractC0073e abstractC0073e) {
        while (abstractC0073e instanceof B) {
            B b2 = (B) abstractC0073e;
            this.f2099d.push(b2);
            abstractC0073e = b2.f;
        }
        this.f2100e = (w) abstractC0073e;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w next() {
        w wVar;
        w wVar2 = this.f2100e;
        if (wVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = this.f2099d;
            if (!stack.isEmpty()) {
                Object obj = ((B) stack.pop()).f2023g;
                while (obj instanceof B) {
                    B b2 = (B) obj;
                    stack.push(b2);
                    obj = b2.f;
                }
                wVar = (w) obj;
                if (wVar.f2098e.length != 0) {
                    break;
                }
            } else {
                wVar = null;
                break;
            }
        }
        this.f2100e = wVar;
        return wVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2100e != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
