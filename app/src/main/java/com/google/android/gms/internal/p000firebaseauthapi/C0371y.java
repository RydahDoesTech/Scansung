package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371y extends V4 implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final C0371y f5684g;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5685e;
    public int f;

    static {
        C0371y c0371y = new C0371y(new Object[0], 0);
        f5684g = c0371y;
        c0371y.f5400d = false;
    }

    public C0371y(Object[] objArr, int i5) {
        this.f5685e = objArr;
        this.f = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        l();
        if (i5 < 0 || i5 > (i6 = this.f)) {
            throw new IndexOutOfBoundsException(n(i5));
        }
        Object[] objArr = this.f5685e;
        if (i6 < objArr.length) {
            System.arraycopy(objArr, i5, objArr, i5 + 1, i6 - i5);
        } else {
            Object[] objArr2 = new Object[((i6 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i5);
            System.arraycopy(this.f5685e, i5, objArr2, i5 + 1, this.f - i5);
            this.f5685e = objArr2;
        }
        this.f5685e[i5] = obj;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0240c
    public final /* bridge */ /* synthetic */ InterfaceC0240c d(int i5) {
        if (i5 >= this.f) {
            return new C0371y(Arrays.copyOf(this.f5685e, i5), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        o(i5);
        return this.f5685e[i5];
    }

    public final String n(int i5) {
        int i6 = this.f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i5);
        sb.append(", Size:");
        sb.append(i6);
        return sb.toString();
    }

    public final void o(int i5) {
        if (i5 < 0 || i5 >= this.f) {
            throw new IndexOutOfBoundsException(n(i5));
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V4, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        l();
        o(i5);
        Object[] objArr = this.f5685e;
        Object obj = objArr[i5];
        if (i5 < this.f - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        l();
        o(i5);
        Object[] objArr = this.f5685e;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i5 = this.f;
        Object[] objArr = this.f5685e;
        if (i5 == objArr.length) {
            this.f5685e = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5685e;
        int i6 = this.f;
        this.f = i6 + 1;
        objArr2[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
