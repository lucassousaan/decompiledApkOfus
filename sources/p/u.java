package p;

import o.d;
import o.e;
import o.f;
import o.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class u implements f {

    /* renamed from: a  reason: collision with root package name */
    public int f2763a;

    /* renamed from: b  reason: collision with root package name */
    public g f2764b;

    /* renamed from: c  reason: collision with root package name */
    public p f2765c;

    /* renamed from: d  reason: collision with root package name */
    public f f2766d;

    /* renamed from: e  reason: collision with root package name */
    public j f2767e = new j(this);

    /* renamed from: f  reason: collision with root package name */
    public int f2768f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2769g = false;

    /* renamed from: h  reason: collision with root package name */
    public i f2770h = new i(this);

    /* renamed from: i  reason: collision with root package name */
    public i f2771i = new i(this);

    /* renamed from: j  reason: collision with root package name */
    public t f2772j = t.NONE;

    @Override // p.f
    public abstract void a(f fVar);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean m();

    public u(g widget) {
        this.f2764b = widget;
    }

    public final i h(e anchor) {
        e eVar = anchor.f2620f;
        if (eVar == null) {
            return null;
        }
        g targetWidget = eVar.f2618d;
        d targetType = eVar.f2619e;
        switch (targetType.ordinal()) {
            case 1:
                o run = targetWidget.f2636d;
                i target = run.f2770h;
                return target;
            case 2:
                q run2 = targetWidget.f2638e;
                i target2 = run2.f2770h;
                return target2;
            case 3:
                o run3 = targetWidget.f2636d;
                i target3 = run3.f2771i;
                return target3;
            case 4:
                q run4 = targetWidget.f2638e;
                i target4 = run4.f2771i;
                return target4;
            case 5:
                q run5 = targetWidget.f2638e;
                i target5 = run5.f2750k;
                return target5;
            default:
                return null;
        }
    }

    public void n(e startAnchor, e endAnchor, int orientation) {
        i startTarget = h(startAnchor);
        i endTarget = h(endAnchor);
        if (startTarget.f2741j && endTarget.f2741j) {
            int startPos = startTarget.f2738g + startAnchor.e();
            int endPos = endTarget.f2738g - endAnchor.e();
            int distance = endPos - startPos;
            if (!this.f2767e.f2741j && this.f2766d == f.MATCH_CONSTRAINT) {
                l(orientation, distance);
            }
            j jVar = this.f2767e;
            if (jVar.f2741j) {
                if (jVar.f2738g == distance) {
                    this.f2770h.d(startPos);
                    this.f2771i.d(endPos);
                    return;
                }
                g gVar = this.f2764b;
                float bias = orientation == 0 ? gVar.t() : gVar.J();
                if (startTarget == endTarget) {
                    startPos = startTarget.f2738g;
                    endPos = endTarget.f2738g;
                    bias = 0.5f;
                }
                int availableDistance = (endPos - startPos) - this.f2767e.f2738g;
                this.f2770h.d((int) (startPos + 0.5f + (availableDistance * bias)));
                this.f2771i.d(this.f2770h.f2738g + this.f2767e.f2738g);
            }
        }
    }

    public final void l(int orientation, int distance) {
        int value;
        switch (this.f2763a) {
            case 0:
                this.f2767e.d(g(distance, orientation));
                return;
            case 1:
                int wrapValue = g(this.f2767e.f2744m, orientation);
                this.f2767e.d(Math.min(wrapValue, distance));
                return;
            case 2:
                g parent = this.f2764b.F();
                if (parent != null) {
                    j jVar = (orientation == 0 ? parent.f2636d : parent.f2638e).f2767e;
                    if (jVar.f2741j) {
                        g gVar = this.f2764b;
                        float percent = orientation == 0 ? gVar.f2662s : gVar.f2665v;
                        int targetDimensionValue = jVar.f2738g;
                        int size = (int) ((targetDimensionValue * percent) + 0.5f);
                        this.f2767e.d(g(size, orientation));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                g gVar2 = this.f2764b;
                u run = gVar2.f2636d;
                f fVar = run.f2766d;
                f fVar2 = f.MATCH_CONSTRAINT;
                if (fVar == fVar2 && run.f2763a == 3) {
                    q qVar = gVar2.f2638e;
                    if (qVar.f2766d == fVar2 && qVar.f2763a == 3) {
                        return;
                    }
                }
                if (orientation == 0) {
                    run = gVar2.f2638e;
                }
                if (run.f2767e.f2741j) {
                    float ratio = gVar2.q();
                    if (orientation == 1) {
                        value = (int) ((run.f2767e.f2738g / ratio) + 0.5f);
                    } else {
                        value = (int) ((run.f2767e.f2738g * ratio) + 0.5f);
                    }
                    this.f2767e.d(value);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void p() {
    }

    public void o() {
    }

    public final int g(int dimension, int orientation) {
        if (orientation == 0) {
            g gVar = this.f2764b;
            int max = gVar.f2661r;
            int min = gVar.f2660q;
            int value = Math.max(min, dimension);
            if (max > 0) {
                value = Math.min(max, dimension);
            }
            if (value != dimension) {
                return value;
            }
            return dimension;
        }
        g gVar2 = this.f2764b;
        int max2 = gVar2.f2664u;
        int min2 = gVar2.f2663t;
        int value2 = Math.max(min2, dimension);
        if (max2 > 0) {
            value2 = Math.min(max2, dimension);
        }
        if (value2 != dimension) {
            return value2;
        }
        return dimension;
    }

    public final i i(e anchor, int orientation) {
        e eVar = anchor.f2620f;
        if (eVar == null) {
            return null;
        }
        g targetWidget = eVar.f2618d;
        u run = orientation == 0 ? targetWidget.f2636d : targetWidget.f2638e;
        d targetType = eVar.f2619e;
        switch (targetType.ordinal()) {
            case 1:
            case 2:
                i target = run.f2770h;
                return target;
            case 3:
            case 4:
                i target2 = run.f2771i;
                return target2;
            default:
                return null;
        }
    }

    public final void b(i node, i target, int margin) {
        node.f2743l.add(target);
        node.f2737f = margin;
        target.f2742k.add(node);
    }

    public final void c(i node, i target, int marginFactor, j dimensionDependency) {
        node.f2743l.add(target);
        node.f2743l.add(this.f2767e);
        node.f2739h = marginFactor;
        node.f2740i = dimensionDependency;
        target.f2742k.add(node);
        dimensionDependency.f2742k.add(node);
    }

    public long j() {
        j jVar = this.f2767e;
        if (jVar.f2741j) {
            return jVar.f2738g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f2769g;
    }
}
