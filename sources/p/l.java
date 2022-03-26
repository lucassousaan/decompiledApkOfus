package p;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o.a;
import o.d;
import o.e;
import o.f;
import o.g;
import o.h;
import o.i;
import o.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class l {
    public static boolean d(f layoutHorizontal, f layoutVertical, f widgetHorizontal, f widgetVertical) {
        f fVar;
        f fVar2;
        f fVar3 = f.FIXED;
        boolean fixedHorizontal = widgetHorizontal == fVar3 || widgetHorizontal == (fVar2 = f.WRAP_CONTENT) || (widgetHorizontal == f.MATCH_PARENT && layoutHorizontal != fVar2);
        boolean fixedVertical = widgetVertical == fVar3 || widgetVertical == (fVar = f.WRAP_CONTENT) || (widgetVertical == f.MATCH_PARENT && layoutVertical != fVar);
        return fixedHorizontal || fixedVertical;
    }

    public static boolean c(h layout, c measurer) {
        boolean z2;
        ArrayList<ConstraintWidget> children = layout.W0();
        int count = children.size();
        ArrayList<Guideline> verticalGuidelines = null;
        ArrayList<Guideline> horizontalGuidelines = null;
        ArrayList<HelperWidget> horizontalBarriers = null;
        ArrayList<HelperWidget> verticalBarriers = null;
        ArrayList<ConstraintWidget> isolatedHorizontalChildren = null;
        ArrayList<ConstraintWidget> isolatedVerticalChildren = null;
        for (int i2 = 0; i2 < count; i2++) {
            g child = (g) children.get(i2);
            if (!d(layout.v(), layout.L(), child.v(), child.L())) {
                return false;
            }
        }
        Objects.requireNonNull(layout);
        for (int i3 = 0; i3 < count; i3++) {
            g child2 = (g) children.get(i3);
            if (!d(layout.v(), layout.L(), child2.v(), child2.L())) {
                h.v1(child2, measurer, layout.I0, 0);
            }
            if (child2 instanceof i) {
                i guideline = (i) child2;
                if (guideline.W0() == 0) {
                    if (horizontalGuidelines == null) {
                        horizontalGuidelines = new ArrayList<>();
                    }
                    horizontalGuidelines.add(guideline);
                }
                if (guideline.W0() == 1) {
                    if (verticalGuidelines == null) {
                        verticalGuidelines = new ArrayList<>();
                    }
                    verticalGuidelines.add(guideline);
                }
            }
            if (child2 instanceof k) {
                if (child2 instanceof a) {
                    a barrier = (a) child2;
                    if (barrier.e1() == 0) {
                        if (horizontalBarriers == null) {
                            horizontalBarriers = new ArrayList<>();
                        }
                        horizontalBarriers.add(barrier);
                    }
                    if (barrier.e1() == 1) {
                        if (verticalBarriers == null) {
                            verticalBarriers = new ArrayList<>();
                        }
                        verticalBarriers.add(barrier);
                    }
                } else {
                    k helper = (k) child2;
                    if (horizontalBarriers == null) {
                        horizontalBarriers = new ArrayList<>();
                    }
                    horizontalBarriers.add(helper);
                    if (verticalBarriers == null) {
                        verticalBarriers = new ArrayList<>();
                    }
                    verticalBarriers.add(helper);
                }
            }
            if (child2.F.f2620f == null && child2.H.f2620f == null && !(child2 instanceof i) && !(child2 instanceof a)) {
                if (isolatedHorizontalChildren == null) {
                    isolatedHorizontalChildren = new ArrayList<>();
                }
                isolatedHorizontalChildren.add(child2);
            }
            if (child2.G.f2620f == null && child2.I.f2620f == null && child2.J.f2620f == null && !(child2 instanceof i) && !(child2 instanceof a)) {
                if (isolatedVerticalChildren == null) {
                    isolatedVerticalChildren = new ArrayList<>();
                }
                isolatedVerticalChildren.add(child2);
            }
        }
        ArrayList<WidgetGroup> allDependencyLists = new ArrayList<>();
        if (verticalGuidelines != null) {
            Iterator<Guideline> it = verticalGuidelines.iterator();
            while (it.hasNext()) {
                i guideline2 = (i) it.next();
                a(guideline2, 0, allDependencyLists, null);
            }
        }
        if (horizontalBarriers != null) {
            Iterator<HelperWidget> it2 = horizontalBarriers.iterator();
            while (it2.hasNext()) {
                k barrier2 = (k) it2.next();
                s group = a(barrier2, 0, allDependencyLists, null);
                barrier2.W0(allDependencyLists, 0, group);
                group.b(allDependencyLists);
                verticalGuidelines = verticalGuidelines;
            }
        }
        e left = layout.j(d.LEFT);
        if (left.c() != null) {
            Iterator it3 = left.c().iterator();
            while (it3.hasNext()) {
                e first = (e) it3.next();
                a(first.f2618d, 0, allDependencyLists, null);
                left = left;
            }
        }
        e right = layout.j(d.RIGHT);
        if (right.c() != null) {
            Iterator it4 = right.c().iterator();
            while (it4.hasNext()) {
                e first2 = (e) it4.next();
                a(first2.f2618d, 0, allDependencyLists, null);
                right = right;
            }
        }
        e center = layout.j(d.CENTER);
        if (center.c() != null) {
            Iterator it5 = center.c().iterator();
            while (it5.hasNext()) {
                e first3 = (e) it5.next();
                a(first3.f2618d, 0, allDependencyLists, null);
                center = center;
            }
        }
        if (isolatedHorizontalChildren != null) {
            Iterator<ConstraintWidget> it6 = isolatedHorizontalChildren.iterator();
            while (it6.hasNext()) {
                g widget = (g) it6.next();
                a(widget, 0, allDependencyLists, null);
            }
        }
        if (horizontalGuidelines != null) {
            Iterator<Guideline> it7 = horizontalGuidelines.iterator();
            while (it7.hasNext()) {
                i guideline3 = (i) it7.next();
                a(guideline3, 1, allDependencyLists, null);
            }
        }
        if (verticalBarriers != null) {
            Iterator<HelperWidget> it8 = verticalBarriers.iterator();
            while (it8.hasNext()) {
                k barrier3 = (k) it8.next();
                s group2 = a(barrier3, 1, allDependencyLists, null);
                barrier3.W0(allDependencyLists, 1, group2);
                group2.b(allDependencyLists);
            }
        }
        e top = layout.j(d.TOP);
        if (top.c() != null) {
            Iterator it9 = top.c().iterator();
            while (it9.hasNext()) {
                e first4 = (e) it9.next();
                a(first4.f2618d, 1, allDependencyLists, null);
                horizontalGuidelines = horizontalGuidelines;
            }
        }
        e baseline = layout.j(d.BASELINE);
        if (baseline.c() != null) {
            Iterator it10 = baseline.c().iterator();
            while (it10.hasNext()) {
                e first5 = (e) it10.next();
                a(first5.f2618d, 1, allDependencyLists, null);
                baseline = baseline;
            }
        }
        e bottom = layout.j(d.BOTTOM);
        if (bottom.c() != null) {
            Iterator it11 = bottom.c().iterator();
            while (it11.hasNext()) {
                e first6 = (e) it11.next();
                a(first6.f2618d, 1, allDependencyLists, null);
                bottom = bottom;
            }
        }
        e center2 = layout.j(d.CENTER);
        if (center2.c() != null) {
            Iterator it12 = center2.c().iterator();
            while (it12.hasNext()) {
                e first7 = (e) it12.next();
                a(first7.f2618d, 1, allDependencyLists, null);
                center2 = center2;
            }
        }
        if (isolatedVerticalChildren != null) {
            Iterator<ConstraintWidget> it13 = isolatedVerticalChildren.iterator();
            while (it13.hasNext()) {
                g widget2 = (g) it13.next();
                a(widget2, 1, allDependencyLists, null);
            }
        }
        for (int i4 = 0; i4 < count; i4++) {
            g child3 = (g) children.get(i4);
            if (child3.d0()) {
                s horizontalGroup = b(allDependencyLists, child3.f2655m0);
                s verticalGroup = b(allDependencyLists, child3.f2657n0);
                if (!(horizontalGroup == null || verticalGroup == null)) {
                    horizontalGroup.g(0, verticalGroup);
                    verticalGroup.i(2);
                    allDependencyLists.remove(horizontalGroup);
                }
            }
        }
        int i5 = allDependencyLists.size();
        if (i5 <= 1) {
            return false;
        }
        s horizontalPick = null;
        s verticalPick = null;
        if (layout.v() == f.WRAP_CONTENT) {
            int maxWrap = 0;
            s picked = null;
            Iterator<WidgetGroup> it14 = allDependencyLists.iterator();
            while (it14.hasNext()) {
                s list = (s) it14.next();
                if (list.d() == 1) {
                    children = children;
                } else {
                    list.h(false);
                    int wrap = list.f(layout.o1(), 0);
                    if (wrap > maxWrap) {
                        maxWrap = wrap;
                        picked = list;
                    }
                    children = children;
                }
            }
            if (picked != null) {
                layout.w0(f.FIXED);
                layout.P0(maxWrap);
                picked.h(true);
                horizontalPick = picked;
            }
        }
        if (layout.L() == f.WRAP_CONTENT) {
            int maxWrap2 = 0;
            s picked2 = null;
            Iterator<WidgetGroup> it15 = allDependencyLists.iterator();
            while (it15.hasNext()) {
                s list2 = (s) it15.next();
                if (list2.d() != 0) {
                    list2.h(false);
                    int wrap2 = list2.f(layout.o1(), 1);
                    if (wrap2 > maxWrap2) {
                        picked2 = list2;
                        maxWrap2 = wrap2;
                    }
                }
            }
            if (picked2 != null) {
                layout.L0(f.FIXED);
                layout.s0(maxWrap2);
                z2 = true;
                picked2.h(true);
                verticalPick = picked2;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (horizontalPick == null && verticalPick == null) {
            return false;
        }
        return z2;
    }

    public static s b(ArrayList arrayList, int groupId) {
        int count = arrayList.size();
        for (int i2 = 0; i2 < count; i2++) {
            s group = (s) arrayList.get(i2);
            if (groupId == group.f2754b) {
                return group;
            }
        }
        return null;
    }

    public static s a(g constraintWidget, int orientation, ArrayList arrayList, s group) {
        int groupId;
        if (orientation == 0) {
            groupId = constraintWidget.f2655m0;
        } else {
            groupId = constraintWidget.f2657n0;
        }
        if (groupId != -1 && (group == null || groupId != group.f2754b)) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                s widgetGroup = (s) arrayList.get(i2);
                if (widgetGroup.c() == groupId) {
                    if (group != null) {
                        group.g(orientation, widgetGroup);
                        arrayList.remove(group);
                    }
                    group = widgetGroup;
                } else {
                    i2++;
                }
            }
        } else if (groupId != -1) {
            return group;
        }
        if (group == null) {
            if (constraintWidget instanceof k) {
                k helper = (k) constraintWidget;
                int groupId2 = helper.X0(orientation);
                if (groupId2 != -1) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        s widgetGroup2 = (s) arrayList.get(i3);
                        if (widgetGroup2.c() == groupId2) {
                            group = widgetGroup2;
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (group == null) {
                group = new s(orientation);
            }
            arrayList.add(group);
        }
        if (group.a(constraintWidget)) {
            if (constraintWidget instanceof i) {
                i guideline = (i) constraintWidget;
                guideline.V0().b(guideline.W0() == 0 ? 1 : 0, arrayList, group);
            }
            if (orientation == 0) {
                constraintWidget.f2655m0 = group.c();
                constraintWidget.F.b(orientation, arrayList, group);
                constraintWidget.H.b(orientation, arrayList, group);
            } else {
                constraintWidget.f2657n0 = group.c();
                constraintWidget.G.b(orientation, arrayList, group);
                constraintWidget.J.b(orientation, arrayList, group);
                constraintWidget.I.b(orientation, arrayList, group);
            }
            constraintWidget.M.b(orientation, arrayList, group);
        }
        return group;
    }
}
