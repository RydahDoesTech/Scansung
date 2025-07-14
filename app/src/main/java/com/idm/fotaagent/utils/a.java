package com.idm.fotaagent.utils;

import android.content.Context;
import b0.C0198c;
import h0.InterfaceC0471b;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6370d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6371e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f6372g;

    public /* synthetic */ a(Context context, int i5, String str) {
        this.f = context;
        this.f6372g = str;
        this.f6371e = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6370d) {
            case 0:
                ToastHelper.lambda$showToast$0((Context) this.f, (String) this.f6372g, this.f6371e);
                break;
            default:
                ((InterfaceC0471b) ((C0198c) this.f).f5001d).j(this.f6371e, this.f6372g);
                break;
        }
    }

    public /* synthetic */ a(C0198c c0198c, int i5, Serializable serializable) {
        this.f = c0198c;
        this.f6371e = i5;
        this.f6372g = serializable;
    }
}
