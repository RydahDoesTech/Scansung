package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class C implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public String f5274d;
    public final String f;

    /* renamed from: h, reason: collision with root package name */
    public int f5277h;

    /* renamed from: e, reason: collision with root package name */
    public int f5275e = 2;

    /* renamed from: g, reason: collision with root package name */
    public int f5276g = 0;

    public C(C0306n c0306n, String str) {
        c0306n.getClass();
        this.f5277h = Integer.MAX_VALUE;
        this.f = str;
    }

    public abstract int a(int i5);

    public abstract int b(int i5);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iA;
        int i5 = this.f5275e;
        if (i5 == 4) {
            throw new IllegalStateException();
        }
        int i6 = i5 - 1;
        String string = null;
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 0) {
            return true;
        }
        if (i6 != 2) {
            this.f5275e = 4;
            int i7 = this.f5276g;
            while (true) {
                int i8 = this.f5276g;
                if (i8 == -1) {
                    this.f5275e = 3;
                    break;
                }
                int iB = b(i8);
                String str = this.f;
                if (iB == -1) {
                    iB = str.length();
                    this.f5276g = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.f5276g = iA;
                }
                if (iA == i7) {
                    int i9 = iA + 1;
                    this.f5276g = i9;
                    if (i9 > str.length()) {
                        this.f5276g = -1;
                    }
                } else {
                    if (i7 < iB) {
                        str.charAt(i7);
                    }
                    if (i7 < iB) {
                        str.charAt(iB - 1);
                    }
                    int i10 = this.f5277h;
                    if (i10 == 1) {
                        iB = str.length();
                        this.f5276g = -1;
                        if (iB > i7) {
                            str.charAt(iB - 1);
                        }
                    } else {
                        this.f5277h = i10 - 1;
                    }
                    string = str.subSequence(i7, iB).toString();
                }
            }
            this.f5274d = string;
            if (this.f5275e != 3) {
                this.f5275e = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5275e = 2;
        String str = this.f5274d;
        this.f5274d = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
