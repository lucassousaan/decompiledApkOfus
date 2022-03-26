package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import m0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t0 implements LayoutInflater.Factory2 {

    /* renamed from: b  reason: collision with root package name */
    public final m1 f922b;

    public t0(m1 fragmentManager) {
        this.f922b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        w1 fragmentStateManager;
        if (o0.class.getName().equals(name)) {
            return new o0(context, attrs, this.f922b);
        }
        f0 fragment = null;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname = attrs.getAttributeValue(null, "class");
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f2470a);
        int containerId = 0;
        if (fname == null) {
            int[] iArr = a.f2470a;
            fname = a2.getString(0);
        }
        int[] iArr2 = a.f2470a;
        int id = a2.getResourceId(1, -1);
        String tag = a2.getString(2);
        a2.recycle();
        if (fname == null || !q0.b(context.getClassLoader(), fname)) {
            return null;
        }
        if (parent != null) {
            containerId = parent.getId();
        }
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        if (id != -1) {
            fragment = this.f922b.Y(id);
        }
        if (fragment == null && tag != null) {
            fragment = this.f922b.Z(tag);
        }
        if (fragment == null && containerId != -1) {
            fragment = this.f922b.Y(containerId);
        }
        if (fragment == null) {
            fragment = this.f922b.h0().a(context.getClassLoader(), fname);
            fragment.f772o = true;
            fragment.f781x = id != 0 ? id : containerId;
            fragment.f782y = containerId;
            fragment.f783z = tag;
            fragment.f773p = true;
            m1 m1Var = this.f922b;
            fragment.f777t = m1Var;
            fragment.f778u = m1Var.j0();
            fragment.q0(this.f922b.j0().k(), attrs, fragment.f760c);
            fragmentStateManager = this.f922b.d(fragment);
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(id));
            }
        } else if (!fragment.f773p) {
            fragment.f773p = true;
            m1 m1Var2 = this.f922b;
            fragment.f777t = m1Var2;
            fragment.f778u = m1Var2.j0();
            fragment.q0(this.f922b.j0().k(), attrs, fragment.f760c);
            fragmentStateManager = this.f922b.o(fragment);
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(id));
            }
        } else {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
        }
        fragment.G = (ViewGroup) parent;
        fragmentStateManager.m();
        fragmentStateManager.j();
        View view = fragment.H;
        if (view != null) {
            if (id != 0) {
                view.setId(id);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(tag);
            }
            fragment.H.addOnAttachStateChangeListener(new s0(this, fragmentStateManager));
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + fname + " did not create a view.");
    }
}
