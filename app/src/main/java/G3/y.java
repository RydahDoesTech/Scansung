package g3;

import C3.C0012d;
import I3.C0042y;
import I3.EnumC0043z;
import I3.G;
import I3.Q;
import I3.Z;
import I3.f0;
import J.W;
import P2.B;
import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b3.AbstractC0219i;
import b3.InterfaceC0213c;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import com.samsung.android.knox.ex.peripheral.PeripheralConstants;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import com.wssyncmldm.R;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0436t;
import e4.C0440x;
import e4.K;
import e4.N;
import e4.O;
import e4.S;
import e4.X;
import f3.C0447c;
import j3.m0;
import j3.n0;
import j3.x0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k.Q0;
import k3.InterfaceC0672d;
import k3.InterfaceC0673e;
import m3.AbstractC0695h;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0750L;
import p3.InterfaceC0755Q;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0765i;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import p3.U;
import s3.C0843T;
import s3.C0867w;

/* loaded from: classes.dex */
public abstract class y {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class A(InterfaceC0453c interfaceC0453c) {
        AbstractC0219i.e("<this>", interfaceC0453c);
        Class clsA = ((InterfaceC0213c) interfaceC0453c).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Class B(InterfaceC0453c interfaceC0453c) {
        AbstractC0219i.e("<this>", interfaceC0453c);
        Class clsA = ((InterfaceC0213c) interfaceC0453c).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Type C(s sVar) {
        int i5 = sVar.f6782a;
        if (i5 == 0) {
            return z.f6791c;
        }
        m0 m0Var = sVar.f6783b;
        AbstractC0219i.b(m0Var);
        int iC = Q0.c(i5);
        if (iC == 0) {
            return j(m0Var, true);
        }
        if (iC == 1) {
            return new z(null, j(m0Var, true));
        }
        if (iC == 2) {
            return new z(j(m0Var, true), null);
        }
        throw new O2.d();
    }

    public static final InterfaceC0453c D(b3.j jVar) {
        InterfaceC0454d interfaceC0454dC = ((m0) jVar).c();
        if (interfaceC0454dC != null) {
            return E(interfaceC0454dC);
        }
        throw new O2.e("Cannot calculate JVM erasure for type: " + jVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0453c E(InterfaceC0454d interfaceC0454d) {
        InterfaceC0761e interfaceC0761e;
        if (interfaceC0454d instanceof InterfaceC0453c) {
            return (InterfaceC0453c) interfaceC0454d;
        }
        if (!(interfaceC0454d instanceof InterfaceC0467q)) {
            throw new O2.e("Cannot calculate JVM erasure for type: " + interfaceC0454d, 2);
        }
        InterfaceC0466p interfaceC0466p = n0.f7421g[0];
        Object objA = ((n0) ((InterfaceC0467q) interfaceC0454d)).f7423e.a();
        AbstractC0219i.d("<get-upperBounds>(...)", objA);
        List list = (List) objA;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            b3.j jVar = (b3.j) next;
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl", jVar);
            InterfaceC0763g interfaceC0763gI = ((m0) jVar).f7416a.I0().i();
            interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
            if (interfaceC0761e != null && interfaceC0761e.L() != 2 && interfaceC0761e.L() != 5) {
                interfaceC0761e = next;
                break;
            }
        }
        b3.j jVar2 = (b3.j) interfaceC0761e;
        if (jVar2 == null) {
            jVar2 = (b3.j) P2.m.w0(list);
        }
        return jVar2 != null ? D(jVar2) : b3.q.f5100a.b(Object.class);
    }

    public static final InterfaceC0453c F(Class cls) {
        AbstractC0219i.e("<this>", cls);
        return b3.q.f5100a.b(cls);
    }

    public static String G(TextView textView) {
        return textView.getText().toString();
    }

    public static final Method H(Class cls, InterfaceC0759c interfaceC0759c) throws NoSuchMethodException, SecurityException {
        AbstractC0219i.e("descriptor", interfaceC0759c);
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            AbstractC0219i.d("{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }", declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new O2.e("No unbox method found in inline class: " + cls + " (calling " + interfaceC0759c + ')', 2);
        }
    }

    public static int I(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 4) {
            return 2;
        }
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 32) {
            return 5;
        }
        if (i5 == 64) {
            return 6;
        }
        if (i5 == 128) {
            return 7;
        }
        if (i5 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(A3.f.l(i5, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean J(Configuration configuration) throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(Configuration.class, "hidden_semDesktopModeEnabled", new Class[0]);
        Object objE = methodR != null ? J2.b.E(configuration, methodR, new Object[0]) : null;
        int iIntValue = objE instanceof Integer ? ((Integer) objE).intValue() : -1;
        Method methodR2 = J2.b.r(Configuration.class, "hidden_SEM_DESKTOP_MODE_ENABLED", new Class[0]);
        Object objE2 = methodR2 != null ? J2.b.E(null, methodR2, new Object[0]) : null;
        return iIntValue == (objE2 instanceof Integer ? ((Integer) objE2).intValue() : 0);
    }

    public static final boolean K(InterfaceC0750L interfaceC0750L) {
        AbstractC0219i.e("<this>", interfaceC0750L);
        return interfaceC0750L.f() == null;
    }

    public static boolean L(Bundle bundle) {
        if (bundle.getString("serviceId", "").isEmpty()) {
            J2.b.c0("Service ID has to be set");
            return false;
        }
        if (bundle.getString("serviceVersion", "").isEmpty()) {
            J2.b.c0("No service version");
            return false;
        }
        if (bundle.getString("sdkVersion", "").isEmpty()) {
            J2.b.c0("No SDK version");
            return false;
        }
        if (bundle.getString("sdkType", "").isEmpty()) {
            J2.b.c0("No SDK type");
            return false;
        }
        if (bundle.getString("serviceAgreeType", "").isEmpty()) {
            J2.b.c0("You have to agree to terms and conditions");
            return false;
        }
        String string = bundle.getString("serviceAgreeType", "");
        J2.b.C("Agreement value: " + string);
        if (!IDMDmUICInterface.IDM_UIC_OPTION_IT_D.equals(string) && !"S".equals(string)) {
            J2.b.c0("Undefined agreement: " + string);
            return false;
        }
        if (!IDMDmUICInterface.IDM_UIC_OPTION_IT_D.equals(string) || bundle.getString(Preferences.PREFS_KEY_DID, "").isEmpty()) {
            return true;
        }
        J2.b.c0("You can't use setDeviceId API if you used setAgree as Diagnostic agreement");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static O2.c M(int i5, InterfaceC0106a interfaceC0106a) {
        A3.f.q(i5, "mode");
        int iC = Q0.c(i5);
        if (iC == 0) {
            return new O2.i(interfaceC0106a);
        }
        O2.k kVar = O2.k.f2015a;
        if (iC == 1) {
            O2.h hVar = new O2.h();
            hVar.f2009d = (b3.k) interfaceC0106a;
            hVar.f2010e = kVar;
            return hVar;
        }
        if (iC != 2) {
            throw new O2.d();
        }
        O2.m mVar = new O2.m();
        mVar.f2017d = (b3.k) interfaceC0106a;
        mVar.f2018e = kVar;
        return mVar;
    }

    public static List N(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC0219i.d("singletonList(element)", listSingletonList);
        return listSingletonList;
    }

    public static final n4.f O(ArrayList arrayList) {
        n4.f fVar = new n4.f();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            X3.n nVar = (X3.n) next;
            if (nVar != null && nVar != X3.m.f2791b) {
                fVar.add(next);
            }
        }
        return fVar;
    }

    public static void P(Bundle bundle, String str) {
        try {
            V1.g.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e5) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e5);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e6) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e6);
                }
            }
            String str2 = true != com.google.firebase.messaging.h.h(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String string8 = bundle2.toString();
                StringBuilder sb = new StringBuilder(string8.length() + str.length() + 37);
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(string8);
                Log.d("FirebaseMessaging", sb.toString());
            }
            if (V1.g.d().b(W1.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final int Q(EnumC0043z enumC0043z) {
        int i5 = enumC0043z == null ? -1 : a4.x.f3098a[enumC0043z.ordinal()];
        if (i5 == 1) {
            return 1;
        }
        int i6 = 2;
        if (i5 != 2) {
            i6 = 3;
            if (i5 != 3) {
                i6 = 4;
                if (i5 != 4) {
                    return 1;
                }
            }
        }
        return i6;
    }

    public static void R(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final Q S(Q q5, K3.g gVar) {
        AbstractC0219i.e("<this>", q5);
        AbstractC0219i.e("typeTable", gVar);
        int i5 = q5.f;
        if ((i5 & 256) == 256) {
            return q5.f1083p;
        }
        if ((i5 & 512) == 512) {
            return gVar.a(q5.f1084q);
        }
        return null;
    }

    public static final Q T(C0042y c0042y, K3.g gVar) {
        AbstractC0219i.e("<this>", c0042y);
        AbstractC0219i.e("typeTable", gVar);
        if (c0042y.p()) {
            return c0042y.f1400m;
        }
        if ((c0042y.f & 64) == 64) {
            return gVar.a(c0042y.n);
        }
        return null;
    }

    public static final Q U(C0042y c0042y, K3.g gVar) {
        AbstractC0219i.e("<this>", c0042y);
        AbstractC0219i.e("typeTable", gVar);
        int i5 = c0042y.f;
        if ((i5 & 8) == 8) {
            Q q5 = c0042y.f1397j;
            AbstractC0219i.d("returnType", q5);
            return q5;
        }
        if ((i5 & 16) == 16) {
            return gVar.a(c0042y.f1398k);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final Q V(G g5, K3.g gVar) {
        AbstractC0219i.e("<this>", g5);
        AbstractC0219i.e("typeTable", gVar);
        int i5 = g5.f;
        if ((i5 & 8) == 8) {
            Q q5 = g5.f1004j;
            AbstractC0219i.d("returnType", q5);
            return q5;
        }
        if ((i5 & 16) == 16) {
            return gVar.a(g5.f1005k);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final Object W(Set set, Enum r22, Enum r32, Enum r4, boolean z4) {
        if (!z4) {
            if (r4 != null) {
                set = P2.m.R0(B.s0(set, r4));
            }
            return P2.m.K0(set);
        }
        Enum r12 = set.contains(r22) ? r22 : set.contains(r32) ? r32 : null;
        if (AbstractC0219i.a(r12, r22) && AbstractC0219i.a(r4, r32)) {
            return null;
        }
        return r4 == null ? r12 : r4;
    }

    public static void X(TextView textView, String str) {
        CharSequence text = textView.getText();
        if (str != text) {
            if (str == null && text.length() == 0) {
                return;
            }
            if (!(str instanceof Spanned)) {
                if ((str == null) == (text == null)) {
                    if (str == null) {
                        return;
                    }
                    int length = str.length();
                    if (length == text.length()) {
                        for (int i5 = 0; i5 < length; i5++) {
                            if (str.charAt(i5) == text.charAt(i5)) {
                            }
                        }
                        return;
                    }
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }

    public static void Y(TextView textView, androidx.databinding.h hVar) {
        TextWatcher yVar = hVar == null ? null : new R1.y(1, hVar);
        int i5 = T.c.f2545a;
        Object tag = textView.getTag(R.id.textWatcher);
        textView.setTag(R.id.textWatcher, yVar);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (yVar != null) {
            textView.addTextChangedListener(yVar);
        }
    }

    public static boolean Z(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final String a(Type type) {
        String name;
        String string;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            o4.k kVarH0 = o4.m.h0(type, x.f6790l);
            StringBuilder sb = new StringBuilder();
            Iterator it = kVarH0.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            sb.append(((Class) next).getName());
            int iF0 = o4.m.f0(kVarH0);
            if (iF0 < 0) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + iF0 + '.').toString());
            }
            if (iF0 != 0) {
                string = "[]";
                if (iF0 != 1) {
                    StringBuilder sb2 = new StringBuilder(2 * iF0);
                    C0447c c0447c = new C0447c(1, iF0, 1);
                    int i5 = c0447c.f;
                    int i6 = c0447c.f6730e;
                    boolean z4 = i5 <= 0 ? 1 >= i6 : 1 <= i6;
                    int i7 = z4 ? 1 : i6;
                    while (z4) {
                        if (i7 != i6) {
                            i7 += i5;
                        } else {
                            if (!z4) {
                                throw new NoSuchElementException();
                            }
                            z4 = false;
                        }
                        sb2.append((CharSequence) "[]");
                    }
                    string = sb2.toString();
                    AbstractC0219i.d("{\n                    va…tring()\n                }", string);
                }
            } else {
                string = "";
            }
            sb.append(string);
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        AbstractC0219i.d("{\n        if (type.isArr…   } else type.name\n    }", name);
        return name;
    }

    public static final N3.c a0(N3.c cVar, N3.c cVar2) {
        AbstractC0219i.e("<this>", cVar);
        AbstractC0219i.e("prefix", cVar2);
        if (!cVar.equals(cVar2) && !cVar2.d()) {
            String strB = cVar.b();
            String strB2 = cVar2.b();
            if (!p4.h.o0(strB, strB2) || strB.charAt(strB2.length()) != '.') {
                return cVar;
            }
        }
        if (cVar2.d()) {
            return cVar;
        }
        if (cVar.equals(cVar2)) {
            N3.c cVar3 = N3.c.f1833c;
            AbstractC0219i.d("ROOT", cVar3);
            return cVar3;
        }
        String strSubstring = cVar.b().substring(cVar2.b().length() + 1);
        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
        return new N3.c(strSubstring);
    }

    public static void b(StringBuilder sb, Object obj, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("<this>", sb);
        if (interfaceC0107b != null) {
            sb.append((CharSequence) interfaceC0107b.d(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int b0(Context context, int i5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i5});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Class c0(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        Class clsD0 = d0(abstractC0438v.I0().i());
        if (clsD0 == null) {
            return null;
        }
        if (!X.e(abstractC0438v)) {
            return clsD0;
        }
        AbstractC0442z abstractC0442zF = Q3.j.f(abstractC0438v);
        if (abstractC0442zF == null || X.e(abstractC0442zF) || AbstractC0695h.E(abstractC0442zF)) {
            return null;
        }
        return clsD0;
    }

    public static final Class d0(InterfaceC0766j interfaceC0766j) {
        if (!(interfaceC0766j instanceof InterfaceC0761e) || !Q3.j.b(interfaceC0766j)) {
            return null;
        }
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) interfaceC0766j;
        Class clsJ = x0.j(interfaceC0761e);
        if (clsJ != null) {
            return clsJ;
        }
        throw new O2.e("Class object for the class " + interfaceC0761e.getName() + " cannot be found (classId=" + U3.f.f((InterfaceC0763g) interfaceC0766j) + ')', 2);
    }

    public static final void e(View view) {
        AbstractC0219i.e("<this>", view);
        W w3 = new W(view, null);
        o4.l lVar = new o4.l();
        lVar.f8316g = w3.d(lVar, lVar);
        while (lVar.hasNext()) {
            View view2 = (View) lVar.next();
            Q.a aVar = (Q.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new Q.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f2273a;
            int iG0 = P2.n.g0(arrayList);
            if (-1 < iG0) {
                arrayList.get(iG0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static final Q e0(Z z4, K3.g gVar) {
        AbstractC0219i.e("typeTable", gVar);
        int i5 = z4.f;
        if ((i5 & 4) == 4) {
            Q q5 = z4.f1153i;
            AbstractC0219i.d("type", q5);
            return q5;
        }
        if ((i5 & 8) == 8) {
            return gVar.a(z4.f1154j);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static void f(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static S f0(S s2) {
        if (!(s2 instanceof C0436t)) {
            return new R3.d(s2, true);
        }
        C0436t c0436t = (C0436t) s2;
        N[] nArr = c0436t.f6697c;
        AbstractC0219i.e("<this>", nArr);
        InterfaceC0755Q[] interfaceC0755QArr = c0436t.f6696b;
        AbstractC0219i.e("other", interfaceC0755QArr);
        int iMin = Math.min(nArr.length, interfaceC0755QArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i5 = 0; i5 < iMin; i5++) {
            arrayList.add(new O2.f(nArr[i5], interfaceC0755QArr[i5]));
        }
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O2.f fVar = (O2.f) it.next();
            arrayList2.add(m((N) fVar.f2006d, (InterfaceC0755Q) fVar.f2007e));
        }
        return new C0436t(interfaceC0755QArr, (N[]) arrayList2.toArray(new N[0]), true);
    }

    public static void g(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Object i(Object obj, InterfaceC0759c interfaceC0759c) {
        AbstractC0438v abstractC0438vU;
        Class clsC0;
        return (((interfaceC0759c instanceof InterfaceC0750L) && Q3.j.d((U) interfaceC0759c)) || (abstractC0438vU = u(interfaceC0759c)) == null || (clsC0 = c0(abstractC0438vU)) == null) ? obj : H(clsC0, interfaceC0759c).invoke(obj, null);
    }

    public static final Type j(b3.j jVar, boolean z4) {
        m0 m0Var = (m0) jVar;
        InterfaceC0454d interfaceC0454dC = m0Var.c();
        if (interfaceC0454dC instanceof InterfaceC0467q) {
            return new v((InterfaceC0467q) interfaceC0454dC);
        }
        if (!(interfaceC0454dC instanceof InterfaceC0453c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + m0Var);
        }
        InterfaceC0453c interfaceC0453c = (InterfaceC0453c) interfaceC0454dC;
        Class clsA = z4 ? A(interfaceC0453c) : z(interfaceC0453c);
        List listB = m0Var.b();
        if (listB.isEmpty()) {
            return clsA;
        }
        if (!clsA.isArray()) {
            return p(clsA, listB);
        }
        if (clsA.getComponentType().isPrimitive()) {
            return clsA;
        }
        s sVar = (s) P2.m.L0(listB);
        if (sVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + m0Var);
        }
        int i5 = sVar.f6782a;
        int i6 = i5 == 0 ? -1 : w.f6789a[Q0.c(i5)];
        if (i6 == -1 || i6 == 1) {
            return clsA;
        }
        if (i6 != 2 && i6 != 3) {
            throw new O2.d();
        }
        m0 m0Var2 = sVar.f6783b;
        AbstractC0219i.b(m0Var2);
        Type typeJ = j(m0Var2, false);
        return typeJ instanceof Class ? clsA : new C0451a(typeJ);
    }

    public static final Collection k(Collection collection, Collection collection2) {
        AbstractC0219i.e("collection", collection2);
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static X3.n l(String str, List list) {
        X3.m mVar;
        AbstractC0219i.e("debugName", str);
        n4.f fVar = new n4.f();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mVar = X3.m.f2791b;
            if (!zHasNext) {
                break;
            }
            X3.n nVar = (X3.n) it.next();
            if (nVar != mVar) {
                if (nVar instanceof X3.a) {
                    X3.n[] nVarArr = ((X3.a) nVar).f2755c;
                    AbstractC0219i.e("elements", nVarArr);
                    fVar.addAll(P2.i.i0(nVarArr));
                } else {
                    fVar.add(nVar);
                }
            }
        }
        int i5 = fVar.f8193d;
        return i5 != 0 ? i5 != 1 ? new X3.a(str, (X3.n[]) fVar.toArray(new X3.n[0])) : (X3.n) fVar.get(0) : mVar;
    }

    public static final N m(N n, InterfaceC0755Q interfaceC0755Q) {
        if (interfaceC0755Q == null || n.a() == 1) {
            return n;
        }
        if (interfaceC0755Q.B() != n.a()) {
            R3.c cVar = new R3.c(n);
            e4.G.f6646e.getClass();
            return new O(1, new R3.a(n, cVar, false, e4.G.f));
        }
        if (!n.c()) {
            return new O(n.b());
        }
        d4.b bVar = d4.l.f6418e;
        AbstractC0219i.d("NO_LOCKS", bVar);
        return new O(1, new C0440x(bVar, new C0012d(4, n)));
    }

    public static final InterfaceC0673e n(InterfaceC0673e interfaceC0673e, InterfaceC0776t interfaceC0776t, boolean z4) {
        AbstractC0438v abstractC0438vO;
        AbstractC0438v abstractC0438vU;
        AbstractC0219i.e("descriptor", interfaceC0776t);
        if (!Q3.j.a(interfaceC0776t)) {
            List listV0 = interfaceC0776t.v0();
            AbstractC0219i.d("descriptor.valueParameters", listV0);
            if (!listV0.isEmpty()) {
                Iterator it = listV0.iterator();
                while (it.hasNext()) {
                    AbstractC0438v abstractC0438vD = ((C0843T) it.next()).d();
                    AbstractC0219i.d("it.type", abstractC0438vD);
                    if (Q3.j.c(abstractC0438vD)) {
                        break;
                    }
                }
                abstractC0438vO = interfaceC0776t.o();
                return abstractC0438vO != null ? interfaceC0673e : interfaceC0673e;
            }
            abstractC0438vO = interfaceC0776t.o();
            if ((abstractC0438vO != null || !Q3.j.c(abstractC0438vO)) && ((interfaceC0673e instanceof InterfaceC0672d) || (abstractC0438vU = u(interfaceC0776t)) == null || !Q3.j.c(abstractC0438vU))) {
                return interfaceC0673e;
            }
        }
        return new k3.u(interfaceC0673e, interfaceC0776t, z4);
    }

    public static final K o(InterfaceC0761e interfaceC0761e, InterfaceC0761e interfaceC0761e2) {
        AbstractC0219i.e("from", interfaceC0761e);
        AbstractC0219i.e("to", interfaceC0761e2);
        interfaceC0761e.r().size();
        interfaceC0761e2.r().size();
        List listR = interfaceC0761e.r();
        AbstractC0219i.d("from.declaredTypeParameters", listR);
        ArrayList arrayList = new ArrayList(P2.o.l0(listR));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0755Q) it.next()).I());
        }
        List listR2 = interfaceC0761e2.r();
        AbstractC0219i.d("to.declaredTypeParameters", listR2);
        ArrayList arrayList2 = new ArrayList(P2.o.l0(listR2));
        Iterator it2 = listR2.iterator();
        while (it2.hasNext()) {
            AbstractC0442z abstractC0442zQ = ((InterfaceC0755Q) it2.next()).q();
            AbstractC0219i.d("it.defaultType", abstractC0442zQ);
            arrayList2.add(V1.a.a(abstractC0442zQ));
        }
        return new K(P2.z.k0(P2.m.T0(arrayList, arrayList2)), false);
    }

    public static final u p(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(P2.o.l0(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C((s) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(P2.o.l0(list));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C((s) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        u uVarP = p(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(P2.o.l0(listSubList));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C((s) it3.next()));
        }
        return new u(cls, uVarP, arrayList3);
    }

    public static final C0770n q(f0 f0Var) {
        switch (f0Var == null ? -1 : a4.x.f3099b[f0Var.ordinal()]) {
            case 1:
                C0770n c0770n = AbstractC0771o.f8422d;
                AbstractC0219i.d(PeripheralConstants.ConnectivityType.INTERNAL, c0770n);
                return c0770n;
            case 2:
                C0770n c0770n2 = AbstractC0771o.f8419a;
                AbstractC0219i.d("PRIVATE", c0770n2);
                return c0770n2;
            case 3:
                C0770n c0770n3 = AbstractC0771o.f8420b;
                AbstractC0219i.d("PRIVATE_TO_THIS", c0770n3);
                return c0770n3;
            case 4:
                C0770n c0770n4 = AbstractC0771o.f8421c;
                AbstractC0219i.d("PROTECTED", c0770n4);
                return c0770n4;
            case 5:
                C0770n c0770n5 = AbstractC0771o.f8423e;
                AbstractC0219i.d("PUBLIC", c0770n5);
                return c0770n5;
            case 6:
                C0770n c0770n6 = AbstractC0771o.f;
                AbstractC0219i.d("LOCAL", c0770n6);
                return c0770n6;
            default:
                C0770n c0770n7 = AbstractC0771o.f8419a;
                AbstractC0219i.d("PRIVATE", c0770n7);
                return c0770n7;
        }
    }

    public static G3.p r(Y0.j jVar) {
        if (jVar instanceof M3.e) {
            M3.e eVar = (M3.e) jVar;
            String str = eVar.f1819c;
            AbstractC0219i.e("name", str);
            String str2 = eVar.f1820d;
            AbstractC0219i.e("desc", str2);
            return new G3.p(str.concat(str2));
        }
        if (!(jVar instanceof M3.d)) {
            throw new O2.d();
        }
        M3.d dVar = (M3.d) jVar;
        String str3 = dVar.f1817c;
        AbstractC0219i.e("name", str3);
        String str4 = dVar.f1818d;
        AbstractC0219i.e("desc", str4);
        return new G3.p(str3 + '#' + str4);
    }

    public static final InterfaceC0453c s(Annotation annotation) {
        AbstractC0219i.e("<this>", annotation);
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC0219i.d("this as java.lang.annota…otation).annotationType()", clsAnnotationType);
        return F(clsAnnotationType);
    }

    public static String t(PowerManager.WakeLock wakeLock, String str) {
        String strValueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public static final AbstractC0438v u(InterfaceC0759c interfaceC0759c) {
        C0867w c0867wB0 = interfaceC0759c.b0();
        C0867w c0867wF = interfaceC0759c.F();
        if (c0867wB0 != null) {
            return c0867wB0.d();
        }
        if (c0867wF != null) {
            if (interfaceC0759c instanceof InterfaceC0765i) {
                return c0867wF.d();
            }
            InterfaceC0766j interfaceC0766jL = interfaceC0759c.l();
            InterfaceC0761e interfaceC0761e = interfaceC0766jL instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766jL : null;
            if (interfaceC0761e != null) {
                return interfaceC0761e.q();
            }
        }
        return null;
    }

    public static int v() throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("android.view.PointerIcon", "hidden_SEM_TYPE_STYLUS_DEFAULT", new Class[0]);
        Object objE = methodS != null ? J2.b.E(null, methodS, new Object[0]) : null;
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return 1;
    }

    public static int w() throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("android.view.PointerIcon", "hidden_SEM_TYPE_STYLUS_PEN_SELECT", new Class[0]);
        Object objE = methodS != null ? J2.b.E(null, methodS, new Object[0]) : null;
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return 21;
    }

    public static int x() throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("android.view.PointerIcon", "hidden_SEM_TYPE_STYLUS_SCROLL_DOWN", new Class[0]);
        Object objE = methodS != null ? J2.b.E(null, methodS, new Object[0]) : null;
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return 15;
    }

    public static int y() throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("android.view.PointerIcon", "hidden_SEM_TYPE_STYLUS_SCROLL_UP", new Class[0]);
        Object objE = methodS != null ? J2.b.E(null, methodS, new Object[0]) : null;
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return 11;
    }

    public static final Class z(InterfaceC0453c interfaceC0453c) {
        AbstractC0219i.e("<this>", interfaceC0453c);
        Class clsA = ((InterfaceC0213c) interfaceC0453c).a();
        AbstractC0219i.c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsA);
        return clsA;
    }

    public Z0.a c(Context context, Looper looper, G3.d dVar, Object obj, Z0.d dVar2, Z0.e eVar) {
        return d(context, looper, dVar, obj, dVar2, eVar);
    }

    public Z0.a d(Context context, Looper looper, G3.d dVar, Object obj, Z0.d dVar2, Z0.e eVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
