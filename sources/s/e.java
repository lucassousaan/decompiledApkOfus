package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.c1;
import f0.o;
import r.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public b f3427a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3428b;

    /* renamed from: c  reason: collision with root package name */
    public int f3429c;

    /* renamed from: d  reason: collision with root package name */
    public int f3430d;

    /* renamed from: e  reason: collision with root package name */
    public int f3431e;

    /* renamed from: f  reason: collision with root package name */
    public int f3432f;

    /* renamed from: g  reason: collision with root package name */
    public int f3433g;

    /* renamed from: h  reason: collision with root package name */
    public int f3434h;

    /* renamed from: i  reason: collision with root package name */
    public int f3435i;

    /* renamed from: j  reason: collision with root package name */
    public int f3436j;

    /* renamed from: k  reason: collision with root package name */
    public View f3437k;

    /* renamed from: l  reason: collision with root package name */
    public View f3438l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3439m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3440n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3441o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3442p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f3443q;

    public e(int width, int height) {
        super(width, height);
        this.f3428b = false;
        this.f3429c = 0;
        this.f3430d = 0;
        this.f3431e = -1;
        this.f3432f = -1;
        this.f3433g = 0;
        this.f3434h = 0;
        this.f3443q = new Rect();
    }

    public e(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f3428b = false;
        this.f3429c = 0;
        this.f3430d = 0;
        this.f3431e = -1;
        this.f3432f = -1;
        this.f3433g = 0;
        this.f3434h = 0;
        this.f3443q = new Rect();
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3410b);
        int[] iArr = a.f3409a;
        this.f3429c = a2.getInteger(0, 0);
        this.f3432f = a2.getResourceId(1, -1);
        this.f3430d = a2.getInteger(2, 0);
        this.f3431e = a2.getInteger(6, -1);
        this.f3433g = a2.getInt(5, 0);
        this.f3434h = a2.getInt(4, 0);
        boolean hasValue = a2.hasValue(3);
        this.f3428b = hasValue;
        if (hasValue) {
            this.f3427a = CoordinatorLayout.K(context, attrs, a2.getString(3));
        }
        a2.recycle();
        b bVar = this.f3427a;
        if (bVar != null) {
            bVar.g(this);
        }
    }

    public e(e p2) {
        super((ViewGroup.MarginLayoutParams) p2);
        this.f3428b = false;
        this.f3429c = 0;
        this.f3430d = 0;
        this.f3431e = -1;
        this.f3432f = -1;
        this.f3433g = 0;
        this.f3434h = 0;
        this.f3443q = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams p2) {
        super(p2);
        this.f3428b = false;
        this.f3429c = 0;
        this.f3430d = 0;
        this.f3431e = -1;
        this.f3432f = -1;
        this.f3433g = 0;
        this.f3434h = 0;
        this.f3443q = new Rect();
    }

    public e(ViewGroup.LayoutParams p2) {
        super(p2);
        this.f3428b = false;
        this.f3429c = 0;
        this.f3430d = 0;
        this.f3431e = -1;
        this.f3432f = -1;
        this.f3433g = 0;
        this.f3434h = 0;
        this.f3443q = new Rect();
    }

    public int e() {
        return this.f3432f;
    }

    public b f() {
        return this.f3427a;
    }

    public void o(b behavior) {
        b bVar = this.f3427a;
        if (bVar != behavior) {
            if (bVar != null) {
                bVar.j();
            }
            this.f3427a = behavior;
            this.f3428b = true;
            if (behavior != null) {
                behavior.g(this);
            }
        }
    }

    public void q(Rect r2) {
        this.f3443q.set(r2);
    }

    public Rect h() {
        return this.f3443q;
    }

    public boolean a() {
        return this.f3437k == null && this.f3432f != -1;
    }

    public boolean c() {
        if (this.f3427a == null) {
            this.f3439m = false;
        }
        return this.f3439m;
    }

    public boolean i(CoordinatorLayout parent, View child) {
        boolean z2 = this.f3439m;
        if (z2) {
            return true;
        }
        b bVar = this.f3427a;
        if (bVar != null) {
            bVar.a(parent, child);
        }
        boolean z3 = z2 | false;
        this.f3439m = z3;
        return z3;
    }

    public void m() {
        this.f3439m = false;
    }

    public void l(int type) {
        r(type, false);
    }

    public void r(int type, boolean accept) {
        switch (type) {
            case 0:
                this.f3440n = accept;
                return;
            case 1:
                this.f3441o = accept;
                return;
            default:
                return;
        }
    }

    public boolean j(int type) {
        switch (type) {
            case 0:
                return this.f3440n;
            case 1:
                return this.f3441o;
            default:
                return false;
        }
    }

    public boolean g() {
        return this.f3442p;
    }

    public void p(boolean changed) {
        this.f3442p = changed;
    }

    public void k() {
        this.f3442p = false;
    }

    public boolean b(CoordinatorLayout parent, View child, View dependency) {
        b bVar;
        return dependency == this.f3438l || s(dependency, c1.A(parent)) || ((bVar = this.f3427a) != null && bVar.e(parent, child, dependency));
    }

    public View d(CoordinatorLayout parent, View forChild) {
        if (this.f3432f == -1) {
            this.f3438l = null;
            this.f3437k = null;
            return null;
        }
        if (this.f3437k == null || !t(forChild, parent)) {
            n(forChild, parent);
        }
        return this.f3437k;
    }

    public final void n(View forChild, CoordinatorLayout parent) {
        View findViewById = parent.findViewById(this.f3432f);
        this.f3437k = findViewById;
        if (findViewById != null) {
            if (findViewById != parent) {
                View directChild = this.f3437k;
                for (ViewParent p2 = findViewById.getParent(); p2 != parent && p2 != null; p2 = p2.getParent()) {
                    if (p2 != forChild) {
                        if (p2 instanceof View) {
                            directChild = (View) p2;
                        }
                    } else if (parent.isInEditMode()) {
                        this.f3438l = null;
                        this.f3437k = null;
                        return;
                    } else {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                }
                this.f3438l = directChild;
            } else if (parent.isInEditMode()) {
                this.f3438l = null;
                this.f3437k = null;
            } else {
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            }
        } else if (parent.isInEditMode()) {
            this.f3438l = null;
            this.f3437k = null;
        } else {
            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + parent.getResources().getResourceName(this.f3432f) + " to anchor view " + forChild);
        }
    }

    public final boolean t(View forChild, CoordinatorLayout parent) {
        if (this.f3437k.getId() != this.f3432f) {
            return false;
        }
        View directChild = this.f3437k;
        for (ViewParent p2 = this.f3437k.getParent(); p2 != parent; p2 = p2.getParent()) {
            if (p2 == null || p2 == forChild) {
                this.f3438l = null;
                this.f3437k = null;
                return false;
            }
            if (p2 instanceof View) {
                directChild = (View) p2;
            }
        }
        this.f3438l = directChild;
        return true;
    }

    public final boolean s(View other, int layoutDirection) {
        e lp = (e) other.getLayoutParams();
        int absInset = o.b(lp.f3433g, layoutDirection);
        return absInset != 0 && (o.b(this.f3434h, layoutDirection) & absInset) == absInset;
    }
}
