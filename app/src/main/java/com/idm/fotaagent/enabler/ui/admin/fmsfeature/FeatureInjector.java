package com.idm.fotaagent.enabler.ui.admin.fmsfeature;

import com.idm.fotaagent.database.room.data.repository.InjectedFeatureRepository;
import com.samsung.android.fotaagent.common.feature.FeatureAttribute;
import com.samsung.android.fotaagent.common.feature.FeatureDelegate;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class FeatureInjector implements InvocationHandler {
    private static final ConcurrentHashMap<Class<?>, FeatureInjector> featureInjectors = new ConcurrentHashMap<>();
    private static final FeatureInjector STUB = new Stub();

    public static class FeatureInfo {
        private static final Map<Object, Constructor<?>> constructors = new HashMap();
        private final List<String> candidateValues;
        private final String description;
        private final String name;
        private final Class<?> type;

        static {
            Class[] clsArr = {Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class};
            for (int i5 = 0; i5 < 7; i5++) {
                Class cls = clsArr[i5];
                try {
                    Constructor<?> constructor = cls.getConstructor(String.class);
                    Map<Object, Constructor<?>> map = constructors;
                    map.put(cls, constructor);
                    map.put(cls.getField("TYPE").get(null), constructor);
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException e5) {
                    Log.printStackTrace(e5);
                }
            }
        }

        public Serializable convert(String str) {
            Class<?> cls = this.type;
            if (cls == String.class) {
                return str;
            }
            if (cls == Character.TYPE || cls == Character.class) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                Log.W("the length of value should be one for char or Character");
                throw new IllegalArgumentException("the length of value should be one for char or Character");
            }
            try {
                return (Serializable) constructors.get(cls).newInstance(str);
            } catch (ClassCastException | IllegalAccessException | InstantiationException | NumberFormatException | InvocationTargetException e5) {
                throw new IllegalArgumentException("no constructors for [type: " + this.type + ", methodName: " + this.name + ", value: " + str + "]", e5);
            }
        }

        public List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public String getDescription() {
            return this.description;
        }

        public String getName() {
            return this.name;
        }

        private FeatureInfo(String str, Class<?> cls, String[] strArr, String str2) {
            this.name = str;
            this.type = cls;
            this.candidateValues = Arrays.asList(strArr);
            this.description = str2;
        }
    }

    public static class Real extends FeatureInjector {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f6301a = 0;
        private final Class<?> delegateClass;
        private final Field delegateField;
        private final Class<?> featureClass;
        private final LinkedHashMap<String, FeatureInfo> featureInfos;
        private final Object mockDelegate;
        private final Object realDelegate;
        private final InjectedFeatureRepository.SpecificCategory repository;

        private Class<?> makeDelegateClass() {
            for (Class<?> cls : this.featureClass.getDeclaredClasses()) {
                if (cls.isAnnotationPresent(FeatureDelegate.class) && cls.isInstance(this.realDelegate)) {
                    return cls;
                }
            }
            return null;
        }

        private Field makeDelegateField() throws SecurityException {
            for (Field field : this.featureClass.getDeclaredFields()) {
                if (field.isAnnotationPresent(FeatureDelegate.class)) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }

        private Object makeMockDelegate() {
            try {
                return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{this.delegateClass}, this);
            } catch (Throwable th) {
                Log.printStackTrace(th);
                return null;
            }
        }

        private Object makeRealDelegate() {
            return this.delegateField.get(null);
        }

        private void setFeatureInfos() throws SecurityException {
            for (Method method : this.delegateClass.getMethods()) {
                FeatureAttribute featureAttribute = (FeatureAttribute) method.getAnnotation(FeatureAttribute.class);
                if (featureAttribute != null) {
                    this.featureInfos.put(method.getName(), new FeatureInfo(method.getName(), method.getReturnType(), featureAttribute.values(), featureAttribute.description()));
                }
            }
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public List<FeatureInfo> getFeatureInfos() {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, FeatureInfo>> it = this.featureInfos.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            return arrayList;
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public synchronized int indexOfInjectedValue(String str) {
            FeatureInfo featureInfo = this.featureInfos.get(str);
            if (featureInfo == null) {
                Log.W("featureInfo for " + str + " should not be null");
                return -1;
            }
            Optional map = this.repository.getValueOf(str).map(new b());
            final List<String> candidateValues = featureInfo.getCandidateValues();
            Objects.requireNonNull(candidateValues);
            return ((Integer) map.map(new Function() { // from class: com.idm.fotaagent.enabler.ui.admin.fmsfeature.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(candidateValues.indexOf((String) obj));
                }
            }).orElse(-1)).intValue();
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public synchronized void inject(String str, String str2) {
            try {
            } catch (IOException | IllegalAccessException | IllegalArgumentException | NullPointerException e5) {
                Log.printStackTrace(e5);
            }
            if (str2 == null) {
                Log.V("value should not be null; remove this feature(" + str + ")");
                restore(str);
                return;
            }
            InjectedFeatureRepository.SpecificCategory specificCategory = this.repository;
            FeatureInfo featureInfo = this.featureInfos.get(str);
            Objects.requireNonNull(featureInfo);
            specificCategory.insertOrReplace(str, featureInfo.convert(str2));
            Log.V(str + " -> " + str2);
            if (this.repository.size() == 1) {
                this.delegateField.set(null, this.mockDelegate);
            }
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public synchronized void restore(String str) {
            try {
                this.repository.delete(str);
            } catch (IllegalAccessException | IllegalArgumentException e5) {
                Log.printStackTrace(e5);
            }
            if (this.repository.size() == 0) {
                this.delegateField.set(null, this.realDelegate);
            }
        }

        private Real(Class<?> cls) throws SecurityException {
            this.featureInfos = new LinkedHashMap<>();
            Objects.requireNonNull(cls, "featureClass should not be null");
            this.featureClass = cls;
            Field fieldMakeDelegateField = makeDelegateField();
            Objects.requireNonNull(fieldMakeDelegateField, "field annotated with @FeatureDelegate should exist");
            this.delegateField = fieldMakeDelegateField;
            Object objMakeRealDelegate = makeRealDelegate();
            Objects.requireNonNull(objMakeRealDelegate, "field annotated with @FeatureDelegate should not be null");
            this.realDelegate = objMakeRealDelegate;
            Class<?> clsMakeDelegateClass = makeDelegateClass();
            Objects.requireNonNull(clsMakeDelegateClass, "interface annotated with @FeatureDelegate should exist and be assignment-compatible with field annotated with @FeatureDelegate");
            this.delegateClass = clsMakeDelegateClass;
            Object objMakeMockDelegate = makeMockDelegate();
            Objects.requireNonNull(objMakeMockDelegate, "mock for delegate should not be null");
            this.mockDelegate = objMakeMockDelegate;
            this.repository = InjectedFeatureRepository.SpecificCategory.get(cls.getSimpleName());
            setFeatureInfos();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Serializable invoke(Object obj, Method method, Object[] objArr) {
            return (Serializable) this.repository.getValueOf(method.getName()).orElse((Serializable) method.invoke(this.realDelegate, objArr));
        }
    }

    public static class Stub extends FeatureInjector {
        private Stub() {
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public List<FeatureInfo> getFeatureInfos() {
            Log.E("should not be called");
            return new ArrayList();
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public int indexOfInjectedValue(String str) {
            return -1;
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public void inject(String str, String str2) {
            Log.E("should not be called");
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Log.E("should not be called");
            return null;
        }

        @Override // com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector
        public void restore(String str) {
            Log.E("should not be called");
        }
    }

    public static FeatureInjector get(Class<?> cls) {
        if (cls == null) {
            Log.E("featureClass should not be null");
            return STUB;
        }
        ConcurrentHashMap<Class<?>, FeatureInjector> concurrentHashMap = featureInjectors;
        FeatureInjector featureInjector = concurrentHashMap.get(cls);
        if (featureInjector != null) {
            return featureInjector;
        }
        try {
            Real real = new Real(cls);
            FeatureInjector featureInjectorPutIfAbsent = concurrentHashMap.putIfAbsent(cls, real);
            return featureInjectorPutIfAbsent == null ? real : featureInjectorPutIfAbsent;
        } catch (Exception e5) {
            Log.printStackTrace(e5, "use Stub: injection does not work");
            ConcurrentHashMap<Class<?>, FeatureInjector> concurrentHashMap2 = featureInjectors;
            FeatureInjector featureInjector2 = STUB;
            concurrentHashMap2.putIfAbsent(cls, featureInjector2);
            return featureInjector2;
        }
    }

    public abstract List<FeatureInfo> getFeatureInfos();

    public abstract int indexOfInjectedValue(String str);

    public abstract void inject(String str, String str2);

    public abstract void restore(String str);
}
