package androidx.preference;

import j0.AbstractC0510A;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Preference f4686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4687e;
    public final /* synthetic */ z f;

    public w(z zVar, Preference preference, String str) {
        this.f = zVar;
        this.f4686d = preference;
        this.f4687e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f;
        AbstractC0510A adapter = zVar.mList.getAdapter();
        if (!(adapter instanceof D)) {
            if (adapter != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f4687e;
        Preference preference = this.f4686d;
        int iL = preference != null ? ((D) adapter).l(preference) : ((D) adapter).m(str);
        if (iL != -1) {
            zVar.mList.v0(iL);
        } else {
            adapter.f7050a.registerObserver(new y((D) adapter, zVar.mList, preference, str));
        }
    }
}
