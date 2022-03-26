package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.c;
import f0.c1;
import f0.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class j2 {
    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public abstract void q(f0 f0Var, Object obj, c cVar, Runnable runnable);

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);

    public void h(View view, Rect epicenter) {
        if (c1.O(view)) {
            RectF rect = new RectF();
            rect.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rect);
            rect.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View parentView = (View) parent;
                rect.offset(-parentView.getScrollX(), -parentView.getScrollY());
                parentView.getMatrix().mapRect(rect);
                rect.offset(parentView.getLeft(), parentView.getTop());
                parent = parentView.getParent();
            }
            int[] loc = new int[2];
            view.getRootView().getLocationOnScreen(loc);
            rect.offset(loc[0], loc[1]);
            epicenter.set(Math.round(rect.left), Math.round(rect.top), Math.round(rect.right), Math.round(rect.bottom));
        }
    }

    public ArrayList l(ArrayList arrayList) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = arrayList.size();
        for (int i2 = 0; i2 < numSharedElements; i2++) {
            View view = (View) arrayList.get(i2);
            names.add(c1.I(view));
            c1.x0(view, null);
        }
        return names;
    }

    public void r(View sceneRoot, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int numSharedElements = arrayList2.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i2 = 0; i2 < numSharedElements; i2++) {
            View view = (View) arrayList.get(i2);
            String name = c1.I(view);
            outNames.add(name);
            if (name != null) {
                c1.x0(view, null);
                String inName = (String) map.get(name);
                int j2 = 0;
                while (true) {
                    if (j2 >= numSharedElements) {
                        break;
                    } else if (inName.equals(arrayList3.get(j2))) {
                        c1.x0((View) arrayList2.get(j2), name);
                        break;
                    } else {
                        j2++;
                    }
                }
            }
        }
        d0.a(sceneRoot, new i2(this, numSharedElements, arrayList2, arrayList3, arrayList, outNames));
    }

    public static void d(List list, View startView) {
        int startIndex = list.size();
        if (!g(list, startView, startIndex)) {
            if (c1.I(startView) != null) {
                list.add(startView);
            }
            for (int index = startIndex; index < list.size(); index++) {
                View view = (View) list.get(index);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int childIndex = 0; childIndex < childCount; childIndex++) {
                        View child = viewGroup.getChildAt(childIndex);
                        if (!g(list, child, startIndex) && c1.I(child) != null) {
                            list.add(child);
                        }
                    }
                }
            }
        }
    }

    public static boolean g(List list, View view, int maxIndex) {
        for (int i2 = 0; i2 < maxIndex; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(List list) {
        return list == null || list.isEmpty();
    }
}
