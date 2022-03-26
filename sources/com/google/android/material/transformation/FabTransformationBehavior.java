package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.helloworld.R;
import com.google.android.material.animation.MotionTiming;
import f0.c1;
import java.util.ArrayList;
import java.util.List;
import s.e;
import u1.c;
import u1.d;
import w0.a;
import w0.b;
import w0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1570c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f1571d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f1572e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1573f;

    /* renamed from: g  reason: collision with root package name */
    public float f1574g;

    /* renamed from: h  reason: collision with root package name */
    public float f1575h;

    public abstract d Z(Context context, boolean z2);

    public FabTransformationBehavior() {
        this.f1570c = new Rect();
        this.f1571d = new RectF();
        this.f1572e = new RectF();
        this.f1573f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f1570c = new Rect();
        this.f1571d = new RectF();
        this.f1572e = new RectF();
        this.f1573f = new int[2];
    }

    @Override // s.b
    public boolean e(CoordinatorLayout parent, View child, View dependency) {
        if (child.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // s.b
    public void g(e lp) {
        if (lp.f3434h == 0) {
            lp.f3434h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet J(View dependency, View child, boolean expanded, boolean isAnimating) {
        d spec = Z(child.getContext(), expanded);
        if (expanded) {
            this.f1574g = dependency.getTranslationX();
            this.f1575h = dependency.getTranslationY();
        }
        List<Animator> animations = new ArrayList<>();
        List<Animator.AnimatorListener> listeners = new ArrayList<>();
        V(dependency, child, expanded, isAnimating, spec, animations);
        RectF childBounds = this.f1571d;
        Y(dependency, child, expanded, isAnimating, spec, animations, childBounds);
        float childWidth = childBounds.width();
        float childHeight = childBounds.height();
        U(dependency, child, expanded, spec, animations);
        X(dependency, child, expanded, isAnimating, spec, animations, listeners);
        W(dependency, child, expanded, isAnimating, spec, childWidth, childHeight, animations, listeners);
        T(dependency, child, expanded, isAnimating, spec, animations);
        S(child, expanded, isAnimating, spec, animations);
        AnimatorSet set = new AnimatorSet();
        b.a(set, animations);
        set.addListener(new c(this, expanded, child, dependency));
        int count = listeners.size();
        for (int i2 = 0; i2 < count; i2++) {
            set.addListener(listeners.get(i2));
        }
        return set;
    }

    public final void V(View dependency, View child, boolean expanded, boolean currentlyAnimating, d spec, List list) {
        ObjectAnimator objectAnimator;
        float translationZ = c1.v(child) - c1.v(dependency);
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationZ(-translationZ);
            }
            objectAnimator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, -translationZ);
        }
        w0.e timing = spec.f3599a.e("elevation");
        timing.a(objectAnimator);
        list.add(objectAnimator);
    }

    public final void U(View dependency, View child, boolean expanded, d spec, List list) {
        float translationX = O(dependency, child, spec.f3600b);
        float translationY = P(dependency, child, spec.f3600b);
        Pair<MotionTiming, MotionTiming> motionTiming = N(translationX, translationY, expanded, spec);
        w0.e translationXTiming = (w0.e) motionTiming.first;
        w0.e translationYTiming = (w0.e) motionTiming.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = expanded ? translationX : this.f1574g;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dependency, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = expanded ? translationY : this.f1575h;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dependency, property2, fArr2);
        translationXTiming.a(ofFloat);
        translationYTiming.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final void Y(View dependency, View child, boolean expanded, boolean currentlyAnimating, d spec, List list, RectF childBounds) {
        w0.e translationXTiming;
        w0.e translationYTiming;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float translationX = O(dependency, child, spec.f3600b);
        float translationY = P(dependency, child, spec.f3600b);
        Pair<MotionTiming, MotionTiming> motionTiming = N(translationX, translationY, expanded, spec);
        w0.e translationXTiming2 = (w0.e) motionTiming.first;
        w0.e translationYTiming2 = (w0.e) motionTiming.second;
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationX(-translationX);
                child.setTranslationY(-translationY);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(child, View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, 0.0f);
            translationYTiming = translationYTiming2;
            translationXTiming = translationXTiming2;
            L(child, spec, translationXTiming2, translationYTiming2, -translationX, -translationY, 0.0f, 0.0f, childBounds);
            objectAnimator2 = ofFloat;
            objectAnimator = ofFloat2;
        } else {
            translationYTiming = translationYTiming2;
            translationXTiming = translationXTiming2;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(child, View.TRANSLATION_X, -translationX);
            objectAnimator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, -translationY);
            objectAnimator2 = ofFloat3;
        }
        translationXTiming.a(objectAnimator2);
        translationYTiming.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    public final void X(View dependency, View child, boolean expanded, boolean currentlyAnimating, d spec, List list, List list2) {
    }

    public final void W(View dependency, View child, boolean expanded, boolean currentlyAnimating, d spec, float childWidth, float childHeight, List list, List list2) {
    }

    public final void T(View dependency, View child, boolean expanded, boolean currentlyAnimating, d spec, List list) {
    }

    public final void S(View child, boolean expanded, boolean currentlyAnimating, d spec, List list) {
        ViewGroup childContentContainer;
        ObjectAnimator objectAnimator;
        if ((child instanceof ViewGroup) && (childContentContainer = K(child)) != null) {
            if (expanded) {
                if (!currentlyAnimating) {
                    w0.c.f3656a.set(childContentContainer, Float.valueOf(0.0f));
                }
                objectAnimator = ObjectAnimator.ofFloat(childContentContainer, w0.c.f3656a, 1.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(childContentContainer, w0.c.f3656a, 0.0f);
            }
            w0.e timing = spec.f3599a.e("contentFade");
            timing.a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    public final Pair N(float translationX, float translationY, boolean expanded, d spec) {
        w0.e translationYTiming;
        w0.e translationXTiming;
        if (translationX == 0.0f || translationY == 0.0f) {
            translationXTiming = spec.f3599a.e("translationXLinear");
            translationYTiming = spec.f3599a.e("translationYLinear");
        } else if ((!expanded || translationY >= 0.0f) && (expanded || translationY <= 0.0f)) {
            translationXTiming = spec.f3599a.e("translationXCurveDownwards");
            translationYTiming = spec.f3599a.e("translationYCurveDownwards");
        } else {
            translationXTiming = spec.f3599a.e("translationXCurveUpwards");
            translationYTiming = spec.f3599a.e("translationYCurveUpwards");
        }
        return new Pair(translationXTiming, translationYTiming);
    }

    public final float O(View dependency, View child, f positioning) {
        RectF dependencyBounds = this.f1571d;
        RectF childBounds = this.f1572e;
        M(dependency, dependencyBounds);
        R(child, childBounds);
        float translationX = 0.0f;
        switch (positioning.f3664a & 7) {
            case 1:
                translationX = childBounds.centerX() - dependencyBounds.centerX();
                break;
            case 3:
                translationX = childBounds.left - dependencyBounds.left;
                break;
            case 5:
                translationX = childBounds.right - dependencyBounds.right;
                break;
        }
        return translationX + positioning.f3665b;
    }

    public final float P(View dependency, View child, f positioning) {
        RectF dependencyBounds = this.f1571d;
        RectF childBounds = this.f1572e;
        M(dependency, dependencyBounds);
        R(child, childBounds);
        float translationY = 0.0f;
        switch (positioning.f3664a & 112) {
            case 16:
                translationY = childBounds.centerY() - dependencyBounds.centerY();
                break;
            case 48:
                translationY = childBounds.top - dependencyBounds.top;
                break;
            case 80:
                translationY = childBounds.bottom - dependencyBounds.bottom;
                break;
        }
        return translationY + positioning.f3666c;
    }

    public final void R(View view, RectF rect) {
        rect.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] windowLocation = this.f1573f;
        view.getLocationInWindow(windowLocation);
        rect.offsetTo(windowLocation[0], windowLocation[1]);
        rect.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void M(View view, RectF rect) {
        R(view, rect);
        rect.offset(this.f1574g, this.f1575h);
    }

    public final void L(View child, d spec, w0.e translationXTiming, w0.e translationYTiming, float fromX, float fromY, float toX, float toY, RectF childBounds) {
        float translationX = Q(spec, translationXTiming, fromX, toX);
        float translationY = Q(spec, translationYTiming, fromY, toY);
        Rect window = this.f1570c;
        child.getWindowVisibleDisplayFrame(window);
        RectF windowF = this.f1571d;
        windowF.set(window);
        RectF childVisibleBounds = this.f1572e;
        R(child, childVisibleBounds);
        childVisibleBounds.offset(translationX, translationY);
        childVisibleBounds.intersect(windowF);
        childBounds.set(childVisibleBounds);
    }

    public final float Q(d spec, w0.e timing, float from, float to) {
        long delay = timing.c();
        long duration = timing.d();
        w0.e expansionTiming = spec.f3599a.e("expansion");
        long expansionEnd = expansionTiming.c() + expansionTiming.d();
        float fraction = ((float) ((expansionEnd + 17) - delay)) / ((float) duration);
        return a.a(from, to, timing.e().getInterpolation(fraction));
    }

    public final ViewGroup K(View view) {
        View childContentContainer = view.findViewById(R.id.mtrl_child_content_container);
        if (childContentContainer != null) {
            return a0(childContentContainer);
        }
        return a0(view);
    }

    public final ViewGroup a0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }
}
