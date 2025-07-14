package A3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import b3.AbstractC0219i;
import b3.r;
import com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0240c;
import com.google.android.gms.internal.p000firebaseauthapi.f5;
import com.idm.providers.mo.IDMMoInterface;
import com.wssyncmldm.R;
import k.Q0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static final void a(int i5, View view) {
        AbstractC0219i.e("view", view);
        int iC = Q0.c(i5);
        if (iC == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iC == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iC == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iC != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static final int b(int i5) {
        if (i5 == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i5) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return -1;
            default:
                throw null;
        }
    }

    public static int c(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 != 4) {
            return i5 != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int d(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 != 3) {
            return i5 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int e(int i5) {
        if (i5 == 1) {
            return R.anim.sesl_fragment_open_enter;
        }
        if (i5 == 2) {
            return R.anim.sesl_fragment_open_enter_rtl;
        }
        throw null;
    }

    public static /* synthetic */ int f(int i5) {
        if (i5 == 1) {
            return R.anim.sesl_fragment_open_exit;
        }
        if (i5 == 2) {
            return R.anim.sesl_fragment_open_exit_rtl;
        }
        throw null;
    }

    public static /* synthetic */ boolean g(int i5) {
        if (i5 == 1 || i5 == 2) {
            return false;
        }
        if (i5 == 3 || i5 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int h(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 3) {
            return 2;
        }
        if (i5 == 4) {
            return 3;
        }
        if (i5 == 5) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int i(int i5) {
        switch (i5) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return -1;
            default:
                throw null;
        }
    }

    public static int j(int i5, int i6, int i7) {
        return f5.a0(i5) + i6 + i7;
    }

    public static int k(int i5, int i6, int i7, int i8) {
        return f5.a0(i5) + i6 + i7 + i8;
    }

    public static String l(int i5, String str) {
        return str + i5;
    }

    public static String m(r rVar, Class cls, StringBuilder sb) {
        sb.append(rVar.b(cls));
        return sb.toString();
    }

    public static String n(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void q(int i5, String str) {
        if (i5 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0219i.class.getName();
            int i6 = 0;
            while (!stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            while (stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            StackTraceElement stackTraceElement = stackTrace[i6];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + IDMMoInterface.IDM_MO_ROOT_PATH + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC0219i.f(nullPointerException, AbstractC0219i.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void r(InterfaceC0240c interfaceC0240c) {
        if (interfaceC0240c != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void t(String str, int i5) {
        com.samsung.android.fotaagent.common.log.Log.I(str + i5);
    }

    public static /* synthetic */ void u(int i5, String str) {
        if (i5 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g4.f.c(str, " must not be null"));
        AbstractC0219i.f(nullPointerException, AbstractC0219i.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String v(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "OUT_VARIANCE" : "IN_VARIANCE" : "INVARIANT";
    }

    public static /* synthetic */ String w(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String x(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
