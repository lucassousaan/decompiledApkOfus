package p;

import o.a;
import o.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends u {
    public n(g widget) {
        super(widget);
    }

    @Override // p.u
    public void f() {
        this.f2765c = null;
        this.f2770h.c();
    }

    @Override // p.u
    public boolean m() {
        return false;
    }

    public final void q(i node) {
        this.f2770h.f2742k.add(node);
        node.f2743l.add(this.f2770h);
    }

    @Override // p.u
    public void d() {
        g gVar = this.f2764b;
        if (gVar instanceof a) {
            this.f2770h.f2733b = true;
            a barrier = (a) gVar;
            int type = barrier.c1();
            boolean allowsGoneWidget = barrier.b1();
            switch (type) {
                case 0:
                    this.f2770h.f2736e = h.LEFT;
                    for (int i2 = 0; i2 < barrier.f2687q0; i2++) {
                        g refwidget = barrier.f2686p0[i2];
                        if (allowsGoneWidget || refwidget.N() != 8) {
                            i target = refwidget.f2636d.f2770h;
                            target.f2742k.add(this.f2770h);
                            this.f2770h.f2743l.add(target);
                        }
                    }
                    q(this.f2764b.f2636d.f2770h);
                    q(this.f2764b.f2636d.f2771i);
                    return;
                case 1:
                    this.f2770h.f2736e = h.RIGHT;
                    for (int i3 = 0; i3 < barrier.f2687q0; i3++) {
                        g refwidget2 = barrier.f2686p0[i3];
                        if (allowsGoneWidget || refwidget2.N() != 8) {
                            i target2 = refwidget2.f2636d.f2771i;
                            target2.f2742k.add(this.f2770h);
                            this.f2770h.f2743l.add(target2);
                        }
                    }
                    q(this.f2764b.f2636d.f2770h);
                    q(this.f2764b.f2636d.f2771i);
                    return;
                case 2:
                    this.f2770h.f2736e = h.TOP;
                    for (int i4 = 0; i4 < barrier.f2687q0; i4++) {
                        g refwidget3 = barrier.f2686p0[i4];
                        if (allowsGoneWidget || refwidget3.N() != 8) {
                            i target3 = refwidget3.f2638e.f2770h;
                            target3.f2742k.add(this.f2770h);
                            this.f2770h.f2743l.add(target3);
                        }
                    }
                    q(this.f2764b.f2638e.f2770h);
                    q(this.f2764b.f2638e.f2771i);
                    return;
                case 3:
                    this.f2770h.f2736e = h.BOTTOM;
                    for (int i5 = 0; i5 < barrier.f2687q0; i5++) {
                        g refwidget4 = barrier.f2686p0[i5];
                        if (allowsGoneWidget || refwidget4.N() != 8) {
                            i target4 = refwidget4.f2638e.f2771i;
                            target4.f2742k.add(this.f2770h);
                            this.f2770h.f2743l.add(target4);
                        }
                    }
                    q(this.f2764b.f2638e.f2770h);
                    q(this.f2764b.f2638e.f2771i);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // p.u, p.f
    public void a(f dependency) {
        a barrier = (a) this.f2764b;
        int type = barrier.c1();
        int min = -1;
        int max = 0;
        for (i node : this.f2770h.f2743l) {
            int value = node.f2738g;
            if (min == -1 || value < min) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        if (type == 0 || type == 2) {
            this.f2770h.d(barrier.d1() + min);
        } else {
            this.f2770h.d(barrier.d1() + max);
        }
    }

    @Override // p.u
    public void e() {
        g gVar = this.f2764b;
        if (gVar instanceof a) {
            a barrier = (a) gVar;
            int type = barrier.c1();
            if (type == 0 || type == 1) {
                this.f2764b.Q0(this.f2770h.f2738g);
            } else {
                this.f2764b.R0(this.f2770h.f2738g);
            }
        }
    }
}
