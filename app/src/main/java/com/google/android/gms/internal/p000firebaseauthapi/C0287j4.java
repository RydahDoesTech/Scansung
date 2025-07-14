package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287j4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final String f5529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0299l4 f5530b;

    public C0287j4(C0299l4 c0299l4, String str) {
        this.f5530b = c0299l4;
        this.f5529a = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f5238e == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                C0293k4 c0293k4 = (C0293k4) this.f5530b.f5556c.get(this.f5529a);
                if (c0293k4 == null) {
                    C0299l4.f5553d.e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
                    String strGroup = matcher.find() ? matcher.group() : null;
                    c0293k4.f5540d = strGroup;
                    if (strGroup == null) {
                        C0299l4.f5553d.e("Unable to extract verification code.", new Object[0]);
                    } else {
                        int i5 = D4.f5291a;
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
