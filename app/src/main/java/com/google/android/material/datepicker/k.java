package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import e.C0406i;

/* loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5878e;

    public /* synthetic */ k(int i5, Object obj) {
        this.f5877d = i5;
        this.f5878e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f5877d) {
            case 0:
                l lVar = (l) this.f5878e;
                int i5 = lVar.f5881h;
                if (i5 != 2) {
                    if (i5 == 1) {
                        lVar.g(2);
                        break;
                    }
                } else {
                    lVar.g(1);
                    break;
                }
                break;
            default:
                C0406i c0406i = (C0406i) this.f5878e;
                Message messageObtain = (view != c0406i.f6584i || (message3 = c0406i.f6586k) == null) ? (view != c0406i.f6587l || (message2 = c0406i.n) == null) ? (view != c0406i.f6589o || (message = c0406i.f6591q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0406i.f6575H.obtainMessage(1, c0406i.f6578b).sendToTarget();
                break;
        }
    }
}
