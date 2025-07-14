package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270h extends V4 implements RandomAccess, InterfaceC0276i {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5496e;

    static {
        new C0270h(10).f5400d = false;
    }

    public C0270h(int i5) {
        this.f5496e = new ArrayList(i5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final InterfaceC0276i a() {
        return this.f5400d ? new H(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i5, Object obj) {
        l();
        this.f5496e.add(i5, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f5496e.size(), collection);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        this.f5496e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0240c
    public final InterfaceC0240c d(int i5) {
        ArrayList arrayList = this.f5496e;
        if (i5 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i5);
        arrayList2.addAll(arrayList);
        return new C0270h(arrayList2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final void f(Y4 y4) {
        l();
        this.f5496e.add(y4);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final List g() {
        return Collections.unmodifiableList(this.f5496e);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final Object k(int i5) {
        return this.f5496e.get(i5);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String get(int i5) {
        String str;
        ArrayList arrayList = this.f5496e;
        Object obj = arrayList.get(i5);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Z4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0246d.f5451a);
            M m4 = O.f5375a;
            int length = bArr.length;
            O.f5375a.getClass();
            if (M.c(bArr, 0, length)) {
                arrayList.set(i5, str2);
            }
            return str2;
        }
        Z4 z4 = (Z4) obj;
        Charset charset = AbstractC0246d.f5451a;
        if (z4.n() == 0) {
            str = "";
        } else {
            Y4 y4 = (Y4) z4;
            str = new String(y4.f, 0, y4.n(), charset);
        }
        Y4 y42 = (Y4) z4;
        int iN = y42.n();
        O.f5375a.getClass();
        if (M.c(y42.f, 0, iN)) {
            arrayList.set(i5, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V4, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        String str;
        l();
        Object objRemove = this.f5496e.remove(i5);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof Z4) {
            Z4 z4 = (Z4) objRemove;
            Charset charset = AbstractC0246d.f5451a;
            if (z4.n() != 0) {
                Y4 y4 = (Y4) z4;
                return new String(y4.f, 0, y4.n(), charset);
            }
            str = "";
        } else {
            str = new String((byte[]) objRemove, AbstractC0246d.f5451a);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        l();
        Object obj2 = this.f5496e.set(i5, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof Z4)) {
            return new String((byte[]) obj2, AbstractC0246d.f5451a);
        }
        Z4 z4 = (Z4) obj2;
        Charset charset = AbstractC0246d.f5451a;
        if (z4.n() == 0) {
            return "";
        }
        Y4 y4 = (Y4) z4;
        return new String(y4.f, 0, y4.n(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5496e.size();
    }

    public C0270h(ArrayList arrayList) {
        this.f5496e = arrayList;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        l();
        if (collection instanceof InterfaceC0276i) {
            collection = ((InterfaceC0276i) collection).g();
        }
        boolean zAddAll = this.f5496e.addAll(i5, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
