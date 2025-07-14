package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k.Q0;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0783a;
import s.C0819a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9140d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f9141e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9142a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9143b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9144c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9141e = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(102, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(107, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(104, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(103, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(105, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    public static int[] c(C0876a c0876a, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c0876a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < strArrSplit.length) {
            String strTrim = strArrSplit[i5].trim();
            Object obj = null;
            try {
                iIntValue = n.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c0876a.isInEditMode() && (c0876a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0876a.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f3538p;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f3538p.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i6] = iIntValue;
            i5++;
            i6++;
        }
        return i6 != strArrSplit.length ? Arrays.copyOf(iArr, i6) : iArr;
    }

    public static g d(Context context, AttributeSet attributeSet) {
        g gVar = new g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f9145a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            j jVar = gVar.f9057b;
            i iVar = gVar.f9058c;
            k kVar = gVar.f9060e;
            h hVar = gVar.f9059d;
            if (index != 1 && 23 != index && 24 != index) {
                iVar.getClass();
                hVar.getClass();
                kVar.getClass();
            }
            SparseIntArray sparseIntArray = f9141e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    hVar.f9107o = f(typedArrayObtainStyledAttributes, index, hVar.f9107o);
                    break;
                case 2:
                    hVar.f9066F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9066F);
                    break;
                case 3:
                    hVar.n = f(typedArrayObtainStyledAttributes, index, hVar.n);
                    break;
                case 4:
                    hVar.f9106m = f(typedArrayObtainStyledAttributes, index, hVar.f9106m);
                    break;
                case 5:
                    hVar.f9114v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    hVar.f9118z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f9118z);
                    break;
                case 7:
                    hVar.f9062A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f9062A);
                    break;
                case 8:
                    hVar.f9067G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9067G);
                    break;
                case 9:
                    hVar.f9111s = f(typedArrayObtainStyledAttributes, index, hVar.f9111s);
                    break;
                case 10:
                    hVar.f9110r = f(typedArrayObtainStyledAttributes, index, hVar.f9110r);
                    break;
                case 11:
                    hVar.f9072L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9072L);
                    break;
                case 12:
                    hVar.f9073M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9073M);
                    break;
                case 13:
                    hVar.f9069I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9069I);
                    break;
                case 14:
                    hVar.f9071K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9071K);
                    break;
                case 15:
                    hVar.f9074N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9074N);
                    break;
                case 16:
                    hVar.f9070J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9070J);
                    break;
                case 17:
                    hVar.f9093d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f9093d);
                    break;
                case 18:
                    hVar.f9095e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f9095e);
                    break;
                case 19:
                    hVar.f = typedArrayObtainStyledAttributes.getFloat(index, hVar.f);
                    break;
                case 20:
                    hVar.f9112t = typedArrayObtainStyledAttributes.getFloat(index, hVar.f9112t);
                    break;
                case 21:
                    hVar.f9091c = typedArrayObtainStyledAttributes.getLayoutDimension(index, hVar.f9091c);
                    break;
                case 22:
                    int i6 = typedArrayObtainStyledAttributes.getInt(index, jVar.f9124a);
                    jVar.f9124a = i6;
                    jVar.f9124a = f9140d[i6];
                    break;
                case 23:
                    hVar.f9089b = typedArrayObtainStyledAttributes.getLayoutDimension(index, hVar.f9089b);
                    break;
                case 24:
                    hVar.f9064C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9064C);
                    break;
                case 25:
                    hVar.f9098g = f(typedArrayObtainStyledAttributes, index, hVar.f9098g);
                    break;
                case 26:
                    hVar.f9099h = f(typedArrayObtainStyledAttributes, index, hVar.f9099h);
                    break;
                case 27:
                    hVar.f9063B = typedArrayObtainStyledAttributes.getInt(index, hVar.f9063B);
                    break;
                case 28:
                    hVar.f9065D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9065D);
                    break;
                case 29:
                    hVar.f9101i = f(typedArrayObtainStyledAttributes, index, hVar.f9101i);
                    break;
                case 30:
                    hVar.f9103j = f(typedArrayObtainStyledAttributes, index, hVar.f9103j);
                    break;
                case 31:
                    hVar.f9068H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9068H);
                    break;
                case 32:
                    hVar.f9108p = f(typedArrayObtainStyledAttributes, index, hVar.f9108p);
                    break;
                case 33:
                    hVar.f9109q = f(typedArrayObtainStyledAttributes, index, hVar.f9109q);
                    break;
                case 34:
                    hVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.E);
                    break;
                case 35:
                    hVar.f9105l = f(typedArrayObtainStyledAttributes, index, hVar.f9105l);
                    break;
                case 36:
                    hVar.f9104k = f(typedArrayObtainStyledAttributes, index, hVar.f9104k);
                    break;
                case 37:
                    hVar.f9113u = typedArrayObtainStyledAttributes.getFloat(index, hVar.f9113u);
                    break;
                case 38:
                    gVar.f9056a = typedArrayObtainStyledAttributes.getResourceId(index, gVar.f9056a);
                    break;
                case 39:
                    hVar.f9076P = typedArrayObtainStyledAttributes.getFloat(index, hVar.f9076P);
                    break;
                case 40:
                    hVar.f9075O = typedArrayObtainStyledAttributes.getFloat(index, hVar.f9075O);
                    break;
                case 41:
                    hVar.f9077Q = typedArrayObtainStyledAttributes.getInt(index, hVar.f9077Q);
                    break;
                case 42:
                    hVar.f9078R = typedArrayObtainStyledAttributes.getInt(index, hVar.f9078R);
                    break;
                case 43:
                    jVar.f9126c = typedArrayObtainStyledAttributes.getFloat(index, jVar.f9126c);
                    break;
                case 44:
                    kVar.f9138k = true;
                    kVar.f9139l = typedArrayObtainStyledAttributes.getDimension(index, kVar.f9139l);
                    break;
                case 45:
                    kVar.f9130b = typedArrayObtainStyledAttributes.getFloat(index, kVar.f9130b);
                    break;
                case 46:
                    kVar.f9131c = typedArrayObtainStyledAttributes.getFloat(index, kVar.f9131c);
                    break;
                case 47:
                    kVar.f9132d = typedArrayObtainStyledAttributes.getFloat(index, kVar.f9132d);
                    break;
                case 48:
                    kVar.f9133e = typedArrayObtainStyledAttributes.getFloat(index, kVar.f9133e);
                    break;
                case 49:
                    kVar.f = typedArrayObtainStyledAttributes.getDimension(index, kVar.f);
                    break;
                case 50:
                    kVar.f9134g = typedArrayObtainStyledAttributes.getDimension(index, kVar.f9134g);
                    break;
                case 51:
                    kVar.f9135h = typedArrayObtainStyledAttributes.getDimension(index, kVar.f9135h);
                    break;
                case 52:
                    kVar.f9136i = typedArrayObtainStyledAttributes.getDimension(index, kVar.f9136i);
                    break;
                case 53:
                    kVar.f9137j = typedArrayObtainStyledAttributes.getDimension(index, kVar.f9137j);
                    break;
                case 54:
                    hVar.f9079S = typedArrayObtainStyledAttributes.getInt(index, hVar.f9079S);
                    break;
                case 55:
                    hVar.f9080T = typedArrayObtainStyledAttributes.getInt(index, hVar.f9080T);
                    break;
                case 56:
                    hVar.f9081U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9081U);
                    break;
                case 57:
                    hVar.f9082V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9082V);
                    break;
                case 58:
                    hVar.f9083W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9083W);
                    break;
                case 59:
                    hVar.f9084X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9084X);
                    break;
                case 60:
                    kVar.f9129a = typedArrayObtainStyledAttributes.getFloat(index, kVar.f9129a);
                    break;
                case 61:
                    hVar.f9115w = f(typedArrayObtainStyledAttributes, index, hVar.f9115w);
                    break;
                case 62:
                    hVar.f9116x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9116x);
                    break;
                case 63:
                    hVar.f9117y = typedArrayObtainStyledAttributes.getFloat(index, hVar.f9117y);
                    break;
                case 64:
                    iVar.f9120a = f(typedArrayObtainStyledAttributes, index, iVar.f9120a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        iVar.getClass();
                        break;
                    } else {
                        String str = AbstractC0783a.f8444a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        iVar.getClass();
                        break;
                    }
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    iVar.getClass();
                    break;
                case 67:
                    iVar.f9123d = typedArrayObtainStyledAttributes.getFloat(index, iVar.f9123d);
                    break;
                case 68:
                    jVar.f9127d = typedArrayObtainStyledAttributes.getFloat(index, jVar.f9127d);
                    break;
                case 69:
                    hVar.f9085Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    hVar.f9086Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    hVar.f9088a0 = typedArrayObtainStyledAttributes.getInt(index, hVar.f9088a0);
                    break;
                case 73:
                    hVar.f9090b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f9090b0);
                    break;
                case 74:
                    hVar.f9096e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    hVar.f9102i0 = typedArrayObtainStyledAttributes.getBoolean(index, hVar.f9102i0);
                    break;
                case 76:
                    iVar.f9121b = typedArrayObtainStyledAttributes.getInt(index, iVar.f9121b);
                    break;
                case 77:
                    hVar.f9097f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    jVar.f9125b = typedArrayObtainStyledAttributes.getInt(index, jVar.f9125b);
                    break;
                case 79:
                    iVar.f9122c = typedArrayObtainStyledAttributes.getFloat(index, iVar.f9122c);
                    break;
                case 80:
                    hVar.g0 = typedArrayObtainStyledAttributes.getBoolean(index, hVar.g0);
                    break;
                case 81:
                    hVar.f9100h0 = typedArrayObtainStyledAttributes.getBoolean(index, hVar.f9100h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return gVar;
    }

    public static int f(TypedArray typedArray, int i5, int i6) {
        int resourceId = typedArray.getResourceId(i5, i6);
        return resourceId == -1 ? typedArray.getInt(i5, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i5;
        HashMap map;
        String resourceEntryName;
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = lVar.f9144c;
        HashSet hashSet = new HashSet(map2.keySet());
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (lVar.f9143b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        g gVar = (g) map2.get(Integer.valueOf(id));
                        if (childAt instanceof C0876a) {
                            gVar.f9059d.f9092c0 = 1;
                        }
                        int i7 = gVar.f9059d.f9092c0;
                        if (i7 != -1 && i7 == 1) {
                            C0876a c0876a = (C0876a) childAt;
                            c0876a.setId(id);
                            h hVar = gVar.f9059d;
                            c0876a.setType(hVar.f9088a0);
                            c0876a.setMargin(hVar.f9090b0);
                            c0876a.setAllowsGoneWidget(hVar.f9102i0);
                            int[] iArr = hVar.f9094d0;
                            if (iArr != null) {
                                c0876a.setReferencedIds(iArr);
                            } else {
                                String str = hVar.f9096e0;
                                if (str != null) {
                                    int[] iArrC = c(c0876a, str);
                                    hVar.f9094d0 = iArrC;
                                    c0876a.setReferencedIds(iArrC);
                                }
                            }
                        }
                        e eVar = (e) childAt.getLayoutParams();
                        eVar.a();
                        gVar.a(eVar);
                        HashMap map3 = gVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map3.keySet()) {
                            b bVar = (b) map3.get(str2);
                            String strD = g4.f.d("set", str2);
                            int i8 = childCount;
                            try {
                                switch (Q0.c(bVar.f8981a)) {
                                    case 0:
                                        map = map3;
                                        cls.getMethod(strD, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f8982b));
                                        break;
                                    case 1:
                                        map = map3;
                                        cls.getMethod(strD, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f8983c));
                                        break;
                                    case 2:
                                        map = map3;
                                        cls.getMethod(strD, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strD, Drawable.class);
                                        map = map3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i8;
                                            map3 = map;
                                        } catch (NoSuchMethodException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strD);
                                            childCount = i8;
                                            map3 = map;
                                        } catch (InvocationTargetException e7) {
                                            e = e7;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i8;
                                            map3 = map;
                                        }
                                    case 4:
                                        cls.getMethod(strD, CharSequence.class).invoke(childAt, bVar.f8984d);
                                        map = map3;
                                        break;
                                    case 5:
                                        cls.getMethod(strD, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f8985e));
                                        map = map3;
                                        break;
                                    case 6:
                                        cls.getMethod(strD, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f8983c));
                                        map = map3;
                                        break;
                                    default:
                                        map = map3;
                                        break;
                                }
                            } catch (IllegalAccessException e8) {
                                e = e8;
                                map = map3;
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                map = map3;
                            } catch (InvocationTargetException e10) {
                                e = e10;
                                map = map3;
                            }
                            childCount = i8;
                            map3 = map;
                        }
                        i5 = childCount;
                        childAt.setLayoutParams(eVar);
                        j jVar = gVar.f9057b;
                        if (jVar.f9125b == 0) {
                            childAt.setVisibility(jVar.f9124a);
                        }
                        childAt.setAlpha(jVar.f9126c);
                        k kVar = gVar.f9060e;
                        childAt.setRotation(kVar.f9129a);
                        childAt.setRotationX(kVar.f9130b);
                        childAt.setRotationY(kVar.f9131c);
                        childAt.setScaleX(kVar.f9132d);
                        childAt.setScaleY(kVar.f9133e);
                        if (!Float.isNaN(kVar.f)) {
                            childAt.setPivotX(kVar.f);
                        }
                        if (!Float.isNaN(kVar.f9134g)) {
                            childAt.setPivotY(kVar.f9134g);
                        }
                        childAt.setTranslationX(kVar.f9135h);
                        childAt.setTranslationY(kVar.f9136i);
                        childAt.setTranslationZ(kVar.f9137j);
                        if (kVar.f9138k) {
                            childAt.setElevation(kVar.f9139l);
                        }
                    } else {
                        i5 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i6++;
                lVar = this;
                childCount = i5;
            }
            i5 = childCount;
            i6++;
            lVar = this;
            childCount = i5;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            g gVar2 = (g) map2.get(num);
            h hVar2 = gVar2.f9059d;
            int i9 = hVar2.f9092c0;
            if (i9 != -1 && i9 == 1) {
                Context context = constraintLayout.getContext();
                C0876a c0876a2 = new C0876a(context);
                c0876a2.f8986d = new int[32];
                c0876a2.f8991j = new HashMap();
                c0876a2.f = context;
                C0819a c0819a = new C0819a();
                c0819a.m0 = 0;
                c0819a.n0 = true;
                c0819a.o0 = 0;
                c0819a.p0 = false;
                c0876a2.f8980m = c0819a;
                c0876a2.f8988g = c0819a;
                c0876a2.h();
                c0876a2.setVisibility(8);
                c0876a2.setId(num.intValue());
                int[] iArr2 = hVar2.f9094d0;
                if (iArr2 != null) {
                    c0876a2.setReferencedIds(iArr2);
                } else {
                    String str3 = hVar2.f9096e0;
                    if (str3 != null) {
                        int[] iArrC2 = c(c0876a2, str3);
                        hVar2.f9094d0 = iArrC2;
                        c0876a2.setReferencedIds(iArrC2);
                    }
                }
                c0876a2.setType(hVar2.f9088a0);
                c0876a2.setMargin(hVar2.f9090b0);
                e eVarA = ConstraintLayout.a();
                c0876a2.h();
                gVar2.a(eVarA);
                constraintLayout.addView(c0876a2, eVarA);
            }
            if (hVar2.f9087a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                e eVarA2 = ConstraintLayout.a();
                gVar2.a(eVarA2);
                constraintLayout.addView(guideline, eVarA2);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = lVar.f9144c;
        map.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (lVar.f9143b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new g());
            }
            g gVar = (g) map.get(Integer.valueOf(id));
            HashMap map2 = lVar.f9142a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                b bVar = (b) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (NoSuchMethodException e6) {
                    e6.printStackTrace();
                } catch (InvocationTargetException e7) {
                    e7.printStackTrace();
                }
            }
            gVar.f = map3;
            gVar.f9056a = id;
            int i6 = eVar.f9024d;
            h hVar = gVar.f9059d;
            hVar.f9098g = i6;
            hVar.f9099h = eVar.f9026e;
            hVar.f9101i = eVar.f;
            hVar.f9103j = eVar.f9029g;
            hVar.f9104k = eVar.f9030h;
            hVar.f9105l = eVar.f9032i;
            hVar.f9106m = eVar.f9034j;
            hVar.n = eVar.f9036k;
            hVar.f9107o = eVar.f9037l;
            hVar.f9108p = eVar.f9040p;
            hVar.f9109q = eVar.f9041q;
            hVar.f9110r = eVar.f9042r;
            hVar.f9111s = eVar.f9043s;
            hVar.f9112t = eVar.f9050z;
            hVar.f9113u = eVar.f8993A;
            hVar.f9114v = eVar.f8994B;
            hVar.f9115w = eVar.f9038m;
            hVar.f9116x = eVar.n;
            hVar.f9117y = eVar.f9039o;
            hVar.f9118z = eVar.f9007P;
            hVar.f9062A = eVar.f9008Q;
            hVar.f9063B = eVar.f9009R;
            hVar.f = eVar.f9022c;
            hVar.f9093d = eVar.f9018a;
            hVar.f9095e = eVar.f9020b;
            hVar.f9089b = ((ViewGroup.MarginLayoutParams) eVar).width;
            hVar.f9091c = ((ViewGroup.MarginLayoutParams) eVar).height;
            hVar.f9064C = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            hVar.f9065D = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            hVar.E = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            hVar.f9066F = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            hVar.f9075O = eVar.E;
            hVar.f9076P = eVar.f8996D;
            hVar.f9078R = eVar.f8998G;
            hVar.f9077Q = eVar.f8997F;
            hVar.g0 = eVar.f9010S;
            hVar.f9100h0 = eVar.f9011T;
            hVar.f9079S = eVar.f8999H;
            hVar.f9080T = eVar.f9000I;
            hVar.f9081U = eVar.f9003L;
            hVar.f9082V = eVar.f9004M;
            hVar.f9083W = eVar.f9001J;
            hVar.f9084X = eVar.f9002K;
            hVar.f9085Y = eVar.f9005N;
            hVar.f9086Z = eVar.f9006O;
            hVar.f9097f0 = eVar.f9012U;
            hVar.f9070J = eVar.f9045u;
            hVar.f9072L = eVar.f9047w;
            hVar.f9069I = eVar.f9044t;
            hVar.f9071K = eVar.f9046v;
            hVar.f9074N = eVar.f9048x;
            hVar.f9073M = eVar.f9049y;
            hVar.f9067G = eVar.getMarginEnd();
            hVar.f9068H = eVar.getMarginStart();
            int visibility = childAt.getVisibility();
            j jVar = gVar.f9057b;
            jVar.f9124a = visibility;
            jVar.f9126c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            k kVar = gVar.f9060e;
            kVar.f9129a = rotation;
            kVar.f9130b = childAt.getRotationX();
            kVar.f9131c = childAt.getRotationY();
            kVar.f9132d = childAt.getScaleX();
            kVar.f9133e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                kVar.f = pivotX;
                kVar.f9134g = pivotY;
            }
            kVar.f9135h = childAt.getTranslationX();
            kVar.f9136i = childAt.getTranslationY();
            kVar.f9137j = childAt.getTranslationZ();
            if (kVar.f9138k) {
                kVar.f9139l = childAt.getElevation();
            }
            if (childAt instanceof C0876a) {
                C0876a c0876a = (C0876a) childAt;
                hVar.f9102i0 = c0876a.f8980m.n0;
                hVar.f9094d0 = c0876a.getReferencedIds();
                hVar.f9088a0 = c0876a.getType();
                hVar.f9090b0 = c0876a.getMargin();
            }
            i5++;
            lVar = this;
        }
    }

    public final void e(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    g gVarD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        gVarD.f9059d.f9087a = true;
                    }
                    this.f9144c.put(Integer.valueOf(gVarD.f9056a), gVarD);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }
}
