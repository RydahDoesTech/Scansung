package com.samsung.context.sdk.samsunganalytics.internal.sender.DMA;

import M2.a;
import M2.b;
import M2.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.samsung.context.sdk.samsunganalytics.internal.Callback;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;

/* loaded from: classes.dex */
public class DMABinder {
    private Context context;
    private c dmaInterface;
    private ServiceConnection serviceConnection;
    private boolean isTokenFail = false;
    private boolean isBind = false;

    public DMABinder(Context context, final Callback<Void, String> callback) {
        this.context = context;
        this.serviceConnection = new ServiceConnection() { // from class: com.samsung.context.sdk.samsunganalytics.internal.sender.DMA.DMABinder.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                c cVar;
                try {
                    DMABinder dMABinder = DMABinder.this;
                    int i5 = b.f1813a;
                    if (iBinder == null) {
                        cVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.sec.android.diagmonagent.sa.IDMAInterface");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) {
                            a aVar = new a();
                            aVar.f1812a = iBinder;
                            cVar = aVar;
                        } else {
                            cVar = (c) iInterfaceQueryLocalInterface;
                        }
                    }
                    dMABinder.dmaInterface = cVar;
                    a aVar2 = (a) DMABinder.this.dmaInterface;
                    aVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.sec.android.diagmonagent.sa.IDMAInterface");
                        aVar2.f1812a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        String string = parcelObtain2.readString();
                        if (string == null) {
                            DMABinder.this.unBind();
                            DMABinder.this.isTokenFail = true;
                            Debug.LogD("DMABinder", "Token failed");
                        } else {
                            DMABinder.this.isTokenFail = false;
                            callback.onResult(string);
                            Debug.LogD("DMABinder", "DMA connected");
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Exception e5) {
                    DMABinder.this.unBind();
                    DMABinder.this.isTokenFail = true;
                    Debug.logwingW("failed to connect binder" + e5.getMessage());
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                DMABinder.this.dmaInterface = null;
            }
        };
    }

    public boolean bind() {
        if (!this.isBind && !this.isTokenFail) {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.sec.android.diagmonagent", "com.sec.android.diagmonagent.sa.receiver.SALogReceiverService");
                this.isBind = this.context.bindService(intent, this.serviceConnection, 1);
                Debug.LogD("DMABinder", "bind " + this.isBind);
            } catch (Exception e5) {
                Debug.logwingW("failed to bind" + e5.getMessage());
            }
        }
        return this.isTokenFail;
    }

    public c getDmaInterface() {
        return this.dmaInterface;
    }

    public boolean isBind() {
        return this.isBind;
    }

    public boolean isTokenfail() {
        return this.isTokenFail;
    }

    public void unBind() {
        if (this.dmaInterface == null || !this.isBind) {
            return;
        }
        try {
            this.context.unbindService(this.serviceConnection);
            this.isBind = false;
            Debug.LogD("DMABinder", "unbind");
        } catch (Exception e5) {
            Debug.logwingW("failed to unbind" + e5.getMessage());
        }
    }
}
