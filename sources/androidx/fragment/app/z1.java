package androidx.fragment.app;

import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: b  reason: collision with root package name */
    public int f982b;

    /* renamed from: c  reason: collision with root package name */
    public int f983c;

    /* renamed from: d  reason: collision with root package name */
    public int f984d;

    /* renamed from: e  reason: collision with root package name */
    public int f985e;

    /* renamed from: f  reason: collision with root package name */
    public int f986f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f987g;

    /* renamed from: h  reason: collision with root package name */
    public String f988h;

    /* renamed from: i  reason: collision with root package name */
    public int f989i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f990j;

    /* renamed from: k  reason: collision with root package name */
    public int f991k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f992l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f993m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f994n;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f996p;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f981a = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public boolean f995o = false;

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public z1(q0 fragmentFactory, ClassLoader classLoader) {
    }

    public void d(y1 op) {
        this.f981a.add(op);
        op.f973c = this.f982b;
        op.f974d = this.f983c;
        op.f975e = this.f984d;
        op.f976f = this.f985e;
    }

    public z1 b(int containerViewId, f0 fragment, String tag) {
        j(containerViewId, fragment, tag, 1);
        return this;
    }

    public z1 c(ViewGroup container, f0 fragment, String tag) {
        fragment.G = container;
        b(container.getId(), fragment, tag);
        return this;
    }

    public void j(int containerViewId, f0 fragment, String tag, int opcmd) {
        Class<?> fragmentClass = fragment.getClass();
        int modifiers = fragmentClass.getModifiers();
        if (fragmentClass.isAnonymousClass() || !Modifier.isPublic(modifiers) || (fragmentClass.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + fragmentClass.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (tag != null) {
            String str = fragment.f783z;
            if (str == null || tag.equals(str)) {
                fragment.f783z = tag;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f783z + " now " + tag);
            }
        }
        if (containerViewId != 0) {
            if (containerViewId != -1) {
                int i2 = fragment.f781x;
                if (i2 == 0 || i2 == containerViewId) {
                    fragment.f781x = containerViewId;
                    fragment.f782y = containerViewId;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f781x + " now " + containerViewId);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + tag + " to container view with no id");
            }
        }
        d(new y1(opcmd, fragment));
    }

    public z1 l(int containerViewId, f0 fragment) {
        m(containerViewId, fragment, null);
        return this;
    }

    public z1 m(int containerViewId, f0 fragment, String tag) {
        if (containerViewId != 0) {
            j(containerViewId, fragment, tag, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public z1 k(f0 fragment) {
        d(new y1(3, fragment));
        return this;
    }

    public z1 i() {
        if (!this.f987g) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public z1 n(boolean reorderingAllowed) {
        this.f995o = reorderingAllowed;
        return this;
    }
}
