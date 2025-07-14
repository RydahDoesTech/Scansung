package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class k5 implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final k5 f5544b = new k5(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5545a;

    public /* synthetic */ k5(int i5) {
        this.f5545a = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    public final C0377z a(Class cls) {
        switch (this.f5545a) {
            case 0:
                if (!m5.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (C0377z) m5.j(cls.asSubclass(m5.class)).h(3);
                } catch (Exception e5) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    public final boolean b(Class cls) {
        switch (this.f5545a) {
            case 0:
                return m5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
