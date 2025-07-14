package E2;

import android.content.Context;
import com.idm.providers.mo.IDMMoDatabaseHelper;
import com.idm.providers.mo.IDMMoDatabaseImpl;
import com.idm.providers.mo.IDMMoDatabaseManager;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f614b;

    public /* synthetic */ a(Context context, int i5) {
        this.f613a = i5;
        this.f614b = context;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i5 = this.f613a;
        Context context = this.f614b;
        switch (i5) {
            case 0:
                return IDMMoDatabaseHelper.lambda$getInstance$0(context);
            case 1:
                return IDMMoDatabaseImpl.lambda$getInstance$0(context);
            default:
                return IDMMoDatabaseManager.lambda$getInstance$0(context);
        }
    }
}
