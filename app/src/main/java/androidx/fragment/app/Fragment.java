package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.InterfaceC0149l;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;
import b.AbstractC0195a;
import b0.AbstractC0197b;
import b0.C0199d;
import b3.AbstractC0219i;
import c0.AbstractC0221a;
import com.wssyncmldm.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.Q0;
import o.C0714l;
import s0.AbstractC0823a;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0159w, androidx.lifecycle.c0, InterfaceC0149l, w0.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    A mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.a0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    a0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    M mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C0161y mLifecycleRegistry;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    w0.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    View mView;
    t0 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    a0 mChildFragmentManager = new b0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC0133v(this, 0);
    EnumC0154q mMaxState = EnumC0154q.f4024h;
    androidx.lifecycle.F mViewLifecycleOwnerLiveData = new androidx.lifecycle.F();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<B> mOnPreAttachedListeners = new ArrayList<>();
    q4.a mDisposableHandle = null;
    private final B mSavedStateAttachListener = new C0134w(this);

    public Fragment() {
        d();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final A a() {
        if (this.mAnimationInfo == null) {
            A a5 = new A();
            a5.f3699i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            a5.f3700j = obj;
            a5.f3701k = null;
            a5.f3702l = obj;
            a5.f3703m = null;
            a5.n = obj;
            a5.f3706q = 1.0f;
            a5.f3707r = null;
            this.mAnimationInfo = a5;
        }
        return this.mAnimationInfo;
    }

    public final int b() {
        EnumC0154q enumC0154q = this.mMaxState;
        return (enumC0154q == EnumC0154q.f4022e || this.mParentFragment == null) ? enumC0154q.ordinal() : Math.min(enumC0154q.ordinal(), this.mParentFragment.b());
    }

    public final Fragment c(boolean z4) {
        String str;
        if (z4) {
            Z.c cVar = Z.d.f2849a;
            Z.d.b(new Z.g(this, "Attempting to get target fragment from fragment " + this));
            Z.d.a(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        a0 a0Var = this.mFragmentManager;
        if (a0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return a0Var.f3767c.b(str);
    }

    public void callStartTransitionListener(boolean z4) {
        ViewGroup viewGroup;
        a0 a0Var;
        A a5 = this.mAnimationInfo;
        if (a5 != null) {
            a5.f3708s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (a0Var = this.mFragmentManager) == null) {
            return;
        }
        C0125m c0125mI = C0125m.i(viewGroup, a0Var);
        c0125mI.j();
        if (z4) {
            this.mHost.f.post(new RunnableC0126n(1, c0125mI));
        } else {
            c0125mI.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public K createFragmentContainer() {
        return new C0135x(this);
    }

    public final void d() {
        this.mLifecycleRegistry = new C0161y(this);
        this.mSavedStateRegistryController = new w0.e(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        B b2 = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            b2.a();
        } else {
            this.mOnPreAttachedListeners.add(b2);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentC = c(false);
        if (fragmentC != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentC);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC0221a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(g4.f.c(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final androidx.activity.result.d e(AbstractC0195a abstractC0195a, C0136y c0136y, androidx.activity.result.b bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(A3.f.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        C0137z c0137z = new C0137z(this, c0136y, new AtomicReference(), abstractC0195a, bVar);
        if (this.mState >= 0) {
            c0137z.a();
        } else {
            this.mOnPreAttachedListeners.add(c0137z);
        }
        return new androidx.activity.result.d();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f3767c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final H getActivity() {
        M m4 = this.mHost;
        if (m4 == null) {
            return null;
        }
        return m4.f3727d;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        A a5 = this.mAnimationInfo;
        if (a5 == null || (bool = a5.f3705p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        A a5 = this.mAnimationInfo;
        if (a5 == null || (bool = a5.f3704o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        a5.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final a0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        M m4 = this.mHost;
        if (m4 == null) {
            return null;
        }
        return m4.f3728e;
    }

    @Override // androidx.lifecycle.InterfaceC0149l
    public AbstractC0197b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0199d c0199d = new C0199d();
        LinkedHashMap linkedHashMap = c0199d.f5000a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.Y.f4004d, application);
        }
        linkedHashMap.put(androidx.lifecycle.Q.f3983a, this);
        linkedHashMap.put(androidx.lifecycle.Q.f3984b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.Q.f3985c, getArguments());
        }
        return c0199d;
    }

    public androidx.lifecycle.a0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.U(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return 0;
        }
        return a5.f3693b;
    }

    public Object getEnterTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        return a5.f3699i;
    }

    public y.z getEnterTransitionCallback() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        a5.getClass();
        return null;
    }

    public int getExitAnim() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return 0;
        }
        return a5.f3694c;
    }

    public Object getExitTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        return a5.f3701k;
    }

    public y.z getExitTransitionCallback() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        a5.getClass();
        return null;
    }

    public View getFocusedView() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        return a5.f3707r;
    }

    @Deprecated
    public final a0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        M m4 = this.mHost;
        if (m4 == null) {
            return null;
        }
        return ((G) m4).f3719h;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC0159w
    public androidx.lifecycle.r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC0221a getLoaderManager() {
        return AbstractC0221a.a(this);
    }

    public int getNextTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return 0;
        }
        return a5.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final a0 getParentFragmentManager() {
        a0 a0Var = this.mFragmentManager;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return false;
        }
        return a5.f3692a;
    }

    public int getPopEnterAnim() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return 0;
        }
        return a5.f3695d;
    }

    public int getPopExitAnim() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return 0;
        }
        return a5.f3696e;
    }

    public float getPostOnViewCreatedAlpha() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return 1.0f;
        }
        return a5.f3706q;
    }

    public Object getReenterTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        Object obj = a5.f3702l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        Z.c cVar = Z.d.f2849a;
        Z.d.b(new Z.f(this, "Attempting to get retain instance for fragment " + this));
        Z.d.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        Object obj = a5.f3700j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // w0.f
    public final w0.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f9293b;
    }

    public Object getSharedElementEnterTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        return a5.f3703m;
    }

    public Object getSharedElementReturnTransition() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return null;
        }
        Object obj = a5.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        A a5 = this.mAnimationInfo;
        return (a5 == null || (arrayList = a5.f3697g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        A a5 = this.mAnimationInfo;
        return (a5 == null || (arrayList = a5.f3698h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i5) {
        return getResources().getString(i5);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        Z.c cVar = Z.d.f2849a;
        Z.d.b(new Z.g(this, "Attempting to get target request code from fragment " + this));
        Z.d.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i5) {
        return getResources().getText(i5);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0159w getViewLifecycleOwner() {
        t0 t0Var = this.mViewLifecycleOwner;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException(A3.f.n("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.C getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.c0
    public androidx.lifecycle.b0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (b() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f3763L.f3816c;
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) map.get(this.mWho);
        if (b0Var != null) {
            return b0Var;
        }
        androidx.lifecycle.b0 b0Var2 = new androidx.lifecycle.b0();
        map.put(this.mWho, b0Var2);
        return b0Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        d();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new b0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            a0 a0Var = this.mFragmentManager;
            if (a0Var == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            a0Var.getClass();
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null ? true : fragment.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        A a5 = this.mAnimationInfo;
        if (a5 == null) {
            return false;
        }
        return a5.f3708s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        a0 a0Var = this.mFragmentManager;
        if (a0Var == null) {
            return false;
        }
        return a0Var.E || a0Var.f3757F;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.K();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i5, int i6, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i5 + " resultCode: " + i6 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        M m4 = this.mHost;
        H h3 = m4 == null ? null : m4.f3727d;
        if (h3 != null) {
            this.mCalled = false;
            onAttach((Activity) h3);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        a0 a0Var = this.mChildFragmentManager;
        if (a0Var.f3781s >= 1) {
            return;
        }
        a0Var.E = false;
        a0Var.f3757F = false;
        a0Var.f3763L.f = false;
        a0Var.t(1);
    }

    public Animation onCreateAnimation(int i5, boolean z4, int i6) {
        View view;
        int i7;
        int i8;
        Context context = getContext();
        if (context == null || !TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage")) || (view = getView()) == null) {
            return null;
        }
        H activity = getActivity();
        int[] iArrD = Q0.d(2);
        int length = iArrD.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                int[] iArrD2 = Q0.d(2);
                int length2 = iArrD2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    if (A3.f.e(iArrD2[i10]) == i6) {
                        view.setTranslationZ(1.0f);
                        break;
                    }
                    i10++;
                }
            } else {
                if (A3.f.f(iArrD[i9]) == i6) {
                    view.setTranslationZ(0.0f);
                    break;
                }
                i9++;
            }
        }
        for (int i11 : Q0.d(2)) {
            if (A3.f.e(i11) != i6 && A3.f.f(i11) != i6) {
                if (i11 == 1) {
                    i7 = R.anim.sesl_fragment_close_enter;
                } else {
                    if (i11 != 2) {
                        throw null;
                    }
                    i7 = R.anim.sesl_fragment_close_enter_rtl;
                }
                if (i7 != i6) {
                    if (i11 == 1) {
                        i8 = R.anim.sesl_fragment_close_exit;
                    } else {
                        if (i11 != 2) {
                            throw null;
                        }
                        i8 = R.anim.sesl_fragment_close_exit_rtl;
                    }
                    if (i8 != i6) {
                    }
                }
            }
            if (activity != null) {
                activity.getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.sesl_fragment_fgcolor));
            }
            view.setBackgroundColor(getResources().getColor(R.color.sesl_fragment_bgcolor));
            this.mDisposableHandle = new C0131t(this, new WeakReference(view));
            return null;
        }
        this.mDisposableHandle = new C0131t(this, new WeakReference(view));
        return null;
    }

    public Animator onCreateAnimator(int i5, boolean z4, int i6) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i5 = this.mContentLayoutId;
        if (i5 != 0) {
            return layoutInflater.inflate(i5, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z4) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        M m4 = this.mHost;
        H h3 = m4 == null ? null : m4.f3727d;
        if (h3 != null) {
            this.mCalled = false;
            onInflate((Activity) h3, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z4) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z4) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z4) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public abstract void onSaveInstanceState(Bundle bundle);

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.K();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        a0 a0Var = this.mChildFragmentManager;
        a0Var.E = false;
        a0Var.f3757F = false;
        a0Var.f3763L.f = false;
        a0Var.t(4);
    }

    public void performAttach() {
        Iterator<B> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f3728e);
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f3776m.iterator();
        while (it2.hasNext()) {
            ((e0) it2.next()).a(this);
        }
        a0 a0Var = this.mChildFragmentManager;
        a0Var.E = false;
        a0Var.f3757F = false;
        a0Var.f3763L.f = false;
        a0Var.t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.K();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new InterfaceC0157u() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
                View view;
                if (enumC0153p != EnumC0153p.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(EnumC0153p.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z4 = true;
        }
        return z4 | this.mChildFragmentManager.j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.K();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new t0(this, getViewModelStore(), new RunnableC0132u(0, this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f3919g != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.Q.f(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        t0 t0Var = this.mViewLifecycleOwner;
        AbstractC0219i.e("<this>", view);
        view.setTag(R.id.view_tree_view_model_store_owner, t0Var);
        AbstractC0823a.d(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.e(EnumC0153p.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            t0 t0Var = this.mViewLifecycleOwner;
            t0Var.b();
            if (t0Var.f3919g.f4031c.compareTo(EnumC0154q.f) >= 0) {
                this.mViewLifecycleOwner.a(EnumC0153p.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        C0714l c0714l = AbstractC0221a.a(this).f5139b.f5137a;
        if (c0714l.f <= 0) {
            this.mPerformedCreateView = false;
        } else {
            c0714l.f8240e[0].getClass();
            throw new ClassCastException();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onDetach()"));
        }
        a0 a0Var = this.mChildFragmentManager;
        if (a0Var.f3758G) {
            return;
        }
        a0Var.k();
        this.mChildFragmentManager = new b0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z4) {
        onMultiWindowModeChanged(z4);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0153p.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(EnumC0153p.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z4) {
        onPictureInPictureModeChanged(z4);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z4 = true;
        }
        return z4 | this.mChildFragmentManager.s(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zI = a0.I(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zI) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zI);
            onPrimaryNavigationFragmentChanged(zI);
            a0 a0Var = this.mChildFragmentManager;
            a0Var.Z();
            a0Var.q(a0Var.f3785w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.K();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onResume()"));
        }
        C0161y c0161y = this.mLifecycleRegistry;
        EnumC0153p enumC0153p = EnumC0153p.ON_RESUME;
        c0161y.e(enumC0153p);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f3919g.e(enumC0153p);
        }
        a0 a0Var = this.mChildFragmentManager;
        a0Var.E = false;
        a0Var.f3757F = false;
        a0Var.f3763L.f = false;
        a0Var.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.K();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onStart()"));
        }
        C0161y c0161y = this.mLifecycleRegistry;
        EnumC0153p enumC0153p = EnumC0153p.ON_START;
        c0161y.e(enumC0153p);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f3919g.e(enumC0153p);
        }
        a0 a0Var = this.mChildFragmentManager;
        a0Var.E = false;
        a0Var.f3757F = false;
        a0Var.f3763L.f = false;
        a0Var.t(5);
    }

    public void performStop() {
        a0 a0Var = this.mChildFragmentManager;
        a0Var.f3757F = true;
        a0Var.f3763L.f = true;
        a0Var.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0153p.ON_STOP);
        }
        this.mLifecycleRegistry.e(EnumC0153p.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        a().f3708s = true;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC0195a abstractC0195a, androidx.activity.result.b bVar) {
        return e(abstractC0195a, new C0136y(0, this), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i5) {
        if (this.mHost == null) {
            throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to Activity"));
        }
        a0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f3754B == null) {
            parentFragmentManager.f3782t.getClass();
            return;
        }
        parentFragmentManager.f3755C.addLast(new X(this.mWho, i5));
        parentFragmentManager.f3754B.a(strArr);
    }

    public final H requireActivity() {
        H activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final a0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(A3.f.n("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(A3.f.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.Q(bundle);
        a0 a0Var = this.mChildFragmentManager;
        a0Var.E = false;
        a0Var.f3757F = false;
        a0Var.f3763L.f = false;
        a0Var.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new y0(A3.f.n("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0153p.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z4) {
        a().f3705p = Boolean.valueOf(z4);
    }

    public void setAllowReturnTransitionOverlap(boolean z4) {
        a().f3704o = Boolean.valueOf(z4);
    }

    public void setAnimations(int i5, int i6, int i7, int i8) {
        if (this.mAnimationInfo == null && i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            return;
        }
        a().f3693b = i5;
        a().f3694c = i6;
        a().f3695d = i7;
        a().f3696e = i8;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(y.z zVar) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().f3699i = obj;
    }

    public void setExitSharedElementCallback(y.z zVar) {
        a().getClass();
    }

    public void setExitTransition(Object obj) {
        a().f3701k = obj;
    }

    public void setFocusedView(View view) {
        a().f3707r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z4) {
        if (this.mHasMenu != z4) {
            this.mHasMenu = z4;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((G) this.mHost).f3719h.invalidateMenu();
        }
    }

    public void setInitialSavedState(C c2) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c2 == null || (bundle = c2.f3709d) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z4) {
        if (this.mMenuVisible != z4) {
            this.mMenuVisible = z4;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((G) this.mHost).f3719h.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i5) {
        if (this.mAnimationInfo == null && i5 == 0) {
            return;
        }
        a();
        this.mAnimationInfo.f = i5;
    }

    public void setPopDirection(boolean z4) {
        if (this.mAnimationInfo == null) {
            return;
        }
        a().f3692a = z4;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        a().f3706q = f;
    }

    public void setReenterTransition(Object obj) {
        a().f3702l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z4) {
        Z.c cVar = Z.d.f2849a;
        Z.d.b(new Z.f(this, "Attempting to set retain instance for fragment " + this));
        Z.d.a(this).getClass();
        this.mRetainInstance = z4;
        a0 a0Var = this.mFragmentManager;
        if (a0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z4) {
            a0Var.f3763L.b(this);
        } else {
            a0Var.f3763L.f(this);
        }
    }

    public void setReturnTransition(Object obj) {
        a().f3700j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        a().f3703m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        a();
        A a5 = this.mAnimationInfo;
        a5.f3697g = arrayList;
        a5.f3698h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i5) {
        if (fragment != null) {
            Z.c cVar = Z.d.f2849a;
            Z.d.b(new Z.g(this, "Attempting to set target fragment " + fragment + " with request code " + i5 + " for fragment " + this));
            Z.d.a(this).getClass();
        }
        a0 a0Var = this.mFragmentManager;
        a0 a0Var2 = fragment != null ? fragment.mFragmentManager : null;
        if (a0Var != null && a0Var2 != null && a0Var != a0Var2) {
            throw new IllegalArgumentException(A3.f.n("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragmentC = fragment; fragmentC != null; fragmentC = fragmentC.c(false)) {
            if (fragmentC.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i5;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z4) {
        Z.c cVar = Z.d.f2849a;
        Z.d.b(new Z.a(this, "Attempting to set user visible hint to " + z4 + " for fragment " + this));
        Z.d.a(this).getClass();
        boolean z5 = false;
        if (!this.mUserVisibleHint && z4 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            a0 a0Var = this.mFragmentManager;
            h0 h0VarF = a0Var.f(this);
            Fragment fragment = h0VarF.f3844c;
            if (fragment.mDeferStart) {
                if (a0Var.f3766b) {
                    a0Var.f3759H = true;
                } else {
                    fragment.mDeferStart = false;
                    h0VarF.k();
                }
            }
        }
        this.mUserVisibleHint = z4;
        if (this.mState < 5 && !z4) {
            z5 = true;
        }
        this.mDeferStart = z5;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z4);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        M m4 = this.mHost;
        if (m4 != null) {
            return y.c.a(((G) m4).f3719h, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i5) {
        startActivityForResult(intent, i5, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i5 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        a0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f3753A == null) {
            M m4 = parentFragmentManager.f3782t;
            if (i5 == -1) {
                m4.f3727d.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
                return;
            } else {
                m4.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        AbstractC0219i.e("intentSender", intentSender);
        androidx.activity.result.j jVar = new androidx.activity.result.j(intentSender, intent2, i6, i7);
        parentFragmentManager.f3755C.addLast(new X(this.mWho, i5));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f3753A.a(jVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !a().f3708s) {
            return;
        }
        if (this.mHost == null) {
            a().f3708s = false;
        } else if (Looper.myLooper() != this.mHost.f.getLooper()) {
            this.mHost.f.postAtFrontOfQueue(new RunnableC0133v(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) U.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e5) {
            throw new O2.d(A3.f.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e6) {
            throw new O2.d(A3.f.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (NoSuchMethodException e7) {
            throw new O2.d(A3.f.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e7);
        } catch (InvocationTargetException e8) {
            throw new O2.d(A3.f.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e8);
        }
    }

    public final String getString(int i5, Object... objArr) {
        return getResources().getString(i5, objArr);
    }

    public final void postponeEnterTransition(long j5, TimeUnit timeUnit) {
        a().f3708s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        a0 a0Var = this.mFragmentManager;
        if (a0Var != null) {
            this.mPostponedHandler = a0Var.f3782t.f;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j5));
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC0195a abstractC0195a, androidx.activity.result.h hVar, androidx.activity.result.b bVar) {
        return e(abstractC0195a, new C0136y(1, hVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        M m4 = this.mHost;
        if (m4 == null) {
            throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to Activity"));
        }
        m4.f3728e.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(A3.f.n("Fragment ", this, " not attached to Activity"));
        }
        a0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f3788z != null) {
            parentFragmentManager.f3755C.addLast(new X(this.mWho, i5));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f3788z.a(intent);
            return;
        }
        M m4 = parentFragmentManager.f3782t;
        if (i5 == -1) {
            m4.f3728e.startActivity(intent, bundle);
        } else {
            m4.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        M m4 = this.mHost;
        if (m4 != null) {
            H h3 = ((G) m4).f3719h;
            LayoutInflater layoutInflaterCloneInContext = h3.getLayoutInflater().cloneInContext(h3);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
