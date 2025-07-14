package h2;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f6857b;

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f6858c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6859a;

    public d(Context context) {
        this.f6859a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public final synchronized boolean a(String str, long j5) {
        if (!this.f6859a.contains(str)) {
            this.f6859a.edit().putLong(str, j5).apply();
            return true;
        }
        Date date = new Date(this.f6859a.getLong(str, -1L));
        Date date2 = new Date(j5);
        SimpleDateFormat simpleDateFormat = f6858c;
        if (simpleDateFormat.format(date).equals(simpleDateFormat.format(date2))) {
            return false;
        }
        this.f6859a.edit().putLong(str, j5).apply();
        return true;
    }
}
