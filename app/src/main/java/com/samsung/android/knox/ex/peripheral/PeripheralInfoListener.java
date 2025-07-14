package com.samsung.android.knox.ex.peripheral;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface PeripheralInfoListener {
    void onFail(int i5, String str);

    void onReceive(Bundle bundle);

    void onSuccess();
}
