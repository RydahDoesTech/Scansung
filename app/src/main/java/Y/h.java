package y;

import J.InterfaceC0048e;
import J.P;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.L;
import androidx.lifecycle.N;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import java.util.WeakHashMap;
import o.C0713k;

/* loaded from: classes.dex */
public abstract class h extends Activity implements InterfaceC0159w, InterfaceC0048e {
    private final C0713k extraDataMap = new C0713k();
    private final C0161y lifecycleRegistry = new C0161y(this);

    public Context a() {
        return getApplicationContext();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTIVITY_EVENT, keyEvent);
        AbstractC0219i.d("window.decorView", getWindow().getDecorView());
        WeakHashMap weakHashMap = P.f1421a;
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTIVITY_EVENT, keyEvent);
        AbstractC0219i.d("window.decorView", getWindow().getDecorView());
        WeakHashMap weakHashMap = P.f1421a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends g> T getExtraData(Class<T> cls) {
        AbstractC0219i.e("extraDataClass", cls);
        if (this.extraDataMap.getOrDefault(cls, null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i5 = N.f3976d;
        L.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0219i.e("outState", bundle);
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(g gVar) {
        AbstractC0219i.e("extraData", gVar);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L40
            int r1 = r3.length
            if (r1 != 0) goto L8
            goto L40
        L8:
            r3 = r3[r0]
            int r1 = r3.hashCode()
            switch(r1) {
                case -645125871: goto L38;
                case 100470631: goto L2f;
                case 472614934: goto L26;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L40
        L12:
            java.lang.String r1 = "--autofill"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L40
        L1b:
            r0 = r2
            goto L40
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L40
        L26:
            java.lang.String r1 = "--list-dumpables"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L40
        L2f:
            java.lang.String r1 = "--dump-dumpable"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L40
        L38:
            java.lang.String r1 = "--translation"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
        L40:
            r2 = r2 ^ r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // J.InterfaceC0048e
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTIVITY_EVENT, keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }
}
