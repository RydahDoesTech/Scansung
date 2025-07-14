package com.samsung.android.knox.ex.peripheral;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface PeripheralDataListener {
    void onFail(int i5, String str);

    void onReceive(int i5, Bundle bundle);

    void onSuccess();
}
