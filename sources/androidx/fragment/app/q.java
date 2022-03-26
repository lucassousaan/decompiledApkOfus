package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import b0.c;
import e0.h;
import f0.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.b;
import k.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q extends t2 {
    public q(ViewGroup container) {
        super(container);
    }

    @Override // androidx.fragment.app.t2
    public void f(List list, boolean isPop) {
        s2 firstOut = null;
        s2 lastIn = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s2 operation = (s2) it.next();
            r2 currentState = r2.c(operation.f().H);
            switch (operation.e().ordinal()) {
                case 0:
                case 2:
                case 3:
                    if (currentState == r2.VISIBLE && firstOut == null) {
                        firstOut = operation;
                        break;
                    }
                    break;
                case 1:
                    if (currentState == r2.VISIBLE) {
                        break;
                    } else {
                        lastIn = operation;
                        break;
                    }
            }
        }
        List<DefaultSpecialEffectsController.AnimationInfo> animations = new ArrayList<>();
        List<DefaultSpecialEffectsController.TransitionInfo> transitions = new ArrayList<>();
        List<SpecialEffectsController.Operation> awaitingContainerChanges = new ArrayList<>(list);
        Iterator it2 = list.iterator();
        while (true) {
            boolean z2 = true;
            if (it2.hasNext()) {
                s2 operation2 = (s2) it2.next();
                c animCancellationSignal = new c();
                operation2.j(animCancellationSignal);
                animations.add(new n(operation2, animCancellationSignal, isPop));
                c transitionCancellationSignal = new c();
                operation2.j(transitionCancellationSignal);
                if (isPop) {
                    if (operation2 == firstOut) {
                        transitions.add(new p(operation2, transitionCancellationSignal, isPop, z2));
                        operation2.a(new d(this, awaitingContainerChanges, operation2));
                    }
                    z2 = false;
                    transitions.add(new p(operation2, transitionCancellationSignal, isPop, z2));
                    operation2.a(new d(this, awaitingContainerChanges, operation2));
                } else {
                    if (operation2 == lastIn) {
                        transitions.add(new p(operation2, transitionCancellationSignal, isPop, z2));
                        operation2.a(new d(this, awaitingContainerChanges, operation2));
                    }
                    z2 = false;
                    transitions.add(new p(operation2, transitionCancellationSignal, isPop, z2));
                    operation2.a(new d(this, awaitingContainerChanges, operation2));
                }
            } else {
                Map<SpecialEffectsController.Operation, Boolean> startedTransitions = x(transitions, awaitingContainerChanges, isPop, firstOut, lastIn);
                boolean startedAnyTransition = startedTransitions.containsValue(true);
                w(animations, awaitingContainerChanges, startedAnyTransition, startedTransitions);
                Iterator<SpecialEffectsController.Operation> it3 = awaitingContainerChanges.iterator();
                while (it3.hasNext()) {
                    s((s2) it3.next());
                }
                awaitingContainerChanges.clear();
                return;
            }
        }
    }

    public final void w(List list, List list2, boolean startedAnyTransition, Map map) {
        ViewGroup container = m();
        Context context = container.getContext();
        ArrayList<DefaultSpecialEffectsController.AnimationInfo> animationsToRun = new ArrayList<>();
        View viewToAnimate = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n animationInfo = (n) it.next();
            if (animationInfo.d()) {
                animationInfo.a();
            } else {
                k0 anim = animationInfo.e(context);
                if (anim == null) {
                    animationInfo.a();
                } else {
                    Animator animator = anim.f816b;
                    if (animator == null) {
                        animationsToRun.add(animationInfo);
                    } else {
                        s2 operation = animationInfo.b();
                        f0 fragment = operation.f();
                        boolean startedTransition = Boolean.TRUE.equals(map.get(operation));
                        if (startedTransition) {
                            if (m1.v0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.a();
                        } else {
                            boolean isHideOperation = operation.e() == r2.GONE;
                            if (isHideOperation) {
                                list2.remove(operation);
                            }
                            View viewToAnimate2 = fragment.H;
                            container.startViewTransition(viewToAnimate2);
                            animator.addListener(new e(this, container, viewToAnimate2, isHideOperation, operation, animationInfo));
                            animator.setTarget(viewToAnimate2);
                            animator.start();
                            c signal = animationInfo.c();
                            signal.b(new f(this, animator));
                            viewToAnimate = 1;
                            it = it;
                        }
                    }
                }
            }
        }
        Iterator<DefaultSpecialEffectsController.AnimationInfo> it2 = animationsToRun.iterator();
        while (it2.hasNext()) {
            n animationInfo2 = (n) it2.next();
            s2 operation2 = animationInfo2.b();
            f0 fragment2 = operation2.f();
            if (startedAnyTransition) {
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.a();
            } else if (viewToAnimate != null) {
                if (m1.v0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.a();
            } else {
                View viewToAnimate3 = fragment2.H;
                k0 e2 = animationInfo2.e(context);
                h.e(e2);
                Animation animation = e2.f815a;
                h.e(animation);
                Animation anim2 = animation;
                r2 finalState = operation2.e();
                if (finalState != r2.REMOVED) {
                    viewToAnimate3.startAnimation(anim2);
                    animationInfo2.a();
                } else {
                    container.startViewTransition(viewToAnimate3);
                    Animation animation2 = new l0(anim2, container, viewToAnimate3);
                    animation2.setAnimationListener(new h(this, container, viewToAnimate3, animationInfo2));
                    viewToAnimate3.startAnimation(animation2);
                }
                c signal2 = animationInfo2.c();
                signal2.b(new i(this, viewToAnimate3, container, animationInfo2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0524, code lost:
        if (r11 == r43) goto L_0x052b;
     */
    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0579  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map x(java.util.List r39, java.util.List r40, boolean r41, androidx.fragment.app.s2 r42, androidx.fragment.app.s2 r43) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.x(java.util.List, java.util.List, boolean, androidx.fragment.app.s2, androidx.fragment.app.s2):java.util.Map");
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, android.view.View> */
    public void v(b bVar, Collection collection) {
        Iterator<Map.Entry<String, View>> iterator = ((i) bVar.entrySet()).iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, View> entry = iterator.next();
            if (!collection.contains(c1.I(entry.getValue()))) {
                iterator.remove();
            }
        }
    }

    public void t(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view) && c1.I(view) != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int count = viewGroup.getChildCount();
            for (int i2 = 0; i2 < count; i2++) {
                View child = viewGroup.getChildAt(i2);
                if (child.getVisibility() == 0) {
                    t(arrayList, child);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void u(Map map, View view) {
        String transitionName = c1.I(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int count = viewGroup.getChildCount();
            for (int i2 = 0; i2 < count; i2++) {
                View child = viewGroup.getChildAt(i2);
                if (child.getVisibility() == 0) {
                    u(map, child);
                }
            }
        }
    }

    public void s(s2 operation) {
        View view = operation.f().H;
        operation.e().a(view);
    }
}
