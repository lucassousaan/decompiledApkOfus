package q0;

import android.view.View;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: b  reason: collision with root package name */
    public int f3054b;

    /* renamed from: c  reason: collision with root package name */
    public int f3055c;

    /* renamed from: d  reason: collision with root package name */
    public int f3056d;

    /* renamed from: e  reason: collision with root package name */
    public int f3057e;

    /* renamed from: f  reason: collision with root package name */
    public int f3058f;

    /* renamed from: g  reason: collision with root package name */
    public int f3059g;

    /* renamed from: j  reason: collision with root package name */
    public int f3062j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3064l;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3053a = true;

    /* renamed from: h  reason: collision with root package name */
    public int f3060h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f3061i = 0;

    /* renamed from: k  reason: collision with root package name */
    public List f3063k = null;

    public boolean c(b2 state) {
        int i2 = this.f3056d;
        return i2 >= 0 && i2 < state.b();
    }

    public View d(t1 recycler) {
        if (this.f3063k != null) {
            return e();
        }
        View view = recycler.o(this.f3056d);
        this.f3056d += this.f3057e;
        return view;
    }

    public final View e() {
        int size = this.f3063k.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = ((e2) this.f3063k.get(i2)).f3018a;
            n1 lp = (n1) view.getLayoutParams();
            if (!lp.c() && this.f3056d == lp.a()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public void a() {
        b(null);
    }

    public void b(View ignore) {
        View closest = f(ignore);
        if (closest == null) {
            this.f3056d = -1;
        } else {
            this.f3056d = ((n1) closest.getLayoutParams()).a();
        }
    }

    public View f(View ignore) {
        int distance;
        int size = this.f3063k.size();
        View closest = null;
        int closestDistance = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view = ((e2) this.f3063k.get(i2)).f3018a;
            n1 lp = (n1) view.getLayoutParams();
            if (view != ignore && !lp.c() && (distance = (lp.a() - this.f3056d) * this.f3057e) >= 0 && distance < closestDistance) {
                closest = view;
                closestDistance = distance;
                if (distance == 0) {
                    break;
                }
            }
        }
        return closest;
    }
}
