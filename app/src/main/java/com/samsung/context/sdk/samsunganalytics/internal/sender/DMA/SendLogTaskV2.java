package com.samsung.context.sdk.samsunganalytics.internal.sender.DMA;

import I2.b;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;

/* loaded from: classes.dex */
public class SendLogTaskV2 implements b {
    private static final String AUTHORITY = "com.sec.android.log.diagmonagent.sa";
    int Type;
    private final ContentValues cv;
    private final Context mContext;
    private final Uri commonUri = Uri.parse("content://com.sec.android.log.diagmonagent.sa/common");
    private final Uri logUri = Uri.parse("content://com.sec.android.log.diagmonagent.sa/log");
    Uri returnUri = null;

    public SendLogTaskV2(Context context, int i5, ContentValues contentValues) {
        this.mContext = context;
        this.Type = i5;
        this.cv = contentValues;
    }

    @Override // I2.b
    public int onFinish() throws NumberFormatException {
        try {
            Uri uri = this.returnUri;
            if (uri != null) {
                int i5 = Integer.parseInt(uri.getLastPathSegment());
                Debug.LogD("SendLog Result = " + i5);
                boolean z4 = true;
                if (this.Type == 1) {
                    if (i5 != 0) {
                        z4 = false;
                    }
                    Preferences.getPreferences(this.mContext).edit().putBoolean(Preferences.PREFS_KEY_SEND_COMMON_SUCCESS, z4).apply();
                    Debug.LogD("Save Result = " + z4);
                }
            }
        } catch (Exception e5) {
            Debug.logwingW("failed to get send result" + e5.getMessage());
        }
        return 0;
    }

    @Override // I2.b
    public void run() {
        try {
            int i5 = this.Type;
            if (i5 == 1) {
                this.returnUri = this.mContext.getContentResolver().insert(this.commonUri, this.cv);
            } else if (i5 == 2) {
                this.returnUri = this.mContext.getContentResolver().insert(this.logUri, this.cv);
            }
        } catch (Exception e5) {
            Debug.logwingW("failed to send log" + e5.getMessage());
        }
    }
}
