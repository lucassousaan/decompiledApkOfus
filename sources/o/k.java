package o;

import java.util.ArrayList;
import java.util.Arrays;
import p.l;
import p.s;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k extends g implements j {

    /* renamed from: p0  reason: collision with root package name */
    public g[] f2686p0 = new g[4];

    /* renamed from: q0  reason: collision with root package name */
    public int f2687q0 = 0;

    public void Z0(h container) {
    }

    public void V0(g widget) {
        if (widget != this && widget != null) {
            int i2 = this.f2687q0 + 1;
            g[] gVarArr = this.f2686p0;
            if (i2 > gVarArr.length) {
                this.f2686p0 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            }
            g[] gVarArr2 = this.f2686p0;
            int i3 = this.f2687q0;
            gVarArr2[i3] = widget;
            this.f2687q0 = i3 + 1;
        }
    }

    public void Y0() {
        this.f2687q0 = 0;
        Arrays.fill(this.f2686p0, (Object) null);
    }

    public void W0(ArrayList arrayList, int orientation, s group) {
        for (int i2 = 0; i2 < this.f2687q0; i2++) {
            g widget = this.f2686p0[i2];
            group.a(widget);
        }
        for (int i3 = 0; i3 < this.f2687q0; i3++) {
            g widget2 = this.f2686p0[i3];
            l.a(widget2, orientation, arrayList, group);
        }
    }

    public int X0(int orientation) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f2687q0; i4++) {
            g widget = this.f2686p0[i4];
            if (orientation == 0 && (i3 = widget.f2655m0) != -1) {
                return i3;
            }
            if (orientation == 1 && (i2 = widget.f2657n0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
