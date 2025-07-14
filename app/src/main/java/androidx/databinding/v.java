package androidx.databinding;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0158v;
import androidx.lifecycle.InterfaceC0159w;
import com.wssyncmldm.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import o.C0707e;

/* loaded from: classes.dex */
public abstract class v extends a {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final f mBindingComponent;
    private Choreographer mChoreographer;
    private v mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private InterfaceC0159w mLifecycleOwner;
    private w[] mLocalFieldObservers;
    private ViewDataBinding$OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private c mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final d CREATE_PROPERTY_LISTENER = new Y0.h(8);
    private static final d CREATE_LIST_LISTENER = new b4.d();
    private static final d CREATE_MAP_LISTENER = new O1.e(9);
    private static final d CREATE_LIVE_DATA_LISTENER = new Y0.h(9);
    private static final b REBIND_NOTIFIER = new o(1);
    private static final ReferenceQueue<v> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new I1.n(1);

    public v(Object obj, View view, int i5) {
        if (obj != null) {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.mRebindRunnable = new A1.h(11, this);
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mLocalFieldObservers = new w[i5];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new V.a(1, this);
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    public static void access$300() {
        while (true) {
            Reference<? extends v> referencePoll = sReferenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof w) {
                ((w) referencePoll).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.view.View r5, java.lang.Object[] r6, android.util.SparseIntArray r7, boolean r8) {
        /*
            androidx.databinding.v r0 = getBinding(r5)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r5.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L12
            java.lang.String r0 = (java.lang.String) r0
            goto L13
        L12:
            r0 = 0
        L13:
            r1 = 0
            if (r8 == 0) goto L5c
            if (r0 == 0) goto L5c
            java.lang.String r8 = "layout"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L5c
            r8 = 95
            int r8 = r0.lastIndexOf(r8)
            if (r8 <= 0) goto L82
            int r8 = r8 + 1
            int r2 = r0.length()
            if (r2 != r8) goto L31
            goto L82
        L31:
            r3 = r8
        L32:
            if (r3 >= r2) goto L42
            char r4 = r0.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L3f
            goto L82
        L3f:
            int r3 = r3 + 1
            goto L32
        L42:
            int r2 = r0.length()
            r3 = r1
        L47:
            if (r8 >= r2) goto L55
            int r3 = r3 * 10
            char r4 = r0.charAt(r8)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r8 = r8 + 1
            goto L47
        L55:
            r8 = r6[r3]
            if (r8 != 0) goto L97
            r6[r3] = r5
            goto L97
        L5c:
            if (r0 == 0) goto L82
            java.lang.String r8 = "binding_"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L82
            int r8 = androidx.databinding.v.BINDING_NUMBER_START
            int r2 = r0.length()
            r3 = r1
        L6d:
            if (r8 >= r2) goto L7b
            int r3 = r3 * 10
            char r4 = r0.charAt(r8)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r8 = r8 + 1
            goto L6d
        L7b:
            r8 = r6[r3]
            if (r8 != 0) goto L97
            r6[r3] = r5
            goto L97
        L82:
            int r8 = r5.getId()
            if (r8 <= 0) goto L97
            if (r7 == 0) goto L97
            r0 = -1
            int r8 = r7.get(r8, r0)
            if (r8 < 0) goto L97
            r0 = r6[r8]
            if (r0 != 0) goto L97
            r6[r8] = r5
        L97:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto Lae
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = r5.getChildCount()
            r0 = r1
        La2:
            if (r0 >= r8) goto Lae
            android.view.View r2 = r5.getChildAt(r0)
            b(r2, r6, r7, r1)
            int r0 = r0 + 1
            goto La2
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.v.b(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public static v bind(Object obj, View view, int i5) {
        if (obj == null) {
            return g.f3629a.getDataBinder((f) null, view, i5);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static void executeBindingsOn(v vVar) {
        vVar.a();
    }

    public static v getBinding(View view) {
        if (view != null) {
            return (v) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public static int getColorFromResource(View view, int i5) {
        return view.getContext().getColor(i5);
    }

    public static ColorStateList getColorStateListFromResource(View view, int i5) {
        return view.getContext().getColorStateList(i5);
    }

    public static Drawable getDrawableFromResource(View view, int i5) {
        return view.getContext().getDrawable(i5);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k5) {
        if (map == null) {
            return null;
        }
        return map.get(k5);
    }

    public static <T> T getFromArray(T[] tArr, int i5) {
        if (tArr == null || i5 < 0 || i5 >= tArr.length) {
            return null;
        }
        return tArr[i5];
    }

    public static <T> T getFromList(C0707e c0707e, int i5) {
        if (c0707e == null || i5 < 0) {
            return null;
        }
        return (T) c0707e.c(i5, null);
    }

    public static <T extends v> T inflateInternal(LayoutInflater layoutInflater, int i5, ViewGroup viewGroup, boolean z4, Object obj) {
        if (obj == null) {
            return (T) g.c(layoutInflater, i5, viewGroup, z4);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static Object[] mapBindings(f fVar, View view, int i5, q qVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i5];
        b(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public static boolean parse(String str, boolean z4) {
        return str == null ? z4 : Boolean.parseBoolean(str);
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(v vVar, h hVar, s sVar) {
        if (hVar != sVar && hVar != null) {
            throw new ClassCastException();
        }
    }

    public static <T> void setTo(T[] tArr, int i5, T t4) {
        if (tArr == null || i5 < 0 || i5 >= tArr.length) {
            return;
        }
        tArr[i5] = t4;
    }

    public final void a() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            c cVar = this.mRebindCallbacks;
            if (cVar != null) {
                cVar.c(this, 1);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.c(this, 2);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                c cVar2 = this.mRebindCallbacks;
                if (cVar2 != null) {
                    cVar2.c(this, 3);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    public void addOnRebindCallback(n nVar) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new c(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.a(nVar);
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        v vVar = this.mContainingBinding;
        if (vVar == null) {
            a();
        } else {
            vVar.executePendingBindings();
        }
    }

    public void forceExecuteBindings() {
        executeBindings();
    }

    public InterfaceC0159w getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int i5) {
        w wVar = this.mLocalFieldObservers[i5];
        if (wVar == null) {
            return null;
        }
        return wVar.f3640c;
    }

    public View getRoot() {
        return this.mRoot;
    }

    public void handleFieldChange(int i5, Object obj, int i6) {
        if (this.mInLiveDataRegisterObserver || this.mInStateFlowRegisterObserver || !onFieldChange(i5, obj, i6)) {
            return;
        }
        requestRebind();
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i5, Object obj, int i6);

    public void registerTo(int i5, Object obj, d dVar) {
        if (obj == null) {
            return;
        }
        w wVarD = this.mLocalFieldObservers[i5];
        if (wVarD == null) {
            wVarD = dVar.d(this, i5, sReferenceQueue);
            this.mLocalFieldObservers[i5] = wVarD;
            InterfaceC0159w interfaceC0159w = this.mLifecycleOwner;
            if (interfaceC0159w != null) {
                wVarD.f3638a.b(interfaceC0159w);
            }
        }
        wVarD.a();
        wVarD.f3640c = obj;
        wVarD.f3638a.a(obj);
    }

    public void removeOnRebindCallback(n nVar) {
        c cVar = this.mRebindCallbacks;
        if (cVar != null) {
            cVar.f(nVar);
        }
    }

    public void requestRebind() {
        v vVar = this.mContainingBinding;
        if (vVar != null) {
            vVar.requestRebind();
            return;
        }
        InterfaceC0159w interfaceC0159w = this.mLifecycleOwner;
        if (interfaceC0159w == null || ((C0161y) interfaceC0159w.getLifecycle()).f4031c.a(EnumC0154q.f4023g)) {
            synchronized (this) {
                try {
                    if (this.mPendingRebind) {
                        return;
                    }
                    this.mPendingRebind = true;
                    if (USE_CHOREOGRAPHER) {
                        this.mChoreographer.postFrameCallback(this.mFrameCallback);
                    } else {
                        this.mUIThreadHandler.post(this.mRebindRunnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setContainedBinding(v vVar) {
        if (vVar != null) {
            vVar.mContainingBinding = this;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.databinding.ViewDataBinding$OnStartListener] */
    public void setLifecycleOwner(InterfaceC0159w interfaceC0159w) {
        if (interfaceC0159w instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC0159w interfaceC0159w2 = this.mLifecycleOwner;
        if (interfaceC0159w2 == interfaceC0159w) {
            return;
        }
        if (interfaceC0159w2 != null) {
            interfaceC0159w2.getLifecycle().b(this.mOnStartListener);
        }
        this.mLifecycleOwner = interfaceC0159w;
        if (interfaceC0159w != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new InterfaceC0158v(this) { // from class: androidx.databinding.ViewDataBinding$OnStartListener

                    /* renamed from: a, reason: collision with root package name */
                    public final WeakReference f3624a;

                    {
                        this.f3624a = new WeakReference(this);
                    }

                    @H(EnumC0153p.ON_START)
                    public void onStart() {
                        v vVar = (v) this.f3624a.get();
                        if (vVar != null) {
                            vVar.executePendingBindings();
                        }
                    }
                };
            }
            interfaceC0159w.getLifecycle().a(this.mOnStartListener);
        }
        for (w wVar : this.mLocalFieldObservers) {
            if (wVar != null) {
                wVar.f3638a.b(interfaceC0159w);
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i5, Object obj);

    public void unbind() {
        for (w wVar : this.mLocalFieldObservers) {
            if (wVar != null) {
                wVar.a();
            }
        }
    }

    public boolean unregisterFrom(int i5) {
        w wVar = this.mLocalFieldObservers[i5];
        if (wVar != null) {
            return wVar.a();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i5, C c2) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i5, c2, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    public boolean updateRegistration(int i5, Object obj, d dVar) {
        if (obj == null) {
            return unregisterFrom(i5);
        }
        w wVar = this.mLocalFieldObservers[i5];
        if (wVar == null) {
            registerTo(i5, obj, dVar);
            return true;
        }
        if (wVar.f3640c == obj) {
            return false;
        }
        unregisterFrom(i5);
        registerTo(i5, obj, dVar);
        return true;
    }

    public static <T> T getFromList(List<T> list, int i5) {
        if (list == null || i5 < 0 || i5 >= list.size()) {
            return null;
        }
        return list.get(i5);
    }

    public static byte parse(String str, byte b2) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b2;
        }
    }

    public static long safeUnbox(Long l4) {
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i5) {
        if (zArr == null || i5 < 0 || i5 >= zArr.length) {
            return false;
        }
        return zArr[i5];
    }

    public static Object[] mapBindings(f fVar, View[] viewArr, int i5, q qVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i5];
        for (View view : viewArr) {
            b(view, objArr, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s2) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s2;
        }
    }

    public static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public static void setTo(boolean[] zArr, int i5, boolean z4) {
        if (zArr == null || i5 < 0 || i5 >= zArr.length) {
            return;
        }
        zArr[i5] = z4;
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i5) {
        if (sparseArray == null || i5 < 0) {
            return null;
        }
        return sparseArray.get(i5);
    }

    public static int parse(String str, int i5) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    public static byte safeUnbox(Byte b2) {
        if (b2 == null) {
            return (byte) 0;
        }
        return b2.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i5) {
        if (bArr == null || i5 < 0 || i5 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i5];
    }

    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i5) {
        if (longSparseArray == null || i5 < 0) {
            return null;
        }
        return longSparseArray.get(i5);
    }

    public static long parse(String str, long j5) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j5;
        }
    }

    public static char safeUnbox(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    public static void setTo(byte[] bArr, int i5, byte b2) {
        if (bArr == null || i5 < 0 || i5 >= bArr.length) {
            return;
        }
        bArr[i5] = b2;
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i5) {
        if (sparseBooleanArray == null || i5 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i5);
    }

    public static float parse(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static double safeUnbox(Double d5) {
        if (d5 == null) {
            return 0.0d;
        }
        return d5.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i5) {
        if (sArr == null || i5 < 0 || i5 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i5];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i5) {
        if (sparseIntArray == null || i5 < 0) {
            return 0;
        }
        return sparseIntArray.get(i5);
    }

    public static double parse(String str, double d5) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d5;
        }
    }

    public static float safeUnbox(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static void setTo(short[] sArr, int i5, short s2) {
        if (sArr == null || i5 < 0 || i5 >= sArr.length) {
            return;
        }
        sArr[i5] = s2;
    }

    public boolean updateRegistration(int i5, j jVar) {
        return updateRegistration(i5, jVar, CREATE_PROPERTY_LISTENER);
    }

    public static long getFromList(SparseLongArray sparseLongArray, int i5) {
        if (sparseLongArray == null || i5 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i5);
    }

    public static char parse(String str, char c2) {
        return (str == null || str.isEmpty()) ? c2 : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i5, k kVar) {
        return updateRegistration(i5, kVar, CREATE_LIST_LISTENER);
    }

    public static char getFromArray(char[] cArr, int i5) {
        if (cArr == null || i5 < 0 || i5 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i5];
    }

    public static void setTo(char[] cArr, int i5, char c2) {
        if (cArr == null || i5 < 0 || i5 >= cArr.length) {
            return;
        }
        cArr[i5] = c2;
    }

    public boolean updateRegistration(int i5, l lVar) {
        return updateRegistration(i5, lVar, CREATE_MAP_LISTENER);
    }

    public static int getFromArray(int[] iArr, int i5) {
        if (iArr == null || i5 < 0 || i5 >= iArr.length) {
            return 0;
        }
        return iArr[i5];
    }

    public static void setTo(int[] iArr, int i5, int i6) {
        if (iArr == null || i5 < 0 || i5 >= iArr.length) {
            return;
        }
        iArr[i5] = i6;
    }

    public static long getFromArray(long[] jArr, int i5) {
        if (jArr == null || i5 < 0 || i5 >= jArr.length) {
            return 0L;
        }
        return jArr[i5];
    }

    public static void setTo(long[] jArr, int i5, long j5) {
        if (jArr == null || i5 < 0 || i5 >= jArr.length) {
            return;
        }
        jArr[i5] = j5;
    }

    public static float getFromArray(float[] fArr, int i5) {
        if (fArr == null || i5 < 0 || i5 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i5];
    }

    public static void setTo(float[] fArr, int i5, float f) {
        if (fArr == null || i5 < 0 || i5 >= fArr.length) {
            return;
        }
        fArr[i5] = f;
    }

    public static double getFromArray(double[] dArr, int i5) {
        if (dArr == null || i5 < 0 || i5 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i5];
    }

    public static void setTo(double[] dArr, int i5, double d5) {
        if (dArr == null || i5 < 0 || i5 >= dArr.length) {
            return;
        }
        dArr[i5] = d5;
    }

    public static <T> void setTo(List<T> list, int i5, T t4) {
        if (list == null || i5 < 0 || i5 >= list.size()) {
            return;
        }
        list.set(i5, t4);
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i5, T t4) {
        if (sparseArray == null || i5 < 0 || i5 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i5, t4);
    }

    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i5, T t4) {
        if (longSparseArray == null || i5 < 0 || i5 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i5, t4);
    }

    public static <T> void setTo(C0707e c0707e, int i5, T t4) {
        if (c0707e == null || i5 < 0 || i5 >= c0707e.e()) {
            return;
        }
        c0707e.d(i5, t4);
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i5, boolean z4) {
        if (sparseBooleanArray == null || i5 < 0 || i5 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i5, z4);
    }

    public static void setTo(SparseIntArray sparseIntArray, int i5, int i6) {
        if (sparseIntArray == null || i5 < 0 || i5 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i5, i6);
    }

    public static void setTo(SparseLongArray sparseLongArray, int i5, long j5) {
        if (sparseLongArray == null || i5 < 0 || i5 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i5, j5);
    }

    public static <K, T> void setTo(Map<K, T> map, K k5, T t4) {
        if (map == null) {
            return;
        }
        map.put(k5, t4);
    }
}
