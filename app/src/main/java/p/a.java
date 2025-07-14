package P;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import k.s1;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f2101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s1 s1Var) {
        super(new Handler());
        this.f2101a = s1Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        s1 s1Var = this.f2101a;
        if (!s1Var.f2103e || (cursor = s1Var.f) == null || cursor.isClosed()) {
            return;
        }
        s1Var.f2102d = s1Var.f.requery();
    }
}
