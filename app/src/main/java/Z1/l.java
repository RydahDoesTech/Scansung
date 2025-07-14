package Z1;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f2877b = new l();

    /* renamed from: a, reason: collision with root package name */
    public final g f2878a;

    public l() {
        g gVar = g.f2871b;
        if (o.f2884b == null) {
            o.f2884b = new o();
        }
        this.f2878a = gVar;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f5238e);
        editorEdit.putString("statusMessage", status.f);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }
}
