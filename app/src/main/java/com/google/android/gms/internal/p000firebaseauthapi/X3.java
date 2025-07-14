package com.google.android.gms.internal.p000firebaseauthapi;

import b1.AbstractC0203C;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X3 implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5408d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5409e;

    public X3(String str) {
        AbstractC0203C.d(str, "A valid API key must be provided");
        this.f5409e = str;
    }

    public final Object clone() {
        String str = this.f5409e;
        AbstractC0203C.c(str);
        return new X3(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X3)) {
            return false;
        }
        X3 x32 = (X3) obj;
        return AbstractC0203C.h(this.f5409e, x32.f5409e) && this.f5408d == x32.f5408d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5409e}) + (!this.f5408d ? 1 : 0);
    }
}
