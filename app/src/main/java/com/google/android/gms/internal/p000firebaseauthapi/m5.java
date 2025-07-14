package com.google.android.gms.internal.p000firebaseauthapi;

import O2.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class m5 extends U4 {
    private static final Map<Object, m5> zzb = new ConcurrentHashMap();
    protected D zzc;
    protected int zzd;

    public m5() {
        this.zza = 0;
        this.zzc = D.f;
        this.zzd = -1;
    }

    public static Object e(Method method, U4 u4, Object... objArr) {
        try {
            return method.invoke(u4, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void f(Class cls, m5 m5Var) {
        zzb.put(cls, m5Var);
    }

    public static m5 j(Class cls) throws ClassNotFoundException {
        Map<Object, m5> map = zzb;
        m5 m5Var = map.get(cls);
        if (m5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m5Var = map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (m5Var == null) {
            m5Var = (m5) ((m5) L.h(cls)).h(6);
            if (m5Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, m5Var);
        }
        return m5Var;
    }

    public static m5 k(m5 m5Var, Z4 z4, g5 g5Var) throws C0258f {
        Y4 y4 = (Y4) z4;
        int iN = y4.n();
        a5 a5Var = new a5(y4.f, iN);
        try {
            a5Var.c(iN);
            m5 m5Var2 = (m5) m5Var.h(4);
            try {
                A a5 = C0365x.f5676c.a(m5Var2.getClass());
                b5 b5Var = (b5) a5Var.f5429g;
                if (b5Var == null) {
                    b5Var = new b5(a5Var);
                }
                a5.c(m5Var2, b5Var, g5Var);
                a5.b(m5Var2);
                if (a5Var.f5428e != 0) {
                    throw new C0258f("Protocol message end-group tag did not match expected tag.");
                }
                if (m5Var2.g()) {
                    return m5Var2;
                }
                throw new C0258f(new d().getMessage());
            } catch (C0258f e5) {
                throw e5;
            } catch (IOException e6) {
                if (e6.getCause() instanceof C0258f) {
                    throw ((C0258f) e6.getCause());
                }
                throw new C0258f(e6.getMessage(), e6);
            } catch (RuntimeException e7) {
                if (e7.getCause() instanceof C0258f) {
                    throw ((C0258f) e7.getCause());
                }
                throw e7;
            }
        } catch (C0258f e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static m5 l(m5 m5Var, byte[] bArr, g5 g5Var) throws C0258f {
        int length = bArr.length;
        m5 m5Var2 = (m5) m5Var.h(4);
        try {
            A a5 = C0365x.f5676c.a(m5Var2.getClass());
            I0.d dVar = new I0.d();
            g5Var.getClass();
            a5.e(m5Var2, bArr, 0, length, dVar);
            a5.b(m5Var2);
            if (m5Var2.zza != 0) {
                throw new RuntimeException();
            }
            if (m5Var2.g()) {
                return m5Var2;
            }
            throw new C0258f(new d().getMessage());
        } catch (C0258f e5) {
            throw e5;
        } catch (IOException e6) {
            if (e6.getCause() instanceof C0258f) {
                throw ((C0258f) e6.getCause());
            }
            throw new C0258f(e6.getMessage(), e6);
        } catch (IndexOutOfBoundsException unused) {
            throw C0258f.e();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.U4
    public final void a(f5 f5Var) {
        A a5 = C0365x.f5676c.a(getClass());
        C0306n c0306n = f5Var.f5479d;
        if (c0306n == null) {
            c0306n = new C0306n(f5Var);
        }
        a5.f(this, c0306n);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.U4
    public final int d() {
        int i5 = this.zzd;
        if (i5 != -1) {
            return i5;
        }
        int iJ = C0365x.f5676c.a(getClass()).j(this);
        this.zzd = iJ;
        return iJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C0365x.f5676c.a(getClass()).g(this, (m5) obj);
        }
        return false;
    }

    public final boolean g() {
        byte bByteValue = ((Byte) h(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = C0365x.f5676c.a(getClass()).h(this);
        h(2);
        return zH;
    }

    public abstract Object h(int i5);

    public final int hashCode() {
        int i5 = this.zza;
        if (i5 != 0) {
            return i5;
        }
        int iD = C0365x.f5676c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final l5 i() {
        return (l5) h(5);
    }

    public final String toString() throws SecurityException {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0335s.F(this, sb, 0);
        return sb.toString();
    }
}
