package q0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f0.b;
import f0.c1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3204a;

    /* renamed from: d  reason: collision with root package name */
    public final List f3207d;

    /* renamed from: g  reason: collision with root package name */
    public s1 f3210g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3211h;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f3205b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3206c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f3208e = 2;

    /* renamed from: f  reason: collision with root package name */
    public int f3209f = 2;

    public t1(RecyclerView this$0) {
        this.f3211h = this$0;
        ArrayList arrayList = new ArrayList();
        this.f3204a = arrayList;
        this.f3207d = Collections.unmodifiableList(arrayList);
    }

    public void c() {
        this.f3204a.clear();
        x();
    }

    public void E(int viewCount) {
        this.f3208e = viewCount;
        I();
    }

    public void I() {
        m1 m1Var = this.f3211h.f1089m;
        int extraCache = m1Var != null ? m1Var.f3125l : 0;
        this.f3209f = this.f3208e + extraCache;
        for (int i2 = this.f3206c.size() - 1; i2 >= 0 && this.f3206c.size() > this.f3209f; i2--) {
            y(i2);
        }
    }

    public List k() {
        return this.f3207d;
    }

    public boolean J(e2 holder) {
        if (holder.v()) {
            return this.f3211h.f1078g0.e();
        }
        int i2 = holder.f3020c;
        if (i2 < 0 || i2 >= this.f3211h.f1087l.c()) {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + holder + this.f3211h.P());
        }
        if (!this.f3211h.f1078g0.e()) {
            this.f3211h.f1087l.e();
            if (0 != holder.l()) {
                return false;
            }
        }
        return !this.f3211h.f1087l.g() || holder.k() == this.f3211h.f1087l.d(holder.f3020c);
    }

    public final boolean F(e2 holder, int offsetPosition, int position, long deadlineNs) {
        holder.f3035r = this.f3211h;
        int viewType = holder.l();
        long startBindNs = this.f3211h.getNanoTime();
        if (deadlineNs != Long.MAX_VALUE && !this.f3210g.k(viewType, startBindNs, deadlineNs)) {
            return false;
        }
        this.f3211h.f1087l.a(holder, offsetPosition);
        long endBindNs = this.f3211h.getNanoTime();
        this.f3210g.d(holder.l(), endBindNs - startBindNs);
        b(holder);
        if (!this.f3211h.f1078g0.e()) {
            return true;
        }
        holder.f3024g = position;
        return true;
    }

    public int f(int position) {
        if (position < 0 || position >= this.f3211h.f1078g0.b()) {
            throw new IndexOutOfBoundsException("invalid position " + position + ". State item count is " + this.f3211h.f1078g0.b() + this.f3211h.P());
        } else if (!this.f3211h.f1078g0.e()) {
            return position;
        } else {
            return this.f3211h.f1073e.k(position);
        }
    }

    public View o(int position) {
        return p(position, false);
    }

    public View p(int position, boolean dryRun) {
        return G(position, dryRun, Long.MAX_VALUE).f3018a;
    }

    public e2 G(int position, boolean dryRun, long deadlineNs) {
        e2 holder;
        boolean fromScrapOrHiddenOrCache;
        n1 rvLayoutParams;
        if (position < 0 || position >= this.f3211h.f1078g0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + position + "(" + position + "). Item count:" + this.f3211h.f1078g0.b() + this.f3211h.P());
        }
        boolean fromScrapOrHiddenOrCache2 = false;
        e2 holder2 = null;
        boolean z2 = true;
        if (this.f3211h.f1078g0.e()) {
            holder2 = h(position);
            fromScrapOrHiddenOrCache2 = holder2 != null;
        }
        if (holder2 == null && (holder2 = m(position, dryRun)) != null) {
            if (!J(holder2)) {
                if (!dryRun) {
                    holder2.b(4);
                    if (holder2.w()) {
                        this.f3211h.removeDetachedView(holder2.f3018a, false);
                        holder2.K();
                    } else if (holder2.L()) {
                        holder2.e();
                    }
                    A(holder2);
                }
                holder2 = null;
            } else {
                fromScrapOrHiddenOrCache2 = true;
            }
        }
        if (holder2 == null) {
            int offsetPosition = this.f3211h.f1073e.k(position);
            if (offsetPosition < 0 || offsetPosition >= this.f3211h.f1087l.c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + position + "(offset:" + offsetPosition + ").state:" + this.f3211h.f1078g0.b() + this.f3211h.P());
            }
            this.f3211h.f1087l.e();
            if (this.f3211h.f1087l.g() && (holder2 = l(this.f3211h.f1087l.d(offsetPosition), 0, dryRun)) != null) {
                holder2.f3020c = offsetPosition;
                fromScrapOrHiddenOrCache2 = true;
            }
            if (holder2 == null) {
            }
            if (holder2 == null && (holder2 = i().f(0)) != null) {
                holder2.D();
                int[] iArr = RecyclerView.f1063x0;
            }
            if (holder2 == null) {
                long start = this.f3211h.getNanoTime();
                if (deadlineNs != Long.MAX_VALUE && !this.f3210g.l(0, start, deadlineNs)) {
                    return null;
                }
                RecyclerView recyclerView = this.f3211h;
                e2 holder3 = recyclerView.f1087l.b(recyclerView, 0);
                int[] iArr2 = RecyclerView.f1063x0;
                RecyclerView innerView = RecyclerView.V(holder3.f3018a);
                if (innerView != null) {
                    holder3.f3019b = new WeakReference(innerView);
                }
                long end = this.f3211h.getNanoTime();
                this.f3210g.e(0, end - start);
                fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                holder = holder3;
            } else {
                fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                holder = holder2;
            }
        } else {
            fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
            holder = holder2;
        }
        if (fromScrapOrHiddenOrCache && !this.f3211h.f1078g0.e() && holder.p(8192)) {
            holder.F(0, 8192);
            if (this.f3211h.f1078g0.f2976j) {
                int changeFlags = f1.e(holder);
                int i2 = changeFlags | 4096;
                RecyclerView recyclerView2 = this.f3211h;
                f1 f1Var = recyclerView2.L;
                b2 b2Var = recyclerView2.f1078g0;
                holder.o();
                e1 info = f1Var.t(holder);
                this.f3211h.Q0(holder, info);
            }
        }
        boolean bound = false;
        if (this.f3211h.f1078g0.e() && holder.s()) {
            holder.f3024g = position;
        } else if (!holder.s() || holder.z() || holder.t()) {
            bound = F(holder, this.f3211h.f1073e.k(position), position, deadlineNs);
        }
        ViewGroup.LayoutParams lp = holder.f3018a.getLayoutParams();
        if (lp == null) {
            rvLayoutParams = (n1) this.f3211h.generateDefaultLayoutParams();
            holder.f3018a.setLayoutParams(rvLayoutParams);
        } else if (!this.f3211h.checkLayoutParams(lp)) {
            rvLayoutParams = (n1) this.f3211h.generateLayoutParams(lp);
            holder.f3018a.setLayoutParams(rvLayoutParams);
        } else {
            rvLayoutParams = (n1) lp;
        }
        rvLayoutParams.f3142a = holder;
        if (!fromScrapOrHiddenOrCache || !bound) {
            z2 = false;
        }
        rvLayoutParams.f3145d = z2;
        return holder;
    }

    public final void b(e2 holder) {
        if (this.f3211h.s0()) {
            View itemView = holder.f3018a;
            if (c1.y(itemView) == 0) {
                c1.s0(itemView, 1);
            }
            g2 g2Var = this.f3211h.f1092n0;
            if (g2Var != null) {
                b itemDelegate = g2Var.n();
                if (itemDelegate instanceof f2) {
                    ((f2) itemDelegate).o(itemView);
                }
                c1.l0(itemView, itemDelegate);
            }
        }
    }

    public void z(View view) {
        e2 holder = RecyclerView.f0(view);
        if (holder.x()) {
            this.f3211h.removeDetachedView(view, false);
        }
        if (holder.w()) {
            holder.K();
        } else if (holder.L()) {
            holder.e();
        }
        A(holder);
        if (this.f3211h.L != null && !holder.u()) {
            this.f3211h.L.j(holder);
        }
    }

    public void x() {
        int count = this.f3206c.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            y(i2);
        }
        this.f3206c.clear();
        int[] iArr = RecyclerView.f1063x0;
        this.f3211h.f1076f0.b();
    }

    public void y(int cachedViewIndex) {
        e2 viewHolder = (e2) this.f3206c.get(cachedViewIndex);
        a(viewHolder, true);
        this.f3206c.remove(cachedViewIndex);
    }

    public void A(e2 holder) {
        boolean z2 = false;
        if (holder.w() || holder.f3018a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(holder.w());
            sb.append(" isAttached:");
            if (holder.f3018a.getParent() != null) {
                z2 = true;
            }
            sb.append(z2);
            sb.append(this.f3211h.P());
            throw new IllegalArgumentException(sb.toString());
        } else if (holder.x()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + holder + this.f3211h.P());
        } else if (!holder.J()) {
            boolean transientStatePreventsRecycling = holder.h();
            x0 x0Var = this.f3211h.f1087l;
            if (x0Var != null && transientStatePreventsRecycling) {
                x0Var.n();
            }
            boolean cached = false;
            boolean recycled = false;
            if (0 != 0 || holder.u()) {
                if (this.f3209f > 0 && !holder.p(526)) {
                    int cachedViewSize = this.f3206c.size();
                    if (cachedViewSize >= this.f3209f && cachedViewSize > 0) {
                        y(0);
                        cachedViewSize--;
                    }
                    int targetCacheIndex = cachedViewSize;
                    int[] iArr = RecyclerView.f1063x0;
                    if (cachedViewSize > 0 && !this.f3211h.f1076f0.d(holder.f3020c)) {
                        int cacheIndex = cachedViewSize - 1;
                        while (cacheIndex >= 0) {
                            int cachedPos = ((e2) this.f3206c.get(cacheIndex)).f3020c;
                            if (!this.f3211h.f1076f0.d(cachedPos)) {
                                break;
                            }
                            cacheIndex--;
                        }
                        targetCacheIndex = cacheIndex + 1;
                    }
                    this.f3206c.add(targetCacheIndex, holder);
                    cached = true;
                }
                if (!cached) {
                    a(holder, true);
                    recycled = true;
                }
            }
            this.f3211h.f1077g.q(holder);
            if (!cached && !recycled && transientStatePreventsRecycling) {
                holder.f3035r = null;
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.f3211h.P());
        }
    }

    public void a(e2 holder, boolean dispatchRecycled) {
        RecyclerView.r(holder);
        View itemView = holder.f3018a;
        g2 g2Var = this.f3211h.f1092n0;
        if (g2Var != null) {
            b itemDelegate = g2Var.n();
            b originalDelegate = null;
            if (itemDelegate instanceof f2) {
                originalDelegate = ((f2) itemDelegate).n(itemView);
            }
            c1.l0(itemView, originalDelegate);
        }
        if (dispatchRecycled) {
            g(holder);
        }
        holder.f3035r = null;
        i().i(holder);
    }

    public void w(View view) {
        e2 holder = RecyclerView.f0(view);
        holder.f3031n = null;
        holder.f3032o = false;
        holder.e();
        A(holder);
    }

    public void B(View view) {
        e2 holder = RecyclerView.f0(view);
        if (!holder.p(12) && holder.y() && !this.f3211h.p(holder)) {
            if (this.f3205b == null) {
                this.f3205b = new ArrayList();
            }
            holder.H(this, true);
            this.f3205b.add(holder);
        } else if (!holder.t() || holder.v() || this.f3211h.f1087l.g()) {
            holder.H(this, false);
            this.f3204a.add(holder);
        } else {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f3211h.P());
        }
    }

    public void H(e2 holder) {
        if (holder.f3032o) {
            this.f3205b.remove(holder);
        } else {
            this.f3204a.remove(holder);
        }
        holder.f3031n = null;
        holder.f3032o = false;
        holder.e();
    }

    public int j() {
        return this.f3204a.size();
    }

    public View n(int index) {
        return ((e2) this.f3204a.get(index)).f3018a;
    }

    public void e() {
        this.f3204a.clear();
        ArrayList arrayList = this.f3205b;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public e2 h(int position) {
        int changedScrapSize;
        int offsetPosition;
        ArrayList arrayList = this.f3205b;
        if (arrayList == null || (changedScrapSize = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < changedScrapSize; i2++) {
            e2 holder = (e2) this.f3205b.get(i2);
            if (!holder.L() && holder.m() == position) {
                holder.b(32);
                return holder;
            }
        }
        if (this.f3211h.f1087l.g() && (offsetPosition = this.f3211h.f1073e.k(position)) > 0 && offsetPosition < this.f3211h.f1087l.c()) {
            long id = this.f3211h.f1087l.d(offsetPosition);
            for (int i3 = 0; i3 < changedScrapSize; i3++) {
                e2 holder2 = (e2) this.f3205b.get(i3);
                if (!holder2.L() && holder2.k() == id) {
                    holder2.b(32);
                    return holder2;
                }
            }
        }
        return null;
    }

    public e2 m(int position, boolean dryRun) {
        View view;
        int scrapCount = this.f3204a.size();
        for (int i2 = 0; i2 < scrapCount; i2++) {
            e2 holder = (e2) this.f3204a.get(i2);
            if (!holder.L() && holder.m() == position && !holder.t() && (this.f3211h.f1078g0.f2973g || !holder.v())) {
                holder.b(32);
                return holder;
            }
        }
        if (dryRun || (view = this.f3211h.f1075f.e(position)) == null) {
            int cacheSize = this.f3206c.size();
            for (int i3 = 0; i3 < cacheSize; i3++) {
                e2 holder2 = (e2) this.f3206c.get(i3);
                if (!holder2.t() && holder2.m() == position && !holder2.r()) {
                    if (!dryRun) {
                        this.f3206c.remove(i3);
                    }
                    return holder2;
                }
            }
            return null;
        }
        e2 vh = RecyclerView.f0(view);
        this.f3211h.f1075f.s(view);
        int layoutIndex = this.f3211h.f1075f.m(view);
        if (layoutIndex != -1) {
            this.f3211h.f1075f.d(layoutIndex);
            B(view);
            vh.b(8224);
            return vh;
        }
        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + vh + this.f3211h.P());
    }

    public e2 l(long id, int type, boolean dryRun) {
        int count = this.f3204a.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            e2 holder = (e2) this.f3204a.get(i2);
            if (holder.k() == id && !holder.L()) {
                if (type == holder.l()) {
                    holder.b(32);
                    if (holder.v() && !this.f3211h.f1078g0.e()) {
                        holder.F(2, 14);
                    }
                    return holder;
                } else if (!dryRun) {
                    this.f3204a.remove(i2);
                    this.f3211h.removeDetachedView(holder.f3018a, false);
                    w(holder.f3018a);
                }
            }
        }
        int cacheSize = this.f3206c.size();
        for (int i3 = cacheSize - 1; i3 >= 0; i3--) {
            e2 holder2 = (e2) this.f3206c.get(i3);
            if (holder2.k() == id && !holder2.r()) {
                if (type == holder2.l()) {
                    if (!dryRun) {
                        this.f3206c.remove(i3);
                    }
                    return holder2;
                } else if (!dryRun) {
                    y(i3);
                    return null;
                }
            }
        }
        return null;
    }

    public void g(e2 holder) {
        u1 u1Var = this.f3211h.f1091n;
        if (u1Var != null) {
            u1Var.a(holder);
        }
        x0 x0Var = this.f3211h.f1087l;
        if (x0Var != null) {
            x0Var.q();
        }
        RecyclerView recyclerView = this.f3211h;
        if (recyclerView.f1078g0 != null) {
            recyclerView.f1077g.q(holder);
        }
    }

    public void v(x0 oldAdapter, x0 newAdapter, boolean compatibleWithPrevious) {
        c();
        i().h(oldAdapter, newAdapter, compatibleWithPrevious);
    }

    public void t(int from, int to) {
        int inBetweenOffset;
        int end;
        int start;
        int i2;
        if (from < to) {
            start = from;
            end = to;
            inBetweenOffset = -1;
        } else {
            start = to;
            end = from;
            inBetweenOffset = 1;
        }
        int cachedCount = this.f3206c.size();
        for (int i3 = 0; i3 < cachedCount; i3++) {
            e2 holder = (e2) this.f3206c.get(i3);
            if (holder != null && (i2 = holder.f3020c) >= start && i2 <= end) {
                if (i2 == from) {
                    holder.A(to - from, false);
                } else {
                    holder.A(inBetweenOffset, false);
                }
            }
        }
    }

    public void s(int insertedAt, int count) {
        int cachedCount = this.f3206c.size();
        for (int i2 = 0; i2 < cachedCount; i2++) {
            e2 holder = (e2) this.f3206c.get(i2);
            if (holder != null && holder.f3020c >= insertedAt) {
                holder.A(count, true);
            }
        }
    }

    public void u(int removedFrom, int count, boolean applyToPreLayout) {
        int removedEnd = removedFrom + count;
        int cachedCount = this.f3206c.size();
        for (int i2 = cachedCount - 1; i2 >= 0; i2--) {
            e2 holder = (e2) this.f3206c.get(i2);
            if (holder != null) {
                int i3 = holder.f3020c;
                if (i3 >= removedEnd) {
                    holder.A(-count, applyToPreLayout);
                } else if (i3 >= removedFrom) {
                    holder.b(8);
                    y(i2);
                }
            }
        }
    }

    public void D(c2 extension) {
    }

    public void C(s1 pool) {
        s1 s1Var = this.f3210g;
        if (s1Var != null) {
            s1Var.c();
        }
        this.f3210g = pool;
        if (pool != null && this.f3211h.getAdapter() != null) {
            this.f3210g.a();
        }
    }

    public s1 i() {
        if (this.f3210g == null) {
            this.f3210g = new s1();
        }
        return this.f3210g;
    }

    public void K(int positionStart, int itemCount) {
        int pos;
        int positionEnd = positionStart + itemCount;
        int cachedCount = this.f3206c.size();
        for (int i2 = cachedCount - 1; i2 >= 0; i2--) {
            e2 holder = (e2) this.f3206c.get(i2);
            if (holder != null && (pos = holder.f3020c) >= positionStart && pos < positionEnd) {
                holder.b(2);
                y(i2);
            }
        }
    }

    public void r() {
        int cachedCount = this.f3206c.size();
        for (int i2 = 0; i2 < cachedCount; i2++) {
            e2 holder = (e2) this.f3206c.get(i2);
            if (holder != null) {
                holder.b(6);
                holder.a(null);
            }
        }
        x0 x0Var = this.f3211h.f1087l;
        if (x0Var == null || !x0Var.g()) {
            x();
        }
    }

    public void d() {
        int cachedCount = this.f3206c.size();
        for (int i2 = 0; i2 < cachedCount; i2++) {
            e2 holder = (e2) this.f3206c.get(i2);
            holder.c();
        }
        int scrapCount = this.f3204a.size();
        for (int i3 = 0; i3 < scrapCount; i3++) {
            ((e2) this.f3204a.get(i3)).c();
        }
        ArrayList arrayList = this.f3205b;
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int i4 = 0; i4 < changedScrapCount; i4++) {
                ((e2) this.f3205b.get(i4)).c();
            }
        }
    }

    public void q() {
        int cachedCount = this.f3206c.size();
        for (int i2 = 0; i2 < cachedCount; i2++) {
            e2 holder = (e2) this.f3206c.get(i2);
            n1 layoutParams = (n1) holder.f3018a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f3144c = true;
            }
        }
    }
}
