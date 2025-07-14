package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.H;
import androidx.lifecycle.O;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements w0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3119b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f3118a = i5;
        this.f3119b = obj;
    }

    @Override // w0.c
    public final Bundle a() {
        int i5 = this.f3118a;
        Object obj = this.f3119b;
        switch (i5) {
            case 0:
                return ComponentActivity.h((H) obj);
            default:
                return O.a((O) obj);
        }
    }
}
