package p;

import o.g;
import o.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m extends u {
    public m(g widget) {
        super(widget);
        widget.f2636d.f();
        widget.f2638e.f();
        this.f2768f = ((i) widget).W0();
    }

    @Override // p.u
    public void f() {
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

    @Override // p.u, p.f
    public void a(f dependency) {
        i iVar = this.f2770h;
        if (iVar.f2734c && !iVar.f2741j) {
            i startTarget = (i) iVar.f2743l.get(0);
            i guideline = (i) this.f2764b;
            int startPos = (int) ((startTarget.f2738g * guideline.Z0()) + 0.5f);
            this.f2770h.d(startPos);
        }
    }

    @Override // p.u
    public void d() {
        i guideline = (i) this.f2764b;
        int relativeBegin = guideline.X0();
        int relativeEnd = guideline.Y0();
        guideline.Z0();
        if (guideline.W0() == 1) {
            if (relativeBegin != -1) {
                this.f2770h.f2743l.add(this.f2764b.R.f2636d.f2770h);
                this.f2764b.R.f2636d.f2770h.f2742k.add(this.f2770h);
                this.f2770h.f2737f = relativeBegin;
            } else if (relativeEnd != -1) {
                this.f2770h.f2743l.add(this.f2764b.R.f2636d.f2771i);
                this.f2764b.R.f2636d.f2771i.f2742k.add(this.f2770h);
                this.f2770h.f2737f = -relativeEnd;
            } else {
                i iVar = this.f2770h;
                iVar.f2733b = true;
                iVar.f2743l.add(this.f2764b.R.f2636d.f2771i);
                this.f2764b.R.f2636d.f2771i.f2742k.add(this.f2770h);
            }
            q(this.f2764b.f2636d.f2770h);
            q(this.f2764b.f2636d.f2771i);
            return;
        }
        if (relativeBegin != -1) {
            this.f2770h.f2743l.add(this.f2764b.R.f2638e.f2770h);
            this.f2764b.R.f2638e.f2770h.f2742k.add(this.f2770h);
            this.f2770h.f2737f = relativeBegin;
        } else if (relativeEnd != -1) {
            this.f2770h.f2743l.add(this.f2764b.R.f2638e.f2771i);
            this.f2764b.R.f2638e.f2771i.f2742k.add(this.f2770h);
            this.f2770h.f2737f = -relativeEnd;
        } else {
            i iVar2 = this.f2770h;
            iVar2.f2733b = true;
            iVar2.f2743l.add(this.f2764b.R.f2638e.f2771i);
            this.f2764b.R.f2638e.f2771i.f2742k.add(this.f2770h);
        }
        q(this.f2764b.f2638e.f2770h);
        q(this.f2764b.f2638e.f2771i);
    }

    @Override // p.u
    public void e() {
        i guideline = (i) this.f2764b;
        if (guideline.W0() == 1) {
            this.f2764b.Q0(this.f2770h.f2738g);
        } else {
            this.f2764b.R0(this.f2770h.f2738g);
        }
    }
}
