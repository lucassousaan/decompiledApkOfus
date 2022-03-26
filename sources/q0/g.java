package q0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3051b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f3052c;

    public g(q this$0, ArrayList arrayList) {
        this.f3052c = this$0;
        this.f3051b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f3051b.iterator();
        while (it.hasNext()) {
            p moveInfo = (p) it.next();
            this.f3052c.S(moveInfo.f3156a, moveInfo.f3157b, moveInfo.f3158c, moveInfo.f3159d, moveInfo.f3160e);
        }
        this.f3051b.clear();
        this.f3052c.f3172m.remove(this.f3051b);
    }
}
