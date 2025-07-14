package com.google.firebase.datatransport;

import D3.c;
import H0.b;
import H0.d;
import I0.a;
import K0.i;
import K0.j;
import a2.C0103a;
import a2.C0104b;
import a2.InterfaceC0105c;
import a2.f;
import a2.k;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class TransportRegistrar implements f {
    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(InterfaceC0105c interfaceC0105c) {
        byte[] bytes;
        j.b((Context) interfaceC0105c.a(Context.class));
        j jVarA = j.a();
        a aVar = a.f850e;
        jVarA.getClass();
        Set setUnmodifiableSet = aVar != null ? Collections.unmodifiableSet(a.f849d) : Collections.singleton(new b("proto"));
        c cVarA = K0.b.a();
        aVar.getClass();
        cVarA.f507e = "cct";
        String str = aVar.f851a;
        String str2 = aVar.f852b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        cVarA.f = bytes;
        return new i(setUnmodifiableSet, cVarA.b(), jVarA);
    }

    @Override // a2.f
    public List<C0104b> getComponents() {
        C0103a c0103aA = C0104b.a(d.class);
        c0103aA.a(new k(1, 0, Context.class));
        c0103aA.f = new C2.a(16);
        return Collections.singletonList(c0103aA.b());
    }
}
