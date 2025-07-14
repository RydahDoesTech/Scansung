package androidx.fragment.app;

import a.InterfaceC0092b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.EnumC0154q;
import c0.AbstractC0221a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y.AbstractC0917a;

/* loaded from: classes.dex */
public abstract class H extends ComponentActivity implements y.d {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final L mFragments = new L(new G(this));
    final C0161y mFragmentLifecycleRegistry = new C0161y(this);
    boolean mStopped = true;

    public H() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new D(0, this));
        final int i5 = 0;
        addOnConfigurationChangedListener(new I.a(this) { // from class: androidx.fragment.app.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f3713b;

            {
                this.f3713b = this;
            }

            @Override // I.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        this.f3713b.mFragments.a();
                        break;
                    default:
                        this.f3713b.mFragments.a();
                        break;
                }
            }
        });
        final int i6 = 1;
        addOnNewIntentListener(new I.a(this) { // from class: androidx.fragment.app.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f3713b;

            {
                this.f3713b = this;
            }

            @Override // I.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        this.f3713b.mFragments.a();
                        break;
                    default:
                        this.f3713b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC0092b() { // from class: androidx.fragment.app.F
            @Override // a.InterfaceC0092b
            public final void a(ComponentActivity componentActivity) {
                G g5 = this.f3714a.mFragments.f3726a;
                g5.f3729g.b(g5, g5, null);
            }
        });
    }

    public static boolean i(a0 a0Var) {
        boolean zI = false;
        for (Fragment fragment : a0Var.f3767c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zI |= i(fragment.getChildFragmentManager());
                }
                t0 t0Var = fragment.mViewLifecycleOwner;
                EnumC0154q enumC0154q = EnumC0154q.f4023g;
                if (t0Var != null) {
                    t0Var.b();
                    if (t0Var.f3919g.f4031c.compareTo(enumC0154q) >= 0) {
                        fragment.mViewLifecycleOwner.f3919g.g();
                        zI = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f4031c.compareTo(enumC0154q) >= 0) {
                    fragment.mLifecycleRegistry.g();
                    zI = true;
                }
            }
        }
        return zI;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3726a.f3729g.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC0221a.a(this).b(str2, printWriter);
            }
            this.mFragments.f3726a.f3729g.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public a0 getSupportFragmentManager() {
        return this.mFragments.f3726a.f3729g;
    }

    @Deprecated
    public AbstractC0221a getSupportLoaderManager() {
        return AbstractC0221a.a(this);
    }

    public void markFragmentsCreated() {
        while (i(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i5, i6, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        q4.a aVar;
        Fragment fragment = (Fragment) P2.m.x0(0, getSupportFragmentManager().f3767c.f());
        if (fragment != null && (aVar = fragment.mDisposableHandle) != null) {
            aVar.a();
        }
        super.onBackPressed();
    }

    @Override // androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0153p.ON_CREATE);
        b0 b0Var = this.mFragments.f3726a.f3729g;
        b0Var.E = false;
        b0Var.f3757F = false;
        b0Var.f3763L.f = false;
        b0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3726a.f3729g.k();
        this.mFragmentLifecycleRegistry.e(EnumC0153p.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 6) {
            return this.mFragments.f3726a.f3729g.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3726a.f3729g.t(5);
        this.mFragmentLifecycleRegistry.e(EnumC0153p.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.a();
        this.mFragments.f3726a.f3729g.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0153p.ON_RESUME);
        b0 b0Var = this.mFragments.f3726a.f3729g;
        b0Var.E = false;
        b0Var.f3757F = false;
        b0Var.f3763L.f = false;
        b0Var.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            b0 b0Var = this.mFragments.f3726a.f3729g;
            b0Var.E = false;
            b0Var.f3757F = false;
            b0Var.f3763L.f = false;
            b0Var.t(4);
        }
        this.mFragments.a();
        this.mFragments.f3726a.f3729g.x(true);
        this.mFragmentLifecycleRegistry.e(EnumC0153p.ON_START);
        b0 b0Var2 = this.mFragments.f3726a.f3729g;
        b0Var2.E = false;
        b0Var2.f3757F = false;
        b0Var2.f3763L.f = false;
        b0Var2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        b0 b0Var = this.mFragments.f3726a.f3729g;
        b0Var.f3757F = true;
        b0Var.f3763L.f = true;
        b0Var.t(4);
        this.mFragmentLifecycleRegistry.e(EnumC0153p.ON_STOP);
    }

    public void setEnterSharedElementCallback(y.z zVar) {
        AbstractC0917a.c(this, null);
    }

    public void setExitSharedElementCallback(y.z zVar) {
        AbstractC0917a.d(this, null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i5, Bundle bundle) {
        if (i5 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i5, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) {
        if (i5 == -1) {
            startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC0917a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC0917a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0917a.e(this);
    }

    @Override // y.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i5) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i5) {
        startActivityFromFragment(fragment, intent, i5, (Bundle) null);
    }
}
