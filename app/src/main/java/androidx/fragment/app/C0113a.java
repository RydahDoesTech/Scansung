package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113a extends k0 implements Y {

    /* renamed from: q, reason: collision with root package name */
    public final a0 f3750q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3751r;

    /* renamed from: s, reason: collision with root package name */
    public int f3752s;

    public C0113a(a0 a0Var) {
        a0Var.D();
        M m4 = a0Var.f3782t;
        if (m4 != null) {
            m4.f3728e.getClassLoader();
        }
        this.f3869a = new ArrayList();
        this.f3875h = true;
        this.f3882p = false;
        this.f3752s = -1;
        this.f3750q = a0Var;
    }

    @Override // androidx.fragment.app.Y
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3874g) {
            return true;
        }
        a0 a0Var = this.f3750q;
        if (a0Var.f3768d == null) {
            a0Var.f3768d = new ArrayList();
        }
        a0Var.f3768d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.k0
    public final void c(int i5, Fragment fragment, String str, int i6) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            Z.d.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i5 != 0) {
            if (i5 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i7 = fragment.mFragmentId;
            if (i7 != 0 && i7 != i5) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i5);
            }
            fragment.mFragmentId = i5;
            fragment.mContainerId = i5;
        }
        b(new j0(fragment, i6));
        fragment.mFragmentManager = this.f3750q;
    }

    public final void d(int i5) {
        if (this.f3874g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i5);
            }
            ArrayList arrayList = this.f3869a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                j0 j0Var = (j0) arrayList.get(i6);
                Fragment fragment = j0Var.f3857b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i5;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + j0Var.f3857b + " to " + j0Var.f3857b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int e(boolean z4) {
        if (this.f3751r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new I.b(0));
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f3751r = true;
        boolean z5 = this.f3874g;
        a0 a0Var = this.f3750q;
        if (z5) {
            this.f3752s = a0Var.f3772i.getAndIncrement();
        } else {
            this.f3752s = -1;
        }
        a0Var.v(this, z4);
        return this.f3752s;
    }

    public final void f(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3876i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3752s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3751r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f3870b != 0 || this.f3871c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3870b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3871c));
            }
            if (this.f3872d != 0 || this.f3873e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3872d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3873e));
            }
            if (this.f3877j != 0 || this.f3878k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3877j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3878k);
            }
            if (this.f3879l != 0 || this.f3880m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3879l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3880m);
            }
        }
        ArrayList arrayList = this.f3869a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            j0 j0Var = (j0) arrayList.get(i5);
            switch (j0Var.f3856a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + j0Var.f3856a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i5);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(j0Var.f3857b);
            if (z4) {
                if (j0Var.f3859d != 0 || j0Var.f3860e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(j0Var.f3859d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(j0Var.f3860e));
                }
                if (j0Var.f != 0 || j0Var.f3861g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(j0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(j0Var.f3861g));
                }
            }
        }
    }

    public final C0113a g(Fragment fragment) {
        a0 a0Var = fragment.mFragmentManager;
        if (a0Var == null || a0Var == this.f3750q) {
            b(new j0(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3752s >= 0) {
            sb.append(" #");
            sb.append(this.f3752s);
        }
        if (this.f3876i != null) {
            sb.append(" ");
            sb.append(this.f3876i);
        }
        sb.append("}");
        return sb.toString();
    }
}
