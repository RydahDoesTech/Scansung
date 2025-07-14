package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import com.samsung.android.knox.container.KnoxContainerManager;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317o4 implements Z3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5579d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f5580e;

    public void a(String str) throws JSONException, C0369x3 {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE);
            this.f5580e = jSONObject.getString("message");
        } catch (NullPointerException | JSONException e5) {
            String message = e5.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(message).length());
            sb.append("Failed to parse error for string [");
            sb.append(str);
            sb.append("] with exception: ");
            sb.append(message);
            Log.e("com.google.android.gms.internal.firebase-auth-api.o4", sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 35);
            sb2.append("Failed to parse error for string [");
            sb2.append(str);
            sb2.append("]");
            throw new C0369x3(sb2.toString(), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z3
    public final /* bridge */ /* synthetic */ Z3 b(String str) throws JSONException, C0369x3 {
        switch (this.f5579d) {
            case 0:
                a(str);
                break;
            default:
                c(str);
                break;
        }
        return this;
    }

    public void c(String str) throws C0369x3 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5580e = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (jSONArrayOptJSONArray != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    ((ArrayList) this.f5580e).add(jSONArrayOptJSONArray.getString(i5));
                }
            }
        } catch (JSONException e5) {
            throw AbstractC0335s.d(e5, "o4", str);
        }
    }
}
