package e4;

import b3.AbstractC0219i;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final P f6666a = new P();

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public InterfaceC0798h c(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("annotations", interfaceC0798h);
        return interfaceC0798h;
    }

    public abstract N d(AbstractC0438v abstractC0438v);

    public boolean e() {
        return this instanceof P;
    }

    public AbstractC0438v f(int i5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("topLevelType", abstractC0438v);
        A3.f.q(i5, "position");
        return abstractC0438v;
    }
}
