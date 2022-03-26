package w0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final n f3657a = new n();

    /* renamed from: b  reason: collision with root package name */
    public final n f3658b = new n();

    public boolean f(String name) {
        return this.f3657a.get(name) != null;
    }

    public e e(String name) {
        if (f(name)) {
            return (e) this.f3657a.get(name);
        }
        throw new IllegalArgumentException();
    }

    public void h(String name, e timing) {
        this.f3657a.put(name, timing);
    }

    public void g(String name, PropertyValuesHolder[] values) {
        this.f3658b.put(name, values);
    }

    public static d b(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static d c(Context context, int id) {
        try {
            Animator animator = AnimatorInflater.loadAnimator(context, id);
            if (animator instanceof AnimatorSet) {
                AnimatorSet set = (AnimatorSet) animator;
                return d(set.getChildAnimations());
            } else if (animator == null) {
                return null;
            } else {
                List<Animator> animators = new ArrayList<>();
                animators.add(animator);
                return d(animators);
            }
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(id), e2);
            return null;
        }
    }

    public static d d(List list) {
        d spec = new d();
        int count = list.size();
        for (int i2 = 0; i2 < count; i2++) {
            a(spec, (Animator) list.get(i2));
        }
        return spec;
    }

    public static void a(d spec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator anim = (ObjectAnimator) animator;
            spec.g(anim.getPropertyName(), anim.getValues());
            spec.h(anim.getPropertyName(), e.b(anim));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof d)) {
            return false;
        }
        d that = (d) o2;
        return this.f3657a.equals(that.f3657a);
    }

    public int hashCode() {
        return this.f3657a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3657a + "}\n";
    }
}
