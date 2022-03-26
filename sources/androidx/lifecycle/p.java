package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static Map f1037a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map f1038b = new HashMap();

    public static k f(Object object) {
        boolean isLifecycleEventObserver = object instanceof k;
        if (isLifecycleEventObserver && 0 != 0) {
            return new FullLifecycleObserverAdapter((d) object, (k) object);
        }
        if (0 != 0) {
            return new FullLifecycleObserverAdapter((d) object, null);
        }
        if (isLifecycleEventObserver) {
            return (k) object;
        }
        Class<?> klass = object.getClass();
        int type = d(klass);
        if (type != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> constructors = (List) ((HashMap) f1038b).get(klass);
        if (constructors.size() == 1) {
            f generatedAdapter = a(constructors.get(0), object);
            return new SingleGeneratedAdapterObserver(generatedAdapter);
        }
        f[] adapters = new f[constructors.size()];
        for (int i2 = 0; i2 < constructors.size(); i2++) {
            adapters[i2] = a(constructors.get(i2), object);
        }
        return new CompositeGeneratedAdaptersObserver(adapters);
    }

    public static f a(Constructor constructor, Object object) {
        try {
            return (f) constructor.newInstance(object);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor b(Class cls) {
        String str;
        try {
            Package aPackage = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = aPackage != null ? aPackage.getName() : "";
            String adapterName = c(fullPackage.isEmpty() ? name : name.substring(fullPackage.length() + 1));
            if (fullPackage.isEmpty()) {
                str = adapterName;
            } else {
                str = fullPackage + "." + adapterName;
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int d(Class cls) {
        Integer callbackCache = (Integer) ((HashMap) f1037a).get(cls);
        if (callbackCache != null) {
            return callbackCache.intValue();
        }
        int type = g(cls);
        ((HashMap) f1037a).put(cls, Integer.valueOf(type));
        return type;
    }

    public static int g(Class cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructor = b(cls);
        if (constructor != null) {
            ((HashMap) f1038b).put(cls, Collections.singletonList(constructor));
            return 2;
        }
        boolean hasLifecycleMethods = c.f1011c.d(cls);
        if (hasLifecycleMethods) {
            return 1;
        }
        Class<?> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) ((HashMap) f1038b).get(superclass));
        }
        for (Class<?> intrface : cls.getInterfaces()) {
            if (e(intrface)) {
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) ((HashMap) f1038b).get(intrface));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        ((HashMap) f1038b).put(cls, arrayList);
        return 2;
    }

    public static boolean e(Class cls) {
        return cls != null && l.class.isAssignableFrom(cls);
    }

    public static String c(String className) {
        return className.replace(".", "_") + "_LifecycleAdapter";
    }
}
