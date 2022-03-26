package androidx.lifecycle;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static c f1011c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Map f1012a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f1013b = new HashMap();

    public boolean d(Class cls) {
        Boolean hasLifecycleMethods = (Boolean) this.f1013b.get(cls);
        if (hasLifecycleMethods != null) {
            return hasLifecycleMethods.booleanValue();
        }
        Method[] methods = b(cls);
        for (Method method : methods) {
            x annotation = (x) method.getAnnotation(x.class);
            if (annotation != null) {
                a(cls, methods);
                return true;
            }
        }
        this.f1013b.put(cls, false);
        return false;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    public a c(Class cls) {
        a existing = (a) this.f1012a.get(cls);
        if (existing != null) {
            return existing;
        }
        return a(cls, null);
    }

    public final void e(Map map, b newHandler, h newEvent, Class cls) {
        h event = (h) map.get(newHandler);
        if (event != null && newEvent != event) {
            Method method = newHandler.f1010b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
        } else if (event == null) {
            map.put(newHandler, newEvent);
        }
    }

    public final a a(Class cls, Method[] declaredMethods) {
        a superInfo;
        Class<?> superclass = cls.getSuperclass();
        Map<ClassesInfoCache.MethodReference, Lifecycle.Event> handlerToEvent = new HashMap<>();
        if (!(superclass == null || (superInfo = c(superclass)) == null)) {
            handlerToEvent.putAll(superInfo.f1007b);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        char c2 = 0;
        for (Class<?> intrfc : interfaces) {
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : c(intrfc).f1007b.entrySet()) {
                e(handlerToEvent, (b) entry.getKey(), (h) entry.getValue(), cls);
            }
        }
        Method[] methods = declaredMethods != null ? declaredMethods : b(cls);
        boolean hasLifecycleMethods = false;
        int length = methods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = methods[i2];
            x annotation = (x) method.getAnnotation(x.class);
            if (annotation != null) {
                hasLifecycleMethods = true;
                Class<?>[] params = method.getParameterTypes();
                int callType = 0;
                if (params.length > 0) {
                    callType = 1;
                    if (!params[c2].isAssignableFrom(m.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                }
                h event = annotation.value();
                if (params.length > 1) {
                    callType = 2;
                    if (!params[1].isAssignableFrom(h.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (event != h.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (params.length <= 2) {
                    b methodReference = new b(callType, method);
                    e(handlerToEvent, methodReference, event, cls);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
            i2++;
            c2 = 0;
        }
        a info = new a(handlerToEvent);
        this.f1012a.put(cls, info);
        this.f1013b.put(cls, Boolean.valueOf(hasLifecycleMethods));
        return info;
    }
}
