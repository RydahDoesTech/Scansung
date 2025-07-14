package com.samsung.android.knox.ex.peripheral;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface PeripheralStateListener {
    void onFail(int i5, String str);

    void onStateChange(int i5, Bundle bundle);

    void onSuccess();
}
