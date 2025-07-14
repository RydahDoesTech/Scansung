package b1;

import android.os.Bundle;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0207c {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5007a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5009c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5010d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f5011e;
    public final /* synthetic */ k f;

    public AbstractC0207c(k kVar, int i5, Bundle bundle) {
        this.f = kVar;
        Boolean bool = Boolean.TRUE;
        this.f5009c = kVar;
        this.f5007a = bool;
        this.f5008b = false;
        this.f5010d = i5;
        this.f5011e = bundle;
    }

    public final void a() {
        synchronized (this) {
            this.f5007a = null;
        }
        synchronized (this.f5009c.f5040j) {
            this.f5009c.f5040j.remove(this);
        }
    }

    public abstract void b(Y0.a aVar);

    public abstract boolean c();
}
