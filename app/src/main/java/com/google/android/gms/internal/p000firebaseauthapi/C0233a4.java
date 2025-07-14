package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import b1.m;
import b1.s;
import com.samsung.android.knox.net.wifi.WifiAdminProfile;
import g3.InterfaceC0453c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233a4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5423a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0233a4(String str) throws NumberFormatException {
        int i5 = -1;
        try {
            List listN = C0306n.l().n(str);
            if (listN.size() == 1) {
                i5 = Integer.parseInt(str);
                str = str;
            } else {
                str = str;
                if (listN.size() >= 3) {
                    int i6 = (Integer.parseInt((String) listN.get(1)) * 1000) + (Integer.parseInt((String) listN.get(0)) * 1000000);
                    int i7 = Integer.parseInt((String) listN.get(2));
                    i5 = i6 + i7;
                    str = i7;
                }
            }
        } catch (IllegalArgumentException e5) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e5));
            }
        }
        this.f5423a = i5;
    }

    public static String a() throws IOException {
        String str;
        s sVar = s.f5058c;
        sVar.getClass();
        m mVar = s.f5057b;
        AbstractC0203C.d("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = sVar.f5059a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            String property = null;
            try {
                InputStream resourceAsStream = s.class.getResourceAsStream("/firebase-auth.properties");
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                    property = properties.getProperty("version", null);
                    StringBuilder sb = new StringBuilder(25 + String.valueOf(property).length());
                    sb.append("firebase-auth version is ");
                    sb.append(property);
                    String string = sb.toString();
                    if (Log.isLoggable(mVar.f5054a, 2)) {
                        String str2 = mVar.f5055b;
                        if (str2 != null) {
                            string = str2.concat(string);
                        }
                        Log.v("LibraryVersion", string);
                    }
                } else {
                    String strConcat = "Failed to get app version for libraryName: ".concat("firebase-auth");
                    if (Log.isLoggable(mVar.f5054a, 5)) {
                        String str3 = mVar.f5055b;
                        if (str3 != null) {
                            strConcat = str3.concat(strConcat);
                        }
                        Log.w("LibraryVersion", strConcat);
                    }
                }
            } catch (IOException e5) {
                String strConcat2 = "Failed to get app version for libraryName: ".concat("firebase-auth");
                if (Log.isLoggable(mVar.f5054a, 6)) {
                    String str4 = mVar.f5055b;
                    if (str4 != null) {
                        strConcat2 = str4.concat(strConcat2);
                    }
                    Log.e("LibraryVersion", strConcat2, e5);
                }
            }
            if (property == null) {
                if (Log.isLoggable(mVar.f5054a, 3)) {
                    String str5 = mVar.f5055b;
                    Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
                }
                str = "UNKNOWN";
            } else {
                str = property;
            }
            concurrentHashMap.put("firebase-auth", str);
        }
        return (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) ? WifiAdminProfile.PHASE1_NONE : str;
    }

    public C0233a4(InterfaceC0453c interfaceC0453c, int i5) {
        this.f5423a = i5;
    }
}
