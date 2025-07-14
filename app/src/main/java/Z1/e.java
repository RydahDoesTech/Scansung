package Z1;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.C0306n;
import com.google.android.gms.internal.p000firebaseauthapi.G2;
import com.google.android.gms.internal.p000firebaseauthapi.M;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C0704b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final A.d f2868a = new A.d("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            Object objD = jSONArray.get(i5);
            if (objD instanceof JSONArray) {
                objD = a((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    public static Map b(String str) {
        AbstractC0203C.c(str);
        List listN = new C0306n(2, new M(10)).n(str);
        int size = listN.size();
        A.d dVar = f2868a;
        if (size < 2) {
            dVar.e(str.length() != 0 ? "Invalid idToken ".concat(str) : new String("Invalid idToken "), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) listN.get(1);
        try {
            C0704b c0704bC = c(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return c0704bC == null ? new HashMap() : c0704bC;
        } catch (UnsupportedEncodingException e5) {
            dVar.d("Unable to decode token", e5, new Object[0]);
            return new HashMap();
        }
    }

    public static C0704b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e5) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new G2(e5);
        }
    }

    public static C0704b d(JSONObject jSONObject) throws JSONException {
        C0704b c0704b = new C0704b();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objD = jSONObject.get(next);
            if (objD instanceof JSONArray) {
                objD = a((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            c0704b.put(next, objD);
        }
        return c0704b;
    }
}
