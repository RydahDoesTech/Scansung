package com.google.android.gms.internal.p000firebaseauthapi;

import X1.b;
import X1.d;
import android.util.Log;
import b1.AbstractC0203C;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334r4 implements Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final String f5612d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5613e;
    public final String f;

    static {
        String simpleName = C0334r4.class.getSimpleName();
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append(']');
            sb.append(' ');
        }
        Object[] objArr = {simpleName, 23};
        if (!(simpleName.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        for (int i5 = 2; 7 >= i5 && !Log.isLoggable(simpleName, i5); i5++) {
        }
    }

    public C0334r4(d dVar, String str) {
        String str2 = dVar.f2717d;
        AbstractC0203C.c(str2);
        this.f5612d = str2;
        String str3 = dVar.f;
        AbstractC0203C.c(str3);
        this.f5613e = str3;
        this.f = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public final String a() throws JSONException {
        b bVar;
        int i5 = b.f2714c;
        String str = this.f5613e;
        AbstractC0203C.c(str);
        try {
            bVar = new b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        String str2 = bVar != null ? bVar.f2715a : null;
        String str3 = bVar != null ? bVar.f2716b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f5612d);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
