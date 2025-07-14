package e4;

import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.C0233a4;
import com.google.firebase.messaging.C0388e;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0453c;
import g3.InterfaceC0466p;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: e4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f6683a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0233a4 f6684b;

    static {
        b3.r rVar = b3.q.f5100a;
        f6683a = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.c(AbstractC0426i.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        C0388e c0388e = G.f6646e;
        InterfaceC0453c interfaceC0453cB = rVar.b(C0425h.class);
        c0388e.getClass();
        f6684b = new C0233a4(interfaceC0453cB, c0388e.q(interfaceC0453cB));
    }

    public static final InterfaceC0798h a(G g5) {
        InterfaceC0798h interfaceC0798h;
        AbstractC0219i.e("<this>", g5);
        InterfaceC0466p interfaceC0466p = f6683a[0];
        C0233a4 c0233a4 = f6684b;
        c0233a4.getClass();
        AbstractC0219i.e(Property.TABLE_NAME, interfaceC0466p);
        C0425h c0425h = (C0425h) g5.f7942d.get(c0233a4.f5423a);
        return (c0425h == null || (interfaceC0798h = c0425h.f6682a) == null) ? C0797g.f8481a : interfaceC0798h;
    }
}
