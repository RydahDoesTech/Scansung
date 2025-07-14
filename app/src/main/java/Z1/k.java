package Z1;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.samsung.android.knox.container.KnoxContainerManager;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2876a;

    static {
        HashMap map = new HashMap();
        f2876a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE);
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = f2876a;
                if (map.containsKey(string)) {
                    String str2 = (String) map.get(string);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
                    sb.append(str2);
                    sb.append(":");
                    sb.append(string2);
                    return V1.a.q0(sb.toString());
                }
            }
            String strValueOf = String.valueOf(str);
            return V1.a.q0(strValueOf.length() != 0 ? "WEB_INTERNAL_ERROR:".concat(strValueOf) : new String("WEB_INTERNAL_ERROR:"));
        } catch (JSONException e5) {
            String localizedMessage = e5.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            sb2.append("WEB_INTERNAL_ERROR:");
            sb2.append(str);
            sb2.append("[ ");
            sb2.append(localizedMessage);
            sb2.append(" ]");
            return V1.a.q0(sb2.toString());
        }
    }
}
