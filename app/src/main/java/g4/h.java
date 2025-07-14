package g4;

import P2.u;
import b3.AbstractC0219i;
import e4.J;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import m3.AbstractC0695h;
import m3.C0692e;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class h implements J {

    /* renamed from: a, reason: collision with root package name */
    public final i f6805a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f6806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6807c;

    public h(i iVar, String... strArr) {
        AbstractC0219i.e("kind", iVar);
        AbstractC0219i.e("formatParams", strArr);
        this.f6805a = iVar;
        this.f6806b = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f6807c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(iVar.f6835d, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        C0692e c0692e = C0692e.f;
        return C0692e.f;
    }

    @Override // e4.J
    public final boolean h() {
        return false;
    }

    @Override // e4.J
    public final InterfaceC0763g i() {
        j.f6837a.getClass();
        return j.f6839c;
    }

    @Override // e4.J
    public final Collection j() {
        return u.f2163d;
    }

    @Override // e4.J
    public final List k() {
        return u.f2163d;
    }

    public final String toString() {
        return this.f6807c;
    }
}
