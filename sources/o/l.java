package o;

import n.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f2688a = new boolean[3];

    public static void a(h container, f system, g widget) {
        widget.f2652l = -1;
        widget.f2654m = -1;
        f fVar = container.Q[0];
        f fVar2 = f.WRAP_CONTENT;
        if (fVar != fVar2 && widget.Q[0] == f.MATCH_PARENT) {
            int left = widget.F.f2621g;
            int right = container.O() - widget.H.f2621g;
            e eVar = widget.F;
            eVar.f2623i = system.q(eVar);
            e eVar2 = widget.H;
            eVar2.f2623i = system.q(eVar2);
            system.f(widget.F.f2623i, left);
            system.f(widget.H.f2623i, right);
            widget.f2652l = 2;
            widget.v0(left, right);
        }
        if (container.Q[1] != fVar2 && widget.Q[1] == f.MATCH_PARENT) {
            int top = widget.G.f2621g;
            int bottom = container.s() - widget.I.f2621g;
            e eVar3 = widget.G;
            eVar3.f2623i = system.q(eVar3);
            e eVar4 = widget.I;
            eVar4.f2623i = system.q(eVar4);
            system.f(widget.G.f2623i, top);
            system.f(widget.I.f2623i, bottom);
            if (widget.Y > 0 || widget.N() == 8) {
                e eVar5 = widget.J;
                eVar5.f2623i = system.q(eVar5);
                system.f(widget.J.f2623i, widget.Y + top);
            }
            widget.f2654m = 2;
            widget.K0(top, bottom);
        }
    }

    public static final boolean b(int optimizationLevel, int optimization) {
        return (optimizationLevel & optimization) == optimization;
    }
}
