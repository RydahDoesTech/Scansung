package com.idm.fotaagent.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ToastHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showToast$0(Context context, String str, int i5) {
        Toast.makeText(new ContextThemeWrapper(context, R.style.SESL_Theme), str, i5).show();
    }

    public static void showLongToast(Context context, String str) {
        showToast(context, str, 1);
    }

    public static void showShortToast(Context context, String str) {
        showToast(context, str, 0);
    }

    public static void showToast(Context context, String str, int i5) {
        new Handler(Looper.getMainLooper()).post(new a(context, i5, str));
    }
}
