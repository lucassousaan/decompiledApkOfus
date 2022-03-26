package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import b0.c;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h2 extends j2 {
    @Override // androidx.fragment.app.j2
    public boolean e(Object transition) {
        return transition instanceof Transition;
    }

    @Override // androidx.fragment.app.j2
    public Object f(Object transition) {
        if (transition == null) {
            return null;
        }
        Transition copy = ((Transition) transition).clone();
        return copy;
    }

    @Override // androidx.fragment.app.j2
    public Object u(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // androidx.fragment.app.j2
    public void s(Object transitionObj, View nonExistentView, ArrayList arrayList) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
        views.clear();
        int count = arrayList.size();
        for (int i2 = 0; i2 < count; i2++) {
            View view = (View) arrayList.get(i2);
            j2.d(views, view);
        }
        views.add(nonExistentView);
        arrayList.add(nonExistentView);
        b(transition, arrayList);
    }

    @Override // androidx.fragment.app.j2
    public void p(Object transitionObj, View view) {
        if (view != null) {
            Transition transition = (Transition) transitionObj;
            Rect epicenter = new Rect();
            h(view, epicenter);
            transition.setEpicenterCallback(new c2(this, epicenter));
        }
    }

    @Override // androidx.fragment.app.j2
    public void b(Object transitionObj, ArrayList arrayList) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i2 = 0; i2 < numTransitions; i2++) {
                    Transition child = set.getTransitionAt(i2);
                    b(child, arrayList);
                }
            } else if (!v(transition)) {
                List<View> targets = transition.getTargets();
                if (j2.i(targets)) {
                    int numViews = arrayList.size();
                    for (int i3 = 0; i3 < numViews; i3++) {
                        transition.addTarget((View) arrayList.get(i3));
                    }
                }
            }
        }
    }

    public static boolean v(Transition transition) {
        return !j2.i(transition.getTargetIds()) || !j2.i(transition.getTargetNames()) || !j2.i(transition.getTargetTypes());
    }

    @Override // androidx.fragment.app.j2
    public Object k(Object transition1, Object transition2, Object transition3) {
        TransitionSet transitionSet = new TransitionSet();
        if (transition1 != null) {
            transitionSet.addTransition((Transition) transition1);
        }
        if (transition2 != null) {
            transitionSet.addTransition((Transition) transition2);
        }
        if (transition3 != null) {
            transitionSet.addTransition((Transition) transition3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.j2
    public void m(Object exitTransitionObj, View fragmentView, ArrayList arrayList) {
        Transition exitTransition = (Transition) exitTransitionObj;
        exitTransition.addListener(new d2(this, fragmentView, arrayList));
    }

    @Override // androidx.fragment.app.j2
    public Object j(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        Transition staggered = null;
        Transition exitTransition = (Transition) exitTransitionObj;
        Transition enterTransition = (Transition) enterTransitionObj;
        Transition sharedElementTransition = (Transition) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            staggered = new TransitionSet().addTransition(exitTransition).addTransition(enterTransition).setOrdering(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        TransitionSet together = new TransitionSet();
        if (staggered != null) {
            together.addTransition(staggered);
        }
        together.addTransition(sharedElementTransition);
        return together;
    }

    @Override // androidx.fragment.app.j2
    public void c(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    @Override // androidx.fragment.app.j2
    public void n(Object overallTransitionObj, Object enterTransition, ArrayList arrayList, Object exitTransition, ArrayList arrayList2, Object sharedElementTransition, ArrayList arrayList3) {
        Transition overallTransition = (Transition) overallTransitionObj;
        overallTransition.addListener(new e2(this, enterTransition, arrayList, exitTransition, arrayList2, sharedElementTransition, arrayList3));
    }

    @Override // androidx.fragment.app.j2
    public void q(f0 outFragment, Object transition, c signal, Runnable transitionCompleteRunnable) {
        ((Transition) transition).addListener(new f2(this, transitionCompleteRunnable));
    }

    @Override // androidx.fragment.app.j2
    public void t(Object sharedElementTransitionObj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(arrayList2);
            w(sharedElementTransition, arrayList, arrayList2);
        }
    }

    public void w(Object transitionObj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i2 = 0; i2 < numTransitions; i2++) {
                Transition child = set.getTransitionAt(i2);
                w(child, arrayList, arrayList2);
            }
        } else if (!v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int targetCount = arrayList2 == null ? 0 : arrayList2.size();
            for (int i3 = 0; i3 < targetCount; i3++) {
                transition.addTarget((View) arrayList2.get(i3));
            }
            int i4 = arrayList.size();
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                transition.removeTarget((View) arrayList.get(i5));
            }
        }
    }

    @Override // androidx.fragment.app.j2
    public void a(Object transitionObj, View view) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.addTarget(view);
        }
    }

    @Override // androidx.fragment.app.j2
    public void o(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.setEpicenterCallback(new g2(this, epicenter));
        }
    }
}
