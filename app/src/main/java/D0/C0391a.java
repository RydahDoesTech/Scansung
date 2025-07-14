package d0;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.H;
import androidx.picker.widget.HandlerC0165c;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391a {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6394e = new Object();
    public static C0391a f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6395a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6396b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6397c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6398d = new ArrayList();

    public C0391a(Context context) {
        this.f6395a = context;
        new HandlerC0165c(this, context.getMainLooper(), 2);
    }

    public static C0391a a(H h3) {
        C0391a c0391a;
        synchronized (f6394e) {
            try {
                if (f == null) {
                    f = new C0391a(h3.getApplicationContext());
                }
                c0391a = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0391a;
    }

    public final void b(Intent intent) {
        synchronized (this.f6396b) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6395a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z4 = (intent.getFlags() & 8) != 0;
                if (z4) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f6397c.get(intent.getAction());
                if (arrayList != null) {
                    if (z4) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        }
                        if (!z4) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
