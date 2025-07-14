package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class E4 extends AbstractC0224a implements Z3 {
    public static final Parcelable.Creator<E4> CREATOR = new C0310n3(12);

    /* renamed from: d, reason: collision with root package name */
    public String f5293d;

    /* renamed from: e, reason: collision with root package name */
    public String f5294e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public A4 f5295g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.p000firebaseauthapi.Z3 b(java.lang.String r17) throws com.google.android.gms.internal.p000firebaseauthapi.C0369x3 {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = g1.b.a(r4)     // Catch: java.lang.Throwable -> La5
            r0.f5293d = r4     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = g1.b.a(r4)     // Catch: java.lang.Throwable -> La5
            r0.f5294e = r4     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "PASSWORD_RESET"
            java.lang.String r6 = "VERIFY_EMAIL"
            java.lang.String r7 = "RECOVER_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r10 = "REVERT_SECOND_FACTOR_ADDITION"
            r12 = 1
            if (r4 == r12) goto L47
            switch(r4) {
                case 4: goto L45;
                case 5: goto L43;
                case 6: goto L41;
                case 7: goto L3f;
                case 8: goto L3d;
                default: goto L3b;
            }
        L3b:
            r4 = 0
            goto L48
        L3d:
            r4 = r10
            goto L48
        L3f:
            r4 = r9
            goto L48
        L41:
            r4 = r8
            goto L48
        L43:
            r4 = r7
            goto L48
        L45:
            r4 = r6
            goto L48
        L47:
            r4 = r5
        L48:
            r0.f = r4     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            if (r4 == 0) goto La7
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            int r13 = r4.hashCode()     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            r15 = 3
            r11 = 2
            r14 = 4
            switch(r13) {
                case -1874510116: goto L89;
                case -1452371317: goto L81;
                case -1341836234: goto L79;
                case -1099157829: goto L71;
                case 870738373: goto L69;
                case 970484929: goto L61;
                default: goto L60;
            }
        L60:
            goto L91
        L61:
            boolean r5 = r4.equals(r7)
            if (r5 == 0) goto L91
            r5 = r14
            goto L92
        L69:
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L91
            r5 = r11
            goto L92
        L71:
            boolean r5 = r4.equals(r9)
            if (r5 == 0) goto L91
            r5 = r15
            goto L92
        L79:
            boolean r5 = r4.equals(r6)
            if (r5 == 0) goto L91
            r5 = 0
            goto L92
        L81:
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L91
            r5 = r12
            goto L92
        L89:
            boolean r5 = r4.equals(r10)
            if (r5 == 0) goto L91
            r5 = 5
            goto L92
        L91:
            r5 = -1
        L92:
            if (r5 == 0) goto La1
            if (r5 == r12) goto La1
            if (r5 == r11) goto La1
            if (r5 == r15) goto La1
            if (r5 == r14) goto La1
            r6 = 5
            if (r5 == r6) goto La1
            r11 = 0
            goto La2
        La1:
            r11 = r4
        La2:
            r0.f = r11     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            goto La7
        La5:
            r0 = move-exception
            goto Lb8
        La7:
            boolean r4 = r3.has(r2)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            if (r4 == 0) goto Lb7
            org.json.JSONObject r2 = r3.optJSONObject(r2)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            com.google.android.gms.internal.firebase-auth-api.A4 r2 = com.google.android.gms.internal.p000firebaseauthapi.A4.d(r2)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
            r0.f5295g = r2     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> La5
        Lb7:
            return r0
        Lb8:
            java.lang.String r2 = "E4"
            com.google.android.gms.internal.firebase-auth-api.x3 r0 = com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s.d(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.E4.b(java.lang.String):com.google.android.gms.internal.firebase-auth-api.Z3");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5293d);
        AbstractC0415a.a0(parcel, 3, this.f5294e);
        AbstractC0415a.a0(parcel, 4, this.f);
        AbstractC0415a.Z(parcel, 5, this.f5295g, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
