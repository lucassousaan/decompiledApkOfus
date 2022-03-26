package q0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f3036a;

    /* renamed from: b  reason: collision with root package name */
    public final d f3037b = new d();

    /* renamed from: c  reason: collision with root package name */
    public final List f3038c = new ArrayList();

    public f(e callback) {
        this.f3036a = callback;
    }

    public final void l(View child) {
        this.f3038c.add(child);
        ((v0) this.f3036a).h(child);
    }

    public final boolean t(View child) {
        if (!this.f3038c.remove(child)) {
            return false;
        }
        ((v0) this.f3036a).i(child);
        return true;
    }

    public void b(View child, boolean hidden) {
        a(child, -1, hidden);
    }

    public void a(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = ((v0) this.f3036a).e();
        } else {
            offset = h(index);
        }
        this.f3037b.e(offset, hidden);
        if (hidden) {
            l(child);
        }
        ((v0) this.f3036a).a(child, offset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r5.f3037b.d(r2) == false) goto L_0x0026;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(int r6) {
        /*
            r5 = this;
            r0 = -1
            if (r6 >= 0) goto L_0x0004
            return r0
        L_0x0004:
            q0.e r1 = r5.f3036a
            q0.v0 r1 = (q0.v0) r1
            int r1 = r1.e()
            r2 = r6
        L_0x000d:
            if (r2 >= r1) goto L_0x0029
            q0.d r3 = r5.f3037b
            int r3 = r3.b(r2)
            int r4 = r2 - r3
            int r4 = r6 - r4
            if (r4 != 0) goto L_0x0027
        L_0x001b:
            q0.d r0 = r5.f3037b
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L_0x0026
            int r2 = r2 + 1
            goto L_0x001b
        L_0x0026:
            return r2
        L_0x0027:
            int r2 = r2 + r4
            goto L_0x000d
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f.h(int):int");
    }

    public void p(View view) {
        int index = ((v0) this.f3036a).g(view);
        if (index >= 0) {
            if (this.f3037b.f(index)) {
                t(view);
            }
            ((v0) this.f3036a).k(index);
        }
    }

    public void q(int index) {
        int offset = h(index);
        View view = ((v0) this.f3036a).d(offset);
        if (view != null) {
            if (this.f3037b.f(offset)) {
                t(view);
            }
            ((v0) this.f3036a).k(offset);
        }
    }

    public View f(int index) {
        int offset = h(index);
        return ((v0) this.f3036a).d(offset);
    }

    public void o() {
        this.f3037b.g();
        for (int i2 = this.f3038c.size() - 1; i2 >= 0; i2--) {
            ((v0) this.f3036a).i((View) this.f3038c.get(i2));
            this.f3038c.remove(i2);
        }
        ((v0) this.f3036a).j();
    }

    public View e(int position) {
        int count = this.f3038c.size();
        for (int i2 = 0; i2 < count; i2++) {
            View view = (View) this.f3038c.get(i2);
            e2 holder = ((v0) this.f3036a).f(view);
            if (!(holder.m() != position || holder.t() || holder.v())) {
                return view;
            }
        }
        return null;
    }

    public void c(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = ((v0) this.f3036a).e();
        } else {
            offset = h(index);
        }
        this.f3037b.e(offset, hidden);
        if (hidden) {
            l(child);
        }
        ((v0) this.f3036a).b(child, offset, layoutParams);
    }

    public int g() {
        return ((v0) this.f3036a).e() - this.f3038c.size();
    }

    public int j() {
        return ((v0) this.f3036a).e();
    }

    public View i(int index) {
        return ((v0) this.f3036a).d(index);
    }

    public void d(int index) {
        int offset = h(index);
        this.f3037b.f(offset);
        ((v0) this.f3036a).c(offset);
    }

    public int m(View child) {
        int index = ((v0) this.f3036a).g(child);
        if (index != -1 && !this.f3037b.d(index)) {
            return index - this.f3037b.b(index);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.f3038c.contains(view);
    }

    public void k(View view) {
        int offset = ((v0) this.f3036a).g(view);
        if (offset >= 0) {
            this.f3037b.h(offset);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public void s(View view) {
        int offset = ((v0) this.f3036a).g(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3037b.d(offset)) {
            this.f3037b.a(offset);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3037b.toString() + ", hidden list:" + this.f3038c.size();
    }

    public boolean r(View view) {
        int index = ((v0) this.f3036a).g(view);
        if (index == -1) {
            t(view);
            return true;
        } else if (!this.f3037b.d(index)) {
            return false;
        } else {
            this.f3037b.f(index);
            t(view);
            ((v0) this.f3036a).k(index);
            return true;
        }
    }
}
