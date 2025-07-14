package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.util.Collection;

/* renamed from: v3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892D extends s implements E3.b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0890B f9230a;

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f9231b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9232c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9233d;

    public C0892D(AbstractC0890B abstractC0890B, Annotation[] annotationArr, String str, boolean z4) {
        AbstractC0219i.e("reflectAnnotations", annotationArr);
        this.f9230a = abstractC0890B;
        this.f9231b = annotationArr;
        this.f9232c = str;
        this.f9233d = z4;
    }

    @Override // E3.b
    public final Collection s() {
        return r2.d.g(this.f9231b);
    }

    @Override // E3.b
    public final C0898e t(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return r2.d.d(this.f9231b, cVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0892D.class.getName());
        sb.append(": ");
        sb.append(this.f9233d ? "vararg " : "");
        String str = this.f9232c;
        sb.append(str != null ? N3.f.d(str) : null);
        sb.append(": ");
        sb.append(this.f9230a);
        return sb.toString();
    }
}
