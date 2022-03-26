package q0;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f3190a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public int f3191b = 0;

    public void b() {
        for (int i2 = 0; i2 < this.f3190a.size(); i2++) {
            r1 data = (r1) this.f3190a.valueAt(i2);
            data.f3184a.clear();
        }
    }

    public e2 f(int viewType) {
        r1 scrapData = (r1) this.f3190a.get(viewType);
        if (scrapData == null || scrapData.f3184a.isEmpty()) {
            return null;
        }
        ArrayList<RecyclerView.ViewHolder> scrapHeap = scrapData.f3184a;
        for (int i2 = scrapHeap.size() - 1; i2 >= 0; i2--) {
            if (!((e2) scrapHeap.get(i2)).r()) {
                return (e2) scrapHeap.remove(i2);
            }
        }
        return null;
    }

    public void i(e2 scrap) {
        int viewType = scrap.l();
        ArrayList<RecyclerView.ViewHolder> scrapHeap = g(viewType).f3184a;
        if (((r1) this.f3190a.get(viewType)).f3185b > scrapHeap.size()) {
            scrap.D();
            scrapHeap.add(scrap);
        }
    }

    public long j(long oldAverage, long newValue) {
        if (oldAverage == 0) {
            return newValue;
        }
        return ((oldAverage / 4) * 3) + (newValue / 4);
    }

    public void e(int viewType, long createTimeNs) {
        r1 scrapData = g(viewType);
        scrapData.f3186c = j(scrapData.f3186c, createTimeNs);
    }

    public void d(int viewType, long bindTimeNs) {
        r1 scrapData = g(viewType);
        scrapData.f3187d = j(scrapData.f3187d, bindTimeNs);
    }

    public boolean l(int viewType, long approxCurrentNs, long deadlineNs) {
        long expectedDurationNs = g(viewType).f3186c;
        return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
    }

    public boolean k(int viewType, long approxCurrentNs, long deadlineNs) {
        long expectedDurationNs = g(viewType).f3187d;
        return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
    }

    public void a() {
        this.f3191b++;
    }

    public void c() {
        this.f3191b--;
    }

    public void h(x0 oldAdapter, x0 newAdapter, boolean compatibleWithPrevious) {
        if (oldAdapter != null) {
            c();
        }
        if (!compatibleWithPrevious && this.f3191b == 0) {
            b();
        }
        if (newAdapter != null) {
            a();
        }
    }

    public final r1 g(int viewType) {
        r1 scrapData = (r1) this.f3190a.get(viewType);
        if (scrapData != null) {
            return scrapData;
        }
        r1 scrapData2 = new r1();
        this.f3190a.put(viewType, scrapData2);
        return scrapData2;
    }
}
