package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC0387d {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.AbstractServiceC0387d
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) q.u().f6170h).poll();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02fd A[Catch: RuntimeException -> 0x0314, TryCatch #2 {RuntimeException -> 0x0314, blocks: (B:189:0x02ec, B:191:0x02fd, B:194:0x0316, B:195:0x0325), top: B:222:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0316 A[Catch: RuntimeException -> 0x0314, TryCatch #2 {RuntimeException -> 0x0314, blocks: (B:189:0x02ec, B:191:0x02fd, B:194:0x0316, B:195:0x0325), top: B:222:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    @Override // com.google.firebase.messaging.AbstractServiceC0387d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleIntent(android.content.Intent r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.handleIntent(android.content.Intent):void");
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(o oVar) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
