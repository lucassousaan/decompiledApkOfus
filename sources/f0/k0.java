package f0;

import android.os.Build;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1880a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f1881b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1882c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1883d;

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public abstract boolean h(Object obj, Object obj2);

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public k0(int tagKey, Class cls, int frameworkMinimumSdk) {
        this(tagKey, cls, 0, frameworkMinimumSdk);
    }

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public k0(int tagKey, Class cls, int contentChangeType, int frameworkMinimumSdk) {
        this.f1880a = tagKey;
        this.f1881b = cls;
        this.f1883d = contentChangeType;
        this.f1882c = frameworkMinimumSdk;
    }

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public void g(View view, Object obj) {
        if (c()) {
            e(view, obj);
            return;
        }
        b();
        if (h(f(view), obj)) {
            c1.j(view);
            view.setTag(this.f1880a, obj);
            c1.U(view, this.f1883d);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public Object f(View view) {
        if (c()) {
            return d(view);
        }
        b();
        Object value = view.getTag(this.f1880a);
        if (this.f1881b.isInstance(value)) {
            return value;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public final boolean c() {
        return Build.VERSION.SDK_INT >= this.f1882c;
    }

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: f0.k0 != androidx.core.view.ViewCompat$AccessibilityViewProperty<T> */
    public boolean a(Boolean a2, Boolean b2) {
        boolean aBool = a2 != null && a2.booleanValue();
        boolean bBool = b2 != null && b2.booleanValue();
        return aBool == bBool;
    }
}
