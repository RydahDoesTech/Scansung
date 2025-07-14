package com.idm.fotaagent.restapi.restclient;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.OneShotHeartbeatHandle;
import com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.PeriodicHeartbeatHandle;
import com.idm.fotaagent.restapi.restclient.polling.context.PollingContext;
import com.idm.fotaagent.restapi.restclient.push.handler.PushHandlers;
import com.idm.fotaagent.restapi.restclient.push.message.PushMessage;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.ex.peripheral.PeripheralConstants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'POLLING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class RestClientServiceType {
    private static final /* synthetic */ RestClientServiceType[] $VALUES = $values();
    public static final RestClientServiceType ONE_SHOT_HEARTBEAT;
    public static final RestClientServiceType PERIODIC_HEARTBEAT;
    public static final RestClientServiceType POLLING;
    public static final RestClientServiceType SPP;
    private final int requestCode;

    private static /* synthetic */ RestClientServiceType[] $values() {
        return new RestClientServiceType[]{POLLING, SPP, ONE_SHOT_HEARTBEAT, PERIODIC_HEARTBEAT};
    }

    static {
        int i5 = 0;
        POLLING = new RestClientServiceType("POLLING", i5, i5) { // from class: com.idm.fotaagent.restapi.restclient.RestClientServiceType.1
            @Override // com.idm.fotaagent.restapi.restclient.RestClientServiceType
            public void doAction(Context context, Intent intent) {
                Log.I(name() + " doAction");
                new PollingContext(context).start();
            }
        };
        int i6 = 1;
        SPP = new RestClientServiceType(PeripheralConstants.ConnectionProfile.SPP, i6, i6) { // from class: com.idm.fotaagent.restapi.restclient.RestClientServiceType.2
            @Override // com.idm.fotaagent.restapi.restclient.RestClientServiceType
            public void doAction(Context context, Intent intent) {
                Log.I(name() + " doAction");
                String stringExtra = intent.getStringExtra(PushMessage.RAW_MSG);
                Log.H("Received: " + stringExtra);
                try {
                    PushMessage pushMessage = new PushMessage(stringExtra);
                    PushHandlers.of(pushMessage.type()).handle(pushMessage.id(), pushMessage.body(), pushMessage.replyUrl());
                } catch (IllegalArgumentException e5) {
                    Log.printStackTrace(e5);
                }
            }
        };
        int i7 = 2;
        ONE_SHOT_HEARTBEAT = new RestClientServiceType("ONE_SHOT_HEARTBEAT", i7, i7) { // from class: com.idm.fotaagent.restapi.restclient.RestClientServiceType.3
            @Override // com.idm.fotaagent.restapi.restclient.RestClientServiceType
            public void doAction(Context context, Intent intent) {
                Log.I(name() + " doAction");
                new OneShotHeartbeatHandle(context).handleIntent();
            }
        };
        int i8 = 3;
        PERIODIC_HEARTBEAT = new RestClientServiceType("PERIODIC_HEARTBEAT", i8, i8) { // from class: com.idm.fotaagent.restapi.restclient.RestClientServiceType.4
            @Override // com.idm.fotaagent.restapi.restclient.RestClientServiceType
            public void doAction(Context context, Intent intent) {
                Log.I(name() + " doAction");
                new PeriodicHeartbeatHandle(context).handleIntent();
            }
        };
    }

    public static RestClientServiceType valueOf(String str) {
        return (RestClientServiceType) Enum.valueOf(RestClientServiceType.class, str);
    }

    public static RestClientServiceType[] values() {
        return (RestClientServiceType[]) $VALUES.clone();
    }

    public abstract void doAction(Context context, Intent intent);

    public Intent getIntent(Context context) {
        Log.I(name());
        return new Intent(context, (Class<?>) RestClientReceiver.class).setFlags(268435456).putExtra(RestClientReceiver.KEY_INTENT_SERVICE_TYPE, this);
    }

    public PendingIntent getPendingIntent(Context context) {
        return PendingIntent.getBroadcast(context, this.requestCode, getIntent(context), 201326592);
    }

    private RestClientServiceType(String str, int i5, int i6) {
        this.requestCode = i6;
    }
}
