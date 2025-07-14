package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282j extends AbstractC0294l {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f5521c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i5, long j5, Object obj) {
        C0270h c0270h;
        List list = (List) L.f5338c.m(j5, obj);
        if (list.isEmpty()) {
            List c0270h2 = list instanceof InterfaceC0276i ? new C0270h(i5) : new ArrayList(i5);
            L.r(obj, j5, c0270h2);
            return c0270h2;
        }
        if (f5521c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i5);
            arrayList.addAll(list);
            L.r(obj, j5, arrayList);
            c0270h = arrayList;
        } else {
            if (!(list instanceof H)) {
                return list;
            }
            C0270h c0270h3 = new C0270h(list.size() + i5);
            c0270h3.addAll(c0270h3.f5496e.size(), (H) list);
            L.r(obj, j5, c0270h3);
            c0270h = c0270h3;
        }
        return c0270h;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l
    public final List a(long j5, Object obj) {
        return d(10, j5, obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l
    public final void b(long j5, Object obj) {
        Object objUnmodifiableList;
        List list = (List) L.f5338c.m(j5, obj);
        if (list instanceof InterfaceC0276i) {
            objUnmodifiableList = ((InterfaceC0276i) list).a();
        } else {
            if (f5521c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
        }
        L.r(obj, j5, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l
    public final void c(m5 m5Var, m5 m5Var2, long j5) {
        List list = (List) L.f5338c.m(j5, m5Var2);
        List listD = d(list.size(), j5, m5Var);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        L.r(m5Var, j5, list);
    }
}
