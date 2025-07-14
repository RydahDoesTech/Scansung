package com.google.android.gms.internal.p000firebaseauthapi;

import D.a;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import com.google.firebase.messaging.t;
import e.B;
import j.MenuItemC0499p;
import o.C0713k;

/* loaded from: classes.dex */
public abstract class P3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f5380a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5381b;

    public P3(String str, C0239b4 c0239b4) {
        this.f5380a = str;
        this.f5381b = c0239b4;
    }

    public void d() {
        t tVar = (t) this.f5380a;
        if (tVar != null) {
            try {
                ((B) this.f5381b).f6469l.unregisterReceiver(tVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5380a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof a)) {
            return menuItem;
        }
        a aVar = (a) menuItem;
        if (((C0713k) this.f5381b) == null) {
            this.f5381b = new C0713k();
        }
        MenuItem menuItem2 = (MenuItem) ((C0713k) this.f5381b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0499p menuItemC0499p = new MenuItemC0499p((Context) this.f5380a, aVar);
        ((C0713k) this.f5381b).put(aVar, menuItemC0499p);
        return menuItemC0499p;
    }

    public abstract void h();

    public void i() {
        d();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((t) this.f5380a) == null) {
            this.f5380a = new t(this);
        }
        ((B) this.f5381b).f6469l.registerReceiver((t) this.f5380a, intentFilterE);
    }

    public String j(String str, String str2) {
        String str3 = (String) this.f5380a;
        int length = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 5 + str.length() + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(str);
        sb.append("?key=");
        sb.append(str2);
        return sb.toString();
    }

    public P3(Context context) {
        this.f5380a = context;
    }

    public P3(B b2) {
        this.f5381b = b2;
    }
}
