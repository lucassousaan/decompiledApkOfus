package p;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: d  reason: collision with root package name */
    public u f2735d;

    /* renamed from: f  reason: collision with root package name */
    public int f2737f;

    /* renamed from: g  reason: collision with root package name */
    public int f2738g;

    /* renamed from: a  reason: collision with root package name */
    public f f2732a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2733b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2734c = false;

    /* renamed from: e  reason: collision with root package name */
    public h f2736e = h.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f2739h = 1;

    /* renamed from: i  reason: collision with root package name */
    public j f2740i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2741j = false;

    /* renamed from: k  reason: collision with root package name */
    public List f2742k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List f2743l = new ArrayList();

    public i(u run) {
        this.f2735d = run;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2735d.f2764b.o());
        sb.append(":");
        sb.append(this.f2736e);
        sb.append("(");
        sb.append(this.f2741j ? Integer.valueOf(this.f2738g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2743l.size());
        sb.append(":d=");
        sb.append(this.f2742k.size());
        sb.append(">");
        return sb.toString();
    }

    public void d(int value) {
        if (!this.f2741j) {
            this.f2741j = true;
            this.f2738g = value;
            for (f node : this.f2742k) {
                node.a(node);
            }
        }
    }

    @Override // p.f
    public void a(f node) {
        for (i target : this.f2743l) {
            if (!target.f2741j) {
                return;
            }
        }
        this.f2734c = true;
        f fVar = this.f2732a;
        if (fVar != null) {
            fVar.a(this);
        }
        if (this.f2733b) {
            this.f2735d.a(this);
            return;
        }
        i target2 = null;
        int numTargets = 0;
        for (i t2 : this.f2743l) {
            if (!(t2 instanceof j)) {
                target2 = t2;
                numTargets++;
            }
        }
        if (target2 != null && numTargets == 1 && target2.f2741j) {
            j jVar = this.f2740i;
            if (jVar != null) {
                if (jVar.f2741j) {
                    this.f2737f = this.f2739h * jVar.f2738g;
                } else {
                    return;
                }
            }
            d(target2.f2738g + this.f2737f);
        }
        f fVar2 = this.f2732a;
        if (fVar2 != null) {
            fVar2.a(this);
        }
    }

    public void b(f dependency) {
        this.f2742k.add(dependency);
        if (this.f2741j) {
            dependency.a(dependency);
        }
    }

    public void c() {
        this.f2743l.clear();
        this.f2742k.clear();
        this.f2741j = false;
        this.f2738g = 0;
        this.f2734c = false;
        this.f2733b = false;
    }
}
