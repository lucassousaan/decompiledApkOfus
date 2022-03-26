package o;

import java.util.ArrayList;
import n.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m extends g {

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList f2689p0 = new ArrayList();

    public abstract void X0();

    @Override // o.g
    public void e0() {
        this.f2689p0.clear();
        super.e0();
    }

    public void V0(g widget) {
        this.f2689p0.add(widget);
        if (widget.F() != null) {
            m container = (m) widget.F();
            container.Y0(widget);
        }
        widget.H0(this);
    }

    public void Y0(g widget) {
        this.f2689p0.remove(widget);
        widget.e0();
    }

    public ArrayList W0() {
        return this.f2689p0;
    }

    @Override // o.g
    public void g0(d cache) {
        super.g0(cache);
        int count = this.f2689p0.size();
        for (int i2 = 0; i2 < count; i2++) {
            g widget = (g) this.f2689p0.get(i2);
            widget.g0(cache);
        }
    }

    public void Z0() {
        this.f2689p0.clear();
    }
}
