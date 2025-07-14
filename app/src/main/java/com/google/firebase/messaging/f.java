package com.google.firebase.messaging;

import t1.InterfaceC0873a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0873a, a2.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f f6143e = new f(0);
    public static final /* synthetic */ f f = new f(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f f6144g = new f(2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6145d;

    public /* synthetic */ f(int i5) {
        this.f6145d = i5;
    }

    @Override // a2.e
    public Object j(a2.s sVar) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
    }

    @Override // t1.InterfaceC0873a
    public Object n0(t1.h hVar) {
        switch (this.f6145d) {
            case 0:
                return -1;
            default:
                return 403;
        }
    }
}
