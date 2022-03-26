package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.example.helloworld.R;
import e0.c;
import e0.e;
import e0.g;
import f0.a0;
import f0.c1;
import f0.o;
import f0.x;
import f0.x1;
import f0.y;
import f0.z;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r.a;
import s.b;
import s.d;
import s.f;
import s.h;
import s.i;
import s.j;
import s.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements x, y {

    /* renamed from: v  reason: collision with root package name */
    public static final String f628v;

    /* renamed from: w  reason: collision with root package name */
    public static final Class[] f629w;

    /* renamed from: x  reason: collision with root package name */
    public static final ThreadLocal f630x;

    /* renamed from: y  reason: collision with root package name */
    public static final Comparator f631y;

    /* renamed from: z  reason: collision with root package name */
    public static final e f632z;

    /* renamed from: b  reason: collision with root package name */
    public final List f633b;

    /* renamed from: c  reason: collision with root package name */
    public final j f634c;

    /* renamed from: d  reason: collision with root package name */
    public final List f635d;

    /* renamed from: e  reason: collision with root package name */
    public final List f636e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f637f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f638g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f639h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f640i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f641j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f642k;

    /* renamed from: l  reason: collision with root package name */
    public View f643l;

    /* renamed from: m  reason: collision with root package name */
    public View f644m;

    /* renamed from: n  reason: collision with root package name */
    public f f645n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f646o;

    /* renamed from: p  reason: collision with root package name */
    public x1 f647p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f648q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f649r;

    /* renamed from: s  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f650s;

    /* renamed from: t  reason: collision with root package name */
    public a0 f651t;

    /* renamed from: u  reason: collision with root package name */
    public final z f652u;

    static {
        Package pkg = CoordinatorLayout.class.getPackage();
        f628v = pkg != null ? pkg.getName() : null;
        f631y = new i();
        f629w = new Class[]{Context.class, AttributeSet.class};
        f630x = new ThreadLocal();
        f632z = new g(12);
    }

    public static Rect g() {
        Rect rect = (Rect) ((g) f632z).b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void O(Rect rect) {
        rect.setEmpty();
        ((g) f632z).a(rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a2;
        this.f633b = new ArrayList();
        this.f634c = new j();
        this.f635d = new ArrayList();
        this.f636e = new ArrayList();
        this.f638g = new int[2];
        this.f639h = new int[2];
        this.f652u = new z();
        if (defStyleAttr == 0) {
            a2 = context.obtainStyledAttributes(attrs, a.f3409a, 0, 2131755729);
        } else {
            a2 = context.obtainStyledAttributes(attrs, a.f3409a, defStyleAttr, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (defStyleAttr == 0) {
                saveAttributeDataForStyleable(context, a.f3409a, attrs, a2, 0, 2131755729);
            } else {
                saveAttributeDataForStyleable(context, a.f3409a, attrs, a2, defStyleAttr, 0);
            }
        }
        int[] iArr = a.f3409a;
        int keylineArrayRes = a2.getResourceId(0, 0);
        if (keylineArrayRes != 0) {
            Resources res = context.getResources();
            this.f642k = res.getIntArray(keylineArrayRes);
            float density = res.getDisplayMetrics().density;
            int count = this.f642k.length;
            for (int i2 = 0; i2 < count; i2++) {
                int[] iArr2 = this.f642k;
                iArr2[i2] = (int) (iArr2[i2] * density);
            }
        }
        int[] iArr3 = a.f3409a;
        this.f649r = a2.getDrawable(1);
        a2.recycle();
        X();
        super.setOnHierarchyChangeListener(new d(this));
        if (c1.y(this) == 0) {
            c1.s0(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f650s = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f646o) {
            if (this.f645n == null) {
                this.f645n = new f(this);
            }
            ViewTreeObserver vto = getViewTreeObserver();
            vto.addOnPreDrawListener(this.f645n);
        }
        if (this.f647p == null && c1.x(this)) {
            c1.i0(this);
        }
        this.f641j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f646o && this.f645n != null) {
            ViewTreeObserver vto = getViewTreeObserver();
            vto.removeOnPreDrawListener(this.f645n);
        }
        View view = this.f644m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f641j = false;
    }

    public void setStatusBarBackground(Drawable bg) {
        Drawable drawable = this.f649r;
        if (drawable != bg) {
            Drawable drawable2 = null;
            if (drawable != null) {
                drawable.setCallback(null);
            }
            if (bg != null) {
                drawable2 = bg.mutate();
            }
            this.f649r = drawable2;
            if (drawable2 != null) {
                if (drawable2.isStateful()) {
                    this.f649r.setState(getDrawableState());
                }
                y.a.g(this.f649r, c1.A(this));
                this.f649r.setVisible(getVisibility() == 0, false);
                this.f649r.setCallback(this);
            }
            c1.c0(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f649r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] state = getDrawableState();
        boolean changed = false;
        Drawable d2 = this.f649r;
        if (d2 != null && d2.isStateful()) {
            changed = false | d2.setState(state);
        }
        if (changed) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f649r;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean visible = visibility == 0;
        Drawable drawable = this.f649r;
        if (drawable != null && drawable.isVisible() != visible) {
            this.f649r.setVisible(visible, false);
        }
    }

    public void setStatusBarBackgroundResource(int resId) {
        setStatusBarBackground(resId != 0 ? v.d.b(getContext(), resId) : null);
    }

    public void setStatusBarBackgroundColor(int color) {
        setStatusBarBackground(new ColorDrawable(color));
    }

    public final x1 W(x1 insets) {
        if (c.a(this.f647p, insets)) {
            return insets;
        }
        this.f647p = insets;
        boolean z2 = true;
        boolean z3 = insets != null && insets.i() > 0;
        this.f648q = z3;
        if (z3 || getBackground() != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        x1 insets2 = k(insets);
        requestLayout();
        return insets2;
    }

    public final x1 getLastWindowInsets() {
        return this.f647p;
    }

    public final void Q(boolean notifyOnInterceptTouchEvent) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            s.e lp = (s.e) child.getLayoutParams();
            b b2 = lp.f();
            if (b2 != null) {
                long now = SystemClock.uptimeMillis();
                MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                if (notifyOnInterceptTouchEvent) {
                    b2.k(this, child, cancelEvent);
                } else {
                    b2.D(this, child, cancelEvent);
                }
                cancelEvent.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            s.e lp2 = (s.e) getChildAt(i3).getLayoutParams();
            lp2.m();
        }
        this.f643l = null;
        this.f640i = false;
    }

    public final void z(List list) {
        list.clear();
        boolean useCustomOrder = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            int childIndex = useCustomOrder ? getChildDrawingOrder(childCount, i2) : i2;
            View child = getChildAt(childIndex);
            list.add(child);
        }
        Comparator comparator = f631y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean L(MotionEvent ev, int type) {
        boolean intercepted = false;
        boolean newBlock = false;
        MotionEvent cancelEvent = null;
        int action = ev.getActionMasked();
        List<View> topmostChildList = this.f635d;
        z(topmostChildList);
        int childCount = topmostChildList.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = topmostChildList.get(i2);
            s.e lp = (s.e) child.getLayoutParams();
            b b2 = lp.f();
            if (!(intercepted || newBlock) || action == 0) {
                if (!intercepted && b2 != null) {
                    switch (type) {
                        case 0:
                            intercepted = b2.k(this, child, ev);
                            break;
                        case 1:
                            intercepted = b2.D(this, child, ev);
                            break;
                    }
                    if (intercepted) {
                        this.f643l = child;
                    }
                }
                boolean wasBlocking = lp.c();
                boolean isBlocking = lp.i(this, child);
                newBlock = isBlocking && !wasBlocking;
                if (isBlocking && !newBlock) {
                    topmostChildList.clear();
                    return intercepted;
                }
            } else if (b2 != null) {
                if (cancelEvent == null) {
                    long now = SystemClock.uptimeMillis();
                    cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                }
                switch (type) {
                    case 0:
                        b2.k(this, child, cancelEvent);
                        continue;
                    case 1:
                        b2.D(this, child, cancelEvent);
                        continue;
                }
            }
        }
        topmostChildList.clear();
        return intercepted;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            Q(true);
        }
        boolean intercepted = L(ev, 0);
        if (action == 1 || action == 3) {
            Q(true);
        }
        return intercepted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6 != false) goto L_0x0017;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 0
            r4 = 0
            int r5 = r19.getActionMasked()
            android.view.View r6 = r0.f643l
            r7 = 1
            if (r6 != 0) goto L_0x0017
            boolean r6 = r0.L(r1, r7)
            r3 = r6
            if (r6 == 0) goto L_0x002b
        L_0x0017:
            android.view.View r6 = r0.f643l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            s.e r6 = (s.e) r6
            s.b r8 = r6.f()
            if (r8 == 0) goto L_0x002b
            android.view.View r9 = r0.f643l
            boolean r2 = r8.D(r0, r9, r1)
        L_0x002b:
            android.view.View r6 = r0.f643l
            if (r6 != 0) goto L_0x0035
            boolean r6 = super.onTouchEvent(r19)
            r2 = r2 | r6
            goto L_0x004c
        L_0x0035:
            if (r3 == 0) goto L_0x004c
            if (r4 != 0) goto L_0x0049
            long r16 = android.os.SystemClock.uptimeMillis()
            r12 = 3
            r13 = 0
            r14 = 0
            r15 = 0
            r8 = r16
            r10 = r16
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
        L_0x0049:
            super.onTouchEvent(r4)
        L_0x004c:
            if (r4 == 0) goto L_0x0051
            r4.recycle()
        L_0x0051:
            if (r5 == r7) goto L_0x0056
            r6 = 3
            if (r5 != r6) goto L_0x005a
        L_0x0056:
            r6 = 0
            r0.Q(r6)
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        if (disallowIntercept && !this.f640i) {
            Q(false);
            this.f640i = true;
        }
    }

    public final int w(int index) {
        int[] iArr = this.f642k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + index);
            return 0;
        } else if (index >= 0 && index < iArr.length) {
            return iArr[index];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + index + " out of range for " + this);
            return 0;
        }
    }

    public static b K(Context context, AttributeSet attrs, String name) {
        String fullName;
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        if (name.startsWith(".")) {
            fullName = context.getPackageName() + name;
        } else if (name.indexOf(46) >= 0) {
            fullName = name;
        } else {
            String str = f628v;
            if (!TextUtils.isEmpty(str)) {
                fullName = str + '.' + name;
            } else {
                fullName = name;
            }
        }
        try {
            ThreadLocal threadLocal = f630x;
            Map<String, Constructor<Behavior>> constructors = (Map) threadLocal.get();
            if (constructors == null) {
                constructors = new HashMap<>();
                threadLocal.set(constructors);
            }
            Constructor<Behavior> constructor = constructors.get(fullName);
            if (constructor == null) {
                constructor = Class.forName(fullName, false, context.getClassLoader()).getConstructor(f629w);
                constructor.setAccessible(true);
                constructors.put(fullName, constructor);
            }
            return (b) constructor.newInstance(context, attrs);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + fullName, e2);
        }
    }

    public s.e y(View child) {
        s.e result = (s.e) child.getLayoutParams();
        if (!result.f3428b) {
            s.c defaultBehavior = null;
            for (Class<?> childClass = child.getClass(); childClass != null; childClass = childClass.getSuperclass()) {
                s.c cVar = (s.c) childClass.getAnnotation(s.c.class);
                defaultBehavior = cVar;
                if (cVar != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    result.o((b) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            result.f3428b = true;
        }
        return result;
    }

    public final void M() {
        this.f633b.clear();
        this.f634c.c();
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View view = getChildAt(i2);
            s.e lp = y(view);
            lp.d(this, view);
            this.f634c.b(view);
            for (int j2 = 0; j2 < count; j2++) {
                if (j2 != i2) {
                    View other = getChildAt(j2);
                    if (lp.b(this, view, other)) {
                        if (!this.f634c.d(other)) {
                            this.f634c.b(other);
                        }
                        this.f634c.a(other, view);
                    }
                }
            }
        }
        this.f633b.addAll(this.f634c.i());
        Collections.reverse(this.f633b);
    }

    public void t(View descendant, Rect out) {
        k.a(this, descendant, out);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void J(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
        if (r29.m(r35, r21, r26, r23, r28, 0) == false) goto L_0x014a;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final x1 k(x1 insets) {
        if (insets.l()) {
            return insets;
        }
        int z2 = getChildCount();
        for (int i2 = 0; i2 < z2; i2++) {
            View child = getChildAt(i2);
            if (c1.x(child)) {
                s.e lp = (s.e) child.getLayoutParams();
                b b2 = lp.f();
                if (b2 != null) {
                    insets = b2.f(insets);
                    if (insets.l()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return insets;
    }

    public void I(View child, int layoutDirection) {
        s.e lp = (s.e) child.getLayoutParams();
        if (!lp.a()) {
            View view = lp.f3437k;
            if (view != null) {
                D(child, view, layoutDirection);
                return;
            }
            int i2 = lp.f3431e;
            if (i2 >= 0) {
                E(child, i2, layoutDirection);
            } else {
                C(child, layoutDirection);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int layoutDirection = c1.A(this);
        int childCount = this.f633b.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = (View) this.f633b.get(i2);
            if (child.getVisibility() != 8) {
                s.e lp = (s.e) child.getLayoutParams();
                b behavior = lp.f();
                if (behavior == null || !behavior.l(this, child, layoutDirection)) {
                    I(child, layoutDirection);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas c2) {
        super.onDraw(c2);
        if (this.f648q && this.f649r != null) {
            x1 x1Var = this.f647p;
            int inset = x1Var != null ? x1Var.i() : 0;
            if (inset > 0) {
                this.f649r.setBounds(0, 0, getWidth(), inset);
                this.f649r.draw(c2);
            }
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean fitSystemWindows) {
        super.setFitsSystemWindows(fitSystemWindows);
        X();
    }

    public void N(View child, Rect r2) {
        s.e lp = (s.e) child.getLayoutParams();
        lp.q(r2);
    }

    public void x(View child, Rect out) {
        s.e lp = (s.e) child.getLayoutParams();
        out.set(lp.h());
    }

    public void q(View child, boolean transform, Rect out) {
        if (child.isLayoutRequested() || child.getVisibility() == 8) {
            out.setEmpty();
        } else if (transform) {
            t(child, out);
        } else {
            out.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
        }
    }

    public final void v(int layoutDirection, Rect anchorRect, Rect out, s.e lp, int childWidth, int childHeight) {
        int left;
        int top;
        int absGravity = o.b(R(lp.f3429c), layoutDirection);
        int absAnchorGravity = o.b(S(lp.f3430d), layoutDirection);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int anchorHgrav = absAnchorGravity & 7;
        int anchorVgrav = absAnchorGravity & 112;
        switch (anchorHgrav) {
            case 1:
                left = anchorRect.left + (anchorRect.width() / 2);
                break;
            case 5:
                left = anchorRect.right;
                break;
            default:
                left = anchorRect.left;
                break;
        }
        switch (anchorVgrav) {
            case 16:
                top = anchorRect.top + (anchorRect.height() / 2);
                break;
            case 80:
                top = anchorRect.bottom;
                break;
            default:
                top = anchorRect.top;
                break;
        }
        switch (hgrav) {
            case 1:
                left -= childWidth / 2;
                break;
            case 5:
                break;
            default:
                left -= childWidth;
                break;
        }
        switch (vgrav) {
            case 16:
                top -= childHeight / 2;
                break;
            case 80:
                break;
            default:
                top -= childHeight;
                break;
        }
        out.set(left, top, left + childWidth, top + childHeight);
    }

    public final void j(s.e lp, Rect out, int childWidth, int childHeight) {
        int width = getWidth();
        int height = getHeight();
        int left = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, Math.min(out.left, ((width - getPaddingRight()) - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin));
        int top = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, Math.min(out.top, ((height - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin));
        out.set(left, top, left + childWidth, top + childHeight);
    }

    public void u(View child, int layoutDirection, Rect anchorRect, Rect out) {
        s.e lp = (s.e) child.getLayoutParams();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        v(layoutDirection, anchorRect, out, lp, childWidth, childHeight);
        j(lp, out, childWidth, childHeight);
    }

    public final void D(View child, View anchor, int layoutDirection) {
        Rect anchorRect = g();
        Rect childRect = g();
        try {
            t(anchor, anchorRect);
            u(child, layoutDirection, anchorRect, childRect);
            child.layout(childRect.left, childRect.top, childRect.right, childRect.bottom);
        } finally {
            O(anchorRect);
            O(childRect);
        }
    }

    public final void E(View child, int keyline, int layoutDirection) {
        int keyline2;
        s.e lp = (s.e) child.getLayoutParams();
        int absGravity = o.b(T(lp.f3429c), layoutDirection);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        if (layoutDirection == 1) {
            keyline2 = width - keyline;
        } else {
            keyline2 = keyline;
        }
        int left = w(keyline2) - childWidth;
        int top = 0;
        switch (hgrav) {
            case 1:
                left += childWidth / 2;
                break;
            case 5:
                left += childWidth;
                break;
        }
        switch (vgrav) {
            case 16:
                top = 0 + (childHeight / 2);
                break;
            case 80:
                top = 0 + childHeight;
                break;
        }
        int left2 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, Math.min(left, ((width - getPaddingRight()) - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin));
        int top2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, Math.min(top, ((height - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin));
        child.layout(left2, top2, left2 + childWidth, top2 + childHeight);
    }

    public final void C(View child, int layoutDirection) {
        s.e lp = (s.e) child.getLayoutParams();
        Rect parent = g();
        parent.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        if (this.f647p != null && c1.x(this) && !c1.x(child)) {
            parent.left += this.f647p.g();
            parent.top += this.f647p.i();
            parent.right -= this.f647p.h();
            parent.bottom -= this.f647p.f();
        }
        Rect out = g();
        o.a(S(lp.f3429c), child.getMeasuredWidth(), child.getMeasuredHeight(), parent, out, layoutDirection);
        child.layout(out.left, out.top, out.right, out.bottom);
        O(parent);
        O(out);
    }

    public static int S(int gravity) {
        if ((gravity & 7) == 0) {
            gravity |= 8388611;
        }
        if ((gravity & 112) == 0) {
            return gravity | 48;
        }
        return gravity;
    }

    public static int T(int gravity) {
        if (gravity == 0) {
            return 8388661;
        }
        return gravity;
    }

    public static int R(int gravity) {
        if (gravity == 0) {
            return 17;
        }
        return gravity;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        s.e lp = (s.e) child.getLayoutParams();
        b bVar = lp.f3427a;
        if (bVar != null) {
            bVar.d();
            if (0.0f > 0.0f) {
                if (this.f637f == null) {
                    this.f637f = new Paint();
                }
                Paint paint = this.f637f;
                lp.f3427a.c();
                paint.setColor(-16777216);
                this.f637f.setAlpha(i(Math.round(255.0f * 0.0f), 0, 255));
                int saved = canvas.save();
                if (child.isOpaque()) {
                    canvas.clipRect(child.getLeft(), child.getTop(), child.getRight(), child.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f637f);
                canvas.restoreToCount(saved);
            }
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public static int i(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public final void H(int type) {
        boolean handled;
        int layoutDirection = c1.A(this);
        int childCount = this.f633b.size();
        Rect inset = g();
        Rect drawRect = g();
        Rect lastDrawRect = g();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = (View) this.f633b.get(i2);
            s.e lp = (s.e) child.getLayoutParams();
            if (type != 0 || child.getVisibility() != 8) {
                for (int j2 = 0; j2 < i2; j2++) {
                    if (lp.f3438l == ((View) this.f633b.get(j2))) {
                        G(child, layoutDirection);
                    }
                }
                q(child, true, drawRect);
                if (lp.f3433g != 0 && !drawRect.isEmpty()) {
                    int absInsetEdge = o.b(lp.f3433g, layoutDirection);
                    switch (absInsetEdge & 112) {
                        case 48:
                            inset.top = Math.max(inset.top, drawRect.bottom);
                            break;
                        case 80:
                            inset.bottom = Math.max(inset.bottom, getHeight() - drawRect.top);
                            break;
                    }
                    switch (absInsetEdge & 7) {
                        case 3:
                            inset.left = Math.max(inset.left, drawRect.right);
                            break;
                        case 5:
                            inset.right = Math.max(inset.right, getWidth() - drawRect.left);
                            break;
                    }
                }
                if (lp.f3434h != 0 && child.getVisibility() == 0) {
                    F(child, inset, layoutDirection);
                }
                if (type != 2) {
                    x(child, lastDrawRect);
                    if (!lastDrawRect.equals(drawRect)) {
                        N(child, drawRect);
                    }
                }
                for (int j3 = i2 + 1; j3 < childCount; j3++) {
                    View checkChild = (View) this.f633b.get(j3);
                    s.e checkLp = (s.e) checkChild.getLayoutParams();
                    b b2 = checkLp.f();
                    if (b2 != null && b2.e(this, checkChild, child)) {
                        if (type != 0 || !checkLp.g()) {
                            switch (type) {
                                case 2:
                                    b2.i(this, checkChild, child);
                                    handled = true;
                                    break;
                                default:
                                    handled = b2.h(this, checkChild, child);
                                    break;
                            }
                            if (type == 1) {
                                checkLp.p(handled);
                            }
                        } else {
                            checkLp.k();
                        }
                    }
                }
            }
        }
        O(inset);
        O(drawRect);
        O(lastDrawRect);
    }

    public final void F(View child, Rect inset, int layoutDirection) {
        int distance;
        int i2;
        int distance2;
        int i3;
        int distance3;
        int i4;
        int distance4;
        int i5;
        if (c1.P(child) && child.getWidth() > 0 && child.getHeight() > 0) {
            s.e lp = (s.e) child.getLayoutParams();
            b behavior = lp.f();
            Rect dodgeRect = g();
            Rect bounds = g();
            bounds.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
            if (behavior == null || !behavior.b(this, child, dodgeRect)) {
                dodgeRect.set(bounds);
            } else if (!bounds.contains(dodgeRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + dodgeRect.toShortString() + " | Bounds:" + bounds.toShortString());
            }
            O(bounds);
            if (dodgeRect.isEmpty()) {
                O(dodgeRect);
                return;
            }
            int absDodgeInsetEdges = o.b(lp.f3434h, layoutDirection);
            boolean offsetY = false;
            if ((absDodgeInsetEdges & 48) == 48 && (distance4 = (dodgeRect.top - ((ViewGroup.MarginLayoutParams) lp).topMargin) - lp.f3436j) < (i5 = inset.top)) {
                V(child, i5 - distance4);
                offsetY = true;
            }
            int distance5 = absDodgeInsetEdges & 80;
            if (distance5 == 80 && (distance3 = ((getHeight() - dodgeRect.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) + lp.f3436j) < (i4 = inset.bottom)) {
                V(child, distance3 - i4);
                offsetY = true;
            }
            if (!offsetY) {
                V(child, 0);
            }
            boolean offsetX = false;
            if ((absDodgeInsetEdges & 3) == 3 && (distance2 = (dodgeRect.left - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - lp.f3435i) < (i3 = inset.left)) {
                U(child, i3 - distance2);
                offsetX = true;
            }
            int distance6 = absDodgeInsetEdges & 5;
            if (distance6 == 5 && (distance = ((getWidth() - dodgeRect.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin) + lp.f3435i) < (i2 = inset.right)) {
                U(child, distance - i2);
                offsetX = true;
            }
            if (!offsetX) {
                U(child, 0);
            }
            O(dodgeRect);
        }
    }

    public final void U(View child, int offsetX) {
        s.e lp = (s.e) child.getLayoutParams();
        int i2 = lp.f3435i;
        if (i2 != offsetX) {
            int dx = offsetX - i2;
            c1.V(child, dx);
            lp.f3435i = offsetX;
        }
    }

    public final void V(View child, int offsetY) {
        s.e lp = (s.e) child.getLayoutParams();
        int i2 = lp.f3436j;
        if (i2 != offsetY) {
            int dy = offsetY - i2;
            c1.W(child, dy);
            lp.f3436j = offsetY;
        }
    }

    public void l(View view) {
        List<View> dependents = this.f634c.g(view);
        if (!(dependents == null || dependents.isEmpty())) {
            for (int i2 = 0; i2 < dependents.size(); i2++) {
                View child = dependents.get(i2);
                s.e lp = (s.e) child.getLayoutParams();
                b b2 = lp.f();
                if (b2 != null) {
                    b2.h(this, child, view);
                }
            }
        }
    }

    public List r(View child) {
        List<View> dependencies = this.f634c.h(child);
        this.f636e.clear();
        if (dependencies != null) {
            this.f636e.addAll(dependencies);
        }
        return this.f636e;
    }

    public List s(View child) {
        List<View> edges = this.f634c.g(child);
        this.f636e.clear();
        if (edges != null) {
            this.f636e.addAll(edges);
        }
        return this.f636e;
    }

    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f633b);
    }

    public void m() {
        boolean hasDependencies = false;
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View child = getChildAt(i2);
            if (A(child)) {
                hasDependencies = true;
                break;
            }
            i2++;
        }
        if (hasDependencies == this.f646o) {
            return;
        }
        if (hasDependencies) {
            h();
        } else {
            P();
        }
    }

    public final boolean A(View child) {
        return this.f634c.j(child);
    }

    public void h() {
        if (this.f641j) {
            if (this.f645n == null) {
                this.f645n = new f(this);
            }
            ViewTreeObserver vto = getViewTreeObserver();
            vto.addOnPreDrawListener(this.f645n);
        }
        this.f646o = true;
    }

    public void P() {
        if (this.f641j && this.f645n != null) {
            ViewTreeObserver vto = getViewTreeObserver();
            vto.removeOnPreDrawListener(this.f645n);
        }
        this.f646o = false;
    }

    public void G(View child, int layoutDirection) {
        b b2;
        s.e lp = (s.e) child.getLayoutParams();
        if (lp.f3437k != null) {
            Rect anchorRect = g();
            Rect childRect = g();
            Rect desiredChildRect = g();
            t(lp.f3437k, anchorRect);
            boolean changed = false;
            q(child, false, childRect);
            int childWidth = child.getMeasuredWidth();
            int childHeight = child.getMeasuredHeight();
            v(layoutDirection, anchorRect, desiredChildRect, lp, childWidth, childHeight);
            if (!(desiredChildRect.left == childRect.left && desiredChildRect.top == childRect.top)) {
                changed = true;
            }
            j(lp, desiredChildRect, childWidth, childHeight);
            int dx = desiredChildRect.left - childRect.left;
            int dy = desiredChildRect.top - childRect.top;
            if (dx != 0) {
                c1.V(child, dx);
            }
            if (dy != 0) {
                c1.W(child, dy);
            }
            if (changed && (b2 = lp.f()) != null) {
                b2.h(this, child, lp.f3437k);
            }
            O(anchorRect);
            O(childRect);
            O(desiredChildRect);
        }
    }

    public boolean B(View child, int x2, int y2) {
        Rect r2 = g();
        t(child, r2);
        try {
            return r2.contains(x2, y2);
        } finally {
            O(r2);
        }
    }

    /* renamed from: o */
    public s.e generateLayoutParams(AttributeSet attrs) {
        return new s.e(getContext(), attrs);
    }

    /* renamed from: p */
    public s.e generateLayoutParams(ViewGroup.LayoutParams p2) {
        if (p2 instanceof s.e) {
            return new s.e((s.e) p2);
        }
        if (p2 instanceof ViewGroup.MarginLayoutParams) {
            return new s.e((ViewGroup.MarginLayoutParams) p2);
        }
        return new s.e(p2);
    }

    /* renamed from: n */
    public s.e generateDefaultLayoutParams() {
        return new s.e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof s.e) && super.checkLayoutParams(p2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return f(child, target, nestedScrollAxes, 0);
    }

    @Override // f0.x
    public boolean f(View child, View target, int axes, int type) {
        int childCount = getChildCount();
        boolean handled = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                s.e lp = (s.e) view.getLayoutParams();
                b viewBehavior = lp.f();
                if (viewBehavior != null) {
                    boolean accepted = viewBehavior.A(this, view, child, target, axes, type);
                    lp.r(type, accepted);
                    handled |= accepted;
                } else {
                    lp.r(type, false);
                }
            }
        }
        return handled;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        a(child, target, nestedScrollAxes, 0);
    }

    @Override // f0.x
    public void a(View child, View target, int nestedScrollAxes, int type) {
        b viewBehavior;
        this.f652u.b(nestedScrollAxes, type);
        this.f644m = target;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            s.e lp = (s.e) view.getLayoutParams();
            if (lp.j(type) && (viewBehavior = lp.f()) != null) {
                viewBehavior.v(this, view, child, target, nestedScrollAxes, type);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View target) {
        d(target, 0);
    }

    @Override // f0.x
    public void d(View target, int type) {
        this.f652u.d(type);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            s.e lp = (s.e) view.getLayoutParams();
            if (lp.j(type)) {
                b viewBehavior = lp.f();
                if (viewBehavior != null) {
                    viewBehavior.C(this, view, target, type);
                }
                lp.l(type);
                lp.k();
            }
        }
        this.f644m = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        c(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    @Override // f0.x
    public void c(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        b(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0, this.f639h);
    }

    @Override // f0.y
    public void b(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        int childCount;
        int yConsumed;
        int childCount2 = getChildCount();
        boolean accepted = false;
        int xConsumed = 0;
        int yConsumed2 = 0;
        int i2 = 0;
        while (i2 < childCount2) {
            View view = getChildAt(i2);
            if (view.getVisibility() == 8) {
                childCount = childCount2;
            } else {
                s.e lp = (s.e) view.getLayoutParams();
                if (!lp.j(type)) {
                    childCount = childCount2;
                } else {
                    b viewBehavior = lp.f();
                    if (viewBehavior != null) {
                        int[] iArr = this.f638g;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        childCount = childCount2;
                        viewBehavior.t(this, view, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, iArr);
                        int[] iArr2 = this.f638g;
                        int xConsumed2 = dxUnconsumed > 0 ? Math.max(xConsumed, iArr2[0]) : Math.min(xConsumed, iArr2[0]);
                        int[] iArr3 = this.f638g;
                        if (dyUnconsumed > 0) {
                            yConsumed = Math.max(yConsumed2, iArr3[1]);
                        } else {
                            yConsumed = Math.min(yConsumed2, iArr3[1]);
                        }
                        xConsumed = xConsumed2;
                        yConsumed2 = yConsumed;
                        accepted = true;
                    } else {
                        childCount = childCount2;
                    }
                }
            }
            i2++;
            childCount2 = childCount;
        }
        consumed[0] = consumed[0] + xConsumed;
        consumed[1] = consumed[1] + yConsumed2;
        if (accepted) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        e(target, dx, dy, consumed, 0);
    }

    @Override // f0.x
    public void e(View target, int dx, int dy, int[] consumed, int type) {
        b viewBehavior;
        int yConsumed;
        int childCount = getChildCount();
        int xConsumed = 0;
        int yConsumed2 = 0;
        boolean accepted = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                s.e lp = (s.e) view.getLayoutParams();
                if (lp.j(type) && (viewBehavior = lp.f()) != null) {
                    int[] iArr = this.f638g;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    viewBehavior.q(this, view, target, dx, dy, iArr, type);
                    int[] iArr2 = this.f638g;
                    int xConsumed2 = dx > 0 ? Math.max(xConsumed, iArr2[0]) : Math.min(xConsumed, iArr2[0]);
                    int[] iArr3 = this.f638g;
                    if (dy > 0) {
                        yConsumed = Math.max(yConsumed2, iArr3[1]);
                    } else {
                        yConsumed = Math.min(yConsumed2, iArr3[1]);
                    }
                    xConsumed = xConsumed2;
                    yConsumed2 = yConsumed;
                    accepted = true;
                }
            }
        }
        consumed[0] = xConsumed;
        consumed[1] = yConsumed2;
        if (accepted) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        b viewBehavior;
        boolean handled = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                s.e lp = (s.e) view.getLayoutParams();
                if (lp.j(0) && (viewBehavior = lp.f()) != null) {
                    viewBehavior.n();
                    handled |= false;
                }
            }
        }
        if (handled) {
            H(1);
        }
        return handled;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        b viewBehavior;
        boolean handled = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                s.e lp = (s.e) view.getLayoutParams();
                if (lp.j(0) && (viewBehavior = lp.f()) != null) {
                    handled |= viewBehavior.o(this, view, target, velocityX, velocityY);
                }
            }
        }
        return handled;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f652u.a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable savedState;
        if (!(state instanceof h)) {
            super.onRestoreInstanceState(state);
            return;
        }
        h ss = (h) state;
        super.onRestoreInstanceState(ss.i());
        SparseArray<Parcelable> behaviorStates = ss.f3445d;
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            int childId = child.getId();
            s.e lp = y(child);
            b b2 = lp.f();
            if (!(childId == -1 || b2 == null || (savedState = behaviorStates.get(childId)) == null)) {
                b2.x(this, child, savedState);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable state;
        h ss = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> behaviorStates = new SparseArray<>();
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            int childId = child.getId();
            s.e lp = (s.e) child.getLayoutParams();
            b b2 = lp.f();
            if (!(childId == -1 || b2 == null || (state = b2.y(this, child)) == null)) {
                behaviorStates.append(childId, state);
            }
        }
        ss.f3445d = behaviorStates;
        return ss;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        s.e lp = (s.e) child.getLayoutParams();
        b behavior = lp.f();
        if (behavior == null || !behavior.w(this, child, rectangle, immediate)) {
            return super.requestChildRectangleOnScreen(child, rectangle, immediate);
        }
        return true;
    }

    public final void X() {
        if (c1.x(this)) {
            if (this.f651t == null) {
                this.f651t = new s.a(this);
            }
            c1.u0(this, this.f651t);
            setSystemUiVisibility(1280);
            return;
        }
        c1.u0(this, null);
    }
}
