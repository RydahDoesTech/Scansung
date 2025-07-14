package e;

import J.Z;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import c.AbstractC0220a;
import com.google.android.gms.internal.p000firebaseauthapi.P3;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import i.AbstractC0476b;
import j.C0488e;
import j.InterfaceC0490g;
import j.MenuC0492i;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.C0618f;
import k.C0633k;
import k.C0651s;
import k.I1;
import k.InterfaceC0613d0;
import k.M1;
import o.C0713k;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public final class B extends r implements InterfaceC0490g, LayoutInflater.Factory2 {
    public static final C0713k l0 = new C0713k();
    public static final int[] m0 = {R.attr.windowBackground};
    public static final boolean n0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean o0 = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f6436A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f6437B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f6438C;

    /* renamed from: D, reason: collision with root package name */
    public View f6439D;
    public boolean E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6440F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6441G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6442H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f6443I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f6444J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f6445K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f6446L;

    /* renamed from: M, reason: collision with root package name */
    public A[] f6447M;

    /* renamed from: N, reason: collision with root package name */
    public A f6448N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f6449O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6450Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f6451R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f6452T;

    /* renamed from: U, reason: collision with root package name */
    public Configuration f6453U;

    /* renamed from: V, reason: collision with root package name */
    public final int f6454V;

    /* renamed from: W, reason: collision with root package name */
    public int f6455W;

    /* renamed from: X, reason: collision with root package name */
    public int f6456X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f6457Y;

    /* renamed from: Z, reason: collision with root package name */
    public y f6458Z;

    /* renamed from: a0, reason: collision with root package name */
    public y f6459a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6460b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f6461c0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6463e0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f6464f0;
    public Rect g0;

    /* renamed from: h0, reason: collision with root package name */
    public E f6465h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedDispatcher f6466i0;

    /* renamed from: j0, reason: collision with root package name */
    public OnBackInvokedCallback f6467j0;

    /* renamed from: k, reason: collision with root package name */
    public final Object f6468k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f6469l;

    /* renamed from: m, reason: collision with root package name */
    public Window f6470m;
    public x n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6471o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0398a f6472p;

    /* renamed from: q, reason: collision with root package name */
    public i.j f6473q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f6474r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0613d0 f6475s;

    /* renamed from: t, reason: collision with root package name */
    public t f6476t;

    /* renamed from: u, reason: collision with root package name */
    public t f6477u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0476b f6478v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContextView f6479w;

    /* renamed from: x, reason: collision with root package name */
    public PopupWindow f6480x;

    /* renamed from: y, reason: collision with root package name */
    public s f6481y;

    /* renamed from: z, reason: collision with root package name */
    public Z f6482z = null;

    /* renamed from: d0, reason: collision with root package name */
    public final s f6462d0 = new s(this, 0);
    public boolean k0 = false;

    public B(Context context, Window window, InterfaceC0412o interfaceC0412o, Object obj) {
        AbstractActivityC0411n abstractActivityC0411n;
        this.f6454V = -100;
        this.f6469l = context;
        this.f6471o = interfaceC0412o;
        this.f6468k = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0411n)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0411n = (AbstractActivityC0411n) context;
                    break;
                }
            }
            abstractActivityC0411n = null;
            if (abstractActivityC0411n != null) {
                this.f6454V = ((B) abstractActivityC0411n.getDelegate()).f6454V;
            }
        }
        if (this.f6454V == -100) {
            C0713k c0713k = l0;
            Integer num = (Integer) c0713k.getOrDefault(this.f6468k.getClass().getName(), null);
            if (num != null) {
                this.f6454V = num.intValue();
                c0713k.remove(this.f6468k.getClass().getName());
            }
        }
        if (window != null) {
            q(window);
        }
        C0651s.c();
    }

    public static Configuration u(Context context, int i5, Configuration configuration, boolean z4) {
        int i6 = i5 != 1 ? i5 != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i6 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final A A(int i5) {
        A[] aArr = this.f6447M;
        if (aArr == null || aArr.length <= i5) {
            A[] aArr2 = new A[i5 + 1];
            if (aArr != null) {
                System.arraycopy(aArr, 0, aArr2, 0, aArr.length);
            }
            this.f6447M = aArr2;
            aArr = aArr2;
        }
        A a5 = aArr[i5];
        if (a5 != null) {
            return a5;
        }
        A a6 = new A();
        a6.f6422a = i5;
        a6.n = false;
        aArr[i5] = a6;
        return a6;
    }

    public final void B() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        if (this.f6441G && this.f6472p == null) {
            Object obj = this.f6468k;
            if (obj instanceof Activity) {
                this.f6472p = new P((Activity) obj, this.f6442H);
            } else if (obj instanceof Dialog) {
                this.f6472p = new P((Dialog) obj);
            }
            AbstractC0398a abstractC0398a = this.f6472p;
            if (abstractC0398a != null) {
                abstractC0398a.l(this.f6463e0);
            }
        }
    }

    public final void C(int i5) {
        this.f6461c0 = (1 << i5) | this.f6461c0;
        if (this.f6460b0) {
            return;
        }
        View decorView = this.f6470m.getDecorView();
        s sVar = this.f6462d0;
        WeakHashMap weakHashMap = J.P.f1421a;
        decorView.postOnAnimation(sVar);
        this.f6460b0 = true;
    }

    public final int D(Context context, int i5) {
        if (i5 == -100) {
            return -1;
        }
        if (i5 != -1) {
            if (i5 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService(IDMDatabaseInterface.IDM_DB_NOTIINFO_UIMODE)).getNightMode() == 0) {
                    return -1;
                }
                return z(context).f();
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f6459a0 == null) {
                    this.f6459a0 = new y(this, context);
                }
                return this.f6459a0.f();
            }
        }
        return i5;
    }

    public final boolean E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z4 = this.f6449O;
        this.f6449O = false;
        A A4 = A(0);
        if (A4.f6433m) {
            if (!z4) {
                t(A4, true);
            }
            return true;
        }
        AbstractC0476b abstractC0476b = this.f6478v;
        if (abstractC0476b != null) {
            abstractC0476b.a();
            return true;
        }
        B();
        AbstractC0398a abstractC0398a = this.f6472p;
        return abstractC0398a != null && abstractC0398a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r3.f6946i.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(e.A r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.F(e.A, android.view.KeyEvent):void");
    }

    public final boolean G(A a5, int i5, KeyEvent keyEvent) {
        MenuC0492i menuC0492i;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((a5.f6431k || H(a5, keyEvent)) && (menuC0492i = a5.f6428h) != null) {
            return menuC0492i.performShortcut(i5, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(A a5, KeyEvent keyEvent) {
        InterfaceC0613d0 interfaceC0613d0;
        InterfaceC0613d0 interfaceC0613d02;
        Resources.Theme themeNewTheme;
        InterfaceC0613d0 interfaceC0613d03;
        InterfaceC0613d0 interfaceC0613d04;
        if (this.f6452T) {
            return false;
        }
        if (a5.f6431k) {
            return true;
        }
        A a6 = this.f6448N;
        if (a6 != null && a6 != a5) {
            t(a6, false);
        }
        Window.Callback callback = this.f6470m.getCallback();
        int i5 = a5.f6422a;
        if (callback != null) {
            a5.f6427g = callback.onCreatePanelView(i5);
        }
        boolean z4 = i5 == 0 || i5 == 108;
        if (z4 && (interfaceC0613d04 = this.f6475s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0613d04;
            actionBarOverlayLayout.k();
            ((I1) actionBarOverlayLayout.f3264h).f7517l = true;
        }
        if (a5.f6427g == null && (!z4 || !(this.f6472p instanceof K))) {
            MenuC0492i menuC0492i = a5.f6428h;
            if (menuC0492i == null || a5.f6434o) {
                if (menuC0492i == null) {
                    Context context = this.f6469l;
                    if ((i5 == 0 || i5 == 108) && this.f6475s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.wssyncmldm.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.wssyncmldm.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.wssyncmldm.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            i.e eVar = new i.e(context, 0);
                            eVar.getTheme().setTo(themeNewTheme);
                            context = eVar;
                        }
                    }
                    MenuC0492i menuC0492i2 = new MenuC0492i(context);
                    menuC0492i2.f6959e = this;
                    MenuC0492i menuC0492i3 = a5.f6428h;
                    if (menuC0492i2 != menuC0492i3) {
                        if (menuC0492i3 != null) {
                            menuC0492i3.r(a5.f6429i);
                        }
                        a5.f6428h = menuC0492i2;
                        C0488e c0488e = a5.f6429i;
                        if (c0488e != null) {
                            menuC0492i2.b(c0488e, menuC0492i2.f6955a);
                        }
                    }
                    if (a5.f6428h == null) {
                        return false;
                    }
                }
                if (z4 && (interfaceC0613d02 = this.f6475s) != null) {
                    if (this.f6476t == null) {
                        this.f6476t = new t(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0613d02).l(a5.f6428h, this.f6476t);
                }
                a5.f6428h.w();
                if (!callback.onCreatePanelMenu(i5, a5.f6428h)) {
                    MenuC0492i menuC0492i4 = a5.f6428h;
                    if (menuC0492i4 != null) {
                        if (menuC0492i4 != null) {
                            menuC0492i4.r(a5.f6429i);
                        }
                        a5.f6428h = null;
                    }
                    if (z4 && (interfaceC0613d0 = this.f6475s) != null) {
                        ((ActionBarOverlayLayout) interfaceC0613d0).l(null, this.f6476t);
                    }
                    return false;
                }
                a5.f6434o = false;
            }
            a5.f6428h.w();
            Bundle bundle = a5.f6435p;
            if (bundle != null) {
                a5.f6428h.s(bundle);
                a5.f6435p = null;
            }
            if (!callback.onPreparePanel(0, a5.f6427g, a5.f6428h)) {
                if (z4 && (interfaceC0613d03 = this.f6475s) != null) {
                    ((ActionBarOverlayLayout) interfaceC0613d03).l(null, this.f6476t);
                }
                a5.f6428h.v();
                return false;
            }
            a5.f6428h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            a5.f6428h.v();
        }
        a5.f6431k = true;
        a5.f6432l = false;
        this.f6448N = a5;
        return true;
    }

    public final void I() {
        if (this.f6436A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        boolean z4 = false;
        if (this.f6466i0 != null && (A(0).f6433m || this.f6478v != null)) {
            z4 = true;
        }
        if (z4 && this.f6467j0 == null) {
            this.f6467j0 = w.b(this.f6466i0, this);
        } else {
            if (z4 || (onBackInvokedCallback = this.f6467j0) == null) {
                return;
            }
            w.c(this.f6466i0, onBackInvokedCallback);
        }
    }

    @Override // e.r
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f6469l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof B) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // e.r
    public final void b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f6472p != null) {
            B();
            if (this.f6472p.f()) {
                return;
            }
            C(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // j.InterfaceC0490g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(j.MenuC0492i r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            k.d0 r6 = r5.f6475s
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.e0 r6 = r6.f3264h
            k.I1 r6 = (k.I1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f7507a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f3495d
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f3296v
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f6469l
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            k.d0 r6 = r5.f6475s
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.e0 r6 = r6.f3264h
            k.I1 r6 = (k.I1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f7507a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f3495d
            if (r6 == 0) goto Ld3
            k.k r6 = r6.f3297w
            if (r6 == 0) goto Ld3
            G.a r2 = r6.f7709x
            if (r2 != 0) goto L4a
            boolean r6 = r6.j()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f6470m
            android.view.Window$Callback r6 = r6.getCallback()
            k.d0 r2 = r5.f6475s
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            k.e0 r2 = r2.f3264h
            k.I1 r2 = (k.I1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f7507a
            boolean r2 = r2.q()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            k.d0 r0 = r5.f6475s
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            k.e0 r0 = r0.f3264h
            k.I1 r0 = (k.I1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f7507a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f3495d
            if (r0 == 0) goto L7e
            k.k r0 = r0.f3297w
            if (r0 == 0) goto L7e
            boolean r0 = r0.i()
        L7e:
            boolean r0 = r5.f6452T
            if (r0 != 0) goto Le0
            e.A r5 = r5.A(r1)
            j.i r5 = r5.f6428h
            r6.onPanelClosed(r3, r5)
            goto Le0
        L8c:
            if (r6 == 0) goto Le0
            boolean r2 = r5.f6452T
            if (r2 != 0) goto Le0
            boolean r2 = r5.f6460b0
            if (r2 == 0) goto La9
            int r2 = r5.f6461c0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f6470m
            android.view.View r0 = r0.getDecorView()
            e.s r2 = r5.f6462d0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            e.A r0 = r5.A(r1)
            j.i r2 = r0.f6428h
            if (r2 == 0) goto Le0
            boolean r4 = r0.f6434o
            if (r4 != 0) goto Le0
            android.view.View r4 = r0.f6427g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le0
            j.i r0 = r0.f6428h
            r6.onMenuOpened(r3, r0)
            k.d0 r5 = r5.f6475s
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.k()
            k.e0 r5 = r5.f3264h
            k.I1 r5 = (k.I1) r5
            androidx.appcompat.widget.Toolbar r5 = r5.f7507a
            r5.w()
            goto Le0
        Ld3:
            e.A r6 = r5.A(r1)
            r6.n = r0
            r5.t(r6, r1)
            r0 = 0
            r5.F(r6, r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.c(j.i):void");
    }

    @Override // j.InterfaceC0490g
    public final boolean d(MenuC0492i menuC0492i, MenuItem menuItem) {
        A a5;
        Window.Callback callback = this.f6470m.getCallback();
        if (callback != null && !this.f6452T) {
            MenuC0492i menuC0492iK = menuC0492i.k();
            A[] aArr = this.f6447M;
            int length = aArr != null ? aArr.length : 0;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    a5 = aArr[i5];
                    if (a5 != null && a5.f6428h == menuC0492iK) {
                        break;
                    }
                    i5++;
                } else {
                    a5 = null;
                    break;
                }
            }
            if (a5 != null) {
                return callback.onMenuItemSelected(a5.f6422a, menuItem);
            }
        }
        return false;
    }

    @Override // e.r
    public final void f() throws PackageManager.NameNotFoundException {
        String strF;
        this.f6450Q = true;
        p(false);
        y();
        Object obj = this.f6468k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strF = AbstractC0808b.f(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new IllegalArgumentException(e5);
                }
            } catch (IllegalArgumentException unused) {
                strF = null;
            }
            if (strF != null) {
                AbstractC0398a abstractC0398a = this.f6472p;
                if (abstractC0398a == null) {
                    this.f6463e0 = true;
                } else {
                    abstractC0398a.l(true);
                }
            }
            synchronized (r.f6613i) {
                r.i(this);
                r.f6612h.add(new WeakReference(this));
            }
        }
        this.f6453U = new Configuration(this.f6469l.getResources().getConfiguration());
        this.f6451R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // e.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6468k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = e.r.f6613i
            monitor-enter(r0)
            e.r.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f6460b0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f6470m
            android.view.View r0 = r0.getDecorView()
            e.s r1 = r3.f6462d0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f6452T = r0
            int r0 = r3.f6454V
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f6468k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            o.k r0 = e.B.l0
            java.lang.Object r1 = r3.f6468k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6454V
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            o.k r0 = e.B.l0
            java.lang.Object r1 = r3.f6468k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.a r0 = r3.f6472p
            if (r0 == 0) goto L63
            r0.h()
        L63:
            e.y r0 = r3.f6458Z
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            e.y r3 = r3.f6459a0
            if (r3 == 0) goto L71
            r3.d()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.g():void");
    }

    @Override // e.r
    public final void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        AbstractC0398a abstractC0398a = this.f6472p;
        if (abstractC0398a != null) {
            abstractC0398a.n(false);
        }
        A[] aArr = this.f6447M;
        int length = aArr != null ? aArr.length : 0;
        for (int i5 = 0; i5 < length; i5++) {
            A a5 = aArr[i5];
            if (a5 != null) {
                t(a5, true);
            }
        }
    }

    @Override // e.r
    public final boolean j(int i5) {
        if (i5 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i5 = 108;
        } else if (i5 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i5 = 109;
        }
        if (this.f6445K && i5 == 108) {
            return false;
        }
        if (this.f6441G && i5 == 1) {
            this.f6441G = false;
        }
        if (i5 == 1) {
            I();
            this.f6445K = true;
            return true;
        }
        if (i5 == 2) {
            I();
            this.E = true;
            return true;
        }
        if (i5 == 5) {
            I();
            this.f6440F = true;
            return true;
        }
        if (i5 == 10) {
            I();
            this.f6443I = true;
            return true;
        }
        if (i5 == 108) {
            I();
            this.f6441G = true;
            return true;
        }
        if (i5 != 109) {
            return this.f6470m.requestFeature(i5);
        }
        I();
        this.f6442H = true;
        return true;
    }

    @Override // e.r
    public final void k(int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f6437B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6469l).inflate(i5, viewGroup);
        this.n.a(this.f6470m.getCallback());
    }

    @Override // e.r
    public final void l(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f6437B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n.a(this.f6470m.getCallback());
    }

    @Override // e.r
    public final void m(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f6437B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n.a(this.f6470m.getCallback());
    }

    @Override // e.r
    public final void n(CharSequence charSequence) {
        this.f6474r = charSequence;
        InterfaceC0613d0 interfaceC0613d0 = this.f6475s;
        if (interfaceC0613d0 != null) {
            interfaceC0613d0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0398a abstractC0398a = this.f6472p;
        if (abstractC0398a != null) {
            abstractC0398a.o(charSequence);
            return;
        }
        TextView textView = this.f6438C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2  */
    /* JADX WARN: Type inference failed for: r2v0, types: [e.o, java.lang.Object] */
    @Override // e.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i.AbstractC0476b o(i.InterfaceC0475a r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.o(i.a):i.b");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(boolean r29) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.p(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f6470m
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L7a
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof e.x
            if (r2 != 0) goto L74
            e.x r1 = new e.x
            r1.<init>(r7, r0)
            r7.n = r1
            r8.setCallback(r1)
            int[] r0 = e.B.m0
            android.content.Context r1 = r7.f6469l
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            k.s r4 = k.C0651s.a()
            monitor-enter(r4)
            k.D0 r5 = r4.f7796a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.d(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f6470m = r8
            android.window.OnBackInvokedDispatcher r8 = r7.f6466i0
            if (r8 != 0) goto L73
            if (r8 == 0) goto L59
            android.window.OnBackInvokedCallback r0 = r7.f6467j0
            if (r0 == 0) goto L59
            e.w.c(r8, r0)
            r7.f6467j0 = r2
        L59:
            java.lang.Object r8 = r7.f6468k
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L6e
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L6e
            android.window.OnBackInvokedDispatcher r8 = e.w.a(r8)
            r7.f6466i0 = r8
            goto L70
        L6e:
            r7.f6466i0 = r2
        L70:
            r7.J()
        L73:
            return
        L74:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
            throw r7
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.q(android.view.Window):void");
    }

    public final void r(int i5, A a5, MenuC0492i menuC0492i) {
        if (menuC0492i == null) {
            if (a5 == null && i5 >= 0) {
                A[] aArr = this.f6447M;
                if (i5 < aArr.length) {
                    a5 = aArr[i5];
                }
            }
            if (a5 != null) {
                menuC0492i = a5.f6428h;
            }
        }
        if ((a5 == null || a5.f6433m) && !this.f6452T) {
            x xVar = this.n;
            Window.Callback callback = this.f6470m.getCallback();
            xVar.getClass();
            try {
                xVar.f6624h = true;
                callback.onPanelClosed(i5, menuC0492i);
            } finally {
                xVar.f6624h = false;
            }
        }
    }

    public final void s(MenuC0492i menuC0492i) {
        C0633k c0633k;
        if (this.f6446L) {
            return;
        }
        this.f6446L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6475s;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((I1) actionBarOverlayLayout.f3264h).f7507a.f3495d;
        if (actionMenuView != null && (c0633k = actionMenuView.f3297w) != null) {
            c0633k.i();
            C0618f c0618f = c0633k.f7708w;
            if (c0618f != null && c0618f.b()) {
                c0618f.f7024i.dismiss();
            }
        }
        Window.Callback callback = this.f6470m.getCallback();
        if (callback != null && !this.f6452T) {
            callback.onPanelClosed(108, menuC0492i);
        }
        this.f6446L = false;
    }

    public final void t(A a5, boolean z4) {
        z zVar;
        InterfaceC0613d0 interfaceC0613d0;
        if (z4 && a5.f6422a == 0 && (interfaceC0613d0 = this.f6475s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0613d0;
            actionBarOverlayLayout.k();
            if (((I1) actionBarOverlayLayout.f3264h).f7507a.q()) {
                s(a5.f6428h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6469l.getSystemService("window");
        if (windowManager != null && a5.f6433m && (zVar = a5.f6426e) != null) {
            if (zVar.isAttachedToWindow()) {
                windowManager.removeView(a5.f6426e);
            }
            if (z4) {
                r(a5.f6422a, a5, null);
            }
        }
        a5.f6431k = false;
        a5.f6432l = false;
        a5.f6433m = false;
        a5.f = null;
        a5.n = true;
        if (this.f6448N == a5) {
            this.f6448N = null;
        }
        if (a5.f6422a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.B.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i5) {
        A A4 = A(i5);
        if (A4.f6428h != null) {
            Bundle bundle = new Bundle();
            A4.f6428h.t(bundle);
            if (bundle.size() > 0) {
                A4.f6435p = bundle;
            }
            A4.f6428h.w();
            A4.f6428h.clear();
        }
        A4.f6434o = true;
        A4.n = true;
        if ((i5 == 108 || i5 == 0) && this.f6475s != null) {
            A A5 = A(0);
            A5.f6431k = false;
            H(A5, null);
        }
    }

    public final void x() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i5 = 1;
        int i6 = 0;
        if (this.f6436A) {
            return;
        }
        int[] iArr = AbstractC0220a.f5120j;
        Context context = this.f6469l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(145)) {
            typedArrayObtainStyledAttributes.recycle();
            Log.e("AppCompatDelegate", "createSubDecor: mContext = " + context);
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(154, false)) {
            j(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(145, false)) {
            j(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(146, false)) {
            j(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(147, false)) {
            j(10);
        }
        this.f6444J = typedArrayObtainStyledAttributes.getBoolean(1, false);
        if (typedArrayObtainStyledAttributes.hasValue(86)) {
            this.k0 = typedArrayObtainStyledAttributes.getBoolean(86, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.f6470m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f6445K) {
            viewGroup = this.f6443I ? (ViewGroup) layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_screen_simple, (ViewGroup) null);
        } else if (this.f6444J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_dialog_title, (ViewGroup) null);
            this.f6442H = false;
            this.f6441G = false;
        } else if (this.f6441G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.wssyncmldm.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.e(context, typedValue.resourceId) : context).inflate(com.wssyncmldm.R.layout.sesl_screen_toolbar, (ViewGroup) null);
            InterfaceC0613d0 interfaceC0613d0 = (InterfaceC0613d0) viewGroup.findViewById(com.wssyncmldm.R.id.decor_content_parent);
            this.f6475s = interfaceC0613d0;
            interfaceC0613d0.setWindowCallback(this.f6470m.getCallback());
            if (this.f6442H) {
                ((ActionBarOverlayLayout) this.f6475s).j(109);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f6475s).j(2);
            }
            if (this.f6440F) {
                ((ActionBarOverlayLayout) this.f6475s).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6441G + ", windowActionBarOverlay: " + this.f6442H + ", android:windowIsFloating: " + this.f6444J + ", windowActionModeOverlay: " + this.f6443I + ", windowNoTitle: " + this.f6445K + " }");
        }
        t tVar = new t(this, i6);
        WeakHashMap weakHashMap = J.P.f1421a;
        J.H.u(viewGroup, tVar);
        if (this.f6475s == null) {
            this.f6438C = (TextView) viewGroup.findViewById(com.wssyncmldm.R.id.title);
        }
        Method method = M1.f7533a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.wssyncmldm.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6470m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6470m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new t(this, i5));
        this.f6437B = viewGroup;
        Object obj = this.f6468k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6474r;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0613d0 interfaceC0613d02 = this.f6475s;
            if (interfaceC0613d02 != null) {
                interfaceC0613d02.setWindowTitle(title);
            } else {
                AbstractC0398a abstractC0398a = this.f6472p;
                if (abstractC0398a != null) {
                    abstractC0398a.o(title);
                } else {
                    TextView textView = this.f6438C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f6437B.findViewById(R.id.content);
        View decorView = this.f6470m.getDecorView();
        contentFrameLayout2.f3328j.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = J.P.f1421a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(152, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(153, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(150)) {
            typedArrayObtainStyledAttributes2.getValue(150, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(151)) {
            typedArrayObtainStyledAttributes2.getValue(151, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(148)) {
            typedArrayObtainStyledAttributes2.getValue(148, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(149)) {
            typedArrayObtainStyledAttributes2.getValue(149, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f6436A = true;
        A A4 = A(0);
        if (this.f6452T || A4.f6428h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f6470m == null) {
            Object obj = this.f6468k;
            if (obj instanceof Activity) {
                q(((Activity) obj).getWindow());
            }
        }
        if (this.f6470m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final P3 z(Context context) {
        if (this.f6458Z == null) {
            if (D3.c.f505h == null) {
                Context applicationContext = context.getApplicationContext();
                D3.c.f505h = new D3.c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6458Z = new y(this, D3.c.f505h);
        }
        return this.f6458Z;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
