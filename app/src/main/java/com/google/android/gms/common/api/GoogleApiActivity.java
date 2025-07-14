package com.google.android.gms.common.api;

import Y0.a;
import Y0.e;
import a1.C0099g;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.R1;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5233e = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5234d = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i5 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5234d = 0;
            setResult(i6, intent);
            if (booleanExtra) {
                C0099g c0099gA = C0099g.a(this);
                if (i6 == -1) {
                    R1 r12 = c0099gA.f2962i;
                    r12.sendMessage(r12.obtainMessage(3));
                } else if (i6 == 0) {
                    a aVar = new a(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!c0099gA.c(aVar, intExtra)) {
                        R1 r13 = c0099gA.f2962i;
                        r13.sendMessage(r13.obtainMessage(5, intExtra, 0, aVar));
                    }
                }
            }
        } else if (i5 == 2) {
            this.f5234d = 0;
            setResult(i6, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5234d = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5234d = bundle.getInt("resolution");
        }
        if (this.f5234d != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else {
                if (pendingIntent == null) {
                    e.f2816c.c(this, num.intValue(), this);
                    this.f5234d = 1;
                    return;
                }
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f5234d = 1;
                } catch (IntentSender.SendIntentException e5) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                    finish();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5234d);
        super.onSaveInstanceState(bundle);
    }
}
