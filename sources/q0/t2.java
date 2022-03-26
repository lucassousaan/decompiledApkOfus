package q0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t2 {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f3212a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f3213b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f3214c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f3215d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f3216e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3217f;

    public t2(StaggeredGridLayoutManager this$0, int index) {
        this.f3217f = this$0;
        this.f3216e = index;
    }

    public int p(int def) {
        int i2 = this.f3213b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3212a.size() == 0) {
            return def;
        }
        d();
        return this.f3213b;
    }

    public void d() {
        View startView = (View) this.f3212a.get(0);
        n2 lp = n(startView);
        this.f3213b = this.f3217f.f1116t.g(startView);
        Objects.requireNonNull(lp);
    }

    public int o() {
        int i2 = this.f3213b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        d();
        return this.f3213b;
    }

    public int l(int def) {
        int i2 = this.f3214c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        int size = this.f3212a.size();
        if (size == 0) {
            return def;
        }
        c();
        return this.f3214c;
    }

    public void c() {
        ArrayList arrayList = this.f3212a;
        View endView = (View) arrayList.get(arrayList.size() - 1);
        n2 lp = n(endView);
        this.f3214c = this.f3217f.f1116t.d(endView);
        Objects.requireNonNull(lp);
    }

    public int k() {
        int i2 = this.f3214c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        c();
        return this.f3214c;
    }

    public void u(View view) {
        n2 lp = n(view);
        lp.f3146e = this;
        this.f3212a.add(0, view);
        this.f3213b = Integer.MIN_VALUE;
        if (this.f3212a.size() == 1) {
            this.f3214c = Integer.MIN_VALUE;
        }
        if (lp.c() || lp.b()) {
            this.f3215d += this.f3217f.f1116t.e(view);
        }
    }

    public void a(View view) {
        n2 lp = n(view);
        lp.f3146e = this;
        this.f3212a.add(view);
        this.f3214c = Integer.MIN_VALUE;
        if (this.f3212a.size() == 1) {
            this.f3213b = Integer.MIN_VALUE;
        }
        if (lp.c() || lp.b()) {
            this.f3215d += this.f3217f.f1116t.e(view);
        }
    }

    public void b(boolean reverseLayout, int offset) {
        int reference;
        if (reverseLayout) {
            reference = l(Integer.MIN_VALUE);
        } else {
            reference = p(Integer.MIN_VALUE);
        }
        e();
        if (reference != Integer.MIN_VALUE) {
            if (reverseLayout && reference < this.f3217f.f1116t.i()) {
                return;
            }
            if (reverseLayout || reference <= this.f3217f.f1116t.m()) {
                if (offset != Integer.MIN_VALUE) {
                    reference += offset;
                }
                this.f3214c = reference;
                this.f3213b = reference;
            }
        }
    }

    public void e() {
        this.f3212a.clear();
        q();
        this.f3215d = 0;
    }

    public void q() {
        this.f3213b = Integer.MIN_VALUE;
        this.f3214c = Integer.MIN_VALUE;
    }

    public void v(int line) {
        this.f3213b = line;
        this.f3214c = line;
    }

    public void s() {
        int size = this.f3212a.size();
        View end = (View) this.f3212a.remove(size - 1);
        n2 lp = n(end);
        lp.f3146e = null;
        if (lp.c() || lp.b()) {
            this.f3215d -= this.f3217f.f1116t.e(end);
        }
        if (size == 1) {
            this.f3213b = Integer.MIN_VALUE;
        }
        this.f3214c = Integer.MIN_VALUE;
    }

    public void t() {
        View start = (View) this.f3212a.remove(0);
        n2 lp = n(start);
        lp.f3146e = null;
        if (this.f3212a.size() == 0) {
            this.f3214c = Integer.MIN_VALUE;
        }
        if (lp.c() || lp.b()) {
            this.f3215d -= this.f3217f.f1116t.e(start);
        }
        this.f3213b = Integer.MIN_VALUE;
    }

    public int j() {
        return this.f3215d;
    }

    public n2 n(View view) {
        return (n2) view.getLayoutParams();
    }

    public void r(int dt) {
        int i2 = this.f3213b;
        if (i2 != Integer.MIN_VALUE) {
            this.f3213b = i2 + dt;
        }
        int i3 = this.f3214c;
        if (i3 != Integer.MIN_VALUE) {
            this.f3214c = i3 + dt;
        }
    }

    public int f() {
        if (this.f3217f.f1121y) {
            return i(this.f3212a.size() - 1, -1, true);
        }
        return i(0, this.f3212a.size(), true);
    }

    public int g() {
        if (this.f3217f.f1121y) {
            return i(0, this.f3212a.size(), true);
        }
        return i(this.f3212a.size() - 1, -1, true);
    }

    public int h(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptCompletelyVisible, boolean acceptEndPointInclusion) {
        int start = this.f3217f.f1116t.m();
        int end = this.f3217f.f1116t.i();
        int next = toIndex > fromIndex ? 1 : -1;
        for (int i2 = fromIndex; i2 != toIndex; i2 += next) {
            View child = (View) this.f3212a.get(i2);
            int childStart = this.f3217f.f1116t.g(child);
            int childEnd = this.f3217f.f1116t.d(child);
            boolean childEndInclusion = false;
            boolean childStartInclusion = !acceptEndPointInclusion ? childStart < end : childStart <= end;
            if (!acceptEndPointInclusion ? childEnd > start : childEnd >= start) {
                childEndInclusion = true;
            }
            if (childStartInclusion && childEndInclusion) {
                if (!completelyVisible || !acceptCompletelyVisible) {
                    if (acceptCompletelyVisible) {
                        return this.f3217f.h0(child);
                    }
                    if (childStart < start || childEnd > end) {
                        return this.f3217f.h0(child);
                    }
                } else if (childStart >= start && childEnd <= end) {
                    return this.f3217f.h0(child);
                }
            }
        }
        return -1;
    }

    public int i(int fromIndex, int toIndex, boolean acceptEndPointInclusion) {
        return h(fromIndex, toIndex, false, false, acceptEndPointInclusion);
    }

    public View m(int referenceChildPosition, int layoutDir) {
        View candidate = null;
        if (layoutDir != -1) {
            for (int i2 = this.f3212a.size() - 1; i2 >= 0; i2--) {
                View view = (View) this.f3212a.get(i2);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3217f;
                if (staggeredGridLayoutManager.f1121y && staggeredGridLayoutManager.h0(view) >= referenceChildPosition) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f3217f;
                if ((!staggeredGridLayoutManager2.f1121y && staggeredGridLayoutManager2.h0(view) <= referenceChildPosition) || !view.hasFocusable()) {
                    break;
                }
                candidate = view;
            }
        } else {
            int limit = this.f3212a.size();
            for (int i3 = 0; i3 < limit; i3++) {
                View view2 = (View) this.f3212a.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.f3217f;
                if (staggeredGridLayoutManager3.f1121y && staggeredGridLayoutManager3.h0(view2) <= referenceChildPosition) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.f3217f;
                if ((!staggeredGridLayoutManager4.f1121y && staggeredGridLayoutManager4.h0(view2) >= referenceChildPosition) || !view2.hasFocusable()) {
                    break;
                }
                candidate = view2;
            }
        }
        return candidate;
    }
}
