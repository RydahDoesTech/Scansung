package Z0;

import a1.C0093a;
import a1.C0099g;
import a1.o;
import a1.r;
import android.content.Context;
import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import com.google.android.gms.internal.p000firebaseauthapi.X3;
import java.util.Collections;
import java.util.Set;
import o.C0705c;
import t1.i;
import t1.n;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.d f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final X3 f2856c;

    /* renamed from: d, reason: collision with root package name */
    public final C0093a f2857d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2858e;
    public final O1.e f;

    /* renamed from: g, reason: collision with root package name */
    public final C0099g f2859g;

    public c(Context context, E0.d dVar, X3 x32, b bVar) {
        AbstractC0203C.f("Null context is not permitted.", context);
        AbstractC0203C.f("Api must not be null.", dVar);
        AbstractC0203C.f("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", bVar);
        Context applicationContext = context.getApplicationContext();
        this.f2854a = applicationContext;
        this.f2855b = dVar;
        this.f2856c = x32;
        this.f2857d = new C0093a(dVar, x32);
        C0099g c0099gA = C0099g.a(applicationContext);
        this.f2859g = c0099gA;
        this.f2858e = c0099gA.f2959e.getAndIncrement();
        this.f = bVar.f2853a;
        R1 r12 = c0099gA.f2962i;
        r12.sendMessage(r12.obtainMessage(7, this));
    }

    public final D3.c a() {
        D3.c cVar = new D3.c(9);
        Set setEmptySet = Collections.emptySet();
        if (((C0705c) cVar.f507e) == null) {
            cVar.f507e = new C0705c(0);
        }
        ((C0705c) cVar.f507e).addAll(setEmptySet);
        Context context = this.f2854a;
        cVar.f508g = context.getClass().getName();
        cVar.f = context.getPackageName();
        return cVar;
    }

    public final n b(int i5, E0.d dVar) {
        i iVar = new i();
        C0099g c0099g = this.f2859g;
        c0099g.getClass();
        r rVar = new r(dVar, iVar, this.f);
        R1 r12 = c0099g.f2962i;
        r12.sendMessage(r12.obtainMessage(4, new o(rVar, c0099g.f.get(), this)));
        return iVar.f8959a;
    }
}
