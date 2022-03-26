package q0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal f3279f = new ThreadLocal();

    /* renamed from: g  reason: collision with root package name */
    public static Comparator f3280g = new w();

    /* renamed from: c  reason: collision with root package name */
    public long f3282c;

    /* renamed from: d  reason: collision with root package name */
    public long f3283d;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f3281b = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f3284e = new ArrayList();

    public void a(RecyclerView recyclerView) {
        this.f3281b.add(recyclerView);
    }

    public void j(RecyclerView recyclerView) {
        this.f3281b.remove(recyclerView);
    }

    public void f(RecyclerView recyclerView, int prefetchDx, int prefetchDy) {
        if (recyclerView.isAttachedToWindow() && this.f3282c == 0) {
            this.f3282c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f1076f0.e(prefetchDx, prefetchDy);
    }

    public final void b() {
        y task;
        int viewCount = this.f3281b.size();
        int totalTaskCount = 0;
        for (int i2 = 0; i2 < viewCount; i2++) {
            RecyclerView view = (RecyclerView) this.f3281b.get(i2);
            if (view.getWindowVisibility() == 0) {
                view.f1076f0.c(view, false);
                totalTaskCount += view.f1076f0.f3259d;
            }
        }
        this.f3284e.ensureCapacity(totalTaskCount);
        int totalTaskIndex = 0;
        for (int i3 = 0; i3 < viewCount; i3++) {
            RecyclerView view2 = (RecyclerView) this.f3281b.get(i3);
            if (view2.getWindowVisibility() == 0) {
                x prefetchRegistry = view2.f1076f0;
                int viewVelocity = Math.abs(prefetchRegistry.f3256a) + Math.abs(prefetchRegistry.f3257b);
                for (int j2 = 0; j2 < prefetchRegistry.f3259d * 2; j2 += 2) {
                    if (totalTaskIndex >= this.f3284e.size()) {
                        task = new y();
                        this.f3284e.add(task);
                    } else {
                        task = (y) this.f3284e.get(totalTaskIndex);
                    }
                    int[] iArr = prefetchRegistry.f3258c;
                    int distanceToItem = iArr[j2 + 1];
                    task.f3267a = distanceToItem <= viewVelocity;
                    task.f3268b = viewVelocity;
                    task.f3269c = distanceToItem;
                    task.f3270d = view2;
                    task.f3271e = iArr[j2];
                    totalTaskIndex++;
                }
            }
        }
        Collections.sort(this.f3284e, f3280g);
    }

    public static boolean e(RecyclerView view, int position) {
        int childCount = view.f1075f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            View attachedView = view.f1075f.i(i2);
            e2 holder = RecyclerView.f0(attachedView);
            if (holder.f3020c == position && !holder.t()) {
                return true;
            }
        }
        return false;
    }

    public final e2 i(RecyclerView view, int position, long deadlineNs) {
        if (e(view, position)) {
            return null;
        }
        t1 recycler = view.f1069c;
        try {
            view.F0();
            e2 holder = recycler.G(position, false, deadlineNs);
            if (holder != null) {
                if (!holder.s() || holder.t()) {
                    recycler.a(holder, false);
                } else {
                    recycler.z(holder.f3018a);
                }
            }
            return holder;
        } finally {
            view.H0(false);
        }
    }

    public final void h(RecyclerView innerView, long deadlineNs) {
        if (innerView != null) {
            if (innerView.C && innerView.f1075f.j() != 0) {
                innerView.T0();
            }
            x innerPrefetchRegistry = innerView.f1076f0;
            innerPrefetchRegistry.c(innerView, true);
            if (innerPrefetchRegistry.f3259d != 0) {
                try {
                    d.a("RV Nested Prefetch");
                    innerView.f1078g0.f(innerView.f1087l);
                    for (int i2 = 0; i2 < innerPrefetchRegistry.f3259d * 2; i2 += 2) {
                        int innerPosition = innerPrefetchRegistry.f3258c[i2];
                        i(innerView, innerPosition, deadlineNs);
                    }
                } finally {
                    d.b();
                }
            }
        }
    }

    public final void c(y task, long deadlineNs) {
        long taskDeadlineNs = task.f3267a ? Long.MAX_VALUE : deadlineNs;
        e2 holder = i(task.f3270d, task.f3271e, taskDeadlineNs);
        if (holder != null && holder.f3019b != null && holder.s() && !holder.t()) {
            h((RecyclerView) holder.f3019b.get(), deadlineNs);
        }
    }

    public final void d(long deadlineNs) {
        for (int i2 = 0; i2 < this.f3284e.size(); i2++) {
            y task = (y) this.f3284e.get(i2);
            if (task.f3270d != null) {
                c(task, deadlineNs);
                task.a();
            } else {
                return;
            }
        }
    }

    public void g(long deadlineNs) {
        b();
        d(deadlineNs);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            d.a("RV Prefetch");
            if (!this.f3281b.isEmpty()) {
                int size = this.f3281b.size();
                long latestFrameVsyncMs = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView view = (RecyclerView) this.f3281b.get(i2);
                    if (view.getWindowVisibility() == 0) {
                        latestFrameVsyncMs = Math.max(view.getDrawingTime(), latestFrameVsyncMs);
                    }
                }
                int i3 = (latestFrameVsyncMs > 0L ? 1 : (latestFrameVsyncMs == 0L ? 0 : -1));
                if (i3 != 0) {
                    long nextFrameNs = TimeUnit.MILLISECONDS.toNanos(latestFrameVsyncMs) + this.f3283d;
                    g(nextFrameNs);
                }
            }
        } finally {
            this.f3282c = 0L;
            d.b();
        }
    }
}
