package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0258f extends IOException {
    public static C0252e a() {
        return new C0252e("Protocol message tag had invalid wire type.");
    }

    public static C0258f b() {
        return new C0258f("Protocol message had invalid UTF-8.");
    }

    public static C0258f c() {
        return new C0258f("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0258f d() {
        return new C0258f("Failed to parse the message.");
    }

    public static C0258f e() {
        return new C0258f("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
