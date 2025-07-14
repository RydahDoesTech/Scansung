package k;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.wssyncmldm.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.AbstractC0706d;
import o.C0707e;
import z.AbstractC0938a;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: e, reason: collision with root package name */
    public static D0 f7481e;

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f7482a = new WeakHashMap(0);

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f7483b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7484c;

    /* renamed from: d, reason: collision with root package name */
    public static final PorterDuff.Mode f7480d = PorterDuff.Mode.SRC_IN;
    public static final C0 f = new C0(6);

    public static synchronized D0 a() {
        try {
            if (f7481e == null) {
                f7481e = new D0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7481e;
    }

    public static synchronized PorterDuffColorFilter e(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0 c02 = f;
        c02.getClass();
        int i6 = (31 + i5) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c02.a(Integer.valueOf(mode.hashCode() + i6));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i5, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized Drawable b(Context context, long j5) {
        C0707e c0707e = (C0707e) this.f7482a.get(context);
        if (c0707e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0707e.c(j5, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = AbstractC0706d.b(c0707e.f8215e, c0707e.f8216g, j5);
            if (iB >= 0) {
                Object[] objArr = c0707e.f;
                Object obj = objArr[iB];
                Object obj2 = C0707e.f8213h;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    c0707e.f8214d = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable c(Context context, int i5) {
        return d(context, i5, false);
    }

    public final synchronized Drawable d(Context context, int i5, boolean z4) {
        Drawable drawableB;
        if (!this.f7484c) {
            this.f7484c = true;
            Drawable drawableC = c(context, R.drawable.abc_vector_test);
            if (drawableC == null || (!(drawableC instanceof C0.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                this.f7484c = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        if (this.f7483b == null) {
            this.f7483b = new TypedValue();
        }
        context.getResources().getValue(i5, this.f7483b, true);
        drawableB = b(context, (r0.assetCookie << 32) | r0.data);
        Drawable drawable = null;
        if (drawableB == null) {
            drawableB = null;
        }
        if (drawableB == null) {
            drawableB = AbstractC0938a.b(context, i5);
        }
        if (drawableB != null) {
            synchronized (this) {
                if (!z4) {
                    drawable = drawableB;
                }
                drawableB = drawable;
            }
        }
        if (drawableB != null) {
            Rect rect = AbstractC0622g0.f7667a;
        }
        return drawableB;
    }
}
