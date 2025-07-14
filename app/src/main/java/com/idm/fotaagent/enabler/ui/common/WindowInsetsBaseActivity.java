package com.idm.fotaagent.enabler.ui.common;

import B.c;
import J.H;
import J.P;
import J.p0;
import android.os.Bundle;
import android.view.View;
import com.wssyncmldm.R;
import e.AbstractActivityC0411n;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class WindowInsetsBaseActivity extends AbstractActivityC0411n {
    /* JADX INFO: Access modifiers changed from: private */
    public static p0 lambda$onCreate$0(View view, p0 p0Var) {
        c cVarF = p0Var.f1481a.f(143);
        view.setPadding(cVarF.f87a, cVarF.f88b, cVarF.f89c, cVarF.f90d);
        view.invalidate();
        return p0.f1480b;
    }

    public abstract void doOnCreate();

    @Override // androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        ColoredPaddingView coloredPaddingView = (ColoredPaddingView) findViewById(R.id.included_window_inset);
        if (coloredPaddingView != null) {
            C2.a aVar = new C2.a(20);
            WeakHashMap weakHashMap = P.f1421a;
            H.u(coloredPaddingView, aVar);
        }
        doOnCreate();
    }

    public abstract void setContentView();
}
