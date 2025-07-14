package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import J2.b;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281i4 extends H3 {

    /* renamed from: c, reason: collision with root package name */
    public final String f5517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0299l4 f5518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0281i4(C0299l4 c0299l4, H3 h3, String str) {
        super(h3.f5313a, h3.f5314b);
        this.f5518d = c0299l4;
        this.f5517c = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.H3
    public final void a() {
        d dVar = C0299l4.f5553d;
        Object[] objArr = new Object[0];
        if (dVar.f10a <= 3) {
            Log.d((String) dVar.f11b, dVar.f("onCodeSent", objArr));
        }
        C0299l4 c0299l4 = this.f5518d;
        HashMap map = c0299l4.f5556c;
        String str = this.f5517c;
        C0293k4 c0293k4 = (C0293k4) map.get(str);
        if (c0293k4 == null) {
            return;
        }
        Iterator it = c0293k4.f5538b.iterator();
        while (it.hasNext()) {
            ((H3) it.next()).a();
        }
        c0293k4.f = true;
        if (c0293k4.f5537a <= 0) {
            C0293k4 c0293k42 = (C0293k4) c0299l4.f5556c.get(str);
            if (c0293k42 == null) {
                return;
            }
            if (!c0293k42.f5543h) {
                c0299l4.f(str);
            }
            c0299l4.c(str);
            return;
        }
        if (!c0293k4.f5539c) {
            c0299l4.f(str);
        } else {
            if (AbstractC0335s.I(c0293k4.f5540d) || ((C0293k4) c0299l4.f5556c.get(str)) == null) {
                return;
            }
            int i5 = D4.f5291a;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.H3
    public final void b(Status status) {
        d dVar = C0299l4.f5553d;
        String strB = b.B(status.f5238e);
        int length = String.valueOf(strB).length();
        String str = status.f;
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(str).length());
        sb.append("SMS verification code request failed: ");
        sb.append(strB);
        sb.append(" ");
        sb.append(str);
        dVar.e(sb.toString(), new Object[0]);
        C0299l4 c0299l4 = this.f5518d;
        HashMap map = c0299l4.f5556c;
        String str2 = this.f5517c;
        C0293k4 c0293k4 = (C0293k4) map.get(str2);
        if (c0293k4 == null) {
            return;
        }
        Iterator it = c0293k4.f5538b.iterator();
        while (it.hasNext()) {
            ((H3) it.next()).b(status);
        }
        c0299l4.c(str2);
    }
}
