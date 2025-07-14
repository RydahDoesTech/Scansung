package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.idm.providers.mo.IDMMoInterface;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Context f6146a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Intent f6147b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i5;
        ComponentName componentNameStartService;
        Context context = this.f6146a;
        Intent intent = this.f6147b;
        q qVarU = q.u();
        qVarU.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) qVarU.f6170h).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (qVarU) {
            try {
                str = (String) qVarU.f6168e;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(IDMMoInterface.IDM_MO_ROOT_PATH)) {
                                String strValueOf = String.valueOf(context.getPackageName());
                                String strValueOf2 = String.valueOf(serviceInfo.name);
                                qVarU.f6168e = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                            } else {
                                qVarU.f6168e = serviceInfo.name;
                            }
                            str = (String) qVarU.f6168e;
                        }
                        String str3 = serviceInfo.packageName;
                        String str4 = serviceInfo.name;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                        sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                        sb.append(str3);
                        sb.append("/");
                        sb.append(str4);
                        Log.e("FirebaseMessaging", sb.toString());
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (qVarU.w(context)) {
                componentNameStartService = B.a(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i5 = 404;
            } else {
                i5 = -1;
            }
        } catch (IllegalStateException e5) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e5.toString()));
            i5 = 402;
        } catch (SecurityException e6) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e6);
            i5 = 401;
        }
        return Integer.valueOf(i5);
    }
}
