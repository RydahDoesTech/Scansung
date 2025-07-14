package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365x {

    /* renamed from: c, reason: collision with root package name */
    public static final C0365x f5676c = new C0365x();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5678b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0306n f5677a = new C0306n();

    public final A a(Class cls) {
        C0341t c0341tF;
        C0347u c0347u;
        Class cls2;
        Charset charset = AbstractC0246d.f5451a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5678b;
        A a5 = (A) concurrentHashMap.get(cls);
        if (a5 == null) {
            C0306n c0306n = this.f5677a;
            c0306n.getClass();
            Class cls3 = B.f5262a;
            if (!m5.class.isAssignableFrom(cls) && (cls2 = B.f5262a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            C0377z c0377zA = ((C0300m) c0306n.f5568e).a(cls);
            if ((c0377zA.f5699d & 2) == 2) {
                boolean zIsAssignableFrom = m5.class.isAssignableFrom(cls);
                U4 u4 = c0377zA.f5696a;
                if (zIsAssignableFrom) {
                    c0347u = new C0347u(B.f5265d, i5.f5519a, u4);
                } else {
                    E e5 = B.f5263b;
                    h5 h5Var = i5.f5520b;
                    if (h5Var == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c0347u = new C0347u(e5, h5Var, u4);
                }
                a5 = c0347u;
            } else {
                if (m5.class.isAssignableFrom(cls)) {
                    if (c0377zA.b() == 1) {
                        int i5 = AbstractC0359w.f5657a;
                        c0341tF = C0341t.F(c0377zA, AbstractC0294l.f5547b, B.f5265d, i5.f5519a, AbstractC0324q.f5594b);
                    } else {
                        int i6 = AbstractC0359w.f5657a;
                        c0341tF = C0341t.F(c0377zA, AbstractC0294l.f5547b, B.f5265d, null, AbstractC0324q.f5594b);
                    }
                } else if (c0377zA.b() == 1) {
                    int i7 = AbstractC0359w.f5657a;
                    C0282j c0282j = AbstractC0294l.f5546a;
                    E e6 = B.f5263b;
                    h5 h5Var2 = i5.f5520b;
                    if (h5Var2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c0341tF = C0341t.F(c0377zA, c0282j, e6, h5Var2, AbstractC0324q.f5593a);
                } else {
                    int i8 = AbstractC0359w.f5657a;
                    c0341tF = C0341t.F(c0377zA, AbstractC0294l.f5546a, B.f5264c, null, AbstractC0324q.f5593a);
                }
                a5 = c0341tF;
            }
            A a6 = (A) concurrentHashMap.putIfAbsent(cls, a5);
            if (a6 != null) {
                return a6;
            }
        }
        return a5;
    }
}
