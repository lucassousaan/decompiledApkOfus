package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f1009a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f1010b;

    public b(int callType, Method method) {
        this.f1009a = callType;
        this.f1010b = method;
        method.setAccessible(true);
    }

    public void a(m source, h event, Object target) {
        try {
            switch (this.f1009a) {
                case 0:
                    this.f1010b.invoke(target, new Object[0]);
                    return;
                case 1:
                    this.f1010b.invoke(target, source);
                    return;
                case 2:
                    this.f1010b.invoke(target, source, event);
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to call observer method", e3.getCause());
        }
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof b)) {
            return false;
        }
        b that = (b) o2;
        return this.f1009a == that.f1009a && this.f1010b.getName().equals(that.f1010b.getName());
    }

    public int hashCode() {
        return (this.f1009a * 31) + this.f1010b.getName().hashCode();
    }
}
