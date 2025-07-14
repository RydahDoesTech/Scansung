package K0;

import android.content.Context;
import com.google.firebase.messaging.q;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c implements androidx.emoji2.text.h {

    /* renamed from: a, reason: collision with root package name */
    public Context f1626a;

    public c(Context context, int i5) {
        switch (i5) {
            case 2:
                this.f1626a = context;
                break;
            default:
                this.f1626a = context.getApplicationContext();
                break;
        }
    }

    @Override // androidx.emoji2.text.h
    public void a(Y0.j jVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new O0.a(this, jVar, threadPoolExecutor));
    }

    public d b() {
        Context context = this.f1626a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        d dVar = new d();
        dVar.f1627d = M0.a.a(f.f1633a);
        M0.c cVar = new M0.c(context);
        dVar.f1628e = cVar;
        dVar.f = M0.a.a(new E0.d(cVar, 10, new L0.e(cVar, 0)));
        N2.a aVarA = M0.a.a(new B.g(18, new L0.e(dVar.f1628e, 1)));
        dVar.f1629g = aVarA;
        Y0.h hVar = new Y0.h(3);
        M0.c cVar2 = dVar.f1628e;
        D3.c cVar3 = new D3.c(cVar2, aVarA, hVar, 4);
        N2.a aVar = dVar.f1627d;
        N2.a aVar2 = dVar.f;
        B3.g gVar = new B3.g(aVar, aVar2, cVar3, aVarA, aVarA);
        G3.d dVar2 = new G3.d();
        dVar2.f746d = cVar2;
        dVar2.f747e = aVar2;
        dVar2.f = aVarA;
        dVar2.f748g = cVar3;
        dVar2.f749h = aVar;
        dVar2.f750i = aVarA;
        dVar.f1630h = M0.a.a(new D3.c(gVar, dVar2, new q(aVar, aVarA, cVar3, aVarA, 7), 3));
        return dVar;
    }
}
