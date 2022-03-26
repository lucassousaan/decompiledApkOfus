package androidx.fragment.app;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s2 f740c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f741d;

    public d(q this$0, List list, s2 s2Var) {
        this.f741d = this$0;
        this.f739b = list;
        this.f740c = s2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f739b.contains(this.f740c)) {
            this.f739b.remove(this.f740c);
            this.f741d.s(this.f740c);
        }
    }
}
