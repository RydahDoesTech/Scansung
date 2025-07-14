package i;

import J.AbstractC0054k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.ActionProviderVisibilityListenerC0495l;
import j.C0494k;
import j.MenuItemC0499p;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f6876A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f6877B;
    public final /* synthetic */ j E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f6880a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6886h;

    /* renamed from: i, reason: collision with root package name */
    public int f6887i;

    /* renamed from: j, reason: collision with root package name */
    public int f6888j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6889k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f6890l;

    /* renamed from: m, reason: collision with root package name */
    public int f6891m;
    public char n;

    /* renamed from: o, reason: collision with root package name */
    public int f6892o;

    /* renamed from: p, reason: collision with root package name */
    public char f6893p;

    /* renamed from: q, reason: collision with root package name */
    public int f6894q;

    /* renamed from: r, reason: collision with root package name */
    public int f6895r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6896s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6897t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6898u;

    /* renamed from: v, reason: collision with root package name */
    public int f6899v;

    /* renamed from: w, reason: collision with root package name */
    public int f6900w;

    /* renamed from: x, reason: collision with root package name */
    public String f6901x;

    /* renamed from: y, reason: collision with root package name */
    public String f6902y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0495l f6903z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f6878C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f6879D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f6881b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f6882c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6883d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f6884e = 0;
    public boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6885g = true;

    public i(j jVar, Menu menu) {
        this.E = jVar;
        this.f6880a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f6907c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.f6896s).setVisible(this.f6897t).setEnabled(this.f6898u).setCheckable(this.f6895r >= 1).setTitleCondensed(this.f6890l).setIcon(this.f6891m);
        int i5 = this.f6899v;
        if (i5 >= 0) {
            menuItem.setShowAsAction(i5);
        }
        String str = this.f6902y;
        j jVar = this.E;
        if (str != null) {
            if (jVar.f6907c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f6908d == null) {
                jVar.f6908d = j.a(jVar.f6907c);
            }
            Object obj = jVar.f6908d;
            String str2 = this.f6902y;
            h hVar = new h();
            hVar.f6874d = obj;
            Class<?> cls = obj.getClass();
            try {
                hVar.f6875e = cls.getMethod(str2, h.f);
                menuItem.setOnMenuItemClickListener(hVar);
            } catch (Exception e5) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f6895r >= 2) {
            if (menuItem instanceof C0494k) {
                C0494k c0494k = (C0494k) menuItem;
                c0494k.f7003x = (c0494k.f7003x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0499p) {
                MenuItemC0499p menuItemC0499p = (MenuItemC0499p) menuItem;
                try {
                    Method method = menuItemC0499p.f7015d;
                    D.a aVar = menuItemC0499p.f7014c;
                    if (method == null) {
                        menuItemC0499p.f7015d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0499p.f7015d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e6) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                }
            }
        }
        String str3 = this.f6901x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, j.f6904e, jVar.f6905a));
            z4 = true;
        }
        int i6 = this.f6900w;
        if (i6 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i6);
            }
        }
        ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l = this.f6903z;
        if (actionProviderVisibilityListenerC0495l != null) {
            if (menuItem instanceof D.a) {
                ((D.a) menuItem).b(actionProviderVisibilityListenerC0495l);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f6876A;
        boolean z5 = menuItem instanceof D.a;
        if (z5) {
            ((D.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0054k.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f6877B;
        if (z5) {
            ((D.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0054k.m(menuItem, charSequence2);
        }
        char c2 = this.n;
        int i7 = this.f6892o;
        if (z5) {
            ((D.a) menuItem).setAlphabeticShortcut(c2, i7);
        } else {
            AbstractC0054k.g(menuItem, c2, i7);
        }
        char c5 = this.f6893p;
        int i8 = this.f6894q;
        if (z5) {
            ((D.a) menuItem).setNumericShortcut(c5, i8);
        } else {
            AbstractC0054k.k(menuItem, c5, i8);
        }
        PorterDuff.Mode mode = this.f6879D;
        if (mode != null) {
            if (z5) {
                ((D.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0054k.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f6878C;
        if (colorStateList != null) {
            if (z5) {
                ((D.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0054k.i(menuItem, colorStateList);
            }
        }
        if (z5) {
            ((D.a) menuItem).a();
        }
    }
}
