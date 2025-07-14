package Y0;

import J.H;
import J.P;
import P2.o;
import a3.InterfaceC0107b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsSpinner;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.A4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.q;
import com.samsung.android.knox.ex.KnoxContract;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import g3.y;
import j0.AbstractC0519J;
import j0.X;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SequencedCollection;
import java.util.WeakHashMap;
import k.Q0;
import k3.InterfaceC0673e;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import q3.C0799i;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public abstract class j implements O.m {

    /* renamed from: b, reason: collision with root package name */
    public static Context f2828b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    public /* synthetic */ j(int i5) {
        this.f2829a = i5;
    }

    public static String A() throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(Settings.System.class, "hidden_SEM_PEN_HOVERING", new Class[0]);
        Object objE = methodR != null ? J2.b.E(null, methodR, new Object[0]) : null;
        return objE instanceof String ? (String) objE : "pen_hovering";
    }

    public static int B() throws NoSuchFieldException, SecurityException {
        Field fieldQ = J2.b.q(Build.VERSION.class, "SEM_PLATFORM_INT");
        if (fieldQ == null || !(J2.b.n(null, fieldQ) instanceof Integer)) {
            return -1;
        }
        return ((Integer) J2.b.n(null, fieldQ)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(e4.AbstractC0438v r25, G3.r r26, a3.InterfaceC0109d r27) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.C(e4.v, G3.r, a3.d):java.lang.Object");
    }

    public static boolean H(Parcel parcel, int i5) {
        U(parcel, i5, 4);
        return parcel.readInt() != 0;
    }

    public static int I(Parcel parcel, int i5) {
        U(parcel, i5, 4);
        return parcel.readInt();
    }

    public static long J(Parcel parcel, int i5) {
        U(parcel, i5, 8);
        return parcel.readLong();
    }

    public static int K(Parcel parcel, int i5) {
        return (i5 & (-65536)) != -65536 ? (i5 >> 16) & 65535 : parcel.readInt();
    }

    public static void L(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        C.a.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final boolean M(AbstractC0438v abstractC0438v) {
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (interfaceC0763gI == null || !Q3.j.b(interfaceC0763gI) || U3.f.g((InterfaceC0761e) interfaceC0763gI).equals(m3.n.f8147g)) {
            InterfaceC0763g interfaceC0763gI2 = abstractC0438v.I0().i();
            InterfaceC0755Q interfaceC0755Q = interfaceC0763gI2 instanceof InterfaceC0755Q ? (InterfaceC0755Q) interfaceC0763gI2 : null;
            if (!(interfaceC0755Q == null ? false : M(V1.a.N(interfaceC0755Q)))) {
                return false;
            }
        }
        return true;
    }

    public static final B3.e N(B3.g gVar, E3.b bVar) {
        AbstractC0219i.e("<this>", gVar);
        AbstractC0219i.e("annotationsOwner", bVar);
        return new B3.e(gVar, bVar, false);
    }

    public static void O(AbsSpinner absSpinner, List list) {
        if (list == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (!(adapter instanceof T.d)) {
            absSpinner.setAdapter((SpinnerAdapter) new T.d(absSpinner.getContext(), list));
            return;
        }
        T.d dVar = (T.d) adapter;
        if (dVar.f2546d == list) {
            return;
        }
        dVar.f2546d = list;
        dVar.notifyDataSetChanged();
    }

    public static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = P.f1421a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z4 = onLongClickListener != null;
        boolean z5 = zHasOnClickListeners || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z4);
        checkableImageButton.setImportantForAccessibility(z5 ? 1 : 2);
    }

    public static void Q(View view, O1.g gVar) {
        H1.a aVar = gVar.f1931d.f1917b;
        if (aVar == null || !aVar.f809a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = P.f1421a;
            fI += H.i((View) parent);
        }
        O1.f fVar = gVar.f1931d;
        if (fVar.f1926l != fI) {
            fVar.f1926l = fI;
            gVar.l();
        }
    }

    public static void R(Parcel parcel, int i5) {
        parcel.setDataPosition(parcel.dataPosition() + K(parcel, i5));
    }

    public static int S(Parcel parcel) {
        int i5 = parcel.readInt();
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if ((65535 & i5) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(i5));
            throw new O2.d(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i6 = iK + iDataPosition;
        if (i6 >= iDataPosition && i6 <= parcel.dataSize()) {
            return i6;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i6);
        throw new O2.d(sb.toString(), parcel);
    }

    public static P3.g T(InterfaceC0107b interfaceC0107b) {
        P3.k kVar = new P3.k();
        interfaceC0107b.d(kVar);
        kVar.f2238a = true;
        return new P3.g(kVar);
    }

    public static void U(Parcel parcel, int i5, int i6) {
        int iK = K(parcel, i5);
        if (iK == i6) {
            return;
        }
        String hexString = Integer.toHexString(iK);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i6);
        sb.append(" got ");
        sb.append(iK);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new O2.d(sb.toString(), parcel);
    }

    public static void V(Parcel parcel, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        String hexString = Integer.toHexString(i5);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i6);
        sb.append(" got ");
        sb.append(i5);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new O2.d(sb.toString(), parcel);
    }

    public static ArrayList W(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A4 a42 = (A4) it.next();
            X1.k kVar = null;
            if (a42 != null && !TextUtils.isEmpty(a42.f5259d)) {
                String str = a42.f5259d;
                AbstractC0203C.c(str);
                kVar = new X1.k(a42.f5261g, a42.f5260e, a42.f, str);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                C.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final Object c(Object obj, boolean z4) {
        V3.c cVar;
        AbstractC0219i.e("possiblyPrimitiveType", obj);
        if (!z4) {
            return obj;
        }
        G3.l lVar = (G3.l) obj;
        if (!(lVar instanceof G3.k) || (cVar = ((G3.k) lVar).f764i) == null) {
            return lVar;
        }
        String strE = V3.b.c(cVar.e()).e();
        AbstractC0219i.d("byFqNameWithoutInnerClas…apperFqName).internalName", strE);
        return G3.g.d(strE);
    }

    public static void d(InterfaceC0673e interfaceC0673e, Object[] objArr) {
        AbstractC0219i.e("args", objArr);
        if (AbstractC0415a.l(interfaceC0673e) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + AbstractC0415a.l(interfaceC0673e) + " arguments, but " + objArr.length + " were provided.");
    }

    public static void e(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(int i5, int i6, int i7) {
        if (i5 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
        }
        if (i5 <= i6) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i5 + " > toIndex: " + i6);
    }

    public static int g(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
    }

    public static final InterfaceC0798h h(InterfaceC0798h interfaceC0798h, InterfaceC0798h interfaceC0798h2) {
        AbstractC0219i.e("first", interfaceC0798h);
        AbstractC0219i.e(KnoxContract.Config.DateTime.PARAM_SECOND, interfaceC0798h2);
        return interfaceC0798h.isEmpty() ? interfaceC0798h2 : interfaceC0798h2.isEmpty() ? interfaceC0798h : new C0799i(new InterfaceC0798h[]{interfaceC0798h, interfaceC0798h2});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String i(p3.InterfaceC0761e r3, G3.g r4) {
        /*
            java.lang.String r0 = "klass"
            b3.AbstractC0219i.e(r0, r3)
            java.lang.String r0 = "typeMappingConfiguration"
            b3.AbstractC0219i.e(r0, r4)
            p3.j r0 = r3.l()
            java.lang.String r1 = "klass.containingDeclaration"
            b3.AbstractC0219i.d(r1, r0)
            N3.f r1 = r3.getName()
            if (r1 == 0) goto L20
            N3.f r2 = N3.h.f1845a
            boolean r2 = r1.f1843e
            if (r2 != 0) goto L20
            goto L22
        L20:
            N3.f r1 = N3.h.f1847c
        L22:
            java.lang.String r1 = r1.c()
            boolean r2 = r0 instanceof p3.InterfaceC0742D
            if (r2 == 0) goto L56
            p3.D r0 = (p3.InterfaceC0742D) r0
            s3.D r0 = (s3.AbstractC0828D) r0
            N3.c r3 = r0.f8745h
            boolean r4 = r3.d()
            if (r4 == 0) goto L37
            goto L55
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.b()
            r0 = 46
            r2 = 47
            java.lang.String r3 = p4.h.m0(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L55:
            return r1
        L56:
            boolean r2 = r0 instanceof p3.InterfaceC0761e
            if (r2 == 0) goto L5e
            r2 = r0
            p3.e r2 = (p3.InterfaceC0761e) r2
            goto L5f
        L5e:
            r2 = 0
        L5f:
            if (r2 == 0) goto L7a
            java.lang.String r3 = i(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L7a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.i(p3.e, G3.g):java.lang.String");
    }

    public static int j(X x4, androidx.emoji2.text.f fVar, View view, View view2, AbstractC0519J abstractC0519J, boolean z4) {
        if (abstractC0519J.v() == 0 || x4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(AbstractC0519J.F(view) - AbstractC0519J.F(view2)) + 1;
        }
        return Math.min(fVar.l(), fVar.b(view2) - fVar.e(view));
    }

    public static int k(X x4, androidx.emoji2.text.f fVar, View view, View view2, AbstractC0519J abstractC0519J, boolean z4, boolean z5) {
        if (abstractC0519J.v() == 0 || x4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z5 ? Math.max(0, (x4.b() - Math.max(AbstractC0519J.F(view), AbstractC0519J.F(view2))) - 1) : Math.max(0, Math.min(AbstractC0519J.F(view), AbstractC0519J.F(view2)));
        if (z4) {
            return Math.round((iMax * (Math.abs(fVar.b(view2) - fVar.e(view)) / (Math.abs(AbstractC0519J.F(view) - AbstractC0519J.F(view2)) + 1))) + (fVar.k() - fVar.e(view)));
        }
        return iMax;
    }

    public static int l(X x4, androidx.emoji2.text.f fVar, View view, View view2, AbstractC0519J abstractC0519J, boolean z4) {
        if (abstractC0519J.v() == 0 || x4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return x4.b();
        }
        return (int) (((fVar.b(view2) - fVar.e(view)) / (Math.abs(AbstractC0519J.F(view) - AbstractC0519J.F(view2)) + 1)) * x4.b());
    }

    public static ImageView.ScaleType m(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 5 ? i5 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final int n(int i5) {
        A3.f.q(i5, "<this>");
        int iC = Q0.c(i5);
        if (iC == 0) {
            return 3;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 2;
        }
        throw new O2.d();
    }

    public static float[] o(float[] fArr, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i5, length);
        float[] fArr2 = new float[i5];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static X3.n p(String str, SequencedCollection sequencedCollection) {
        AbstractC0219i.e("message", str);
        AbstractC0219i.e("types", sequencedCollection);
        ArrayList arrayList = new ArrayList(o.l0(sequencedCollection));
        Iterator it = sequencedCollection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0438v) it.next()).p0());
        }
        n4.f fVarO = y.O(arrayList);
        int i5 = fVarO.f8193d;
        X3.n aVar = i5 != 0 ? i5 != 1 ? new X3.a(str, (X3.n[]) fVarO.toArray(new X3.n[0])) : (X3.n) fVarO.get(0) : X3.m.f2791b;
        return fVarO.f8193d <= 1 ? aVar : new X3.j(aVar);
    }

    public static Bundle q(Parcel parcel, int i5) {
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iK);
        return bundle;
    }

    public static V1.a r(int i5) {
        if (i5 != 0 && i5 == 1) {
            return new O1.d();
        }
        return new O1.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static B.f[] s(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.s(java.lang.String):B.f[]");
    }

    public static Parcelable t(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iK);
        return parcelable;
    }

    public static String u(Parcel parcel, int i5) {
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iK);
        return string;
    }

    public static ArrayList v(Parcel parcel, int i5) {
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iK);
        return arrayListCreateStringArrayList;
    }

    public static Object[] w(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return objArrCreateTypedArray;
    }

    public static ArrayList x(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iK = K(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return arrayListCreateTypedArrayList;
    }

    public static B.f[] y(B.f[] fVarArr) {
        B.f[] fVarArr2 = new B.f[fVarArr.length];
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            fVarArr2[i5] = new B.f(fVarArr[i5]);
        }
        return fVarArr2;
    }

    public static void z(Parcel parcel, int i5) {
        if (parcel.dataPosition() == i5) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i5);
        throw new O2.d(sb.toString(), parcel);
    }

    public abstract void D(Throwable th);

    public abstract void E(int i5);

    public abstract void F(Typeface typeface, boolean z4);

    public abstract void G(q qVar);

    public abstract String b();

    public String toString() {
        switch (this.f2829a) {
            case 9:
                return b();
            default:
                return super.toString();
        }
    }
}
