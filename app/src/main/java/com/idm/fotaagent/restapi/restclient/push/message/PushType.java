package com.idm.fotaagent.restapi.restclient.push.message;

import Y0.e;
import Y0.f;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.idm.fotaagent.enabler.interfaces.IDMEnablerInterface;
import com.idm.fotaagent.restapi.restclient.push.message.spp.SppReceiver;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.ex.peripheral.PeripheralConstants;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t1.c;
import t1.h;

/* loaded from: classes.dex */
public enum PushType {
    FCM { // from class: com.idm.fotaagent.restapi.restclient.push.message.PushType.1
        private static final String FCM_UNKNOWN_ERROR = "PLAY_SERVICE_ERROR";
        private static final String PLAY_SERVICE_ERROR = "PLAY_SERVICE_NOT_AVAILABLE";
        private volatile String pushId = null;

        /* renamed from: com.idm.fotaagent.restapi.restclient.push.message.PushType$1$FcmTokenListener */
        public class FcmTokenListener implements c {
            private final CompletableFuture<String> futureForPushId;

            public FcmTokenListener(CompletableFuture<String> completableFuture) {
                this.futureForPushId = completableFuture;
            }

            @Override // t1.c
            public void onComplete(h hVar) {
                if (hVar.f()) {
                    this.futureForPushId.complete((String) hVar.e());
                    return;
                }
                Log.W("Fetching FCM registration token failed. " + hVar.d());
                this.futureForPushId.completeExceptionally(new PushIdNotRegisteredException(hVar.d()));
            }
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public void configFcmAutoInit() {
            if (FirebaseMessaging.c().f6131e.b()) {
                return;
            }
            Log.I("enable FCM auto init");
            FirebaseMessaging.c().g(true);
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public String getPushId(Context context) throws PushIdNotRegisteredException {
            if (!isAvailable(context)) {
                throw new PushIdNotRegisteredException(PLAY_SERVICE_ERROR);
            }
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                FirebaseMessaging.c().e().a(Executors.newSingleThreadExecutor(), new FcmTokenListener(completableFuture));
                String str = (String) completableFuture.get(PushType.PUSH_ID_TIMEOUT_IN_SEC, TimeUnit.SECONDS);
                if (TextUtils.isEmpty(str)) {
                    throw new PushIdNotRegisteredException(FCM_UNKNOWN_ERROR);
                }
                this.pushId = str;
                Log.H("pushId: " + str);
                return str;
            } catch (InterruptedException | RuntimeException | ExecutionException | TimeoutException e5) {
                throw new PushIdNotRegisteredException(FCM_UNKNOWN_ERROR, e5);
            }
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public boolean isAvailable(Context context) throws PackageManager.NameNotFoundException {
            int iB = e.f2816c.b(context, f.f2817a);
            if (iB == 0 || iB == 2) {
                return true;
            }
            Log.W("FCM not available: " + iB);
            return false;
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public String getPushId() {
            return this.pushId;
        }
    },
    SPP { // from class: com.idm.fotaagent.restapi.restclient.push.message.PushType.2
        private static final String EXTRA_APPID = "appId";
        private static final String EXTRA_REQ_TYPE = "reqType";
        private static final String EXTRA_USERDATA = "userdata";
        private static final String PUSH_ACTION = "com.sec.spp.RegistrationChangedAction";
        private static final String PUSH_PERMISSION = "com.sec.spp.permission.SEND";
        private static final int PUSH_REQ_TYPE_REGISTRATION = 1;
        private static final String PUSH_SERVICE_REQUEST = "com.sec.spp.action.SPP_REQUEST";

        /* renamed from: com.idm.fotaagent.restapi.restclient.push.message.PushType$2$RegistrationChangedReceiver */
        public class RegistrationChangedReceiver extends SafeBroadcastReceiver {
            private static final String EXTRA_REGID = "RegistrationID";
            private static final String EXTRA_RESULT = "Error";
            private static final String EXTRA_STATUS = "com.sec.spp.Status";
            private static final int RESULT_SUCCESS = 1000;
            private static final int STATUS_REGISTRATION_FAIL = 1;
            private static final int STATUS_REGISTRATION_SUCCESS = 0;
            private final CompletableFuture<String> futureForPushId;

            public RegistrationChangedReceiver(CompletableFuture<String> completableFuture) {
                this.futureForPushId = completableFuture;
            }

            private boolean isValid(String str) {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return str.startsWith("00") || str.startsWith("01") || str.startsWith("02") || str.startsWith("03") || str.startsWith("04") || str.startsWith("05") || str.startsWith("06") || str.startsWith("7A") || str.startsWith("7B") || str.startsWith("7C");
            }

            @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
            public void handle() {
                String action = getAction();
                if (!AnonymousClass2.PUSH_ACTION.equals(action)) {
                    Log.W("uninteresting action: " + action);
                    return;
                }
                Intent intent = getIntent();
                String stringExtra = intent.getStringExtra("appId");
                if (!SppReceiver.APP_ID.equals(stringExtra)) {
                    Log.W("uninteresting app id: " + stringExtra);
                    return;
                }
                int intExtra = intent.getIntExtra(EXTRA_STATUS, 1);
                int intExtra2 = intent.getIntExtra(EXTRA_RESULT, 1000);
                if (intExtra == 0 && intExtra2 == 1000) {
                    String stringExtra2 = intent.getStringExtra(EXTRA_REGID);
                    if (isValid(stringExtra2)) {
                        this.futureForPushId.complete(stringExtra2);
                        return;
                    } else {
                        this.futureForPushId.completeExceptionally(new PushIdNotRegisteredException(g4.f.d("SPP invalid pushId: ", stringExtra2)));
                        return;
                    }
                }
                Log.W("registration status: " + intExtra + ", result code: " + intExtra2);
                this.futureForPushId.completeExceptionally(new PushIdNotRegisteredException(String.valueOf(intExtra2)));
            }
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public void configFcmAutoInit() {
            if (FirebaseMessaging.c().f6131e.b()) {
                Log.I("disable FCM auto init");
                FirebaseMessaging.c().g(false);
            }
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public String getPushId(Context context) {
            context.sendBroadcast(new Intent(PUSH_SERVICE_REQUEST).putExtra(EXTRA_REQ_TYPE, 1).putExtra("appId", SppReceiver.APP_ID).putExtra(EXTRA_USERDATA, context.getPackageName()).setFlags(IDMEnablerInterface.FLAG_RECEIVER_INCLUDE_BACKGROUND));
            IntentFilter intentFilter = new IntentFilter(PUSH_ACTION);
            CompletableFuture completableFuture = new CompletableFuture();
            RegistrationChangedReceiver registrationChangedReceiver = new RegistrationChangedReceiver(completableFuture);
            context.registerReceiver(registrationChangedReceiver, intentFilter, PUSH_PERMISSION, null, 2);
            try {
                try {
                    try {
                        String str = (String) completableFuture.get(PushType.PUSH_ID_TIMEOUT_IN_SEC, TimeUnit.SECONDS);
                        Log.H("pushId: " + str);
                        return str;
                    } catch (InterruptedException | TimeoutException e5) {
                        throw new PushIdNotRegisteredException(PeripheralConstants.ConnectionProfile.SPP, e5);
                    }
                } catch (ExecutionException e6) {
                    throw new PushIdNotRegisteredException(e6.getCause() != null ? e6.getCause().getMessage() : e6.getMessage(), e6);
                }
            } finally {
                context.unregisterReceiver(registrationChangedReceiver);
            }
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.message.PushType
        public boolean isAvailable(Context context) {
            return true;
        }
    };

    private static final long PUSH_ID_TIMEOUT_IN_SEC = 30;

    public static PushType get() {
        if (!FloatingFeature.forcesSpp() && !SalesCode.get().isChinaCountryFeature()) {
            return FCM;
        }
        return SPP;
    }

    public abstract void configFcmAutoInit();

    public String getPushId() {
        return null;
    }

    public abstract String getPushId(Context context);

    public abstract boolean isAvailable(Context context);
}
