package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5325a;

    public K(Unsafe unsafe) {
        this.f5325a = unsafe;
    }

    public abstract double a(long j5, Object obj);

    public abstract float b(long j5, Object obj);

    public abstract void c(Object obj, long j5, boolean z4);

    public abstract void d(Object obj, long j5, byte b2);

    public abstract void e(Object obj, long j5, double d5);

    public abstract void f(Object obj, long j5, float f);

    public abstract boolean g(long j5, Object obj);

    public final int h(Class cls) {
        return this.f5325a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f5325a.arrayIndexScale(cls);
    }

    public final int j(long j5, Object obj) {
        return this.f5325a.getInt(obj, j5);
    }

    public final long k(long j5, Object obj) {
        return this.f5325a.getLong(obj, j5);
    }

    public final void l(Field field) {
        this.f5325a.objectFieldOffset(field);
    }

    public final Object m(long j5, Object obj) {
        return this.f5325a.getObject(obj, j5);
    }

    public final void n(int i5, long j5, Object obj) {
        this.f5325a.putInt(obj, j5, i5);
    }

    public final void o(Object obj, long j5, long j6) {
        this.f5325a.putLong(obj, j5, j6);
    }

    public final void p(Object obj, long j5, Object obj2) {
        this.f5325a.putObject(obj, j5, obj2);
    }
}
