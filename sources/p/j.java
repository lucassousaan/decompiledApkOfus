package p;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: m  reason: collision with root package name */
    public int f2744m;

    public j(u run) {
        super(run);
        if (run instanceof o) {
            this.f2736e = h.HORIZONTAL_DIMENSION;
        } else {
            this.f2736e = h.VERTICAL_DIMENSION;
        }
    }

    @Override // p.i
    public void d(int value) {
        if (!this.f2741j) {
            this.f2741j = true;
            this.f2738g = value;
            for (f node : this.f2742k) {
                node.a(node);
            }
        }
    }
}
