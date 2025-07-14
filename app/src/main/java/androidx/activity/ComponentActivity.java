package androidx.activity;

import J.C0052i;
import J.C0053j;
import J.InterfaceC0049f;
import J.InterfaceC0055l;
import a.C0091a;
import a.InterfaceC0092b;
import a3.InterfaceC0106a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.H;
import androidx.fragment.app.T;
import androidx.lifecycle.C0151n;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.InterfaceC0149l;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.L;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import b.AbstractC0195a;
import b0.AbstractC0197b;
import b0.C0199d;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s0.AbstractC0823a;
import y.x;
import y.y;
import z.InterfaceC0942e;
import z.InterfaceC0943f;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends y.h implements c0, InterfaceC0149l, w0.f, w, androidx.activity.result.i, InterfaceC0942e, InterfaceC0943f, y.w, x, InterfaceC0049f {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.h mActivityResultRegistry;
    private int mContentLayoutId;
    private a0 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final m mFullyDrawnReporter;
    private final C0053j mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private v mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<I.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<I.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<I.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<I.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<I.a> mOnTrimMemoryListeners;
    final j mReportFullyDrawnExecutor;
    final w0.e mSavedStateRegistryController;
    private b0 mViewModelStore;
    final C0091a mContextAwareHelper = new C0091a();
    private final C0161y mLifecycleRegistry = new C0161y(this);

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.activity.d] */
    public ComponentActivity() {
        final H h3 = (H) this;
        this.mMenuHostHelper = new C0053j(new C1.b(7, h3));
        w0.e eVar = new w0.e(this);
        this.mSavedStateRegistryController = eVar;
        this.mOnBackPressedDispatcher = null;
        k kVar = new k(h3);
        this.mReportFullyDrawnExecutor = kVar;
        this.mFullyDrawnReporter = new m(kVar, new InterfaceC0106a() { // from class: androidx.activity.d
            @Override // a3.InterfaceC0106a
            public final Object a() {
                h3.reportFullyDrawn();
                return null;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new g(h3);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC0157u() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
                if (enumC0153p == EnumC0153p.ON_STOP) {
                    Window window = h3.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().a(new InterfaceC0157u() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
                if (enumC0153p == EnumC0153p.ON_DESTROY) {
                    h3.mContextAwareHelper.f2920b = null;
                    if (!h3.isChangingConfigurations()) {
                        h3.getViewModelStore().a();
                    }
                    k kVar2 = (k) h3.mReportFullyDrawnExecutor;
                    H h5 = kVar2.f3126g;
                    h5.getWindow().getDecorView().removeCallbacks(kVar2);
                    h5.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar2);
                }
            }
        });
        getLifecycle().a(new InterfaceC0157u() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
                H h5 = h3;
                h5.ensureViewModelStore();
                h5.getLifecycle().b(this);
            }
        });
        eVar.a();
        Q.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new e(0, h3));
        addOnContextAvailableListener(new InterfaceC0092b() { // from class: androidx.activity.f
            @Override // a.InterfaceC0092b
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity.g(h3);
            }
        });
    }

    public static void g(H h3) {
        Bundle bundleA = h3.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            androidx.activity.result.h hVar = ((ComponentActivity) h3).mActivityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            hVar.f3159d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = hVar.f3161g;
            bundle2.putAll(bundle);
            for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                String str = stringArrayList.get(i5);
                HashMap map = hVar.f3157b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = hVar.f3156a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i5);
                num2.intValue();
                String str2 = stringArrayList.get(i5);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    public static Bundle h(H h3) {
        Bundle bundle = new Bundle();
        androidx.activity.result.h hVar = ((ComponentActivity) h3).mActivityResultRegistry;
        hVar.getClass();
        HashMap map = hVar.f3157b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f3159d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f3161g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // J.InterfaceC0049f
    public void addMenuProvider(InterfaceC0055l interfaceC0055l) {
        C0053j c0053j = this.mMenuHostHelper;
        c0053j.f1468b.add(interfaceC0055l);
        c0053j.f1467a.run();
    }

    @Override // z.InterfaceC0942e
    public final void addOnConfigurationChangedListener(I.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(InterfaceC0092b interfaceC0092b) {
        C0091a c0091a = this.mContextAwareHelper;
        c0091a.getClass();
        AbstractC0219i.e("listener", interfaceC0092b);
        ComponentActivity componentActivity = c0091a.f2920b;
        if (componentActivity != null) {
            interfaceC0092b.a(componentActivity);
        }
        c0091a.f2919a.add(interfaceC0092b);
    }

    @Override // y.w
    public final void addOnMultiWindowModeChangedListener(I.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(I.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // y.x
    public final void addOnPictureInPictureModeChangedListener(I.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // z.InterfaceC0943f
    public final void addOnTrimMemoryListener(I.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.mViewModelStore = iVar.f3123b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new b0();
            }
        }
    }

    @Override // androidx.activity.result.i
    public final androidx.activity.result.h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0149l
    public AbstractC0197b getDefaultViewModelCreationExtras() {
        C0199d c0199d = new C0199d();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0199d.f5000a;
        if (application != null) {
            linkedHashMap.put(Y.f4004d, getApplication());
        }
        linkedHashMap.put(Q.f3983a, this);
        linkedHashMap.put(Q.f3984b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(Q.f3985c, getIntent().getExtras());
        }
        return c0199d;
    }

    public a0 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new U(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public m getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f3122a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0159w
    public androidx.lifecycle.r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.w
    public final v getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new v(new A1.h(10, this));
            getLifecycle().a(new InterfaceC0157u() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.InterfaceC0157u
                public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
                    if (enumC0153p == EnumC0153p.ON_CREATE) {
                        v vVar = ComponentActivity.this.mOnBackPressedDispatcher;
                        OnBackInvokedDispatcher onBackInvokedDispatcherA = h.a((ComponentActivity) interfaceC0159w);
                        vVar.getClass();
                        AbstractC0219i.e("invoker", onBackInvokedDispatcherA);
                        vVar.f3173e = onBackInvokedDispatcherA;
                        vVar.c(vVar.f3174g);
                    }
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // w0.f
    public final w0.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f9293b;
    }

    @Override // androidx.lifecycle.c0
    public b0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        Q.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC0219i.e("<this>", decorView);
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        AbstractC0823a.d(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0219i.e("<this>", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0219i.e("<this>", decorView3);
        decorView3.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        if (this.mActivityResultRegistry.a(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<I.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        C0091a c0091a = this.mContextAwareHelper;
        c0091a.getClass();
        c0091a.f2920b = this;
        Iterator it = c0091a.f2919a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0092b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i5 = N.f3976d;
        L.b(this);
        int i6 = this.mContentLayoutId;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        C0053j c0053j = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c0053j.f1468b.iterator();
        while (it.hasNext()) {
            ((T) ((InterfaceC0055l) it.next())).f3741a.j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<I.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y.i(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<I.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        Iterator it = this.mMenuHostHelper.f1468b.iterator();
        while (it.hasNext()) {
            ((T) ((InterfaceC0055l) it.next())).f3741a.p(menu);
        }
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<I.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        this.mMenuHostHelper.b(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b0 b0Var = this.mViewModelStore;
        if (b0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            b0Var = iVar.f3123b;
        }
        if (b0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f3122a = objOnRetainCustomNonConfigurationInstance;
        iVar2.f3123b = b0Var;
        return iVar2;
    }

    @Override // y.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.r lifecycle = getLifecycle();
        if (lifecycle instanceof C0161y) {
            ((C0161y) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<I.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f2920b;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC0195a abstractC0195a, androidx.activity.result.h hVar, androidx.activity.result.b bVar) {
        return hVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0195a, bVar);
    }

    @Override // J.InterfaceC0049f
    public void removeMenuProvider(InterfaceC0055l interfaceC0055l) {
        this.mMenuHostHelper.c(interfaceC0055l);
    }

    @Override // z.InterfaceC0942e
    public final void removeOnConfigurationChangedListener(I.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(InterfaceC0092b interfaceC0092b) {
        C0091a c0091a = this.mContextAwareHelper;
        c0091a.getClass();
        AbstractC0219i.e("listener", interfaceC0092b);
        c0091a.f2919a.remove(interfaceC0092b);
    }

    @Override // y.w
    public final void removeOnMultiWindowModeChangedListener(I.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(I.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // y.x
    public final void removeOnPictureInPictureModeChangedListener(I.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // z.InterfaceC0943f
    public final void removeOnTrimMemoryListener(I.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (J2.b.G()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m mVar = this.mFullyDrawnReporter;
            synchronized (mVar.f3129a) {
                try {
                    mVar.f3130b = true;
                    Iterator it = mVar.f3131c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0106a) it.next()).a();
                    }
                    mVar.f3131c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i5) {
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<I.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                I.a next = it.next();
                AbstractC0219i.e("newConfig", configuration);
                next.accept(new y.i(z4));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<I.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                I.a next = it.next();
                AbstractC0219i.e("newConfig", configuration);
                next.accept(new y(z4));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC0195a abstractC0195a, androidx.activity.result.b bVar) {
        return registerForActivityResult(abstractC0195a, this.mActivityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0055l interfaceC0055l, InterfaceC0159w interfaceC0159w) {
        final C0053j c0053j = this.mMenuHostHelper;
        c0053j.f1468b.add(interfaceC0055l);
        c0053j.f1467a.run();
        androidx.lifecycle.r lifecycle = interfaceC0159w.getLifecycle();
        HashMap map = c0053j.f1469c;
        C0052i c0052i = (C0052i) map.remove(interfaceC0055l);
        if (c0052i != null) {
            c0052i.f1463a.b(c0052i.f1464b);
            c0052i.f1464b = null;
        }
        map.put(interfaceC0055l, new C0052i(lifecycle, new InterfaceC0157u() { // from class: J.h
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w2, EnumC0153p enumC0153p) {
                EnumC0153p enumC0153p2 = EnumC0153p.ON_DESTROY;
                C0053j c0053j2 = c0053j;
                if (enumC0153p == enumC0153p2) {
                    c0053j2.c(interfaceC0055l);
                } else {
                    c0053j2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0055l interfaceC0055l, InterfaceC0159w interfaceC0159w, final EnumC0154q enumC0154q) {
        final C0053j c0053j = this.mMenuHostHelper;
        c0053j.getClass();
        androidx.lifecycle.r lifecycle = interfaceC0159w.getLifecycle();
        HashMap map = c0053j.f1469c;
        C0052i c0052i = (C0052i) map.remove(interfaceC0055l);
        if (c0052i != null) {
            c0052i.f1463a.b(c0052i.f1464b);
            c0052i.f1464b = null;
        }
        map.put(interfaceC0055l, new C0052i(lifecycle, new InterfaceC0157u() { // from class: J.g
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w2, EnumC0153p enumC0153p) {
                C0053j c0053j2 = c0053j;
                c0053j2.getClass();
                EnumC0153p.Companion.getClass();
                EnumC0154q enumC0154q2 = enumC0154q;
                EnumC0153p enumC0153pC = C0151n.c(enumC0154q2);
                Runnable runnable = c0053j2.f1467a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0053j2.f1468b;
                InterfaceC0055l interfaceC0055l2 = interfaceC0055l;
                if (enumC0153p == enumC0153pC) {
                    copyOnWriteArrayList.add(interfaceC0055l2);
                    runnable.run();
                } else if (enumC0153p == EnumC0153p.ON_DESTROY) {
                    c0053j2.c(interfaceC0055l2);
                } else if (enumC0153p == C0151n.a(enumC0154q2)) {
                    copyOnWriteArrayList.remove(interfaceC0055l2);
                    runnable.run();
                }
            }
        }));
    }
}
