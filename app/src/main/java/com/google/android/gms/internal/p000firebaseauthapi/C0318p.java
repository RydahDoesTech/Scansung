package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318p {
    public static final void a(Object obj, Object obj2) {
        C0312o c0312o = (C0312o) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c0312o.isEmpty()) {
            return;
        }
        Iterator it = c0312o.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final boolean b(Object obj) {
        return !((C0312o) obj).f5575d;
    }

    public static final C0312o c(Object obj, Object obj2) {
        C0312o c0312oB = (C0312o) obj;
        C0312o c0312o = (C0312o) obj2;
        if (!c0312o.isEmpty()) {
            if (!c0312oB.f5575d) {
                c0312oB = c0312oB.b();
            }
            c0312oB.d();
            if (!c0312o.isEmpty()) {
                c0312oB.putAll(c0312o);
            }
        }
        return c0312oB;
    }
}
