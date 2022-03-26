package o;

import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public g f2585a;

    /* renamed from: b  reason: collision with root package name */
    public g f2586b;

    /* renamed from: c  reason: collision with root package name */
    public g f2587c;

    /* renamed from: d  reason: collision with root package name */
    public g f2588d;

    /* renamed from: e  reason: collision with root package name */
    public g f2589e;

    /* renamed from: f  reason: collision with root package name */
    public g f2590f;

    /* renamed from: g  reason: collision with root package name */
    public g f2591g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f2592h;

    /* renamed from: i  reason: collision with root package name */
    public int f2593i;

    /* renamed from: j  reason: collision with root package name */
    public int f2594j;

    /* renamed from: k  reason: collision with root package name */
    public float f2595k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f2596l;

    /* renamed from: m  reason: collision with root package name */
    public int f2597m;

    /* renamed from: n  reason: collision with root package name */
    public int f2598n;

    /* renamed from: o  reason: collision with root package name */
    public int f2599o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2600p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2601q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2602r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2603s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2604t;

    public c(g first, int orientation, boolean isRtl) {
        this.f2600p = false;
        this.f2585a = first;
        this.f2599o = orientation;
        this.f2600p = isRtl;
    }

    public static boolean c(g widget, int orientation) {
        if (widget.N() != 8 && widget.Q[orientation] == f.MATCH_CONSTRAINT) {
            int[] iArr = widget.f2659p;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        boolean z2;
        g next;
        int offset = this.f2599o * 2;
        g lastVisited = this.f2585a;
        g widget = this.f2585a;
        g gVar = this.f2585a;
        boolean done = false;
        while (true) {
            z2 = true;
            if (done) {
                break;
            }
            this.f2593i++;
            g[] gVarArr = widget.f2653l0;
            int i2 = this.f2599o;
            gVarArr[i2] = null;
            widget.f2651k0[i2] = null;
            if (widget.N() != 8) {
                this.f2596l++;
                f p2 = widget.p(this.f2599o);
                f fVar = f.MATCH_CONSTRAINT;
                if (p2 != fVar) {
                    this.f2597m += widget.z(this.f2599o);
                }
                int e2 = this.f2597m + widget.N[offset].e();
                this.f2597m = e2;
                this.f2597m = e2 + widget.N[offset + 1].e();
                int e3 = this.f2598n + widget.N[offset].e();
                this.f2598n = e3;
                this.f2598n = e3 + widget.N[offset + 1].e();
                if (this.f2586b == null) {
                    this.f2586b = widget;
                }
                this.f2588d = widget;
                f[] fVarArr = widget.Q;
                int i3 = this.f2599o;
                if (fVarArr[i3] == fVar) {
                    int[] iArr = widget.f2659p;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f2594j++;
                        float[] fArr = widget.f2649j0;
                        float weight = fArr[i3];
                        if (weight > 0.0f) {
                            this.f2595k += fArr[i3];
                        }
                        if (c(widget, i3)) {
                            if (weight < 0.0f) {
                                this.f2601q = true;
                            } else {
                                this.f2602r = true;
                            }
                            if (this.f2592h == null) {
                                this.f2592h = new ArrayList();
                            }
                            this.f2592h.add(widget);
                        }
                        if (this.f2590f == null) {
                            this.f2590f = widget;
                        }
                        g gVar2 = this.f2591g;
                        if (gVar2 != null) {
                            gVar2.f2651k0[this.f2599o] = widget;
                        }
                        this.f2591g = widget;
                    }
                    if (this.f2599o != 0 ? widget.f2658o == 0 && widget.f2663t == 0 && widget.f2664u != 0 : widget.f2656n == 0 && widget.f2660q == 0 && widget.f2661r != 0) {
                    }
                }
            }
            if (lastVisited != widget) {
                lastVisited.f2653l0[this.f2599o] = widget;
            }
            lastVisited = widget;
            e nextAnchor = widget.N[offset + 1].f2620f;
            if (nextAnchor != null) {
                next = nextAnchor.f2618d;
                e[] eVarArr = next.N;
                if (eVarArr[offset].f2620f == null || eVarArr[offset].f2620f.f2618d != widget) {
                    next = null;
                }
            } else {
                next = null;
            }
            if (next != null) {
                widget = next;
            } else {
                done = true;
            }
        }
        g gVar3 = this.f2586b;
        if (gVar3 != null) {
            this.f2597m -= gVar3.N[offset].e();
        }
        g gVar4 = this.f2588d;
        if (gVar4 != null) {
            this.f2597m -= gVar4.N[offset + 1].e();
        }
        this.f2587c = widget;
        if (this.f2599o != 0 || !this.f2600p) {
            this.f2589e = this.f2585a;
        } else {
            this.f2589e = widget;
        }
        if (!this.f2602r || !this.f2601q) {
            z2 = false;
        }
        this.f2603s = z2;
    }

    public void a() {
        if (!this.f2604t) {
            b();
        }
        this.f2604t = true;
    }
}
