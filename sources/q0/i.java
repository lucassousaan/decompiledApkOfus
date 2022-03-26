package q0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3070b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f3071c;

    public i(q this$0, ArrayList arrayList) {
        this.f3071c = this$0;
        this.f3070b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f3070b.iterator();
        while (it.hasNext()) {
            e2 holder = (e2) it.next();
            this.f3071c.Q(holder);
        }
        this.f3070b.clear();
        this.f3071c.f3171l.remove(this.f3070b);
    }
}
