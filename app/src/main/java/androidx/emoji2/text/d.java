package androidx.emoji2.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends Y0.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f3646c;

    public d(e eVar) {
        super(19);
        this.f3646c = eVar;
    }

    @Override // Y0.j
    public final void D(Throwable th) {
        this.f3646c.f3647a.d(th);
    }

    @Override // Y0.j
    public final void G(com.google.firebase.messaging.q qVar) {
        e eVar = this.f3646c;
        eVar.f3649c = qVar;
        eVar.f3648b = new E0.d(eVar.f3649c, new b4.d(), eVar.f3647a.f3661h);
        i iVar = eVar.f3647a;
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        iVar.f3655a.writeLock().lock();
        try {
            iVar.f3657c = 1;
            arrayList.addAll(iVar.f3656b);
            iVar.f3656b.clear();
            iVar.f3655a.writeLock().unlock();
            iVar.f3658d.post(new G.b(arrayList, iVar.f3657c, (Throwable) null));
        } catch (Throwable th) {
            iVar.f3655a.writeLock().unlock();
            throw th;
        }
    }
}
