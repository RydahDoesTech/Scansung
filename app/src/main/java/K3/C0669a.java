package k3;

import P2.z;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import g3.InterfaceC0453c;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v3.AbstractC0897d;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669a implements InterfaceC0673e {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7903a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7905c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7906d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7907e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7908g;

    public C0669a(Class cls, ArrayList arrayList, int i5, int i6, List list) {
        boolean z4;
        AbstractC0219i.e("jClass", cls);
        A3.f.q(i5, "callMode");
        A3.f.q(i6, "origin");
        AbstractC0219i.e("methods", list);
        this.f7903a = cls;
        this.f7904b = arrayList;
        this.f7905c = i5;
        this.f7906d = list;
        ArrayList arrayList2 = new ArrayList(P2.o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f7907e = arrayList2;
        List list2 = this.f7906d;
        ArrayList arrayList3 = new ArrayList(P2.o.l0(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            AbstractC0219i.d("it", returnType);
            List list3 = AbstractC0897d.f9243a;
            Class<?> cls2 = (Class) AbstractC0897d.f9245c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list4 = this.f7906d;
        ArrayList arrayList4 = new ArrayList(P2.o.l0(list4));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f7908g = arrayList4;
        if (this.f7905c == 2 && i6 == 1) {
            ArrayList arrayList5 = this.f7904b;
            AbstractC0219i.e("<this>", arrayList5);
            ArrayList arrayList6 = new ArrayList(P2.o.l0(arrayList5));
            Iterator it4 = arrayList5.iterator();
            boolean z5 = false;
            while (it4.hasNext()) {
                Object next = it4.next();
                if (z5 || !AbstractC0219i.a(next, "value")) {
                    z4 = true;
                } else {
                    z5 = true;
                    z4 = false;
                }
                if (z4) {
                    arrayList6.add(next);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        Object obj;
        String strL;
        Y0.j.d(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.f7904b;
            if (i5 >= length) {
                return V1.a.s(this.f7903a, z.k0(P2.m.T0(arrayList2, arrayList)), this.f7906d);
            }
            Object array = objArr[i5];
            int i7 = i6 + 1;
            ArrayList arrayList3 = this.f;
            if (array == null && this.f7905c == 1) {
                obj = this.f7908g.get(i6);
            } else {
                Class cls = (Class) arrayList3.get(i6);
                if (array instanceof Class) {
                    obj = null;
                } else {
                    if (array instanceof InterfaceC0453c) {
                        array = g3.y.z((InterfaceC0453c) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr2 = (Object[]) array;
                        if (!(objArr2 instanceof Class[])) {
                            if (objArr2 instanceof InterfaceC0453c[]) {
                                AbstractC0219i.c("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>", array);
                                InterfaceC0453c[] interfaceC0453cArr = (InterfaceC0453c[]) array;
                                ArrayList arrayList4 = new ArrayList(interfaceC0453cArr.length);
                                for (InterfaceC0453c interfaceC0453c : interfaceC0453cArr) {
                                    arrayList4.add(g3.y.z(interfaceC0453c));
                                }
                                array = arrayList4.toArray(new Class[0]);
                            } else {
                                array = objArr2;
                            }
                        }
                        obj = null;
                    }
                    obj = cls.isInstance(array) ? array : null;
                }
            }
            if (obj == null) {
                String str = (String) arrayList2.get(i6);
                Class cls2 = (Class) arrayList3.get(i6);
                InterfaceC0453c interfaceC0453cB = AbstractC0219i.a(cls2, Class.class) ? b3.q.f5100a.b(InterfaceC0453c.class) : (cls2.isArray() && AbstractC0219i.a(cls2.getComponentType(), Class.class)) ? b3.q.f5100a.b(InterfaceC0453c[].class) : g3.y.F(cls2);
                if (AbstractC0219i.a(interfaceC0453cB.l(), b3.q.f5100a.b(Object[].class).l())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(interfaceC0453cB.l());
                    sb.append(IDMTndsXmlWbxmlDefine.XML_OPEN_TAG);
                    Class<?> componentType = g3.y.z(interfaceC0453cB).getComponentType();
                    AbstractC0219i.d("kotlinClass.java.componentType", componentType);
                    sb.append(g3.y.F(componentType).l());
                    sb.append(IDMTndsXmlWbxmlDefine.XML_CLOSE_TAG);
                    strL = sb.toString();
                } else {
                    strL = interfaceC0453cB.l();
                }
                throw new IllegalArgumentException("Argument #" + i6 + ' ' + str + " is not of the required type " + strL);
            }
            arrayList.add(obj);
            i5++;
            i6 = i7;
        }
    }

    @Override // k3.InterfaceC0673e
    public final Type o() {
        return this.f7903a;
    }

    @Override // k3.InterfaceC0673e
    public final List p() {
        return this.f7907e;
    }

    @Override // k3.InterfaceC0673e
    public final /* bridge */ /* synthetic */ Member q() {
        return null;
    }

    public /* synthetic */ C0669a(Class cls, ArrayList arrayList, int i5) {
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, i5, 2, arrayList2);
    }
}
