package J;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: J.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056m {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1471a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1472b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1473c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1474d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1475e;

    public C0056m(ViewGroup viewGroup) {
        this.f1473c = viewGroup;
    }

    public final boolean a(float f, float f5, boolean z4) {
        ViewParent viewParentE;
        if (!this.f1474d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return X.a(viewParentE, this.f1473c, f, f5, z4);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    public final boolean b(float f, float f5) {
        ViewParent viewParentE;
        if (!this.f1474d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return X.b(viewParentE, this.f1473c, f, f5);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    public final boolean c(int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        ViewParent viewParentE;
        int i8;
        int i9;
        int[] iArr3;
        if (!this.f1474d || (viewParentE = e(i7)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f1473c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            int i10 = iArr2[0];
            i9 = iArr2[1];
            i8 = i10;
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr == null) {
            if (this.f1475e == null) {
                this.f1475e = new int[2];
            }
            iArr3 = this.f1475e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC0057n) {
            ((InterfaceC0057n) viewParentE).b(viewGroup, i5, i6, iArr3, i7);
        } else if (i7 == 0) {
            try {
                X.c(viewParentE, viewGroup, i5, i6, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i8;
            iArr2[1] = iArr2[1] - i9;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        ViewParent viewParentE;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f1474d || (viewParentE = e(i9)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f1473c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr2 == null) {
            if (this.f1475e == null) {
                this.f1475e = new int[2];
            }
            int[] iArr4 = this.f1475e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC0058o) {
            ((InterfaceC0058o) viewParentE).d(viewGroup, i5, i6, i7, i8, i9, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i7;
            iArr3[1] = iArr3[1] + i8;
            if (viewParentE instanceof InterfaceC0057n) {
                ((InterfaceC0057n) viewParentE).e(viewGroup, i5, i6, i7, i8, i9);
            } else if (i9 == 0) {
                try {
                    X.d(viewParentE, viewGroup, i5, i6, i7, i8);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e5);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i10;
            iArr[1] = iArr[1] - i11;
        }
        return true;
    }

    public final ViewParent e(int i5) {
        if (i5 == 0) {
            return this.f1471a;
        }
        if (i5 != 1) {
            return null;
        }
        return this.f1472b;
    }

    public final boolean f(int i5) {
        return e(i5) != null;
    }

    public final boolean g(int i5, int i6) {
        boolean zF;
        if (f(i6)) {
            return true;
        }
        if (this.f1474d) {
            ViewGroup viewGroup = this.f1473c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof InterfaceC0057n;
                if (z4) {
                    zF = ((InterfaceC0057n) parent).f(view, viewGroup, i5, i6);
                } else if (i6 == 0) {
                    try {
                        zF = X.f(parent, view, viewGroup, i5);
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i6 == 0) {
                        this.f1471a = parent;
                    } else if (i6 == 1) {
                        this.f1472b = parent;
                    }
                    if (z4) {
                        ((InterfaceC0057n) parent).a(view, viewGroup, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            X.e(parent, view, viewGroup, i5);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i5) {
        ViewParent viewParentE = e(i5);
        if (viewParentE != null) {
            boolean z4 = viewParentE instanceof InterfaceC0057n;
            ViewGroup viewGroup = this.f1473c;
            if (z4) {
                ((InterfaceC0057n) viewParentE).c(i5, viewGroup);
            } else if (i5 == 0) {
                try {
                    X.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i5 == 0) {
                this.f1471a = null;
            } else {
                if (i5 != 1) {
                    return;
                }
                this.f1472b = null;
            }
        }
    }
}
