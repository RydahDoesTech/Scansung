package a1;

import android.text.TextUtils;
import b1.AbstractC0203C;
import b1.InterfaceC0206b;
import com.google.android.gms.internal.p000firebaseauthapi.Y3;
import com.samsung.android.knox.container.KnoxContainerManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097e implements InterfaceC0206b, Y3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2944d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2945e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2946g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2947h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2948i;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty((String) this.f2947h)) {
            jSONObject.put("sessionInfo", (String) this.f);
            jSONObject.put(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, (String) this.f2946g);
        } else {
            jSONObject.put("phoneNumber", (String) this.f2945e);
            jSONObject.put("temporaryProof", (String) this.f2947h);
        }
        String str = (String) this.f2948i;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f2944d) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public void b(Y0.a aVar) {
        C0096d c0096d = (C0096d) ((C0099g) this.f2948i).f2960g.get((C0093a) this.f);
        AbstractC0203C.b(c0096d.f2943l.f2962i);
        ((b1.k) c0096d.f2934b).d();
        c0096d.f(aVar);
    }

    @Override // b1.InterfaceC0206b
    public void d(Y0.a aVar) {
        ((C0099g) this.f2948i).f2962i.post(new G.a(this, aVar, 5, false));
    }
}
