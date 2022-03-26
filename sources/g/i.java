package g;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f1959c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f1960a;

    /* renamed from: b  reason: collision with root package name */
    public Method f1961b;

    public i(Object realOwner, String methodName) {
        this.f1960a = realOwner;
        Class<?> c2 = realOwner.getClass();
        try {
            this.f1961b = c2.getMethod(methodName, f1959c);
        } catch (Exception e2) {
            InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c2.getName());
            ex.initCause(e2);
            throw ex;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        try {
            if (this.f1961b.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f1961b.invoke(this.f1960a, item)).booleanValue();
            }
            this.f1961b.invoke(this.f1960a, item);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
