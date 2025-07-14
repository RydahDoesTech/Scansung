package m2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import b1.AbstractC0203C;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.network.IDMNetworkInterface;
import g1.AbstractC0449a;
import j2.InterfaceC0558a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import k.Q0;
import k2.f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687c {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f8045e = Pattern.compile("[0-9]+s");
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f8046a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0558a f8047b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0558a f8048c;

    /* renamed from: d, reason: collision with root package name */
    public final d f8049d = new d();

    public C0687c(Context context, InterfaceC0558a interfaceC0558a, InterfaceC0558a interfaceC0558a2) {
        this.f8046a = context;
        this.f8047b = interfaceC0558a;
        this.f8048c = interfaceC0558a2;
    }

    public static URL a(String str) throws f {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e5) {
            throw new f(e5.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + (TextUtils.isEmpty(str) ? "" : g4.f.d(", ", str)));
    }

    public static long d(String str) {
        AbstractC0203C.a("Invalid Expiration Timestamp.", f8045e.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static C0685a e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
        A.d dVarA = C0686b.a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        C0686b c0686b = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        dVarA.f11b = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        dVarA.f12c = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                C0686b c0686bB = dVarA.b();
                jsonReader.endObject();
                c0686b = c0686bB;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C0685a(strNextString, strNextString2, strNextString3, c0686b, 1);
    }

    public static C0686b f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
        A.d dVarA = C0686b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                dVarA.f11b = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                dVarA.f12c = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        dVarA.f10a = 1;
        return dVarA.b();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(ActionInfoDao.IDM_DB_ACTIONINFO_APPID, str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final HttpURLConnection c(URL url, String str) throws NoSuchAlgorithmException, f {
        int iA;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(IDMCallbackStatusInterface.IDM_RESULTS);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(IDMCallbackStatusInterface.IDM_RESULTS);
            httpURLConnection.addRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT, "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty(IDMNetworkInterface.IDM_HTTP_CACHE_CONTROL, "no-cache");
            Context context = this.f8046a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC0558a interfaceC0558a = this.f8048c;
            if (interfaceC0558a.get() != null) {
                InterfaceC0558a interfaceC0558a2 = this.f8047b;
                if (interfaceC0558a2.get() != null && (iA = ((h2.b) interfaceC0558a.get()).a("fire-installations-id")) != 1) {
                    httpURLConnection.addRequestProperty("x-firebase-client", ((r2.b) interfaceC0558a2.get()).a());
                    httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(Q0.c(iA)));
                }
            }
            String strA = null;
            try {
                byte[] bArrC = AbstractC0449a.c(context, context.getPackageName());
                if (bArrC == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strA = AbstractC0449a.a(bArrC);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e5);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strA);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
