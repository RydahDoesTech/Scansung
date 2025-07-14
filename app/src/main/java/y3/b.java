package Y3;

import e4.AbstractC0438v;
import p3.InterfaceC0758b;
import s3.AbstractC0860p;

/* loaded from: classes.dex */
public final class b extends H3.c {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0860p f2839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC0758b interfaceC0758b, AbstractC0438v abstractC0438v) {
        super(abstractC0438v);
        if (abstractC0438v == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f2839e = (AbstractC0860p) interfaceC0758b;
    }

    public final String toString() {
        return d() + ": Ext {" + this.f2839e + "}";
    }
}
