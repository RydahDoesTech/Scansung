package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;

/* loaded from: classes.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile g5 f5494a;

    /* renamed from: b, reason: collision with root package name */
    public static final g5 f5495b;

    static {
        g5 g5Var = new g5();
        Collections.emptyMap();
        f5495b = g5Var;
    }

    public static g5 a() {
        g5 g5Var = f5494a;
        if (g5Var == null) {
            synchronized (g5.class) {
                try {
                    g5Var = f5494a;
                    if (g5Var == null) {
                        g5Var = f5495b;
                        f5494a = g5Var;
                    }
                } finally {
                }
            }
        }
        return g5Var;
    }
}
