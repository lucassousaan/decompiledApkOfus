package androidx.fragment.app;

import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n f888a = new n();

    public abstract f0 a(ClassLoader classLoader, String str);

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>> */
    public static Class c(ClassLoader classLoader, String className) {
        n nVar = f888a;
        n nVar2 = (n) nVar.get(classLoader);
        if (nVar2 == null) {
            nVar2 = new n();
            nVar.put(classLoader, nVar2);
        }
        Class<?> clazz = (Class) nVar2.get(className);
        if (clazz != null) {
            return clazz;
        }
        Class<?> clazz2 = Class.forName(className, false, classLoader);
        nVar2.put(className, clazz2);
        return clazz2;
    }

    public static boolean b(ClassLoader classLoader, String className) {
        try {
            Class<?> clazz = c(classLoader, className);
            return f0.class.isAssignableFrom(clazz);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    public static Class d(ClassLoader classLoader, String className) {
        try {
            Class<?> clazz = c(classLoader, className);
            return clazz;
        } catch (ClassCastException e2) {
            throw new c0("Unable to instantiate fragment " + className + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new c0("Unable to instantiate fragment " + className + ": make sure class name exists", e3);
        }
    }
}
