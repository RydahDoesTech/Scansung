package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234b extends C {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0306n f5431i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234b(C0306n c0306n, String str, C0306n c0306n2) {
        super(c0306n, str);
        this.f5431i = c0306n2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.C
    public final int a(int i5) {
        return ((Matcher) this.f5431i.f5568e).end();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.C
    public final int b(int i5) {
        C0306n c0306n = this.f5431i;
        if (((Matcher) c0306n.f5568e).find(i5)) {
            return ((Matcher) c0306n.f5568e).start();
        }
        return -1;
    }
}
