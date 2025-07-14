package I0;

import J0.f;
import J0.h;
import J0.i;
import J0.j;
import J0.k;
import J0.l;
import J0.n;
import J0.o;
import J0.q;
import J0.r;
import J0.s;
import J0.v;
import L0.g;
import android.content.Context;
import android.net.ConnectivityManager;
import b0.C0198c;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0198c f861a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f862b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f863c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f864d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.a f865e;
    public final S0.a f;

    /* renamed from: g, reason: collision with root package name */
    public final int f866g;

    public e(Context context, S0.a aVar, S0.a aVar2) {
        f2.d dVar = new f2.d();
        J0.c cVar = J0.c.f1513a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f1525a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        J0.d dVar2 = J0.d.f1515a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        J0.b bVar = J0.b.f1501a;
        dVar.a(J0.a.class, bVar);
        dVar.a(h.class, bVar);
        J0.e eVar = J0.e.f1518a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        J0.g gVar = J0.g.f1532a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f6723d = true;
        this.f861a = new C0198c(dVar);
        this.f863c = context;
        this.f862b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f864d = b(a.f848c);
        this.f865e = aVar2;
        this.f = aVar;
        this.f866g = 40000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException(g4.f.d("Invalid url: ", str), e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final K0.a a(K0.a r7) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.e.a(K0.a):K0.a");
    }
}
