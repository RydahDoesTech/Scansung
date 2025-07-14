package J2;

import B.f;
import G3.g;
import O.d;
import O.e;
import P2.s;
import X3.n;
import Y0.h;
import Y0.j;
import a2.InterfaceC0105c;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.TextView;
import b3.AbstractC0219i;
import com.google.firebase.messaging.q;
import com.samsung.context.sdk.samsunganalytics.BuildConfig;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import g3.InterfaceC0456f;
import g3.InterfaceC0466p;
import j2.InterfaceC0558a;
import j3.k0;
import j3.r;
import j3.x0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import k.AbstractC0605a1;
import k3.InterfaceC0673e;
import o3.C0721d;
import p3.InterfaceC0761e;
import r0.AbstractC0809c;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0105c {

    /* renamed from: a, reason: collision with root package name */
    public static a f1576a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Bundle f1577b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f1578c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static long f1579d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1580e = null;
    public static String f = "";

    /* renamed from: g, reason: collision with root package name */
    public static G2.a f1581g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f1582h;

    public static Method A(String str, String str2, Class... clsArr) {
        Class clsO = o(str);
        if (clsO == null) {
            return null;
        }
        try {
            return clsO.getMethod(str2, clsArr);
        } catch (NoSuchMethodException unused) {
            Log.w("SeslBaseReflector", "Reflector did not find method = ".concat(str2));
            return null;
        }
    }

    public static String B(int i5) {
        switch (i5) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i5);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    public static void C(String str) {
        G2.a aVar = f1581g;
        if (aVar == null) {
            Log.i("DIAGMON_SDK", str);
            return;
        }
        try {
            aVar.a(f);
            Log.i("DIAGMON_SDK" + aVar.f733b, str);
        } catch (Exception e5) {
            Log.e("DIAGMON_SDK", e5.getMessage());
        }
    }

    public static void D(Context context, String str) {
        try {
            if (f1581g != null || context == null || TextUtils.isEmpty(str)) {
                return;
            }
            f = str;
            f1581g = new G2.a();
        } catch (Exception e5) {
            Log.e("DIAGMON_SDK", e5.getMessage());
        }
    }

    public static Object E(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            Log.e("SeslBaseReflector", method.getName() + " IllegalAccessException", e5);
            return null;
        } catch (IllegalArgumentException e6) {
            Log.e("SeslBaseReflector", method.getName() + " IllegalArgumentException", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("SeslBaseReflector", method.getName() + " InvocationTargetException", e7);
            return null;
        }
    }

    public static boolean F(int i5, Rect rect, Rect rect2) {
        if (i5 == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            return (i6 > i7 || rect.left >= i7) && rect.left > rect2.left;
        }
        if (i5 == 33) {
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            return (i8 > i9 || rect.top >= i9) && rect.top > rect2.top;
        }
        if (i5 == 66) {
            int i10 = rect.left;
            int i11 = rect2.left;
            return (i10 < i11 || rect.right <= i11) && rect.right < rect2.right;
        }
        if (i5 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i12 = rect.top;
        int i13 = rect2.top;
        return (i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom;
    }

    public static boolean G() {
        try {
            if (f1580e == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1580e == null) {
                f1579d = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1580e = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1580e.invoke(null, Long.valueOf(f1579d))).booleanValue();
        } catch (Exception e5) {
            if (!(e5 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e5);
                return false;
            }
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean H(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean I(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true);
        return typedValue.data != 0;
    }

    public static final boolean J(int i5, String str) {
        char cCharAt = str.charAt(i5);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static int K(int i5, Rect rect, Rect rect2) {
        int i6;
        int i7;
        if (i5 == 17) {
            i6 = rect.left;
            i7 = rect2.right;
        } else if (i5 == 33) {
            i6 = rect.top;
            i7 = rect2.bottom;
        } else if (i5 == 66) {
            i6 = rect2.left;
            i7 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i6 = rect2.top;
            i7 = rect.bottom;
        }
        return Math.max(0, i6 - i7);
    }

    public static Bundle L(a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString("serviceId", aVar.f1571b);
        Context context = aVar.f1570a;
        bundle.putString("serviceVersion", AbstractC0415a.y(context));
        bundle.putString("serviceAgreeType", L2.a.a(aVar.f1570a) == 1 ? (String) aVar.f1575g.f : aVar.f1573d);
        bundle.putString(Preferences.PREFS_KEY_DID, aVar.f);
        String strValueOf = "";
        bundle.putString("trackingId", "");
        try {
            strValueOf = String.valueOf(BuildConfig.VERSION_CODE);
        } catch (Exception unused) {
        }
        bundle.putString("sdkVersion", strValueOf);
        bundle.putString("sdkType", "S");
        bundle.putString("pkgName", context.getPackageName());
        bundle.putBoolean("wifiOnly", true);
        C("generated SR object");
        return bundle;
    }

    public static String M(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb.append(str2.charAt(i5));
            }
        }
        return sb.toString();
    }

    public static int N(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static float O(EdgeEffect edgeEffect, float f5, float f6) {
        if (AbstractC0809c.g()) {
            return e.c(edgeEffect, f5, f6);
        }
        d.a(edgeEffect, f5, f6);
        return f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void P(android.content.Context r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25, int r26, java.util.List r27, long r28) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.b.P(android.content.Context, java.lang.String, int, java.lang.String, java.lang.String, int, java.util.List, long):void");
    }

    public static final void Q(Object[] objArr, int i5, int i6) {
        AbstractC0219i.e("<this>", objArr);
        while (i5 < i6) {
            objArr[i5] = null;
            i5++;
        }
    }

    public static TypedValue R(Context context, int i5) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean S(Context context, int i5, boolean z4) {
        TypedValue typedValueR = R(context, i5);
        return (typedValueR == null || typedValueR.type != 18) ? z4 : typedValueR.data != 0;
    }

    public static int T(Context context, int i5, int i6) {
        TypedValue typedValueR = R(context, i5);
        return (typedValueR == null || typedValueR.type != 16) ? i6 : typedValueR.data;
    }

    public static TimeInterpolator U(Context context, int i5, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!H(strValueOf, "cubic-bezier") && !H(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (H(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return L.a.b(y(strArrSplit, 0), y(strArrSplit, 1), y(strArrSplit, 2), y(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!H(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            f.b(j.s(strSubstring), path);
            return L.a.c(path);
        } catch (RuntimeException e5) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e5);
        }
    }

    public static TypedValue V(Context context, int i5, String str) {
        TypedValue typedValueR = R(context, i5);
        if (typedValueR != null) {
            return typedValueR;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i5)));
    }

    public static char[] W(TextPaint textPaint, String str, char[] cArr) throws NoSuchMethodException, SecurityException {
        Method methodR = r(TextUtils.class, "hidden_semGetPrefixCharForSpan", TextPaint.class, CharSequence.class, char[].class);
        if (methodR == null) {
            return new char[0];
        }
        Object objE = E(null, methodR, textPaint, str, cArr);
        if (objE instanceof char[]) {
            return (char[]) objE;
        }
        return null;
    }

    public static void X(AbstractC0605a1 abstractC0605a1, Field field, Integer num) throws IllegalAccessException, IllegalArgumentException {
        try {
            field.set(abstractC0605a1, num);
        } catch (IllegalAccessException e5) {
            Log.e("SeslBaseReflector", field.getName() + " IllegalAccessException", e5);
        } catch (IllegalArgumentException e6) {
            Log.e("SeslBaseReflector", field.getName() + " IllegalArgumentException", e6);
        }
    }

    public static void Y(a aVar) {
        int i5 = 0;
        try {
            i5 = aVar.f1570a.getPackageManager().getPackageInfo("com.sec.android.diagmonagent", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            l("DMA Client is not exist");
        }
        if (i5 == 0) {
            Log.w(L2.a.f1731a, "It is not supported : NO_DMA");
            return;
        }
        D(aVar.f1570a, aVar.f1571b);
        if (f1578c == 2) {
            c0("You can't use setConfiguration with enableDefaultConfiguration");
            return;
        }
        f1576a = aVar;
        f1578c = 3;
        k("setConfiguration type : ".concat("CUSTOM"));
        try {
            synchronized (b.class) {
                f1577b = L(f1576a);
                h.f().e(new K2.a(f1576a, f1577b));
            }
        } catch (Exception e5) {
            l("failed to setConfiguration" + e5);
        }
    }

    public static final String Z(InterfaceC0761e interfaceC0761e, String str) {
        String strI;
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        String str2 = C0721d.f8248a;
        N3.e eVarI = U3.f.g(interfaceC0761e).i();
        AbstractC0219i.d("fqNameSafe.toUnsafe()", eVarI);
        N3.b bVarF = C0721d.f(eVarI);
        if (bVarF != null) {
            strI = V3.b.b(bVarF).e();
            AbstractC0219i.d("byClassId(it).internalName", strI);
        } else {
            strI = j.i(interfaceC0761e, g.f759d);
        }
        AbstractC0219i.e("internalName", strI);
        return strI + '.' + str;
    }

    public static final void a0(Object obj) throws Throwable {
        if (obj instanceof O2.g) {
            throw ((O2.g) obj).f2008d;
        }
    }

    public static final String b0(String str) {
        AbstractC0219i.e("<this>", str);
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        AbstractC0219i.d("builder.toString()", string);
        return string;
    }

    public static void c0(String str) {
        G2.a aVar = f1581g;
        if (aVar == null) {
            Log.w("DIAGMON_SDK", str);
            return;
        }
        try {
            aVar.a(f);
            Log.w("DIAGMON_SDK" + aVar.f733b, str);
        } catch (Exception e5) {
            Log.e("DIAGMON_SDK", e5.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d0(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.isFile()
            if (r3 != 0) goto L1a
            boolean r3 = r0.isDirectory()
            if (r3 == 0) goto L12
            goto L1a
        L12:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "not found"
            r3.<init>(r4)
            throw r3
        L1a:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L45
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L45
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L41
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L41
            r3 = 8
            r2.setLevel(r3)     // Catch: java.lang.Throwable -> L3f
            e0(r0, r2)     // Catch: java.lang.Throwable -> L3f
            r2.finish()     // Catch: java.lang.Throwable -> L3f
            r2.close()
            r4.close()
            r1.close()
            return
        L3f:
            r3 = move-exception
            goto L4e
        L41:
            r0 = move-exception
            r2 = r3
            r3 = r0
            goto L4e
        L45:
            r4 = move-exception
            r2 = r3
        L47:
            r3 = r4
            r4 = r2
            goto L4e
        L4a:
            r4 = move-exception
            r1 = r3
            r2 = r1
            goto L47
        L4e:
            if (r2 == 0) goto L53
            r2.close()
        L53:
            if (r4 == 0) goto L58
            r4.close()
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.b.d0(java.lang.String, java.lang.String):void");
    }

    public static int e(View view) {
        AbstractC0219i.e("<this>", view);
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(A3.f.l(visibility, "Unknown visibility "));
    }

    public static void e0(File file, ZipOutputStream zipOutputStream) throws Throwable {
        if (file.isDirectory()) {
            if (file.getName().equalsIgnoreCase(".metadata")) {
                return;
            }
            for (File file2 : file.listFiles()) {
                e0(file2, zipOutputStream);
            }
            return;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            String path = file.getPath();
            Log.d(L2.a.f1731a, path);
            StringTokenizer stringTokenizer = new StringTokenizer(path, "/");
            int iCountTokens = stringTokenizer.countTokens();
            String string = stringTokenizer.toString();
            while (iCountTokens != 0) {
                iCountTokens--;
                string = stringTokenizer.nextToken();
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                ZipEntry zipEntry = new ZipEntry(string);
                zipEntry.setTime(file.lastModified());
                zipOutputStream.putNextEntry(zipEntry);
                byte[] bArr = new byte[2048];
                while (true) {
                    int i5 = bufferedInputStream2.read(bArr, 0, 2048);
                    if (i5 == -1) {
                        zipOutputStream.closeEntry();
                        bufferedInputStream2.close();
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i5);
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = g(r9, r10, r11)
            boolean r1 = g(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = K(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.b.f(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean g(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final String h(String str) {
        char cCharAt;
        AbstractC0219i.e("<this>", str);
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
        return upperCase + strSubstring;
    }

    public static final void i(TextView textView, int i5, int i6) {
        float f5;
        AbstractC0219i.e("<this>", textView);
        A3.f.q(i6, "maxFontScale");
        float f6 = textView.getResources().getConfiguration().fontScale;
        switch (i6) {
            case 1:
                f5 = 1.0f;
                break;
            case 2:
                f5 = 1.15f;
                break;
            case 3:
                f5 = 1.3f;
                break;
            case 4:
                f5 = 1.5f;
                break;
            case 5:
                f5 = 1.7f;
                break;
            case 6:
                f5 = 2.0f;
                break;
            default:
                throw null;
        }
        if (f6 > f5) {
            f6 = f5;
        }
        textView.setTextSize(0, textView.getResources().getDimensionPixelSize(i5) * f6);
    }

    public static boolean j(c cVar) {
        String str = L2.a.f1731a;
        Log.i(str, "Request CustomEventReport");
        a aVar = f1576a;
        if (aVar == null) {
            Log.w(str, "You first have to create DiagMonConfiguration");
            Log.w(str, "CustomEventReport is aborted");
            return false;
        }
        D(aVar.f1570a, aVar.f1571b);
        if (f1578c == 2) {
            c0("You can't use customEventReport with enableDefaultConfiguration");
            return false;
        }
        h.f().e(new q(f1576a, f1577b, cVar));
        return true;
    }

    public static void k(String str) {
        G2.a aVar = f1581g;
        if (aVar == null) {
            Log.d("DIAGMON_SDK", str);
            return;
        }
        try {
            aVar.a(f);
            Log.d("DIAGMON_SDK" + aVar.f733b, str);
        } catch (Exception e5) {
            Log.e("DIAGMON_SDK", e5.getMessage());
        }
    }

    public static void l(String str) {
        G2.a aVar = f1581g;
        if (aVar == null) {
            Log.e("DIAGMON_SDK", str);
            return;
        }
        try {
            aVar.a(f);
            Log.e("DIAGMON_SDK" + aVar.f733b, str);
        } catch (Exception e5) {
            Log.e("DIAGMON_SDK", e5.getMessage());
        }
    }

    public static final HashSet m(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setF = ((n) it.next()).f();
            if (setF == null) {
                return null;
            }
            s.n0(hashSet, setF);
        }
        return hashSet;
    }

    public static Object n(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e5) {
            Log.e("SeslBaseReflector", field.getName() + " IllegalAccessException", e5);
            return null;
        } catch (IllegalArgumentException e6) {
            Log.e("SeslBaseReflector", field.getName() + " IllegalArgumentException", e6);
            return null;
        }
    }

    public static Class o(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Log.w("SeslBaseReflector", "Fail to get class = ".concat(str));
            return null;
        }
    }

    public static Constructor p(String str, Class... clsArr) {
        try {
            return Class.forName(str).getDeclaredConstructor(clsArr);
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("SeslBaseReflector", "failed to get reflection - " + e5);
            return null;
        }
    }

    public static Field q(Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField;
        try {
            declaredField = cls.getDeclaredField(str);
            if (declaredField != null) {
                try {
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                    Log.w("SeslBaseReflector", "Reflector did not find field = ".concat(str));
                    return declaredField;
                }
            }
        } catch (NoSuchFieldException unused2) {
            declaredField = null;
        }
        return declaredField;
    }

    public static Method r(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                try {
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    Log.w("SeslBaseReflector", "Reflector did not find method = ".concat(str));
                    return declaredMethod;
                }
            }
        } catch (NoSuchMethodException unused2) {
            declaredMethod = null;
        }
        return declaredMethod;
    }

    public static Method s(String str, String str2, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Class clsO = o(str);
        Method declaredMethod = null;
        if (clsO != null) {
            try {
                declaredMethod = clsO.getDeclaredMethod(str2, clsArr);
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.w("SeslBaseReflector", "Reflector did not find method = ".concat(str2));
            }
        }
        return declaredMethod;
    }

    public static float t(EdgeEffect edgeEffect) {
        if (AbstractC0809c.g()) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Field u(String str) {
        try {
            return AudioManager.class.getField(str);
        } catch (NoSuchFieldException unused) {
            Log.w("SeslBaseReflector", "Reflector did not find field = ".concat(str));
            return null;
        }
    }

    public static float v(Paint paint) {
        Method methodZ = z(Paint.class, "getHCTStrokeWidth", new Class[0]);
        if (methodZ == null) {
            return 0.0f;
        }
        Object objE = E(paint, methodZ, new Object[0]);
        if (objE instanceof Float) {
            return ((Float) objE).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [O2.c, java.lang.Object] */
    public static final Field w(InterfaceC0466p interfaceC0466p) {
        AbstractC0219i.e("<this>", interfaceC0466p);
        k0 k0VarC = x0.c(interfaceC0466p);
        if (k0VarC != null) {
            return (Field) k0VarC.f7405i.getValue();
        }
        return null;
    }

    public static final Method x(InterfaceC0456f interfaceC0456f) {
        InterfaceC0673e interfaceC0673eG;
        AbstractC0219i.e("<this>", interfaceC0456f);
        r rVarA = x0.a(interfaceC0456f);
        Member memberQ = (rVarA == null || (interfaceC0673eG = rVarA.g()) == null) ? null : interfaceC0673eG.q();
        if (memberQ instanceof Method) {
            return (Method) memberQ;
        }
        return null;
    }

    public static float y(String[] strArr, int i5) throws NumberFormatException {
        float f5 = Float.parseFloat(strArr[i5]);
        if (f5 >= 0.0f && f5 <= 1.0f) {
            return f5;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f5);
    }

    public static Method z(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            Log.w("SeslBaseReflector", "Reflector did not find method = ".concat(str));
            return null;
        }
    }

    @Override // a2.InterfaceC0105c
    public Object a(Class cls) {
        InterfaceC0558a interfaceC0558aB = b(cls);
        if (interfaceC0558aB == null) {
            return null;
        }
        return interfaceC0558aB.get();
    }

    @Override // a2.InterfaceC0105c
    public Set c(Class cls) {
        return (Set) d(cls).get();
    }
}
