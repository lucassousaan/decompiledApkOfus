package p;

import java.util.ArrayList;
import java.util.Iterator;
import o.g;
import o.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends u {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f2713k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f2714l;

    public e(g widget, int orientation) {
        super(widget);
        this.f2768f = orientation;
        q();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f2768f == 0 ? "horizontal : " : "vertical : ");
        String log = sb.toString();
        Iterator it = this.f2713k.iterator();
        while (it.hasNext()) {
            u run = (u) it.next();
            log = ((log + "<") + run) + "> ";
        }
        return log;
    }

    @Override // p.u
    public boolean m() {
        int count = this.f2713k.size();
        for (int i2 = 0; i2 < count; i2++) {
            u run = (u) this.f2713k.get(i2);
            if (!run.m()) {
                return false;
            }
        }
        return true;
    }

    @Override // p.u
    public long j() {
        int count = this.f2713k.size();
        long wrapDimension = 0;
        for (int i2 = 0; i2 < count; i2++) {
            u run = (u) this.f2713k.get(i2);
            wrapDimension = wrapDimension + run.f2770h.f2737f + run.j() + run.f2771i.f2737f;
        }
        return wrapDimension;
    }

    public final void q() {
        g current = this.f2764b;
        g previous = current.G(this.f2768f);
        while (previous != null) {
            current = previous;
            previous = current.G(this.f2768f);
        }
        this.f2764b = current;
        this.f2713k.add(current.I(this.f2768f));
        g next = current.E(this.f2768f);
        while (next != null) {
            this.f2713k.add(next.I(this.f2768f));
            next = next.E(this.f2768f);
        }
        Iterator it = this.f2713k.iterator();
        while (it.hasNext()) {
            u run = (u) it.next();
            int i2 = this.f2768f;
            if (i2 == 0) {
                run.f2764b.f2632b = this;
            } else if (i2 == 1) {
                run.f2764b.f2634c = this;
            }
        }
        boolean isInRtl = this.f2768f == 0 && ((h) this.f2764b.F()).s1();
        if (isInRtl && this.f2713k.size() > 1) {
            ArrayList arrayList = this.f2713k;
            this.f2764b = ((u) arrayList.get(arrayList.size() - 1)).f2764b;
        }
        this.f2714l = this.f2768f == 0 ? this.f2764b.u() : this.f2764b.K();
    }

    @Override // p.u
    public void f() {
        this.f2765c = null;
        Iterator it = this.f2713k.iterator();
        while (it.hasNext()) {
            u run = (u) it.next();
            run.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x0488, code lost:
        r6 = r6 - r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    @Override // p.u, p.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(p.f r28) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.a(p.f):void");
    }

    @Override // p.u
    public void e() {
        for (int i2 = 0; i2 < this.f2713k.size(); i2++) {
            u run = (u) this.f2713k.get(i2);
            run.e();
        }
    }

    public final g r() {
        for (int i2 = 0; i2 < this.f2713k.size(); i2++) {
            u run = (u) this.f2713k.get(i2);
            if (run.f2764b.N() != 8) {
                return run.f2764b;
            }
        }
        return null;
    }

    public final g s() {
        for (int i2 = this.f2713k.size() - 1; i2 >= 0; i2--) {
            u run = (u) this.f2713k.get(i2);
            if (run.f2764b.N() != 8) {
                return run.f2764b;
            }
        }
        return null;
    }

    @Override // p.u
    public void d() {
        Iterator it = this.f2713k.iterator();
        while (it.hasNext()) {
            u run = (u) it.next();
            run.d();
        }
        int count = this.f2713k.size();
        if (count >= 1) {
            g firstWidget = ((u) this.f2713k.get(0)).f2764b;
            g lastWidget = ((u) this.f2713k.get(count - 1)).f2764b;
            if (this.f2768f == 0) {
                o.e startAnchor = firstWidget.F;
                o.e endAnchor = lastWidget.H;
                i startTarget = i(startAnchor, 0);
                int startMargin = startAnchor.e();
                g firstVisibleWidget = r();
                if (firstVisibleWidget != null) {
                    startMargin = firstVisibleWidget.F.e();
                }
                if (startTarget != null) {
                    b(this.f2770h, startTarget, startMargin);
                }
                i endTarget = i(endAnchor, 0);
                int endMargin = endAnchor.e();
                g lastVisibleWidget = s();
                if (lastVisibleWidget != null) {
                    endMargin = lastVisibleWidget.H.e();
                }
                if (endTarget != null) {
                    b(this.f2771i, endTarget, -endMargin);
                }
            } else {
                o.e startAnchor2 = firstWidget.G;
                o.e endAnchor2 = lastWidget.I;
                i startTarget2 = i(startAnchor2, 1);
                int startMargin2 = startAnchor2.e();
                g firstVisibleWidget2 = r();
                if (firstVisibleWidget2 != null) {
                    startMargin2 = firstVisibleWidget2.G.e();
                }
                if (startTarget2 != null) {
                    b(this.f2770h, startTarget2, startMargin2);
                }
                i endTarget2 = i(endAnchor2, 1);
                int endMargin2 = endAnchor2.e();
                g lastVisibleWidget2 = s();
                if (lastVisibleWidget2 != null) {
                    endMargin2 = lastVisibleWidget2.I.e();
                }
                if (endTarget2 != null) {
                    b(this.f2771i, endTarget2, -endMargin2);
                }
            }
            this.f2770h.f2732a = this;
            this.f2771i.f2732a = this;
        }
    }
}
