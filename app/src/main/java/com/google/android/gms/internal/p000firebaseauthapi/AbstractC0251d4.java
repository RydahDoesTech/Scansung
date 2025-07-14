package com.google.android.gms.internal.p000firebaseauthapi;

import E0.d;
import V1.g;
import X1.c;
import Z1.j;
import Z1.m;
import Z1.t;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251d4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5456a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC0245c4 f5457b = new BinderC0245c4(this);

    /* renamed from: c, reason: collision with root package name */
    public g f5458c;

    /* renamed from: d, reason: collision with root package name */
    public t f5459d;

    /* renamed from: e, reason: collision with root package name */
    public m f5460e;
    public j f;

    /* renamed from: g, reason: collision with root package name */
    public C0382z4 f5461g;

    /* renamed from: h, reason: collision with root package name */
    public C0364w4 f5462h;

    /* renamed from: i, reason: collision with root package name */
    public c f5463i;

    /* renamed from: j, reason: collision with root package name */
    public C0328q3 f5464j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5465k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5466l;

    /* renamed from: m, reason: collision with root package name */
    public U f5467m;

    public AbstractC0251d4(int i5) {
        new ArrayList();
        this.f5456a = i5;
    }

    public static /* synthetic */ void e(AbstractC0251d4 abstractC0251d4) {
        abstractC0251d4.c();
        AbstractC0203C.g("no success or failure set on method implementation", abstractC0251d4.f5465k);
    }

    public abstract d a();

    public abstract String b();

    public abstract void c();

    public final void d(g gVar) {
        AbstractC0203C.f("firebaseApp cannot be null", gVar);
        this.f5458c = gVar;
    }

    public final void f(Status status) {
        this.f5465k = true;
        this.f5467m.c(null, status);
    }

    public final void g(Object obj) {
        this.f5465k = true;
        this.f5466l = obj;
        this.f5467m.c(obj, null);
    }
}
