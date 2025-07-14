package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class O {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3977a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3978b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3979c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3980d;

    /* renamed from: e, reason: collision with root package name */
    public final w0.c f3981e;

    public O(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3977a = linkedHashMap;
        this.f3978b = new LinkedHashMap();
        this.f3979c = new LinkedHashMap();
        this.f3980d = new LinkedHashMap();
        this.f3981e = new androidx.activity.e(1, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(O o5) {
        Map mapSingletonMap;
        String str;
        AbstractC0219i.e("this$0", o5);
        LinkedHashMap linkedHashMap = o5.f3978b;
        AbstractC0219i.e("<this>", linkedHashMap);
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = P2.v.f2164d;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap);
        } else {
            AbstractC0219i.e("<this>", linkedHashMap);
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            AbstractC0219i.d("with(entries.iterator().…ingletonMap(key, value) }", mapSingletonMap);
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = o5.f3977a;
            int i5 = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : setKeySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap2.get(str2));
                }
                O2.f[] fVarArr = {new O2.f("keys", arrayList), new O2.f("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i5 < 2) {
                    O2.f fVar = fVarArr[i5];
                    String str3 = (String) fVar.f2006d;
                    Object obj = fVar.f2007e;
                    if (obj == null) {
                        bundle.putString(str3, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str3, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str3, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str3, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str3, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str3, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str3, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str3, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str3, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str3, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str3, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str3, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str3, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str3, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str3, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str3, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str3, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str3, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str3, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str3, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        AbstractC0219i.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str3, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str3, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str3, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str3 + '\"');
                            }
                            bundle.putSerializable(str3, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str3, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        F.c.a(bundle, str3, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        F.d.a(bundle, str3, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str3 + '\"');
                        }
                        F.d.b(bundle, str3, (SizeF) obj);
                    }
                    i5++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            str = (String) entry2.getKey();
            Bundle bundleA = ((w0.c) entry2.getValue()).a();
            AbstractC0219i.e(KnoxContract.KEY, str);
            if (bundleA != null) {
                Class[] clsArr = f;
                while (i5 < 29) {
                    Class cls = clsArr[i5];
                    AbstractC0219i.b(cls);
                    if (!cls.isInstance(bundleA)) {
                        i5++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj2 = o5.f3979c.get(str);
            F f5 = obj2 instanceof F ? (F) obj2 : null;
            if (f5 != null) {
                f5.k(bundleA);
            } else {
                linkedHashMap2.put(str, bundleA);
            }
        } while (o5.f3980d.get(str) == null);
        throw new ClassCastException();
    }

    public O() {
        this.f3977a = new LinkedHashMap();
        this.f3978b = new LinkedHashMap();
        this.f3979c = new LinkedHashMap();
        this.f3980d = new LinkedHashMap();
        this.f3981e = new androidx.activity.e(1, this);
    }
}
