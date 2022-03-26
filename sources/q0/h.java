package q0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3068b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f3069c;

    public h(q this$0, ArrayList arrayList) {
        this.f3069c = this$0;
        this.f3068b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f3068b.iterator();
        while (it.hasNext()) {
            o change = (o) it.next();
            this.f3069c.R(change);
        }
        this.f3068b.clear();
        this.f3069c.f3173n.remove(this.f3068b);
    }
}
