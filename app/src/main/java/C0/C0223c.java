package c0;

import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.b0;
import java.io.PrintWriter;
import o.C0714l;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223c extends AbstractC0221a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5138a;

    /* renamed from: b, reason: collision with root package name */
    public final C0222b f5139b;

    public C0223c(InterfaceC0159w interfaceC0159w, b0 b0Var) {
        this.f5138a = interfaceC0159w;
        this.f5139b = (C0222b) new D3.c(b0Var, C0222b.f5136b).d(C0222b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        C0714l c0714l = this.f5139b.f5137a;
        if (c0714l.f > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c0714l.f <= 0) {
                return;
            }
            if (c0714l.f8240e[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0714l.f8239d[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f5138a;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}}");
        return sb.toString();
    }
}
