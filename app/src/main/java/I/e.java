package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class e extends ContextWrapper {
    public static Configuration f;

    /* renamed from: a, reason: collision with root package name */
    public int f6862a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f6863b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f6864c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f6865d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f6866e;

    public e(Context context, int i5) {
        super(context);
        this.f6862a = i5;
    }

    public final void a(Configuration configuration) {
        if (this.f6866e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f6865d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f6865d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f6863b == null) {
            this.f6863b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f6863b.setTo(theme);
            }
        }
        this.f6863b.applyStyle(this.f6862a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f6866e
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f6865d
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = i.e.f
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            i.e.f = r1
        L16:
            android.content.res.Configuration r1 = i.e.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f6865d
            android.content.Context r0 = i.AbstractC0478d.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f6866e = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f6866e = r0
        L32:
            android.content.res.Resources r3 = r3.f6866e
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f6864c == null) {
            this.f6864c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f6864c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f6863b;
        if (theme != null) {
            return theme;
        }
        if (this.f6862a == 0) {
            this.f6862a = 2132017924;
        }
        b();
        return this.f6863b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i5) {
        if (this.f6862a != i5) {
            this.f6862a = i5;
            b();
        }
    }
}
