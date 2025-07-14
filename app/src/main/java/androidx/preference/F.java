package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4536a;

    /* renamed from: b, reason: collision with root package name */
    public long f4537b = 0;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f4538c = null;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f4539d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4540e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public PreferenceScreen f4541g;

    /* renamed from: h, reason: collision with root package name */
    public z f4542h;

    /* renamed from: i, reason: collision with root package name */
    public z f4543i;

    /* renamed from: j, reason: collision with root package name */
    public z f4544j;

    public F(Context context) {
        this.f4536a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (!this.f4540e) {
            return b().edit();
        }
        if (this.f4539d == null) {
            this.f4539d = b().edit();
        }
        return this.f4539d;
    }

    public final SharedPreferences b() {
        Context context;
        if (this.f4538c == null && (context = this.f4536a) != null) {
            this.f4538c = context.getSharedPreferences(this.f, 0);
        }
        return this.f4538c;
    }

    public final PreferenceScreen c(Context context, int i5, PreferenceScreen preferenceScreen) throws Resources.NotFoundException {
        this.f4540e = true;
        E e5 = new E(context, this);
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            PreferenceGroup preferenceGroupC = e5.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.m(this);
            SharedPreferences.Editor editor = this.f4539d;
            if (editor != null) {
                editor.apply();
            }
            this.f4540e = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
