package androidx.appcompat.widget;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h3 {

    /* renamed from: a  reason: collision with root package name */
    public Method f338a;

    /* renamed from: b  reason: collision with root package name */
    public Method f339b;

    /* renamed from: c  reason: collision with root package name */
    public Method f340c;

    public h3() {
        this.f338a = null;
        this.f339b = null;
        this.f340c = null;
        d();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f338a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f339b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f340c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException e4) {
        }
    }

    public void b(AutoCompleteTextView view) {
        d();
        Method method = this.f338a;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e2) {
            }
        }
    }

    public void a(AutoCompleteTextView view) {
        d();
        Method method = this.f339b;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e2) {
            }
        }
    }

    public void c(AutoCompleteTextView view) {
        d();
        Method method = this.f340c;
        if (method != null) {
            try {
                method.invoke(view, true);
            } catch (Exception e2) {
            }
        }
    }

    public static void d() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
