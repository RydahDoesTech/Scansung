package Y0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.databinding.r;
import androidx.databinding.u;
import androidx.databinding.v;
import androidx.databinding.w;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.q;
import com.wssyncmldm.R;
import g3.y;
import h0.InterfaceC0471b;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class h implements I2.c, M0.b, S0.a, androidx.databinding.d, q, InterfaceC0471b {

    /* renamed from: e, reason: collision with root package name */
    public static h f2821e;
    public static ExecutorService f;

    /* renamed from: g, reason: collision with root package name */
    public static h f2822g;

    /* renamed from: h, reason: collision with root package name */
    public static h f2823h;

    /* renamed from: i, reason: collision with root package name */
    public static h f2824i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2825d;

    public /* synthetic */ h(int i5) {
        this.f2825d = i5;
    }

    public static h c(Context context, int i5) throws Resources.NotFoundException {
        y.f("Cannot create a CalendarItemStyle with a styleResId of 0", i5 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, u1.a.f9170o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        V1.a.z(context, typedArrayObtainStyledAttributes, 4);
        V1.a.z(context, typedArrayObtainStyledAttributes, 9);
        V1.a.z(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        O1.k.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new O1.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        h hVar = new h(12);
        y.g(rect.left);
        y.g(rect.top);
        y.g(rect.right);
        y.g(rect.bottom);
        return hVar;
    }

    public static h f() {
        if (f2822g == null) {
            h hVar = new h(2);
            f = Executors.newSingleThreadExecutor(new G.k(1));
            f2822g = hVar;
        }
        return f2822g;
    }

    public static Path g(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f7, f8);
        return path;
    }

    public static boolean h(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.signatures == null) {
            return false;
        }
        k[] kVarArr = n.f2835a;
        Signature[] signatureArr = packageInfo.signatures;
        k kVar = null;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            } else {
                int i5 = 0;
                l lVar = new l(packageInfo.signatures[0].toByteArray());
                while (true) {
                    if (i5 >= kVarArr.length) {
                        break;
                    }
                    if (kVarArr[i5].equals(lVar)) {
                        kVar = kVarArr[i5];
                        break;
                    }
                    i5++;
                }
            }
        }
        return kVar != null;
    }

    @Override // S0.a
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.preference.q
    public CharSequence b(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f4535f0) ? editTextPreference.f4601d.getString(R.string.not_set) : editTextPreference.f4535f0;
    }

    @Override // androidx.databinding.d
    public w d(v vVar, int i5, ReferenceQueue referenceQueue) {
        switch (this.f2825d) {
            case 8:
                return new u(vVar, i5, referenceQueue).f3637a;
            default:
                return new r(vVar, i5, referenceQueue).f3633a;
        }
    }

    public void e(I2.b bVar) {
        f.submit(new A1.h(2, bVar));
    }

    @Override // N2.a
    public Object get() {
        b4.d dVar = new b4.d();
        HashMap map = new HashMap();
        H0.c cVar = H0.c.f806d;
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar, new P0.c(30000L, 86400000L, setEmptySet));
        H0.c cVar2 = H0.c.f;
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar2, new P0.c(1000L, 86400000L, setEmptySet2));
        H0.c cVar3 = H0.c.f807e;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(P0.e.f2118d, P0.e.f2119e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar3, new P0.c(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < H0.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new P0.b(dVar, map);
    }

    @Override // h0.InterfaceC0471b
    public void j(int i5, Serializable serializable) {
    }
}
