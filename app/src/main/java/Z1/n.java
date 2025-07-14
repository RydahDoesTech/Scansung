package Z1;

import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.Y3;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.lib.episode.EternalContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n implements Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final String f2879d;

    /* renamed from: e, reason: collision with root package name */
    public String f2880e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2881g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2882h;

    public n(String str, String str2, String str3, String str4, String str5) {
        this.f2879d = str;
        this.f2880e = str2;
        this.f = str3;
        this.f2881g = str4;
        this.f2882h = str5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f2880e);
        this.f2879d.getClass();
        jSONObject.put("mfaProvider", 1);
        String str = this.f2881g;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f2882h;
        if (str3 != null) {
            jSONObject2.put(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }

    public n(String str, String str2, String str3, String str4) {
        AbstractC0203C.c(EternalContract.DEVICE_TYPE_PHONE);
        this.f2879d = EternalContract.DEVICE_TYPE_PHONE;
        AbstractC0203C.c(str);
        this.f2880e = str;
        this.f = str2;
        this.f2882h = str3;
        this.f2881g = str4;
    }
}
