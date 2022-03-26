package x;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h extends g {
    @Override // x.g
    public Typeface h(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f3684g, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f3690m.invoke(null, familyArray, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // x.g
    public Method t(Class cls) {
        Object familyArray = Array.newInstance(cls, 1);
        Class cls2 = Integer.TYPE;
        Method m2 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", familyArray.getClass(), String.class, cls2, cls2);
        m2.setAccessible(true);
        return m2;
    }
}
