package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.idm.providers.mo.IDMMoInterface;
import com.samsung.android.knox.ex.KnoxContract;
import h0.ExecutorC0470a;
import java.util.HashSet;
import l.C0677a;
import o.C0714l;
import u0.AbstractC0877a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4907a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4908b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4909c;

    /* renamed from: d, reason: collision with root package name */
    public ExecutorC0470a f4910d;

    /* renamed from: e, reason: collision with root package name */
    public b4.d f4911e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4912g;

    /* renamed from: h, reason: collision with root package name */
    public HashSet f4913h;

    public h(Context context, Class cls, String str) {
        this.f4909c = context;
        this.f4907a = cls;
        this.f4908b = str;
        i iVar = new i();
        iVar.f4914a = new C0714l();
        this.f4912g = iVar;
    }

    public final void a(AbstractC0877a... abstractC0877aArr) {
        if (this.f4913h == null) {
            this.f4913h = new HashSet();
        }
        for (AbstractC0877a abstractC0877a : abstractC0877aArr) {
            this.f4913h.add(Integer.valueOf(abstractC0877a.startVersion));
            this.f4913h.add(Integer.valueOf(abstractC0877a.endVersion));
        }
        i iVar = this.f4912g;
        iVar.getClass();
        for (AbstractC0877a abstractC0877a2 : abstractC0877aArr) {
            int i5 = abstractC0877a2.startVersion;
            int i6 = abstractC0877a2.endVersion;
            C0714l c0714l = iVar.f4914a;
            C0714l c0714l2 = (C0714l) c0714l.a(i5, null);
            if (c0714l2 == null) {
                c0714l2 = new C0714l();
                c0714l.b(i5, c0714l2);
            }
            AbstractC0877a abstractC0877a3 = (AbstractC0877a) c0714l2.a(i6, null);
            if (abstractC0877a3 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC0877a3 + " with " + abstractC0877a2);
            }
            int i7 = c0714l2.f;
            if (i7 == 0 || i6 > c0714l2.f8239d[i7 - 1]) {
                if (i7 >= c0714l2.f8239d.length) {
                    int i8 = (i7 + 1) * 4;
                    int i9 = 4;
                    while (true) {
                        if (i9 >= 32) {
                            break;
                        }
                        int i10 = (1 << i9) - 12;
                        if (i8 <= i10) {
                            i8 = i10;
                            break;
                        }
                        i9++;
                    }
                    int i11 = i8 / 4;
                    int[] iArr = new int[i11];
                    Object[] objArr = new Object[i11];
                    int[] iArr2 = c0714l2.f8239d;
                    System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                    Object[] objArr2 = c0714l2.f8240e;
                    System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                    c0714l2.f8239d = iArr;
                    c0714l2.f8240e = objArr;
                }
                c0714l2.f8239d[i7] = i6;
                c0714l2.f8240e[i7] = abstractC0877a2;
                c0714l2.f = i7 + 1;
            } else {
                c0714l2.b(i6, abstractC0877a2);
            }
        }
    }

    public final j b() {
        String str;
        Context context = this.f4909c;
        if (context == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Class cls = this.f4907a;
        if (cls == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        if (this.f4910d == null) {
            this.f4910d = C0677a.f8004e;
        }
        if (this.f4911e == null) {
            this.f4911e = new b4.d();
        }
        b4.d dVar = this.f4911e;
        boolean z4 = this.f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY);
        a aVar = new a(context, this.f4908b, dVar, this.f4912g, z4, (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3, this.f4910d);
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str2 = canonicalName.replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str2;
            } else {
                str = name + IDMMoInterface.IDM_MO_ROOT_PATH + str2;
            }
            j jVar = (j) Class.forName(str).newInstance();
            jVar.init(aVar);
            return jVar;
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
