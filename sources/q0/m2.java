package q0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m2 {

    /* renamed from: a  reason: collision with root package name */
    public int f3131a;

    /* renamed from: b  reason: collision with root package name */
    public int f3132b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3133c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3134d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3135e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3136f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3137g;

    public m2(StaggeredGridLayoutManager this$0) {
        this.f3137g = this$0;
        c();
    }

    public void c() {
        this.f3131a = -1;
        this.f3132b = Integer.MIN_VALUE;
        this.f3133c = false;
        this.f3134d = false;
        this.f3135e = false;
        int[] iArr = this.f3136f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public void d(t2[] spans) {
        int spanCount = spans.length;
        int[] iArr = this.f3136f;
        if (iArr == null || iArr.length < spanCount) {
            this.f3136f = new int[this.f3137g.f1115s.length];
        }
        for (int i2 = 0; i2 < spanCount; i2++) {
            this.f3136f[i2] = spans[i2].p(Integer.MIN_VALUE);
        }
    }

    public void a() {
        this.f3132b = this.f3133c ? this.f3137g.f1116t.i() : this.f3137g.f1116t.m();
    }

    public void b(int addedDistance) {
        if (this.f3133c) {
            this.f3132b = this.f3137g.f1116t.i() - addedDistance;
        } else {
            this.f3132b = this.f3137g.f1116t.m() + addedDistance;
        }
    }
}
