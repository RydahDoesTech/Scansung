package com.google.firebase.auth.api.fallback.service;

import Y1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class FirebaseAuthFallbackService extends Service {
    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (!"com.google.firebase.auth.api.gms.service.START".equals(intent.getAction())) {
            return null;
        }
        return new a(this);
    }
}
