package h;

import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.widget.k2;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2082b;

    public i(k this$0) {
        this.f2082b = this$0;
    }

    @Override // androidx.appcompat.widget.k2
    public void g(q menu, MenuItem item) {
        this.f2082b.f2092h.removeCallbacksAndMessages(menu);
    }

    @Override // androidx.appcompat.widget.k2
    public void k(q menu, MenuItem item) {
        j nextInfo;
        this.f2082b.f2092h.removeCallbacksAndMessages(null);
        int menuIndex = -1;
        int i2 = 0;
        int count = this.f2082b.f2094j.size();
        while (true) {
            if (i2 >= count) {
                break;
            } else if (menu == ((j) this.f2082b.f2094j.get(i2)).f2084b) {
                menuIndex = i2;
                break;
            } else {
                i2++;
            }
        }
        if (menuIndex != -1) {
            int nextIndex = menuIndex + 1;
            if (nextIndex < this.f2082b.f2094j.size()) {
                nextInfo = (j) this.f2082b.f2094j.get(nextIndex);
            } else {
                nextInfo = null;
            }
            Runnable runnable = new h(this, nextInfo, item, menu);
            long uptimeMillis = SystemClock.uptimeMillis() + 200;
            this.f2082b.f2092h.postAtTime(runnable, menu, uptimeMillis);
        }
    }
}
